package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05M1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05M1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05M1)) {
            return false;
        }
        C05M1 c05m1 = (C05M1) obj;
        return Intrinsics.LJFF(this.LIZ, c05m1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c05m1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c05m1.LIZJ) && this.LIZLLL == c05m1.LIZLLL && this.LJ == c05m1.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflineInteractionEvent(eventId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", diggType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", updatedTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05M1(String str, String str2, String str3, int i, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
