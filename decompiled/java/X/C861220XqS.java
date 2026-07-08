package X;

import Y.AgS295S0100000_14;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.NewEditToolbarScene$initObserver$21", f = "NewEditToolbarScene.kt", l = {945}, m = "invokeSuspend")
public final class C861220XqS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1459970o5z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861220XqS(C1459970o5z c1459970o5z, InterfaceC1364105Vn<? super C861220XqS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1459970o5z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861220XqS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewEditToolbarScene@2309.initObserver$21");
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
            C1459970o5z c1459970o5z = this.LLILLJJLI;
            c1459970o5z.getClass();
            InterfaceC346201Wa interfaceC346201WaFlowWithLifecycle = FlowExtKt.flowWithLifecycle(C09IC.LJIILIIL(C09IC.LJ(new C907120ZiI(c1459970o5z, null)), 600L), this.LLILLJJLI.getLifecycle(), Lifecycle.State.STARTED);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 29);
            this.LL = 1;
            if (interfaceC346201WaFlowWithLifecycle.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("NewEditToolbarScene@2309.initObserver$21");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewEditToolbarScene@2309.initObserver$21");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
