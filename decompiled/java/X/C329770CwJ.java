package X;

import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "tiktok.compose.paging.assem.AssemPagingExtensionsKt$collectAsPagingLazyState$2$1", f = "AssemPagingExtensions.kt", l = {}, m = "invokeSuspend")
public final class C329770CwJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AssemSingleListViewModel<Object, ?, ?> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329770CwJ(AssemSingleListViewModel<Object, ?, ?> assemSingleListViewModel, InterfaceC1364105Vn<? super C329770CwJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = assemSingleListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329770CwJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C329760CwI.LIZ((AssemListViewModel) this.LL);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
