package X;

import X.C2145608as;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0yFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1850220yFQ implements InterfaceC1850330yFb {
    public LifecycleOwner LIZIZ;
    public ViewModelStoreOwner LIZJ;
    public final C1850230yFR LIZ = new C1850230yFR();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    @Override // X.InterfaceC1850330yFb
    public final C1850230yFR LJ() {
        return this.LIZ;
    }

    public final void LJI(Fragment fragment, AwS375S0200000_9 awS375S0200000_9) {
        new C981140bdg(fragment);
        if (!this.LIZLLL.getAndSet(true)) {
            this.LIZIZ = fragment;
            this.LIZJ = fragment;
            awS375S0200000_9.invoke(this.LIZ);
            fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commercialize.subpagemodule.SubPageModule$initialize$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    switch (C2145608as.LIZ[event.ordinal()]) {
                        case 1:
                            this.LL.LJII();
                            break;
                        case 2:
                            this.LL.getClass();
                            break;
                        case 3:
                            this.LL.getClass();
                            break;
                        case 4:
                            this.LL.LJIIIZ();
                            break;
                        case 5:
                            this.LL.getClass();
                            break;
                        case 6:
                            this.LL.LJIIIIZZ();
                            break;
                    }
                }
            });
        }
    }
}
