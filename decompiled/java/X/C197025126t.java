package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.126t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197025126t<T, R, E> implements Sequence<E> {
    public final Sequence<T> LIZ;
    public final Function1<T, R> LIZIZ;
    public final Function1<R, Iterator<E>> LIZJ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<E> iterator() {
        return new C197024126s(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C197025126t(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1, Function1<? super R, ? extends Iterator<? extends E>> function12) {
        this.LIZ = sequence;
        this.LIZIZ = function1;
        this.LIZJ = function12;
    }
}
