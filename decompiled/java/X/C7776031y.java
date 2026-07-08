package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.031y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7776031y extends C035N<C7777031z> implements C031N, InterfaceC772402zy {
    public final OrderSubmitAssemViewModel LIZJ;
    public C031O LIZLLL = new C031O(0);
    public Boolean LJ;

    @Override // X.C031N
    public final Boolean LJIIL() {
        Boolean bool = this.LJ;
        this.LJ = null;
        return bool;
    }

    @Override // X.InterfaceC772402zy
    public final PaymentInfo LJIILIIL() {
        return this.LIZJ.LLJJJ;
    }

    @Override // X.C031N
    public final Boolean LJJIIJZLJL() {
        return this.LIZJ.LLJLIL;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C7777031z(null);
    }

    @Override // X.C031N
    public final C031O LJJJJL() {
        return this.LIZLLL;
    }

    public C7776031y(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC772402zy
    public final boolean LJJJJZI(BillInfoData billInfoData) {
        AnonymousClass0320 anonymousClass0320 = (AnonymousClass0320) this.LIZJ.vr2(AnonymousClass0320.class);
        if (anonymousClass0320 == null) {
            anonymousClass0320 = new AnonymousClass0320() { // from class: X.0321
                @Override // X.AnonymousClass0320
                public final boolean LJIJJLI(BillInfoData billInfoData2) {
                    return true;
                }

                @Override // X.AnonymousClass0320
                public final boolean LJJIJLIJ() {
                    return false;
                }
            };
        }
        boolean zLJIJJLI = anonymousClass0320.LJIJJLI(billInfoData);
        boolean zLJJIJLIJ = anonymousClass0320.LJJIJLIJ();
        if (zLJIJJLI && !zLJJIJLIJ) {
            return false;
        }
        return true;
    }

    @Override // X.C035N, X.C036G
    public final void LJJIL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        LJJZZIII(new AwS580S0100000_1(paymentInfo, 457));
        LJL(billInfoData, paymentInfo);
    }

    public final void LJL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        List<PaymentMethod> list;
        String strLJJLIIIJ;
        PaymentMethod paymentMethod;
        PaymentMethodsData paymentMethodsData;
        List<PaymentMethod> listLJIJI;
        int iIntValue;
        Integer num;
        PaymentMethodsData paymentMethodsData2;
        ((LinkedHashMap) this.LIZ).clear();
        Map<String, Object> map = this.LIZ;
        if (billInfoData != null && (paymentMethodsData2 = billInfoData.paymentMethods) != null) {
            list = paymentMethodsData2.paymentMethods;
        } else {
            list = null;
        }
        map.put("is_cod_available", Integer.valueOf(C03QF.LJI(list) ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (listLJIJI = paymentMethodsData.LJIJI()) != null) {
            int i2 = 0;
            for (PaymentMethod paymentMethod2 : listLJIJI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PaymentMethod paymentMethod3 = paymentMethod2;
                    PaymentMethodsData paymentMethodsData3 = billInfoData.paymentMethods;
                    if (paymentMethodsData3 != null && (num = paymentMethodsData3.recommendMethodShowCount) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (i2 < iIntValue) {
                        arrayList.add(paymentMethod3.LJJIIZ());
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        String strLJJIIZ = "";
        if (arrayList.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        map.put("payment_option", strLJJLIIIJ);
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJJIIZ = paymentMethod.LJJIIZ();
        }
        map.put("pay_type", strLJJIIZ);
        if (paymentInfo != null && paymentInfo.paymentMethod != null) {
            i = 1;
        }
        map.put("is_pay_info_complete", Integer.valueOf(i));
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        LJJZZIII(new AwS580S0100000_1(paymentInfo, 456));
        LJL(billInfoData, paymentInfo);
    }

    @Override // X.C031N
    public final void LJJJJJ(PaymentMethod paymentMethod, boolean z, CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList, Boolean bool) {
        this.LIZLLL = new C031O(paymentMethod, z, copyOnWriteArrayList);
        this.LJ = bool;
    }
}
