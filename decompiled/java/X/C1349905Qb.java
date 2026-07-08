package X;

import Y.AObjectS238S0100000_2;
import Y.AgS283S0100000_2;
import com.bytedance.als.h0;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$observeExternalStickerChange$1", f = "FullWidthEffectCarouselComponent.kt", l = {1331}, m = "invokeSuspend")
public final class C1349905Qb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349905Qb(o oVar, InterfaceC1364105Vn<? super C1349905Qb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1349905Qb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.observeExternalStickerChange$1");
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
            o oVar = this.LLILLJJLI;
            InterfaceC346201Wa<Effect> interfaceC346201Wa = oVar.LLJJL;
            h0<Boolean> h0VarA3 = oVar.A3();
            o oVar2 = this.LLILLJJLI;
            C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(h0VarA3.LIZJ());
            h0VarA3.LIZ(oVar2, new AObjectS238S0100000_2(c2252321DDqLIZ, 3));
            C1768806wI c1768806wI = new C1768806wI(new C1768806wI(new C414301jJ(interfaceC346201Wa, C09IC.LIZIZ(c2252321DDqLIZ), new C05EA(null)), 8), 9);
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 48);
            this.LL = 1;
            if (c1768806wI.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeExternalStickerChange$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeExternalStickerChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
