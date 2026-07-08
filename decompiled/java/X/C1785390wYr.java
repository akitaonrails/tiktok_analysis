package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785390wYr implements InterfaceC1785410wYt {
    public final boolean LIZ;
    public final C1785380wYq LIZIZ;
    public final AbstractC874970YUd LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785390wYr)) {
            return false;
        }
        C1785390wYr c1785390wYr = (C1785390wYr) obj;
        return this.LIZ == c1785390wYr.LIZ && Intrinsics.LJFF(this.LIZIZ, c1785390wYr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785390wYr.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        AbstractC874970YUd abstractC874970YUd = this.LIZJ;
        return iZ2 + (abstractC874970YUd == null ? 0 : abstractC874970YUd.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Data(fromCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1785390wYr(boolean z, C1785380wYq c1785380wYq, AbstractC874970YUd abstractC874970YUd) {
        this.LIZ = z;
        this.LIZIZ = c1785380wYq;
        this.LIZJ = abstractC874970YUd;
    }
}
