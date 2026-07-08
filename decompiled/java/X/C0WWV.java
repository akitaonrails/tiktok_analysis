package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.saf.SAFRoute;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0WWV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.utils.RouteKt$awaitFinish$4$4", f = "Route.kt", l = {330}, m = "invokeSuspend")
public final class C0WWV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SAFRoute LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<Pair<Boolean, String>> LLILZ;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C259800zU<AbstractC813200VvC> LLIZ;
    public final /* synthetic */ C259800zU<Object> LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;
    public final /* synthetic */ C259800zU<Application.ActivityLifecycleCallbacks> LLJI;
    public final /* synthetic */ Application LLJIJIL;
    public final /* synthetic */ C013C LLJILJIL;
    public final /* synthetic */ FragmentManager LLJILJILJ;
    public final /* synthetic */ C0WWR LLJILLL;
    public final /* synthetic */ boolean LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0WWV(SAFRoute sAFRoute, int i, InterfaceC20236714Gf<? super Pair<Boolean, String>> interfaceC20236714Gf, Function2<? super Boolean, ? super String, Unit> function2, boolean z, C259800zU<AbstractC813200VvC> c259800zU, C259800zU<Object> c259800zU2, C259800zU<String> c259800zU3, C259800zU<Application.ActivityLifecycleCallbacks> c259800zU4, Application application, C013C c013c, FragmentManager fragmentManager, C0WWR c0wwr, boolean z2, InterfaceC1364105Vn<? super C0WWV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sAFRoute;
        this.LLILLL = i;
        this.LLILZ = interfaceC20236714Gf;
        this.LLILZIL = function2;
        this.LLILZLL = z;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = c259800zU3;
        this.LLJI = c259800zU4;
        this.LLJIJIL = application;
        this.LLJILJIL = c013c;
        this.LLJILJILJ = fragmentManager;
        this.LLJILLL = c0wwr;
        this.LLJJ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WWV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [T, X.0WWU, android.app.Application$ActivityLifecycleCallbacks] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        char c;
        FragmentManager fragmentManager;
        Object objLJIJ = obj;
        C1C7U.LIZ("RouteKt@3ce3.awaitFinish$4$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            SAFRoute sAFRoute = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            sAFRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0WWY
                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onSuccess(Intent intent) {
                    C324990Cob.LIZ(new Pair(Boolean.TRUE, null), c2252611DEt);
                }

                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onFail(String str, String str2) {
                    InterfaceC20236714Gf<Pair<Boolean, String>> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("route_open_fail:");
                    sbLIZ.append(str2);
                    C324990Cob.LIZ(new Pair(bool, C2188811AlT.LIZIZ(sbLIZ)), interfaceC20236714Gf);
                }
            });
            if (i2 < 0) {
                i2 = 0;
                c = 3;
            } else {
                c = 2;
            }
            if ((c & 1) != 0) {
                i2 = Integer.MIN_VALUE;
            }
            int i3 = c & 2;
            sAFRoute.open(i2, null);
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$4$4");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJIJ;
        if (this.LLILZ.isCompleted()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$4$4");
            return unit;
        }
        Function2<Boolean, String, Unit> function2 = this.LLILZIL;
        if (function2 != null) {
            function2.invoke((Boolean) pair.getFirst(), (String) pair.getSecond());
        }
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            if (this.LLILZLL) {
                C0WWO.LIZJ(this.LLJILJIL, this.LLIZ, this.LLJI, this.LLJIJIL, this.LLIZLLLIL, this.LLJILJILJ);
            } else {
                AbstractC813200VvC abstractC813200VvC = this.LLIZ.element;
                if (abstractC813200VvC != null && (fragmentManager = this.LLJILJILJ) != null) {
                    fragmentManager.LLIILZL(abstractC813200VvC);
                }
            }
            C324990Cob.LIZ(pair, this.LLILZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$4$4");
            return unit2;
        }
        final C259800zU<Object> c259800zU = this.LLIZLLLIL;
        if (c259800zU.element != null) {
            this.LLJ.element = "route_open_fragment_attached";
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$4$4");
            return unit3;
        }
        final C259800zU<Application.ActivityLifecycleCallbacks> c259800zU2 = this.LLJI;
        final C0WWR c0wwr = this.LLJILLL;
        final C259800zU<AbstractC813200VvC> c259800zU3 = this.LLIZ;
        final FragmentManager fragmentManager2 = this.LLJILJILJ;
        final boolean z = this.LLJJ;
        final boolean z2 = this.LLILZLL;
        final InterfaceC20236714Gf<Pair<Boolean, String>> interfaceC20236714Gf = this.LLILZ;
        final C013C c013c = this.LLJILJIL;
        final Application application = this.LLJIJIL;
        ?? r9 = new C0WWW() { // from class: X.0WWU
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreDestroyed(Activity activity) {
                LIZ(activity, "on_destroy", !z);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPrePaused(Activity activity) {
                LIZ(activity, "on_pause", true);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                FragmentManager fragmentManager3;
                if (c259800zU.element != null) {
                    return;
                }
                C0WWR c0wwr2 = c0wwr;
                if (c0wwr2 != null) {
                    c0wwr2.LIZJ(activity.getClass().getName(), "activity");
                }
                c259800zU.element = activity;
                AbstractC813200VvC abstractC813200VvC2 = c259800zU3.element;
                if (abstractC813200VvC2 != null && (fragmentManager3 = fragmentManager2) != null) {
                    fragmentManager3.LLIILZL(abstractC813200VvC2);
                }
            }

            public final void LIZ(Activity activity, String str, boolean z3) {
                Application application2;
                if ((!z3 || activity.isFinishing()) && Intrinsics.LJFF(activity, c259800zU.element)) {
                    C0WWR c0wwr2 = c0wwr;
                    if (c0wwr2 != null) {
                        c0wwr2.LIZ(str, "activity");
                    }
                    if (z2) {
                        C0WWO.LIZJ(c013c, c259800zU3, c259800zU2, application, c259800zU, fragmentManager2);
                    } else {
                        Context contextL3 = C786410Ut5.L3(activity);
                        if ((contextL3 instanceof Application) && (application2 = (Application) contextL3) != null) {
                            application2.unregisterActivityLifecycleCallbacks(this);
                        }
                    }
                    C324990Cob.LIZ(new Pair(Boolean.TRUE, null), interfaceC20236714Gf);
                }
            }
        };
        c259800zU2.element = r9;
        application.registerActivityLifecycleCallbacks(r9);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("RouteKt@3ce3.awaitFinish$4$4");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
