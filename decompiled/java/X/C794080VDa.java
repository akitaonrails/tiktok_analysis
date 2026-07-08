package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0VDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C794080VDa {
    public final String LIZJ;
    public final HashMap<String, String> LJI;
    public int LIZLLL = 2;
    public String LJ = "no error";
    public final long LIZ = 0;
    public final boolean LIZIZ = false;
    public final long LJFF = System.currentTimeMillis();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadInfo{lastUploadTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isUploading=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", commandId='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", cloudMsgResponseCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", operateTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", specificParams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C794080VDa(String str, HashMap map) {
        this.LIZJ = str;
        this.LJI = map;
    }
}
