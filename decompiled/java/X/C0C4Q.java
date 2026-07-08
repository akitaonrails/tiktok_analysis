package X;

import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0C4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C0C4Q {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SaveConfigType$ConfigType.values().length];
        LIZ = iArr;
        try {
            iArr[SaveConfigType$ConfigType.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[SaveConfigType$ConfigType.INT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[SaveConfigType$ConfigType.LONG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[SaveConfigType$ConfigType.DOUBLE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[SaveConfigType$ConfigType.FLOAT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[SaveConfigType$ConfigType.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[SaveConfigType$ConfigType.STRING_ARRAY.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[SaveConfigType$ConfigType.OBJECT.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
    }
}
