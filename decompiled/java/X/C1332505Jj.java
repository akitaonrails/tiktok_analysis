package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.api.recommend.ParallelRequestChain$parallelProcessInternal$2$1$slowDeferredList$1$1", f = "ParallelRequestChain.kt", l = {}, m = "invokeSuspend")
public final class C1332505Jj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1332905Jn<Object> LL;
    public final /* synthetic */ InterfaceC1333005Jo<?> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332505Jj(C1332905Jn<Object> c1332905Jn, InterfaceC1333005Jo<?> interfaceC1333005Jo, InterfaceC1364105Vn<? super C1332505Jj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1332905Jn;
        this.LLILLJJLI = interfaceC1333005Jo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1332505Jj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ParallelRequestChain@7b5a.parallelProcessInternal$2$1$slowDeferredList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ParallelRequestChain@7b5a.parallelProcessInternal$2$1$slowDeferredList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
