package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0VMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796450VMd {
    public final String LIZ;
    public final boolean LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;

    public C796450VMd() {
        throw null;
    }

    public final int hashCode() {
        return ((((((this.LIZ.startsWith("index_") ? -1184239155 : this.LIZ.hashCode()) * 31) + (this.LIZIZ ? 1 : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", unique=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", columns=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", orders=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C796450VMd)) {
            return false;
        }
        C796450VMd c796450VMd = (C796450VMd) obj;
        if (this.LIZIZ != c796450VMd.LIZIZ || !this.LIZJ.equals(c796450VMd.LIZJ) || !this.LIZLLL.equals(c796450VMd.LIZLLL)) {
            return false;
        }
        if (this.LIZ.startsWith("index_")) {
            return c796450VMd.LIZ.startsWith("index_");
        }
        return this.LIZ.equals(c796450VMd.LIZ);
    }

    public C796450VMd(List list, String str, List list2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), EnumC796460VMe.ASC.name()) : list2;
    }
}
