package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$recordApply$1", f = "FullWidthEffectCarouselComponent.kt", l = {}, m = "invokeSuspend")
public final class C1626400sQQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ o LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626400sQQ(o oVar, Effect effect, long j, InterfaceC1364105Vn<? super C1626400sQQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = oVar;
        this.LLILLJJLI = effect;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626400sQQ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.recordApply$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zLIZ = C1626430sQT.LIZ(this.LL.yq().C0(), this.LLILLJJLI, true);
        C1626410sQR c1626410sQR = C1626410sQR.LIZ;
        String effectId = this.LLILLJJLI.getEffectId();
        long j = this.LLILLL;
        c1626410sQR.getClass();
        C1626410sQR.LIZJ.put(effectId, Long.valueOf(j));
        C1626410sQR.LIZLLL.put(effectId, Boolean.valueOf(zLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.recordApply$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
