package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.03nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.shipping.SeaPdpShippingMgr$openAddressListPage$1$1", f = "SeaPdpShippingMgr.kt", l = {226}, m = "invokeSuspend")
public final class C952303nt extends C09AX implements Function1<InterfaceC1364105Vn<? super AddressPageStarter.AddressEvent>, Object> {
    public int LL;
    public final /* synthetic */ C952803ny LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C952303nt(C952803ny c952803ny, View view, InterfaceC1364105Vn<? super C952303nt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c952803ny;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C952303nt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AddressPageStarter.AddressEvent> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String strLIZLLL;
        String str;
        Map<String, Object> map;
        Object objLIZLLL = obj;
        C1C7U.LIZ("SeaPdpShippingMgr@58d9.openAddressListPage$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLJJLI.LIZ.LLIZ;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("previous_page", "product_detail");
            AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
            View view = this.LLILLL;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            View view2 = this.LLILLL;
            if (view2 != null) {
                strLIZLLL = C960603pE.LIZLLL(view2);
            } else {
                strLIZLLL = null;
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
            ProductPackStruct productPackStruct = this.LLILLJJLI.LIZ.LLJIJIL;
            if (productPackStruct != null) {
                str = productPackStruct.productId;
            } else {
                str = null;
            }
            this.LL = 1;
            objLIZLLL = AddressPageStarter.LIZLLL(addressPageStarter, context, strLIZLLL, strLJIIIIZZ, null, str, null, true, null, null, null, null, null, null, null, this, 32592);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("SeaPdpShippingMgr@58d9.openAddressListPage$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaPdpShippingMgr@58d9.openAddressListPage$1$1");
        return objLIZLLL;
    }
}
