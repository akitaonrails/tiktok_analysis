package X;

import Y.AObserverS184S0200000_22;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.PinStickerLogicHandler$observePanelSuccess$1", f = "PinStickerLogicHandler.kt", l = {}, m = "invokeSuspend")
public final class C1407060mie extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1627400sS2 LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407060mie(C1627400sS2 c1627400sS2, Effect effect, InterfaceC1364105Vn<? super C1407060mie> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1627400sS2;
        this.LLILLJJLI = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407060mie(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PinStickerLogicHandler@9507.observePanelSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveData liveData = (LiveData) this.LL.LJ.getValue();
        C1627400sS2 c1627400sS2 = this.LL;
        liveData.observe(c1627400sS2.LIZJ, new AObserverS184S0200000_22(c1627400sS2, this.LLILLJJLI, 8));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PinStickerLogicHandler@9507.observePanelSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
