package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556930Lsp implements InterfaceC543440LTa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C556930Lsp)) {
            return false;
        }
        C556930Lsp c556930Lsp = (C556930Lsp) obj;
        return Intrinsics.LJFF(this.LIZ, c556930Lsp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556930Lsp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c556930Lsp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c556930Lsp.LIZLLL) && Intrinsics.LJFF(this.LJ, c556930Lsp.LJ) && Intrinsics.LJFF(this.LJFF, c556930Lsp.LJFF) && Intrinsics.LJFF(this.LJI, c556930Lsp.LJI) && Intrinsics.LJFF(this.LJII, c556930Lsp.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c556930Lsp.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJII;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIIZZ;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTaskStartEvent(clientTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serverTaskType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", resourceID=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", deviceID=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", userID=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C556930Lsp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
    }
}
