package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01CX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C01CX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C01CW.values().length];
        try {
            iArr[C01CW.PRE_CRASH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C01CW.ATTACH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
