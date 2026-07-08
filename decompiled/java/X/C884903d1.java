package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C884903d1 extends FrameLayout implements InterfaceC1164530gPT {
    public ElementDTO LL;
    public PaymentInfo LLILLJJLI;
    public C958503ot LLILLL;
    public Function1<? super String, Unit> LLILZ;
    public Function1<? super PaymentInfo, Unit> LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_payment_element_request_focus", this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_payment_element_request_focus", this);
        }
    }

    public final C958503ot getElement() {
        return this.LLILLL;
    }

    public final ElementDTO getElementDTO() {
        return this.LL;
    }

    public final Function1<String, Unit> getLogVerify() {
        return this.LLILZ;
    }

    public final Function1<PaymentInfo, Unit> getOnPaymentInfoChangeListener() {
        return this.LLILZIL;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LLILLJJLI;
    }

    public final void setElement(C958503ot c958503ot) {
        this.LLILLL = c958503ot;
    }

    public final void setElementDTO(ElementDTO elementDTO) {
        this.LL = elementDTO;
    }

    public final void setLogVerify(Function1<? super String, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setOnPaymentInfoChangeListener(Function1<? super PaymentInfo, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LLILLJJLI = paymentInfo;
    }

    public C884903d1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = AFwS228S0000000_1.get$arr$(662);
        this.LLILZIL = AFwS228S0000000_1.get$arr$(663);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_payment_element_request_focus")) {
            HandlerHook.viewPostDelay(this, new ARunnableS101S0100000_1((Object) this, 4), 200L);
        }
    }
}
