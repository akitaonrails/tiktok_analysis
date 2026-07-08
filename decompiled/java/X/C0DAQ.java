package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C0DAQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0DAS.values().length];
        try {
            iArr[C0DAS.RESOLVING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0DAS.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0DAS.READY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
