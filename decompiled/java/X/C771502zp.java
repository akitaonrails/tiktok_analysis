package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;

/* JADX INFO: renamed from: X.02zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771502zp extends C035N<C730102t9> implements AnonymousClass0301 {
    public final C032I LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730102t9(0);
    }

    public C771502zp(C032I c032i) {
        this.LIZJ = c032i;
    }

    @Override // X.AnonymousClass0301
    public final ECRichText LJI(BillInfoData billInfoData) {
        PaymentInfo paymentInfoLJIILIIL;
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy != null) {
            paymentInfoLJIILIIL = interfaceC772402zy.LJIILIIL();
        } else {
            paymentInfoLJIILIIL = null;
        }
        C03SE c03se = C03PI.LJIJI;
        PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfoLJIILIIL, paymentMethodsData, true, true);
        boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
        return (ECRichText) billInfoData.LJIIIZ((String) c443120HZeLJJJIL.getSecond(), this.LIZJ.Gd().LJJIJIIJIL(), (List) c443120HZeLJJJIL.getThird(), zBooleanValue).getSecond();
    }
}
