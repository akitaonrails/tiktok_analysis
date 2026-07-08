package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestRevenueLimit;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.RechargeCustomError;

/* JADX INFO: renamed from: X.0aRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935010aRH {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        C935030aRJ c935030aRJ;
        if (dataChannel != null && (c935030aRJ = (C935030aRJ) dataChannel.gg0(MultiGuestRevenueLimit.class)) != null && c935030aRJ.LIZ != null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(DataChannel dataChannel, RechargeCustomError rechargeCustomError) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onRevenueLimitUpdate] ");
        sbLIZ.append(rechargeCustomError);
        C20441214yg.LIZIZ("RevenueLimitExt", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestRevenueLimit.class, new C935030aRJ(rechargeCustomError));
        }
    }
}
