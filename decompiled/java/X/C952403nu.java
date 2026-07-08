package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.shipping.SeaPdpShippingMgr$openAddressListPage$1", f = "SeaPdpShippingMgr.kt", l = {220}, m = "invokeSuspend")
public final class C952403nu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C952803ny LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C952403nu(C952803ny c952803ny, View view, InterfaceC1364105Vn<? super C952403nu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c952803ny;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C952403nu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpShippingMgr@58d9.openAddressListPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C952803ny c952803ny = this.LLILLJJLI;
            SeaPdpViewModel seaPdpViewModel = c952803ny.LIZ;
            C952303nt c952303nt = new C952303nt(c952803ny, this.LLILLL, null);
            this.LL = 1;
            obj = seaPdpViewModel.rS2(this, c952303nt, true);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpShippingMgr@58d9.openAddressListPage$1");
                return objLJFF;
            }
        }
        AddressPageStarter.AddressEvent addressEvent = (AddressPageStarter.AddressEvent) obj;
        if (addressEvent != null) {
            C952803ny c952803ny2 = this.LLILLJJLI;
            if (addressEvent.type == 3) {
                c952803ny2.LIZ.LLLLLLIL.LIZJ(1, addressEvent.addressId);
                SeaPdpViewModel.vS2(c952803ny2.LIZ, false, true, addressEvent.addressId, false, false, 240);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpShippingMgr@58d9.openAddressListPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
