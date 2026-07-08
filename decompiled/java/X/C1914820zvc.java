package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0zvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914820zvc {
    public static final String[] LIZ = {"enableFilterKeywordsEntrance", "enableRestrictedModeEntrance", "enablePersonalizedFeedsEntrance", "enablePersonalizedSearchEntrance", "enableManageTopicsEntrance", "enableAlgoRefreshEntrance", "enableHideAccountEntrance", "enableEngagementCountEntrance", "enableSTEMFeedEntrance"};
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2588));

    public static boolean LIZ(EnumC1914810zvb enumC1914810zvb) {
        Object[] objArr = (Object[]) LIZIZ.getValue();
        if (objArr == null || C13LQ.LJJIJIIJI(enumC1914810zvb.getValue(), objArr) < 0) {
            return false;
        }
        return true;
    }
}
