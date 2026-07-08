package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556920Lso implements InterfaceC543440LTa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C556920Lso)) {
            return false;
        }
        C556920Lso c556920Lso = (C556920Lso) obj;
        return Intrinsics.LJFF(this.LIZ, c556920Lso.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556920Lso.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c556920Lso.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c556920Lso.LIZLLL) && this.LJ == c556920Lso.LJ && Intrinsics.LJFF(this.LJFF, c556920Lso.LJFF) && Intrinsics.LJFF(this.LJI, c556920Lso.LJI) && Intrinsics.LJFF(this.LJII, c556920Lso.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c556920Lso.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c556920Lso.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIZ;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncSubTaskStartEvent(clientTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serverTaskType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isRetry=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", resourceID=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", deviceID=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", userID=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C556920Lso(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
    }
}
