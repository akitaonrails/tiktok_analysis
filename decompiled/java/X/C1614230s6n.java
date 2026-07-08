package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.VoucherUseStatus;

/* JADX INFO: renamed from: X.0s6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1614230s6n {
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
