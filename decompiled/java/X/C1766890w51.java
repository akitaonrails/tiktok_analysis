package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766890w51 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;

    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJIIJ(new Pair("btm", this.LIZIZ), new Pair("btm_pre", this.LIZJ), new Pair("btm_ppre", this.LIZLLL), new Pair("jump", Boolean.valueOf(this.LIZ)), new Pair("params", this.LJ));
    }

    public C1766890w51(C2211641BhC c2211641BhC, String str, String str2, Map map, int i) {
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        map = (i & 8) != 0 ? null : map;
        this.LIZ = false;
        String strLIZIZ = c2211641BhC.LIZIZ();
        StringBuilder sb = new StringBuilder();
        C2211621BhA.LIZ.getClass();
        sb.append(C2211621BhA.LIZIZ);
        sb.append('.');
        sb.append(strLIZIZ);
        sb.append('.');
        sb.append(str.length() == 0 ? "c0" : str);
        sb.append('.');
        sb.append(str2.length() == 0 ? "d0" : str2);
        this.LIZIZ = sb.toString();
        this.LIZJ = c2211641BhC.LJ;
        this.LIZLLL = c2211641BhC.LJFF;
        this.LJ = map;
    }
}
