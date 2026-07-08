package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XR extends C07XQ {
    public final int LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07XR)) {
            return false;
        }
        C07XR c07xr = (C07XR) obj;
        return this.LIZ == c07xr.LIZ && Intrinsics.LJFF(this.LIZIZ, c07xr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07xr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07xr.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Summary(itemCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrls=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", feedbackLink=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XR(int i, String str, String str2, List list) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
        String[] strArr = new String[4];
        strArr[0] = String.valueOf(i);
        strArr[1] = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        strArr[2] = str;
        strArr[3] = str2 == null ? "" : str2;
        C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "|", null, null, 0, null, null, 62).getClass();
    }
}
