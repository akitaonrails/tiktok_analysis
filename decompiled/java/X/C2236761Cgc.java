package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Cgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C2236761Cgc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2236751Cgb.values().length];
        try {
            iArr[EnumC2236751Cgb.LinkmicUserSettingMultiGuestShareRevenueRatioNotSet.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2236751Cgb.LinkmicUserSettingMultiGuestShareRevenueRatioZero.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2236751Cgb.LinkmicUserSettingMultiGuestShareRevenueRatio30.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC2236751Cgb.LinkmicUserSettingMultiGuestShareRevenueRatio70.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
