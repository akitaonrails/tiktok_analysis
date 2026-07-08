package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776900wLA implements InterfaceC19745512Nh {
    public final C1342130l1v LIZ;
    public final C1342130l1v LIZIZ;
    public final C1342130l1v LIZJ;
    public final C1342130l1v LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776900wLA)) {
            return false;
        }
        C1776900wLA c1776900wLA = (C1776900wLA) obj;
        return Intrinsics.LJFF(this.LIZ, c1776900wLA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1776900wLA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1776900wLA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1776900wLA.LIZLLL) && this.LJ == c1776900wLA.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BezierParam(x1=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y1=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", x2=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", y2=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776900wLA(C1342130l1v c1342130l1v, C1342130l1v c1342130l1v2, C1342130l1v c1342130l1v3, C1342130l1v c1342130l1v4, long j) {
        this.LIZ = c1342130l1v;
        this.LIZIZ = c1342130l1v2;
        this.LIZJ = c1342130l1v3;
        this.LIZLLL = c1342130l1v4;
        this.LJ = j;
    }
}
