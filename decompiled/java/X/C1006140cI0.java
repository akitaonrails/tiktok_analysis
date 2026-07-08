package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.flow.MinisInstantPlayLoadFlow$triggerSample$1$1", f = "MinisInstantPlayLoadFlow.kt", l = {463}, m = "invokeSuspend")
public final class C1006140cI0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1006440cIU LLILLL;
    public final /* synthetic */ InterfaceC1006410cIR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006140cI0(C1006440cIU c1006440cIU, InterfaceC1006410cIR interfaceC1006410cIR, InterfaceC1364105Vn<? super C1006140cI0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1006440cIU;
        this.LLILZ = interfaceC1006410cIR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1006140cI0 c1006140cI0 = new C1006140cI0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1006140cI0.LLILLJJLI = obj;
        return c1006140cI0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MinisInstantPlayLoadFlow@9679.triggerSample$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1006440cIU c1006440cIU = this.LLILLL;
                InterfaceC1006410cIR interfaceC1006410cIR = this.LLILZ;
                this.LL = 1;
                obj = c1006440cIU.LIZIZ(interfaceC1006410cIR);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.triggerSample$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (AbstractC1006170cI3) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C1006150cI1.LIZ;
        }
        c098200Yq.getClass();
        C1007120cJa.LIZ();
        this.LLILLL.LJIILLIIL.setValue(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.triggerSample$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
