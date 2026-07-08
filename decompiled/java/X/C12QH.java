package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12QH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C12QH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C12QJ.values().length];
        try {
            iArr[C12QJ.OK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C12QJ.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C12QJ.SETTINGS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
