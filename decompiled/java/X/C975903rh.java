package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.03rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$clickAddAddressForResult$2$1", f = "IAddressListViewModel.kt", l = {603}, m = "invokeSuspend")
public final class C975903rh extends C09AX implements Function1<InterfaceC1364105Vn<? super AddressPageStarter.AddressEvent>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC975703rf LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ InterfaceC1748810vbr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975903rh(InterfaceC975703rf interfaceC975703rf, Activity activity, InterfaceC1748810vbr interfaceC1748810vbr, InterfaceC1364105Vn<? super C975903rh> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC975703rf;
        this.LLILLL = activity;
        this.LLILZ = interfaceC1748810vbr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C975903rh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AddressPageStarter.AddressEvent> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIIIIZZ;
        Address address;
        Object objLIZIZ = obj;
        C1C7U.LIZ("IAddressListViewModel@9425.clickAddAddressForResult$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            if (this.LLILLJJLI.ft().size() >= this.LLILLJJLI.hS1()) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
                c1389890mGx.LJIIJ(this.LLILLL.getString(2131832690));
                c1389890mGx.LJIIJJI();
                objLIZIZ = new AddressPageStarter.AddressEvent("", -1, null, null, null, null);
            } else {
                HashMap<String, Object> trackParams = this.LLILLJJLI.getTrackParams();
                if (trackParams != null) {
                    trackParams.put("previous_page", "shipping_info");
                }
                AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
                Activity activity = this.LLILLL;
                InterfaceC1748810vbr interfaceC1748810vbr = this.LLILZ;
                HashMap<String, Object> trackParams2 = this.LLILLJJLI.getTrackParams();
                if (trackParams2 != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(trackParams2);
                } else {
                    strLJIIIIZZ = null;
                }
                Integer numIK = this.LLILLJJLI.IK();
                ReachableAddress reachableAddress = (ReachableAddress) C13LP.LJJJLZIJ(0, this.LLILLJJLI.ft());
                if (reachableAddress != null) {
                    address = reachableAddress.address;
                } else {
                    address = null;
                }
                Boolean boolES = this.LLILLJJLI.ES();
                this.LL = 1;
                objLIZIZ = AddressPageStarter.LIZIZ(addressPageStarter, activity, interfaceC1748810vbr, true, strLJIIIIZZ, null, null, numIK, false, "c7035.d1458", address, boolES, this, 360396);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("IAddressListViewModel@9425.clickAddAddressForResult$2$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("IAddressListViewModel@9425.clickAddAddressForResult$2$1");
        return objLIZIZ;
    }
}
