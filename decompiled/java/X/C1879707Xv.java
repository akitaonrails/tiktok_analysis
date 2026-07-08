package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1879707Xv {
    public final String LIZ;
    public final C1879607Xu LIZIZ;
    public final List<C1879707Xv> LIZJ;
    public final List<Integer> LIZLLL;

    public C1879707Xv() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879707Xv)) {
            return false;
        }
        C1879707Xv c1879707Xv = (C1879707Xv) obj;
        return Intrinsics.LJFF(this.LIZ, c1879707Xv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1879707Xv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1879707Xv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1879707Xv.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1879607Xu c1879607Xu = this.LIZIZ;
        return ((((iHashCode + (c1879607Xu != null ? c1879607Xu.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrieNode(segment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", compiled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", children=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", configIndexes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1879707Xv(String str, C1879607Xu c1879607Xu, int i) {
        ArrayList arrayList;
        str = (i & 1) != 0 ? null : str;
        c1879607Xu = (i & 2) != 0 ? null : c1879607Xu;
        if ((i & 4) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = (i & 8) != 0 ? new ArrayList() : null;
        this.LIZ = str;
        this.LIZIZ = c1879607Xu;
        this.LIZJ = arrayList;
        this.LIZLLL = arrayList2;
    }
}
