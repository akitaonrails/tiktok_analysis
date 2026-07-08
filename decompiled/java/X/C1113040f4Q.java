package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageItemsAlogEnabledSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import qo2.w;

/* JADX INFO: renamed from: X.0f4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113040f4Q extends AbstractC1096380edY implements EventListener {
    public static final boolean LJIIIIZZ = LiveMessageItemsAlogEnabledSetting.getValue();
    public final double LIZIZ;
    public final List<String> LIZJ = new ArrayList();
    public int LIZLLL;
    public int LJ;
    public volatile int LJFF;
    public int LJI;
    public int LJII;

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onConnectingWebSocket(int i) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDeduplicateInterceptorMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onEnqueueMessage(List<IMessage> list, List<IMessage> list2) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onInterceptMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onMessageConsumeException(IMessage iMessage) {
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void onPause() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessages(List<IMessage> list) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onReset() {
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void onResume() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onRoomEntered() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onSwitchToHttp(String str) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketConnected() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketDisconnected() {
    }

    public final void LJJJJJL() {
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (Object obj : (ArrayList) this.LIZJ) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                String str = (String) obj;
                if (i > 0) {
                    sb.append(';');
                }
                sb.append(str);
                i = i2;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_message_item_monitor");
            c474500IjALIZ.LJJII(sb.toString(), "message_items");
            if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(Long.valueOf(w.LJ()), "anchor_id");
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJL();
            } else {
                c474500IjALIZ.LJIJJLI(LJJJJIZL().LJIIIZ);
                c474500IjALIZ.LIZ();
            }
            ((ArrayList) this.LIZJ).clear();
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void onUnload() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = LJJJJIZL().LJIIIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeEventListener(this);
        }
        LJJJJJL();
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_message_consume_monitor", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(this.LJFF), "dispatch_count");
        c474500IjALIZIZ.LJJII(Integer.valueOf(this.LJII), "public_screen_receive_count");
        c474500IjALIZIZ.LJJII(Integer.valueOf(this.LJI), "public_screen_consume_count");
        Room room = LJJJJIZL().LJII;
        if (room != null) {
            c474500IjALIZIZ.LJJII(C0KYR.LIZIZ(room, LJJJJIZL().LJIIIZ), "admin_type");
        }
        if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJJIJL();
        } else {
            c474500IjALIZIZ.LJIJJLI(LJJJJIZL().LJIIIZ);
            c474500IjALIZIZ.LIZ();
        }
        this.LJI = 0;
        this.LJFF = 0;
        this.LJII = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
    }

    public C1113040f4Q(double d) {
        this.LIZIZ = d;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILJJIL(AbstractC1136060ffY abstractC1136060ffY) {
        this.LJII++;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDispatchMessage(IMessage iMessage) {
        this.LJFF++;
    }

    public static String LJJJJJ(AbstractC1136060ffY abstractC1136060ffY, boolean z) {
        long j;
        long j2;
        String str;
        String str2;
        CommonMessageData commonMessageData = abstractC1136060ffY.baseMessage;
        if (commonMessageData != null) {
            j = commonMessageData.createTime;
            j2 = commonMessageData.clientSendTime;
        } else {
            j = 0;
            j2 = 0;
        }
        long jLIZIZ = C963140bAe.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0:");
        sbLIZ.append(abstractC1136060ffY.getMessageId());
        sbLIZ.append(",1:");
        sbLIZ.append(abstractC1136060ffY.getDecodeStartAtMillis());
        sbLIZ.append(",2:");
        sbLIZ.append(abstractC1136060ffY.getDecodeEndAtMillis() - abstractC1136060ffY.getDecodeStartAtMillis());
        sbLIZ.append(",3:");
        sbLIZ.append(abstractC1136060ffY.getDispatchAtMillis() - abstractC1136060ffY.getDecodeStartAtMillis());
        sbLIZ.append(",4:");
        sbLIZ.append(jLIZIZ - abstractC1136060ffY.getDecodeStartAtMillis());
        sbLIZ.append(",5:");
        sbLIZ.append(!z ? 1 : 0);
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        if (j > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(",6:");
            sbLIZ2.append(j - abstractC1136060ffY.getDecodeStartAtMillis());
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (j2 > 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(",7:");
            sbLIZ3.append(j2 - abstractC1136060ffY.getDecodeStartAtMillis());
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (!C001A.CHAT.wsMethod.equals(abstractC1136060ffY.getMethodName())) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(",8:");
            sbLIZ4.append(abstractC1136060ffY.getMethodName());
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(",9:");
        sbLIZ5.append(abstractC1136060ffY.getMessageFrom());
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        if (j2 > 0) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(",10:");
            sbLIZ6.append(jLIZIZ - j2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        }
        CommonMessageData commonMessageData2 = abstractC1136060ffY.baseMessage;
        String strLJJLIIIJ = null;
        if (commonMessageData2 != null && (str = commonMessageData2.fromIdc) != null && str.length() != 0) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(",11:");
            CommonMessageData commonMessageData3 = abstractC1136060ffY.baseMessage;
            if (commonMessageData3 != null) {
                str2 = commonMessageData3.fromIdc;
            } else {
                str2 = null;
            }
            sbLIZ7.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        }
        if (abstractC1136060ffY instanceof ChatMessage) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(",17:");
            List<Integer> list = ((ChatMessage) abstractC1136060ffY).commentTag;
            if (list != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, "|", null, null, 0, null, null, 62);
            }
            sbLIZ8.append(strLJJLIIIJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        }
        return sb.toString();
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIIIZ(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        if (!interfaceC1112060f2q.LJFF() && AbstractC19994813Le.Default.nextDouble() < this.LIZIZ && (interfaceC1112060f2q instanceof AbstractC1110800f0o)) {
            if (LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("discarded_count ");
                int i = this.LJ + 1;
                this.LJ = i;
                sbLIZ.append(i);
                C20441214yg.LJ("message_entry", C2188811AlT.LIZIZ(sbLIZ));
            }
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
            if (abstractC1110800f0o.LJIL.getDecodeStartAtMillis() > 0 && !z) {
                ((ArrayList) this.LIZJ).add(LJJJJJ(abstractC1110800f0o.LJIL, true));
                if (((ArrayList) this.LIZJ).size() >= 100) {
                    LJJJJJL();
                }
            }
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void LJIIJJI(View view, boolean z) {
        IMessageManager iMessageManager;
        DataChannel dataChannel = LJJJJIZL().LJIIIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addEventListener(this);
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (interfaceC1112060f2q.LJFF()) {
            return;
        }
        if (AbstractC19994813Le.Default.nextDouble() < this.LIZIZ && (interfaceC1112060f2q instanceof AbstractC1110800f0o)) {
            if (LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("consumed_count ");
                int i = this.LIZLLL + 1;
                this.LIZLLL = i;
                sbLIZ.append(i);
                C20441214yg.LJ("message_entry", C2188811AlT.LIZIZ(sbLIZ));
            }
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
            if (abstractC1110800f0o.LJIL.getDecodeStartAtMillis() > 0 && !abstractC1110800f0o.LJIILL.LIZ) {
                List<String> list = this.LIZJ;
                StringBuilder sb = new StringBuilder(LJJJJJ(abstractC1110800f0o.LJIL, false));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(",12:");
                sbLIZ2.append(abstractC1110800f0o.LJIJ.LIZ);
                sbLIZ2.append(",13:");
                sbLIZ2.append(abstractC1110800f0o.LJIJ.LIZIZ);
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                C1111910f2b c1111910f2b = abstractC1110800f0o.LJII;
                if (c1111910f2b != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(",18:");
                    sbLIZ3.append(c1111910f2b.LIZJ);
                    sbLIZ3.append(",19:");
                    sbLIZ3.append(c1111910f2b.LIZIZ);
                    sbLIZ3.append(",20:");
                    sbLIZ3.append(c1111910f2b.LIZ);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                }
                ((ArrayList) list).add(sb.toString());
                if (((ArrayList) this.LIZJ).size() >= 100) {
                    LJJJJJL();
                }
            }
        }
        this.LJI++;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILLIIL(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i abstractC1111980f2i, boolean z, User user) {
        if (!abstractC1136060ffY.isHistoryMessage && AbstractC19994813Le.Default.nextDouble() < this.LIZIZ) {
            if (LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("discarded_count ");
                int i = this.LJ + 1;
                this.LJ = i;
                sbLIZ.append(i);
                C20441214yg.LJ("message_entry", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (abstractC1136060ffY.getDecodeStartAtMillis() > 0) {
                ((ArrayList) this.LIZJ).add(LJJJJJ(abstractC1136060ffY, true));
                if (((ArrayList) this.LIZJ).size() >= 100) {
                    LJJJJJL();
                }
            }
        }
    }
}
