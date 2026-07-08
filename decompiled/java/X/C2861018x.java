package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.018x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2861018x extends AbstractC2863018z {
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2861018x)) {
            return false;
        }
        C2861018x c2861018x = (C2861018x) obj;
        return this.LIZJ == c2861018x.LIZJ && this.LIZLLL == c2861018x.LIZLLL && Intrinsics.LJFF(this.LJ, c2861018x.LJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("End(version=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2861018x(long j, long j2, String str) {
        super(j, j2);
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str;
    }
}
