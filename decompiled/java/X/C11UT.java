package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11UT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C11UT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C11US.values().length];
        try {
            iArr[C11US.NOT_DOWNLOAD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C11US.DOWNLOADED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C11US.DOWNLOADING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
