package X;

import X.InterfaceC940430aa1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.component.sei.SeiPlayComponent$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01a2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C356801a2<T extends InterfaceC940430aa1> {
    public LifecycleOwner LIZ = null;
    public final ConcurrentHashMap<String, Class<?>> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Function2<T, Object, Unit>, String> LIZLLL = new ConcurrentHashMap<>();
    public volatile boolean LJ;

    public final boolean LIZ() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwner = this.LIZ;
        return (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || currentState.isAtLeast(Lifecycle.State.INITIALIZED)) && !this.LJ;
    }

    public C356801a2() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LIZ;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new SeiPlayComponent$1(this));
    }
}
