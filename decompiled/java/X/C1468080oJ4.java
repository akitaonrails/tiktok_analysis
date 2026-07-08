package X;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0oJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468080oJ4 {
    public String LIZ;
    public String LIZIZ;
    public HashSet<String> LIZJ;
    public HashMap<String, Object> LIZLLL;
    public long LJFF;
    public long LJI;
    public long LJ = -1;
    public float LJII = -1.0f;
    public int LJIIIIZZ = 1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcInfo{pidName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", pid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cpuTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
