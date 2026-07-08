package X;

import iyl.i3;
import java.util.List;

/* JADX INFO: renamed from: X.0tF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657830tF7 {
    public final boolean LIZ;
    public boolean LIZIZ;
    public C1460190o6L LIZJ;
    public final List<i3> LIZLLL;
    public final List<i3> LJ;
    public final List<i3> LJFF;
    public final List<i3> LJI;
    public final C21341918fZ LJII;
    public final C21341918fZ LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffUpdateResult(couldShowMore:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",runAnimate:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",animationConfig:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",oldFixedData:");
        sbLIZ.append(this.LIZLLL.size());
        sbLIZ.append(",newFixedData:");
        sbLIZ.append(this.LJ.size());
        sbLIZ.append(",oldSlideData:");
        sbLIZ.append(this.LJFF.size());
        sbLIZ.append(",newSlideData:");
        sbLIZ.append(this.LJI.size());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1657830tF7(boolean z, boolean z2, C1460190o6L c1460190o6L, List<i3> list, List<i3> list2, List<i3> list3, List<i3> list4, C21341918fZ c21341918fZ, C21341918fZ c21341918fZ2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c1460190o6L;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = list3;
        this.LJI = list4;
        this.LJII = c21341918fZ;
        this.LJIIIIZZ = c21341918fZ2;
    }
}
