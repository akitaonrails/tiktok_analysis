package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$getAddressList$1$2", f = "IAddressListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C975203ra extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddressListData LL;
    public final /* synthetic */ InterfaceC975703rf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975203ra(AddressListData addressListData, InterfaceC975703rf interfaceC975703rf, InterfaceC1364105Vn<? super C975203ra> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addressListData;
        this.LLILLJJLI = interfaceC975703rf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C975203ra(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("IAddressListViewModel@9425.getAddressList$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C962103pT c962103pT = C962103pT.LIZ;
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(this.LL);
        InterfaceC975703rf interfaceC975703rf = this.LLILLJJLI;
        if (C123100dR.LIZ(interfaceC975703rf.getProductId())) {
            i = 2;
        } else if (C123100dR.LIZ(interfaceC975703rf.ZM2())) {
            i = 0;
        } else {
            i = 1;
        }
        c962103pT.getClass();
        C962103pT.LIZIZ(i, strLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.getAddressList$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
