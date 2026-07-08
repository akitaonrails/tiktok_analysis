package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805670x5Z {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(IapListResult.ActivityInfo activityInfo) {
        List<IapListResult.ActivityDetail> list;
        Boolean boolValueOf = null;
        if (activityInfo != null) {
            boolValueOf = Boolean.valueOf(activityInfo.isShowBanner);
        }
        if (C500260Jjc.LJJJI(boolValueOf) && activityInfo != null && (list = activityInfo.activityList) != null) {
            for (IapListResult.ActivityDetail activityDetail : list) {
                if (Intrinsics.LJFF(activityDetail.activityId, "kyc_incentive_001")) {
                    if (activityDetail != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
