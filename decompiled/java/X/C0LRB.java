package X;

import android.graphics.Rect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LRB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LRB {
    public final int LIZ;
    public final Rect LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final List<C0LRD> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LRB)) {
            return false;
        }
        C0LRB c0lrb = (C0LRB) obj;
        return this.LIZ == c0lrb.LIZ && Intrinsics.LJFF(this.LIZIZ, c0lrb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lrb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lrb.LIZLLL) && this.LJ == c0lrb.LJ && Intrinsics.LJFF(this.LJFF, c0lrb.LJFF);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Rect rect = this.LIZIZ;
        int iHashCode = (i + (rect == null ? 0 : rect.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreprocessPlan(inSampleSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cropRect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", initialQuality=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LRB(int i, Rect rect, Integer num, Integer num2, int i2, List<? extends C0LRD> list) {
        this.LIZ = i;
        this.LIZIZ = rect;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = i2;
        this.LJFF = list;
    }
}
