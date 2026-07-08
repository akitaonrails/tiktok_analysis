package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595660NXw {
    public final String LIZ;
    public final C0NXK LIZIZ;
    public final List<C0NXK> LIZJ;

    public C595660NXw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C595660NXw)) {
            return false;
        }
        C595660NXw c595660NXw = (C595660NXw) obj;
        return Intrinsics.LJFF(this.LIZ, c595660NXw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c595660NXw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c595660NXw.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0NXK c0nxk = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0nxk == null ? 0 : c0nxk.hashCode())) * 31;
        List<C0NXK> list = this.LIZJ;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityStatusData(uniqueId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userActivityStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupActivityStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C595660NXw(String str, C0NXK c0nxk, List list, int i) {
        c0nxk = (i & 2) != 0 ? null : c0nxk;
        list = (i & 4) != 0 ? null : list;
        this.LIZ = str;
        this.LIZIZ = c0nxk;
        this.LIZJ = list;
    }
}
