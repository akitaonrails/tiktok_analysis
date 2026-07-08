package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416710xp {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19416710xp)) {
            return false;
        }
        C19416710xp c19416710xp = (C19416710xp) obj;
        return Intrinsics.LJFF(this.LIZ, c19416710xp.LIZ) && this.LIZIZ == c19416710xp.LIZIZ && this.LIZJ == c19416710xp.LIZJ && this.LIZLLL == c19416710xp.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusTrackParams(statusColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", networkStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", audioStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", performanceStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19416710xp(String str, int i, int i2, int i3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
