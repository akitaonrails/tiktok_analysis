package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918190a09 implements LifecycleOwner {
    public LifecycleRegistry LL;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());

    public final synchronized void LIZ() {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            LifecycleRegistry lifecycleRegistry = this.LL;
            if (lifecycleRegistry != null) {
                lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
            }
        } else {
            C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS115S0100000_15(this, 85));
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry;
        synchronized (this) {
            if (this.LL == null) {
                this.LL = new LifecycleRegistry(this);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    LifecycleRegistry lifecycleRegistry2 = this.LL;
                    if (lifecycleRegistry2 != null) {
                        lifecycleRegistry2.setCurrentState(Lifecycle.State.STARTED);
                    }
                } else {
                    C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS115S0100000_15(this, 86));
                }
            }
            lifecycleRegistry = this.LL;
        }
        return lifecycleRegistry;
    }
}
