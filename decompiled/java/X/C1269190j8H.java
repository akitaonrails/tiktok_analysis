package X;

/* JADX INFO: renamed from: X.0j8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269190j8H {
    public String LJII;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public long LIZJ = System.currentTimeMillis();
    public long LIZLLL = -1;
    public double LJ = -1.0d;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = 1;
    public int LJIIJJI = 2;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraCaptureInfo{exposureTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iso=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isoGetTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", avgFps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", averageResultFPS=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", frameWidth=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", frameHeight=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mCamFpsRangeStr='");
        sbLIZ.append(this.LJII);
        sbLIZ.append("', cameraType='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
