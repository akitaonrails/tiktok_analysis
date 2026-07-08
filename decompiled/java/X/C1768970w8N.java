package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0w8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1768970w8N {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[EnumC1768910w8H.values().length];
        try {
            iArr[EnumC1768910w8H.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1768910w8H.HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1769010w8R.values().length];
        try {
            iArr2[EnumC1769010w8R.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC1769010w8R.HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC1768950w8L.values().length];
        try {
            iArr3[EnumC1768950w8L.FEED_VIDEO_SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr3[EnumC1768950w8L.GENERAL_SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr3[EnumC1768950w8L.SHOP_TAB_SHOW.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr3[EnumC1768950w8L.UG_BACK_FYP_SHOW_BUBBLE.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr3[EnumC1768950w8L.BYTESYNC_PUSH.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr3[EnumC1768950w8L.AFTER_FREEZE_TIME.ordinal()] = 6;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr3[EnumC1768950w8L.PITAYA_TRIGGER_IMMEDIATELY.ordinal()] = 7;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        LIZJ = iArr3;
    }
}
