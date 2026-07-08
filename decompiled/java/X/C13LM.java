package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.13LM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LM<T> implements Sequence<T> {
    public final Function0<T> LIZ;
    public final Function1<T, T> LIZIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new C13LL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13LM(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        this.LIZ = function0;
        this.LIZIZ = function1;
    }
}
