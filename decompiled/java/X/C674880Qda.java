package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674880Qda {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC994770bzf LJ;
    public final Long LJFF;
    public final long LJI;
    public final Long LJII;
    public final EnumC1158510gFl LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674880Qda)) {
            return false;
        }
        C674880Qda c674880Qda = (C674880Qda) obj;
        return this.LIZ == c674880Qda.LIZ && Intrinsics.LJFF(this.LIZIZ, c674880Qda.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c674880Qda.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c674880Qda.LIZLLL) && this.LJ == c674880Qda.LJ && Intrinsics.LJFF(this.LJFF, c674880Qda.LJFF) && this.LJI == c674880Qda.LJI && Intrinsics.LJFF(this.LJII, c674880Qda.LJII) && this.LJIIIIZZ == c674880Qda.LJIIIIZZ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode = (((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        EnumC994770bzf enumC994770bzf = this.LJ;
        int iHashCode2 = (iHashCode + (enumC994770bzf == null ? 0 : enumC994770bzf.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode3 = (((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Y2(this.LJI)) * 31;
        Long l2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        EnumC1158510gFl enumC1158510gFl = this.LJIIIIZZ;
        return iHashCode4 + (enumC1158510gFl != null ? enumC1158510gFl.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkPreloadMonitor(hitCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", domain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", preloadKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keyType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", preloadStartTimestamp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", requestStartTimestamp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", expireAt=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", missReason=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C674880Qda(boolean z, String str, String str2, String str3, EnumC994770bzf enumC994770bzf, Long l, long j, Long l2, EnumC1158510gFl enumC1158510gFl) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = enumC994770bzf;
        this.LJFF = l;
        this.LJI = j;
        this.LJII = l2;
        this.LJIIIIZZ = enumC1158510gFl;
    }
}
