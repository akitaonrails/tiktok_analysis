package X;

import Y.AgS295S0100000_14;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.NewEditToolbarScene$observeAutoCutAITaskCompletion$1$1", f = "NewEditToolbarScene.kt", l = {1827}, m = "invokeSuspend")
public final class C861180XqO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1417440mzO LLILLJJLI;
    public final /* synthetic */ C1459970o5z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861180XqO(InterfaceC1417440mzO interfaceC1417440mzO, C1459970o5z c1459970o5z, InterfaceC1364105Vn<? super C861180XqO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1417440mzO;
        this.LLILLL = c1459970o5z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861180XqO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewEditToolbarScene@2309.observeAutoCutAITaskCompletion$1$1");
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
            InterfaceC346201Wa interfaceC346201WaFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.LLILLJJLI.HR0(), this.LLILLL.getLifecycle(), Lifecycle.State.STARTED);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 28);
            this.LL = 1;
            if (interfaceC346201WaFlowWithLifecycle.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("NewEditToolbarScene@2309.observeAutoCutAITaskCompletion$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewEditToolbarScene@2309.observeAutoCutAITaskCompletion$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
