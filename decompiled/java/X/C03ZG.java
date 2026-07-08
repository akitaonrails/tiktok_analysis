package X;

import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentCciSeparateInstallmentTypeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZG extends C09AY implements Function2<Integer, InstallmentPlan, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ InstallmentInfo LLILLJJLI;
    public final /* synthetic */ C03ZD LLILLL;
    public final /* synthetic */ C259800zU<Boolean> LLILZ;
    public final /* synthetic */ C259800zU<Boolean> LLILZIL;
    public final /* synthetic */ C259800zU<Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03ZG(C118300cf c118300cf, InstallmentInfo installmentInfo, C03ZD c03zd, C259800zU<Boolean> c259800zU, C259800zU<Boolean> c259800zU2, C259800zU<Boolean> c259800zU3) {
        super(2);
        this.LL = c118300cf;
        this.LLILLJJLI = installmentInfo;
        this.LLILLL = c03zd;
        this.LLILZ = c259800zU;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = c259800zU3;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Boolean] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, InstallmentPlan installmentPlan) {
        Integer numValueOf;
        boolean z;
        int i;
        boolean z2;
        String strLJJIIZ;
        String strLJIIJ;
        boolean z3;
        String str;
        C03WH c03wh;
        String str2;
        String str3;
        String priceStr;
        EnterParams enterParams;
        Availability availability;
        final int iIntValue = num.intValue();
        final InstallmentPlan installmentPlan2 = installmentPlan;
        this.LL.element++;
        final InstallmentInfo installmentInfo = this.LLILLJJLI;
        if (installmentInfo != null) {
            final C03ZD c03zd = this.LLILLL;
            C259800zU<Boolean> c259800zU = this.LLILZ;
            C259800zU<Boolean> c259800zU2 = this.LLILZIL;
            C259800zU<Boolean> c259800zU3 = this.LLILZLL;
            Map<String, String> map = c03zd.LLJILLL;
            C03SY c03sy = C03SY.LIZ;
            CciCashierDisplayType cciCashierDisplayType = c03zd.LLLFFI;
            c03sy.getClass();
            EcomPaymentCciSeparateInstallmentTypeModel ecomPaymentCciSeparateInstallmentTypeModel = C845603Sc.LIZ;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcomPaymentCciSeparateInstallmentTypeModel ecomPaymentCciSeparateInstallmentTypeModel2 = C845603Sc.LIZ;
            EcomPaymentCciSeparateInstallmentTypeModel ecomPaymentCciSeparateInstallmentTypeModel3 = (EcomPaymentCciSeparateInstallmentTypeModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_payment_cci_separate_installment_type", EcomPaymentCciSeparateInstallmentTypeModel.class, ecomPaymentCciSeparateInstallmentTypeModel2);
            if (ecomPaymentCciSeparateInstallmentTypeModel3 != null) {
                ecomPaymentCciSeparateInstallmentTypeModel2 = ecomPaymentCciSeparateInstallmentTypeModel3;
            }
            List<Integer> list = ecomPaymentCciSeparateInstallmentTypeModel2.enableMinHeight;
            String str4 = null;
            if (cciCashierDisplayType != null) {
                numValueOf = Integer.valueOf(cciCashierDisplayType.getValue());
            } else {
                numValueOf = null;
            }
            boolean zLJJJJ = C13LP.LJJJJ(numValueOf, list);
            final C03ZF c03zf = new C03ZF(c03zd.getContext());
            c03zf.setInstallmentBreakdownIcons(map);
            c03zf.setFromPayment(true);
            c03zf.setNewActivateFlowEnabled(c03zd.LLJZIJLIL);
            c03zf.setDisplayInstallmentPlanWhenInactivated(c03zd.LLL);
            if (c03zd.getDisplayMode() != C03ZQ.DOUBLE_COLUMN) {
                z = true;
            } else {
                z = false;
            }
            c03zf.setNeedShowBreakdownInsideInstallmentPlan(z);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            if (c03zd.LLJLILLLLZIIL) {
                i = 44;
            } else {
                i = 0;
            }
            marginLayoutParams.leftMargin = C679280Qkg.LIZ(i);
            marginLayoutParams.topMargin = C679280Qkg.LIZ(8);
            marginLayoutParams.setMarginStart(C679280Qkg.LIZ(i));
            C786410Ut5.r7(c03zf, marginLayoutParams);
            if (c03zd.LLJJJJLIIL == ButtonStyle.TOKO_STYLE) {
                z2 = true;
            } else {
                z2 = false;
            }
            C03ZF.LIZIZ(c03zf, installmentPlan2, z2, false, c03zd.getPaymentMethod(), 4);
            c03zf.setMinHeightForContainer$ecommerce_transaction_release(zLJJJJ);
            final C013C c013c = new C013C();
            if (C869703aZ.LIZ(installmentPlan2, c03zd.LLJJI)) {
                c013c.element = true;
            }
            PaymentMethod paymentMethod = c03zd.getPaymentMethod();
            if (paymentMethod != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIIZ);
            sbLIZ.append("_installment");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            final String str5 = strLJJIIZ;
            C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.03Z9
                /* JADX WARN: Removed duplicated region for block: B:107:0x01d8  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
                @Override // X.AbstractViewOnClickListenerC420730Ged
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r23) {
                    /*
                        Method dump skipped, instruction units count: 515
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C03Z9.LIZ(android.view.View):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                }
            }, c03zf);
            c03zf.setOnInstallmentPromotionClickListener(c03zd.LLJJIJIL);
            c03zf.setOnInterestingFeePromotionClickListener(c03zd.LLJJJ);
            if (C869703aZ.LIZ(installmentPlan2, c03zd.LLJJI)) {
                c03zd.LLLF = true;
                c03zf.performClick();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            PaymentMethod paymentMethod2 = c03zd.getPaymentMethod();
            if (paymentMethod2 != null) {
                strLJIIJ = paymentMethod2.LJIIJ();
            } else {
                strLJIIJ = null;
            }
            String str6 = "";
            if (strLJIIJ == null) {
                strLJIIJ = "";
            }
            sbLIZ2.append(strLJIIJ);
            sbLIZ2.append('_');
            sbLIZ2.append(installmentPlan2.id);
            sbLIZ2.append('_');
            sbLIZ2.append(installmentPlan2.tenure);
            if (c03zd.LLLFF.add(C2188811AlT.LIZIZ(sbLIZ2)) && (c03wh = c03zd.LLJJJJ) != null) {
                if (strLJJIIZ != null) {
                    str6 = strLJJIIZ;
                }
                PaymentMethod paymentMethod3 = c03zd.getPaymentMethod();
                if (paymentMethod3 != null) {
                    str2 = paymentMethod3.extraInfo;
                } else {
                    str2 = null;
                }
                boolean zLIZIZ = C770702zh.LIZIZ(str2);
                PaymentMethod paymentMethod4 = c03zd.getPaymentMethod();
                if (paymentMethod4 != null && (availability = paymentMethod4.availability) != null) {
                    str3 = availability.statusCode;
                } else {
                    str3 = null;
                }
                Boolean boolValueOf = Boolean.valueOf(c013c.element);
                Amount amount = installmentInfo.orderAmount;
                if (amount != null) {
                    priceStr = amount.getPriceStr();
                } else {
                    priceStr = null;
                }
                PaymentMethod paymentMethod5 = c03zd.getPaymentMethod();
                PaymentViewModel paymentViewModel = c03zd.LLJJJJJIL;
                if (paymentViewModel != null) {
                    enterParams = paymentViewModel.LLJ;
                } else {
                    enterParams = null;
                }
                c03wh.LJIJJLI(str6, strLIZIZ, iIntValue, zLIZIZ, str3, boolValueOf, installmentPlan2, priceStr, paymentMethod5, enterParams, installmentPlan2.isRecommend, installmentPlan2.LIZIZ());
            }
            Function1<? super InstallmentPlan, Unit> function1 = c03zd.LLJJIII;
            if (function1 != null) {
                function1.invoke(installmentPlan2);
            }
            C03ZT.LIZIZ(c03zd, c03zf, iIntValue);
            if (c03zf.getPromotionTagFromXml().getVisibility() == 0) {
                c259800zU.element = Boolean.TRUE;
            }
            if (c03zf.getTvInstallmentPromotionFromXml().getVisibility() == 0) {
                c259800zU2.element = Boolean.TRUE;
            }
            if (c03zf.getTvInterestFeePromotionFromXml().getVisibility() == 0) {
                c259800zU3.element = Boolean.TRUE;
            }
            PaymentMethod paymentMethod6 = c03zd.getPaymentMethod();
            if (paymentMethod6 != null) {
                str4 = paymentMethod6.id;
            }
            if (EcomMergeBalanceAndInstallmentSettings.LIZ(str4)) {
                if (!Intrinsics.LJFF(installmentPlan2.tenure, "client_dummy_balance")) {
                    c03zf.setEnabled(true);
                } else {
                    PaymentMethod paymentMethod7 = c03zd.getPaymentMethod();
                    if (paymentMethod7 != null && (str = paymentMethod7.balance) != null && str.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    c03zf.setEnabled(!z3);
                }
            }
        }
        return Unit.LIZ;
    }
}
