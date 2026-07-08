package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "tiktok.compose.paging.assem.AssemPagingExtensionsKt$collectAsPagingLazyState$3$1", f = "AssemPagingExtensions.kt", l = {41}, m = "invokeSuspend")
public final class C634250OuF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CoroutineContext LLILLJJLI;
    public final /* synthetic */ C636150OxJ<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634250OuF(CoroutineContext coroutineContext, C636150OxJ<Object> c636150OxJ, InterfaceC1364105Vn<? super C634250OuF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = coroutineContext;
        this.LLILLL = c636150OxJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C634250OuF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            if (Intrinsics.LJFF(this.LLILLJJLI, C23271099x.INSTANCE)) {
                this.LLILLL.LJI();
            } else {
                CoroutineContext coroutineContext = this.LLILLJJLI;
                C634260OuG c634260OuG = new C634260OuG(this.LLILLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, coroutineContext, c634260OuG) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
