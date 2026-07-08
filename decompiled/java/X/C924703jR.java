package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C924703jR extends AbstractC1746380vXw<Object> {
    public final LifecycleOwner LLILZIL;
    public final EnterParams LLILZLL;

    @Override // X.AbstractC1746380vXw
    public final IComponentStrategyService<?> LLLIL() {
        return new DefaultPaymentStrategyService();
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    public C924703jR(PaymentFragment paymentFragment, EnterParams enterParams) {
        super(paymentFragment, new AbstractC339510DSr<Object>() { // from class: X.03ZL
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Object obj, Object obj2) {
                Boolean boolIsAvailable;
                Boolean boolIsAvailable2;
                if (Intrinsics.LJFF(obj, obj2)) {
                    Boolean boolIsAvailable3 = null;
                    if ((obj instanceof C03ZA) && (obj2 instanceof C03ZA)) {
                        C03ZA c03za = (C03ZA) obj;
                        Availability availability = c03za.LIZ.availability;
                        if (availability != null) {
                            boolIsAvailable2 = availability.isAvailable();
                        } else {
                            boolIsAvailable2 = null;
                        }
                        C03ZA c03za2 = (C03ZA) obj2;
                        Availability availability2 = c03za2.LIZ.availability;
                        if (availability2 != null) {
                            boolIsAvailable3 = availability2.isAvailable();
                        }
                        if (Intrinsics.LJFF(boolIsAvailable2, boolIsAvailable3) && Intrinsics.LJFF(c03za.LIZ.balance, c03za2.LIZ.balance)) {
                            return true;
                        }
                        return false;
                    }
                    if ((obj instanceof C866803a6) && (obj2 instanceof C866803a6)) {
                        C862703Yr c862703Yr = (C862703Yr) obj;
                        Availability availability3 = c862703Yr.LIZIZ.availability;
                        if (availability3 != null) {
                            boolIsAvailable = availability3.isAvailable();
                        } else {
                            boolIsAvailable = null;
                        }
                        C862703Yr c862703Yr2 = (C862703Yr) obj2;
                        Availability availability4 = c862703Yr2.LIZIZ.availability;
                        if (availability4 != null) {
                            boolIsAvailable3 = availability4.isAvailable();
                        }
                        if (Intrinsics.LJFF(boolIsAvailable, boolIsAvailable3) && Intrinsics.LJFF(c862703Yr.LIZIZ.balance, c862703Yr2.LIZIZ.balance)) {
                            return true;
                        }
                        return false;
                    }
                }
                return Intrinsics.LJFF(obj, obj2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Object obj, Object obj2) {
                if ((obj instanceof C03ZA) && (obj2 instanceof C03ZA)) {
                    return C899503fN.LIZIZ(((C03ZA) obj).LIZ, ((C03ZA) obj2).LIZ);
                }
                if ((obj instanceof C862703Yr) && (obj2 instanceof C862703Yr)) {
                    C862703Yr c862703Yr = (C862703Yr) obj;
                    C862703Yr c862703Yr2 = (C862703Yr) obj2;
                    if (Intrinsics.LJFF(c862703Yr.LIZ.id, c862703Yr2.LIZ.id) && C899503fN.LIZIZ(c862703Yr.LIZIZ, c862703Yr2.LIZIZ)) {
                        return true;
                    }
                    return false;
                }
                if ((obj instanceof C03YR) && (obj2 instanceof C03YR)) {
                    return true;
                }
                return Intrinsics.LJFF(obj, obj2);
            }
        }, "payment_method", null, null, 248);
        this.LLILZIL = paymentFragment;
        this.LLILZLL = enterParams;
    }
}
