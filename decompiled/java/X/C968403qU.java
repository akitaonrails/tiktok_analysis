package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis.PdpShippingMgr$openAddressListPage$1", f = "PdpShippingMgr.kt", l = {262}, m = "invokeSuspend")
public final class C968403qU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C968703qX LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968403qU(C968703qX c968703qX, View view, InterfaceC1364105Vn<? super C968403qU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c968703qX;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C968403qU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objGS2 = obj;
        C1C7U.LIZ("PdpShippingMgr@b3b8.openAddressListPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objGS2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objGS2);
            C968703qX c968703qX = this.LLILLJJLI;
            PdpViewModel pdpViewModel = c968703qX.LIZ;
            C968503qV c968503qV = new C968503qV(c968703qX, this.LLILLL, null);
            this.LL = 1;
            objGS2 = pdpViewModel.gS2(this, c968503qV, true);
            if (objGS2 == objLJFF) {
                C1C7U.LIZIZ("PdpShippingMgr@b3b8.openAddressListPage$1");
                return objLJFF;
            }
        }
        AddressPageStarter.AddressEvent addressEvent = (AddressPageStarter.AddressEvent) objGS2;
        if (addressEvent != null) {
            C968703qX c968703qX2 = this.LLILLJJLI;
            if (addressEvent.type == 3) {
                C968703qX c968703qX3 = c968703qX2.LIZ.LLLLLL;
                String str = addressEvent.addressId;
                c968703qX3.getClass();
                if (str != null && str.length() != 0) {
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = c968703qX3.LIZ.LLJJIII;
                    if (packedDeliverySelectResult == null) {
                        packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult(null, null, null, null, null, null, Boolean.FALSE, null, null);
                    }
                    c968703qX3.LIZ.LLJJIII = DeliveryPanelStarter.PackedDeliverySelectResult.LIZ(packedDeliverySelectResult, str);
                    C973303rH.LL.getClass();
                    C973303rH.LJIIIIZZ(1, str);
                }
                PdpViewModel.lS2(c968703qX2.LIZ, false, true, addressEvent.addressId, false, false, 112);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpShippingMgr@b3b8.openAddressListPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
