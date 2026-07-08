package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZI extends FrameLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public PaymentMethod LLJ;
    public boolean LLJI;
    public Function1<? super PaymentMethod, Unit> LLJIJIL;

    public final void LIZ() {
        String str;
        PaymentMethod paymentMethod;
        Availability availability;
        PaymentMethod paymentMethod2 = this.LLJ;
        if (paymentMethod2 == null || (str = paymentMethod2.balance) == null || str.length() <= 0) {
            C0H1U.LIZIZ(getTvBalanceFromXml());
            return;
        }
        if (!getLayoutSubPaymentFromXml().isSelected() && ((paymentMethod = this.LLJ) == null || (availability = paymentMethod.availability) == null || !Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE))) {
            C0H1U.LIZIZ(getTvBalanceFromXml());
        } else {
            getTvBalanceFromXml().setText(str);
            C12ES.LJIILL(0, getTvBalanceFromXml());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZI.LIZIZ():void");
    }

    public final TuxIconView getIvSubPaymentIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l7m);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getLayoutSubPaymentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m7u);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvBalanceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2h);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoBelowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z3u);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoRightFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tvExtraInfoRight);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentTipStyleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5c);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPromotionDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5p);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvSubPaymentNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z73);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final PaymentMethod getSubPaymentMethod() {
        return this.LLJ;
    }

    public final Function1<PaymentMethod, Unit> getSubPromotionClickListener() {
        return this.LLJIJIL;
    }

    public final boolean getTokoStyle() {
        return this.LLJI;
    }

    public C03ZI(Context context) {
        super(context, null, 0);
        this.LLJIJIL = AFwS228S0000000_1.get$arr$(22);
        C0H1U.LIZJ(R.layout.aoz, this, true);
    }

    public final void setChecked(boolean z) {
        PaymentTip paymentTip;
        if (getLayoutSubPaymentFromXml().isSelected() == z) {
            return;
        }
        getLayoutSubPaymentFromXml().setSelected(z);
        LIZ();
        LIZIZ();
        PaymentMethod paymentMethod = this.LLJ;
        if (paymentMethod != null && (paymentTip = paymentMethod.paymentTip) != null && C123100dR.LIZ(paymentTip.tips) && z) {
            C12ES.LJIILL(0, getTvPaymentTipStyleFromXml());
            getTvPaymentTipStyleFromXml().setText(paymentTip.tips);
            Integer numLIZIZ = PaymentTip.LIZIZ(paymentTip, C960203pA.LIZIZ(getContext()), 2);
            if (numLIZIZ != null) {
                getTvPaymentTipStyleFromXml().setTextColor(numLIZIZ.intValue());
            } else {
                getTvPaymentTipStyleFromXml().setTextColorRes(R.attr.vd);
            }
            C0H1U.LIZIZ(getTvBalanceFromXml());
            return;
        }
        C0H1U.LIZIZ(getTvPaymentTipStyleFromXml());
    }

    public final void setIvSubPaymentIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setLayoutSubPaymentFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setSubPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJ = paymentMethod;
    }

    public final void setSubPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setTokoStyle(boolean z) {
        this.LLJI = z;
    }

    public final void setTvBalanceFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTvExtraInfoBelowFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvExtraInfoRightFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvPaymentTipStyleFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvPromotionDescFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setTvSubPaymentNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }
}
