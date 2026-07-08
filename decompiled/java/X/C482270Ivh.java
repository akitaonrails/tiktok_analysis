package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Ivh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482270Ivh {
    public boolean LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public boolean LJFF;

    public final void LIZ() {
        if (this.LIZ || this.LIZIZ <= 0) {
            return;
        }
        HashMap map = new HashMap();
        long j = this.LIZIZ;
        if (j > 0) {
            map.put("enter_timestamp", String.valueOf(j));
        }
        long j2 = this.LIZIZ;
        if (j2 > 0) {
            long j3 = this.LIZJ;
            if (j3 > 0) {
                long j4 = j3 - j2;
                Long lValueOf = Long.valueOf(j4);
                if (lValueOf.longValue() >= 0) {
                    lValueOf.longValue();
                    map.put("request_start_timestamp", String.valueOf(this.LIZJ));
                    map.put("enter2request_duration", String.valueOf(j4));
                }
            }
        }
        if (this.LIZIZ > 0) {
            long j5 = this.LIZJ;
            if (j5 > 0) {
                long j6 = this.LIZLLL;
                if (j6 > 0) {
                    long j7 = j6 - j5;
                    Long lValueOf2 = Long.valueOf(j7);
                    if (lValueOf2.longValue() >= 0) {
                        lValueOf2.longValue();
                        map.put("respond_timestamp", String.valueOf(this.LIZLLL));
                        map.put("request2respond_duration", String.valueOf(j7));
                        map.put("is_preload", this.LJFF ? "1" : CardStruct.IStatusCode.DEFAULT);
                    }
                }
            }
        }
        if (this.LIZIZ > 0 && this.LIZJ > 0) {
            long j8 = this.LIZLLL;
            if (j8 > 0) {
                long j9 = this.LJ;
                if (j9 > 0) {
                    long j10 = j9 - j8;
                    Long lValueOf3 = Long.valueOf(j10);
                    if (lValueOf3.longValue() >= 0) {
                        lValueOf3.longValue();
                        map.put("draw_over_timestamp", String.valueOf(this.LJ));
                        map.put("draw_duration", String.valueOf(j10));
                        map.put("enter2draw_duration", String.valueOf(this.LJ - this.LIZIZ));
                    }
                }
            }
        }
        if (this.LIZIZ <= 0 || this.LIZJ <= 0 || this.LIZLLL <= 0 || this.LJ <= 0) {
            map.put("is_left_page", "1");
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
            Long lValueOf4 = Long.valueOf(jCurrentTimeMillis);
            if (lValueOf4.longValue() >= 0) {
                lValueOf4.longValue();
                map.put("enter2leave_duration", String.valueOf(jCurrentTimeMillis));
            }
        }
        map.put("enter_from_merge", "live_merge");
        map.put("enter_method", "toplive_square");
        C20684815ws.LJIILLIIL("livesdk_entrance_impr_duration", map);
        this.LIZ = true;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = false;
    }
}
