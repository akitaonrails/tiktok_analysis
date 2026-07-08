package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C645600PTy {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC645610PTz.values().length];
        try {
            iArr[EnumC645610PTz.SEARCH_LIVE_FEED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC645610PTz.SEARCH_LIVE_IN_MIX_FEED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC645610PTz.LIVE_IN_PRODUCT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC645610PTz.VIDEO_IN_PRODUCT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC645610PTz.LIVE_FEED.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC645610PTz.LIVE_IN_MIX_FEED.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC645610PTz.VIDEO_IN_MIX_FEED.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC645610PTz.USER_DETAIL.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC645610PTz.USER_LIVE.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC645610PTz.USER_SUB_CARD.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC645610PTz.PHOTO_IN_MIX_FEED.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[EnumC645610PTz.GENERAL_REFACTOR.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC645590PTx.values().length];
        try {
            iArr2[EnumC645590PTx.GENERAL.ordinal()] = 1;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC645590PTx.ECOM_RECOMMEND_PRODUCTS.ordinal()] = 2;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC645590PTx.ECOM.ordinal()] = 3;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        LIZIZ = iArr2;
    }
}
