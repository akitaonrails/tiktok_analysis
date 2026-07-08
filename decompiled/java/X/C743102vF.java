package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.02vF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C743102vF extends C035N<C730402tC> implements InterfaceC772102zv, AnonymousClass0320 {
    public final OrderSubmitAssemViewModel LIZJ;
    public C743202vG LIZLLL;
    public List<ShopOrderNew> LJ;

    @Override // X.AnonymousClass0320
    public final boolean LJJIJLIJ() {
        return false;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730402tC(0);
    }

    @Override // X.AnonymousClass0302
    public final C743202vG LJJIII() {
        return this.LIZLLL;
    }

    public C743102vF(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.AnonymousClass0320
    public final boolean LJIJJLI(BillInfoData billInfoData) {
        if (billInfoData == null || !(!C7806033c.LJI(billInfoData).isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC772102zv
    public final void LJIJJ(BillInfoData billInfoData, boolean z, Map<String, ? extends List<MainOrderInfo>> map) {
        C719502rR c719502rRLJII = C719002rM.LJII(billInfoData, z, this.LIZJ.z0, C03CV.GEN_TYPE_SUB_GIFT);
        List<C719202rO> list = c719502rRLJII.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<C719202rO> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator<C723002s0> it3 = it2.next().LLJIJIL.iterator();
                while (it3.hasNext()) {
                    Iterator<C719102rN> it4 = it3.next().LLJ.iterator();
                    while (it4.hasNext()) {
                        List<C798803Ac> list2 = it4.next().LLLLLJLJLL;
                        if (list2 != null) {
                            arrayList.addAll(list2);
                        }
                    }
                }
            }
        }
        C719202rO c719202rO = null;
        C723002s0 c723002s0 = null;
        for (C719202rO c719202rO2 : c719502rRLJII.LLILLJJLI) {
            for (C723002s0 c723002s02 : c719202rO2.LLJIJIL) {
                C719102rN c719102rN = c723002s02.LLJLIL;
                if (c719102rN != null) {
                    c719102rN.LLLLLJLJLL = arrayList;
                    c719202rO = c719202rO2;
                    c723002s0 = c723002s02;
                }
            }
        }
        if (c719202rO != null) {
            boolean z2 = true;
            if (c719502rRLJII.LLILLJJLI.size() <= 1 && !(!map.isEmpty())) {
                z2 = false;
            }
            c719202rO.LLJJLIIIJLLLLLLLZ = z2;
        }
        Pair pair = new Pair(c719202rO, c723002s0);
        this.LIZLLL = new C743202vG(pair);
        C723002s0 c723002s03 = (C723002s0) pair.getSecond();
        if (c723002s03 != null) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZJ;
            orderSubmitAssemViewModel.getClass();
            orderSubmitAssemViewModel.setState(new AwS580S0100000_1(c723002s03, 400));
        }
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        this.LJ = billInfoData.LIZIZ();
    }
}
