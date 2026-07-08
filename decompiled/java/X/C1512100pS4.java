package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1512100pS4 {
    public int LIZ;
    public String LIZIZ;
    public Map<String, Float> LIZJ;
    public Float LIZLLL;
    public String LJ;
    public Map<String, Object> LJFF;
    public String LJI;

    public C1512100pS4() {
        this((Object) null);
    }

    public final Map<String, Object> LIZ() {
        Map<String, Object> map = this.LJFF;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.LJFF = map2;
        return map2;
    }

    public final boolean LIZIZ() {
        int i = this.LIZ;
        return i == 0 || i == 110;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{success:");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", errorCode:");
        sbLIZ.append(this.LIZ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", label:");
            sbLIZ2.append(this.LIZIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LIZJ != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(", scoreMap=");
            sbLIZ3.append(this.LIZJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (this.LIZLLL != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(", value=");
            sbLIZ4.append(this.LIZLLL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (this.LJFF != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(", extOutMap=");
            sbLIZ5.append(this.LJFF);
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        }
        sb.append("}");
        return sb.toString();
    }

    public C1512100pS4(int i) {
        this.LIZ = i;
    }

    public /* synthetic */ C1512100pS4(Object obj) {
        this(-999);
    }
}
