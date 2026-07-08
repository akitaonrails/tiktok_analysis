package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C837603Pa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C03PV.values().length];
        try {
            iArr[C03PV.ORDER_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C03PV.OSP_ORDER_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C03PV.RETRY_CASHIER_ORDER_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C03PV.PIPO_SDK_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
