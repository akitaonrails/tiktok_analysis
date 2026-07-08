package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C291601Ba {
    public final int LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ = new ArrayList();
    public final List<Long> LIZLLL = new ArrayList();
    public final Map<Long, Long> LJ = new LinkedHashMap();

    public final void LIZIZ() {
        while ((!this.LIZJ.isEmpty()) && ((ArrayList) this.LIZJ).size() > this.LIZ) {
            long jLongValue = ((Number) ListProtector.remove(this.LIZJ, 0)).longValue();
            ListProtector.remove(this.LIZLLL, 0);
            this.LJ.remove(Long.valueOf(jLongValue));
        }
    }

    public final void LIZJ(long j) {
        LIZIZ();
        while ((!((ArrayList) this.LIZJ).isEmpty()) && j - ((Number) ListProtector.get(this.LIZJ, 0)).longValue() > this.LIZIZ) {
            long jLongValue = ((Number) ListProtector.remove(this.LIZJ, 0)).longValue();
            ListProtector.remove(this.LIZLLL, 0);
            this.LJ.remove(Long.valueOf(jLongValue));
        }
    }

    public C291601Ba(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }

    public final void LIZ(long j, long j2, boolean z) {
        ((ArrayList) this.LIZJ).add(Long.valueOf(j));
        ((ArrayList) this.LIZLLL).add(Long.valueOf(j2));
        this.LJ.put(Long.valueOf(j), Long.valueOf(j2));
        if (z) {
            LIZIZ();
        }
    }
}
