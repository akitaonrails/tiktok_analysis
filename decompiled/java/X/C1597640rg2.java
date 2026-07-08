package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.platform.data.fetch.FetcherSuiteExecutor$executeBatchWithMeta$2$deferreds$1$1", f = "FetcherSuiteExecutor.kt", l = {121}, m = "invokeSuspend")
public final class C1597640rg2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1158300gFQ>, Object> {
    public int LL;
    public final /* synthetic */ C1597620rg0 LLILLJJLI;
    public final /* synthetic */ InterfaceC1597700rg8<?> LLILLL;
    public final /* synthetic */ List<EnumC1597060rf6> LLILZ;
    public final /* synthetic */ C1596730reZ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1597640rg2(C1597620rg0 c1597620rg0, InterfaceC1597700rg8<?> interfaceC1597700rg8, List<? extends EnumC1597060rf6> list, C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1597640rg2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1597620rg0;
        this.LLILLL = interfaceC1597700rg8;
        this.LLILZ = list;
        this.LLILZIL = c1596730reZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1597640rg2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetcherSuiteExecutor@1dfd.executeBatchWithMeta$2$deferreds$1$1");
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
            C1597620rg0 c1597620rg0 = this.LLILLJJLI;
            InterfaceC1597700rg8<?> interfaceC1597700rg8 = this.LLILLL;
            List<EnumC1597060rf6> list = this.LLILZ;
            C1596730reZ c1596730reZ = this.LLILZIL;
            this.LL = 1;
            obj = c1597620rg0.LIZJ(interfaceC1597700rg8, list, c1596730reZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FetcherSuiteExecutor@1dfd.executeBatchWithMeta$2$deferreds$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FetcherSuiteExecutor@1dfd.executeBatchWithMeta$2$deferreds$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1158300gFQ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
