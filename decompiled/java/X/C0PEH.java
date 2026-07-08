package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PEH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C0PEH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0PGF.values().length];
        try {
            iArr[C0PGF.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
