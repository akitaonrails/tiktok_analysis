package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MG9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MG9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0MGA.values().length];
        try {
            iArr[C0MGA.EDITOR_TAB.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0MGA.AISELF_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0MGA.ALBUM_AIME_IMAGE_TAB.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0MGA.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
