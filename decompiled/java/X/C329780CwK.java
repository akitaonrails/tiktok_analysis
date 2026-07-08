package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "tiktok.compose.paging.assem.AssemPagingExtensionsKt$collectAsPagingLazyState$1$1", f = "AssemPagingExtensions.kt", l = {}, m = "invokeSuspend")
public final class C329780CwK extends C09AX implements Function2<EnumC329800CwM, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AssemSingleListViewModel<Object, ?, ?> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329780CwK(AssemSingleListViewModel<Object, ?, ?> assemSingleListViewModel, InterfaceC1364105Vn<? super C329780CwK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assemSingleListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329780CwK c329780CwK = new C329780CwK(this.LLILLJJLI, interfaceC1364105Vn);
        c329780CwK.LL = obj;
        return c329780CwK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC329800CwM enumC329800CwM = (EnumC329800CwM) this.LL;
        AssemSingleListViewModel<Object, ?, ?> assemSingleListViewModel = this.LLILLJJLI;
        int i = C329790CwL.LIZ[enumC329800CwM.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AssemSingleListViewModel.manualListLoadLatest$default(assemSingleListViewModel, null, 1, null);
                } else {
                    throw new C1954807lC();
                }
            } else {
                AssemSingleListViewModel.manualListLoadMore$default(assemSingleListViewModel, null, 1, null);
            }
        } else {
            assemSingleListViewModel.manualListRefresh();
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC329800CwM enumC329800CwM, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC329800CwM, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
