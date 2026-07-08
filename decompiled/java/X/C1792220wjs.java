package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0wjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1792220wjs {
    public String LJII;
    public C1791850wjH LJIIIIZZ;
    public String LJI = "";
    public List<Long> LJIIIZ = Collections.emptyList();
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public String LJ = "";
    public final HashMap<String, String> LJFF = new HashMap<>();

    public final boolean LIZIZ() {
        return this.LIZ == 0;
    }

    public C1792220wjs() {
        this.LJII = "";
        this.LJII = String.valueOf(-1);
        this.LJII = String.valueOf(-1);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbsResult{mCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mDetailCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mMessage='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str, String str2) {
        this.LJFF.put(str, str2);
    }
}
