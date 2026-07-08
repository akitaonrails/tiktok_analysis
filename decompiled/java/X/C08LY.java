package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08LY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LY<T, R> implements Sequence<R> {
    public final Sequence<T> LIZ;
    public final Function1<T, R> LIZIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<R> iterator() {
        return new C08LX(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C08LY(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        this.LIZ = sequence;
        this.LIZIZ = function1;
    }
}
