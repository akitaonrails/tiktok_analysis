package X;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J3E, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3E implements LifecycleOwner {
    public static final C0J3E LL;
    public static final C01GW LLILLJJLI;

    static {
        C0J3E c0j3e = new C0J3E();
        LL = c0j3e;
        LLILLJJLI = C452501pT.LIZIZ(new C0J3G());
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c0j3e.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0J3F
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("IncentiveFakeLifeCircle@f48d.<init>$1");
                    try {
                        C0J3E.LL.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IncentiveFakeLifeCircle@f48d.<init>$1");
                }
            });
        }
    }

    public final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) LLILLJJLI.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }
}
