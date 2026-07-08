package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2101208La<T, R> implements Sequence<R> {
    public final Sequence<T> LIZ;
    public final Function2<Integer, T, R> LIZIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<R> iterator() {
        return new C08LZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2101208La(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends R> function2) {
        this.LIZ = sequence;
        this.LIZIZ = function2;
    }
}
