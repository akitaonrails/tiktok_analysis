package X;

import com.bytedance.android.livesdk.livesetting.message.LiveSignalingFixGetTimeSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveSignalingSystemSetting;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.ExtraT;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0J67, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J67 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(boolean z, UplinkModel uplinkModel) {
        Boolean boolValueOf;
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingMonitor.reportSignalingMessageSend: isByWs=");
        sbLIZ.append(z);
        sbLIZ.append(" bizType=");
        sbLIZ.append(uplinkModel.bizType);
        sbLIZ.append(" subType=");
        sbLIZ.append(uplinkModel.subType);
        sbLIZ.append(" needReport=");
        ExtraT extraT = uplinkModel.extra;
        Boolean boolValueOf2 = null;
        if (extraT != null) {
            boolValueOf = Boolean.valueOf(extraT.needReport);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" uplinkModel.list = ");
        sbLIZ.append(uplinkModel.data);
        C20441214yg.LJIIIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        ExtraT extraT2 = uplinkModel.extra;
        if (extraT2 != null) {
            boolValueOf2 = Boolean.valueOf(extraT2.needReport);
        }
        if (Intrinsics.LJFF(boolValueOf2, Boolean.FALSE)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_signaling_send");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_long");
        ExtraT extraT3 = uplinkModel.extra;
        if (extraT3 == null || (str2 = extraT3.uniqId) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "uniq_id");
        c474500IjALIZ.LJJII(uplinkModel.bizType, "biz_type");
        c474500IjALIZ.LJJII(uplinkModel.subType, "sub_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(boolean z, UplinkMessageResponse uplinkMessageResponse, Integer num) {
        Boolean boolValueOf;
        String str;
        String str2;
        long jLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingMonitor.reportSignalingMessageBiz: needReport=");
        ExtraT extraT = uplinkMessageResponse.extra;
        Boolean boolValueOf2 = null;
        if (extraT != null) {
            boolValueOf = Boolean.valueOf(extraT.needReport);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LJIIIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        LiveSignalingSystemSetting liveSignalingSystemSetting = LiveSignalingSystemSetting.INSTANCE;
        if (liveSignalingSystemSetting.overrideBizSampling() == -1) {
            ExtraT extraT2 = uplinkMessageResponse.extra;
            if (extraT2 != null) {
                boolValueOf2 = Boolean.valueOf(extraT2.needReport);
            }
            if (Intrinsics.LJFF(boolValueOf2, Boolean.FALSE)) {
                return;
            }
        } else if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, liveSignalingSystemSetting.overrideBizSampling())) != 1) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_signaling_biz");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_long");
        c474500IjALIZ.LJJII(uplinkMessageResponse.bizType, "biz_type");
        c474500IjALIZ.LJJII(uplinkMessageResponse.subType, "sub_type");
        ExtraT extraT3 = uplinkMessageResponse.extra;
        if (extraT3 == null || (str2 = extraT3.uniqId) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "uniq_id");
        if (LiveSignalingFixGetTimeSetting.INSTANCE.getValue()) {
            jLIZJ = C158B.LIZ();
        } else {
            jLIZJ = C963140bAe.LIZJ();
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLIZJ), "reach_user_time");
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "pos");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(boolean z, UplinkMessageResponse uplinkMessageResponse, BaseDownlinkData baseDownlinkData, boolean z2) {
        Boolean boolValueOf;
        String str;
        long jLIZJ;
        String str2;
        long j;
        String str3;
        ExtraT extraT;
        ExtraT extraT2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingMonitor.reportSignalingMessageRecv: needReport=");
        Boolean boolValueOf2 = null;
        if (uplinkMessageResponse != null && (extraT2 = uplinkMessageResponse.extra) != null) {
            boolValueOf = Boolean.valueOf(extraT2.needReport);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LJIIIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        LiveSignalingSystemSetting liveSignalingSystemSetting = LiveSignalingSystemSetting.INSTANCE;
        if (liveSignalingSystemSetting.overrideRecvSampling() == -1) {
            if (uplinkMessageResponse != null && (extraT = uplinkMessageResponse.extra) != null) {
                boolValueOf2 = Boolean.valueOf(extraT.needReport);
            }
            if (Intrinsics.LJFF(boolValueOf2, Boolean.FALSE)) {
                return;
            }
        } else if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, liveSignalingSystemSetting.overrideRecvSampling())) != 1) {
            return;
        }
        if (uplinkMessageResponse == null) {
            str = "message error";
        } else if (baseDownlinkData == null) {
            str = "message data error";
        } else {
            str = "success";
        }
        if (z2) {
            str = "no listener";
        }
        if (LiveSignalingFixGetTimeSetting.INSTANCE.getValue()) {
            jLIZJ = C158B.LIZ();
        } else {
            jLIZJ = C963140bAe.LIZJ();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_signaling_recv_v2");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_long");
        c474500IjALIZ.LJJII(str, "data_parsing_result");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZJ), "recv_time");
        long jLongValue = 0;
        if (uplinkMessageResponse != null) {
            ExtraT extraT3 = uplinkMessageResponse.extra;
            if (extraT3 != null) {
                j = extraT3.signalingPushTsms;
            } else {
                j = 0;
            }
            c474500IjALIZ.LJJII(uplinkMessageResponse.bizType, "biz_type");
            c474500IjALIZ.LJJII(uplinkMessageResponse.subType, "sub_type");
            ExtraT extraT4 = uplinkMessageResponse.extra;
            if (extraT4 == null || (str3 = extraT4.uniqId) == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "uniq_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "server_timestamp");
            c474500IjALIZ.LJJII(Long.valueOf(jLIZJ - j), "push_to_client_recv_duration");
        }
        if (baseDownlinkData != null) {
            Long bizPushTsms = baseDownlinkData.getBizPushTsms();
            if (bizPushTsms != null) {
                jLongValue = bizPushTsms.longValue();
            }
            c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "biz_push_time_tsms");
            c474500IjALIZ.LJJII(Long.valueOf(jLIZJ - jLongValue), "biz_push_to_server_push_duration");
        }
        c474500IjALIZ.LIZ();
    }
}
