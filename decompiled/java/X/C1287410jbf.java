package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1287410jbf {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC797900VRs.values();
        try {
            EnumC797900VRs.MutedGlowCyan.ordinal();
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int[] iArr = new int[EnumC1287420jbg.values().length];
        try {
            iArr[EnumC1287420jbg.SpinDiffuse.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1287420jbg.HexagonGrid.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1287420jbg.HexagonZoom.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1287420jbg.NoiseGradient.ordinal()] = 4;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
