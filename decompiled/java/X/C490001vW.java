package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* JADX INFO: renamed from: X.01vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.platform.statemanager.handler.IMStateHandler$changeState$1", f = "IMStateHandler.kt", l = {143}, m = "invokeSuspend")
public final class C490001vW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C490301vZ LLILLJJLI;
    public final /* synthetic */ ChangeStateReq LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ C490701vd LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C490001vW(C490301vZ c490301vZ, ChangeStateReq changeStateReq, Function1<? super Boolean, Unit> function1, C490701vd c490701vd, InterfaceC1364105Vn<? super C490001vW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c490301vZ;
        this.LLILLL = changeStateReq;
        this.LLILZ = function1;
        this.LLILZIL = c490701vd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C490001vW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objChangeState = obj;
        C1C7U.LIZ("IMStateHandler@4ed1.changeState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objChangeState);
            } else {
                C155000ia.LIZIZ(objChangeState);
                this.LLILLJJLI.LL.LIZLLL();
                C490301vZ c490301vZ = this.LLILLJJLI;
                ChangeStateReq changeStateReq = this.LLILLL;
                InterfaceC149500hh interfaceC149500hh = (InterfaceC149500hh) c490301vZ.LLILZ.getValue();
                this.LL = 1;
                objChangeState = interfaceC149500hh.changeState(changeStateReq, this);
                if (objChangeState == objLJFF) {
                    C1C7U.LIZIZ("IMStateHandler@4ed1.changeState$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C926820aE4) objChangeState;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C490301vZ c490301vZ2 = this.LLILLJJLI;
        ChangeStateReq changeStateReq2 = this.LLILLL;
        Function1<Boolean, Unit> function1 = this.LLILZ;
        C490701vd c490701vd = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C926820aE4 c926820aE4 = (C926820aE4) c098200Yq;
            C188600o0.LIZ(c926820aE4, null, new C020I(c490301vZ2, (C490301vZ) changeStateReq2, (ChangeStateReq) function1, (Function1<? super Boolean, Unit>) c926820aE4, (C926820aE4<ChangeStateResp>) 3), new C490101vX(c490301vZ2, function1, changeStateReq2, c926820aE4, c490701vd));
        }
        C490301vZ c490301vZ3 = this.LLILLJJLI;
        Function1<Boolean, Unit> function12 = this.LLILZ;
        ChangeStateReq changeStateReq3 = this.LLILLL;
        C490701vd c490701vd2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c490301vZ3.LL.LJFF(3, new C020I(c490301vZ3, changeStateReq3, c490701vd2, thM5exceptionOrNullimpl, 4));
            if (function12 != null) {
                function12.invoke(false);
            }
            ((Function1) c490301vZ3.LLILZIL.getValue()).invoke(thM5exceptionOrNullimpl);
            C505301xz.LIZ(changeStateReq3.stateType, 0, -1, thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMStateHandler@4ed1.changeState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
