package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.payment.VoucherUseStatus;

/* JADX INFO: renamed from: X.0s6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1614300s6u {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VoucherUseStatus.values().length];
        try {
            iArr[VoucherUseStatus.NO_VOUCHER_USED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VoucherUseStatus.VOUCHER_UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[VoucherUseStatus.VOUCHER_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
