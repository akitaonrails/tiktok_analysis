package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.13BY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BY<T> implements Sequence<T> {
    public final Sequence<T> LIZ;
    public final Function1<T, Boolean> LIZIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new C13BX(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13BY(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        this.LIZ = sequence;
        this.LIZIZ = function1;
    }
}
