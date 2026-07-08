package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import y5o.n0;

/* JADX INFO: renamed from: X.05VD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.FullWidthEffectCarouselScene$CarouselV2$onClick$1$1$1", f = "FullWidthEffectCarouselScene.kt", l = {405}, m = "invokeSuspend")
public final class C05VD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ n0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VD(C1690080u58 c1690080u58, int i, n0 n0Var, InterfaceC1364105Vn<? super C05VD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = i;
        this.LLILZ = n0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselScene@94d7.CarouselV2$onClick$1$1$1");
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
            C1690080u58 c1690080u58 = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            C1687100u0K c1687100u0K = C1690080u58.LJIL;
            if (c1690080u58.LJFF(i2, 0, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselScene@94d7.CarouselV2$onClick$1$1$1");
                return objLJFF;
            }
        }
        this.LLILZ.LLLLIL().LJ.invoke(C2286608xc.LJ(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselScene@94d7.CarouselV2$onClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
