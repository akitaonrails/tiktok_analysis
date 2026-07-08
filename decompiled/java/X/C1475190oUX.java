package X;

/* JADX INFO: renamed from: X.0oUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475190oUX {
    public int LIZ;
    public String LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{taskType=");
        int i = this.LIZJ;
        String str = "N/A";
        sbLIZ.append(1 == i ? "player" : 2 == i ? "preloader" : "N/A");
        sbLIZ.append(", action=");
        int i2 = this.LIZ;
        if (-1 == i2) {
            str = "und";
        } else if (i2 == 0) {
            str = "start";
        } else if (1 == i2) {
            str = "complete";
        } else if (2 == i2) {
            str = "cancel";
        }
        sbLIZ.append(str);
        sbLIZ.append(", bytesLoaded=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", off=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", endOff=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fileKey: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
