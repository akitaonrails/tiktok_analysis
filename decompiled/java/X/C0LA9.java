package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.template.TemplateOperationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LA9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.integration.MvTemplateBottomTabModule$createBottomTabItem$2$1", f = "MvTemplateBottomTabModule.kt", l = {126}, m = "invokeSuspend")
public final class C0LA9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;
    public final /* synthetic */ C0MTC LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LA9(C1295960jpS c1295960jpS, C0MTC c0mtc, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C0LA9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1295960jpS;
        this.LLILZ = c0mtc;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LA9 c0la9 = new C0LA9(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0la9.LLILLJJLI = obj;
        return c0la9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1294720jnS c1294720jnS;
        String str;
        String creationId;
        C1C7U.LIZ("MvTemplateBottomTabModule@add5.createBottomTabItem$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
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
            C0LA8 c0la8 = new C0LA8(null);
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0la8);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MvTemplateBottomTabModule@add5.createBottomTabItem$2$1");
                return objLJFF;
            }
        }
        C1292000jj4 c1292000jj4 = (C1292000jj4) obj;
        if (c1292000jj4 != null && (c1294720jnS = (C1294720jnS) c1292000jj4.LIZ) != null) {
            final C1295960jpS c1295960jpS = this.LLILLL;
            final C0MTC c0mtc = this.LLILZ;
            C337180DJs.LIZJ(c1295960jpS);
            C786410Ut5.f5(c1295960jpS, 0.8f);
            c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0GtM
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS2) {
                    C0MTC c0mtc2 = c0mtc;
                    C1295960jpS c1295960jpS2 = c1295960jpS;
                    int iWidth = c1294720jnS2.LJIIIZ.width();
                    int iHeight = c1294720jnS2.LJIIIZ.height();
                    c0mtc2.getClass();
                    int i2 = (int) (((iWidth * 1.0f) / iHeight) * 40);
                    ViewGroup.LayoutParams layoutParams = c1295960jpS2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))) + c1295960jpS2.getPaddingStart() + c1295960jpS2.getPaddingEnd();
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + c1295960jpS2.getPaddingTop() + c1295960jpS2.getPaddingBottom();
                        C786410Ut5.W5(c1295960jpS2, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            });
            c1295960jpS.setComposition(c1294720jnS);
            c0mtc.LLIZ = C0MTC.LIZJ();
            if (Intrinsics.LJFF(C0MTC.LIZJ(), C0MWB.LIZ)) {
                c1295960jpS.playAnimation();
                C538490L9z.LJ(System.currentTimeMillis());
                C0L62.LIZ.getClass();
                TemplateOperationData templateOperationDataLIZJ = C0L62.LIZJ();
                if (templateOperationDataLIZJ != null) {
                    str = templateOperationDataLIZJ.activityId;
                } else {
                    str = null;
                }
                ShortVideoContext shortVideoContext = c0mtc.LLILZLL;
                if (shortVideoContext != null) {
                    creationId = shortVideoContext.getCreationId();
                } else {
                    creationId = null;
                }
                ShortVideoContext shortVideoContext2 = c0mtc.LLILZLL;
                if (shortVideoContext2 != null) {
                    str2 = shortVideoContext2.shootWay;
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", creationId);
                c0lab.LJ("shoot_way", str2);
                c0lab.LJ("template_tags", str);
                C20684815ws.LJIILLIIL("template_tab_animation_show", c0lab.LIZ);
            } else {
                c1295960jpS.setProgress(1.0f);
            }
        } else {
            this.LLILZIL.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvTemplateBottomTabModule@add5.createBottomTabItem$2$1");
        return unit;
    }
}
