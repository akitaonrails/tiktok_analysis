package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Of7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C624870Of7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC624770Oex.values().length];
        try {
            iArr[EnumC624770Oex.PAUSE_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC624770Oex.PAUSE_NO_NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC624770Oex.PAUSE_NOT_WIFI.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
