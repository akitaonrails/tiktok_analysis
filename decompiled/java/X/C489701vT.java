package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.platform.statemanager.handler.IMStateHandler$updateState$1", f = "IMStateHandler.kt", l = {120}, m = "invokeSuspend")
public final class C489701vT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C490301vZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C489701vT(C490301vZ c490301vZ, InterfaceC1364105Vn<? super C489701vT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c490301vZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C489701vT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("IMStateHandler@4ed1.updateState$1");
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
                C490301vZ c490301vZ = this.LLILLJJLI;
                InterfaceC149500hh interfaceC149500hh = (InterfaceC149500hh) c490301vZ.LLILZ.getValue();
                long j = c490301vZ.LLILLJJLI.get();
                this.LL = 1;
                obj = interfaceC149500hh.p(j, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMStateHandler@4ed1.updateState$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C926820aE4) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C490301vZ c490301vZ2 = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C188600o0.LIZ((C926820aE4) c098200Yq, null, new C5183020f(c490301vZ2, 156), null);
        }
        Function1 function1 = (Function1) this.LLILLJJLI.LLILZIL.getValue();
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            function1.invoke(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMStateHandler@4ed1.updateState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
