package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZF extends FrameLayout {
    public TuxTextView LL;
    public C21532619Oq LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public LinearLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public ViewGroup LLJILJILJ;
    public ViewGroup LLJILLL;
    public View LLJJ;
    public PaymentMethod LLJJI;
    public InstallmentPlan LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Map<String, String> LLJJJ;
    public InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> LLJJJIL;
    public Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    public final ViewGroup getContentRoot() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.euc);
            this.LLJILLL = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final ViewGroup getInstallmentPlanContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kt_);
            this.LLJILJILJ = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final C21532619Oq getPromotionTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sb_);
            this.LLILLJJLI = (C21532619Oq) callbackFindViewById;
        }
        return (C21532619Oq) callbackFindViewById;
    }

    public final View getRecTag() {
        View view = this.LLJJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.sv7);
        this.LLJJ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getTvAprDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2a);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvFeeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z3w);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvInstallmentPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4b);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvInterestFeePromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4c);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getTvItemLinkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4d);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getTvItemLinkIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4e);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvItemLinkTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4f);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentServiceFeePromotion() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5a);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPlanDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5d);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPlanExtraDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5e);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPromoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5n);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final boolean LIZJ() {
        return getInstallmentPlanContainerFromXml().isSelected();
    }

    public final boolean getDisplayInstallmentPlanWhenInactivated() {
        return this.LLJJJJLIIL;
    }

    public final Map<String, String> getInstallmentBreakdownIcons() {
        return this.LLJJJ;
    }

    public final InstallmentPlan getInstallmentPlan() {
        return this.LLJJIII;
    }

    public final boolean getNeedShowBreakdownInsideInstallmentPlan() {
        return this.LLJJL;
    }

    public final boolean getNewActivateFlowEnabled() {
        return this.LLJJJJJIL;
    }

    public final InterfaceC1631620sYq<PaymentMethod, InstallmentPlan, Boolean, Unit> getOnInstallmentPromotionClickListener() {
        return this.LLJJJIL;
    }

    public final Function2<PaymentMethod, InterestFeePromotion, Unit> getOnInterestingFeePromotionClickListener() {
        return this.LLJJJJ;
    }

    public final boolean getShowRecommendTag() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C03ZF(Context context) {
        super(context, null, 0);
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = true;
        C0H1U.LIZJ(R.layout.aqm, this, true);
    }

    private final void setDescription(InstallmentPlan installmentPlan) {
        ECRichText eCRichText;
        String str;
        String str2;
        String str3;
        String str4;
        InstallmentPlan installmentPlan2 = installmentPlan.displayInstallmentPlan;
        if (installmentPlan2 == null || (eCRichText = installmentPlan2.richDesc) == null) {
            eCRichText = installmentPlan.richDesc;
        }
        if (eCRichText != null) {
            C03C8.LIZJ(getTvPlanExtraDescFromXml(), eCRichText, "installment_plan", null);
            C12ES.LJIILL(0, getTvPlanExtraDescFromXml());
            C0H1U.LIZIZ(getTvPromoFromXml());
            C0H1U.LIZIZ(getTvFeeFromXml());
            return;
        }
        if (installmentPlan2 == null || (str = installmentPlan2.extraDescription) == null) {
            str = installmentPlan.extraDescription;
        }
        if (!TextUtils.isEmpty(str)) {
            C12ES.LJIILL(0, getTvPlanExtraDescFromXml());
            getTvPlanExtraDescFromXml().setText(str);
        } else {
            C0H1U.LIZIZ(getTvPlanExtraDescFromXml());
        }
        InstallmentPlan installmentPlan3 = installmentPlan.displayInstallmentPlan;
        if (installmentPlan3 == null || (str2 = installmentPlan3.promoText) == null) {
            str2 = installmentPlan.promoText;
        }
        if (!TextUtils.isEmpty(str2)) {
            C12ES.LJIILL(0, getTvPromoFromXml());
            getTvPromoFromXml().setText(str2);
        } else {
            C0H1U.LIZIZ(getTvPromoFromXml());
        }
        InstallmentPlan installmentPlan4 = installmentPlan.displayInstallmentPlan;
        if (installmentPlan4 == null || (str3 = installmentPlan4.totalFeeText) == null) {
            str3 = installmentPlan.totalFeeText;
        }
        if (!TextUtils.isEmpty(str3)) {
            C12ES.LJIILL(0, getTvFeeFromXml());
            getTvFeeFromXml().setText(str3);
        } else {
            C0H1U.LIZIZ(getTvFeeFromXml());
        }
        InstallmentPlan installmentPlan5 = installmentPlan.displayInstallmentPlan;
        if (installmentPlan5 == null || (str4 = installmentPlan5.aprDescription) == null) {
            str4 = installmentPlan.aprDescription;
        }
        PaymentMethod paymentMethod = this.LLJJI;
        if ((paymentMethod == null || !paymentMethod.LJJJLZIJ() || LIZJ()) && !TextUtils.isEmpty(str4)) {
            TuxTextView tvAprDescFromXml = getTvAprDescFromXml();
            if (tvAprDescFromXml != null) {
                C12ES.LJIILL(0, tvAprDescFromXml);
            }
            TuxTextView tvAprDescFromXml2 = getTvAprDescFromXml();
            if (tvAprDescFromXml2 != null) {
                tvAprDescFromXml2.setText(str4);
                return;
            }
            return;
        }
        TuxTextView tvAprDescFromXml3 = getTvAprDescFromXml();
        if (tvAprDescFromXml3 == null) {
            return;
        }
        C0H1U.LIZIZ(tvAprDescFromXml3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setChecked$ecommerce_transaction_release(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.LLJJJJJIL
            if (r0 != 0) goto L93
            boolean r0 = r5.LLJJJJLIIL
            if (r0 != 0) goto L93
            android.view.ViewGroup r0 = r5.getInstallmentPlanContainerFromXml()
            r0.setSelected(r6)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = r5.LLJJIII
            r2 = 0
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown r0 = r0.breakdown
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.linkName
            r4 = 0
            if (r0 == 0) goto Lac
            int r0 = r0.length()
            if (r0 == 0) goto Lac
            if (r6 == 0) goto Lac
            boolean r0 = r5.LLJJL
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r1 = r5.LLJJIII
            if (r1 == 0) goto Laa
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = r1.displayInstallmentPlan
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown r3 = r0.breakdown
            if (r3 != 0) goto L37
        L35:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown r3 = r1.breakdown
        L37:
            com.bytedance.tux.input.TuxTextView r0 = r5.getTvItemLinkTextFromXml()
            if (r3 == 0) goto L3f
            java.lang.String r2 = r3.linkName
        L3f:
            r0.setText(r2)
            android.widget.LinearLayout r2 = r5.getTvItemLinkFromXml()
            g1c.AjS40S0200000_1 r1 = new g1c.AjS40S0200000_1
            r0 = 50
            r1.<init>(r5, r3, r0)
            X.C786410Ut5.I7(r1, r2)
            android.widget.LinearLayout r0 = r5.getTvItemLinkFromXml()
            X.C12ES.LJIILL(r4, r0)
            com.bytedance.tux.input.TuxTextView r0 = r5.getTvItemLinkTextFromXml()
            X.C12ES.LJIILL(r4, r0)
            com.bytedance.tux.icon.TuxIconView r0 = r5.getTvItemLinkIconFromXml()
            X.C12ES.LJIILL(r4, r0)
        L65:
            boolean r0 = r5.LLJJIJIIJIL
            if (r0 == 0) goto La6
            r1 = 2130970552(0x7f0407b8, float:1.7549817E38)
        L6c:
            android.view.ViewGroup r0 = r5.getInstallmentPlanContainerFromXml()
            r0.setBackgroundResource(r1)
            boolean r0 = r5.LLJJIJI
            if (r0 == 0) goto L94
            boolean r0 = X.C870903al.LIZ()
            if (r0 == 0) goto L94
        L7d:
            r1 = 2131100622(0x7f0603ce, float:1.781363E38)
        L80:
            com.bytedance.tux.input.TuxTextView r0 = r5.getTvPlanDescFromXml()
            r0.setTextColorRes(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r1 = r5.LLJJIII
            if (r1 == 0) goto L93
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r5.LLJJI
            r5.LIZLLL(r1, r0)
            r5.setDescription(r1)
        L93:
            return
        L94:
            if (r6 == 0) goto L7d
            boolean r0 = r5.LLJJIJIIJIL
            if (r0 == 0) goto L9e
            r1 = 2131099746(0x7f060062, float:1.7811854E38)
            goto L80
        L9e:
            boolean r0 = r5.LLJJIJIL
            if (r0 == 0) goto L7d
            r1 = 2131100435(0x7f060313, float:1.7813251E38)
            goto L80
        La6:
            r1 = 2130970550(0x7f0407b6, float:1.7549813E38)
            goto L6c
        Laa:
            r3 = r2
            goto L37
        Lac:
            android.widget.LinearLayout r0 = r5.getTvItemLinkFromXml()
            X.C0H1U.LIZIZ(r0)
            com.bytedance.tux.input.TuxTextView r0 = r5.getTvItemLinkTextFromXml()
            X.C0H1U.LIZIZ(r0)
            com.bytedance.tux.icon.TuxIconView r0 = r5.getTvItemLinkIconFromXml()
            X.C0H1U.LIZIZ(r0)
            if (r6 != 0) goto L65
            r1 = 2130970554(0x7f0407ba, float:1.7549821E38)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZF.setChecked$ecommerce_transaction_release(boolean):void");
    }

    public final void setContentRoot(ViewGroup viewGroup) {
        this.LLJILLL = viewGroup;
    }

    public final void setDisplayInstallmentPlanWhenInactivated(boolean z) {
        this.LLJJJJLIIL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        String str = null;
        if (z) {
            setForeground(null);
            return;
        }
        PaymentMethod paymentMethod = this.LLJJI;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        }
        if (!EcomMergeBalanceAndInstallmentSettings.LIZ(str)) {
            return;
        }
        int iLIZ = C0HEZ.LIZ(R.attr.zo, getContext());
        setForeground(new ColorDrawable(Color.argb(128, Color.red(iLIZ), Color.green(iLIZ), Color.blue(iLIZ))));
    }

    public final void setFromPayment(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setInstallmentBreakdownIcons(Map<String, String> map) {
        this.LLJJJ = map;
    }

    public final void setInstallmentPlan(InstallmentPlan installmentPlan) {
        this.LLJJIII = installmentPlan;
    }

    public final void setInstallmentPlanContainerFromXml(ViewGroup viewGroup) {
        this.LLJILJILJ = viewGroup;
    }

    public final void setMinHeightForContainer$ecommerce_transaction_release(boolean z) {
        int iIntValue;
        C389690FPr c389690FPr;
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            Integer numValueOf = Integer.valueOf(C679280Qkg.LIZ(50));
            if (numValueOf != null) {
                ViewGroup installmentPlanContainerFromXml = getInstallmentPlanContainerFromXml();
                if (installmentPlanContainerFromXml != null) {
                    ViewGroup installmentPlanContainerFromXml2 = getInstallmentPlanContainerFromXml();
                    if (installmentPlanContainerFromXml2 != null && (layoutParams = installmentPlanContainerFromXml2.getLayoutParams()) != null) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams = null;
                    }
                    C786410Ut5.X5(layoutParams, installmentPlanContainerFromXml);
                }
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            ViewGroup installmentPlanContainerFromXml3 = getInstallmentPlanContainerFromXml();
            if ((installmentPlanContainerFromXml3 instanceof C389690FPr) && (c389690FPr = (C389690FPr) installmentPlanContainerFromXml3) != null) {
                c389690FPr.setEnforcedMinHeightPx(iIntValue);
            }
            ViewGroup installmentPlanContainerFromXml4 = getInstallmentPlanContainerFromXml();
            if (installmentPlanContainerFromXml4 != null) {
                installmentPlanContainerFromXml4.setMinimumHeight(iIntValue);
            }
        }
    }

    public final void setNeedShowBreakdownInsideInstallmentPlan(boolean z) {
        this.LLJJL = z;
    }

    public final void setNewActivateFlowEnabled(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setOnInstallmentPromotionClickListener(InterfaceC1631620sYq<? super PaymentMethod, ? super InstallmentPlan, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJJJIL = interfaceC1631620sYq;
    }

    public final void setOnInterestingFeePromotionClickListener(Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> function2) {
        this.LLJJJJ = function2;
    }

    public final void setPromotionTagFromXml(C21532619Oq c21532619Oq) {
        this.LLILLJJLI = c21532619Oq;
    }

    public final void setRecTag(View view) {
        this.LLJJ = view;
    }

    public final void setShowRecommendTag(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setTvAprDescFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setTvFeeFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setTvInstallmentPromotionFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvInterestFeePromotionFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTvItemLinkFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void setTvItemLinkIconFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setTvItemLinkTextFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setTvPaymentServiceFeePromotion(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvPlanDescFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTvPlanExtraDescFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setTvPromoFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r13, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r14) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZF.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }

    public static String LIZ(PaymentMethod paymentMethod, InstallmentPlan installmentPlan, boolean z) {
        String str;
        PaymentPromotion paymentPromotion;
        PaymentServiceFeeInfo paymentServiceFeeInfo;
        PaymentPromotion paymentPromotion2;
        C03SY c03sy = C03SY.LIZ;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        c03sy.getClass();
        if (C03SY.LJIJI(str)) {
            if (z) {
                if (installmentPlan == null || (paymentServiceFeeInfo = installmentPlan.paymentServiceFeeInfo) == null || (paymentPromotion2 = paymentServiceFeeInfo.paymentPromotionInfo) == null) {
                    return null;
                }
                return paymentPromotion2.getPromotionLink();
            }
            if (installmentPlan == null || (paymentPromotion = installmentPlan.promotionInfo) == null) {
                return null;
            }
            return paymentPromotion.getPromotionLink();
        }
        if (paymentMethod == null) {
            return null;
        }
        return paymentMethod.LJIL();
    }

    public static void LIZIZ(C03ZF c03zf, InstallmentPlan installmentPlan, boolean z, boolean z2, PaymentMethod paymentMethod, int i) {
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        boolean zLJFF;
        Integer numValueOf3;
        Integer numValueOf4;
        PaymentMethod paymentMethod2 = paymentMethod;
        boolean z3 = z2;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        Integer numValueOf5 = null;
        if ((i & 8) != 0) {
            paymentMethod2 = null;
        }
        c03zf.LLJJI = paymentMethod2;
        c03zf.LLJJIII = installmentPlan;
        c03zf.LLJJIJIIJIL = z;
        c03zf.LLJJIJIL = z3;
        TuxTextView tvPlanDescFromXml = c03zf.getTvPlanDescFromXml();
        InstallmentPlan installmentPlan2 = installmentPlan.displayInstallmentPlan;
        if (installmentPlan2 == null || (str = installmentPlan2.planDescription) == null) {
            str = installmentPlan.planDescription;
        }
        tvPlanDescFromXml.setText(str);
        c03zf.setDescription(installmentPlan);
        c03zf.setChecked$ecommerce_transaction_release(false);
        c03zf.LIZLLL(installmentPlan, paymentMethod2);
        InstallmentPlan installmentPlan3 = c03zf.LLJJIII;
        if (installmentPlan3 != null && Intrinsics.LJFF(installmentPlan3.isRecommend, Boolean.TRUE) && c03zf.LLJJLIIIJLLLLLLLZ) {
            View recTag = c03zf.getRecTag();
            if (recTag != null) {
                C12ES.LJIILL(0, recTag);
            }
            if (c03zf.LLJJIJIIJIL) {
                View recTag2 = c03zf.getRecTag();
                if (recTag2 != null) {
                    recTag2.setBackgroundResource(R.drawable.b2y);
                }
            } else {
                View recTag3 = c03zf.getRecTag();
                if (recTag3 != null) {
                    recTag3.setBackgroundResource(R.drawable.b2x);
                }
            }
            ViewGroup contentRoot = c03zf.getContentRoot();
            if (contentRoot != null) {
                ViewGroup contentRoot2 = c03zf.getContentRoot();
                if (contentRoot2 != null) {
                    numValueOf3 = Integer.valueOf(contentRoot2.getPaddingStart());
                } else {
                    numValueOf3 = null;
                }
                Integer numValueOf6 = Integer.valueOf(C679280Qkg.LIZ(16));
                ViewGroup contentRoot3 = c03zf.getContentRoot();
                if (contentRoot3 != null) {
                    numValueOf4 = Integer.valueOf(contentRoot3.getPaddingEnd());
                } else {
                    numValueOf4 = null;
                }
                ViewGroup contentRoot4 = c03zf.getContentRoot();
                if (contentRoot4 != null) {
                    numValueOf5 = Integer.valueOf(contentRoot4.getPaddingBottom());
                }
                C426750GoL.LJIIL(contentRoot, numValueOf3, numValueOf6, numValueOf4, numValueOf5, 16);
            }
        } else {
            View recTag4 = c03zf.getRecTag();
            if (recTag4 != null) {
                C0H1U.LIZIZ(recTag4);
            }
            ViewGroup contentRoot5 = c03zf.getContentRoot();
            if (contentRoot5 != null) {
                ViewGroup contentRoot6 = c03zf.getContentRoot();
                if (contentRoot6 != null) {
                    numValueOf = Integer.valueOf(contentRoot6.getPaddingStart());
                } else {
                    numValueOf = null;
                }
                Integer numValueOf7 = Integer.valueOf(C679280Qkg.LIZ(8));
                ViewGroup contentRoot7 = c03zf.getContentRoot();
                if (contentRoot7 != null) {
                    numValueOf2 = Integer.valueOf(contentRoot7.getPaddingEnd());
                } else {
                    numValueOf2 = null;
                }
                ViewGroup contentRoot8 = c03zf.getContentRoot();
                if (contentRoot8 != null) {
                    numValueOf5 = Integer.valueOf(contentRoot8.getPaddingBottom());
                }
                C426750GoL.LJIIL(contentRoot5, numValueOf, numValueOf7, numValueOf2, numValueOf5, 16);
            }
        }
        Availability availability = installmentPlan.availability;
        if (availability != null) {
            zLJFF = Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        if (c03zf.LLJJJJJIL) {
            c03zf.setEnabled(true);
            c03zf.getInstallmentPlanContainerFromXml().setBackgroundResource(R.drawable.b36);
            c03zf.getTvPlanDescFromXml().setTextColorRes(R.attr.a1k);
        } else if (!zLJFF && !c03zf.LLJJJJLIIL) {
            c03zf.setEnabled(true);
            c03zf.getInstallmentPlanContainerFromXml().setBackgroundResource(R.drawable.b31);
            c03zf.getTvPlanDescFromXml().setTextColorRes(R.attr.a1h);
        } else {
            c03zf.setEnabled(false);
            c03zf.getInstallmentPlanContainerFromXml().setBackgroundResource(R.drawable.b36);
            c03zf.getTvPlanDescFromXml().setTextColorRes(R.attr.ug);
        }
    }
}
