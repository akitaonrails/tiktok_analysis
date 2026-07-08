package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.ab.PipoTtlsCheckoutBraintreePaypalConfigModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingAmount;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPaymentMethodBaseInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS177S0400000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uZ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708640uZ4 implements InterfaceC835070WpN {
    public static final C1708640uZ4 LIZ = new C1708640uZ4();

    @Override // X.InterfaceC835070WpN
    public final boolean LIZ() {
        return true;
    }

    public static boolean LJI(PaymentOption paymentOption) {
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo;
        String str;
        if (paymentOption == null || (pOPaymentMethodBaseInfo = paymentOption.paymentMethodBaseInfo) == null || (str = pOPaymentMethodBaseInfo.model) == null || !u.LJIJI(str, "tokenize_and_pay", true)) {
            return false;
        }
        String strLJJ = paymentOption.LJJ();
        if (strLJJ != null && strLJJ.length() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC835070WpN
    public final boolean LIZJ(PaymentOption paymentOption) {
        String strLJIL;
        if (paymentOption == null || (strLJIL = paymentOption.LJIL()) == null || !u.LJJIIJZLJL(strLJIL, "pm_pi_ew_paypal_c_", false)) {
            return false;
        }
        return true;
    }

    public static Element LJ(String str, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Element elementLJ = (Element) it2.next();
                if (!Intrinsics.LJFF(elementLJ.paramName, str)) {
                    C1708640uZ4 c1708640uZ4 = LIZ;
                    List<Element> list2 = elementLJ.subElementList;
                    c1708640uZ4.getClass();
                    elementLJ = LJ(str, list2);
                    if (elementLJ != null) {
                    }
                }
                return elementLJ;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[PHI: r5
      0x0023: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:6:0x000c, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement LIZLLL(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormInfo r0 = r2.formInfo
            if (r0 == 0) goto L25
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element> r0 = r0.elements
        L6:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element r2 = LJ(r3, r0)
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement r1 = new com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.id
            if (r0 == 0) goto L13
            r5 = r0
        L13:
            java.lang.Boolean r0 = r2.needEncrypted
            if (r0 == 0) goto L23
            boolean r0 = r0.booleanValue()
        L1b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.<init>(r5, r3, r4, r0)
            return r1
        L23:
            r0 = 0
            goto L1b
        L25:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708640uZ4.LIZLLL(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement");
    }

    @Override // X.InterfaceC835070WpN
    public final void LIZIZ(Context context, C1709570uaZ c1709570uaZ, PaymentOption paymentOption, InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        PricingPlan pricingPlan;
        PricingAmount pricingAmount;
        String str;
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo;
        String str2;
        String strLJJ;
        if (LJI(paymentOption)) {
            try {
                IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
                if (iPipoService != null && iPipoService.LJI()) {
                    String strLJIJJLI = paymentOption.LJIJJLI();
                    String str3 = "";
                    if (strLJIJJLI == null) {
                        strLJIJJLI = "";
                    }
                    PIPOPaymentMethod pIPOPaymentMethod = paymentOption.legacyPM;
                    if ((pIPOPaymentMethod != null && (str = pIPOPaymentMethod.paymentCurrency) != null) || ((pricingPlan = paymentOption.LIZIZ) != null && (pricingAmount = pricingPlan.actualAmount) != null && (str = pricingAmount.amountCurrency) != null)) {
                        str3 = str;
                    }
                    LJFF(context, paymentOption, strLJIJJLI, str3, interfaceC1631630sYr);
                    return;
                }
                AwS154S0400000_26 awS154S0400000_26 = new AwS154S0400000_26(context, (Context) c1709570uaZ, (C1709570uaZ) paymentOption, (PaymentOption) interfaceC1631630sYr, (InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit>) 26);
                AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(context, interfaceC1631630sYr, 84);
                IPipoService iPipoService2 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
                if (iPipoService2 != null) {
                    iPipoService2.LJIILJJIL(new AwS392S0200000_26(awS154S0400000_26, awS427S0200000_26, 178));
                    return;
                } else {
                    awS427S0200000_26.invoke();
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC1631630sYr.invoke(EnumC336190DFx.EXCEPTION_ERROR, null, context.getString(2131832779), "PAYPAL_ERROR_EXCEPTION");
                return;
            }
        }
        if (paymentOption != null && LIZJ(paymentOption) && (pOPaymentMethodBaseInfo = paymentOption.paymentMethodBaseInfo) != null && (str2 = pOPaymentMethodBaseInfo.model) != null && u.LJIJI(str2, "pay_on_token", true) && (strLJJ = paymentOption.LJJ()) != null && strLJJ.length() != 0) {
            c1709570uaZ.LJJIIJZLJL(paymentOption.LIZ).pmDeviceData = null;
            C1708470uYn c1708470uYn = C1708470uYn.LIZ;
            AwS177S0400000_26 awS177S0400000_26 = new AwS177S0400000_26(context, c1709570uaZ, paymentOption, interfaceC1631630sYr, 1);
            AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(context, (Context) interfaceC1631630sYr, (InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit>) 177);
            c1708470uYn.getClass();
            C1708470uYn.LIZ(context, "PAYPAL_ERROR_DF_DOWNLOAD_FAIL", awS177S0400000_26, awS392S0200000_26);
            return;
        }
        interfaceC1631630sYr.invoke(EnumC336190DFx.SUCCESS, null, null, null);
    }

    public static void LJFF(Context context, PaymentOption paymentOption, String str, String str2, InterfaceC1631630sYr interfaceC1631630sYr) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(EnumC336190DFx.PAYMENT_ERROR, null, context.getString(2131832960), "PAYPAL_ERROR_INVALID_CONTEXT");
                return;
            }
            return;
        }
        IPipoExternalPaymentsService iPipoExternalPaymentsService = (IPipoExternalPaymentsService) PluggableExtentionKt.pluggableSpi$default(IPipoExternalPaymentsService.class, false, false, false, 14, null);
        if (iPipoExternalPaymentsService == null) {
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(EnumC336190DFx.PAYMENT_ERROR, null, context.getString(2131832960), "PAYPAL_ERROR_SERVICE_UNAVAILABLE");
            }
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PipoTtlsCheckoutBraintreePaypalConfigModel pipoTtlsCheckoutBraintreePaypalConfigModel = C1708630uZ3.LIZ;
            PipoTtlsCheckoutBraintreePaypalConfigModel pipoTtlsCheckoutBraintreePaypalConfigModel2 = (PipoTtlsCheckoutBraintreePaypalConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttls_checkout_braintree_paypal_config", PipoTtlsCheckoutBraintreePaypalConfigModel.class, pipoTtlsCheckoutBraintreePaypalConfigModel);
            if (pipoTtlsCheckoutBraintreePaypalConfigModel2 != null) {
                pipoTtlsCheckoutBraintreePaypalConfigModel = pipoTtlsCheckoutBraintreePaypalConfigModel2;
            }
            iPipoExternalPaymentsService.LJFF(c19egLIZIZ, str, str2, EnumC922503j5.CHECKOUT_WITH_VAULT, pipoTtlsCheckoutBraintreePaypalConfigModel.token, pipoTtlsCheckoutBraintreePaypalConfigModel.merchantAccountId, pipoTtlsCheckoutBraintreePaypalConfigModel.displayName, new AwS488S0200000_26(interfaceC1631630sYr, (InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit>) paymentOption, (PaymentOption) 5));
        }
    }
}
