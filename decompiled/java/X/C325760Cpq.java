package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325760Cpq extends AbstractC325730Cpn {
    public final List<String> LIZ;
    public final String LIZIZ;
    public final EnumC325870Cq1 LIZJ;
    public final String LIZLLL;

    public C325760Cpq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325760Cpq)) {
            return false;
        }
        C325760Cpq c325760Cpq = (C325760Cpq) obj;
        return Intrinsics.LJFF(this.LIZ, c325760Cpq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c325760Cpq.LIZIZ) && this.LIZJ == c325760Cpq.LIZJ && Intrinsics.LJFF(this.LIZLLL, c325760Cpq.LIZLLL);
    }

    public final int hashCode() {
        List<String> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image(urlList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cacheName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", callerId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C325760Cpq(List list, String str, EnumC325870Cq1 enumC325870Cq1, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        enumC325870Cq1 = (i & 4) != 0 ? EnumC325870Cq1.DOWNLOAD_ASYNC : enumC325870Cq1;
        str2 = (i & 8) != 0 ? null : str2;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = enumC325870Cq1;
        this.LIZLLL = str2;
    }
}
