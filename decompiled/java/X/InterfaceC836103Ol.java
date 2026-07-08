package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;

/* JADX INFO: renamed from: X.03Ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC836103Ol {
    PaymentMethodsData Bu0();

    PaymentInfo eI1(PaymentMethod paymentMethod, InstallmentPlan installmentPlan, PaymentMethod paymentMethod2, String str);

    PaymentInfo np();

    void ts(PaymentInfo paymentInfo, boolean z);
}
