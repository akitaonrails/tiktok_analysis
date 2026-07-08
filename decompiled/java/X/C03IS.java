package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.03IS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IS implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final OspBottomViewModel LIZIZ;

    public C03IS(OspBottomViewModel ospBottomViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = ospBottomViewModel;
    }

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
        orderSubmitAssemViewModel.getClass();
        List<InterfaceC1891350zJl> list = orderSubmitAssemViewModel.getState().LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C719702rT) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C719702rT c719702rT = (C719702rT) it2.next();
                if (c719702rT.LIZLLL() && c719702rT.LIZIZ() == null) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            return null;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJI(orderSubmitAssemViewModel2, C2107308Nj.LIZ.LLIILII(), new C826603Ku(this, str, str2, null));
        return C03LS.SNS_PERIOD;
    }
}
