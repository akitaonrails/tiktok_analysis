package X;

import Y.AfS176S0100000_7;
import Y.AfS3S0100100_7;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0J7L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7L implements Runnable {
    public boolean LL;
    public final Long LLILLJJLI;
    public final Long LLILLL;
    public Set<Long> LLILZ;
    public final List<C09JN<Map<Long, Long>>> LLILZIL;
    public final String LLILZLL;
    public final /* synthetic */ C0J7Y LLIZ;

    public final void LIZ() {
        Long l;
        this.LL = true;
        Long l2 = this.LLILLJJLI;
        if (l2 != null && (l = this.LLILLL) != null) {
            this.LLIZ.LJI.put(l2, l);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLILLJJLI.longValue() != 0) {
            Long l3 = (Long) ((HashMap) this.LLIZ.LJ).get(Long.valueOf(this.LLILLJJLI.longValue()));
            if (jCurrentTimeMillis - Long.valueOf(l3 != null ? l3.longValue() : 0L).longValue() < C0J7Y.LJIILIIL()) {
                LIZIZ();
                return;
            }
        }
        this.LLILZ = new HashSet(this.LLIZ.LJI.snapshot().keySet());
        StringBuilder sb = new StringBuilder();
        ((HashSet) this.LLILZ).add(this.LLILLJJLI);
        if (!C086I.LIZIZ(this.LLILZ)) {
            Iterator it2 = ((HashSet) this.LLILZ).iterator();
            while (it2.hasNext()) {
                sb.append(String.valueOf(it2.next()));
                sb.append(",");
            }
        }
        String string = sb.toString();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length() - 1);
        }
        this.LLIZ.LJIIJJI.liveStates(string, this.LLILZLL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S0100100_7(jCurrentTimeMillis, this, 0), new AfS176S0100000_7(this, 7));
    }

    public final void LIZIZ() {
        this.LL = false;
        Map<Long, Long> map = this.LLIZ.LIZ;
        if (!C086I.LIZIZ(this.LLILZIL)) {
            Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
            while (it2.hasNext()) {
                try {
                    ((C09JN) it2.next()).accept(map);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onResult:");
                    sbLIZ.append(Log.getStackTraceString(e));
                    C2344809Gs.LJFF("LiveStateManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        this.LLIZ.LJIJI();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveStateManager$RefreshRequest@a83.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStateManager$RefreshRequest@a83.run");
    }

    public C0J7L(C0J7Y c0j7y, Long l, Long l2, C09JN<Map<Long, Long>> c09jn, String str) {
        this.LLIZ = c0j7y;
        ArrayList arrayList = new ArrayList(3);
        this.LLILZIL = arrayList;
        this.LLILLJJLI = l;
        this.LLILLL = l2;
        this.LLILZLL = str;
        arrayList.add(c09jn);
    }
}
