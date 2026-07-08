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

/* JADX INFO: renamed from: X.03bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C874103bH extends FrameLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public PaymentMethod LLJ;
    public Function1<? super PaymentMethod, Unit> LLJI;

    public final void LIZIZ() {
        String str;
        PaymentMethod paymentMethod;
        Availability availability;
        PaymentMethod paymentMethod2 = this.LLJ;
        if (paymentMethod2 == null || (str = paymentMethod2.balance) == null || str.length() <= 0) {
            C0H1U.LIZIZ(getTvBalanceFromXml());
            return;
        }
        if (!LIZ() && ((paymentMethod = this.LLJ) == null || (availability = paymentMethod.availability) == null || !Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE))) {
            C0H1U.LIZIZ(getTvBalanceFromXml());
        } else {
            getTvBalanceFromXml().setText(str);
            C12ES.LJIILL(0, getTvBalanceFromXml());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874103bH.LIZLLL():void");
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
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m7u);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvBalanceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2h);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoBelowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z3u);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvExtraInfoRightFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tvExtraInfoRight);
            this.LLILZ = (TuxTextView) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5p);
            this.LLIZ = (TuxTextView) callbackFindViewById;
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

    public final boolean LIZ() {
        return getLayoutSubPaymentFromXml().isSelected();
    }

    public final PaymentMethod getSubPaymentMethod() {
        return this.LLJ;
    }

    public final Function1<PaymentMethod, Unit> getSubPromotionViewClickListener() {
        return this.LLJI;
    }

    public C874103bH(Context context) {
        super(context, null, 0);
        this.LLJI = AFwS228S0000000_1.get$arr$(688);
        C0H1U.LIZJ(R.layout.aqz, this, true);
    }

    public final void LIZJ(boolean z) {
        Integer numLIZIZ;
        PaymentTip paymentTip;
        PaymentMethod paymentMethod;
        String str;
        PaymentTip paymentTip2;
        PaymentMethod paymentMethod2 = this.LLJ;
        String str2 = null;
        if (paymentMethod2 != null && (paymentTip2 = paymentMethod2.paymentTip) != null) {
            numLIZIZ = PaymentTip.LIZIZ(paymentTip2, C960203pA.LIZIZ(getContext()), 2);
        } else {
            numLIZIZ = null;
        }
        PaymentMethod paymentMethod3 = this.LLJ;
        if (paymentMethod3 != null && paymentMethod3.LJJJZ() && (paymentMethod = this.LLJ) != null && (str = paymentMethod.installationTips) != null && str.length() > 0) {
            TuxTextView tvPaymentTipStyleFromXml = getTvPaymentTipStyleFromXml();
            PaymentMethod paymentMethod4 = this.LLJ;
            if (paymentMethod4 != null) {
                str2 = paymentMethod4.installationTips;
            }
            tvPaymentTipStyleFromXml.setText(str2);
            C12ES.LJIILL(0, getTvPaymentTipStyleFromXml());
            if (numLIZIZ != null) {
                getTvPaymentTipStyleFromXml().setTextColor(numLIZIZ.intValue());
            }
            C0H1U.LIZIZ(getTvBalanceFromXml());
            return;
        }
        PaymentMethod paymentMethod5 = this.LLJ;
        if (paymentMethod5 != null && (paymentTip = paymentMethod5.paymentTip) != null && C123100dR.LIZ(paymentTip.tips) && z) {
            C12ES.LJIILL(0, getTvPaymentTipStyleFromXml());
            getTvPaymentTipStyleFromXml().setText(paymentTip.tips);
            Integer numLIZIZ2 = PaymentTip.LIZIZ(paymentTip, C960203pA.LIZIZ(getContext()), 2);
            if (numLIZIZ2 != null) {
                getTvPaymentTipStyleFromXml().setTextColor(numLIZIZ2.intValue());
            } else {
                getTvPaymentTipStyleFromXml().setTextColorRes(R.attr.vd);
            }
            C0H1U.LIZIZ(getTvBalanceFromXml());
            return;
        }
        C0H1U.LIZIZ(getTvPaymentTipStyleFromXml());
    }

    public final void setChecked(boolean z) {
        int i;
        if (getLayoutSubPaymentFromXml().isSelected() == z) {
            return;
        }
        getLayoutSubPaymentFromXml().setSelected(z);
        if (!C870903al.LIZ() && z) {
            i = R.attr.a04;
        } else {
            i = R.attr.a1h;
        }
        getTvSubPaymentNameFromXml().setTextColorRes(i);
        LIZIZ();
        LIZLLL();
        LIZJ(z);
    }

    public final void setIvSubPaymentIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setLayoutSubPaymentFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setSubPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJ = paymentMethod;
    }

    public final void setSubPromotionViewClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setTvBalanceFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setTvExtraInfoBelowFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTvExtraInfoRightFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvPaymentTipStyleFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvPromotionDescFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTvSubPaymentNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }
}
