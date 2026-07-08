package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.03Pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C839803Pw extends AbstractC839903Px {
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;

    @Override // X.AbstractC839903Px, X.C041O
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.putAll(super.LIZ());
        map.put("duration", Long.valueOf(this.LIZJ));
        map.put("api_duration", Long.valueOf(this.LIZLLL));
        map.put("retry_count", Integer.valueOf(this.LJ));
        return map;
    }

    public C839803Pw(long j, long j2, int i) {
        super("rd_tiktokec_anchor_order_submit_duration");
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i;
    }
}
