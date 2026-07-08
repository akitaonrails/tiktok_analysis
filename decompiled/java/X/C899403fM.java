package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;

/* JADX INFO: renamed from: X.03fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C899403fM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CommuteType.values().length];
        try {
            iArr[CommuteType.APP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[CommuteType.WAP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[CommuteType.SDK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[CommuteType.SECRET_FREE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[CommuteType.APP_PUSH.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[CommuteType.WAP_TO_APP.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[CommuteType.WAP_FILTER_APP.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[CommuteType.SECRET_FREE_APP.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[CommuteType.WAP_BOLETO_PIX.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[CommuteType.BROWSER_TO_APP.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[CommuteType.APP_LINK.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[CommuteType.APP_DISPLAY_TIPS_IF_NOT_INSTALL.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[CommuteType.INTERNAL_NATIVE.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[CommuteType.SDK_WAP.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[CommuteType.APP_NO_FILTER.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr[CommuteType.INAPP_BROWSER.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr[CommuteType.INSTALLATION_CHECK_NO_FILTER.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr[CommuteType.APP_NO_FILTER_V2.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        LIZ = iArr;
    }
}
