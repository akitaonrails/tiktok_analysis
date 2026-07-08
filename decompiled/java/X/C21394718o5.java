package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.18o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21394718o5 {
    public final String LIZ;
    public final String LIZIZ;
    public final HashMap<String, Object> LIZJ;
    public final EnumC1067640dtC LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionInfo(projectName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraQuery=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21394718o5(String str, String str2, HashMap<String, Object> map, EnumC1067640dtC enumC1067640dtC) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = enumC1067640dtC;
    }
}
