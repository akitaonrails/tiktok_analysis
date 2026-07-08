package X;

import X.C0S5Q;
import X.InterfaceC710780RuO;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.164Q, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164Q<T extends C0S5Q, E extends InterfaceC710780RuO> {
    public final C13IQ<? extends T> LIZ;
    public final C13IQ<? extends T> LIZIZ;
    public final E LIZJ;
    public final List<Function1<C164Q<T, E>, Boolean>> LIZLLL;
    public final List<Function1<C164Q<T, E>, Unit>> LJ;
    public final List<Function1<C164Q<T, E>, Unit>> LJFF;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZJ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C164Q)) {
            return false;
        }
        C164Q c164q = (C164Q) obj;
        if (!Intrinsics.LJFF(c164q.LIZ, this.LIZ) || !Intrinsics.LJFF(c164q.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C164Q(C13IQ<? extends T> c13iq, C13IQ<? extends T> c13iq2, E e, List<? extends Function1<? super C164Q<T, E>, Boolean>> list, List<? extends Function1<? super C164Q<T, E>, Unit>> list2, List<? extends Function1<? super C164Q<T, E>, Unit>> list3) {
        this.LIZ = c13iq;
        this.LIZIZ = c13iq2;
        this.LIZJ = e;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = list3;
    }
}
