package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.msg.utils.WeakHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1ByA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222161ByA implements InterfaceC2222351ByT {
    public final C2222041Bxy LIZ;
    public EnumC2222191ByD LIZIZ = EnumC2222191ByD.HTTP;
    public final IMessageWsClient LIZJ;
    public final List<Long> LIZLLL;
    public int LJ;
    public volatile long LJFF;
    public volatile long LJI;
    public volatile String LJII;
    public long LJIIIIZZ;
    public volatile Set<Integer> LJIIIZ;
    public volatile long LJIIJ;
    public int LJIIJJI;
    public final AtomicInteger LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;
    public final AtomicInteger LJIILL;
    public Handler LJIILLIIL;
    public C2222511Byj LJIIZILJ;
    public C2222081By2 LJIJ;

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        this.LJIILLIIL = this.LIZ.LIZ.LJFF(new C1D12(this, 7));
        C2222511Byj c2222511Byj = this.LJIIZILJ;
        if (c2222511Byj != null) {
            C2222361ByU.LIZ(c2222511Byj.LIZ, "uplink client start");
            C18JU c18ju = new C18JU(c2222511Byj);
            c18ju.start();
            c2222511Byj.LJFF = c18ju;
        }
    }

    public final void LIZIZ() {
        Handler handler;
        Handler handler2 = this.LJIILLIIL;
        if (handler2 == null || !handler2.hasMessages(113) || (handler = this.LJIILLIIL) == null) {
            return;
        }
        handler.removeMessages(113);
    }

    public final void LIZLLL() {
        Handler handler;
        Handler handler2 = this.LJIILLIIL;
        if (handler2 == null || !handler2.hasMessages(106) || (handler = this.LJIILLIIL) == null) {
            return;
        }
        handler.removeMessages(106);
    }

    public final void LJ() {
        Handler handler;
        Handler handler2 = this.LJIILLIIL;
        if (handler2 == null || !handler2.hasMessages(110) || (handler = this.LJIILLIIL) == null) {
            return;
        }
        handler.removeMessages(110);
    }

    public final void LJIIIIZZ() {
        Message messageObtainMessage;
        Handler handler;
        if (this.LIZJ.isWsConnected()) {
            this.LIZ.LIZ.LIZIZ().log("MessagePortal", "trigger heartbeat timer");
            LJ();
            Handler handler2 = this.LJIILLIIL;
            if (handler2 == null || (messageObtainMessage = handler2.obtainMessage(110)) == null || (handler = this.LJIILLIIL) == null) {
                return;
            }
            C786410Ut5.LJLJLJ(handler, messageObtainMessage, this.LJIIJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    public final void LJIIJ() {
        long j = this.LJFF > 0 ? this.LJFF : 1000L;
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call api after ");
        sbLIZ.append(j);
        messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LJIILLIIL;
        if (handler != null) {
            C786410Ut5.LJLJJI(109, j, handler);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        Handler handler = this.LJIILLIIL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LIZJ.disconnectFromWebSocket("release");
        this.LIZJ.onRelease();
        this.LIZJ.setCallback(null);
        C2222511Byj c2222511Byj = this.LJIIZILJ;
        if (c2222511Byj != null) {
            c2222511Byj.LJFF();
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        Handler handler = this.LJIILLIIL;
        if (handler != null) {
            C786410Ut5.LJLILLLLZI(handler, 101);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        onDestroy();
    }

    public final void LJFF(int i) {
        if (this.LJIIIZ.contains(Integer.valueOf(i))) {
            return;
        }
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE && this.LIZIZ != EnumC2222191ByD.WS_CONNECTING) {
            return;
        }
        this.LJIIIZ.add(Integer.valueOf(i));
        HashMap map = new HashMap();
        map.put("cursor", this.LJII);
        map.put("user_id", String.valueOf(this.LIZJ.getUserId()));
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMessage call api ");
        sbLIZ.append(i);
        messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LIZJ.apiCall(map, i, true);
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onImFetchStarted();
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        InterfaceC2222621Byu interfaceC2222621Byu;
        this.LJIJ = c2222081By2;
        C2221921Bxm c2221921Bxm = c2222081By2.LIZJ;
        C2222121By6 c2222121By6 = new C2222121By6(c2221921Bxm.LIZ, c2221921Bxm.LIZIZ);
        c2222121By6.LIZLLL = c2222081By2;
        C2222241ByI c2222241ByI = c2222081By2.LIZIZ.LIZIZ;
        IMessageWsClient iMessageWsClient = null;
        if (c2222241ByI != null && c2222241ByI.LIZ != null && (interfaceC2222621Byu = c2222081By2.LIZ.LJI) != null) {
            if (c2222241ByI != null) {
                iMessageWsClient = c2222241ByI.LIZ;
            }
            if (interfaceC2222621Byu.LIZLLL()) {
                this.LJIIZILJ = new C2222511Byj(c2222121By6, iMessageWsClient, iMessageWsClient, c2222081By2.LIZ.LJI);
            }
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        int i;
        Handler handler = this.LJIILLIIL;
        if (handler != null) {
            if (c2222371ByV.LIZ) {
                i = 104;
            } else {
                i = 102;
            }
            C786410Ut5.LJLILLLLZI(handler, i);
        }
    }

    public final void LJIILIIL(EnumC2222191ByD enumC2222191ByD) {
        int i = C2222211ByF.LIZ[enumC2222191ByD.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.LIZ.LIZ.context().LIZIZ = 1;
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LIZ.LIZ.context().LIZIZ = 0;
        }
        this.LIZIZ = enumC2222191ByD;
    }

    public final void LJIIZILJ(String str) {
        this.LIZ.LIZ.LIZIZ().log("MessagePortal", "switchToHttp");
        LJIILIIL(EnumC2222191ByD.HTTP);
        LIZLLL();
        LIZIZ();
        this.LIZJ.disconnectFromWebSocket(str);
        Handler handler = this.LJIILLIIL;
        if (handler != null) {
            C786410Ut5.LJLILLLLZI(handler, 109);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onSwitchToHttp(str);
        }
    }

    public C2222161ByA(C2222041Bxy c2222041Bxy, C2222241ByI c2222241ByI) {
        this.LIZ = c2222041Bxy;
        IMessageWsClient iMessageWsClient = c2222241ByI.LIZ;
        this.LIZJ = iMessageWsClient;
        this.LIZLLL = C1697810uHb.LJIILJJIL(5L);
        this.LJII = CardStruct.IStatusCode.DEFAULT;
        this.LJIIIZ = new LinkedHashSet();
        this.LJIIJ = 10L;
        this.LJIIL = new AtomicInteger(0);
        this.LJIILL = new AtomicInteger();
        iMessageWsClient.setCallback(new IMessageWsClient.Callback() { // from class: X.1By9
            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onWebSocketConnected() {
                Message messageObtainMessage;
                Handler handler;
                C2222241ByI c2222241ByI2;
                this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortal", "onWebSocketConnected");
                this.LIZ.LJIILIIL(EnumC2222191ByD.WS_CONNECTED);
                this.LIZ.LIZIZ();
                this.LIZ.LIZLLL();
                C2222161ByA c2222161ByA = this.LIZ;
                C2222081By2 c2222081By2 = c2222161ByA.LJIJ;
                if (c2222081By2 == null) {
                    c2222081By2 = null;
                }
                if (c2222081By2.LIZLLL == null && ((c2222241ByI2 = c2222081By2.LIZIZ.LIZIZ) == null || !c2222241ByI2.LJFF)) {
                    c2222161ByA.LJIIIIZZ();
                } else if (c2222161ByA.LIZJ.isWsConnected()) {
                    c2222161ByA.LIZ.LIZ.LIZIZ().log("MessagePortal", "trigger heartbeat timer");
                    c2222161ByA.LJ();
                    Handler handler2 = c2222161ByA.LJIILLIIL;
                    if (handler2 != null && (messageObtainMessage = handler2.obtainMessage(110)) != null && (handler = c2222161ByA.LJIILLIIL) != null) {
                        C786410Ut5.LJLJJL(handler, messageObtainMessage);
                    }
                }
                Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onWebSocketConnected();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onWebSocketDisconnected() {
                this.LIZ.LJIILIIL(EnumC2222191ByD.HTTP);
                C2222161ByA c2222161ByA = this.LIZ;
                c2222161ByA.LJIIJJI++;
                MessageMonitor messageMonitorLIZIZ = c2222161ByA.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onWebSocketDisconnected, ws connect failed count is ");
                sbLIZ.append(this.LIZ.LJIIJJI);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LJ();
                this.LIZ.LIZLLL();
                this.LIZ.LIZIZ();
                Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onWebSocketDisconnected();
                }
                this.LIZ.LIZJ.disconnectFromWebSocket("ws_disconnect_re_determine");
                Handler handler = this.LIZ.LJIILLIIL;
                if (handler == null || !handler.hasMessages(109)) {
                    C2222161ByA c2222161ByA2 = this.LIZ;
                    long j = c2222161ByA2.LJFF > 0 ? c2222161ByA2.LJFF : 1000L;
                    MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("re determine message strategy ");
                    sbLIZ2.append(j);
                    messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                    Handler handler2 = this.LIZ.LJIILLIIL;
                    if (handler2 != null) {
                        C786410Ut5.LJLJJI(109, j, handler2);
                    }
                    C2222511Byj c2222511Byj = this.LIZ.LJIIZILJ;
                    if (c2222511Byj != null) {
                        c2222511Byj.LIZLLL();
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onHostWebSocketMessage(PayloadItem payloadItem) {
                Message messageObtainMessage;
                this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortal", "onHostWebSocketMessage");
                Handler handler = this.LIZ.LJIILLIIL;
                if (handler != null && (messageObtainMessage = handler.obtainMessage(111, payloadItem)) != null) {
                    messageObtainMessage.sendToTarget();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onWebSocketMessage(PayloadItem payloadItem) {
                C2222511Byj c2222511Byj;
                WeakHandler weakHandler;
                Message messageObtainMessage;
                C2222081By2 c2222081By2;
                boolean z;
                C2222241ByI c2222241ByI2;
                Message messageObtainMessage2;
                MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onWebSocketMessage: payload type is ");
                sbLIZ.append(payloadItem.getPayloadType());
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                if (TextUtils.equals(payloadItem.getPayloadType(), "msg")) {
                    this.LIZ.LJIIIIZZ = System.currentTimeMillis();
                    Handler handler = this.LIZ.LJIILLIIL;
                    if (handler != null && (messageObtainMessage2 = handler.obtainMessage(107, payloadItem)) != null) {
                        messageObtainMessage2.sendToTarget();
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(payloadItem.getPayloadType(), "close")) {
                    this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortal", "onWebSocketMessage: payload type is close, fallback to http");
                    this.LIZ.LJIIZILJ("service_close_cmd");
                    return;
                }
                if (TextUtils.equals(payloadItem.getPayloadType(), "hb")) {
                    C2222161ByA c2222161ByA = this.LIZ;
                    c2222161ByA.getClass();
                    try {
                        String strValueOf = String.valueOf(payloadItem.getSeqId());
                        long j = c2222161ByA.LJIILIIL;
                        long serverTime = payloadItem.getServerTime();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j2 = jCurrentTimeMillis - j;
                        MessageMonitor messageMonitorLIZIZ2 = c2222161ByA.LIZ.LIZ.LIZIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sendPacketTime = ");
                        sbLIZ2.append(j);
                        sbLIZ2.append(", serverTime = ");
                        sbLIZ2.append(serverTime);
                        sbLIZ2.append(", receivePacketTime = ");
                        sbLIZ2.append(jCurrentTimeMillis);
                        sbLIZ2.append(", serverTimeGap = ");
                        long j3 = 2;
                        sbLIZ2.append(((j2 / j3) + serverTime) - jCurrentTimeMillis);
                        messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                        if (!TextUtils.equals(strValueOf, c2222161ByA.LJIILJJIL)) {
                            return;
                        }
                        C2222081By2 c2222081By22 = c2222161ByA.LJIJ;
                        if (c2222081By22 == null) {
                            c2222081By2 = null;
                        } else {
                            c2222081By2 = c2222081By22;
                        }
                        if (c2222081By2.LIZLLL == null) {
                            C2222241ByI c2222241ByI3 = c2222081By2.LIZIZ.LIZIZ;
                            if (c2222241ByI3 == null) {
                                z = false;
                            } else {
                                z = c2222241ByI3.LJ;
                            }
                        } else {
                            z = true;
                        }
                        long j4 = 1000;
                        if (z) {
                            if (jCurrentTimeMillis <= j || j <= 0 || serverTime <= 0) {
                                return;
                            }
                            if (c2222081By22 == null) {
                                c2222081By22 = null;
                            }
                            if (c2222081By22.LIZLLL == null && (c2222241ByI2 = c2222081By22.LIZIZ.LIZIZ) != null) {
                                j4 = c2222241ByI2.LIZLLL;
                            }
                            if (j2 > j4) {
                                return;
                            }
                        } else if (jCurrentTimeMillis <= j || j <= 0 || serverTime <= 0 || serverTime < jCurrentTimeMillis || j2 > 1000) {
                            return;
                        }
                        c2222161ByA.LIZJ.setWebSocketServerTimeGap((serverTime + (j2 / j3)) - jCurrentTimeMillis);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                if (!TextUtils.equals(payloadItem.getPayloadType(), "uplink_im_gateway") || (c2222511Byj = this.LIZ.LJIIZILJ) == null || (weakHandler = c2222511Byj.LJII) == null || (messageObtainMessage = weakHandler.obtainMessage(12346, payloadItem)) == null) {
                    return;
                }
                messageObtainMessage.sendToTarget();
            }

            public final void LIZ(long j, List list) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2222161ByA c2222161ByA = this.LIZ;
                long j2 = jCurrentTimeMillis - c2222161ByA.LJIIIIZZ;
                if (j2 > 0) {
                    c2222161ByA.LIZLLL.add(Long.valueOf(j2));
                    if (this.LIZ.LIZLLL.size() > 5) {
                        C19719612Di.LJJIIZI(this.LIZ.LIZLLL);
                    }
                }
                C2222341ByS c2222341BySContext = this.LIZ.LIZ.LIZ.context();
                Long l = (Long) C13LP.LJJLIIIJLJLI(this.LIZ.LIZLLL);
                if (l != null) {
                    l.longValue();
                }
                c2222341BySContext.getClass();
                this.LIZ.LIZ.LIZ.LJIIIIZZ().LJII(j, list);
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onApiError(Exception exc, int i) {
                long j;
                this.LIZ.LJIIIZ.remove(Integer.valueOf(i));
                C2222161ByA c2222161ByA = this.LIZ;
                int i2 = c2222161ByA.LJ + 1;
                c2222161ByA.LJ = i2;
                if (i2 > 3) {
                    j = Mp4ScreenVideoLoadTimeout.CONTROL;
                } else {
                    j = ((long) i2) * 1000;
                }
                MessageMonitor messageMonitorLIZIZ = c2222161ByA.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onApiError: ");
                sbLIZ.append(exc);
                sbLIZ.append(". failed count: ");
                sbLIZ.append(this.LIZ.LJ);
                sbLIZ.append(", retry after ");
                sbLIZ.append(j);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
                    Handler handler = this.LIZ.LJIILLIIL;
                    if (handler != null) {
                        C786410Ut5.LJLJJI(113, j, handler);
                    }
                } else {
                    this.LIZ.LJIIJ();
                }
                Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onImFetchFailed(exc);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z) {
                Integer numValueOf;
                C2222161ByA c2222161ByA = this.LIZ;
                long j = protoApiResult.dimension;
                MessageMonitor messageMonitorLIZIZ = c2222161ByA.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkDimensionValid, result dimension: ");
                sbLIZ.append(j);
                sbLIZ.append(", portal dimension: ");
                sbLIZ.append(c2222161ByA.LIZ.LIZ.context().LIZJ);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                if (j != 0 && c2222161ByA.LIZ.LIZ.context().LIZJ != j) {
                    this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortal", "onHostWebSocketPayloadDecoded, but checkDimensionValid false");
                    return;
                }
                MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onHostWebSocketPayloadDecoded, cursor: ");
                sbLIZ2.append(this.LIZ.LJII);
                sbLIZ2.append(", fetch_interval: ");
                sbLIZ2.append(this.LIZ.LJFF);
                sbLIZ2.append(", timestamp: ");
                sbLIZ2.append(this.LIZ.LJI);
                sbLIZ2.append(", size: ");
                List<IMessage> list = protoApiResult.messages;
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                sbLIZ2.append(", heartbeat duration is ");
                sbLIZ2.append(this.LIZ.LJIIJ);
                messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                LIZ(protoApiResult.delayTimeBeforeDispatch, protoApiResult.messages);
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z) {
                boolean z2;
                Message messageObtainMessage;
                String str;
                C2222081By2 c2222081By2 = this.LIZ.LJIJ;
                Integer numValueOf = null;
                if (c2222081By2 == null) {
                    c2222081By2 = null;
                }
                if (c2222081By2.LIZLLL == null) {
                    z2 = c2222081By2.LIZ.LJIILJJIL;
                } else {
                    z2 = true;
                }
                if (z2 && ((str = protoApiResult.cursor) == null || str.length() == 0)) {
                    this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortal", "WebSocketChannelStrategy triggered empty im_cursor Optimization, not update");
                } else {
                    String str2 = protoApiResult.cursor;
                    if (str2 != null) {
                        this.LIZ.LJII = str2;
                    }
                }
                C2222161ByA c2222161ByA = this.LIZ;
                long j = protoApiResult.fetchInterval;
                c2222161ByA.LIZ.LIZ.context().getClass();
                c2222161ByA.LJFF = j;
                this.LIZ.LJI = protoApiResult.now;
                this.LIZ.LJIIJ = Math.max(10L, protoApiResult.heartbeatDuration);
                MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onWebSocketPayloadDecoded, cursor: ");
                sbLIZ.append(this.LIZ.LJII);
                sbLIZ.append(", fetch_interval: ");
                sbLIZ.append(this.LIZ.LJFF);
                sbLIZ.append(", timestamp: ");
                sbLIZ.append(this.LIZ.LJI);
                sbLIZ.append(", size: ");
                List<IMessage> list = protoApiResult.messages;
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", heartbeat duration is ");
                sbLIZ.append(this.LIZ.LJIIJ);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                LIZ(protoApiResult.delayTimeBeforeDispatch, protoApiResult.messages);
                if (TextUtils.equals(protoApiResult.payloadType, "msg") && protoApiResult.needAck) {
                    MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onWebSocketPayloadDecoded, need send ack: ");
                    sbLIZ2.append(protoApiResult.getFormatAckInfo());
                    messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                    Handler handler = this.LIZ.LJIILLIIL;
                    if (handler != null && (messageObtainMessage = handler.obtainMessage(108, protoApiResult)) != null) {
                        messageObtainMessage.sendToTarget();
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public final void onApiSuccess(ProtoApiResult protoApiResult, int i, boolean z) {
                long size;
                Message messageObtainMessage;
                Handler handler;
                Message messageObtainMessage2;
                this.LIZ.LJIIIZ.remove(Integer.valueOf(i));
                C2222161ByA c2222161ByA = this.LIZ;
                c2222161ByA.LJ = 0;
                c2222161ByA.LJII = protoApiResult.cursor;
                C2222161ByA c2222161ByA2 = this.LIZ;
                long j = protoApiResult.fetchInterval;
                c2222161ByA2.LIZ.LIZ.context().getClass();
                c2222161ByA2.LJFF = j;
                this.LIZ.LJI = protoApiResult.now;
                List<IMessage> list = protoApiResult.messages;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onApiSuccess, cursor: ");
                sbLIZ.append(this.LIZ.LJII);
                sbLIZ.append(", fetch_interval: ");
                sbLIZ.append(this.LIZ.LJFF);
                sbLIZ.append(", timestamp: ");
                sbLIZ.append(this.LIZ.LJI);
                sbLIZ.append(", size: ");
                sbLIZ.append(size);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                LIZ(protoApiResult.delayTimeBeforeDispatch, protoApiResult.messages);
                long j2 = 1000;
                if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
                    C2222161ByA c2222161ByA3 = this.LIZ;
                    if (c2222161ByA3.LJFF > 0) {
                        j2 = c2222161ByA3.LJFF;
                    }
                    MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("call api after ");
                    sbLIZ2.append(j2);
                    messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                    Handler handler2 = this.LIZ.LJIILLIIL;
                    if (handler2 != null) {
                        C786410Ut5.LJLJJI(113, j2, handler2);
                    }
                } else if (i == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
                    C2222161ByA c2222161ByA4 = this.LIZ;
                    int i2 = protoApiResult.fetchType;
                    String str = protoApiResult.pushServer;
                    Map<String, String> map = protoApiResult.routeParams;
                    c2222161ByA4.getClass();
                    if (MessageApiConstant.FetchType.WEBSOCKET == i2 && !TextUtils.isEmpty(str)) {
                        c2222161ByA4.LJIILIIL(EnumC2222191ByD.WS_CONNECTING);
                        Handler handler3 = c2222161ByA4.LJIILLIIL;
                        if (handler3 != null && (messageObtainMessage2 = handler3.obtainMessage(105, map)) != null) {
                            messageObtainMessage2.sendToTarget();
                        }
                        Handler handler4 = c2222161ByA4.LJIILLIIL;
                        if (handler4 != null && (messageObtainMessage = handler4.obtainMessage(113)) != null && (handler = c2222161ByA4.LJIILLIIL) != null) {
                            C786410Ut5.LJLJLJ(handler, messageObtainMessage, 1000L);
                        }
                    } else {
                        c2222161ByA4.LJIILIIL(EnumC2222191ByD.HTTP);
                        c2222161ByA4.LJIIJ();
                    }
                } else {
                    this.LIZ.LJIIJ();
                }
                Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onImFetchSucceeded();
                }
            }
        });
    }

    @Override // X.InterfaceC2222351ByT
    public final void LJIILLIIL(long j, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1) {
        C2222511Byj c2222511Byj = this.LJIIZILJ;
        if (c2222511Byj != null) {
            c2222511Byj.LJI(j, c1500700p9g, interfaceC19666511x1, null);
        }
    }
}
