package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C861503Yf extends C862703Yr {
    public final String LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        C861503Yf c861503Yf;
        if (!super.equals(obj)) {
            return false;
        }
        Long l = null;
        if ((obj instanceof C861503Yf) && (c861503Yf = (C861503Yf) obj) != null) {
            l = c861503Yf.LIZLLL;
        }
        return Intrinsics.LJFF(l, this.LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861503Yf(ElementDTO elementDTO, PaymentMethod paymentMethod) {
        super(elementDTO, paymentMethod);
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.LIZJ = null;
        this.LIZLLL = lValueOf;
    }
}
