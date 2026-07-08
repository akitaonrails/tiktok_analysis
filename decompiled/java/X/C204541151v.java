package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.151v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204541151v {
    public final C204542151w LIZ;
    public final Map<Integer, Pair<C204543151x, Long>> LIZIZ = new LinkedHashMap();
    public final Map<Integer, Pair<C204543151x, Long>> LIZJ = new LinkedHashMap();
    public final C11NJ LIZLLL = new C11NJ();
    public C11JF LJ;

    public C204541151v(C204542151w c204542151w) {
        this.LIZ = c204542151w;
    }

    public final void LIZ(C204543151x c204543151x) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_moment_increment");
        c474500IjALIZ.LJJII("increment", "detail");
        this.LIZ.LJIIL(c204543151x, c474500IjALIZ);
    }

    public final void LIZIZ(String str, C204543151x c204543151x, C204543151x c204543151x2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_moment_increment");
        c474500IjALIZ.LJJII(str, "detail");
        c474500IjALIZ.LJJII(Integer.valueOf(c204543151x2.LIZIZ()), "covered_by_message_type");
        c474500IjALIZ.LJJII(c204543151x2.LJ(), "covered_by_end");
        c474500IjALIZ.LJJII(c204543151x2.LJFF(), "covered_by_method");
        this.LIZ.LJIIL(c204543151x, c474500IjALIZ);
    }
}
