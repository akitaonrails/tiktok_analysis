package X;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WWN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.utils.RouteKt$awaitFinish$2$3", f = "Route.kt", l = {163}, m = "invokeSuspend")
public final class C0WWN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C259800zU<Object> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<AbstractC813200VvC> LLILZIL;
    public final /* synthetic */ C259800zU<Application.ActivityLifecycleCallbacks> LLILZLL;
    public final /* synthetic */ Application LLIZ;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLIZLLLIL;
    public final /* synthetic */ InterfaceC20236714Gf<Pair<Boolean, String>> LLJ;
    public final /* synthetic */ C013C LLJI;
    public final /* synthetic */ FragmentManager LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0WWN(int i, C259800zU<Object> c259800zU, boolean z, C259800zU<AbstractC813200VvC> c259800zU2, C259800zU<Application.ActivityLifecycleCallbacks> c259800zU3, Application application, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC20236714Gf<? super Pair<Boolean, String>> interfaceC20236714Gf, C013C c013c, FragmentManager fragmentManager, InterfaceC1364105Vn<? super C0WWN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c259800zU;
        this.LLILZ = z;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = c259800zU3;
        this.LLIZ = application;
        this.LLIZLLLIL = function2;
        this.LLJ = interfaceC20236714Gf;
        this.LLJI = c013c;
        this.LLJIJIL = fragmentManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WWN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager fragmentManager;
        C1C7U.LIZ("RouteKt@3ce3.awaitFinish$2$3");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$2$3");
                return objLJFF;
            }
        }
        C259800zU<Object> c259800zU = this.LLILLL;
        if (c259800zU.element != null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$2$3");
            return unit;
        }
        if (this.LLILZ) {
            C0WWO.LIZIZ(this.LLJI, this.LLILZIL, this.LLILZLL, this.LLIZ, c259800zU, this.LLJIJIL);
        } else {
            AbstractC813200VvC abstractC813200VvC = this.LLILZIL.element;
            if (abstractC813200VvC != null && (fragmentManager = this.LLJIJIL) != null) {
                fragmentManager.LLIILZL(abstractC813200VvC);
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.LLILZLL.element;
            if (activityLifecycleCallbacks != null) {
                this.LLIZ.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }
        Function2<Boolean, String, Unit> function2 = this.LLIZLLLIL;
        if (function2 != null) {
            function2.invoke(false, "route_target_create_timeout");
        }
        C324990Cob.LIZ(new Pair(false, "route_target_create_timeout"), this.LLJ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$2$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
