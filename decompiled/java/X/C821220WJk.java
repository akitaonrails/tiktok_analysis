package X;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821220WJk extends AbstractC821230WJl {
    public final Map<String, InterfaceC821250WJn> LIZIZ;

    public C821220WJk(final InterfaceC821190WJh interfaceC821190WJh) {
        super(interfaceC821190WJh);
        HashMap map = new HashMap();
        map.put("com.bytedance.article.wschannel.receive.connection", new AbstractC821230WJl(interfaceC821190WJh) { // from class: X.0WJo
            @Override // X.InterfaceC821250WJn
            public final void LIZ(Intent intent, C821170WJf c821170WJf) {
                intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
                try {
                    this.LIZ.onReceiveConnectEvent(new C821280WJq(LIZIZ(socketState.channelId, socketState.connectionState, socketState.privateProtocolEnabled), C002O.of(socketState.channelType), socketState.channelId, socketState.errorCode), socketState.LJLIIIL());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
        map.put("com.bytedance.article.wschannel.syncconnectstate", new AbstractC821230WJl(interfaceC821190WJh) { // from class: X.0WJp
            @Override // X.InterfaceC821250WJn
            public final void LIZ(Intent intent, C821170WJf c821170WJf) {
                intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
                if (parcelableArrayListExtra != null) {
                    for (SocketState socketState : parcelableArrayListExtra) {
                        if (socketState != null) {
                            LIZIZ(socketState.channelId, socketState.connectionState, socketState.privateProtocolEnabled);
                        }
                    }
                }
            }
        });
        map.put("com.bytedance.article.wschannel.receive.progress", new AbstractC821230WJl(interfaceC821190WJh) { // from class: X.0WJm
            @Override // X.InterfaceC821250WJn
            public final void LIZ(Intent intent, C821170WJf c821170WJf) {
            }
        });
        map.put("com.bytedance.article.wschannel.receive.payload", new AbstractC821230WJl(interfaceC821190WJh) { // from class: X.0WJg
            @Override // X.InterfaceC821250WJn
            public final void LIZ(Intent intent, C821170WJf c821170WJf) {
                intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
                WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra("payload");
                if (!WsConstants.getOptLogic().get().booleanValue()) {
                    Message message = new Message();
                    C786410Ut5.LJJIJL(message.getData(), "payload", wsChannelMsg);
                    message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                    Parcelable parcelable = message.getData().getParcelable("payload");
                    if (parcelable instanceof WsChannelMsg) {
                        wsChannelMsg = (WsChannelMsg) parcelable;
                    } else {
                        return;
                    }
                }
                if (wsChannelMsg != null) {
                    Logger.debug();
                    if (c821170WJf != null) {
                        wsChannelMsg.receiveDataFromIpcTs = c821170WJf.LIZ;
                    }
                    this.LIZ.onReceive(wsChannelMsg);
                }
            }
        });
        map.put("com.bytedance.article.wschannel.send.payload", new AbstractC821230WJl(interfaceC821190WJh) { // from class: X.0WJj
            @Override // X.InterfaceC821250WJn
            public final void LIZ(Intent intent, C821170WJf c821170WJf) {
                String stringExtra;
                intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
                try {
                    stringExtra = intent.getStringExtra("payload_md5");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                boolean booleanExtra = intent.getBooleanExtra("send_result", true);
                Logger.debug();
                this.LIZ.onSendResult(stringExtra, booleanExtra);
            }
        });
        map.put("com.bytedance.article.wschannel.receive.service", new AbstractC821230WJl(interfaceC821190WJh) { // from class: X.0WJi
            @Override // X.InterfaceC821250WJn
            public final void LIZ(Intent intent, C821170WJf c821170WJf) {
                intent.setExtrasClassLoader(ServiceConnectEvent.class.getClassLoader());
                try {
                    this.LIZ.onReceiveServiceEvent((ServiceConnectEvent) intent.getParcelableExtra("service"));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
        this.LIZIZ = Collections.unmodifiableMap(map);
    }

    @Override // X.InterfaceC821250WJn
    public final void LIZ(Intent intent, C821170WJf c821170WJf) {
        try {
            InterfaceC821250WJn interfaceC821250WJn = this.LIZIZ.get(intent.getAction());
            if (interfaceC821250WJn != null) {
                interfaceC821250WJn.LIZ(intent, c821170WJf);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (Logger.debug()) {
            intent.getIntExtra("msg_count", -1);
        }
    }
}
