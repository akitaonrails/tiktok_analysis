package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.manager.EcPanelPerfOptManager$onMainCardsInitReady$1", f = "EcPanelPerfOptManager.kt", l = {}, m = "invokeSuspend")
public final class C0HBB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HBC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBB(C0HBC c0hbc, InterfaceC1364105Vn<? super C0HBB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hbc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPanelPerfOptManager@66cb.onMainCardsInitReady$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL.LIZ.getView();
        if (view != null) {
            Boolean.valueOf(HandlerHook.viewPost(view, new ARunnableS106S0100000_6(this.LL, 46)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPanelPerfOptManager@66cb.onMainCardsInitReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
