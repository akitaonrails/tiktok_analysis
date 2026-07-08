package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C884703cz extends FrameLayout {
    public ElementDTO LL;
    public PaymentInfo LLILLJJLI;
    public InterfaceC884803d0 LLILLL;
    public Function1<? super String, Unit> LLILZ;
    public Function1<? super PaymentInfo, Unit> LLILZIL;

    public final InterfaceC884803d0 getElement() {
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

    public final void LIZIZ(PaymentMethodsData paymentMethodsData) {
        PaymentMethod paymentMethod;
        PaymentInfo paymentInfoLIZ;
        boolean z;
        InterfaceC884803d0 interfaceC884803d0 = this.LLILLL;
        ElementDTO elementDTO = this.LL;
        PaymentInfo paymentInfo = this.LLILLJJLI;
        Boolean bool = null;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        if (interfaceC884803d0 != null && elementDTO != null && paymentMethod != null) {
            String strLIZIZ = C888803de.LIZIZ(elementDTO, paymentMethod, interfaceC884803d0.getValue(), paymentMethodsData);
            PaymentInfo paymentInfo2 = this.LLILLJJLI;
            if (paymentInfo2 != null) {
                if (strLIZIZ == null) {
                    z = true;
                } else {
                    z = false;
                }
                paymentInfoLIZ = PaymentInfo.LIZ(paymentInfo2, null, null, Boolean.valueOf(z), null, null, null, null, 2039);
            } else {
                paymentInfoLIZ = null;
            }
            this.LLILZIL.invoke(paymentInfoLIZ);
            PaymentInfo paymentInfo3 = this.LLILLJJLI;
            if (paymentInfo3 != null) {
                if (paymentInfoLIZ != null) {
                    bool = paymentInfoLIZ.isValid;
                }
                paymentInfo3.isValid = bool;
            }
            interfaceC884803d0.LIZ(elementDTO, paymentMethod, interfaceC884803d0.getValue(), strLIZIZ);
        }
    }

    public final void setElement(InterfaceC884803d0 interfaceC884803d0) {
        this.LLILLL = interfaceC884803d0;
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

    public C884703cz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = AFwS228S0000000_1.get$arr$(740);
        this.LLILZIL = AFwS228S0000000_1.get$arr$(741);
    }

    public final void LIZ(ElementDTO elementDTO, PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData) {
        String str;
        List<PaymentElement> list;
        String str2;
        ElementDTO elementDTO2;
        ElementDTO elementDTO3;
        this.LL = elementDTO;
        this.LLILLJJLI = paymentInfo;
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod == null) {
            return;
        }
        InterfaceC884803d0 interfaceC884803d0 = this.LLILLL;
        if (interfaceC884803d0 != null && (elementDTO3 = interfaceC884803d0.getElementDTO()) != null) {
            str = elementDTO3.id;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, elementDTO.id)) {
            C903403g0 c903403g0 = InterfaceC884803d0.LJIL;
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            Context context = getContext();
            c903403g0.getClass();
            InterfaceC884803d0 interfaceC884803d0LIZ = C903403g0.LIZ(context, elementDTO, paymentMethod2);
            this.LLILLL = interfaceC884803d0LIZ;
            if (interfaceC884803d0LIZ != null && (elementDTO2 = interfaceC884803d0LIZ.getElementDTO()) != null) {
                str2 = elementDTO2.id;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str2, elementDTO.id)) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViews();
            }
            addView((View) this.LLILLL);
        }
        List<ElementDTO> listLIZJ = elementDTO.LIZJ();
        ArrayList arrayList = new ArrayList();
        for (ElementDTO elementDTO4 : listLIZJ) {
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null && (list = paymentMethodInfo.paymentElements) != null) {
                Iterator<PaymentElement> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        PaymentElement next = it2.next();
                        if (Intrinsics.LJFF(next.element, elementDTO4.id)) {
                            if (next != null) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        InterfaceC884803d0 interfaceC884803d02 = this.LLILLL;
        if (interfaceC884803d02 != null) {
            interfaceC884803d02.LIZ(elementDTO, paymentMethod, arrayList, null);
            if (interfaceC884803d02 instanceof AbstractC941303m7) {
                ((AbstractC941303m7) interfaceC884803d02).setOnVerify(new AwS100S0400000_1(elementDTO, paymentMethod, paymentMethodsData, this, 11));
            }
        }
    }
}
