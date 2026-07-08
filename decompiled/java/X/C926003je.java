package X;

import Y.ACListenerS105S0200000_1;
import Y.ACListenerS77S1100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.text.u;
import mf.a;

/* JADX INFO: renamed from: X.03je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C926003je extends LinearLayout implements InterfaceC884803d0 {
    public static final /* synthetic */ int LLJIJIL = 0;
    public PaymentMethod LL;
    public ElementDTO LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public Function1<? super List<PaymentElement>, Unit> LLILZLL;
    public final C01GW LLIZ;
    public ButtonInfo LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    private final TuxIconView getIconView() {
        return (TuxIconView) this.LLJI.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final C0HZQ getCheckBox() {
        return (C0HZQ) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        return Collections.singletonList(new PaymentElement("need_save", null, String.valueOf(getCheckBox().isChecked()), null, Boolean.FALSE));
    }

    public final ButtonInfo getButtonInfo() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLILLJJLI;
    }

    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLILZLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LL;
    }

    public C926003je(Context context) {
        super(context, null, 0);
        this.LLILLL = (int) C12ES.LIZJ(14.0f, context);
        C12ES.LIZJ(16.0f, context);
        this.LLILZ = (int) C12ES.LIZJ(4.0f, context);
        int iLIZJ = (int) C12ES.LIZJ(8.0f, context);
        this.LLILZIL = iLIZJ;
        this.LLILZLL = AFwS228S0000000_1.get$arr$(757);
        this.LLIZ = C452501pT.LIZIZ(new AwS402S0200000_1(context, this, 83));
        this.LLJ = C452501pT.LIZIZ(new AwS402S0200000_1(context, this, 85));
        this.LLJI = C452501pT.LIZIZ(new AwS402S0200000_1(context, this, 84));
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(16);
        C426750GoL.LJIIL(this, null, Integer.valueOf(iLIZJ), null, Integer.valueOf(iLIZJ), 21);
    }

    public final void setButtonInfo(ButtonInfo buttonInfo) {
        this.LLIZLLLIL = buttonInfo;
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LLILLJJLI = elementDTO;
    }

    @Override // X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLILZLL = function1;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LL = paymentMethod;
    }

    @Override // X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        String str;
        boolean z;
        String str2;
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        if (list != null && ((str = paymentMethod.id) == null || !u.LJJIIJZLJL(str, "pm_pi_ew_paypal_", false))) {
            C0HZQ checkBox = getCheckBox();
            PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list);
            if (paymentElement != null && (str2 = paymentElement.paramValue) != null) {
                z = Boolean.parseBoolean(str2);
            } else {
                z = false;
            }
            checkBox.setChecked(z);
        }
        ButtonInfo buttonInfo = this.LLIZLLLIL;
        if (buttonInfo != null && buttonInfo.globalButtonStyle == ButtonStyle.TOKO_STYLE && getContext() != null) {
            getCheckBox().setCheckBoxCheckedColor(C0HEZ.LIZ(R.attr.dt, getContext()));
        }
        getTitleView().setText(elementDTO.displayName);
        String str3 = paymentMethod.saveNotificationUrl;
        if (C703302op.LIZ(str3) && str3 != null) {
            C786410Ut5.LLLLLLZZ(getIconView(), 0);
            C786410Ut5.a9(getIconView(), new ACListenerS77S1100000_1(this, str3, 7));
        } else {
            C786410Ut5.LLLLLLZZ(getIconView(), 8);
        }
        View.OnClickListener aCListenerS105S0200000_1 = new ACListenerS105S0200000_1(this, paymentMethod, 16);
        if (C1848410yCV.LIZ) {
            aCListenerS105S0200000_1 = new f(aCListenerS105S0200000_1);
        }
        a aVar = new a(aCListenerS105S0200000_1);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
