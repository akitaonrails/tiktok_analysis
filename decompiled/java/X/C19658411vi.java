package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.als.ui.state.LiveState;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19658411vi<A, B> {
    public final LiveState<A> LIZ;
    public final LiveState<B> LIZIZ;
    public final LiveState<Pair<A, B>> LIZJ;

    public C19658411vi(LiveState<A> liveState, LiveState<B> liveState2) {
        this.LIZ = liveState;
        this.LIZIZ = liveState2;
        C1563460qmu c1563460qmu = new C1563460qmu();
        this.LIZJ = new LiveState<>(new AwS573S0100000_29(this, 877));
        c1563460qmu.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Lifecycle.State state = Lifecycle.State.CREATED;
        liveState.LJIIIZ(c1563460qmu, state, new AwS608S0100000_29(this, 624));
        liveState2.LJIIIZ(c1563460qmu, state, new AwS608S0100000_29(this, 625));
    }
}
