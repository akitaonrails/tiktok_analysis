package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XO5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XO5 extends C0XO2 {
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;

    @Override // X.C0XO2
    public void LIZ() {
        super.LIZ();
        JSONObject jSONObject = this.LJJIIJ;
        if (jSONObject.has("name")) {
            this.LJJIIJZLJL = jSONObject.optString("name");
        } else if (jSONObject.has("username")) {
            this.LJJIIJZLJL = jSONObject.optString("username");
        }
        this.LJJIIZI = jSONObject.optString("avatar_url");
        this.LJJIIZ = jSONObject.optString("description");
    }

    public C0XO5() {
    }

    public C0XO5(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C0XO5(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
