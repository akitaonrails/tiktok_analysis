package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$downloadResource$1", f = "PCSBoardEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C383501eL extends C09AX implements Function2<C387101ev, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends LiveEffect>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C389701fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C383501eL(C389701fL c389701fL, InterfaceC1364105Vn<? super C383501eL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C383501eL c383501eL = new C383501eL(this.LLILLJJLI, interfaceC1364105Vn);
        c383501eL.LL = obj;
        return c383501eL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.downloadResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C095D c095d = new C095D(new C387001eu((C387101ev) this.LL, this.LLILLJJLI, null));
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.downloadResource$1");
        return c095d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C387101ev c387101ev, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends LiveEffect>> interfaceC1364105Vn) {
        return ((a) create(c387101ev, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
