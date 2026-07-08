package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.als.ui.state.LiveState;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: renamed from: X.11vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19658611vk<A, B, C, D> {
    public final C19658511vj<A, B, C> LIZ;
    public final LiveState<D> LIZIZ;
    public final LiveState<C1660260tJ2<A, B, C, D>> LIZJ;

    public C19658611vk(C19658511vj<A, B, C> c19658511vj, LiveState<D> liveState) {
        this.LIZ = c19658511vj;
        this.LIZIZ = liveState;
        C1563460qmu c1563460qmu = new C1563460qmu();
        this.LIZJ = new LiveState<>(new AwS573S0100000_29(this, 879));
        c1563460qmu.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Lifecycle.State state = Lifecycle.State.CREATED;
        c19658511vj.LIZJ.LJIIIZ(c1563460qmu, state, new AwS582S0100000_3(new AwS678S0100000_29(this, 7), (InterfaceC1631620sYq<Object, Object, Object, Unit>) 101));
        liveState.LJIIIZ(c1563460qmu, state, new AwS608S0100000_29(this, 627));
    }
}
