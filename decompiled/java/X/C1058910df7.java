package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0df7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058910df7 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public JSONObject LIZLLL;
    public int LJ;
    public String LJFF;
    public String LJI;
    public String LJIIJ;
    public Boolean LJII = Boolean.FALSE;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public boolean LJIIJJI = true;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsMsg{type='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", callback_id='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", func='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", namespace=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", iFrameUrl=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", permissionGroup=");
        sbLIZ.append(TextUtils.isEmpty(this.LJIIJ) ? "" : this.LJIIJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
