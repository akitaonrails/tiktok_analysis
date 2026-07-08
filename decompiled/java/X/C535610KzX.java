package X;

import Y.AgS289S0100000_8;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.aime.aimecreatenow.AiMeTabModuleViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import t28.h;

/* JADX INFO: renamed from: X.0KzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiself.AiMeBottomTabScene$show$1", f = "AiMeBottomTabModule.kt", l = {324}, m = "invokeSuspend")
public final class C535610KzX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ h LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535610KzX(h hVar, InterfaceC1364105Vn<? super C535610KzX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535610KzX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiMeBottomTabScene@13a8.show$1");
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
            InterfaceC346201Wa interfaceC346201WaFlowWithLifecycle = FlowExtKt.flowWithLifecycle(((AiMeTabModuleViewModel) this.LLILLJJLI.LLJJI.getValue()).LLILLJJLI, this.LLILLJJLI.getLifecycle(), Lifecycle.State.STARTED);
            C1DFH c1dfh = C0PEM.LIZ;
            InterfaceC346201Wa interfaceC346201WaLJIL = C09IC.LJIL(interfaceC346201WaFlowWithLifecycle, C2107308Nj.LIZ);
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 47);
            this.LL = 1;
            if (interfaceC346201WaLJIL.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AiMeBottomTabScene@13a8.show$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiMeBottomTabScene@13a8.show$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
