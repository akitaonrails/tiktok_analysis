package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.09dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2418109dj {
    public static C2418109dj LIZJ;
    public static final List<String> LIZLLL = new CopyOnWriteArrayList();
    public SharedPreferences LIZ;
    public C822650WOx LIZIZ;

    public static String LIZJ() {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = ((CopyOnWriteArrayList) LIZLLL).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append("\n");
        }
        ((CopyOnWriteArrayList) LIZLLL).clear();
        return sb.toString();
    }

    public static C2418109dj LIZLLL() {
        C2418109dj c2418109dj = LIZJ;
        return c2418109dj == null ? new C2418109dj() : c2418109dj;
    }

    public final SharedPreferences LJ() {
        if (this.LIZ == null) {
            this.LIZ = C810670Vr7.LIZJ(C2421809eK.LIZ, 0, "zoin—sp");
        }
        return this.LIZ;
    }

    public void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decompress end ");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decompress start ");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJFF(String str) {
        System.err.println(str);
        ((CopyOnWriteArrayList) LIZLLL).add(str);
    }

    public void LJI(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Report module:");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(101);
        sbLIZ.append(", map: ");
        sbLIZ.append(map);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }
}
