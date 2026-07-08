package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0OhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626310OhR {
    public static final C626310OhR LIZ = new C626310OhR();
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;

    public static void LIZJ(int i, String str) {
        if (LIZJ == 0) {
            return;
        }
        new C626300OhQ(0, i, SystemClock.elapsedRealtime() - LIZJ, str).LIZ();
    }

    public static void LIZIZ(int i, int i2, String str) {
        if (LIZJ == 0) {
            return;
        }
        new C626290OhP(i2, "success", str, 0, SystemClock.elapsedRealtime() - LIZJ, 0, i).LIZ();
    }

    public static void LIZLLL(int i, String str, boolean z) {
        if (LIZIZ == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = LIZIZ;
        long j2 = jElapsedRealtime - j;
        long j3 = j - C1150504el.LIZ().LJJIII;
        long j4 = LIZJ;
        long j5 = LIZIZ;
        long j6 = LIZLLL - j5;
        Long lValueOf = Long.valueOf(j4 - j5);
        Long lValueOf2 = Long.valueOf(j6);
        Long lValueOf3 = Long.valueOf(j3);
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", String.valueOf(j2));
            linkedHashMap.put("fetch_retry_count", String.valueOf(0));
            if (lValueOf != null) {
                linkedHashMap.put("duration_start_to_fetch_data", String.valueOf(lValueOf.longValue()));
            }
            if (lValueOf2 != null) {
                linkedHashMap.put("duration_start_to_get_response", String.valueOf(lValueOf2.longValue()));
            }
            if (numValueOf != null) {
                linkedHashMap.put("result_page_type", String.valueOf(numValueOf.intValue()));
            }
            linkedHashMap.put("enter_from", str);
            C20684815ws.LJIILLIIL("text_post_archive_landing", linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("duration", String.valueOf(j2));
        linkedHashMap2.put("fetch_retry_count", String.valueOf(0));
        if (lValueOf != null) {
            linkedHashMap2.put("duration_start_to_fetch_data", String.valueOf(lValueOf.longValue()));
        }
        if (lValueOf2 != null) {
            linkedHashMap2.put("duration_start_to_get_response", String.valueOf(lValueOf2.longValue()));
        }
        if (lValueOf3 != null) {
            linkedHashMap2.put("duration_open_app_to_start", String.valueOf(lValueOf3.longValue()));
        }
        if (numValueOf != null) {
            linkedHashMap2.put("result_page_type", String.valueOf(numValueOf.intValue()));
        }
        linkedHashMap2.put("enter_from", str);
        C20684815ws.LJIILLIIL("text_post_detail_landing", linkedHashMap2);
    }

    public static void LIZ(int i, int i2, int i3, String str) {
        if (LIZJ == 0) {
            return;
        }
        new C626290OhP(i, "fail", str, i2, SystemClock.elapsedRealtime() - LIZJ, i3, 0).LIZ();
    }
}
