package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1387070mCP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1387060mCO.values().length];
        try {
            iArr[EnumC1387060mCO.FRIENDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1387060mCO.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1387060mCO.MESSAGE_ICE_BREAKING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1387060mCO.MESSAGE_NUDGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1387060mCO.MESSAGE_AFTER_NUDGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
