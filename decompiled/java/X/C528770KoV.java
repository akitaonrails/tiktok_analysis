package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C528770KoV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0LQY.values().length];
        try {
            iArr[C0LQY.AI_THEATER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0LQY.AI_PORTRAIT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
