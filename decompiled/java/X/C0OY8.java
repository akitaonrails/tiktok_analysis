package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OY8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C0OY8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0OY7.values().length];
        try {
            iArr[C0OY7.LOAD_MORE_ERR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
