package X;

import Y.AgS286S0100000_5;
import androidx.lifecycle.FlowLiveDataConversions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.FreeLayerPanelUISlotComponent$initTrackStateListener$3", f = "FreeLayerPanelUISlotComponent.kt", l = {261}, m = "invokeSuspend")
public final class C0E1Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0E1I LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E1Q(C0E1I c0e1i, InterfaceC1364105Vn<? super C0E1Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e1i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E1Q(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FreeLayerPanelUISlotComponent@c5ab.initTrackStateListener$3");
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
            C1629806Zs c1629806Zs = new C1629806Zs(C09IC.LJIIJJI(FlowLiveDataConversions.asFlow(this.LLILLJJLI.P6().LLLIIIL())));
            AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLJJLI, 11);
            this.LL = 1;
            if (c1629806Zs.collect(agS286S0100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("FreeLayerPanelUISlotComponent@c5ab.initTrackStateListener$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FreeLayerPanelUISlotComponent@c5ab.initTrackStateListener$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
