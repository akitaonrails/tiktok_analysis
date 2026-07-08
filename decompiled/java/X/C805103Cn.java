package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;

/* JADX INFO: renamed from: X.03Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C805103Cn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CciCashierDisplayType.values().length];
        try {
            iArr[CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_NO_BANK_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE_MX.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
