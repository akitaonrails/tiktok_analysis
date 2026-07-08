package X;

import Y.ARunnableS1S2100100_20;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317120kNa {
    public final Boolean LIZ = Boolean.TRUE;
    public final C1317170kNf LIZIZ = new C1317170kNf();
    public final Map<String, Long> LIZJ = new HashMap();
    public final Map<String, Map<String, Long>> LIZLLL = new HashMap();
    public final Map<String, Long> LJ = new HashMap();
    public final WeakReference<AbstractC1317090kNX> LJFF;

    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("url", TextUtils.isEmpty(null) ? "" : null);
        map.put("metrics", this.LJ);
        map.put("setup_timing", this.LIZJ);
        map.put("update_timings", this.LIZLLL);
        map.put("extra_timing", this.LIZIZ.LIZ());
        return map;
    }

    public final C1297860jsW LIZIZ() {
        C1297860jsW c1297860jsW = new C1297860jsW();
        c1297860jsW.put("url", TextUtils.isEmpty(null) ? "" : null);
        c1297860jsW.put("metrics", C1297860jsW.from(this.LJ));
        c1297860jsW.put("setup_timing", C1297860jsW.from(this.LIZJ));
        C1297860jsW c1297860jsW2 = new C1297860jsW();
        for (Map.Entry entry : ((HashMap) this.LIZLLL).entrySet()) {
            c1297860jsW2.putMap((String) entry.getKey(), C1297860jsW.from((Map) entry.getValue()));
        }
        c1297860jsW.put("update_timings", c1297860jsW2);
        c1297860jsW.put("extra_timing", C1297860jsW.from(this.LIZIZ.LIZ()));
        return c1297860jsW;
    }

    public C1317120kNa(AbstractC1317090kNX abstractC1317090kNX) {
        this.LJFF = new WeakReference<>(abstractC1317090kNX);
    }

    public final void LIZJ(long j, String str, String str2) {
        C1290750jh3.LJ(new ARunnableS1S2100100_20(this, str, j, str2, 0));
    }
}
