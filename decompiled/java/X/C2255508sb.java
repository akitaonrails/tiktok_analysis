package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2255508sb {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2255508sb)) {
            return false;
        }
        C2255508sb c2255508sb = (C2255508sb) obj;
        return Intrinsics.LJFF(this.LIZ, c2255508sb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2255508sb.LIZIZ) && this.LIZJ == c2255508sb.LIZJ && this.LIZLLL == c2255508sb.LIZLLL && this.LJ == c2255508sb.LJ && this.LJFF == c2255508sb.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotFrameInfo(slotUuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourcePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTimeUs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endTimeUs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isImage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2255508sb(String str, String str2, long j, long j2, long j3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
        this.LJFF = j3;
    }
}
