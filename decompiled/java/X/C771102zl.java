package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771102zl extends C035N<C731502tN> implements InterfaceC765602ys, C030J {
    public final C032I LIZJ;

    @Override // X.C030J
    public final boolean LJIIIZ() {
        C741702v1 c741702v1LJIIZILJ;
        InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZJ.vr2(InterfaceC767902zF.class);
        if (interfaceC767902zF == null || (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) == null) {
            return false;
        }
        return Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.TRUE);
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731502tN(null);
    }

    @Override // X.C030J
    public final PaymentInfo getPaymentInfo() {
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy != null) {
            return interfaceC772402zy.LJIILIIL();
        }
        return null;
    }

    public C771102zl(C032I c032i) {
        this.LIZJ = c032i;
    }

    public final void LJLI(Summary summary) {
        String str;
        LJJZZIII(new AwS580S0100000_1(summary, 851));
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
