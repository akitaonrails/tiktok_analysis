package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03NF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$cancelOrder$1", f = "MiniOspViewModel.kt", l = {3433}, m = "invokeSuspend")
public final class C03NF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MiniOspViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03NF(MiniOspViewModel miniOspViewModel, InterfaceC1364105Vn<? super C03NF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = miniOspViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03NF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ShopOrderNew> list;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list2;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list3;
        PackedSku packedSku;
        List<Integer> list4;
        String str;
        C1C7U.LIZ("MiniOspViewModel@8f4.cancelOrder$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MiniOspViewModel miniOspViewModel = this.LLILLJJLI;
            BillInfoData billInfoData = miniOspViewModel.LLIZ;
            if (billInfoData != null && (list = billInfoData.newShopOrders) != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLZIJ(0, list)) != null && (list2 = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) C13LP.LJJJLZIJ(0, list2)) != null && (list3 = mainOrderInfo.packedSkus) != null && (packedSku = (PackedSku) C13LP.LJJJLZIJ(0, list3)) != null && (list4 = packedSku.productSaleModes) != null) {
                Integer num = (Integer) C13LP.LJJJLL(list4);
                int value = C00BN.PAID_COUPON.getValue();
                if (num != null && num.intValue() == value && miniOspViewModel.LLL == C03N3.NATIVE_SCENE.getValue()) {
                    C859403Xk c859403Xk = OrderSubmitApi.LIZ;
                    List<String> list5 = this.LLILLJJLI.LLLJ.LIZ;
                    String string = null;
                    if (list5 != null) {
                        str = (String) C13LP.LJJJLL(list5);
                    } else {
                        str = null;
                    }
                    CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(str, null, null, null, null);
                    Integer num2 = this.LLILLJJLI.LLLILZJ;
                    if (num2 != null) {
                        string = num2.toString();
                    }
                    cancelOrderRequest.LIZ = string;
                    this.LL = 1;
                    obj = c859403Xk.LIZJ(cancelOrderRequest, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("MiniOspViewModel@8f4.cancelOrder$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MiniOspViewModel@8f4.cancelOrder$1");
            return unit;
        }
        C03O1 c03o1 = this.LLILLJJLI.LLILZLL;
        Integer num3 = ((CancelOrderResponse) obj).code;
        if (num3 != null && num3.intValue() == 0) {
            i2 = 1;
        }
        c03o1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("product_type", 1);
        linkedHashMap.put("is_success", Integer.valueOf(i2));
        C03O1.LJJIJIIJIL("rd_cancel_order_result", linkedHashMap);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MiniOspViewModel@8f4.cancelOrder$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
