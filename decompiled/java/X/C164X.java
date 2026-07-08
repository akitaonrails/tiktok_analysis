package X;

import X.C0S5Q;
import X.InterfaceC710780RuO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164X<T extends C0S5Q, E extends InterfaceC710780RuO> {
    public final C13IQ<? extends T> LIZ;
    public C19719912Dl LIZIZ;
    public AbstractC207157164l LIZJ;
    public final List<Function1<C164Q<T, E>, Unit>> LIZLLL = new ArrayList();
    public final List<Function1<C164Q<T, E>, Unit>> LJ = new ArrayList();
    public final List<Function1<C164Q<T, E>, Boolean>> LJFF = new ArrayList();

    public C164X(C13IQ<? extends T> c13iq) {
        this.LIZ = c13iq;
    }

    public final void LIZ(Function1<? super C164Q<T, E>, Unit> function1) {
        ((ArrayList) this.LJ).add(function1);
    }
}
