package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.018y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2862018y extends AbstractC2863018z {
    public final long LIZJ;
    public final long LIZLLL;
    public final List<InterfaceC1891350zJl> LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2862018y)) {
            return false;
        }
        C2862018y c2862018y = (C2862018y) obj;
        return this.LIZJ == c2862018y.LIZJ && this.LIZLLL == c2862018y.LIZLLL && Intrinsics.LJFF(this.LJ, c2862018y.LJ) && this.LJFF == c2862018y.LJFF;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InProgress(version=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", visibleMembers=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nonEliminatedMemberCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2862018y(long j, int i, long j2, List list) {
        super(j, j2);
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = list;
        this.LJFF = i;
    }
}
