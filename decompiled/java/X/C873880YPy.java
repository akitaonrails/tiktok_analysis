package X;

import android.util.SparseArray;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873880YPy {
    public final Integer LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final SparseArray<Object> LIZLLL;
    public final C0YPT LJ;
    public final C869590Y9l LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873880YPy)) {
            return false;
        }
        C873880YPy c873880YPy = (C873880YPy) obj;
        return Intrinsics.LJFF(this.LIZ, c873880YPy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873880YPy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c873880YPy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c873880YPy.LIZLLL) && this.LJ == c873880YPy.LJ && Intrinsics.LJFF(this.LJFF, c873880YPy.LJFF) && this.LJI == c873880YPy.LJI;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        SparseArray<Object> sparseArray = this.LIZLLL;
        int iHashCode4 = (((iHashCode3 + (sparseArray == null ? 0 : sparseArray.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        C869590Y9l c869590Y9l = this.LJFF;
        return ((iHashCode4 + (c869590Y9l != null ? c869590Y9l.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InterceptorTarget(msgType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", localExt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", localCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sourceType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", existingMessage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isMediaSend=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C873880YPy(Integer num, String str, Map<String, String> map, SparseArray<Object> sparseArray, C0YPT c0ypt, C869590Y9l c869590Y9l, boolean z) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = sparseArray;
        this.LJ = c0ypt;
        this.LJFF = c869590Y9l;
        this.LJI = z;
    }
}
