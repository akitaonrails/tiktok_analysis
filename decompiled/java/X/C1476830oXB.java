package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;

/* JADX INFO: renamed from: X.0oXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476830oXB {
    public SimBitRate LIZ;
    public SimAudioBitrate LIZIZ;
    public EnumC2281141EQm LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJI = -1;
    public final boolean LJII = true;
    public String LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DashBitateSelectResult{videoBitrate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioBitrate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resolution=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isOpenSuperResolution=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", asyncInitSr=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", selectReason=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
