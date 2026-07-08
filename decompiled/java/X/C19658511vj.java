package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.als.ui.state.LiveState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19658511vj<A, B, C> {
    public final C19658411vi<A, B> LIZ;
    public final LiveState<C> LIZIZ;
    public final LiveState<C443120HZe<A, B, C>> LIZJ;

    public C19658511vj(C19658411vi<A, B> c19658411vi, LiveState<C> liveState) {
        this.LIZ = c19658411vi;
        this.LIZIZ = liveState;
        C1563460qmu c1563460qmu = new C1563460qmu();
        this.LIZJ = new LiveState<>(new AwS573S0100000_29(this, 878));
        c1563460qmu.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Lifecycle.State state = Lifecycle.State.CREATED;
        c19658411vi.LIZJ.LJIIIZ(c1563460qmu, state, new C5183020f((Function2) new AwS643S0100000_29(this, 92), (Function2<Object, Object, Object>) 189));
        liveState.LJIIIZ(c1563460qmu, state, new AwS608S0100000_29(this, 626));
    }
}
