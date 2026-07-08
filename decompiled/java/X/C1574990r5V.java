package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0r5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1574990r5V {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1574970r5T.values().length];
        try {
            iArr[EnumC1574970r5T.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1574970r5T.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1574970r5T.COMPLTETE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1574970r5T.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
