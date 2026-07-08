package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.api.recommend.AdaptiveParallelRequestChain$adaptiveParallelProcessInternal$4$slowJobs$1$1", f = "AdaptiveParallelRequestChain.kt", l = {166}, m = "invokeSuspend")
public final class C1337705Lj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1337805Lk LL;
    public C1337905Ll LLILLJJLI;
    public InterfaceC1333005Jo LLILLL;
    public int LLILZ;
    public final /* synthetic */ InterfaceC1337805Lk LLILZIL;
    public final /* synthetic */ C1337905Ll<Object> LLILZLL;
    public final /* synthetic */ InterfaceC1333005Jo<Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337705Lj(InterfaceC1337805Lk interfaceC1337805Lk, C1337905Ll<Object> c1337905Ll, InterfaceC1333005Jo<Object> interfaceC1333005Jo, InterfaceC1364105Vn<? super C1337705Lj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC1337805Lk;
        this.LLILZLL = c1337905Ll;
        this.LLIZ = interfaceC1333005Jo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1337705Lj(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1337805Lk interfaceC1337805Lk;
        C1337905Ll<Object> c1337905Ll;
        InterfaceC1333005Jo<?> interfaceC1333005Jo;
        C1C7U.LIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcessInternal$4$slowJobs$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                interfaceC1333005Jo = this.LLILLL;
                c1337905Ll = this.LLILLJJLI;
                interfaceC1337805Lk = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC1337805Lk = this.LLILZIL;
            c1337905Ll = this.LLILZLL;
            interfaceC1333005Jo = this.LLIZ;
            this.LL = interfaceC1337805Lk;
            this.LLILLJJLI = c1337905Ll;
            this.LLILLL = interfaceC1333005Jo;
            this.LLILZ = 1;
            if (interfaceC1337805Lk.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcessInternal$4$slowJobs$1$1");
                return objLJFF;
            }
        }
        try {
            c1337905Ll.LIZJ(interfaceC1333005Jo);
            interfaceC1337805Lk.release();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcessInternal$4$slowJobs$1$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1337805Lk.release();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
