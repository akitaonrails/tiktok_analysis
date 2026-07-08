package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0FCX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C0FCX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0FCY.values().length];
        try {
            iArr[C0FCY.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0FCY.HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0FCY.NET_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
