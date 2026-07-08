package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel;

/* JADX INFO: renamed from: X.08iK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel$AttachedComposable$2", f = "ScopedViewModelExt.kt", l = {241}, m = "invokeSuspend")
public final class C2191808iK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2192208iO LLILLJJLI;
    public final /* synthetic */ ViewModelStoreOwnerViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191808iK(C2192208iO c2192208iO, ViewModelStoreOwnerViewModel viewModelStoreOwnerViewModel, InterfaceC1364105Vn<? super C2191808iK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2192208iO;
        this.LLILLL = viewModelStoreOwnerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191808iK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2192208iO c2192208iO = this.LLILLJJLI;
            C2252321DDq c2252321DDq = c2192208iO.LJII;
            C2191908iL c2191908iL = new C2191908iL(c2192208iO, this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(c2252321DDq, this, c2191908iL) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
