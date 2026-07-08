package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0OhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626300OhQ {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final void LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(this.LIZ));
        linkedHashMap.put("is_success", String.valueOf(this.LIZIZ));
        linkedHashMap.put("status_code", String.valueOf(this.LIZJ));
        linkedHashMap.put("status_msg", this.LIZLLL);
        C626310OhR c626310OhR = C626310OhR.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c626310OhR.getClass();
        C626310OhR.LIZLLL = jElapsedRealtime;
        C20684815ws.LJIILLIIL("friends3_text_post_detail_page_data_request", linkedHashMap);
    }

    public C626300OhQ(int i, int i2, long j, String str) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
    }
}
