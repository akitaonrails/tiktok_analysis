package X;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.07ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1939607ik implements Sequence<Object> {
    public final /* synthetic */ Iterable LIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return this.LIZ.iterator();
    }

    public C1939607ik(Iterable iterable) {
        this.LIZ = iterable;
    }
}
