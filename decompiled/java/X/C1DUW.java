package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1DUW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DUW {
    public final String LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();

    public final void LIZIZ() {
        Long l = this.LIZIZ;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.LIZJ;
            if (l2 != null) {
                this.LIZLLL.put("total_time_cost", String.valueOf(l2.longValue() - jLongValue));
            }
        }
        C0I0B.LJFF.LIZIZ().sendEvent("dm_media_send_pre_state", this.LIZLLL);
        C1DUV.LIZ.remove(this.LIZ);
    }

    public C1DUW(String str) {
        this.LIZ = str;
    }

    public final C1DUW LIZ(String str) {
        this.LIZLLL.put("media_task_id", str);
        return this;
    }
}
