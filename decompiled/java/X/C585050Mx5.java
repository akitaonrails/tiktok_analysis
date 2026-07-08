package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Mx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585050Mx5 {
    public final String LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public Map<String, List<String>> LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchOutput{ruleName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", condition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commandName='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", commandParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C585050Mx5(String str, String str2, Map<String, Object> map) {
        this.LIZ = str;
        this.LJ = str2;
        this.LJFF = map;
    }
}
