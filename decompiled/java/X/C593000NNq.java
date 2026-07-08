package X;

import com.ss.android.ugc.aweme.effect.EffectPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.EffectPanelViewModel$onEffectViewLoaded$1", f = "EffectPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C593000NNq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectPanelViewModel LL;
    public final /* synthetic */ C1427090nEx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593000NNq(EffectPanelViewModel effectPanelViewModel, C1427090nEx c1427090nEx, InterfaceC1364105Vn<? super C593000NNq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectPanelViewModel;
        this.LLILLJJLI = c1427090nEx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593000NNq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPanelViewModel@7757.onEffectViewLoaded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectPanelViewModel@7757.onEffectViewLoaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
