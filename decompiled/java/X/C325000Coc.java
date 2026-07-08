package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Coc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ext_power_list.AssemListViewModel$config$2$1$onRefresh$1", f = "AssemListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C325000Coc extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C325000Coc(InterfaceC1364105Vn<? super AbstractC316870CbV<Object>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C325000Coc> interfaceC1364105Vn2) {
        super(1, interfaceC1364105Vn2);
        this.LL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325000Coc(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf;
        C1C7U.LIZ("AssemListViewModel@fb1f.config$2$1$onRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1364105Vn<AbstractC316870CbV<Object>> interfaceC1364105Vn = this.LL;
        if (interfaceC1364105Vn instanceof InterfaceC20236714Gf) {
            interfaceC20236714Gf = (InterfaceC20236714Gf) interfaceC1364105Vn;
        } else {
            interfaceC20236714Gf = null;
        }
        boolean z = false;
        if (interfaceC20236714Gf != null && interfaceC20236714Gf.isActive()) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AssemListViewModel@fb1f.config$2$1$onRefresh$1");
        return boolValueOf;
    }
}
