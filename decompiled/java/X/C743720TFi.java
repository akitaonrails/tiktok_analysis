package X;

import defpackage.d1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743720TFi extends C1345400l7C {
    public final int LJI;
    public final int LJII;
    public final d1 LJIIIIZZ;

    public C743720TFi() {
        d1 d1Var = new d1("CommentLoadMorePrefEvent");
        super(-1L, -1L, -1L, -1L, "comment_load_more_time", false);
        this.LJI = 1;
        this.LJII = 1;
        this.LJIIIIZZ = d1Var;
    }

    @Override // X.C1345400l7C, X.AbstractC1345440l7G
    public final void LIZIZ() {
        super.LIZIZ();
        d1 d1Var = this.LJIIIIZZ;
        d1Var.LIZIZ.clear();
        d1Var.LIZJ.clear();
        d1Var.LIZLLL = 0;
    }

    @Override // X.C1345400l7C, X.AbstractC1345440l7G
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObjectLIZJ = super.LIZJ();
        jSONObjectLIZJ.put("page_num", this.LJI);
        jSONObjectLIZJ.put("page_size", this.LJII);
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIIIZZ.LIZJ()).entrySet()) {
            jSONObjectLIZJ.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        return jSONObjectLIZJ;
    }
}
