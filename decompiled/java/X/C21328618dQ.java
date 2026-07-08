package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21328618dQ extends C21328218dM {
    public long LJJIIJ = -1;
    public long LJJIIJZLJL = -1;
    public long LJJIIZ = -1;
    public long LJJIIZI = -1;

    @Override // X.C21328218dM, X.AbstractC1163040gN4
    public final String LIZ() {
        return "myna_draw_end";
    }

    @Override // X.C21328218dM
    public final Map<String, Object> LIZLLL() {
        if (!this.LJJIFFI) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(super.LIZLLL());
        linkedHashMap.put("t_real_bind_data_end", Long.valueOf(this.LIZJ));
        linkedHashMap.put("draw_duration", Long.valueOf(this.LJJIIJ));
        linkedHashMap.put("t_draw_end", Long.valueOf(this.LJJIIZ));
        if (this.LIZLLL) {
            linkedHashMap.put("fmp_duration", Long.valueOf(this.LJJIIZI));
        }
        Long l = this.LIZ;
        if (l != null) {
            long j = this.LIZJ;
            if (j > 0 && j >= l.longValue()) {
                linkedHashMap.put("bind_data_duration", Long.valueOf(this.LIZJ - l.longValue()));
            }
        }
        return linkedHashMap;
    }

    @Override // X.C21328218dM, X.AbstractC1163040gN4
    public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        HashMap map2 = new HashMap();
        map2.putAll(super.LIZIZ(map));
        map2.putAll(LIZLLL());
        return map2;
    }
}
