package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.096Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C096Z {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C096Y.values().length];
        try {
            iArr[C096Y.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C096Y.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
