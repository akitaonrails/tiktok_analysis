package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0lz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378790lz3 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisShareInfo(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", query=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1378790lz3(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
    }
}
