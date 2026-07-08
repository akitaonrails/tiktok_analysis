package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YD implements C07YC {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;

    public C07YD() {
        this(null, null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YD)) {
            return false;
        }
        C07YD c07yd = (C07YD) obj;
        return Intrinsics.LJFF(this.LIZ, c07yd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07yd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07yd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07yd.LIZLLL) && Intrinsics.LJFF(this.LJ, c07yd.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorData(propLinkedAnchors=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", propAnchors=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mvName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activityAnchor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", allAnchors=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YD(String str, String str2, List list, List list2, List list3, int i) {
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        list2 = (i & 2) != 0 ? C13BV.INSTANCE : list2;
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        list3 = (i & 16) != 0 ? C13BV.INSTANCE : list3;
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = list3;
    }
}
