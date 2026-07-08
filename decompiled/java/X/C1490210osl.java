package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0osl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490210osl {
    public boolean LIZ;
    public Map<String, Integer> LIZJ;
    public String LJIIJJI;
    public boolean LIZIZ = true;
    public int LIZLLL = 10;
    public int LJ = 3;
    public int LJFF = 3;
    public int LJI = 10;
    public int LJII = 3;
    public int LJIIIIZZ = 3;
    public int LJIIIZ = 900;
    public int LJIIJ = 120;

    public final String toString() {
        StringBuilder sb = new StringBuilder(" localEnable: ");
        sb.append(this.LIZ);
        sb.append(" probeEnable: ");
        sb.append(this.LIZIZ);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.LIZJ;
        sb.append(map != null ? ((HashMap) map).size() : 0);
        sb.append(" reqTo: ");
        sb.append(this.LIZLLL);
        sb.append("#");
        sb.append(this.LJ);
        sb.append("#");
        sb.append(this.LJFF);
        sb.append(" reqErr: ");
        sb.append(this.LJI);
        sb.append("#");
        sb.append(this.LJII);
        sb.append("#");
        sb.append(this.LJIIIIZZ);
        sb.append(" updateInterval: ");
        sb.append(this.LJIIIZ);
        sb.append(" updateRandom: ");
        sb.append(this.LJIIJ);
        sb.append(" httpBlack: ");
        sb.append(this.LJIIJJI);
        return sb.toString();
    }
}
