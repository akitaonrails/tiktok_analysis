package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageReachSamplingSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;

/* JADX INFO: renamed from: X.0eV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091120eV4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY != null && abstractC1136060ffY.notifyMsgSampleLogState == 1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_msg_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.getMessageId()), "msg_id");
            c474500IjALIZ.LJJII(abstractC1136060ffY.getMessageType().wsMethod, "method");
            c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.baseMessage.roomId), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ()), "show_ms");
            c474500IjALIZ.LIZ();
            abstractC1136060ffY.notifyMsgSampleLogState = 2;
        }
    }

    public static void LIZ(AbstractC1136060ffY abstractC1136060ffY, String str) {
        if (abstractC1136060ffY.notifyMsgSampleLogState == 1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_msg_drop");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.getMessageId()), "msg_id");
            c474500IjALIZ.LJJII(abstractC1136060ffY.getMessageType().wsMethod, "method");
            c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.baseMessage.roomId), "room_id");
            c474500IjALIZ.LJJII(str, "drop_reason");
            c474500IjALIZ.LIZ();
            abstractC1136060ffY.notifyMsgSampleLogState = 3;
        }
    }

    public static void LIZIZ(AbstractC1136060ffY abstractC1136060ffY, boolean z) {
        Object objValueOf = LiveMessageReachSamplingSetting.INSTANCE.getValue().get(abstractC1136060ffY.getMessageType().wsMethod);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(0.0d);
        }
        if (Math.random() < ((Double) objValueOf).doubleValue()) {
            if ((C2221841Bxe.LIZJ(abstractC1136060ffY.getGeneralMessageType()) || z) && abstractC1136060ffY.notifyMsgSampleLogState == 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_msg_received");
                c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.getMessageId()), "msg_id");
                c474500IjALIZ.LJJII(abstractC1136060ffY.getMessageType().wsMethod, "method");
                c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.baseMessage.roomId), "room_id");
                c474500IjALIZ.LJJII(Long.valueOf(abstractC1136060ffY.receiveTime), "receive_ms");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LIZ();
                } else {
                    c474500IjALIZ.LJJIJLIJ();
                    c474500IjALIZ.LJJIJL();
                }
                abstractC1136060ffY.notifyMsgSampleLogState = 1;
            }
        }
    }
}
