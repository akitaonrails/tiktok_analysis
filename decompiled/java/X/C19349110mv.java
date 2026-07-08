package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.10mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19349110mv {
    public String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF;
    public String LJI;
    public JSONObject LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Action{sdkName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", sdkVersion='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", launchSequence=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", actionId='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", message='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", timeStamp='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19349110mv(int i) {
        this.LIZJ = i;
    }
}
