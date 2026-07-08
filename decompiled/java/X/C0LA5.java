package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LA5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.view.TemplateTabsContainer$getLottieView$1", f = "TemplateTabsContainer.kt", l = {297, 316}, m = "invokeSuspend")
public final class C0LA5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1295960jpS LL;
    public C1420490n4J LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1295960jpS LLILZLL;
    public final /* synthetic */ C1420490n4J LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LA5(String str, C1295960jpS c1295960jpS, C1420490n4J c1420490n4J, Function0<Unit> function0, InterfaceC1364105Vn<? super C0LA5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = c1295960jpS;
        this.LLIZ = c1420490n4J;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LA5(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1294720jnS c1294720jnS;
        C1295960jpS c1295960jpS;
        C1420490n4J c1420490n4J;
        String str;
        Scene scene;
        C1C7U.LIZ("TemplateTabsContainer@15d.getLottieView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.LLILLL;
                    c1420490n4J = this.LLILLJJLI;
                    c1295960jpS = this.LL;
                    C155000ia.LIZIZ(obj);
                    scene = c1420490n4J.LLILZIL;
                    if (scene != null && scene.isVisible()) {
                        c1295960jpS.playAnimation();
                        C538490L9z.LIZLLL(System.currentTimeMillis(), str);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateTabsContainer@15d.getLottieView$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C0LA4 c0la4 = new C0LA4(this.LLILZIL, null);
            this.LLILZ = 1;
            obj = C23250099c.LJI(this, c1dfb, c0la4);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateTabsContainer@15d.getLottieView$1");
                return objLJFF;
            }
        }
        C1292000jj4 c1292000jj4 = (C1292000jj4) obj;
        if (c1292000jj4 != null && (c1294720jnS = (C1294720jnS) c1292000jj4.LIZ) != null) {
            c1295960jpS = this.LLILZLL;
            c1420490n4J = this.LLIZ;
            str = this.LLILZIL;
            c1295960jpS.setComposition(c1294720jnS);
            C0MWA c0mwaLIZIZ = c1420490n4J.LIZIZ(str);
            C0MW9 c0mw9 = C0MW9.LIZ;
            if (Intrinsics.LJFF(c0mwaLIZIZ, c0mw9)) {
                c1295960jpS.setProgress(1.0f);
                c1420490n4J.LLJJI = c0mw9;
            } else {
                c1420490n4J.LLJJI = C0MWB.LIZ;
                this.LL = c1295960jpS;
                this.LLILLJJLI = c1420490n4J;
                this.LLILLL = str;
                this.LLILZ = 2;
                if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateTabsContainer@15d.getLottieView$1");
                    return objLJFF;
                }
                scene = c1420490n4J.LLILZIL;
                if (scene != null) {
                    c1295960jpS.playAnimation();
                    C538490L9z.LIZLLL(System.currentTimeMillis(), str);
                }
            }
        } else {
            C1420490n4J c1420490n4J2 = this.LLIZ;
            Function0<Unit> function0 = this.LLIZLLLIL;
            c1420490n4J2.LLJJI = C0MWC.LIZ;
            function0.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabsContainer@15d.getLottieView$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
