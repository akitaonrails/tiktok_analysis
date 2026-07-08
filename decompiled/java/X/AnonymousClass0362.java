package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0362, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class AnonymousClass0362 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC969503qf.values().length];
        try {
            iArr[EnumC969503qf.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC969503qf.US_OSP_V1.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
