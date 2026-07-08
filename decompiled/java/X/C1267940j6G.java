package X;

/* JADX INFO: renamed from: X.0j6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267940j6G {
    public int LIZ = 720;
    public int LIZIZ = 1280;
    public int LIZJ = 7;
    public int LIZLLL = 30;
    public int LJ = 1;

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptureParams(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minFps=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cameraFacing=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1267940j6G)) {
            return false;
        }
        C1267940j6G c1267940j6G = (C1267940j6G) obj;
        if (this.LIZ != c1267940j6G.LIZ || this.LIZIZ != c1267940j6G.LIZIZ || this.LIZJ != c1267940j6G.LIZJ || this.LIZLLL != c1267940j6G.LIZLLL || this.LJ != c1267940j6G.LJ) {
            return false;
        }
        return true;
    }
}
