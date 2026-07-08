package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.05hL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {166}, m = "invokeSuspend")
public final class C1421305hL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1421305hL(InterfaceC1364105Vn<? super C1421305hL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1421305hL c1421305hL = new C1421305hL(interfaceC1364105Vn);
        c1421305hL.LLILLJJLI = obj;
        return c1421305hL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C23118094a.LJIIIIZZ(interfaceC497601wk.getCoroutineContext())) {
            AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(702);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (C1838620xwi.LIZIZ(this, aFwS229S0000000_2) == objLJFF) {
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
