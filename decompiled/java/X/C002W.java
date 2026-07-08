package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.002W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C002W {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C001A.values().length];
        try {
            iArr[C001A.MODIFY_DECORATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
