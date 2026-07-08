package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.02zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771202zm extends C035N<C731402tM> implements InterfaceC765602ys, C030B {
    public final C032I LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731402tM(null);
    }

    @Override // X.C030B
    public final PaymentInfo getPaymentInfo() {
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy != null) {
            return interfaceC772402zy.LJIILIIL();
        }
        return null;
    }

    public C771202zm(C032I c032i) {
        this.LIZJ = c032i;
    }

    @Override // X.C035N, X.C036G
    public final void LJJIL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        LJL(billInfoData, paymentInfo);
    }

    public final void LJL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        PaymentMethodsData paymentMethodsData;
        Summary summary;
        Map mapLJIIZILJ;
        Map<String, String> map;
        C03SE c03se = C03PI.LJIJI;
        String str = null;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
        boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
        String str2 = (String) c443120HZeLJJJIL.getSecond();
        List list = (List) c443120HZeLJJJIL.getThird();
        if (billInfoData != null) {
            if (paymentInfo != null && (map = paymentInfo.LIZLLL) != null) {
                mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
            } else {
                mapLJIIZILJ = null;
            }
            summary = C722002rq.LJFF(billInfoData, str2, zBooleanValue, 0, list, mapLJIIZILJ, this.LIZJ.Gd().LJJIJIIJIL(), 4).LLJJLIIIJLLLLLLLZ;
        } else {
            summary = null;
        }
        LJJZZIII(new AwS580S0100000_1(summary, 546));
        ((LinkedHashMap) this.LIZ).clear();
        if (summary != null) {
            str = summary.daInfo;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            this.LIZ.putAll(mapLJIIJ);
        }
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        LJL(billInfoData, paymentInfo);
    }
}
