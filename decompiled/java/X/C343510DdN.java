package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.bottombar.logic.funchandler.AbsVideoFunctionHandler$showAngle$1", f = "AbsVideoFunctionHandler.kt", l = {118}, m = "invokeSuspend")
public final class C343510DdN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0E94 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343510DdN(C0E94 c0e94, InterfaceC1364105Vn<? super C343510DdN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e94;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C343510DdN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsVideoFunctionHandler@290b.showAngle$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("AbsVideoFunctionHandler@290b.showAngle$1");
                return objLJFF;
            }
        }
        InterfaceC361710EGb interfaceC361710EGb = (InterfaceC361710EGb) this.LLILLJJLI.LLILLJJLI.LJIIL(null, InterfaceC361710EGb.class);
        if (interfaceC361710EGb != null) {
            interfaceC361710EGb.Kq2(null, null, null, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsVideoFunctionHandler@290b.showAngle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
