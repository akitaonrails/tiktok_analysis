package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionConfigModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsBonusPromotionSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZB extends FrameLayout implements C03ZU {
    public LinearLayout LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public CardView LLILZ;
    public TuxIconView LLILZIL;
    public ConstraintLayout LLILZLL;
    public C1841350y17 LLIZ;
    public LinearLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C884703cz LLJILJILJ;
    public TuxTextView LLJILLL;
    public ConstraintLayout LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public LinearLayout LLJJIJI;
    public C426770GoN LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public TuxTextView LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public C03ZM LLJZIJLIL;
    public TuxTextView LLL;
    public C21411818qq LLLF;
    public C21411818qq LLLFF;
    public TuxTextView LLLFFI;
    public C0HZQ LLLFZ;
    public LinearLayout LLLI;
    public TuxIconView LLLII;
    public TuxIconView LLLIIII;
    public TuxTextView LLLIIIIL;
    public C874903bP LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public C03ZQ LLLILZJ;
    public final C01GW LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public HashMap<String, Object> LLLJIL;
    public Function0<Unit> LLLJL;
    public Function1<? super PaymentMethod, Unit> LLLL;
    public Function0<Unit> LLLLII;
    public Function0<Unit> LLLLIIIILLL;
    public Function0<Unit> LLLLIIL;
    public Function1<? super String, Unit> LLLLIILL;
    public Function2<? super InstallmentPlan, ? super Boolean, Unit> LLLLIILLL;
    public Function1<? super PaymentMethod, Unit> LLLLIL;
    public boolean LLLLILI;
    public Function1<? super Boolean, Unit> LLLLJ;
    public Function1<? super PaymentMethod, Unit> LLLLJI;
    public Function1<? super PaymentMethod, Unit> LLLLL;
    public Function1<? super PaymentMethod, Unit> LLLLLIL;
    public InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> LLLLLILLIL;
    public Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> LLLLLJIL;
    public PaymentInfo LLLLLJLJLL;
    public Boolean LLLLLL;
    public boolean LLLLLLIL;
    public int LLLLLLJ;
    public PaymentMethod LLLLLLL;
    public String LLLLLLLLL;
    public OrderSubmitAssemViewModel LLLLLLLLLL;
    public MiniOspViewModel LLLLLLLZIL;
    public PaymentInfoViewModel LLLLLLZ;
    public final boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public final int LLLLLZL;
    public ButtonStyle LLLLZ;
    public final C01GW LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;

    public final int getTopPadding() {
        return 0;
    }

    private final TuxIconView getIcToolTips() {
        return (TuxIconView) this.LLLLZI.getValue();
    }

    private final C812203Fg getLayoutActivePromotion() {
        return (C812203Fg) this.LLLILZLLLI.getValue();
    }

    private final TuxTextView getTvRemainingAmount() {
        return (TuxTextView) this.LLLIL.getValue();
    }

    public final void LIZLLL() {
        PaymentMethod paymentMethod;
        C864903Zn c864903Zn = C864903Zn.LIZ;
        PaymentMethod paymentMethod2 = this.LLLLLLL;
        String str = paymentMethod2 != null ? paymentMethod2.id : null;
        c864903Zn.getClass();
        if ((!C864903Zn.LIZ(str) || !C864903Zn.LIZIZ().ospNotExpand) && (paymentMethod = this.LLLLLLL) != null) {
            paymentMethod.LJJI = true;
        }
        PaymentMethod paymentMethod3 = this.LLLLLLL;
        if (paymentMethod3 != null) {
            paymentMethod3.LJJIFFI = false;
        }
        if (C03ZR.LIZ[getDisplayMode().ordinal()] == 1) {
            LJIIJJI(true);
            return;
        }
        C03SE c03se = C03PI.LJIJI;
        PaymentMethod paymentMethod4 = this.LLLLLLL;
        c03se.getClass();
        if (C03SE.LJIIJ(paymentMethod4)) {
            this.LLLLIIL.invoke();
        } else {
            LJIIJJI(true);
        }
    }

    public final boolean LJIIIIZZ() {
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        BindInfo bindInfo;
        String str;
        PaymentMethod paymentMethod3 = this.LLLLLLL;
        if (paymentMethod3 != null && paymentMethod3.LJJLIIIJLLLLLLLZ()) {
            return true;
        }
        PaymentMethod paymentMethod4 = this.LLLLLLL;
        if (!Intrinsics.LJFF(paymentMethod4 != null ? paymentMethod4.id : null, "pm_pi_ccdc_all") && ((paymentMethod = this.LLLLLLL) == null || (bindInfo = paymentMethod.bindInfo) == null || (str = bindInfo.buttonText) == null || str.length() == 0)) {
            PaymentMethod paymentMethod5 = this.LLLLLLL;
            if (!Intrinsics.LJFF(paymentMethod5 != null ? paymentMethod5.id : null, "pm_pi_atmcard_all")) {
                C03SY c03sy = C03SY.LIZ;
                PaymentMethod paymentMethod6 = this.LLLLLLL;
                String str2 = paymentMethod6 != null ? paymentMethod6.id : null;
                c03sy.getClass();
                if (!C03SY.LJIIZILJ(str2) && ((paymentMethod2 = this.LLLLLLL) == null || !Intrinsics.LJFF(paymentMethod2.id, "pm_pi_dd_directdebit_c_d"))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJIIL():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJIILIIL():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[PHI: r5 r8
      0x007d: PHI (r5v8 boolean) = (r5v0 boolean), (r5v0 boolean), (r5v9 boolean) binds: [B:72:0x019f, B:74:0x01a5, B:25:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r8v9 java.lang.String) = (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v10 java.lang.String) binds: [B:72:0x019f, B:74:0x01a5, B:25:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJIIZILJ():void");
    }

    public final void LJIJ() {
        C03ZF c03zf;
        C03ZF c03zf2;
        if (this.LLLIZZ) {
            for (View view : new C1076804Ja(getLinearInstallmentPlanContainer(), 2)) {
                if ((view instanceof C03ZF) && (c03zf2 = (C03ZF) view) != null) {
                    c03zf2.setOnInstallmentPromotionClickListener(this.LLLLLILLIL);
                    c03zf2.setOnInterestingFeePromotionClickListener(this.LLLLLJIL);
                }
            }
            for (View view2 : new C1076804Ja(getGridInstallmentPlanContainer(), 3)) {
                if ((view2 instanceof C03ZF) && (c03zf = (C03ZF) view2) != null) {
                    c03zf.setOnInstallmentPromotionClickListener(this.LLLLLILLIL);
                    c03zf.setOnInterestingFeePromotionClickListener(this.LLLLLJIL);
                }
            }
        }
    }

    public final TuxIconView getArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b8t);
            this.LLJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final BillInfoData getBillInfoData() {
        MiniOspViewModel miniOspViewModel = this.LLLLLLLZIL;
        if (miniOspViewModel != null) {
            return miniOspViewModel.LLIZ;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLLLLLLLLL;
        if (orderSubmitAssemViewModel != null) {
            return orderSubmitAssemViewModel.LLJJI;
        }
        return null;
    }

    @Override // X.C03ZU
    public LinearLayout getBreakdownContainer() {
        return (LinearLayout) this.LLLILZ.getValue();
    }

    public final C0HZQ getBtnSaveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cme);
            this.LLLFZ = (C0HZQ) callbackFindViewById;
        }
        return (C0HZQ) callbackFindViewById;
    }

    public final ConstraintLayout getCheckContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dpx);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    @Override // X.C03ZU
    public GridLayout getGridInstallmentPlanContainer() {
        return (GridLayout) this.LLLIILIL.getValue();
    }

    public final TuxIconView getIcNoticeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.juh);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconEditSEAFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iconEditSEA);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconPaymentTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jy3);
            this.LLJLILLLLZIIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getIconsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k5c);
            this.LLLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final SmartImageView getIvPaymentIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l6y);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ConstraintLayout getLayoutPaymentAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m79);
            this.LLJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    @Override // X.C03ZU
    public LinearLayout getLinearInstallmentPlanContainer() {
        return (LinearLayout) this.LLLIIL.getValue();
    }

    public final LinearLayout getLlBalanceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n9x);
            this.LLJJJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlPaymentItemFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_p);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlPaymentTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_r);
            this.LLJL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlPaymentTipStyleLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_s);
            this.LLJJJJJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlSubPaymentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.na7);
            this.LLJJIJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlViewMoreInstallmentPlansFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nad);
            this.LLJJIJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlViewMoreSubPaymentsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nae);
            this.LLJJJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C03ZM getLvBindAndPayFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ntk);
            this.LLJZIJLIL = (C03ZM) callbackFindViewById;
        }
        return (C03ZM) callbackFindViewById;
    }

    public final C874903bP getPaymentUpgradeBannerView() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q5v);
            this.LLLIIIL = (C874903bP) callbackFindViewById;
        }
        return (C874903bP) callbackFindViewById;
    }

    public final C426770GoN getPromotionAlertDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_w);
            this.LLJJIJIIJIL = (C426770GoN) callbackFindViewById;
        }
        return (C426770GoN) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LLIZ = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final LinearLayout getSaveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tz8);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getServiceFeeInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uts);
            this.LLJLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getShowAllInstallmentBottomArrow() {
        KeyEvent.Callback callbackFindViewById = this.LLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jz2);
            this.LLLII = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getShowAllInstallmentRightArrow() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k3k);
            this.LLLIIII = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C884703cz getSuperElementFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wpc);
            this.LLJILJILJ = (C884703cz) callbackFindViewById;
        }
        return (C884703cz) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsx);
            this.LLLF = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonTokoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsy);
            this.LLLFF = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final CardView getTagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x0u);
            this.LLILZ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final LinearLayout getTagExtraLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x19);
            this.LLJJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvAdditionalClarificationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z25);
            this.LLLIIIIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvAdditionalTipsStyleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z26);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBalanceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2h);
            this.LLJJJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBindFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2i);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBindNoteFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2j);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBonusPromotionTag() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2l);
            this.LLJLLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvCcdcCardTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2s);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoBelowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z3u);
            this.LLJZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoRightFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tvExtraInfoRight);
            this.LLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4s);
            this.LLJJIII = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentExtraTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z55);
            this.LLJJL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5_);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5b);
            this.LLJLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentTipStyleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5c);
            this.LLJJJJLIIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvSaveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z6k);
            this.LLLFFI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvServiceFeePromotionTag() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z6r);
            this.LLJLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        if (getInstallmentPlanContainer().getVisibility() == 0) {
            C1076804Ja<View> c1076804Ja = new C1076804Ja(getInstallmentPlanContainer(), 0);
            ArrayList<C03ZF> arrayList = new ArrayList();
            for (View view : c1076804Ja) {
                if ((view instanceof C03ZF) && view != null) {
                    arrayList.add(view);
                }
            }
            for (C03ZF c03zf : arrayList) {
                if (c03zf.LIZJ()) {
                    c03zf.setChecked$ecommerce_transaction_release(false);
                }
            }
        }
    }

    public final void LIZJ() {
        if (getLlSubPaymentContainerFromXml().getVisibility() == 0) {
            C1076804Ja c1076804Ja = new C1076804Ja(getLlSubPaymentContainerFromXml(), 1);
            ArrayList<C03ZI> arrayList = new ArrayList();
            Iterator it2 = c1076804Ja.iterator();
            while (true) {
                C1076904Jb c1076904Jb = (C1076904Jb) it2;
                if (!c1076904Jb.hasNext()) {
                    break;
                }
                View view = (View) c1076904Jb.next();
                if ((view instanceof C03ZI) && view != null) {
                    arrayList.add(view);
                }
            }
            for (C03ZI c03zi : arrayList) {
                if (c03zi.getLayoutSubPaymentFromXml().isSelected()) {
                    c03zi.setChecked(false);
                }
            }
        }
    }

    public final void LJ() {
        C0H1U.LIZIZ(getTvPaymentTipStyleFromXml());
        C0H1U.LIZIZ(getTvPaymentExtraTipsFromXml());
        if (this.LLLLLZ) {
            return;
        }
        C0H1U.LIZIZ(getLlPaymentTipStyleLayoutFromXml());
    }

    public final boolean LJII() {
        return getRadioFromXml().isChecked() || getSwitchChecked();
    }

    public final boolean LJIIIZ() {
        List<PaymentMethod> list;
        if (getIconEditSEAFromXml().getVisibility() != 0) {
            return false;
        }
        PaymentMethod paymentMethod = this.LLLLLLL;
        return paymentMethod == null || (list = paymentMethod.subPaymentMethods) == null || list.isEmpty();
    }

    public final void LJIILLIIL() {
        String strLJIILIIL;
        if (!PipoTtsBonusPromotionSettings.LIZ()) {
            C0H1U.LIZIZ(getTvBonusPromotionTag());
            return;
        }
        PaymentMethod paymentMethod = this.LLLLLLL;
        if (paymentMethod == null || (strLJIILIIL = paymentMethod.LJIILIIL(LJII())) == null || strLJIILIIL.length() <= 0) {
            C0H1U.LIZIZ(getTvBonusPromotionTag());
            return;
        }
        C12ES.LJIILL(0, getTagExtraLayoutFromXml());
        C12ES.LJIILL(0, getTvBonusPromotionTag());
        C03SE.LJJIJL(C03PI.LJIJI, strLJIILIIL, getContext(), getTvBonusPromotionTag(), LJII(), this.LLLLLLL, new AwS580S0100000_1(this, 38));
    }

    public final void LJIJI() {
        String strLIZ;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        if (LJII() && (((paymentMethod = this.LLLLLLL) == null || !paymentMethod.LJJJI()) && (paymentMethod2 = this.LLLLLLL) != null && paymentMethod2.LJJJJL())) {
            C03SE c03se = C03PI.LJIJI;
            PaymentInfo paymentInfo = this.LLLLLJLJLL;
            c03se.getClass();
            if (C03SE.LJIL(null, paymentInfo)) {
                C0H1U.LIZIZ(getTvExtraInfoRightFromXml());
                return;
            }
        }
        if (!LJII() || LJIIIZ() || (strLIZ = C03ZO.LIZ(this.LLLLLLL)) == null || strLIZ.length() <= 0) {
            C0H1U.LIZIZ(getTvExtraInfoRightFromXml());
        } else {
            C12ES.LJIILL(0, getTvExtraInfoRightFromXml());
            getTvExtraInfoRightFromXml().setText(strLIZ);
        }
    }

    public final void LJIJJLI() {
        BillInfoData billInfoData;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        if (getSuperElementFromXml().getVisibility() != 0) {
            PaymentInfo paymentInfo = this.LLLLLJLJLL;
            if (paymentInfo != null) {
                paymentInfo.isValid = Boolean.TRUE;
                return;
            }
            return;
        }
        C884703cz superElementFromXml = getSuperElementFromXml();
        MiniOspViewModel miniOspViewModel = this.LLLLLLLZIL;
        PaymentMethodsData paymentMethodsData = null;
        if (miniOspViewModel != null ? (billInfoData = miniOspViewModel.LLIZ) != null : !((orderSubmitAssemViewModel = this.LLLLLLLLLL) == null || (billInfoData = orderSubmitAssemViewModel.LLJJI) == null)) {
            paymentMethodsData = billInfoData.paymentMethods;
        }
        superElementFromXml.LIZIZ(paymentMethodsData);
    }

    @Override // X.C03ZU
    public ViewGroup getInstallmentPlanContainer() {
        return C03ZS.LIZ[getDisplayMode().ordinal()] == 1 ? getGridInstallmentPlanContainer() : getLinearInstallmentPlanContainer();
    }

    public final boolean getSwitchChecked() {
        return getSwitchButtonFromXml().isChecked() || getSwitchButtonTokoFromXml().isChecked();
    }

    public final boolean getAlwaysShowPaymentTips() {
        return this.LLLLLZ;
    }

    @Override // X.C03ZU
    public C03ZQ getDisplayMode() {
        return this.LLLILZJ;
    }

    public final HashMap<String, Object> getGeneralParams() {
        return this.LLLJIL;
    }

    public final Function1<PaymentMethod, Unit> getOnActivateClickListener() {
        return this.LLLL;
    }

    public final Function1<PaymentMethod, Unit> getOnBonusPromotionClickListener() {
        return this.LLLLLIL;
    }

    public final Function0<Unit> getOnCheckedListener() {
        return this.LLLJL;
    }

    public final Function2<InstallmentPlan, Boolean, Unit> getOnInstallmentPlanClickListener() {
        return this.LLLLIILLL;
    }

    public final InterfaceC1631620sYq<PaymentMethod, InstallmentPlan, Boolean, Unit> getOnInstallmentPromotionClickListener() {
        return this.LLLLLILLIL;
    }

    public final Function2<PaymentMethod, InterestFeePromotion, Unit> getOnInterestingFeePromotionClickListener() {
        return this.LLLLLJIL;
    }

    public final Function1<String, Unit> getOnNoticeClickListener() {
        return this.LLLLIILL;
    }

    public final Function1<PaymentMethod, Unit> getOnPromotionClickListener() {
        return this.LLLLJI;
    }

    public final Function1<Boolean, Unit> getOnSaveClickListener() {
        return this.LLLLJ;
    }

    public final Function1<PaymentMethod, Unit> getOnServiceFeePromotionClickListener() {
        return this.LLLLL;
    }

    public final Function1<PaymentMethod, Unit> getOnSubPaymentClickListener() {
        return this.LLLLIL;
    }

    public final Function0<Unit> getOnViewMoreInstallmentPlansClickListener() {
        return this.LLLLIIIILLL;
    }

    public final Function0<Unit> getOnViewMoreSeparateInstallmentPlansClickListener() {
        return this.LLLLIIL;
    }

    public final Function0<Unit> getOnViewMoreSubPaymentsClickListener() {
        return this.LLLLII;
    }

    public final OrderSubmitAssemViewModel getOspAssemViewModel() {
        return this.LLLLLLLLLL;
    }

    public final MiniOspViewModel getOspMiniVM() {
        return this.LLLLLLLZIL;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LLLLLJLJLL;
    }

    public final PaymentInfoViewModel getPaymentInfoViewModel() {
        return this.LLLLLLZ;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LLLLLLL;
    }

    public final boolean getPerformClick() {
        return this.LLLLLZIL;
    }

    public final String getPipoBnplTenureFromPdp() {
        return this.LLLLLLLLL;
    }

    public final ButtonStyle getStyle() {
        return this.LLLLZ;
    }

    public final boolean getUseDefaultRadio() {
        return this.LLLLLLZZ;
    }

    public C03ZB(Context context) {
        int i;
        super(context, null, 0);
        this.LLLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 31));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 26));
        this.LLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 28));
        this.LLLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 25));
        this.LLLILZJ = C03ZQ.NORMAL;
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 30));
        this.LLLJIL = new HashMap<>();
        this.LLLJL = AFwS185S0000000_1.get$arr$(19);
        this.LLLL = AFwS228S0000000_1.get$arr$(24);
        this.LLLLII = AFwS185S0000000_1.get$arr$(17);
        this.LLLLIIIILLL = AFwS185S0000000_1.get$arr$(20);
        this.LLLLIIL = AFwS185S0000000_1.get$arr$(16);
        this.LLLLIILL = AFwS228S0000000_1.get$arr$(26);
        this.LLLLIILLL = AFwS284S0000000_1.get$arr$(2);
        this.LLLLIL = AFwS228S0000000_1.get$arr$(30);
        this.LLLLJ = AFwS228S0000000_1.get$arr$(28);
        this.LLLLJI = AFwS228S0000000_1.get$arr$(27);
        this.LLLLL = AFwS228S0000000_1.get$arr$(29);
        this.LLLLLIL = AFwS228S0000000_1.get$arr$(25);
        if (C870903al.LIZ()) {
            i = 100;
        } else {
            i = 3;
        }
        this.LLLLLLJ = i;
        this.LLLLLLZZ = true;
        this.LLLLLZL = 3;
        this.LLLLZI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 27));
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.aoy, this, true);
    }

    private final void setSwitchChecked(boolean z) {
        getSwitchButtonFromXml().setChecked(z);
        getSwitchButtonTokoFromXml().setChecked(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan] */
    /* JADX WARN: Type inference failed for: r39v0, types: [X.03ZB, X.03ZU, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [T] */
    /* JADX WARN: Type inference failed for: r3v65, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r7v23, types: [T] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.03ZF, android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(boolean r40) {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJIIJJI(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(boolean r14) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJIILJJIL(boolean):void");
    }

    public final void LJIILL(boolean z) {
        if (!z) {
            C0H1U.LIZIZ(getSwitchButtonFromXml());
            C0H1U.LIZIZ(getSwitchButtonTokoFromXml());
        } else if (this.LLLLZ == ButtonStyle.TOKO_STYLE) {
            C12ES.LJIILL(0, getSwitchButtonTokoFromXml());
        } else {
            C12ES.LJIILL(0, getSwitchButtonFromXml());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJIJJ(boolean):void");
    }

    public final void setAlwaysShowPaymentTips(boolean z) {
        this.LLLLLZ = z;
    }

    public final void setArrowFromXml(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setBtnSaveFromXml(C0HZQ c0hzq) {
        this.LLLFZ = c0hzq;
    }

    public final void setCheckContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo, java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.03ZB, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.03cz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setChecked(boolean r28) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.setChecked(boolean):void");
    }

    public void setDisplayMode(C03ZQ c03zq) {
        this.LLLILZJ = c03zq;
    }

    public final void setGeneralParams(HashMap<String, Object> map) {
        this.LLLJIL = map;
    }

    public final void setIcNoticeFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setIconEditSEAFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setIconPaymentTipFromXml(TuxIconView tuxIconView) {
        this.LLJLILLLLZIIL = tuxIconView;
    }

    public final void setIconsContainerFromXml(LinearLayout linearLayout) {
        this.LLLI = linearLayout;
    }

    public final void setIvPaymentIconFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setLayoutPaymentAreaFromXml(ConstraintLayout constraintLayout) {
        this.LLJJ = constraintLayout;
    }

    public final void setLlBalanceLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJJIL = linearLayout;
    }

    public final void setLlPaymentItemFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setLlPaymentTipFromXml(LinearLayout linearLayout) {
        this.LLJL = linearLayout;
    }

    public final void setLlPaymentTipStyleLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJJJJIL = linearLayout;
    }

    public final void setLlSubPaymentContainerFromXml(LinearLayout linearLayout) {
        this.LLJJIJIL = linearLayout;
    }

    public final void setLlViewMoreInstallmentPlansFromXml(LinearLayout linearLayout) {
        this.LLJJIJI = linearLayout;
    }

    public final void setLlViewMoreSubPaymentsFromXml(LinearLayout linearLayout) {
        this.LLJJJ = linearLayout;
    }

    public final void setLvBindAndPayFromXml(C03ZM c03zm) {
        this.LLJZIJLIL = c03zm;
    }

    public final void setNewUserUseArrow(boolean z) {
        this.LLLLLLIL = z;
    }

    public final void setOnActivateClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLL = function1;
    }

    public final void setOnBonusPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLLLIL = function1;
    }

    public final void setOnCheckedListener(Function0<Unit> function0) {
        this.LLLJL = function0;
    }

    public final void setOnInstallmentPlanClickListener(Function2<? super InstallmentPlan, ? super Boolean, Unit> function2) {
        this.LLLLIILLL = function2;
    }

    public final void setOnInstallmentPromotionClickListener(InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLLLLILLIL = interfaceC1631620sYq;
        LJIJ();
    }

    public final void setOnInterestingFeePromotionClickListener(Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> function2) {
        this.LLLLLJIL = function2;
        LJIJ();
    }

    public final void setOnNoticeClickListener(Function1<? super String, Unit> function1) {
        this.LLLLIILL = function1;
    }

    public final void setOnPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLLJI = function1;
    }

    public final void setOnSaveClickListener(Function1<? super Boolean, Unit> function1) {
        this.LLLLJ = function1;
    }

    public final void setOnServiceFeePromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLLL = function1;
    }

    public final void setOnSubPaymentClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLLIL = function1;
    }

    public final void setOnViewMoreInstallmentPlansClickListener(Function0<Unit> function0) {
        this.LLLLIIIILLL = function0;
    }

    public final void setOnViewMoreSeparateInstallmentPlansClickListener(Function0<Unit> function0) {
        this.LLLLIIL = function0;
    }

    public final void setOnViewMoreSubPaymentsClickListener(Function0<Unit> function0) {
        this.LLLLII = function0;
    }

    public final void setOspAssemViewModel(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LLLLLLLLLL = orderSubmitAssemViewModel;
    }

    public final void setOspMiniVM(MiniOspViewModel miniOspViewModel) {
        this.LLLLLLLZIL = miniOspViewModel;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LLLLLJLJLL = paymentInfo;
    }

    public final void setPaymentInfoFromOSP(Boolean bool) {
        this.LLLLLL = bool;
    }

    public final void setPaymentInfoViewModel(PaymentInfoViewModel paymentInfoViewModel) {
        this.LLLLLLZ = paymentInfoViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r16) {
        /*
            Method dump skipped, instruction units count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }

    public final void setPaymentUpgradeBannerView(C874903bP c874903bP) {
        this.LLLIIIL = c874903bP;
    }

    public final void setPerformClick(boolean z) {
        this.LLLLLZIL = z;
    }

    public final void setPipoBnplTenureFromPdp(String str) {
        this.LLLLLLLLL = str;
    }

    public final void setPromotionAlertDotFromXml(C426770GoN c426770GoN) {
        this.LLJJIJIIJIL = c426770GoN;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LLIZ = c1841350y17;
    }

    public final void setSaveContainerFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setServiceFeeInfoFromXml(TuxTextView tuxTextView) {
        this.LLJLL = tuxTextView;
    }

    public final void setShowAllInstallmentBottomArrow(TuxIconView tuxIconView) {
        this.LLLII = tuxIconView;
    }

    public final void setShowAllInstallmentRightArrow(TuxIconView tuxIconView) {
        this.LLLIIII = tuxIconView;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLLLZ = buttonStyle;
        if (buttonStyle == ButtonStyle.TOKO_STYLE) {
            getTvBindFromXml().setTextColorRes(R.attr.dt);
            getRadioFromXml().LIZ(C0HEZ.LIZ(R.attr.dt, getContext()), C0HEZ.LIZ(R.attr.a01, getContext()));
        }
    }

    public final void setSuperElementFromXml(C884703cz c884703cz) {
        this.LLJILJILJ = c884703cz;
    }

    public final void setSwitchButtonFromXml(C21411818qq c21411818qq) {
        this.LLLF = c21411818qq;
    }

    public final void setSwitchButtonTokoFromXml(C21411818qq c21411818qq) {
        this.LLLFF = c21411818qq;
    }

    public final void setTagContainerFromXml(CardView cardView) {
        this.LLILZ = cardView;
    }

    public final void setTagExtraLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJI = linearLayout;
    }

    public final void setTopPadding(int i) {
        C0H1U.LJIIJ(i, getLlPaymentItemFromXml());
    }

    public final void setTvAdditionalClarificationFromXml(TuxTextView tuxTextView) {
        this.LLLIIIIL = tuxTextView;
    }

    public final void setTvAdditionalTipsStyleFromXml(TuxTextView tuxTextView) {
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
    }

    public final void setTvBalanceFromXml(TuxTextView tuxTextView) {
        this.LLJJJJ = tuxTextView;
    }

    public final void setTvBindFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setTvBindNoteFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setTvBonusPromotionTag(TuxTextView tuxTextView) {
        this.LLJLLL = tuxTextView;
    }

    public final void setTvCcdcCardTipFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setTvExtraInfoBelowFromXml(TuxTextView tuxTextView) {
        this.LLJZ = tuxTextView;
    }

    public final void setTvExtraInfoRightFromXml(TuxTextView tuxTextView) {
        this.LLL = tuxTextView;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLJJIII = tuxTextView;
    }

    public final void setTvPaymentExtraTipsFromXml(TuxTextView tuxTextView) {
        this.LLJJL = tuxTextView;
    }

    public final void setTvPaymentNameFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvPaymentTipFromXml(TuxTextView tuxTextView) {
        this.LLJLIL = tuxTextView;
    }

    public final void setTvPaymentTipStyleFromXml(TuxTextView tuxTextView) {
        this.LLJJJJLIIL = tuxTextView;
    }

    public final void setTvSaveFromXml(TuxTextView tuxTextView) {
        this.LLLFFI = tuxTextView;
    }

    public final void setTvServiceFeePromotionTag(TuxTextView tuxTextView) {
        this.LLJLLIL = tuxTextView;
    }

    public final void setUseDefaultRadio(boolean z) {
        if (z) {
            C12ES.LJIILL(0, getRadioFromXml());
            LJIILL(false);
        } else {
            C0H1U.LIZIZ(getRadioFromXml());
            LJIILL(true);
        }
    }

    @Override // X.C03ZU
    public final void LIZIZ(C03ZF c03zf, int i) {
        if (C03ZR.LIZ[getDisplayMode().ordinal()] == 1) {
            if (i % 2 == 0) {
                C426750GoL.LJIIIZ(c03zf, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 25);
            } else {
                C426750GoL.LJIIIZ(c03zf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 28);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C03ZI LJFF(final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZB.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int):X.03ZI");
    }

    public final void LJI(boolean z, Boolean bool) {
        String str;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        this.LLLLJ.invoke(Boolean.valueOf(z));
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
        PaymentMethod paymentMethod = this.LLLLLLL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (C03S0.LIZ(str)) {
            PaymentMethod paymentMethod2 = this.LLLLLLL;
            if (paymentMethod2 != null) {
                paymentMethod2.LJIIJJI = Boolean.valueOf(z);
            }
            LJIIZILJ();
            LJIJI();
            EcomPaymentPromotionConfigModel ecomPaymentPromotionConfigModel = C03S0.LIZIZ().promotionConfigs;
            if (ecomPaymentPromotionConfigModel != null && Intrinsics.LJFF(ecomPaymentPromotionConfigModel.refreshSummaryAuto, Boolean.TRUE)) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLLLLLLLLL;
                if (orderSubmitAssemViewModel2 != null) {
                    orderSubmitAssemViewModel2.TS2();
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(bool, Boolean.TRUE) || (orderSubmitAssemViewModel = this.LLLLLLLLLL) == null) {
                return;
            }
            orderSubmitAssemViewModel.TS2();
        }
    }

    public final void LJIIJ(InstallmentPlan installmentPlan, boolean z) {
        TuxTextView tvAdditionalClarificationFromXml = getTvAdditionalClarificationFromXml();
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        PaymentMethod paymentMethod = this.LLLLLLL;
        activateHelper.getClass();
        String strLJIILIIL = ActivateHelper.LJIILIIL(installmentPlan, paymentMethod);
        boolean zLJIIIZ = ActivateHelper.LJIIIZ(installmentPlan, this.LLLLLLL);
        if ((z || zLJIIIZ) && strLJIILIIL != null && strLJIILIIL.length() != 0) {
            C12ES.LJIILL(0, tvAdditionalClarificationFromXml);
            tvAdditionalClarificationFromXml.setText(strLJIILIIL);
        } else {
            C0H1U.LIZIZ(tvAdditionalClarificationFromXml);
        }
    }
}
