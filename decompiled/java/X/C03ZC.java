package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionConfigModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.03ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZC extends FrameLayout implements InterfaceC869803aa {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxIconView LLILZ;
    public C1841350y17 LLILZIL;
    public LinearLayout LLILZLL;
    public ConstraintLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C884703cz LLJI;
    public TuxIconView LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public LinearLayout LLJILLL;
    public CardView LLJJ;
    public TuxTextView LLJJI;
    public TuxIconView LLJJIII;
    public LinearLayout LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public LinearLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public C21411818qq LLJJL;
    public C21411818qq LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public C0HZQ LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public TextView LLJLL;
    public C426770GoN LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public HashMap<String, Object> LLJZIJLIL;
    public Function0<Unit> LLL;
    public Function0<Unit> LLLF;
    public Function1<? super PaymentInfo, Unit> LLLFF;
    public Function1<? super Boolean, Unit> LLLFFI;
    public Function1<? super PaymentMethod, Unit> LLLFZ;
    public InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> LLLI;
    public Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> LLLII;
    public PaymentInfo LLLIIII;
    public PaymentMethod LLLIIIIL;
    public String LLLIIIL;
    public Function0<Unit> LLLIIL;
    public Function0<Unit> LLLIILIL;
    public Function1<? super InstallmentPlan, Unit> LLLIL;
    public ButtonStyle LLLILZ;
    public ECRichText LLLILZJ;
    public final boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public OrderSubmitAssemViewModel LLLJIL;
    public PaymentInfoViewModel LLLJL;
    public boolean LLLL;
    public int LLLLII;
    public boolean LLLLIIIILLL;

    public final void setPaymentInfoFromOSP(Boolean bool) {
    }

    public final void LJFF() {
        String strLIZIZ;
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData;
        CreditInfo creditInfo;
        BillInfoData billInfoData2;
        PaymentMethodsData paymentMethodsData2;
        CreditInfo creditInfo2;
        Amount amount;
        BillInfoData billInfoData3;
        PaymentTip paymentTip;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        PaymentTip paymentTip2;
        Availability availability;
        PaymentMethod paymentMethod3 = this.LLLIIIIL;
        if (paymentMethod3 != null) {
            PaymentAppealHelper.LIZ.getClass();
            if (PaymentAppealHelper.LJI(paymentMethod3)) {
                C12ES.LJIILL(0, getLlPaymentTipStyleLayoutFromXml());
                C12ES.LJIILL(0, getTvPaymentTipStyleFromXml());
                getTvPaymentTipStyleFromXml().setTextColorRes(R.attr.ug);
                getTvPaymentTipStyleFromXml().setMovementMethod(LinkMovementMethod.getInstance());
                getTvPaymentTipStyleFromXml().setText(PaymentAppealHelper.LIZIZ(paymentMethod3, getContext(), new AwS402S0200000_1(this, paymentMethod3, 54)));
                return;
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLLJIL;
        String strLIZ = null;
        PaymentTip paymentTipQR2 = orderSubmitAssemViewModel != null ? orderSubmitAssemViewModel.QR2(this.LLLIIII, this.LLLIIIIL) : null;
        if (paymentTipQR2 != null && ((LIZLLL() || (((paymentMethod = this.LLLIIIIL) != null && (availability = paymentMethod.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE)) || this.LLLIZZ || ((paymentMethod2 = this.LLLIIIIL) != null && (paymentTip2 = paymentMethod2.paymentTip) != null && Intrinsics.LJFF(paymentTip2.showDescriptionDefault, Boolean.TRUE)))) && C770702zh.LIZIZ(paymentTipQR2.tips) && EventBus.LIZLLL().LJFF(C03ZN.class) == null)) {
            C12ES.LJIILL(0, getLlPaymentTipStyleLayoutFromXml());
            getTvPaymentTipStyleFromXml().setText(paymentTipQR2.tips);
            Integer numLIZIZ = PaymentTip.LIZIZ(paymentTipQR2, C960203pA.LIZIZ(getContext()), 2);
            if (numLIZIZ != null) {
                getTvPaymentTipStyleFromXml().setTextColor(numLIZIZ.intValue());
            } else {
                getTvPaymentTipStyleFromXml().setTextColorRes(R.attr.vd);
            }
            PaymentMethod paymentMethod4 = this.LLLIIIIL;
            if (paymentMethod4 == null || (paymentTip = paymentMethod4.paymentTip) == null || !Intrinsics.LJFF(paymentTip.showDescriptionDefault, Boolean.TRUE)) {
                C0H1U.LIZIZ(getLlBalanceLayoutFromXml());
                return;
            }
            return;
        }
        C03SE c03se = C03PI.LJIJI;
        PaymentMethod paymentMethod5 = this.LLLIIIIL;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLLJIL;
        PaymentMethodsData paymentMethodsData3 = (orderSubmitAssemViewModel2 == null || (billInfoData3 = orderSubmitAssemViewModel2.LLJJI) == null) ? null : billInfoData3.paymentMethods;
        c03se.getClass();
        if (!C03SE.LJJIIZI(paymentMethod5, paymentMethodsData3)) {
            C0H1U.LIZIZ(getLlPaymentTipStyleLayoutFromXml());
            return;
        }
        C12ES.LJIILL(0, getLlPaymentTipStyleLayoutFromXml());
        if (paymentTipQR2 != null) {
            Integer numLIZIZ2 = PaymentTip.LIZIZ(paymentTipQR2, C960203pA.LIZIZ(getContext()), 2);
            if (numLIZIZ2 != null) {
                getTvPaymentTipStyleFromXml().setTextColor(numLIZIZ2.intValue());
            } else {
                getTvPaymentTipStyleFromXml().setTextColorRes(R.attr.vd);
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LLLJIL;
        String priceStr = (orderSubmitAssemViewModel3 == null || (billInfoData2 = orderSubmitAssemViewModel3.LLJJI) == null || (paymentMethodsData2 = billInfoData2.paymentMethods) == null || (creditInfo2 = paymentMethodsData2.creditInfo) == null || (amount = creditInfo2.creditBalanceAmount) == null) ? null : amount.getPriceStr();
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LLLJIL;
        if (orderSubmitAssemViewModel4 != null && (billInfoData = orderSubmitAssemViewModel4.LLJJI) != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (creditInfo = paymentMethodsData.creditInfo) != null) {
            strLIZ = creditInfo.LIZ(getContext());
        }
        if (!C770702zh.LIZIZ(priceStr)) {
            C0H1U.LIZIZ(getLlPaymentTipStyleLayoutFromXml());
            return;
        }
        if (C770702zh.LIZIZ(strLIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" (");
            sbLIZ.append(strLIZ);
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        TuxTextView tvPaymentTipStyleFromXml = getTvPaymentTipStyleFromXml();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(priceStr);
        sbLIZ2.append(strLIZIZ);
        tvPaymentTipStyleFromXml.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[PHI: r10
      0x003f: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:46:0x0109, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZC.LJIIIIZZ():void");
    }

    public final void LJIIJ() {
        ECRichText eCRichText;
        PaymentMethod paymentMethod = this.LLLIIIIL;
        if (paymentMethod == null || (eCRichText = paymentMethod.subDisplayName) == null) {
            C0H1U.LIZIZ(getSubTitleFromXml());
            this.LLLILZJ = null;
            return;
        }
        C12ES.LJIILL(0, getSubTitleFromXml());
        if (Intrinsics.LJFF(this.LLLILZJ, eCRichText)) {
            return;
        }
        this.LLLILZJ = eCRichText;
        C03C8.LIZJ(getSubTitleFromXml(), this.LLLILZJ, "payment_sub_title", null);
    }

    public final void LJIIJJI() {
        Availability availability;
        PaymentMethod paymentMethod = this.LLLIIIIL;
        boolean zLJFF = (paymentMethod == null || (availability = paymentMethod.availability) == null) ? false : Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE);
        getLayoutPaymentAreaFromXml().setEnabled(!zLJFF);
        getTvPaymentNameFromXml().setTextColor(C960203pA.LIZ(zLJFF ? R.attr.a1p : R.attr.a1h, getContext()));
        C786410Ut5.u5(getIvPaymentIconFromXml(), zLJFF ? 0.3f : 1.0f);
        getRadioFromXml().setEnabled(!zLJFF);
    }

    public final C0HZQ getBtnSaveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cme);
            this.LLJLIL = (C0HZQ) callbackFindViewById;
        }
        return (C0HZQ) callbackFindViewById;
    }

    public final ConstraintLayout getCheckContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dpx);
            this.LLIZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getIcNoticeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.juh);
            this.LLJJIII = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIcToolTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jui);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconCcdcRightArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jza);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getIconsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k5c);
            this.LLJLILLLLZIIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final SmartImageView getIvPaymentIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l6y);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ConstraintLayout getLayoutPaymentAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m79);
            this.LLJILJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getLlBalanceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n9x);
            this.LLJJIJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlInstallmentPlanContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_g);
            this.LLJJJJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlPaymentTipStyleLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_s);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlViewMoreInstallmentPlansFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nad);
            this.LLJJJJLIIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C426770GoN getPromotionAlertDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_w);
            this.LLJLLIL = (C426770GoN) callbackFindViewById;
        }
        return (C426770GoN) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LLILZIL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final LinearLayout getSaveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tz8);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getServiceFeeInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uts);
            this.LLJJIJIIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TextView getSubTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wgz);
            this.LLJLL = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final C884703cz getSuperElementFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wpc);
            this.LLJI = (C884703cz) callbackFindViewById;
        }
        return (C884703cz) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsx);
            this.LLJJL = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonTokoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsy);
            this.LLJJLIIIJLLLLLLLZ = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final CardView getTagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x0u);
            this.LLJJ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final LinearLayout getTagExtraLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x19);
            this.LLJILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvAdditionalClarificationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z25);
            this.LLJJJJJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBindFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2i);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBindNoteFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2j);
            this.LLJJJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvCcdcCardTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2s);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoBelowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z3u);
            this.LLJJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoRightFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tvExtraInfoRight);
            this.LLJJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4s);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5_);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentTipStyleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5c);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvSaveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z6k);
            this.LLJL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        if (getLlInstallmentPlanContainerFromXml().getVisibility() == 0) {
            C08QT c08qt = new C08QT(C09RB.LJIJI(new C09RD(getLlInstallmentPlanContainerFromXml()), AFwS228S0000000_1.get$arr$(555)));
            while (c08qt.hasNext()) {
                C03ZF c03zf = (C03ZF) c08qt.next();
                if (c03zf.LIZJ()) {
                    c03zf.setChecked$ecommerce_transaction_release(false);
                }
            }
        }
    }

    public final void LIZIZ() {
        C0H1U.LIZIZ(getLlInstallmentPlanContainerFromXml());
        C786410Ut5.LJJJJJL(getLlInstallmentPlanContainerFromXml());
        C0H1U.LIZIZ(getTvAdditionalClarificationFromXml());
        C0H1U.LIZIZ(getLlViewMoreInstallmentPlansFromXml());
        View viewFindViewById = findViewById(R.id.qle);
        if (viewFindViewById != null) {
            C0H1U.LIZIZ(viewFindViewById);
        }
    }

    public final boolean LIZLLL() {
        return getRadioFromXml().isChecked() || getSwitchChecked();
    }

    public final void LJIIIZ() {
        String strLIZ;
        if (!LIZLLL() || this.LLLL || (strLIZ = C03ZO.LIZ(this.LLLIIIIL)) == null || strLIZ.length() <= 0) {
            C0H1U.LIZIZ(getTvExtraInfoRightFromXml());
        } else {
            C12ES.LJIILL(0, getTvExtraInfoRightFromXml());
            getTvExtraInfoRightFromXml().setText(strLIZ);
        }
    }

    public final boolean getSwitchChecked() {
        return getSwitchButtonFromXml().isChecked() || getSwitchButtonTokoFromXml().isChecked();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    public final boolean getAlwaysShowPaymentTips() {
        return this.LLLIZZ;
    }

    public final boolean getForceSelectIconToArrow() {
        return this.LLLLIIIILLL;
    }

    public final HashMap<String, Object> getGeneralParams() {
        return this.LLJZIJLIL;
    }

    public final Function0<Unit> getOnActivateClickListener() {
        return this.LLLF;
    }

    public final Function0<Unit> getOnCheckedListener() {
        return this.LLL;
    }

    public final Function1<InstallmentPlan, Unit> getOnInstallmentPlanClickListener() {
        return this.LLLIL;
    }

    public final InterfaceC1631620sYq<PaymentMethod, InstallmentPlan, Boolean, Unit> getOnInstallmentPromotionClickListener() {
        return this.LLLI;
    }

    public final Function2<PaymentMethod, InterestFeePromotion, Unit> getOnInterestingFeePromotionClickListener() {
        return this.LLLII;
    }

    public final Function1<PaymentInfo, Unit> getOnPaymentInfoChangeListener() {
        return this.LLLFF;
    }

    public final Function1<PaymentMethod, Unit> getOnPromotionClickListener() {
        return this.LLLFZ;
    }

    public final Function1<Boolean, Unit> getOnSaveClickListener() {
        return this.LLLFFI;
    }

    public final Function0<Unit> getOnViewMoreInstallmentPlansClickListener() {
        return this.LLLIIL;
    }

    public final Function0<Unit> getOnViewMoreSeparateInstallmentPlansClickListener() {
        return this.LLLIILIL;
    }

    public final OrderSubmitAssemViewModel getOspAssemViewModel() {
        return this.LLLJIL;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LLLIIII;
    }

    public final PaymentInfoViewModel getPaymentInfoViewModel() {
        return this.LLLJL;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LLLIIIIL;
    }

    public final boolean getPerformClick() {
        return this.LLLJ;
    }

    public final String getPipoBnplTenureFromPdp() {
        return this.LLLIIIL;
    }

    public final ButtonStyle getStyle() {
        return this.LLLILZ;
    }

    public final ECRichText getSubTitleContent() {
        return this.LLLILZJ;
    }

    public final boolean getUseDefaultRadio() {
        return this.LLLILZLLLI;
    }

    public C03ZC(Context context) {
        int i;
        super(context, null, 0);
        this.LLJZIJLIL = new HashMap<>();
        this.LLL = AFwS185S0000000_1.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLLF = AFwS185S0000000_1.get$arr$(299);
        this.LLLFF = AFwS228S0000000_1.get$arr$(557);
        this.LLLFFI = AFwS228S0000000_1.get$arr$(560);
        this.LLLFZ = AFwS228S0000000_1.get$arr$(559);
        this.LLLIIL = AFwS185S0000000_1.get$arr$(302);
        this.LLLIILIL = AFwS185S0000000_1.get$arr$(303);
        this.LLLIL = AFwS228S0000000_1.get$arr$(556);
        this.LLLILZLLLI = true;
        if (C870903al.LIZ()) {
            i = 100;
        } else {
            i = 3;
        }
        this.LLLLII = i;
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b2n, this, true);
    }

    private final void setSwitchChecked(boolean z) {
        getSwitchButtonFromXml().setChecked(z);
        getSwitchButtonTokoFromXml().setChecked(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r39) {
        /*
            Method dump skipped, instruction units count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZC.LJ(boolean):void");
    }

    public final void LJI(boolean z) {
        if (!z) {
            C0H1U.LIZIZ(getSwitchButtonFromXml());
            C0H1U.LIZIZ(getSwitchButtonTokoFromXml());
        } else if (this.LLLILZ == ButtonStyle.TOKO_STYLE) {
            C12ES.LJIILL(0, getSwitchButtonTokoFromXml());
        } else {
            C12ES.LJIILL(0, getSwitchButtonFromXml());
        }
    }

    public final void LJII(boolean z) {
        String str;
        String str2;
        if (z) {
            PaymentMethod paymentMethod = this.LLLIIIIL;
            String str3 = null;
            if (paymentMethod != null) {
                str = paymentMethod.additionalClarification;
            } else {
                str = null;
            }
            if (C770702zh.LIZIZ(str)) {
                C03SY c03sy = C03SY.LIZ;
                PaymentMethod paymentMethod2 = this.LLLIIIIL;
                if (paymentMethod2 != null) {
                    str2 = paymentMethod2.id;
                } else {
                    str2 = null;
                }
                c03sy.getClass();
                if (C03SY.LJIJ(str2)) {
                    TuxTextView tvAdditionalClarificationFromXml = getTvAdditionalClarificationFromXml();
                    C12ES.LJIILL(0, tvAdditionalClarificationFromXml);
                    PaymentMethod paymentMethod3 = this.LLLIIIIL;
                    if (paymentMethod3 != null) {
                        str3 = paymentMethod3.additionalClarification;
                    }
                    tvAdditionalClarificationFromXml.setText(str3);
                    return;
                }
            }
        }
        C0H1U.LIZIZ(getTvAdditionalClarificationFromXml());
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onInstallmentPlanViewAllClickEvent(C03ZN c03zn) {
        String str;
        TuxTextView tvPaymentTipStyleFromXml;
        PaymentMethod paymentMethod = this.LLLIIIIL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, c03zn.LIZ) && (tvPaymentTipStyleFromXml = getTvPaymentTipStyleFromXml()) != null) {
            C0H1U.LIZIZ(tvPaymentTipStyleFromXml);
        }
    }

    public final void setAlwaysShowPaymentTips(boolean z) {
        this.LLLIZZ = z;
    }

    public final void setBtnSaveFromXml(C0HZQ c0hzq) {
        this.LLJLIL = c0hzq;
    }

    public final void setCheckContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLIZ = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setChecked(boolean r26) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZC.setChecked(boolean):void");
    }

    public final void setForceSelectIconToArrow(boolean z) {
        this.LLLLIIIILLL = z;
    }

    public final void setGeneralParams(HashMap<String, Object> map) {
        this.LLJZIJLIL = map;
    }

    public final void setIcNoticeFromXml(TuxIconView tuxIconView) {
        this.LLJJIII = tuxIconView;
    }

    public final void setIcToolTipsFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setIconCcdcRightArrowFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setIconsContainerFromXml(LinearLayout linearLayout) {
        this.LLJLILLLLZIIL = linearLayout;
    }

    public final void setInExpressCheckout(boolean z) {
        this.LLLL = z;
    }

    public final void setIvPaymentIconFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setLayoutPaymentAreaFromXml(ConstraintLayout constraintLayout) {
        this.LLJILJIL = constraintLayout;
    }

    public final void setLlBalanceLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJIJI = linearLayout;
    }

    public final void setLlInstallmentPlanContainerFromXml(LinearLayout linearLayout) {
        this.LLJJJJ = linearLayout;
    }

    public final void setLlPaymentTipStyleLayoutFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setLlViewMoreInstallmentPlansFromXml(LinearLayout linearLayout) {
        this.LLJJJJLIIL = linearLayout;
    }

    public final void setOnActivateClickListener(Function0<Unit> function0) {
        this.LLLF = function0;
    }

    public final void setOnCheckedListener(Function0<Unit> function0) {
        this.LLL = function0;
    }

    public final void setOnInstallmentPlanClickListener(Function1<? super InstallmentPlan, Unit> function1) {
        this.LLLIL = function1;
    }

    public final void setOnInstallmentPromotionClickListener(InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLLI = interfaceC1631620sYq;
    }

    public final void setOnInterestingFeePromotionClickListener(Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> function2) {
        this.LLLII = function2;
    }

    public final void setOnPaymentInfoChangeListener(Function1<? super PaymentInfo, Unit> function1) {
        this.LLLFF = function1;
    }

    public final void setOnPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLFZ = function1;
    }

    public final void setOnSaveClickListener(Function1<? super Boolean, Unit> function1) {
        this.LLLFFI = function1;
    }

    public final void setOnViewMoreInstallmentPlansClickListener(Function0<Unit> function0) {
        this.LLLIIL = function0;
    }

    public final void setOnViewMoreSeparateInstallmentPlansClickListener(Function0<Unit> function0) {
        this.LLLIILIL = function0;
    }

    public final void setOspAssemViewModel(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LLLJIL = orderSubmitAssemViewModel;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LLLIIII = paymentInfo;
    }

    public final void setPaymentInfoViewModel(PaymentInfoViewModel paymentInfoViewModel) {
        this.LLLJL = paymentInfoViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r10) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZC.setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }

    public final void setPerformClick(boolean z) {
        this.LLLJ = z;
    }

    public final void setPipoBnplTenureFromPdp(String str) {
        this.LLLIIIL = str;
    }

    public final void setPromotionAlertDotFromXml(C426770GoN c426770GoN) {
        this.LLJLLIL = c426770GoN;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LLILZIL = c1841350y17;
    }

    public final void setSaveContainerFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setServiceFeeInfoFromXml(TuxTextView tuxTextView) {
        this.LLJJIJIIJIL = tuxTextView;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLLILZ = buttonStyle;
    }

    public final void setSubTitleContent(ECRichText eCRichText) {
        this.LLLILZJ = eCRichText;
    }

    public final void setSubTitleFromXml(TextView textView) {
        this.LLJLL = textView;
    }

    public final void setSuperElementFromXml(C884703cz c884703cz) {
        this.LLJI = c884703cz;
    }

    public final void setSwitchButtonFromXml(C21411818qq c21411818qq) {
        this.LLJJL = c21411818qq;
    }

    public final void setSwitchButtonTokoFromXml(C21411818qq c21411818qq) {
        this.LLJJLIIIJLLLLLLLZ = c21411818qq;
    }

    public final void setTagContainerFromXml(CardView cardView) {
        this.LLJJ = cardView;
    }

    public final void setTagExtraLayoutFromXml(LinearLayout linearLayout) {
        this.LLJILLL = linearLayout;
    }

    public final void setTvAdditionalClarificationFromXml(TuxTextView tuxTextView) {
        this.LLJJJJJIL = tuxTextView;
    }

    public final void setTvBindFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvBindNoteFromXml(TuxTextView tuxTextView) {
        this.LLJJJIL = tuxTextView;
    }

    public final void setTvCcdcCardTipFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setTvExtraInfoBelowFromXml(TuxTextView tuxTextView) {
        this.LLJJIJIL = tuxTextView;
    }

    public final void setTvExtraInfoRightFromXml(TuxTextView tuxTextView) {
        this.LLJJJ = tuxTextView;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setTvPaymentNameFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setTvPaymentTipStyleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvSaveFromXml(TuxTextView tuxTextView) {
        this.LLJL = tuxTextView;
    }

    public final void setUseDefaultRadio(boolean z) {
        if (z) {
            C12ES.LJIILL(0, getRadioFromXml());
            LJI(false);
        } else {
            C0H1U.LIZIZ(getRadioFromXml());
            LJI(true);
        }
    }

    @Override // X.InterfaceC869803aa
    public final InstallmentPlan xe(PaymentInfo paymentInfo) {
        return C03Z8.LIZ(paymentInfo);
    }

    public final void LIZJ(boolean z, Boolean bool) {
        String str;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        this.LLLFFI.invoke(Boolean.valueOf(z));
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
        PaymentMethod paymentMethod = this.LLLIIIIL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (C03S0.LIZ(str)) {
            PaymentMethod paymentMethod2 = this.LLLIIIIL;
            if (paymentMethod2 != null) {
                paymentMethod2.LJIIJJI = Boolean.valueOf(z);
            }
            LJIIIIZZ();
            LJIIIZ();
            EcomPaymentPromotionConfigModel ecomPaymentPromotionConfigModel = C03S0.LIZIZ().promotionConfigs;
            if (ecomPaymentPromotionConfigModel != null && Intrinsics.LJFF(ecomPaymentPromotionConfigModel.refreshSummaryAuto, Boolean.TRUE)) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLLJIL;
                if (orderSubmitAssemViewModel2 != null) {
                    orderSubmitAssemViewModel2.TS2();
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(bool, Boolean.TRUE) || (orderSubmitAssemViewModel = this.LLLJIL) == null) {
                return;
            }
            orderSubmitAssemViewModel.TS2();
        }
    }
}
