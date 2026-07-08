package X;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1273200jEk {
    public final List<C1276780jKW> LIZ;
    public List<C1276780jKW> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public final JSONObject LJFF;
    public EnumC1273220jEm LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectMixParams{layoutBeforeEffect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutAfterEffect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectId='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", effectPath='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", effectTag='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1273200jEk(List<C1276780jKW> list, List<C1276780jKW> list2, String str, String str2, JSONObject jSONObject) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJFF = jSONObject;
    }
}
