package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0LZO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0LZO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0LZU.values().length];
        try {
            iArr[C0LZU.NEW_FRAMEWORK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
