package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12nf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19863312nf extends AbstractC19863112nd implements Serializable {
    public static final C19863312nf LL = new C19863312nf();

    @Override // X.AbstractC19863112nd
    public final AbstractC19863112nd LIZ() {
        return C19863212ne.LL;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // X.AbstractC19863112nd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        obj.getClass();
        if (obj == comparable) {
            return 0;
        }
        return comparable.compareTo(obj);
    }
}
