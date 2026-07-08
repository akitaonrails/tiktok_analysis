package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18dR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21328718dR extends AbstractC1163040gN4 {
    public final boolean LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;

    @Override // X.AbstractC1163040gN4
    public final String LIZ() {
        return "myna_layout";
    }

    public C21328718dR(boolean z) {
        this.LIZ = z;
    }

    @Override // X.AbstractC1163040gN4
    public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        HashMap map2 = new HashMap();
        map2.put("success", 1);
        map2.put("is_layout", Integer.valueOf(this.LIZLLL ? 1 : 0));
        Long lValueOf = Long.valueOf(this.LIZIZ);
        Long lValueOf2 = Long.valueOf(this.LIZJ);
        map2.put("t_calculate_size_start", lValueOf);
        map2.put("t_calculate_size_end", lValueOf2);
        if (lValueOf2.longValue() >= lValueOf.longValue()) {
            map2.put("calculate_size_duration", Long.valueOf(lValueOf2.longValue() - lValueOf.longValue()));
        }
        map2.put("twice_layout_opt", Integer.valueOf(this.LJ ? 1 : 0));
        map2.put("twice_measure_opt", Integer.valueOf(this.LJFF ? 1 : 0));
        map2.put("is_first_bind", Integer.valueOf(this.LIZ ? 1 : 0));
        map2.put("measure_count", Integer.valueOf(this.LJI));
        map2.put("measure_opt_count", Integer.valueOf(this.LJII));
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }
}
