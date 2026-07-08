package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1579430rCf {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[EnumC1578110rAX.values().length];
        try {
            iArr[EnumC1578110rAX.SWIPE_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1578110rAX.SWIPE_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1578110rAX.SWIPE_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1579440rCg.values().length];
        try {
            iArr2[EnumC1579440rCg.FIRST_SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC1579440rCg.CLICK_BUBBLE.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC1579440rCg.DRAG_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC1579420rCe.values().length];
        try {
            iArr3[EnumC1579420rCe.ALL_SERIES_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr3[EnumC1579420rCe.ALL_SERIES_DETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr3[EnumC1579420rCe.TRENDING_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr3[EnumC1579420rCe.TRENDING_DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr3[EnumC1579420rCe.TRENDING_DETAIL.ordinal()] = 5;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr3[EnumC1579420rCe.HISTORY_DEFAULT.ordinal()] = 6;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr3[EnumC1579420rCe.HISTORY_DETAIL.ordinal()] = 7;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr3[EnumC1579420rCe.HISTORY_LIST.ordinal()] = 8;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        LIZJ = iArr3;
    }
}
