package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0TI3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TI3 {
    public final C00BR LIZ;
    public final ConcurrentHashMap<String, Long> LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public final HashMap<String, String> LJ;

    public /* synthetic */ C0TI3() {
        this(C00BR.ONE_BY_ONE);
    }

    public final void LIZ() {
        this.LIZIZ.clear();
        this.LIZJ = -1L;
        this.LIZLLL = "";
    }

    public C0TI3(C00BR c00br) {
        this.LIZ = c00br;
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = -1L;
        this.LIZLLL = "";
        this.LJ = new HashMap<>();
    }

    public final void LIZIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LIZ == C00BR.ONE_BY_ONE) {
            long j = this.LIZJ;
            if (j != -1) {
                this.LIZIZ.put(this.LIZLLL, Long.valueOf(jCurrentTimeMillis - j));
            }
            this.LIZLLL = str;
            this.LIZJ = jCurrentTimeMillis;
            return;
        }
        this.LIZLLL = str;
        long j2 = this.LIZJ;
        if (j2 == -1) {
            this.LIZJ = jCurrentTimeMillis;
            this.LIZIZ.put(this.LIZLLL, Long.valueOf(jCurrentTimeMillis));
            return;
        }
        this.LIZIZ.put(str, Long.valueOf(jCurrentTimeMillis - j2));
    }

    public final void LIZJ(C474500IjA c474500IjA) {
        for (Map.Entry<String, Long> entry : this.LIZIZ.entrySet()) {
            c474500IjA.LJJII(Long.valueOf(entry.getValue().longValue()), entry.getKey());
        }
        for (Map.Entry<String, String> entry2 : this.LJ.entrySet()) {
            c474500IjA.LJJII(entry2.getValue(), entry2.getKey());
        }
    }
}
