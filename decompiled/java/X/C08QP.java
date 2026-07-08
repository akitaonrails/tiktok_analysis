package X;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08QP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QP<T, K> implements Sequence<T> {
    public final Sequence<T> LIZ;
    public final Function1<T, K> LIZIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        final Iterator<T> it2 = this.LIZ.iterator();
        final Function1<T, K> function1 = this.LIZIZ;
        return new C08QL<T>(it2, function1) { // from class: X.08QO
            public final Iterator<T> LLILLL;
            public final Function1<T, K> LLILZ;
            public final HashSet<K> LLILZIL = new HashSet<>();

            @Override // X.C08QL
            public final void LIZ() {
                while (this.LLILLL.hasNext()) {
                    T next = this.LLILLL.next();
                    if (this.LLILZIL.add(this.LLILZ.invoke(next))) {
                        this.LLILLJJLI = next;
                        this.LL = 1;
                        return;
                    }
                }
                this.LL = 2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLILLL = it2;
                this.LLILZ = function1;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C08QP(Sequence<? extends T> sequence, Function1<? super T, ? extends K> function1) {
        this.LIZ = sequence;
        this.LIZIZ = function1;
    }
}
