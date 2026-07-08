package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08F6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F6<T> implements Sequence<T> {
    public final AtomicReference<Sequence<T>> LIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        Sequence<T> andSet = this.LIZ.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public C08F6(Sequence<? extends T> sequence) {
        this.LIZ = new AtomicReference<>(sequence);
    }
}
