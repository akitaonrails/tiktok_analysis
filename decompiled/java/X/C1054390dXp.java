package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.shopify.checkout.models.errors.CheckoutErrorPayload;
import com.shopify.checkout.models.errors.DefaultsErrorPayload;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.InternalErrorCode;
import com.shopify.checkout.models.errors.InternalErrorPayload;
import com.shopify.checkout.models.errors.InternalErrorReasons;
import com.shopify.checkout.models.errors.UnrecoverableErrorPayload;
import com.shopify.checkout.models.errors.VaultedPaymentErrorPayload;
import com.shopify.checkout.models.errors.violations.DeliveryErrorPayload;
import com.shopify.checkout.models.errors.violations.InventoryErrorPayload;
import com.shopify.checkout.models.errors.violations.ViolationErrorType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054390dXp {
    public final C1040060dAi LIZ;

    public C1054390dXp(C1040060dAi c1040060dAi) {
        this.LIZ = c1040060dAi;
    }

    public static List LIZ(String str) {
        Object internalErrorPayload;
        String strLJIL;
        ErrorGroup errorGroup;
        C1227904rF.LIZ.getClass();
        h hVar = (h) C1227904rF.LIZIZ(str, h.class);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hVar, 10));
        for (k kVar : hVar) {
            try {
                strLJIL = kVar.LJIILIIL().LJJIIZ("group").LJIL();
                ErrorGroup[] errorGroupArrValues = ErrorGroup.values();
                int length = errorGroupArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        errorGroup = errorGroupArrValues[i];
                        if (!Intrinsics.LJFF(errorGroup.getValue(), strLJIL)) {
                            i++;
                        }
                    } else {
                        errorGroup = null;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InternalErrorCode internalErrorCode = InternalErrorCode.DecodingError;
                String message = e.getMessage();
                if (message == null) {
                    message = InternalErrorReasons.FailToParseErrorJson.getValue();
                }
                internalErrorPayload = new InternalErrorPayload(internalErrorCode, e, message);
            }
            if (errorGroup != null) {
                switch (C1054400dXq.LIZIZ[errorGroup.ordinal()]) {
                    case 1:
                        internalErrorPayload = (InterfaceC1054410dXr) C1227904rF.LIZIZ(kVar.toString(), CheckoutErrorPayload.class);
                        break;
                    case 2:
                        internalErrorPayload = LIZIZ(kVar);
                        break;
                    case 3:
                        internalErrorPayload = (InterfaceC1054410dXr) C1227904rF.LIZIZ(kVar.toString(), VaultedPaymentErrorPayload.class);
                        break;
                    case 4:
                        internalErrorPayload = (InterfaceC1054410dXr) C1227904rF.LIZIZ(kVar.toString(), DefaultsErrorPayload.class);
                        break;
                    case 5:
                        internalErrorPayload = (InterfaceC1054410dXr) C1227904rF.LIZIZ(kVar.toString(), UnrecoverableErrorPayload.class);
                        break;
                    case 6:
                        throw new IllegalArgumentException("Internal errors should not be decoded");
                    default:
                        throw new C1954807lC();
                }
                arrayList.add(internalErrorPayload);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(InternalErrorReasons.InvalidErrorType);
                sbLIZ.append(' ');
                sbLIZ.append(strLJIL);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return arrayList;
    }

    public static InterfaceC1054410dXr LIZIZ(k kVar) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        String strLJIL = kVar.LJIILIIL().LJJIIZ("type").LJIL();
        for (ViolationErrorType violationErrorType : ViolationErrorType.values()) {
            if (Intrinsics.LJFF(violationErrorType.getValue(), strLJIL)) {
                int i = C1054400dXq.LIZJ[violationErrorType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        String string = kVar.toString();
                        c1227904rF.getClass();
                        return (InterfaceC1054410dXr) C1227904rF.LIZIZ(string, DeliveryErrorPayload.class);
                    }
                    throw new C1954807lC();
                }
                String string2 = kVar.toString();
                c1227904rF.getClass();
                return (InterfaceC1054410dXr) C1227904rF.LIZIZ(string2, InventoryErrorPayload.class);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown type value: ");
        sbLIZ.append(strLJIL);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
