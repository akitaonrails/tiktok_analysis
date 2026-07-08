package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0jHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275140jHs {
    public String LIZ;
    public int LIZIZ;
    public byte[] LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ = "";

    public final void LIZ() {
        this.LIZ = "";
        this.LIZIZ = 0;
        this.LIZJ = null;
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = "";
        this.LJIIJ = "";
    }

    public C1275140jHs() {
        LIZ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRTCExtInfo{token='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", vendor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appSignature=");
        sbLIZ.append(Arrays.toString(this.LIZJ));
        sbLIZ.append(", channelId='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", userId='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", interactId='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", vendorName='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mixMaxBitrateKbps=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", interactIdMode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", businessId='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mixStreamTaskId='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
