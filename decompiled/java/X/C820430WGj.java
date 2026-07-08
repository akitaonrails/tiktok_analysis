package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C820430WGj implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C820210WFn LL;

    public C820430WGj(C820210WFn c820210WFn) {
        this.LL = c820210WFn;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGv
            public final /* synthetic */ C820430WGj LLILZLL;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivityDestroyed(new C0WH6(activity), this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLILZLL = this;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGm
            public final /* synthetic */ C820430WGj LLILZLL;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivityPaused(new C0WH6(activity), this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLILZLL = this;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGn
            public final /* synthetic */ C820430WGj LLILZLL;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivityResumed(new C0WH6(activity), this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLILZLL = this;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGl
            public final /* synthetic */ C820430WGj LLILZLL;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivityStarted(new C0WH6(activity), this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLILZLL = this;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGo
            public final /* synthetic */ C820430WGj LLILZLL;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivityStopped(new C0WH6(activity), this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLILZLL = this;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGi
            public final /* synthetic */ C820430WGj LLIZ;

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                Bundle bundle2 = null;
                obj = null;
                Object obj = null;
                if (bundle != null) {
                    Bundle bundle3 = new Bundle();
                    if (bundle.containsKey("com.google.app_measurement.screen_service")) {
                        try {
                            obj = bundle.get("com.google.app_measurement.screen_service");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        if (obj instanceof Bundle) {
                            C786410Ut5.LJJIIZI(bundle3, (Bundle) obj, "com.google.app_measurement.screen_service");
                        }
                    }
                    bundle2 = bundle3;
                }
                InterfaceC820490WGp interfaceC820490WGp = this.LLIZ.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivityCreated(new C0WH6(activity), bundle2, this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLIZ = this;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, Bundle bundle) {
        final C0WGB c0wgb = new C0WGB();
        this.LL.LIZIZ(new AbstractRunnableC820240WFq(this) { // from class: X.0WGk
            public final /* synthetic */ C820430WGj LLIZ;

            @Override // X.AbstractRunnableC820240WFq
            public final void LIZ() {
                InterfaceC820490WGp interfaceC820490WGp = this.LLIZ.LL.LJI;
                C0W3J.LJIIIIZZ(interfaceC820490WGp);
                interfaceC820490WGp.onActivitySaveInstanceState(new C0WH6(activity), c0wgb, this.LLILLJJLI);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LL, true);
                this.LLIZ = this;
            }
        });
        Bundle bundleLLILLIZIL = c0wgb.LLILLIZIL(50L);
        if (bundleLLILLIZIL != null) {
            C786410Ut5.LJJIIJZLJL(bundle, bundleLLILLIZIL);
        }
    }
}
