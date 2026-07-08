package X;

import Y.ARunnableS82S0200000_13;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793370VAh {
    public volatile boolean LIZ;
    public String LIZJ;
    public C793400VAk LIZLLL;
    public String LIZIZ = "";
    public final LinkedList<C793390VAj> LJ = new LinkedList<>();

    public final C793400VAk LIZIZ() {
        if (this.LIZLLL == null) {
            if (C793400VAk.LJ == null) {
                synchronized (C793400VAk.class) {
                    try {
                        if (C793400VAk.LJ == null) {
                            C793400VAk.LJ = new C793400VAk();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            this.LIZLLL = C793400VAk.LJ;
        }
        return this.LIZLLL;
    }

    public final void LIZJ(C793390VAj c793390VAj) {
        if (c793390VAj == null) {
            return;
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record batteryLog: ");
            sbLIZ.append(c793390VAj.toString());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C787900UvU.LIZ.LIZJ(new ARunnableS82S0200000_13(this, c793390VAj, 47));
    }

    public static boolean LIZLLL(C793380VAi c793380VAi, List list) {
        Map<String, C0VAV> map = C0V5J.LIZ.LLIZLLLIL;
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        String str = null;
        while (it2.hasNext()) {
            C793390VAj c793390VAj = (C793390VAj) it2.next();
            if (str == null || !str.equals(c793390VAj.LJIIJJI)) {
                str = c793390VAj.LJIIJJI;
                sb.append(str);
            }
            if ("ground_record".equals(c793390VAj.LIZLLL)) {
                if (c793390VAj.LIZIZ) {
                    c793380VAi.LIZ += c793390VAj.LJI;
                } else {
                    c793380VAi.LIZIZ += c793390VAj.LJI;
                }
            } else {
                C0VAV c0vav = (C0VAV) ((ConcurrentHashMap) map).get(c793390VAj.LIZLLL);
                if (c0vav != null) {
                    c0vav.LJFF(c793380VAi, c793390VAj);
                }
            }
        }
        C793390VAj c793390VAj2 = (C793390VAj) ListProtector.get(list, 0);
        boolean z = c793390VAj2.LJIIJ;
        c793380VAi.LJIIL = z;
        if (!z || (c793380VAi.LIZ > 60000 && c793380VAi.LIZIZ > Mp4ScreenVideoLoadTimeout.CONTROL)) {
            c793380VAi.LJIILIIL = c793390VAj2.LJIIIZ;
            c793380VAi.LJIILJJIL = sb.toString();
            return c793380VAi.LIZIZ(true);
        }
        c793380VAi.LIZ();
        C792400V6o.LJIIIIZZ();
        return false;
    }

    public final List LIZ(long j, boolean z) {
        List listLIZJ;
        try {
            C793400VAk c793400VAkLIZIZ = LIZIZ();
            synchronized (c793400VAkLIZIZ) {
                if (z) {
                    listLIZJ = c793400VAkLIZIZ.LIZJ("main_process = 1 AND delete_flag = 0", null, c793400VAkLIZIZ);
                } else {
                    listLIZJ = c793400VAkLIZIZ.LIZJ("main_process = 0 AND delete_flag = 0 AND timestamp <= ? ", new String[]{String.valueOf(j)}, c793400VAkLIZIZ);
                }
            }
            return listLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Collections.emptyList();
        }
    }
}
