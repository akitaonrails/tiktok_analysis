package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839630xyL {
    public final String LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final C1839660xyO LIZLLL;

    public C1839630xyL() {
        this(null, false, 0L, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1839630xyL)) {
            return false;
        }
        C1839630xyL c1839630xyL = (C1839630xyL) obj;
        return Intrinsics.LJFF(this.LIZ, c1839630xyL.LIZ) && this.LIZIZ == c1839630xyL.LIZIZ && this.LIZJ == c1839630xyL.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1839630xyL.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardFontMetricsData(fontIdentifier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFontCached=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fontDownloadDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1839630xyL(String str, boolean z, long j, C1839660xyO c1839660xyO, int i) {
        str = (i & 1) != 0 ? "" : str;
        z = (i & 2) != 0 ? false : z;
        j = (i & 4) != 0 ? 0L : j;
        if ((i & 8) != 0) {
            C1839660xyO.Companion.getClass();
            c1839660xyO = C1839660xyO.SUC;
        }
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = c1839660xyO;
    }
}
