package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.02zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771402zo extends C035N<C731602tO> implements InterfaceC765602ys, C030I {
    public final C032I LIZJ;

    @Override // X.C030I
    public final C035M LJJIJ() {
        C033Y c033y = (C033Y) this.LIZJ.vr2(C033Y.class);
        if (c033y != null) {
            return c033y.LJJJLL();
        }
        return null;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731602tO(null);
    }

    @Override // X.C030I
    public final PaymentInfo getPaymentInfo() {
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy != null) {
            return interfaceC772402zy.LJIILIIL();
        }
        return null;
    }

    public C771402zo(C032I c032i) {
        this.LIZJ = c032i;
    }

    public final void LJLI(Summary summary) {
        String str;
        LJJZZIII(new AwS580S0100000_1(summary, 942));
        ((LinkedHashMap) this.LIZ).clear();
        if (summary != null) {
            str = summary.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            this.LIZ.putAll(mapLJIIJ);
        }
    }

    @Override // X.C035N, X.C036G
    public final void LJJIL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        LJL(billInfoData, paymentInfo);
    }

    public final void LJL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        if (billInfoData == null) {
            LJLI(null);
            return;
        }
        C03SE c03se = C03PI.LJIJI;
        PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
        LJLI(C756102xL.LIZ(billInfoData, (String) c443120HZeLJJJIL.getSecond(), ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue(), (List) c443120HZeLJJJIL.getThird(), null, this.LIZJ.Gd().LJJIJIIJIL(), false, 40).LLILZLL.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        LJL(billInfoData, paymentInfo);
    }
}
