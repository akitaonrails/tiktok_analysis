package X;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0qes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558480qes implements InterfaceC665370Q7z {
    public final LifecycleOwner LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1558470qer(this));

    @Override // X.InterfaceC665370Q7z
    public final String getKey() {
        return "assem_logic_scope";
    }

    @Override // X.InterfaceC665370Q7z
    public final C1554890qZ5 getTree() {
        return (C1554890qZ5) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC665370Q7z
    public final Object getHost() {
        return this.LL;
    }

    public C1558480qes(InterfaceC713360RyY interfaceC713360RyY) {
        this.LL = interfaceC713360RyY;
        C786410Ut5.LJJZZIII(AnonymousClass0850.LIZ(Looper.getMainLooper(), false), new Runnable() { // from class: X.0qeu
            public final void LIZ() {
                Context context;
                Integer numLIZ;
                final C1558480qes c1558480qes = this.LL;
                LifecycleOwner lifecycleOwner = c1558480qes.LL;
                if (lifecycleOwner != null && (lifecycleOwner.getLifecycle() instanceof AbstractC1563340qmi)) {
                    AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
                    EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
                    if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) ((AbstractC1563340qmi) lifecycleOwner.getLifecycle()).LL))) != null) {
                        c1558480qes.LL.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicScope$addLifecycleObserver$1
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                if (event == Lifecycle.Event.ON_DESTROY) {
                                    c1558480qes.getTree().LJFF();
                                }
                            }
                        });
                        C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                        return;
                    }
                }
                c1558480qes.LL.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicScope$addLifecycleObserver$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            c1558480qes.getTree().LJFF();
                        }
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LogicScope@4f30.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LogicScope@4f30.<init>$1");
            }
        });
    }
}
