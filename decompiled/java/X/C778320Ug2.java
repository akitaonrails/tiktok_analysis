package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ug2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C778320Ug2 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC776690UdP.values().length];
        try {
            iArr[EnumC776690UdP.GAME_LIVE_ENTER_BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC776690UdP.PERFORMANCE_DATA_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC778330Ug3.values().length];
        try {
            iArr2[EnumC778330Ug3.LOW_DEVICE_TIP.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC778330Ug3.LOW_BATTERY_TIP.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC778330Ug3.HIGH_TEMPERATURE_TIP.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC778330Ug3.SAVE_MODE_TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
    }
}
