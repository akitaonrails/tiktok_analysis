package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.address.DistrictDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.address.AddressHelper$getDistrict$openInfoCollectGuideExceptionHandler$1$1", f = "AddressHelper.kt", l = {}, m = "invokeSuspend")
public final class C344801Vm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<Boolean, DistrictDTO, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C344801Vm(Function2<? super Boolean, ? super DistrictDTO, Unit> function2, InterfaceC1364105Vn<? super C344801Vm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344801Vm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressHelper@93b4.getDistrict$openInfoCollectGuideExceptionHandler$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(false, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressHelper@93b4.getDistrict$openInfoCollectGuideExceptionHandler$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
