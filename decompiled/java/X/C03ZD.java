package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZD extends FrameLayout implements InterfaceC884803d0, C03ZU {
    public static final /* synthetic */ int LLLFZ = 0;
    public LinearLayout LL;
    public C426770GoN LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public C874903bP LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public Function1<? super List<PaymentElement>, Unit> LLJI;
    public PaymentMethod LLJIJIL;
    public ElementDTO LLJILJIL;
    public Function2<? super InstallmentPlan, ? super Boolean, Unit> LLJILJILJ;
    public Map<String, String> LLJILLL;
    public Function0<Unit> LLJJ;
    public InstallmentPlan LLJJI;
    public Function1<? super InstallmentPlan, Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;
    public Function1<? super PaymentMethod, Unit> LLJJIJIIJIL;
    public InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> LLJJIJIL;
    public Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> LLJJJ;
    public Function0<Unit> LLJJJIL;
    public C03WH LLJJJJ;
    public PaymentViewModel LLJJJJJIL;
    public ButtonStyle LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C03ZQ LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public final Set<String> LLLFF;
    public CciCashierDisplayType LLLFFI;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r6.getPaymentMethod()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = r6.LLJJI
            r2.getClass()
            java.lang.String r4 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper.LJIILIIL(r0, r1)
            boolean r0 = r6.LLL
            r5 = 0
            if (r0 != 0) goto L6a
            X.03SY r1 = X.C03SY.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.getPaymentMethod()
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.id
        L1e:
            r1.getClass()
            boolean r0 = X.C03SY.LJIJ(r0)
            if (r0 != 0) goto L6a
            r2 = 0
        L28:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r6.getPaymentMethod()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = r6.LLJJI
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper.LJIIIZ(r0, r1)
            if (r2 != 0) goto L36
            if (r0 == 0) goto L6c
        L36:
            if (r4 == 0) goto L6c
            int r0 = r4.length()
            if (r0 == 0) goto L6c
            com.bytedance.tux.input.TuxTextView r3 = r6.getTvAdditionalClarificationFromXml()
            X.C12ES.LJIILL(r5, r3)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            boolean r0 = r6.LLJLILLLLZIIL
            if (r0 == 0) goto L52
            r5 = 44
        L52:
            int r0 = X.C679280Qkg.LIZ(r5)
            r2.setMarginStart(r0)
            r0 = 8
            int r0 = X.C679280Qkg.LIZ(r0)
            r2.topMargin = r0
            X.C786410Ut5.R6(r3, r2)
            r3.setText(r4)
            return
        L68:
            r0 = 0
            goto L1e
        L6a:
            r2 = 1
            goto L28
        L6c:
            com.bytedance.tux.input.TuxTextView r0 = r6.getTvAdditionalClarificationFromXml()
            X.C0H1U.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZD.LIZJ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fb, code lost:
    
        if (r6 != false) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b A[PHI: r10
      0x010b: PHI (r10v3 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo) = 
      (r10v0 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo)
      (r10v11 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo)
     binds: [B:81:0x010a, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 1845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZD.LJ():void");
    }

    @Override // X.C03ZU
    public LinearLayout getBreakdownContainer() {
        return (LinearLayout) this.LLJ.getValue();
    }

    @Override // X.C03ZU
    public GridLayout getGridInstallmentPlanContainer() {
        return (GridLayout) this.LLIZLLLIL.getValue();
    }

    @Override // X.C03ZU
    public LinearLayout getLinearInstallmentPlanContainer() {
        return (LinearLayout) this.LLIZ.getValue();
    }

    public final LinearLayout getLlViewMoreInstallmentPlansFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nad);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C874903bP getPaymentUpgradeBannerView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q5v);
            this.LLILZLL = (C874903bP) callbackFindViewById;
        }
        return (C874903bP) callbackFindViewById;
    }

    public final C426770GoN getPromotionAlertDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_w);
            this.LLILLJJLI = (C426770GoN) callbackFindViewById;
        }
        return (C426770GoN) callbackFindViewById;
    }

    public final TuxIconView getShowAllInstallmentBottomArrow() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jz2);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getShowAllInstallmentRightArrow() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k3k);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvAdditionalClarificationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z25);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C03ZU
    public ViewGroup getInstallmentPlanContainer() {
        return C03ZS.LIZ[getDisplayMode().ordinal()] == 1 ? getGridInstallmentPlanContainer() : getLinearInstallmentPlanContainer();
    }

    public final CciCashierDisplayType getCciCashierDisplayType() {
        return this.LLLFFI;
    }

    @Override // X.C03ZU
    public C03ZQ getDisplayMode() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLJILJIL;
    }

    public final Map<String, String> getInstallmentBreakdownIcons() {
        return this.LLJILLL;
    }

    public final boolean getInstallmentPlanNeedsMargin() {
        return this.LLJLILLLLZIIL;
    }

    public final Function2<InstallmentPlan, Boolean, Unit> getOnInstallmentPlanCheckChanged() {
        return this.LLJILJILJ;
    }

    public final Function1<InstallmentPlan, Unit> getOnInstallmentPlanShow() {
        return this.LLJJIII;
    }

    public final InterfaceC1631620sYq<PaymentMethod, InstallmentPlan, Boolean, Unit> getOnInstallmentPromotionClickListener() {
        return this.LLJJIJIL;
    }

    public final Function2<PaymentMethod, InterestFeePromotion, Unit> getOnInterestingFeePromotionClickListener() {
        return this.LLJJJ;
    }

    public final Function1<PaymentMethod, Unit> getOnPromotionClickListener() {
        return this.LLJJIJIIJIL;
    }

    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJI;
    }

    public final Function0<Unit> getOnViewMoreInstallmentPlansClickListener() {
        return this.LLJJ;
    }

    public final Function0<Unit> getOnViewMoreInstallmentPlansShow() {
        return this.LLJJIJI;
    }

    public final Function0<Unit> getOnViewMoreSeparateInstallmentPlansClickListener() {
        return this.LLJJJIL;
    }

    public final boolean getOptSequence() {
        return this.LLJLLIL;
    }

    public final C03WH getPaymentLogger() {
        return this.LLJJJJ;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LLJIJIL;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.LLJJJJJIL;
    }

    public final boolean getSelectedFirstPlanByDefault() {
        return this.LLJLIL;
    }

    public final InstallmentPlan getSelectedInstallmentPlan() {
        return this.LLJJI;
    }

    public final boolean getShowAllInstallment() {
        return this.LLJL;
    }

    public final ButtonStyle getStyle() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        return C13BV.INSTANCE;
    }

    public C03ZD(Context context) {
        int i;
        super(context, null, 0);
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1674));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1678));
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1677));
        this.LLJI = AFwS228S0000000_1.get$arr$(733);
        this.LLJILJILJ = AFwS284S0000000_1.get$arr$(48);
        this.LLJJ = AFwS185S0000000_1.get$arr$(464);
        this.LLJJIJI = AFwS185S0000000_1.get$arr$(465);
        this.LLJJIJIIJIL = AFwS228S0000000_1.get$arr$(732);
        this.LLJJJIL = AFwS185S0000000_1.get$arr$(466);
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = true;
        this.LLJLL = C03ZQ.NORMAL;
        this.LLJLLIL = true;
        if (!C870903al.LIZ() && !this.LLJL) {
            i = 3;
        } else {
            i = 100;
        }
        this.LLJLLL = i;
        this.LLLFF = new LinkedHashSet();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C0H1U.LIZJ(R.layout.aql, this, true);
    }

    private final void setInstallmentPlansDisplayNum(int i) {
        this.LLJLLL = i;
    }

    public final void LIZLLL(boolean z) {
        String str;
        String str2;
        boolean z2;
        String str3;
        Boolean bool;
        C03SY c03sy = C03SY.LIZ;
        CciCashierDisplayType cciCashierDisplayType = this.LLLFFI;
        PaymentMethod paymentMethod = getPaymentMethod();
        EnterParams enterParams = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        c03sy.getClass();
        boolean zLIZLLL = C03SY.LIZLLL(cciCashierDisplayType, str);
        PaymentMethod paymentMethod2 = getPaymentMethod();
        boolean z3 = true;
        if (paymentMethod2 == null || !paymentMethod2.LJJJJI()) {
            PaymentMethod paymentMethod3 = getPaymentMethod();
            if (paymentMethod3 != null) {
                str2 = paymentMethod3.id;
            } else {
                str2 = null;
            }
            if (!EcomMergeBalanceAndInstallmentSettings.LIZ(str2) && !zLIZLLL) {
                PaymentMethod paymentMethod4 = getPaymentMethod();
                if (paymentMethod4 != null && paymentMethod4.LJJJLZIJ()) {
                    PaymentMethod paymentMethod5 = getPaymentMethod();
                    if (paymentMethod5 != null) {
                        paymentMethod5.LJJIFFI = false;
                    }
                    this.LLJJJIL.invoke();
                    return;
                }
                PaymentMethod paymentMethod6 = getPaymentMethod();
                if (paymentMethod6 != null) {
                    paymentMethod6.LJJI = true;
                }
                PaymentMethod paymentMethod7 = getPaymentMethod();
                if (paymentMethod7 != null) {
                    paymentMethod7.LJJIFFI = false;
                }
                C03SE c03se = C03PI.LJIJI;
                PaymentMethod paymentMethod8 = getPaymentMethod();
                c03se.getClass();
                if (C03SE.LJIIJ(paymentMethod8) && EcPaymentIndependentPriceConfigSettings.LIZIZ() && ((bool = EcPaymentIndependentPriceConfigSettings.LIZJ().cashierSupportSeparateSelect) == null || bool.booleanValue())) {
                    z2 = true;
                } else {
                    z2 = false;
                    if (this.LLJJLIIIJLLLLLLLZ) {
                        C864903Zn c864903Zn = C864903Zn.LIZ;
                        PaymentMethod paymentMethod9 = getPaymentMethod();
                        if (paymentMethod9 != null) {
                            str3 = paymentMethod9.id;
                        } else {
                            str3 = null;
                        }
                        c864903Zn.getClass();
                        if (C864903Zn.LIZ(str3) && C864903Zn.LIZIZ().enabledPaymentFragment) {
                            z2 = true;
                        }
                    }
                }
                PaymentViewModel paymentViewModel = this.LLJJJJJIL;
                if (paymentViewModel != null) {
                    enterParams = paymentViewModel.LLJ;
                }
                if (!C03WK.LIZ(enterParams) || !C03XU.LIZIZ().enableSeparateSelection) {
                    z3 = false;
                }
                if (C03ZP.LIZ[getDisplayMode().ordinal()] == 2) {
                    LJ();
                    return;
                } else if (z && (z2 || z3)) {
                    this.LLJJJIL.invoke();
                    return;
                } else {
                    LJ();
                    return;
                }
            }
        }
        this.LLJJJIL.invoke();
    }

    public final void setCciCashierDisplayType(CciCashierDisplayType cciCashierDisplayType) {
        this.LLLFFI = cciCashierDisplayType;
    }

    public void setDisplayMode(C03ZQ c03zq) {
        this.LLJLL = c03zq;
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LLJILJIL = elementDTO;
    }

    public final void setInInstallmentPlanPage(boolean z) {
        this.LLJJL = z;
    }

    public final void setInPaymentFragmentPage(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setInstallmentBreakdownIcons(Map<String, String> map) {
        this.LLJILLL = map;
    }

    public final void setInstallmentPlanNeedsMargin(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setLlViewMoreInstallmentPlansFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setOnInstallmentPlanCheckChanged(Function2<? super InstallmentPlan, ? super Boolean, Unit> function2) {
        this.LLJILJILJ = function2;
    }

    public final void setOnInstallmentPlanShow(Function1<? super InstallmentPlan, Unit> function1) {
        this.LLJJIII = function1;
    }

    public final void setOnInstallmentPromotionClickListener(InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJJIJIL = interfaceC1631620sYq;
    }

    public final void setOnInterestingFeePromotionClickListener(Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> function2) {
        this.LLJJJ = function2;
    }

    public final void setOnPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLJJIJIIJIL = function1;
    }

    @Override // X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setOnViewMoreInstallmentPlansClickListener(Function0<Unit> function0) {
        this.LLJJ = function0;
    }

    public final void setOnViewMoreInstallmentPlansShow(Function0<Unit> function0) {
        this.LLJJIJI = function0;
    }

    public final void setOnViewMoreSeparateInstallmentPlansClickListener(Function0<Unit> function0) {
        this.LLJJJIL = function0;
    }

    public final void setOptSequence(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLJJJJ = c03wh;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJIJIL = paymentMethod;
    }

    public final void setPaymentUpgradeBannerView(C874903bP c874903bP) {
        this.LLILZLL = c874903bP;
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.LLJJJJJIL = paymentViewModel;
    }

    public final void setPromotionAlertDotFromXml(C426770GoN c426770GoN) {
        this.LLILLJJLI = c426770GoN;
    }

    public final void setSelectedFirstPlanByDefault(boolean z) {
        this.LLJLIL = z;
    }

    public final void setSelectedInstallmentPlan(InstallmentPlan installmentPlan) {
        this.LLJJI = installmentPlan;
    }

    public final void setShowAllInstallment(boolean z) {
        this.LLJL = z;
    }

    public final void setShowAllInstallmentBottomArrow(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setShowAllInstallmentRightArrow(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLJJJJLIIL = buttonStyle;
    }

    public final void setTvAdditionalClarificationFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    @Override // X.C03ZU
    public final void LIZIZ(C03ZF c03zf, int i) {
        if (C03ZP.LIZ[getDisplayMode().ordinal()] == 2) {
            if (i % 2 == 0) {
                C426750GoL.LJIIIZ(c03zf, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 19);
            } else {
                C426750GoL.LJIIIZ(c03zf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 22);
            }
        }
    }

    @Override // X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        Integer num;
        PaymentViewModel paymentViewModel;
        PaymentMethodsData paymentMethodsData;
        List<InstallmentInfo> list2;
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        PaymentMethodsData paymentMethodsData2 = null;
        if ((installmentInfo != null || ((list2 = paymentMethod.installmentInfoList) != null && (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2)) != null)) && (num = installmentInfo.installmentFoldNum) != null) {
            int iIntValue = num.intValue();
            if (!this.LLJL) {
                setInstallmentPlansDisplayNum(iIntValue);
            }
        }
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        PaymentViewModel paymentViewModel2 = this.LLJJJJJIL;
        if (paymentViewModel2 != null) {
            paymentMethodsData2 = paymentViewModel2.LLJJIJIL;
        }
        activateHelper.getClass();
        this.LLJZIJLIL = ActivateHelper.LJ(paymentMethod, paymentMethodsData2);
        this.LLL = ActivateHelper.LIZLLL(paymentMethod);
        LJ();
        PaymentMethod paymentMethod2 = getPaymentMethod();
        if (paymentMethod2 == null || !paymentMethod2.LJJLIIIJJIZ() || (((paymentViewModel = this.LLJJJJJIL) != null && (paymentMethodsData = paymentViewModel.LLJJIJIL) != null && paymentMethodsData.LIZJ()) || !this.LLJJLIIIJLLLLLLLZ)) {
            C874903bP paymentUpgradeBannerView = getPaymentUpgradeBannerView();
            if (paymentUpgradeBannerView != null) {
                C0H1U.LIZIZ(paymentUpgradeBannerView);
                return;
            }
            return;
        }
        C874903bP paymentUpgradeBannerView2 = getPaymentUpgradeBannerView();
        if (paymentUpgradeBannerView2 != null) {
            C12ES.LJIILL(0, paymentUpgradeBannerView2);
        }
        C874903bP paymentUpgradeBannerView3 = getPaymentUpgradeBannerView();
        if (paymentUpgradeBannerView3 == null) {
            return;
        }
        paymentUpgradeBannerView3.LIZ(getPaymentMethod(), "payment_method");
    }
}
