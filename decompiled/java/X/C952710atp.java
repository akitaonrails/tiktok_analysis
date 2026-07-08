package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0atp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952710atp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C952710atp)) {
            return false;
        }
        C952710atp c952710atp = (C952710atp) obj;
        return Intrinsics.LJFF(this.LIZ, c952710atp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c952710atp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c952710atp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c952710atp.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ids(userIdsCsv=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomIdsCsv=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", friendRoomIdsCsv=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", recommendRoomIdsCsv=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C952710atp(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
