package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.014y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C2758014y {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC2759014z.values().length];
        try {
            iArr[EnumC2759014z.ACCEPT_AND_SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2759014z.DELETE_AND_HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2759014z.IGNORE_AND_SHOW_PREVIOUS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[C011V.values().length];
        try {
            iArr2[C011V.BROADCAST.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[C011V.AUDIENCE.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[C011V.PREVIEW_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
    }
}
