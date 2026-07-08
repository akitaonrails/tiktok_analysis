package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14XO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.viewhelper.BackgroundSurveyComposeViewHelper$SurveyPanel$1$1", f = "BackgroundSurveyComposeViewHelper.kt", l = {}, m = "invokeSuspend")
public final class C14XO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05P0<Integer> LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;
    public final /* synthetic */ C05P0<Long> LLILZ;
    public final /* synthetic */ C05P0<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14XO(String str, C05P0<Integer> c05p0, C05P0<Boolean> c05p02, C05P0<Long> c05p03, C05P0<String> c05p04, InterfaceC1364105Vn<? super C14XO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
        this.LLILZIL = c05p04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C14XO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackgroundSurveyComposeViewHelper@6ed.SurveyPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C14XX c14xx = new C14XX();
        c14xx.LIZ = C14XN.LJJIIJ(this.LLILLJJLI);
        c14xx.LIZIZ = this.LLILLL.getValue().booleanValue();
        c14xx.LIZLLL = this.LLILZ.getValue().longValue();
        c14xx.LJ = this.LLILZIL.getValue();
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C988000bok.LIZ().LJI(this.LL, c14xx);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundSurveyComposeViewHelper@6ed.SurveyPanel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
