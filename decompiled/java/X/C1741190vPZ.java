package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1741190vPZ {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1741180vPY.values().length];
        try {
            iArr[EnumC1741180vPY.IN_MALL_HOMEPAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1741180vPY.OUT_OF_MALL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1741180vPY.IN_MALL_APP_NOT_ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1741180vPY.IN_MALL_COVERED_BY_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1741180vPY.IN_MALL_NOT_LOGIN.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1741180vPY.IN_MALL_NOT_LOGIN_APP_NOT_ACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC1741180vPY.IN_MALL_NOT_LOGIN_COVERED_BY_PAGE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1741200vPa.values().length];
        try {
            iArr2[EnumC1741200vPa.ENTER_MALL.ordinal()] = 1;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[EnumC1741200vPa.IN_MALL_HOMEPAGE_SPIN.ordinal()] = 2;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[EnumC1741200vPa.TO_ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr2[EnumC1741200vPa.LOGIN.ordinal()] = 4;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr2[EnumC1741200vPa.CLOSE_SUB_PAGE_FULL_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[EnumC1741200vPa.CLOSE_SUB_PAGE_HALF_SCREEN.ordinal()] = 6;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[EnumC1741200vPa.CLOSE_LANDING_PAGE_FULL_SCREEN.ordinal()] = 7;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC1741200vPa.CLOSE_LANDING_PAGE_HALF_SCREEN.ordinal()] = 8;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC1741200vPa.OPEN_SUB_PAGE_FULL_SCREEN.ordinal()] = 9;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[EnumC1741200vPa.OPEN_SUB_PAGE_HALF_SCREEN.ordinal()] = 10;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[EnumC1741200vPa.OPEN_LANDING_PAGE_HALF_SCREEN.ordinal()] = 11;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[EnumC1741200vPa.OPEN_LANDING_PAGE_FULL_SCREEN.ordinal()] = 12;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        LIZIZ = iArr2;
    }
}
