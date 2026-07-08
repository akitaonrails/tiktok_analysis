package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailFragment2;
import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailFragment2$onViewCreated$3", f = "AddressMapDetailFragment2.kt", l = {}, m = "invokeSuspend")
public final class C1746600vYI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddressMapDetailFragment2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746600vYI(AddressMapDetailFragment2 addressMapDetailFragment2, InterfaceC1364105Vn<? super C1746600vYI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addressMapDetailFragment2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746600vYI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressMapDetailFragment2@5c21.onViewCreated$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AddressMapDetailViewModel2 addressMapDetailViewModel2WR = this.LL.WR();
        C948503nH.LJI(addressMapDetailViewModel2WR, C23271099x.INSTANCE, new C1746410vXz(addressMapDetailViewModel2WR, null, false, null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressMapDetailFragment2@5c21.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
