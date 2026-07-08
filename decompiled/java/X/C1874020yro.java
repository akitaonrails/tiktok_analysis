package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0yro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C1874020yro {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1874010yrn.values().length];
        try {
            iArr[EnumC1874010yrn.MAIN_FRAME_READY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1874010yrn.IFRAME_END.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1874010yrn.LAUNCH_END.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1874010yrn.GAME_READY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1874010yrn.PERF_MONITOR.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
