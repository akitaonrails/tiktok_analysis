package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$prepareEffectResource$2", f = "PCSBoardEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C387401ey extends C09AX implements Function2<LiveEffect, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Boolean>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C389701fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387401ey(C389701fL c389701fL, InterfaceC1364105Vn<? super C387401ey> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C387401ey c387401ey = new C387401ey(this.LLILLJJLI, interfaceC1364105Vn);
        c387401ey.LL = obj;
        return c387401ey;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String name;
        Effect effect;
        C1C7U.LIZ("PCSBoardEffectManager@20d3.prepareEffectResource$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveEffect liveEffect = (LiveEffect) this.LL;
        C392101fj c392101fj = C392101fj.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live board effect=");
        if (liveEffect != null && (effect = liveEffect.LIZJ) != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C392601fo.LJII(c392101fj, C2188811AlT.LIZIZ(sbLIZ));
        C389701fL c389701fL = this.LLILLJJLI;
        c389701fL.getClass();
        C095D c095d = new C095D(new C389901fN(c389701fL, liveEffect, null));
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.prepareEffectResource$2");
        return c095d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveEffect liveEffect, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(liveEffect, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
