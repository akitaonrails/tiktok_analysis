package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13Wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20023113Wb {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20023013Wa.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC20023013Wa.Launcher.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC20023013Wa.Push.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC20023013Wa.Deeplink.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[EnumC20023013Wa.ClickPushCold.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[EnumC20023013Wa.Other.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[EnumC20023013Wa.ClickPushWarm.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
    }
}
