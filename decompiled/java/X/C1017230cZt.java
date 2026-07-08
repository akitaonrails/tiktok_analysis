package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0cZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017230cZt {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurrentJumpDataPayload(webUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", openUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lynxSchema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1017230cZt(String str, String str2, String str3, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = str3;
    }
}
