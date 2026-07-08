package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0f4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113170f4d extends AbstractC1113090f4V {
    public C1113170f4d(double d) {
        super(d);
    }

    @Override // X.InterfaceC1113260f4m
    public final void LIZIZ(Map<String, String> map) {
        map.put("history_refresh_pull_duration", String.valueOf(this.LIZLLL.LIZ));
        map.put("history_refresh_pull_duration_max", String.valueOf(this.LIZLLL.LIZIZ));
        int i = this.LIZLLL.LIZJ;
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        map.put("history_refresh_pull_duration_min", String.valueOf(i));
    }
}
