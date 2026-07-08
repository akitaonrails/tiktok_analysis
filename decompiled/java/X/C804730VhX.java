package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.0VhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804730VhX {
    public String LIZ;
    public String LIZIZ;
    public HashSet<String> LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public float LJI = -1.0f;
    public int LJII = 2;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcInfo{pidName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", pid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cpuTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
