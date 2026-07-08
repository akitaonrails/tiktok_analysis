package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19863212ne extends AbstractC19863112nd implements Serializable {
    public static final C19863212ne LL = new C19863212ne();

    @Override // X.AbstractC19863112nd
    public final AbstractC19863112nd LIZ() {
        return C19863312nf.LL;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // X.AbstractC19863112nd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        obj2.getClass();
        return comparable.compareTo(obj2);
    }
}
