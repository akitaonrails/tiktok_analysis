package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01NY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.ext_power_list.AssemSingleListViewModel$refreshInner$1", f = "AssemSingleListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C01NY extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public C01NY(InterfaceC1364105Vn<? super C01NY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01NY(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C01NY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AssemSingleListViewModel@7ba5.refreshInner$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("AssemSingleListViewModel@7ba5.refreshInner$1");
        return true;
    }
}
