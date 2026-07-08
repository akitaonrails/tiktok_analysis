package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903203fy extends ConstraintLayout {
    public C1841350y17 LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public ConstraintLayout LLILZ;
    public TuxTextView LLILZIL;
    public Function1<? super C873003b6, Unit> LLILZLL;
    public Function1<? super String, Unit> LLIZ;
    public C873003b6 LLIZLLLIL;
    public ButtonStyle LLJ;

    public final SmartImageView getBankIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.br3);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getBankNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.br4);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getPromotionDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.saj);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    private final String getIcon() {
        if ((getContext().getResources().getConfiguration().uiMode & 48) == 32) {
            C873003b6 c873003b6 = this.LLIZLLLIL;
            if (c873003b6 != null) {
                return c873003b6.LIZIZ;
            }
            return null;
        }
        C873003b6 c873003b62 = this.LLIZLLLIL;
        if (c873003b62 != null) {
            return c873003b62.LIZ;
        }
        return null;
    }

    public final C873003b6 getBankInfo() {
        return this.LLIZLLLIL;
    }

    public final Function1<C873003b6, Unit> getOnCheckedListener() {
        return this.LLILZLL;
    }

    public final Function1<String, Unit> getOnPromotionClickListener() {
        return this.LLIZ;
    }

    public final ButtonStyle getStyle() {
        return this.LLJ;
    }

    public final void setBankIconFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setBankInfo(C873003b6 c873003b6) {
        this.LLIZLLLIL = c873003b6;
        SmartImageView bankIconFromXml = getBankIconFromXml();
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        String icon = getIcon();
        String str = null;
        if (icon == null || icon.length() <= 0) {
            icon = " ";
        }
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
        c1331670kl3LIZLLL.LJJI(bankIconFromXml);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C12ES.LIZJ(2.0f, getContext());
        bankIconFromXml.setCircleOptions(new C1331730kl9(c1331750klB));
        TuxTextView bankNameFromXml = getBankNameFromXml();
        C873003b6 c873003b62 = this.LLIZLLLIL;
        if (c873003b62 != null) {
            str = c873003b62.LIZLLL;
        }
        bankNameFromXml.setText(str);
        ConstraintLayout containerFromXml = getContainerFromXml();
        if (containerFromXml != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 98), containerFromXml);
        }
    }

    public final void setBankNameFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setChecked(boolean z) {
        InstallmentInfo installmentInfo;
        PaymentPromotion paymentPromotion;
        InstallmentInfo installmentInfo2;
        PaymentMethod paymentMethod;
        LifecycleCoroutineScope lifecycleScope;
        getRadioFromXml().setChecked(z);
        if (z) {
            C0H1U.LIZIZ(getPromotionDescFromXml());
            return;
        }
        TuxTextView promotionDescFromXml = getPromotionDescFromXml();
        C873003b6 c873003b6 = this.LLIZLLLIL;
        if (c873003b6 != null && (installmentInfo = c873003b6.LJ) != null && (paymentPromotion = installmentInfo.promotionInfo) != null) {
            String desc = paymentPromotion.getDesc();
            if (desc != null) {
                C12ES.LJIILL(0, promotionDescFromXml);
                promotionDescFromXml.setText(desc);
                C03SY c03sy = C03SY.LIZ;
                C873003b6 c873003b62 = this.LLIZLLLIL;
                if (c873003b62 != null) {
                    installmentInfo2 = c873003b62.LJ;
                    paymentMethod = c873003b62.LJFF;
                } else {
                    installmentInfo2 = null;
                    paymentMethod = null;
                }
                LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(this);
                if (lifecycleOwnerLIZ != null) {
                    lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ);
                } else {
                    lifecycleScope = null;
                }
                AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(promotionDescFromXml, this, 275);
                c03sy.getClass();
                C03SY.LJIILJJIL(installmentInfo2, paymentMethod, "ccdc_card_info", lifecycleScope, null, awS367S0200000_1);
                return;
            }
            C0H1U.LIZIZ(promotionDescFromXml);
            return;
        }
        C0H1U.LIZIZ(promotionDescFromXml);
    }

    public final void setContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setOnCheckedListener(Function1<? super C873003b6, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setOnPromotionClickListener(Function1<? super String, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setPromotionDescFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LL = c1841350y17;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLJ = buttonStyle;
        if (buttonStyle == ButtonStyle.TOKO_STYLE) {
            getRadioFromXml().LIZ(C0HEZ.LIZ(R.attr.dt, getContext()), C0HEZ.LIZ(R.attr.a01, getContext()));
        }
    }

    public C903203fy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        ViewGroup.inflate(context, R.layout.ahp, this);
    }
}
