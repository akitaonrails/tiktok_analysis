package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345420l7E extends C1345400l7C {
    public String LJI;

    public C1345420l7E() {
        super(-1L, -1L, -1L, -1L, "comment_digg_time", false);
        this.LJI = "";
    }

    @Override // X.C1345400l7C, X.AbstractC1345440l7G
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObjectLIZJ = super.LIZJ();
        jSONObjectLIZJ.put("digg_type", this.LJI);
        return jSONObjectLIZJ;
    }
}
