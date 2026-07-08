package X;

import Y.AfS171S0100000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.ShippingAddressLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.ShippingAddressLocationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0vUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel$updateRegions$1", f = "AddressMapDetailViewModel.kt", l = {595}, m = "invokeSuspend")
public final class C1744540vUy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressMapDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744540vUy(AddressMapDetailViewModel addressMapDetailViewModel, InterfaceC1364105Vn<? super C1744540vUy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressMapDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744540vUy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Double dLJII;
        Double dLJII2;
        String str;
        String str2;
        C1C7U.LIZ("AddressMapDetailViewModel@adb3.updateRegions$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ShippingAddressLocationRequest shippingAddressLocationRequest = new ShippingAddressLocationRequest(this.LLILLJJLI.LLIZ, C1747870vaL.LIZ);
                InterfaceC1744330vUd.LIZ.getClass();
                C11NZ<Response<ShippingAddressLocationData>> c11nzLIZIZ = ((InterfaceC1744330vUd) C1744340vUe.LIZIZ.create(InterfaceC1744330vUd.class)).LIZIZ(shippingAddressLocationRequest);
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c2252611DEt.LJJII(new AwS581S0100000_2(c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 62), new AfS171S0100000_2(c2252611DEt, 63)), 587));
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.updateRegions$1");
                    return objLJFF;
                }
            }
            ShippingAddressLocationData shippingAddressLocationData = (ShippingAddressLocationData) obj;
            if (shippingAddressLocationData != null) {
                AddressMapDetailViewModel addressMapDetailViewModel = this.LLILLJJLI;
                AddressMapDetailViewModel.lR2(addressMapDetailViewModel, shippingAddressLocationData.address, shippingAddressLocationData.errors, 4);
                Address address = shippingAddressLocationData.address;
                if (address != null && (str2 = address.latitude) != null) {
                    dLJII = C2327809Ae.LJII(str2);
                } else {
                    dLJII = null;
                }
                Address address2 = shippingAddressLocationData.address;
                if (address2 != null && (str = address2.longitude) != null) {
                    dLJII2 = C2327809Ae.LJII(str);
                } else {
                    dLJII2 = null;
                }
                if (dLJII != null && dLJII2 != null) {
                    addressMapDetailViewModel.setState(new C1746850vYh(dLJII.doubleValue(), dLJII2.doubleValue()));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR20004, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.updateRegions$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
