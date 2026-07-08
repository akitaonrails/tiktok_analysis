package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEConfigCenter;

/* JADX INFO: renamed from: X.1Bcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C2208801Bcc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEConfigCenter.DataType.values().length];
        try {
            iArr[VEConfigCenter.DataType.LONG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VEConfigCenter.DataType.BOOLEAN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[VEConfigCenter.DataType.FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[VEConfigCenter.DataType.INTEGER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[VEConfigCenter.DataType.STRING.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
