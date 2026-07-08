package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382010EyN {
    public final List<C381550Exd> LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public C382010EyN() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382010EyN)) {
            return false;
        }
        C382010EyN c382010EyN = (C382010EyN) obj;
        return Intrinsics.LJFF(this.LIZ, c382010EyN.LIZ) && this.LIZIZ == c382010EyN.LIZIZ && Intrinsics.LJFF(this.LIZJ, c382010EyN.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIQuotaListResponse(quotaList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C382010EyN(List list, int i) {
        String str;
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        if ((i & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(list, 0, str);
    }

    public C382010EyN(List<C381550Exd> list, int i, String str) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
