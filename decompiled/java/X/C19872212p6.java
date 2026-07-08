package X;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.12p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19872212p6<K, V> extends AbstractC19872612pA<K, V>.a implements Set<Map.Entry<K, V>> {
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C1664790tQL.LIZIZ(this);
    }

    public C19872212p6(AbstractC19872612pA abstractC19872612pA) {
        super();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return C1664790tQL.LIZ(obj, this);
    }
}
