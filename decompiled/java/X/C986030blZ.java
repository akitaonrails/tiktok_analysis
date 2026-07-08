package X;

import com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0blZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent$dismiss$1", f = "CatchBeansGameComponent.kt", l = {150}, m = "invokeSuspend")
public final class C986030blZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CatchBeansGameComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986030blZ(CatchBeansGameComponent catchBeansGameComponent, InterfaceC1364105Vn<? super C986030blZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = catchBeansGameComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C986030blZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansGameComponent@7e04.dismiss$1");
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
            this.LLILLJJLI.getClass();
            C20441214yg.LJ("match_game_component", "stop game on IO");
            CatchBeansGameComponent catchBeansGameComponent = this.LLILLJJLI;
            this.LL = 1;
            if (catchBeansGameComponent.LJIJI(this) == objLJFF) {
                C1C7U.LIZIZ("CatchBeansGameComponent@7e04.dismiss$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CatchBeansGameComponent@7e04.dismiss$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
