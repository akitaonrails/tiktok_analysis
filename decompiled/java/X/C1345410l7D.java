package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345410l7D extends C1345400l7C {
    public String LJI;

    public C1345410l7D() {
        super(-1L, -1L, -1L, -1L, "comment_collect_time", false);
        this.LJI = "";
    }

    @Override // X.C1345400l7C, X.AbstractC1345440l7G
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObjectLIZJ = super.LIZJ();
        jSONObjectLIZJ.put("collect_type", this.LJI);
        return jSONObjectLIZJ;
    }
}
