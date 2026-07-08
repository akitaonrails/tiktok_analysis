package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21406118pv {
    public final int LIZ;
    public final JSONObject LIZIZ;
    public final PTYError LIZJ;
    public final PTYPackageInfo LIZLLL;

    public final boolean LIZ() {
        return this.LIZ == 0;
    }

    public final String toString() {
        String strLIZIZ;
        String strLIZIZ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PitayaTaskOutputData :: [isSuccess == ");
        sbLIZ.append(LIZ());
        sbLIZ.append(" | code == ");
        sbLIZ.append(this.LIZ);
        String strLIZIZ3 = "";
        if (this.LIZIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" | outputData == ");
            sbLIZ2.append(this.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        if (this.LIZJ != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" | rawError == ");
            sbLIZ3.append(this.LIZJ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            strLIZIZ2 = "";
        }
        sbLIZ.append(strLIZIZ2);
        if (this.LIZLLL != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(" | rawPackageInfo == ");
            sbLIZ4.append(this.LIZLLL);
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        sbLIZ.append(strLIZIZ3);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21406118pv(int i, JSONObject jSONObject, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
        this.LIZ = i;
        this.LIZIZ = jSONObject;
        this.LIZJ = pTYError;
        this.LIZLLL = pTYPackageInfo;
    }

    public /* synthetic */ C21406118pv(int i, JSONObject jSONObject, PTYError pTYError, PTYPackageInfo pTYPackageInfo, int i2) {
        this(i, (i2 & 2) != 0 ? null : jSONObject, (i2 & 4) != 0 ? null : pTYError, (i2 & 8) != 0 ? null : pTYPackageInfo);
    }
}
