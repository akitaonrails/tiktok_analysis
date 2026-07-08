package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.violations.ViolationErrorType;
import com.shopify.checkout.webMessage.ShopifyWebMessage;

/* JADX INFO: renamed from: X.0dXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1054400dXq {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[ShopifyWebMessage.values().length];
        try {
            iArr[ShopifyWebMessage.STATE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[ShopifyWebMessage.CHECKOUT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[ShopifyWebMessage.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[ShopifyWebMessage.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[ShopifyWebMessage.INIT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[ShopifyWebMessage.CHECKOUT_BLOCKING_EVENT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[ShopifyWebMessage.UPDATE_PROGRESS_BUTTON.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[ShopifyWebMessage.LOCALE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZ = iArr;
        int[] iArr2 = new int[ErrorGroup.values().length];
        try {
            iArr2[ErrorGroup.CHECKOUT.ordinal()] = 1;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[ErrorGroup.VIOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr2[ErrorGroup.VAULTED_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr2[ErrorGroup.DEFAULTS.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[ErrorGroup.UNRECOVERABLE.ordinal()] = 5;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[ErrorGroup.INTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[ViolationErrorType.values().length];
        try {
            iArr3[ViolationErrorType.Inventory.ordinal()] = 1;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr3[ViolationErrorType.Delivery.ordinal()] = 2;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        LIZJ = iArr3;
    }
}
