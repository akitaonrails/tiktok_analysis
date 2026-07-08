package X;

import com.ss.bytertc.engine.VideoEncoderConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0j6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268160j6c {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public ArrayList<VideoEncoderConfig> LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultLinkMicVideoParams:captureWidth:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", captureHeight:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", encodeWidth:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", encodeHeight:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", effectWidth:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", effectHeight:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fps:");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bitrate:");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", encodeConfigs:");
        sbLIZ.append(this.LJIIIIZZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
