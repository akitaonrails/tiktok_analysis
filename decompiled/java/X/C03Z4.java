package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.03Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03Z4 extends LinearLayout {
    public TuxTextView LL;
    public C1841350y17 LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public LinearLayout LLIZLLLIL;
    public CardView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C21411818qq LLJILLL;
    public C21411818qq LLJJ;
    public LinearLayout LLJJI;
    public final View LLJJIII;
    public ECRichText LLJJIJI;
    public PaymentViewModel LLJJIJIIJIL;
    public HashMap<String, Object> LLJJIJIL;
    public C03WH LLJJJ;
    public String LLJJJIL;
    public Function2<? super PaymentMethod, ? super Function1<? super String, Unit>, Unit> LLJJJJ;
    public Function1<? super String, Unit> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public Function1<? super PaymentMethod, Unit> LLJJL;
    public Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public PaymentMethod LLJLLIL;
    public ButtonStyle LLJLLL;
    public boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final ARunnableS101S0100000_1 LLL;

    private final Handler getMainHandler() {
        return (Handler) this.LLJJJJLIIL.getValue();
    }

    public final void LIZ() {
        C03SE c03se = C03PI.LJIJI;
        PaymentMethod paymentMethod = this.LLJLLIL;
        PaymentViewModel paymentViewModel = this.LLJJIJIIJIL;
        PaymentMethodsData paymentMethodsData = paymentViewModel != null ? paymentViewModel.LLJJIJIL : null;
        c03se.getClass();
        if (!C03SE.LJJIIZI(paymentMethod, paymentMethodsData)) {
            C0H1U.LIZIZ(getIcToolTipsFromXml());
        } else {
            C12ES.LJIILL(0, getIcToolTipsFromXml());
            C786410Ut5.I7(new AjS60S0100000_1(this, 67), getIcToolTipsFromXml());
        }
    }

    public final void LIZIZ() {
        String strLIZIZ;
        PaymentMethodsData paymentMethodsData;
        CreditInfo creditInfo;
        PaymentMethodsData paymentMethodsData2;
        CreditInfo creditInfo2;
        Amount amount;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        PaymentTip paymentTip;
        Availability availability;
        PaymentTip paymentTip2;
        Integer numLIZIZ;
        PaymentMethod paymentMethod3 = this.LLJLLIL;
        if (paymentMethod3 != null && paymentMethod3.LJJJZ()) {
            C12ES.LJIILL(0, this.LLJJIII.findViewById(R.id.z5c));
            TextView textView = (TextView) this.LLJJIII.findViewById(R.id.z5c);
            PaymentMethod paymentMethod4 = this.LLJLLIL;
            textView.setText(paymentMethod4 != null ? paymentMethod4.installationTips : null);
            PaymentMethod paymentMethod5 = this.LLJLLIL;
            if (paymentMethod5 == null || (paymentTip2 = paymentMethod5.paymentTip) == null || (numLIZIZ = PaymentTip.LIZIZ(paymentTip2, C960203pA.LIZIZ(getContext()), 2)) == null) {
                return;
            }
            ((TextView) this.LLJJIII.findViewById(R.id.z5c)).setTextColor(numLIZIZ.intValue());
            return;
        }
        PaymentMethod paymentMethod6 = this.LLJLLIL;
        if (paymentMethod6 != null) {
            PaymentAppealHelper.LIZ.getClass();
            if (PaymentAppealHelper.LJI(paymentMethod6)) {
                C12ES.LJIILL(0, this.LLJJIII.findViewById(R.id.z5c));
                ((TuxTextView) this.LLJJIII.findViewById(R.id.z5c)).setTextColorRes(R.attr.ug);
                ((TextView) this.LLJJIII.findViewById(R.id.z5c)).setText(PaymentAppealHelper.LIZIZ(paymentMethod6, getContext(), new AwS402S0200000_1(this, paymentMethod6, 57)));
                ((TextView) this.LLJJIII.findViewById(R.id.z5c)).setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        PaymentViewModel paymentViewModel = this.LLJJIJIIJIL;
        PaymentTip paymentTipVR2 = paymentViewModel != null ? paymentViewModel.vR2(this.LLJLLIL) : null;
        if (paymentTipVR2 != null && ((this.LLJL || (((paymentMethod = this.LLJLLIL) != null && (availability = paymentMethod.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE)) || this.LLJZ || ((paymentMethod2 = this.LLJLLIL) != null && (paymentTip = paymentMethod2.paymentTip) != null && Intrinsics.LJFF(paymentTip.showDescriptionDefault, Boolean.TRUE)))) && C123100dR.LIZ(paymentTipVR2.tips) && EventBus.LIZLLL().LJFF(C03ZN.class) == null)) {
            C12ES.LJIILL(0, this.LLJJIII.findViewById(R.id.z5c));
            ((TextView) this.LLJJIII.findViewById(R.id.z5c)).setText(paymentTipVR2.tips);
            Integer numLIZIZ2 = PaymentTip.LIZIZ(paymentTipVR2, C960203pA.LIZIZ(getContext()), 2);
            if (numLIZIZ2 != null) {
                ((TextView) this.LLJJIII.findViewById(R.id.z5c)).setTextColor(numLIZIZ2.intValue());
                return;
            } else {
                ((TuxTextView) this.LLJJIII.findViewById(R.id.z5c)).setTextColorRes(R.attr.vd);
                return;
            }
        }
        C03SE c03se = C03PI.LJIJI;
        PaymentMethod paymentMethod7 = this.LLJLLIL;
        PaymentViewModel paymentViewModel2 = this.LLJJIJIIJIL;
        PaymentMethodsData paymentMethodsData3 = paymentViewModel2 != null ? paymentViewModel2.LLJJIJIL : null;
        c03se.getClass();
        if (!C03SE.LJJIIZI(paymentMethod7, paymentMethodsData3)) {
            C0H1U.LIZIZ(this.LLJJIII.findViewById(R.id.z5c));
            return;
        }
        C12ES.LJIILL(0, this.LLJJIII.findViewById(R.id.z5c));
        if (paymentTipVR2 != null) {
            Integer numLIZIZ3 = PaymentTip.LIZIZ(paymentTipVR2, C960203pA.LIZIZ(getContext()), 2);
            if (numLIZIZ3 != null) {
                ((TextView) this.LLJJIII.findViewById(R.id.z5c)).setTextColor(numLIZIZ3.intValue());
            } else {
                ((TuxTextView) this.LLJJIII.findViewById(R.id.z5c)).setTextColorRes(R.attr.vd);
            }
        }
        PaymentViewModel paymentViewModel3 = this.LLJJIJIIJIL;
        String priceStr = (paymentViewModel3 == null || (paymentMethodsData2 = paymentViewModel3.LLJJIJIL) == null || (creditInfo2 = paymentMethodsData2.creditInfo) == null || (amount = creditInfo2.creditBalanceAmount) == null) ? null : amount.getPriceStr();
        PaymentViewModel paymentViewModel4 = this.LLJJIJIIJIL;
        if (paymentViewModel4 != null && (paymentMethodsData = paymentViewModel4.LLJJIJIL) != null && (creditInfo = paymentMethodsData.creditInfo) != null) {
            strLIZ = creditInfo.LIZ(getContext());
        }
        if (!C123100dR.LIZ(priceStr)) {
            C0H1U.LIZIZ(this.LLJJIII.findViewById(R.id.z5c));
            return;
        }
        if (C123100dR.LIZ(strLIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" (");
            sbLIZ.append(strLIZ);
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        TextView textView2 = (TextView) this.LLJJIII.findViewById(R.id.z5c);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(priceStr);
        sbLIZ2.append(strLIZIZ);
        textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJ() {
        String strLIZ;
        if (!this.LLJL || getIconEditFromXml().getVisibility() == 0 || (strLIZ = C03ZO.LIZ(this.LLJLLIL)) == null || strLIZ.length() <= 0) {
            C0H1U.LIZIZ(getPayPromotionDiscountFromXml());
        } else {
            getPayPromotionDiscountFromXml().setText(strLIZ);
            C12ES.LJIILL(0, getPayPromotionDiscountFromXml());
        }
    }

    public final TuxTextView getExtraInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hiq);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getIcNoticeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.juh);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIcToolTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jui);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxt);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getIconsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k5c);
            this.LLJJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getIvArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l5g);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPayPromotionDiscountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q4e);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final CardView getPrimaryLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ru0);
            this.LLJ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final LinearLayout getPromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.saz);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LLILLJJLI = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final TuxTextView getServiceFeeInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uts);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsx);
            this.LLJILLL = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonTokoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsy);
            this.LLJJ = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final TuxTextView getTvBindFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2i);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvCcdcCardTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2s);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4s);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
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
        return this.LLJZ;
    }

    public final Function2<PaymentMethod, Function1<? super String, Unit>, Unit> getGetBindUrl() {
        return this.LLJJJJ;
    }

    public final Function1<String, Unit> getOnCheckedListener() {
        return this.LLJJJJJIL;
    }

    public final Function2<PaymentMethod, InterestFeePromotion, Unit> getOnInterestingFeePromotionClickListener() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final Function1<PaymentMethod, Unit> getOnPromotionClickListener() {
        return this.LLJJL;
    }

    public final String getPaySource() {
        return this.LLJJJIL;
    }

    public final C03WH getPaymentLogger() {
        return this.LLJJJ;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LLJLLIL;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.LLJJIJIIJIL;
    }

    public final String getSaleRegion() {
        return this.LLJLIL;
    }

    public final ButtonStyle getStyle() {
        return this.LLJLLL;
    }

    public final ECRichText getSubTitleContent() {
        return this.LLJJIJI;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.LLJJIJIL;
    }

    public final boolean getUseCcdcRadio() {
        return this.LLJLL;
    }

    public final boolean getUseDefaultRadio() {
        return this.LLJZIJLIL;
    }

    public C03Z4(Context context) {
        super(context, null, 0);
        this.LLJJJJJIL = AFwS228S0000000_1.get$arr$(573);
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(310));
        this.LLJJL = AFwS228S0000000_1.get$arr$(574);
        this.LLJZIJLIL = true;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setBackgroundColor(C960203pA.LIZ(R.attr.c3, context));
        this.LLJJIII = C786410Ut5.LJLLJ(context, R.layout.b2z, this);
        getRadioFromXml().setBackground(null);
        this.LLL = new ARunnableS101S0100000_1((Object) this, 41);
    }

    private final void setSwitchChecked(boolean z) {
        C03WH c03wh;
        String strLJJIIZ;
        getSwitchButtonFromXml().setChecked(z);
        getSwitchButtonTokoFromXml().setChecked(z);
        if ((getSwitchButtonFromXml().getVisibility() == 0 || getSwitchButtonTokoFromXml().getVisibility() == 0) && (c03wh = this.LLJJJ) != null) {
            PaymentMethod paymentMethod = this.LLJLLIL;
            if (paymentMethod != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            c03wh.LJJ(null, strLJJIIZ, z);
        }
    }

    public final void LIZJ(boolean z) {
        if (!z) {
            C0H1U.LIZIZ(this.LLJJIII.findViewById(R.id.wsx));
            C0H1U.LIZIZ(this.LLJJIII.findViewById(R.id.wsy));
        } else if (this.LLJLLL == ButtonStyle.TOKO_STYLE) {
            C12ES.LJIILL(0, this.LLJJIII.findViewById(R.id.wsy));
        } else {
            C12ES.LJIILL(0, this.LLJJIII.findViewById(R.id.wsx));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[PHI: r4
      0x0041: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:28:0x00bb, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.Boolean r18) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Z4.LIZLLL(java.lang.Boolean):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInstallmentPlanViewAllClickEvent(C03ZN c03zn) {
        String str;
        PaymentMethod paymentMethod = this.LLJLLIL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, c03zn.LIZ)) {
            C0H1U.LIZIZ(this.LLJJIII.findViewById(R.id.z5c));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPaymentChooseSaveEvent(C7830034a c7830034a) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPaymentChooseSaveEvent: ");
        sbLIZ.append(c7830034a.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        getMainHandler().removeCallbacks(this.LLL);
        C786410Ut5.LJLIIL(10L, getMainHandler(), this.LLL);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentPromotionUIUpdateEvent(C03ZJ c03zj) {
        if (C899503fN.LIZIZ(c03zj.LIZ, this.LLJLLIL)) {
            LIZLLL(c03zj.LIZIZ);
        }
    }

    public final void setAlwaysShowPaymentTips(boolean z) {
        this.LLJZ = z;
    }

    public final void setChecked(boolean z) {
        String str;
        PaymentMethod paymentMethod;
        this.LLJL = z;
        getRadioFromXml().setChecked(z);
        setSwitchChecked(z);
        LIZ();
        LIZIZ();
        if (!z) {
            EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
            PaymentMethod paymentMethod2 = this.LLJLLIL;
            if (paymentMethod2 != null) {
                str = paymentMethod2.id;
            } else {
                str = null;
            }
            if (C03S0.LIZ(str) && (paymentMethod = this.LLJLLIL) != null) {
                paymentMethod.LJIIJJI = null;
            }
        }
        LIZLLL(null);
        LJ();
    }

    public final void setExtraInfoFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setGetBindUrl(Function2<? super PaymentMethod, ? super Function1<? super String, Unit>, Unit> function2) {
        this.LLJJJJ = function2;
    }

    public final void setIcNoticeFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setIcToolTipsFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setIconEditFromXml(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setIconsContainerFromXml(LinearLayout linearLayout) {
        this.LLJJI = linearLayout;
    }

    public final void setIvArrowFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setOnCheckedListener(Function1<? super String, Unit> function1) {
        this.LLJJJJJIL = function1;
    }

    public final void setOnInterestingFeePromotionClickListener(Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> function2) {
        this.LLJJLIIIJLLLLLLLZ = function2;
    }

    public final void setOnPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLJJL = function1;
    }

    public final void setPayPromotionDiscountFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setPaySource(String str) {
        this.LLJJJIL = str;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLJJJ = c03wh;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r13) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Z4.setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.LLJJIJIIJIL = paymentViewModel;
    }

    public final void setPrimaryLabelFromXml(CardView cardView) {
        this.LLJ = cardView;
    }

    public final void setPromotionLayoutFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LLILLJJLI = c1841350y17;
    }

    public final void setSaleRegion(String str) {
        this.LLJLIL = str;
    }

    public final void setServiceFeeInfoFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLJLLL = buttonStyle;
        if (buttonStyle == ButtonStyle.TOKO_STYLE) {
            getTvBindFromXml().setTextColorRes(R.attr.dt);
            getRadioFromXml().LIZ(C0HEZ.LIZ(R.attr.dt, getContext()), C0HEZ.LIZ(R.attr.a01, getContext()));
        }
    }

    public final void setSubTitleContent(ECRichText eCRichText) {
        this.LLJJIJI = eCRichText;
    }

    public final void setSwitchButtonFromXml(C21411818qq c21411818qq) {
        this.LLJILLL = c21411818qq;
    }

    public final void setSwitchButtonTokoFromXml(C21411818qq c21411818qq) {
        this.LLJJ = c21411818qq;
    }

    public final void setTrackParams(HashMap<String, Object> map) {
        this.LLJJIJIL = map;
    }

    public final void setTvBindFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTvCcdcCardTipFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setUseCcdcRadio(boolean z) {
        this.LLJLL = z;
    }

    public final void setUseDefaultRadio(boolean z) {
        if (z) {
            LIZJ(false);
        } else {
            C0H1U.LIZIZ(this.LLJJIII.findViewById(R.id.sp_));
            LIZJ(true);
        }
    }
}
