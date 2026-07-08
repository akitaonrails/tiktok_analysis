package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1520150pf3 extends AbstractC1520070pev {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public Boolean LJ;
    public Integer LJFF;

    @Override // X.AbstractC1520070pev
    public final JSONObject LIZIZ() {
        JSONObject jSONObjectLIZIZ = super.LIZIZ();
        C1520640pfq.LJIILIIL("event_type", this.LIZ, jSONObjectLIZIZ);
        String str = this.LIZIZ;
        if (str != null) {
            C1520640pfq.LJIILIIL("client_issue_id", str, jSONObjectLIZIZ);
        }
        String str2 = this.LIZJ;
        if (str2 != null) {
            C1520640pfq.LJIILIIL("st_checkpoints", str2, jSONObjectLIZIZ);
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            C1520640pfq.LJIILIIL("st_bizsteps", str3, jSONObjectLIZIZ);
        }
        Boolean bool = this.LJ;
        if (bool != null) {
            C1520640pfq.LJIIJJI(bool.booleanValue() ? 1 : 0, "has_fatal_error", jSONObjectLIZIZ);
        }
        Integer num = this.LJFF;
        if (num != null) {
            C1520640pfq.LJIILJJIL(jSONObjectLIZIZ, "blank_category", num);
        }
        return jSONObjectLIZIZ;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseNativeInfo{eventType='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1520150pf3(String str) {
        this.LIZ = str;
    }
}
