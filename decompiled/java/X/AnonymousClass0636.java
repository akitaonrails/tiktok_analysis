package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0636, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.innerpush.refactor.window.InnerPushAssemWindow$lifeCycleState$1", f = "InnerPushAssemWindow.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0636 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20671715ul LL;
    public final /* synthetic */ Lifecycle.State LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0636(C20671715ul c20671715ul, Lifecycle.State state, InterfaceC1364105Vn<? super AnonymousClass0636> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20671715ul;
        this.LLILLJJLI = state;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0636(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InnerPushAssemWindow@9987.lifeCycleState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLL.setCurrentState(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InnerPushAssemWindow@9987.lifeCycleState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
