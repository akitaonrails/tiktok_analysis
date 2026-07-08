package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0055, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0055 {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public AnonymousClass0055() {
        this(0, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0055)) {
            return false;
        }
        AnonymousClass0055 anonymousClass0055 = (AnonymousClass0055) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0055.LIZ) && this.LIZIZ == anonymousClass0055.LIZIZ && Intrinsics.LJFF(this.LIZJ, anonymousClass0055.LIZJ) && Intrinsics.LJFF(this.LIZLLL, anonymousClass0055.LIZLLL) && this.LJ == anonymousClass0055.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessError(stage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0055(int i, String str, String str2, String str3, int i2) {
        long jCurrentTimeMillis;
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? 0 : i;
        str2 = (i2 & 4) != 0 ? "" : str2;
        str3 = (i2 & 8) != 0 ? "" : str3;
        if ((i2 & 16) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = jCurrentTimeMillis;
    }
}
