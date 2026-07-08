package X;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2083008Ea<T> implements Sequence<IndexedValue<? extends T>> {
    public final Sequence<T> LIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<IndexedValue<T>> iterator() {
        return new C2500509r1(this, 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2083008Ea(Sequence<? extends T> sequence) {
        this.LIZ = sequence;
    }
}
