package X;

import Y.AgS305S0100000_25;
import androidx.lifecycle.FlowLiveDataConversions;
import com.ss.android.ugc.slideslip.f4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectBarWidgetComponent$observeEffectSelectStateToShowBottomWidget$1", f = "EffectBarWidgetComponent.kt", l = {188}, m = "invokeSuspend")
public final class C1627680sSU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ f4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627680sSU(f4 f4Var, InterfaceC1364105Vn<? super C1627680sSU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = f4Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1627680sSU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1");
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
            f4 f4Var = this.LLILLJJLI;
            C516501zn c516501zn = new C516501zn(new InterfaceC346201Wa[]{this.LLILLJJLI.Hq().LLLZ, new C1698270uIL(new C2325381G0q(this.LLILLJJLI.LLJJI.LJLJL(), new C415401jU(null), 2), 11), C098C.LIZ(this.LLILLJJLI.P0()), C098C.LIZ(this.LLILLJJLI.g1()), new C1698270uIL(FlowLiveDataConversions.asFlow(this.LLILLJJLI.yq().C0().LJII().LIZ()), 12), C098C.LIZ(this.LLILLJJLI.LLJJIJIIJIL), f4Var.LLJJIJIL}, 0);
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(f4Var, 21);
            this.LL = 1;
            if (c516501zn.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
