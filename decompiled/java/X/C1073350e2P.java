package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0e2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1073350e2P {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1073290e2J.values().length];
        try {
            iArr[EnumC1073290e2J.START_AUTH_PIPELINE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1073290e2J.END_AUTH_PIPELINE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
