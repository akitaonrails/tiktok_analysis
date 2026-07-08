package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0C5S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5S {
    public volatile Map<String, Integer> LIZ = new LinkedHashMap();
    public volatile Map<String, Long> LIZIZ = new LinkedHashMap();
    public volatile Map<String, Boolean> LIZJ = new LinkedHashMap();
    public volatile Map<String, Float> LIZLLL = new LinkedHashMap();
    public volatile Map<String, Double> LJ = new LinkedHashMap();
    public volatile Map<String, String> LJFF = new LinkedHashMap();

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZLLL.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LJ.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LJFF.size());
        sbLIZ.append(' ');
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
