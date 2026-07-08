package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4D {
    public final C332760D2s LIZ;
    public final C0D3K LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D4D)) {
            return false;
        }
        C0D4D c0d4d = (C0D4D) obj;
        return Intrinsics.LJFF(this.LIZ, c0d4d.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d4d.LIZIZ) && this.LIZJ == c0d4d.LIZJ && this.LIZLLL == c0d4d.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0D3K c0d3k = this.LIZIZ;
        return ((((iHashCode + (c0d3k == null ? 0 : c0d3k.hashCode())) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnestepPageData(launchArgs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pdpPageData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isPdpInitialLoadSettled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D4D(C332760D2s c332760D2s, C0D3K c0d3k, int i, boolean z) {
        this.LIZ = c332760D2s;
        this.LIZIZ = c0d3k;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
