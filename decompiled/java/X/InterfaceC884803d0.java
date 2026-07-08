package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC884803d0 {
    public static final C903403g0 LJIL = C903403g0.LIZ;

    void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj);

    ElementDTO getElementDTO();

    List<PaymentElement> getValue();

    void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1);
}
