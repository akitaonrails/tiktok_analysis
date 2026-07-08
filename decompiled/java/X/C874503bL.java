package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C874503bL {
    public final /* synthetic */ InterfaceC885103d3 LIZ;

    public C874503bL(InterfaceC885103d3 interfaceC885103d3) {
        this.LIZ = interfaceC885103d3;
    }

    public final void LIZ(View view, PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        Map<String, ? extends Object> map;
        boolean zLIZIZ;
        boolean z;
        boolean zLIZIZ2;
        String str;
        String str2;
        String str3;
        Boolean boolValueOf;
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData;
        List<PaymentMethod> list;
        this.LIZ.getViewModel().OG(true);
        C043B<?> viewModel = this.LIZ.getViewModel();
        C1DFH c1dfh = C0PEM.LIZ;
        Boolean boolValueOf2 = null;
        viewModel.W6(C2107308Nj.LIZ, new C874603bM(this.LIZ, view, null));
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            InterfaceC885103d3 interfaceC885103d3 = this.LIZ;
            C03QL c03qlSA0 = interfaceC885103d3.getViewModel().sA0();
            if (c03qlSA0 != null) {
                SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = interfaceC885103d3.getViewModel().LLIIIJ();
                if (skuEnterParamsLLIIIJ != null) {
                    map = skuEnterParamsLLIIIJ.trackParams;
                } else {
                    map = null;
                }
                C03WH c03whLIZLLL = c03qlSA0.LIZLLL(map);
                if (c03whLIZLLL != null) {
                    String strLJJIIZ = paymentMethod.LJJIIZ();
                    String str4 = paymentMethod.extraInfo;
                    if (str4 != null) {
                        zLIZIZ = C770702zh.LIZIZ(str4);
                    } else {
                        zLIZIZ = false;
                    }
                    C03QL c03qlSA02 = interfaceC885103d3.getViewModel().sA0();
                    if (c03qlSA02 != null && (billInfoData = c03qlSA02.LLJJJJLIIL) != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (list = paymentMethodsData.storedMethods) != null) {
                        Iterator<PaymentMethod> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it2.next();
                            if (Intrinsics.LJFF(next.id, paymentMethod.id)) {
                                if (next != null) {
                                    z = true;
                                }
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    String str5 = paymentMethod.balance;
                    if (str5 != null) {
                        zLIZIZ2 = C770702zh.LIZIZ(str5);
                    } else {
                        zLIZIZ2 = false;
                    }
                    Availability availability = paymentMethod.availability;
                    if (availability != null) {
                        str = availability.unavailableCode;
                    } else {
                        str = null;
                    }
                    BindInfo bindInfo = paymentMethod.bindInfo;
                    if (bindInfo != null) {
                        str2 = bindInfo.bindStatus;
                    } else {
                        str2 = null;
                    }
                    if (availability != null) {
                        str3 = availability.statusCode;
                    } else {
                        str3 = null;
                    }
                    String strLJIJJ = paymentMethod.LJIJJ(false);
                    if (strLJIJJ != null) {
                        boolValueOf = Boolean.valueOf(C770702zh.LIZIZ(strLJIJJ));
                    } else {
                        boolValueOf = null;
                    }
                    if (paymentMethod.missingElements != null) {
                        boolValueOf2 = Boolean.valueOf(paymentMethod.LJJIFFI());
                    }
                    C03WH.LJIJ(c03whLIZLLL, strLJJIIZ, zLIZIZ, 0, z, zLIZIZ2, str, str2, str3, boolValueOf, boolValueOf2, null, paymentMethod, null, null, paymentMethod.LJJIJ(), false, 446464);
                }
            }
        }
    }
}
