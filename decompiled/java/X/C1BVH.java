package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BVH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C1BVH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1BVI.values().length];
        try {
            iArr[C1BVI.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1BVI.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
