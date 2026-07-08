package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment$onViewCreated$3", f = "AddressMapDetailFragment.kt", l = {}, m = "invokeSuspend")
public final class C1218880hp8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddressMapDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218880hp8(AddressMapDetailFragment addressMapDetailFragment, InterfaceC1364105Vn<? super C1218880hp8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addressMapDetailFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1218880hp8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressMapDetailFragment@32bb.onViewCreated$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AddressMapDetailViewModel.jR2(this.LL.ZR(), null, false, true, 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressMapDetailFragment@32bb.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
