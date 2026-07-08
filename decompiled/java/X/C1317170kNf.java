package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317170kNf {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;

    public final Map<String, Long> LIZ() {
        HashMap map = new HashMap();
        map.put("open_time", Long.valueOf(this.LIZ));
        map.put("container_init_start", Long.valueOf(this.LIZIZ));
        map.put("container_init_end", Long.valueOf(this.LIZJ));
        map.put("prepare_template_start", Long.valueOf(this.LIZLLL));
        map.put("prepare_template_end", Long.valueOf(this.LJ));
        return map;
    }
}
