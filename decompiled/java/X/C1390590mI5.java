package X;

/* JADX INFO: renamed from: X.0mI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390590mI5 {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LJFF;
    public long LIZLLL = -1;
    public final boolean LJ = false;
    public String LJI = null;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str3 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupRecordData(elementLabel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", triggerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isReport=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1390590mI5(String str, String str2, long j, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LJFF = str3;
    }
}
