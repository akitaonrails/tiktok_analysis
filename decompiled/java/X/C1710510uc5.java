package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;

/* JADX INFO: renamed from: X.0uc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1710510uc5 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[POConfiguration.CCDCBindType.values().length];
        try {
            iArr[POConfiguration.CCDCBindType.REAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1710490uc3.values().length];
        try {
            iArr2[EnumC1710490uc3.BILLING_CITY.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr2[EnumC1710490uc3.BILLING_POSTAL_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC1710490uc3.BILLING_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC1710490uc3.BILLING_STREET.ordinal()] = 4;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC1710490uc3.CARD_NUMBER.ordinal()] = 5;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC1710490uc3.CVV.ordinal()] = 6;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[EnumC1710490uc3.HOLDER_NAME.ordinal()] = 7;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[EnumC1710490uc3.NORMAL.ordinal()] = 8;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[EnumC1710490uc3.EXPIRATION_DATE.ordinal()] = 9;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZIZ = iArr2;
    }
}
