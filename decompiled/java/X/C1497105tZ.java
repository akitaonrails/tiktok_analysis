package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.05tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1497105tZ extends AbstractC1493005su {
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1497105tZ)) {
            return false;
        }
        C1497105tZ c1497105tZ = (C1497105tZ) obj;
        return this.LIZLLL == c1497105tZ.LIZLLL && this.LJ == c1497105tZ.LJ && this.LJFF == c1497105tZ.LJFF;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerDownloadEventBody(success=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resourceID=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", unzipTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1497105tZ(boolean z, long j, long j2) {
        super(C2097908Jt.LIZJ(new Pair("is_successful", Boolean.valueOf(z))), C2097908Jt.LIZJ(new Pair("unzip_time", Long.valueOf(j2 >= -1 ? j2 : -1L))), C2097908Jt.LIZJ(new Pair("resource_id", Long.valueOf(j))));
        this.LIZLLL = z;
        this.LJ = j;
        this.LJFF = j2;
    }
}
