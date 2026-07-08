package X;

import com.bytedance.pumbaa.ruler.base.models.RuleModel;
import com.google.gson.k;

/* JADX INFO: renamed from: X.0WLW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLW {
    public final int LIZ;
    public final String LIZIZ;
    public final RuleModel LIZJ;
    public final Throwable LIZLLL;
    public final k LJ;
    public final Object LJFF;

    public C0WLW() {
        this(null, null, null, 63);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[code = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ruleModel=");
        RuleModel ruleModel = this.LIZJ;
        sbLIZ.append(ruleModel != null ? ruleModel.toString() : null);
        sbLIZ.append(", msg = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", result = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WLW(RuleModel ruleModel, k kVar, Object obj, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        ruleModel = (i & 4) != 0 ? null : ruleModel;
        kVar = (i & 16) != 0 ? null : kVar;
        obj = (i & 32) != 0 ? null : obj;
        this.LIZ = i2;
        this.LIZIZ = null;
        this.LIZJ = ruleModel;
        this.LIZLLL = null;
        this.LJ = kVar;
        this.LJFF = obj;
    }
}
