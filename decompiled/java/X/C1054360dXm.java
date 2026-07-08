package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.shopify.checkout.models.errors.CheckoutErrorType;
import com.shopify.checkout.models.errors.DefaultsErrorCode;
import com.shopify.checkout.models.errors.InternalErrorCode;
import com.shopify.checkout.models.errors.UnrecoverableErrorCode;
import com.shopify.checkout.models.errors.VaultedPaymentErrorCode;

/* JADX INFO: renamed from: X.0dXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1054360dXm {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;

    static {
        int[] iArr = new int[InternalErrorCode.values().length];
        try {
            iArr[InternalErrorCode.WebviewFailedToLoad.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[InternalErrorCode.DecodingError.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[InternalErrorCode.EncodingError.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[CheckoutErrorType.values().length];
        try {
            iArr2[CheckoutErrorType.INVENTORY.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[CheckoutErrorType.PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[CheckoutErrorType.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[CheckoutErrorType.DISCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[CheckoutErrorType.ORDER.ordinal()] = 5;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[CheckoutErrorType.CUSTOMERPERSISTENCE.ordinal()] = 6;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[CheckoutErrorType.CHECKOUTBLOCKING.ordinal()] = 7;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[VaultedPaymentErrorCode.values().length];
        try {
            iArr3[VaultedPaymentErrorCode.InvalidSession.ordinal()] = 1;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr3[VaultedPaymentErrorCode.InvalidPaymentInfo.ordinal()] = 2;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[DefaultsErrorCode.values().length];
        try {
            iArr4[DefaultsErrorCode.EmptyDefaults.ordinal()] = 1;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr4[DefaultsErrorCode.NonUniqueAddressReferenceIds.ordinal()] = 2;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr4[DefaultsErrorCode.AddressMissingCountry.ordinal()] = 3;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        LIZLLL = iArr4;
        int[] iArr5 = new int[UnrecoverableErrorCode.values().length];
        try {
            iArr5[UnrecoverableErrorCode.SdkNotEnabled.ordinal()] = 1;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr5[UnrecoverableErrorCode.InvalidCheckoutUrl.ordinal()] = 2;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        LJ = iArr5;
    }
}
