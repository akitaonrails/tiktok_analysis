package X;

import Y.AAListenerS336S0100000_26;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionHybridInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIDescriptionBlock;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS63S0200000_26;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ub4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709880ub4 extends LinearLayout implements InterfaceC1708270uYT {
    public static final /* synthetic */ int LLJLL = 0;
    public C1841350y17 LL;
    public C21411818qq LLILLJJLI;
    public C21411818qq LLILLL;
    public SmartImageView LLILZ;
    public TuxTextView LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public C1710780ucW LLJI;
    public FrameLayout LLJIJIL;
    public FrameLayout LLJILJIL;
    public C1710190ubZ LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public PaymentOption LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public CashierEnterParams LLJJIJIL;
    public PipoCashierBaseFragment LLJJJ;
    public C1709690ual LLJJJIL;
    public C1709920ub8 LLJJJJ;
    public boolean LLJJJJJIL;
    public C1709930ub9 LLJJJJLIIL;
    public String LLJJL;
    public C1709620uae LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public ValueAnimator LLJLILLLLZIIL;

    @Override // X.InterfaceC1708270uYT
    public final void LIZIZ() {
    }

    private final C1708220uYO getBindHelper() {
        return (C1708220uYO) this.LLJL.getValue();
    }

    private final DialogC1389620mGW getBindLoadingDlg() {
        return (DialogC1389620mGW) this.LLJLIL.getValue();
    }

    public final FrameLayout getBottomSubElementFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cay);
            this.LLJIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1710780ucW getEmbeddedElementFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gz0);
            this.LLJI = (C1710780ucW) callbackFindViewById;
        }
        return (C1710780ucW) callbackFindViewById;
    }

    public final LinearLayout getIconList() {
        return (LinearLayout) this.LLJJ.getValue();
    }

    public final TuxIconView getInfoIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.km8);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final FrameLayout getInstallmentPlanElementFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kta);
            this.LLJILJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getIvArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l5g);
            this.LLJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C1710190ubZ getNeedSelectedOtherBlockFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p4h);
            this.LLJILJILJ = (C1710190ubZ) callbackFindViewById;
        }
        return (C1710190ubZ) callbackFindViewById;
    }

    public final SmartImageView getPaymentMethodIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q5_);
            this.LLILZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getPaymentMethodNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q5b);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ViewGroup getPromotionParent() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sb1);
            this.LLIZ = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final C1711930ueN getSaveView() {
        return (C1711930ueN) this.LLJILLL.getValue();
    }

    public final C21411818qq getSwitchButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsx);
            this.LLILLJJLI = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonTokoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsy);
            this.LLILLL = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final ViewGroup getTipsParent() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xzb);
            this.LLILZLL = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    @Override // X.InterfaceC1708270uYT
    public final void LIZJ() {
        try {
            C0FNV.LIZ(getBindLoadingDlg());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public final void LJIIJJI() {
        try {
            DialogC1389620mGW bindLoadingDlg = getBindLoadingDlg();
            bindLoadingDlg.setCancelable(false);
            C0FNV.LIZJ(bindLoadingDlg);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1708270uYT
    public final void LIZLLL() {
        LJIIJJI();
    }

    @Override // X.InterfaceC1708270uYT
    public boolean getNotified() {
        return this.LLJJI;
    }

    public C1709880ub4(Context context) {
        super(context, null, 0);
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1451));
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1450));
        this.LLJJIJI = -1;
        this.LLJL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(465));
        this.LLJLIL = C452501pT.LIZIZ(new AwS570S0100000_26(context, 1449));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dvv, this, true);
        C1841350y17 radioFromXml = getRadioFromXml();
        if (radioFromXml != null) {
            radioFromXml.setBackground(null);
        }
    }

    public static String LJI(EnumC1709020uZg enumC1709020uZg) {
        if (enumC1709020uZg != null) {
            return C1709040uZi.LIZ(enumC1709020uZg);
        }
        return "";
    }

    private final void setChecked(boolean z) {
        C1709570uaZ c1709570uaZ;
        String str;
        List<PaymentOption> list;
        String str2;
        String str3;
        PaymentOption paymentOption;
        C1709570uaZ c1709570uaZ2;
        RawTextAndIcon rawTextAndIconLJJIIZI;
        this.LLJJIJIIJIL = z;
        C1841350y17 radioFromXml = getRadioFromXml();
        if (radioFromXml != null) {
            radioFromXml.setChecked(z);
        }
        C21411818qq switchButtonFromXml = getSwitchButtonFromXml();
        if (switchButtonFromXml != null) {
            switchButtonFromXml.setChecked(z);
        }
        C21411818qq switchButtonTokoFromXml = getSwitchButtonTokoFromXml();
        if (switchButtonTokoFromXml != null) {
            switchButtonTokoFromXml.setChecked(z);
        }
        C21411818qq switchButtonFromXml2 = getSwitchButtonFromXml();
        if (switchButtonFromXml2 != null) {
            switchButtonFromXml2.jumpDrawablesToCurrentState();
        }
        C21411818qq switchButtonTokoFromXml2 = getSwitchButtonTokoFromXml();
        if (switchButtonTokoFromXml2 != null) {
            switchButtonTokoFromXml2.jumpDrawablesToCurrentState();
        }
        CashierEnterParams cashierEnterParams = this.LLJJIJIL;
        if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null) {
            PIPOPaymentOptionSource pIPOPaymentOptionSource = c1709570uaZ.LIZ;
            PaymentOption paymentOption2 = this.LLJJIII;
            String str4 = null;
            if (paymentOption2 != null) {
                str = paymentOption2.parentKey;
            } else {
                str = null;
            }
            PaymentOption paymentOptionLJ = pIPOPaymentOptionSource.LJ(str);
            if (z && paymentOptionLJ != null && paymentOptionLJ.LJFF() && (list = paymentOptionLJ.LIZLLL) != null) {
                if (!list.isEmpty()) {
                    Iterator<PaymentOption> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().statusAttr.available) {
                        }
                    }
                }
                C1711930ueN saveView = getSaveView();
                CashierEnterParams cashierEnterParams2 = this.LLJJIJIL;
                if (cashierEnterParams2 == null || (c1709570uaZ2 = cashierEnterParams2.paymentData) == null || (rawTextAndIconLJJIIZI = c1709570uaZ2.LJJIIZI()) == null || (str2 = rawTextAndIconLJJIIZI.saveDisplayText) == null) {
                    str2 = "";
                }
                PaymentOption paymentOption3 = this.LLJJIII;
                if (paymentOption3 != null) {
                    str3 = paymentOption3.LIZ;
                } else {
                    str3 = null;
                }
                C1709610uad c1709610uad = paymentOptionLJ.LJII;
                if (c1709610uad != null && (paymentOption = c1709610uad.LIZIZ) != null) {
                    str4 = paymentOption.LIZ;
                }
                boolean zLJFF = Intrinsics.LJFF(str3, str4);
                AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this, paymentOptionLJ, 81);
                saveView.getSaveCheckBox().setChecked(zLJFF);
                saveView.getSaveTitle().setText(str2);
                C786410Ut5.I7(new AkS63S0200000_26(saveView, awS427S0200000_26, 3), saveView.getSaveCheckBox());
                C786410Ut5.I7(new AkS63S0200000_26(saveView, awS427S0200000_26, 4), saveView);
                C337180DJs.LIZJ(getSaveView());
                return;
            }
        }
        C337180DJs.LIZ(getSaveView());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021c A[PHI: r3
      0x021c: PHI (r3v11 java.lang.String) = (r3v5 java.lang.String), (r3v7 java.lang.String) binds: [B:71:0x019d, B:117:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[PHI: r4
      0x002e: PHI (r4v10 java.lang.String) = (r4v0 java.lang.String), (r4v11 java.lang.String) binds: [B:11:0x002c, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[PHI: r4
      0x0123: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v10 java.lang.String) binds: [B:11:0x002c, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709880ub4.LJFF(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption):void");
    }

    public final void LJII(String str) {
        String strLIZJ;
        C1709570uaZ c1709570uaZ;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", data is: ");
        CashierEnterParams cashierEnterParams = this.LLJJIJIL;
        if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null) {
            C1711340udQ.LIZ.getClass();
            strLIZJ = C1711340udQ.LIZJ(c1709570uaZ);
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIIZZ(boolean z) {
        final int measuredHeight;
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOption;
        PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL;
        CashierEnterParams cashierEnterParams = this.LLJJIJIL;
        if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null && (paymentOption = this.LLJJIII) != null && (paymentOptionLocalInfoLJJIIJZLJL = c1709570uaZ.LJJIIJZLJL(paymentOption.LIZ)) != null) {
            paymentOptionLocalInfoLJJIIJZLJL.showNeedSelectOtherPMBlock = Boolean.FALSE;
        }
        C1710190ubZ needSelectedOtherBlockFromXml = getNeedSelectedOtherBlockFromXml();
        if (needSelectedOtherBlockFromXml != null && needSelectedOtherBlockFromXml.getVisibility() == 8) {
            return;
        }
        ValueAnimator valueAnimator = this.LLJLILLLLZIIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        if (!z) {
            C1710190ubZ needSelectedOtherBlockFromXml2 = getNeedSelectedOtherBlockFromXml();
            if (needSelectedOtherBlockFromXml2 == null) {
                return;
            }
            C337180DJs.LIZ(needSelectedOtherBlockFromXml2);
            return;
        }
        C1710190ubZ needSelectedOtherBlockFromXml3 = getNeedSelectedOtherBlockFromXml();
        if (needSelectedOtherBlockFromXml3 != null) {
            measuredHeight = needSelectedOtherBlockFromXml3.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        C1710190ubZ needSelectedOtherBlockFromXml4 = getNeedSelectedOtherBlockFromXml();
        if (needSelectedOtherBlockFromXml4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(needSelectedOtherBlockFromXml4);
            needSelectedOtherBlockFromXml4.setTranslationY(0.0f);
        }
        final int measuredHeight2 = getMeasuredHeight();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, 0);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ueI
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Integer num;
                int right;
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                    C1709880ub4 c1709880ub4 = this.LL;
                    int i = measuredHeight;
                    int i2 = measuredHeight2;
                    int iIntValue = num.intValue();
                    C1710190ubZ needSelectedOtherBlockFromXml5 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml5 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(needSelectedOtherBlockFromXml5);
                        needSelectedOtherBlockFromXml5.setTranslationY(iIntValue - i);
                    }
                    C1710190ubZ needSelectedOtherBlockFromXml6 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml6 != null) {
                        int i3 = i - iIntValue;
                        C1710190ubZ needSelectedOtherBlockFromXml7 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                        if (needSelectedOtherBlockFromXml7 != null) {
                            right = needSelectedOtherBlockFromXml7.getRight();
                        } else {
                            right = 0;
                        }
                        needSelectedOtherBlockFromXml6.setClipBounds(new Rect(0, i3, right, i));
                    }
                    C1710190ubZ needSelectedOtherBlockFromXml8 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml8 != null) {
                        needSelectedOtherBlockFromXml8.requestLayout();
                    }
                    c1709880ub4.getLayoutParams().height = i2 - (i - iIntValue);
                }
            }
        });
        valueAnimatorOfInt.addListener(new AAListenerS336S0100000_26(this, 2));
        valueAnimatorOfInt.start();
        this.LLJLILLLLZIIL = valueAnimatorOfInt;
    }

    public final void LJIIIZ(EnumC1709560uaY enumC1709560uaY) {
        PaymentOption paymentOption = this.LLJJIII;
        if (paymentOption == null) {
            return;
        }
        C1710720ucQ.LIZ(new C1710720ucQ(getContext()), this.LLJJIJIL, this.LLJJJ, enumC1709560uaY, paymentOption, false, this, 16);
    }

    public final void LJIILIIL(boolean z) {
        CBIDescriptionBlock cBIDescriptionBlock;
        final int measuredHeight;
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOption;
        PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL;
        C1710190ubZ needSelectedOtherBlockFromXml;
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo;
        PaymentOption paymentOption2 = this.LLJJIII;
        if (paymentOption2 != null && (pIPOPaymentOptionHybridInfo = paymentOption2.LJ) != null) {
            cBIDescriptionBlock = pIPOPaymentOptionHybridInfo.needSelectOtherBlock;
        } else {
            cBIDescriptionBlock = null;
        }
        if (paymentOption2 != null && paymentOption2.LJIJ() && cBIDescriptionBlock != null) {
            C1710190ubZ needSelectedOtherBlockFromXml2 = getNeedSelectedOtherBlockFromXml();
            if (needSelectedOtherBlockFromXml2 != null && needSelectedOtherBlockFromXml2.getVisibility() == 0) {
                if (z && (needSelectedOtherBlockFromXml = getNeedSelectedOtherBlockFromXml()) != null) {
                    needSelectedOtherBlockFromXml.LIZIZ();
                }
            } else {
                String str = cBIDescriptionBlock.text;
                if (str == null) {
                    str = "";
                }
                String str2 = cBIDescriptionBlock.textColor;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = cBIDescriptionBlock.darkTextColor;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = cBIDescriptionBlock.backgroundColor;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = cBIDescriptionBlock.darkBackgroundColor;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = cBIDescriptionBlock.iconUrl;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = cBIDescriptionBlock.darkIconUrl;
                if (str7 == null) {
                    str7 = "";
                }
                C1710310ubl c1710310ubl = new C1710310ubl(str, str2, str3, str4, str5, str6, str7);
                C1710190ubZ needSelectedOtherBlockFromXml3 = getNeedSelectedOtherBlockFromXml();
                if (needSelectedOtherBlockFromXml3 != null) {
                    needSelectedOtherBlockFromXml3.LIZ(c1710310ubl);
                }
                if (z) {
                    C1710190ubZ needSelectedOtherBlockFromXml4 = getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml4 != null) {
                        needSelectedOtherBlockFromXml4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C14KQ.LJ(getContext()), 0));
                    }
                    C1710190ubZ needSelectedOtherBlockFromXml5 = getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml5 != null) {
                        measuredHeight = needSelectedOtherBlockFromXml5.getMeasuredHeight();
                    } else {
                        measuredHeight = 0;
                    }
                    final float f = -measuredHeight;
                    C1710190ubZ needSelectedOtherBlockFromXml6 = getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml6 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(needSelectedOtherBlockFromXml6);
                        needSelectedOtherBlockFromXml6.setTranslationY(f);
                    }
                    C1710190ubZ needSelectedOtherBlockFromXml7 = getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml7 != null) {
                        C337180DJs.LIZJ(needSelectedOtherBlockFromXml7);
                    }
                    final int measuredHeight2 = getMeasuredHeight();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("need_selected_other_block targetH: ");
                    sbLIZ.append(measuredHeight);
                    LJII(C2188811AlT.LIZIZ(sbLIZ));
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, measuredHeight);
                    if (valueAnimatorOfInt != null) {
                        valueAnimatorOfInt.setDuration(200L);
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ueJ
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Integer num;
                                int right;
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                                    C1709880ub4 c1709880ub4 = this.LL;
                                    float f2 = f;
                                    int i = measuredHeight2;
                                    int i2 = measuredHeight;
                                    int iIntValue = num.intValue();
                                    C1710190ubZ needSelectedOtherBlockFromXml8 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                                    if (needSelectedOtherBlockFromXml8 != null) {
                                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(needSelectedOtherBlockFromXml8);
                                        needSelectedOtherBlockFromXml8.setTranslationY(f2 + iIntValue);
                                    }
                                    c1709880ub4.getLayoutParams().height = i + iIntValue;
                                    C1710190ubZ needSelectedOtherBlockFromXml9 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                                    if (needSelectedOtherBlockFromXml9 != null) {
                                        int i3 = i2 - iIntValue;
                                        C1710190ubZ needSelectedOtherBlockFromXml10 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                                        if (needSelectedOtherBlockFromXml10 != null) {
                                            right = needSelectedOtherBlockFromXml10.getRight();
                                        } else {
                                            right = 0;
                                        }
                                        needSelectedOtherBlockFromXml9.setClipBounds(new Rect(0, i3, right, i2));
                                    }
                                    C1710190ubZ needSelectedOtherBlockFromXml11 = c1709880ub4.getNeedSelectedOtherBlockFromXml();
                                    if (needSelectedOtherBlockFromXml11 != null) {
                                        needSelectedOtherBlockFromXml11.requestLayout();
                                    }
                                }
                            }
                        });
                        valueAnimatorOfInt.start();
                    }
                } else {
                    C1710190ubZ needSelectedOtherBlockFromXml8 = getNeedSelectedOtherBlockFromXml();
                    if (needSelectedOtherBlockFromXml8 != null) {
                        C337180DJs.LIZJ(needSelectedOtherBlockFromXml8);
                    }
                }
            }
            CashierEnterParams cashierEnterParams = this.LLJJIJIL;
            if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null && (paymentOption = this.LLJJIII) != null && (paymentOptionLocalInfoLJJIIJZLJL = c1709570uaZ.LJJIIJZLJL(paymentOption.LIZ)) != null) {
                paymentOptionLocalInfoLJJIIJZLJL.showNeedSelectOtherPMBlock = Boolean.TRUE;
                return;
            }
            return;
        }
        LJIIIIZZ(false);
    }

    public final void setBottomSubElementFromXml(FrameLayout frameLayout) {
        this.LLJIJIL = frameLayout;
    }

    public final void setEmbeddedElementFromXml(C1710780ucW c1710780ucW) {
        this.LLJI = c1710780ucW;
    }

    public final void setInfoIconFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setInstallmentPlanElementFromXml(FrameLayout frameLayout) {
        this.LLJILJIL = frameLayout;
    }

    public final void setIvArrowFromXml(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setNeedSelectedOtherBlockFromXml(C1710190ubZ c1710190ubZ) {
        this.LLJILJILJ = c1710190ubZ;
    }

    @Override // X.InterfaceC1708270uYT
    public void setNotified(boolean z) {
        this.LLJJI = z;
    }

    public final void setPaymentMethodIconFromXml(SmartImageView smartImageView) {
        this.LLILZ = smartImageView;
    }

    public final void setPaymentMethodNameFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setPromotionParent(ViewGroup viewGroup) {
        this.LLIZ = viewGroup;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LL = c1841350y17;
    }

    public final void setSwitchButtonFromXml(C21411818qq c21411818qq) {
        this.LLILLJJLI = c21411818qq;
    }

    public final void setSwitchButtonTokoFromXml(C21411818qq c21411818qq) {
        this.LLILLL = c21411818qq;
    }

    public final void setTipsParent(ViewGroup viewGroup) {
        this.LLILZLL = viewGroup;
    }

    @Override // X.InterfaceC1708270uYT
    public final void LIZ(int i, String str) {
        Function2<Integer, String, Unit> function2;
        try {
            C0FNV.LIZ(getBindLoadingDlg());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        C1709690ual c1709690ual = this.LLJJJIL;
        if (c1709690ual != null && (function2 = c1709690ual.LIZ) != null) {
            function2.invoke(Integer.valueOf(i), str);
        }
    }

    public final void LJIIJ(EnumC1155630gB7 enumC1155630gB7, PaymentOption paymentOption) {
        PaymentOption paymentOption2;
        String str;
        EnumC1709020uZg enumC1709020uZg;
        EnumC1709020uZg enumC1709020uZg2;
        C1709570uaZ c1709570uaZLJIIZILJ;
        boolean z;
        C1709070uZl c1709070uZl;
        C1709070uZl c1709070uZl2;
        CashierEnterParams cashierEnterParams = this.LLJJIJIL;
        if (cashierEnterParams != null && (paymentOption2 = this.LLJJIII) != null) {
            C1709990ubF c1709990ubF = new Object() { // from class: X.0ubF
            };
            Context context = getContext();
            EnumC1709200uZy enumC1709200uZy = null;
            if (paymentOption != null) {
                str = paymentOption.LIZ;
            } else {
                str = null;
            }
            PipoCashierBaseFragment pipoCashierBaseFragment = this.LLJJJ;
            CashierEnterParams cashierEnterParams2 = this.LLJJIJIL;
            if (cashierEnterParams2 != null && (c1709070uZl2 = cashierEnterParams2.LIZIZ) != null) {
                enumC1709020uZg = c1709070uZl2.LIZJ;
            } else {
                enumC1709020uZg = null;
            }
            String strLJI = LJI(enumC1709020uZg);
            CashierEnterParams cashierEnterParams3 = this.LLJJIJIL;
            if (cashierEnterParams3 != null && (c1709070uZl = cashierEnterParams3.LIZIZ) != null) {
                enumC1709020uZg2 = c1709070uZl.LIZJ;
            } else {
                enumC1709020uZg2 = null;
            }
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 705);
            c1709990ubF.getClass();
            C1709570uaZ c1709570uaZ = cashierEnterParams.paymentData;
            if (c1709570uaZ != null) {
                c1709570uaZLJIIZILJ = c1709570uaZ.LJIIZILJ();
            } else {
                c1709570uaZLJIIZILJ = null;
            }
            CashierEnterParams cashierEnterParamsLIZ = CashierEnterParams.LIZ(cashierEnterParams, c1709570uaZLJIIZILJ, null, 251);
            String str2 = cashierEnterParams.payRequestId;
            C1709070uZl c1709070uZl3 = cashierEnterParams.LIZIZ;
            if (c1709070uZl3 != null) {
                enumC1709200uZy = c1709070uZl3.LIZIZ;
            }
            if (enumC1709200uZy == EnumC1709200uZy.PAY_NOW) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (str == null) {
                str = "";
            }
            SubCashierEnterParams subCashierEnterParams = new SubCashierEnterParams(enumC1155630gB7, cashierEnterParamsLIZ, str2, boolValueOf, c1709570uaZLJIIZILJ, paymentOption2, str, strLJI, enumC1709020uZg2);
            SubCashierFragment subCashierFragment = new SubCashierFragment();
            subCashierFragment.LLJJJ = subCashierEnterParams;
            subCashierFragment.LLJJJIL = awS605S0100000_26;
            if (pipoCashierBaseFragment == null) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    subCashierFragment.gS(c19egLIZIZ);
                    return;
                }
                return;
            }
            pipoCashierBaseFragment.nS(subCashierFragment, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r33, java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIInstallmentPlan> r34) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709880ub4.LJIIL(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, java.util.List):void");
    }

    public final C1710830ucb LJIILJJIL(EnumC1710440uby enumC1710440uby, PaymentOption paymentOption) {
        String str;
        InterfaceC1631620sYq<PaymentOption, String, EnumC1710440uby, C1710830ucb> interfaceC1631620sYq;
        String value;
        C1710780ucW embeddedElementFromXml = getEmbeddedElementFromXml();
        boolean z = false;
        if (embeddedElementFromXml != null && embeddedElementFromXml.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            String str2 = paymentOption.LIZ;
            PaymentOption paymentOption2 = this.LLJJIII;
            if (paymentOption2 != null) {
                str = paymentOption2.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                C1709920ub8 c1709920ub8 = this.LLJJJJ;
                if (c1709920ub8 != null && (interfaceC1631620sYq = c1709920ub8.LIZ) != null) {
                    C1710780ucW embeddedElementFromXml2 = getEmbeddedElementFromXml();
                    if (embeddedElementFromXml2 == null || (value = embeddedElementFromXml2.getValue()) == null) {
                        value = "";
                    }
                    C1710830ucb c1710830ucbInvoke = interfaceC1631620sYq.invoke(paymentOption, value, enumC1710440uby);
                    if (c1710830ucbInvoke != null) {
                        C1710780ucW embeddedElementFromXml3 = getEmbeddedElementFromXml();
                        if (embeddedElementFromXml3 != null) {
                            embeddedElementFromXml3.LIZJ(c1710830ucbInvoke);
                        }
                        return c1710830ucbInvoke;
                    }
                }
                return null;
            }
        }
        LJII("verifyAndSaveNeededElement return null");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r12v20, types: [X.0ub5, android.view.View] */
    /* JADX WARN: Type inference failed for: r12v21, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams r29, com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment r30, X.C1709690ual r31, X.C1709920ub8 r32, X.C1709620uae r33, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r34, int r35, boolean r36, X.EnumC994640bzS r37) {
        /*
            Method dump skipped, instruction units count: 2017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709880ub4.LJ(com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams, com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, X.0ual, X.0ub8, X.0uae, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, int, boolean, X.0bzS):void");
    }
}
