package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1121160fHW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1120860fH2.values().length];
        try {
            iArr[EnumC1120860fH2.GIFT_TEAM_CHALLENGE_UNLOCK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1120860fH2.GIFT_COMMUNITY_GIFT_UNLOCK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
