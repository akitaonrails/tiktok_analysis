package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0SDG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0SDG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0SDF.values().length];
        try {
            iArr[C0SDF.REAL_PLAYER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0SDF.FAKE_PLAYER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
