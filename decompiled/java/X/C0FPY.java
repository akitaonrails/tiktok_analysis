package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FPY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.view.TemplateTabBar$applyTabLottie$1", f = "TemplateTabBar.kt", l = {469}, m = "invokeSuspend")
public final class C0FPY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;
    public final /* synthetic */ C1846220y8y LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C1425810nCt LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FPY(C1295960jpS c1295960jpS, C1846220y8y c1846220y8y, boolean z, Function0<Unit> function0, String str, C1425810nCt c1425810nCt, InterfaceC1364105Vn<? super C0FPY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1295960jpS;
        this.LLILZ = c1846220y8y;
        this.LLILZIL = z;
        this.LLILZLL = function0;
        this.LLIZ = str;
        this.LLIZLLLIL = c1425810nCt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FPY c0fpy = new C0FPY(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0fpy.LLILLJJLI = obj;
        return c0fpy;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TemplateTabBar@4cc1.applyTabLottie$1");
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
            Object obj2 = this.LLILLJJLI;
            C1DFB c1dfb = C0PEM.LIZJ;
            C475001t6 c475001t6 = new C475001t6(this.LLIZ, null);
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c475001t6);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateTabBar@4cc1.applyTabLottie$1");
                return objLJFF;
            }
        }
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS == null) {
            this.LLIZLLLIL.LIZLLL(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateTabBar@4cc1.applyTabLottie$1");
            return unit;
        }
        this.LLILLL.setComposition(c1294720jnS);
        if (c1294720jnS.LJIIIZ.height() > 0) {
            int iWidth = (int) (((r2.width() * 1.0f) / r2.height()) * 40);
            ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
            if (layoutParams != null) {
                C1295960jpS c1295960jpS = this.LLILLL;
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(iWidth))) + c1295960jpS.getPaddingStart() + c1295960jpS.getPaddingEnd();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(40))) + c1295960jpS.getPaddingTop() + c1295960jpS.getPaddingBottom();
                C786410Ut5.s6(c1295960jpS, layoutParams);
            }
        }
        this.LLILZ.LJIIJ();
        if (this.LLILZIL) {
            this.LLILLL.playAnimation();
        } else {
            this.LLILLL.setProgress(1.0f);
        }
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabBar@4cc1.applyTabLottie$1");
        return unit2;
    }
}
