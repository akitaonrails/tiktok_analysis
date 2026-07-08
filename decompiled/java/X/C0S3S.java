package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0S3S, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0S3S {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0S3R.values().length];
        try {
            iArr[C0S3R.START_TOUCH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0S3R.END_TOUCH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
