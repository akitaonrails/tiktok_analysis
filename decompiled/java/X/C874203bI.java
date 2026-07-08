package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C874203bI extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public boolean LLIZ;
    public Function0<Unit> LLIZLLLIL;

    public final LinearLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getExtraInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hiq);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getInstallmentDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ktb);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getInstallmentLinkContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ktf);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getInstallmentLinkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kte);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getInstallmentTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kti);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final Function0<Unit> getOnClick() {
        return this.LLIZLLLIL;
    }

    public final void setChecked$ecommerce_transaction_release(boolean z) {
        int i;
        if (z) {
            if (this.LLIZ) {
                i = R.drawable.b35;
            } else {
                i = R.drawable.b33;
            }
        } else {
            i = R.drawable.b37;
        }
        getContainerFromXml().setBackgroundResource(i);
    }

    public final void setContainerFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setExtraInfoFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setInstallmentDescFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setInstallmentLinkContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setInstallmentLinkFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setInstallmentTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setOnClick(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public C874203bI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0H1U.LIZJ(R.layout.akv, this, true);
    }

    public final void LIZ(String str, String str2, Boolean bool, Boolean bool2, String str3, boolean z, Function0<Unit> function0, Function1<? super PaymentMethod, Unit> function1, PaymentMethod paymentMethod) {
        String strLJIJJ;
        if (str != null) {
            getInstallmentTitleFromXml().setText(str);
        }
        if (str2 != null) {
            getInstallmentDescFromXml().setText(str2);
        }
        Boolean bool3 = Boolean.TRUE;
        boolean z2 = false;
        if (Intrinsics.LJFF(bool2, bool3)) {
            C12ES.LJIILL(0, getInstallmentLinkContainerFromXml());
            if (str3 != null) {
                getInstallmentLinkFromXml().setText(str3);
            }
        } else {
            C0H1U.LIZIZ(getInstallmentLinkContainerFromXml());
        }
        C786410Ut5.I7(new AjS60S0100000_1((Function0) function0, 26), getContainerFromXml());
        if (paymentMethod != null) {
            strLJIJJ = paymentMethod.LJIJJ(Intrinsics.LJFF(bool, bool3));
        } else {
            strLJIJJ = null;
        }
        if (strLJIJJ == null || !C770702zh.LIZIZ(strLJIJJ)) {
            if (paymentMethod != null) {
                strLJIJJ = paymentMethod.extraInfo;
            } else {
                strLJIJJ = null;
            }
        }
        if (C770702zh.LIZIZ(strLJIJJ) && strLJIJJ != null) {
            C12ES.LJIILL(0, getExtraInfoFromXml());
            C03SE c03se = C03PI.LJIJI;
            Context context = getContext();
            TuxTextView extraInfoFromXml = getExtraInfoFromXml();
            boolean zLJFF = Intrinsics.LJFF(bool, bool3);
            c03se.getClass();
            C03SE.LJJIJLIJ(strLJIJJ, context, extraInfoFromXml, zLJFF, 1, paymentMethod, function1);
        } else {
            new AwS545S0100000_1(this, 1198);
        }
        if (z) {
            z2 = true;
        }
        this.LLIZ = z2;
        setChecked$ecommerce_transaction_release(Intrinsics.LJFF(bool, bool3));
    }
}
