package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WKN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WKN {
    public final int LIZ;
    public int LJ;
    public int LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIL;
    public final Map<String, String> LIZIZ = new HashMap();
    public final Map<String, String> LIZJ = new HashMap();
    public final List<String> LIZLLL = new ArrayList();
    public final List<Integer> LJIIJJI = new ArrayList();
    public C0WKO LJIILIIL = C0WKO.TUDP;

    public final C821320WJu LIZ() {
        return new C821320WJu(this.LJFF, this.LJ, this.LJI, this.LJII, this.LIZ, this.LJIIIIZZ, this.LJIIIZ, this.LIZLLL, this.LIZIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this);
    }

    public C0WKN(int i) {
        this.LIZ = i;
    }

    public final void LIZJ(String str) {
        try {
            if (str.startsWith("wss:")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https:");
                sbLIZ.append(str.substring(4));
                str = C2188811AlT.LIZIZ(sbLIZ);
            } else if (str.startsWith("ws:")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("http:");
                sbLIZ2.append(str.substring(3));
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            new URI(str);
            this.LJIIL = str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIL = null;
        }
    }

    public final void LIZIZ(String str, String str2) {
        if (!C2093608Ic.LJ(str)) {
            ((HashMap) this.LIZJ).put(str, str2);
        }
    }
}
