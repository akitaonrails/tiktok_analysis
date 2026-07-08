package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505930pI7 implements InterfaceC1506010pIF {
    public final long LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Long LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505930pI7)) {
            return false;
        }
        C1505930pI7 c1505930pI7 = (C1505930pI7) obj;
        return this.LIZ == c1505930pI7.LIZ && Intrinsics.LJFF(this.LIZIZ, c1505930pI7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1505930pI7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1505930pI7.LIZLLL) && Intrinsics.LJFF(this.LJ, c1505930pI7.LJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJ;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageFinishedEvent(nowMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", connectivityType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pendingRequests=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imageDownlinkKbps=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1506010pIF
    public final Long LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1506010pIF
    public final long LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1506010pIF
    public final Integer LIZJ() {
        return this.LIZJ;
    }

    public C1505930pI7(long j, String str, Integer num, Long l, Long l2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = l;
        this.LJ = l2;
    }
}
