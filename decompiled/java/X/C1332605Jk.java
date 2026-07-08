package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.api.recommend.ParallelRequestChain$parallelProcess$1", f = "ParallelRequestChain.kt", l = {42}, m = "invokeSuspend")
public final class C1332605Jk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1332905Jn<MODEL> LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1333005Jo<?>> LLILLL;
    public final /* synthetic */ List<InterfaceC1333005Jo<?>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1332605Jk(C1332905Jn<MODEL> c1332905Jn, List<? extends InterfaceC1333005Jo<?>> list, List<? extends InterfaceC1333005Jo<?>> list2, InterfaceC1364105Vn<? super C1332605Jk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1332905Jn;
        this.LLILLL = list;
        this.LLILZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1332605Jk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ParallelRequestChain@7b5a.parallelProcess$1");
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
            C1332905Jn<MODEL> c1332905Jn = this.LLILLJJLI;
            List<InterfaceC1333005Jo<?>> list = this.LLILLL;
            List<InterfaceC1333005Jo<?>> list2 = this.LLILZ;
            this.LL = 1;
            c1332905Jn.getClass();
            Object objLJ = C2296808zG.LJ(new C1332405Ji(c1332905Jn, list, list2, null), this);
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("ParallelRequestChain@7b5a.parallelProcess$1");
                return objLJFF;
            }
        }
        C1332705Jl.LIZ.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ParallelRequestChain@7b5a.parallelProcess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
