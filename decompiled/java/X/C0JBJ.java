package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import njp.a;

/* JADX INFO: renamed from: X.0JBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.executor.DefaultLauncherShortcutExecutor$tryAddLauncherShortcutInternal$1$1$awaitSystemDialogJob$1", f = "DefaultLauncherShortcutExecutor.kt", l = {127}, m = "invokeSuspend")
public final class C0JBJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C816050Vzn LLILLJJLI;
    public final /* synthetic */ C259800zU<C09AE> LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JBJ(C816050Vzn c816050Vzn, C259800zU<C09AE> c259800zU, C013C c013c, InterfaceC1364105Vn<? super C0JBJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c816050Vzn;
        this.LLILLL = c259800zU;
        this.LLILZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JBJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0JBK, android.app.Application$ActivityLifecycleCallbacks] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final Application application;
        C1C7U.LIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$awaitSystemDialogJob$1");
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
            C816050Vzn c816050Vzn = this.LLILLJJLI;
            final AwS373S0200000_7 awS373S0200000_7 = new AwS373S0200000_7(this.LLILZ, this.LLILLL, 97);
            this.LL = 1;
            c816050Vzn.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ instanceof Application) {
                application = (Application) contextLIZ;
            } else {
                application = 0;
            }
            ?? r2 = new C0JBL() { // from class: X.0JBK
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    awS373S0200000_7.invoke(Boolean.TRUE);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    awS373S0200000_7.invoke(Boolean.FALSE);
                    Application application2 = application;
                    if (application2 != null) {
                        application2.unregisterActivityLifecycleCallbacks(this);
                    }
                    InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }
            };
            c2252611DEt.LJJII(new AwS373S0200000_7(application, (C0JBK) r2, 96));
            if (application != 0) {
                application.registerActivityLifecycleCallbacks(r2);
            }
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$awaitSystemDialogJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$awaitSystemDialogJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
