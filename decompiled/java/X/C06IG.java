package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06IG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06IG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C06IF.values().length];
        try {
            iArr[C06IF.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C06IF.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C06IF.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
