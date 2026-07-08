package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C444570Hbz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC444580Hc0.values().length];
        try {
            iArr[EnumC444580Hc0.PILL_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC444580Hc0.SQUARED_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC444580Hc0.NO_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
