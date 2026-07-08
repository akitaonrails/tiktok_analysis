package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0k8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1307700k8O {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1307710k8P.values().length];
        try {
            iArr[EnumC1307710k8P.GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1307710k8P.STRATEGY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1307710k8P.NODE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
