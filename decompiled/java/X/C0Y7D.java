package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y7D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y7D {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y7D)) {
            return false;
        }
        C0Y7D c0y7d = (C0Y7D) obj;
        return this.LIZ == c0y7d.LIZ && this.LIZIZ == c0y7d.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0y7d.LIZJ) && this.LIZLLL == c0y7d.LIZLLL && this.LJ == c0y7d.LJ && this.LJFF == c0y7d.LJFF && this.LJI == c0y7d.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusMessageResultMetaData(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", subMessageType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inboxType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", chainType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y7D(String str, long j, long j2, int i, int i2, int i3, int i4) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = j2;
    }
}
