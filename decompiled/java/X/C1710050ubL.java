package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ubL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710050ubL extends FrameLayout {
    public View LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public SmartImageView LLILZIL;
    public TuxTextView LLILZLL;
    public C1710060ubM LLIZ;
    public TuxTextView LLIZLLLIL;
    public SmartImageView LLJ;
    public TuxTextView LLJI;
    public SmartImageView LLJIJIL;
    public TuxTextView LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public C1709620uae LLJILLL;
    public LynxTtlsPdpCashierView LLJJ;
    public List<String> LLJJI;
    public C1708680uZ8 LLJJIII;

    public final View getEmptyRootView() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.h36);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getEmptyTextView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h37);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getHybridPmLeftAmountView() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jtr);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getHybridPmLeftIconView() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jts);
            this.LLJ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getHybridPmRightAmountView() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jtu);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getHybridPmRightIconView() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jtv);
            this.LLJIJIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final View getHybridPmRootView() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.jtx);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final C1710060ubM getPromotionTagView() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sb_);
            this.LLIZ = (C1710060ubM) callbackFindViewById;
        }
        return (C1710060ubM) callbackFindViewById;
    }

    public final SmartImageView getSinglePmIconView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vce);
            this.LLILZIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getSinglePmInstallmentPlanView() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vcf);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSinglePmNameView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vcg);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getSinglePmRootView() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vch);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final List<String> getCurrentShowingPMKeys() {
        return this.LLJJI;
    }

    public final LynxTtlsPdpCashierView getLynxCashierView() {
        return this.LLJJ;
    }

    public final C1709620uae getPaymentMethodLogger() {
        return this.LLJILLL;
    }

    public final C1708680uZ8 getPaymentModuleLogger() {
        return this.LLJJIII;
    }

    public final Function0<Unit> getRefreshCallback() {
        return this.LLJILJILJ;
    }

    public C1710050ubL(Context context) {
        super(context, null, 0);
        addView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dw_, this, false), new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public static void LIZ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttls_pdp_cashier_view, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setCurrentShowingPMKeys(List<String> list) {
        this.LLJJI = list;
    }

    public final void setEmptyRootView(View view) {
        this.LL = view;
    }

    public final void setEmptyTextView(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setHybridPmLeftAmountView(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setHybridPmLeftIconView(SmartImageView smartImageView) {
        this.LLJ = smartImageView;
    }

    public final void setHybridPmRightAmountView(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setHybridPmRightIconView(SmartImageView smartImageView) {
        this.LLJIJIL = smartImageView;
    }

    public final void setHybridPmRootView(View view) {
        this.LLILZ = view;
    }

    public final void setLynxCashierView(LynxTtlsPdpCashierView lynxTtlsPdpCashierView) {
        this.LLJJ = lynxTtlsPdpCashierView;
    }

    public final void setPaymentMethodLogger(C1709620uae c1709620uae) {
        this.LLJILLL = c1709620uae;
    }

    public final void setPaymentModuleLogger(C1708680uZ8 c1708680uZ8) {
        this.LLJJIII = c1708680uZ8;
    }

    public final void setPromotionTagView(C1710060ubM c1710060ubM) {
        this.LLIZ = c1710060ubM;
    }

    public final void setRefreshCallback(Function0<Unit> function0) {
        this.LLJILJILJ = function0;
    }

    public final void setSinglePmIconView(SmartImageView smartImageView) {
        this.LLILZIL = smartImageView;
    }

    public final void setSinglePmInstallmentPlanView(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setSinglePmNameView(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setSinglePmRootView(View view) {
        this.LLILLL = view;
    }

    public final void LIZIZ(SmartImageView smartImageView, PaymentOption paymentOption) {
        String strLIZ;
        POIcon pOIcon = paymentOption.displayInfo.icon;
        if (pOIcon == null || (strLIZ = pOIcon.LIZ(getContext())) == null) {
            strLIZ = " ";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LJIIIZ.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C12ES.LIZJ(2.0f, getContext());
        smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
    }
}
