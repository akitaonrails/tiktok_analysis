package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WOX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0WOX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0WOW.values().length];
        try {
            iArr[C0WOW.SPARK_LITE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
