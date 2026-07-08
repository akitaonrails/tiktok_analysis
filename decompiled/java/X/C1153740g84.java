package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153740g84 {
    public final String LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153740g84)) {
            return false;
        }
        C1153740g84 c1153740g84 = (C1153740g84) obj;
        return Intrinsics.LJFF(this.LIZ, c1153740g84.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153740g84.LIZIZ) && this.LIZJ == c1153740g84.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1153740g84.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Long l2 = this.LIZLLL;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomPerfData(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sendStartTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isGenerateRetry=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", regenerateStartTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153740g84(Long l, Long l2, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = z;
        this.LIZLLL = l2;
    }

    public /* synthetic */ C1153740g84(int i, Long l, Long l2, String str, boolean z) {
        this((i & 2) != 0 ? null : l, (i & 8) != 0 ? null : l2, str, (i & 4) != 0 ? false : z);
    }
}
