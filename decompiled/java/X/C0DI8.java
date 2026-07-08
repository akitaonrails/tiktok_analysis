package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DI8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C0DI8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0DI9.values().length];
        try {
            iArr[C0DI9.IDENTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0DI9.APPEND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0DI9.TAIL_REPLACE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0DI9.COMPLETE_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
