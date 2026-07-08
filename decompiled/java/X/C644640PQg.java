package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644640PQg {
    public static final C644640PQg LIZ = new C644640PQg();
    public static final Map<String, C0N98> LIZIZ = Collections.synchronizedMap(new LinkedHashMap(256, 0.75f, true));
    public static final Map<String, Boolean> LIZJ = Collections.synchronizedMap(new LinkedHashMap(256, 0.75f, false));

    public static boolean LIZIZ(String str) {
        Map<String, Boolean> map = LIZJ;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    return false;
                }
                map.put(str, Boolean.TRUE);
                if (map.size() > 256) {
                    map.remove(map.keySet().iterator().next());
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZJ(String str, String str2) {
        if (str != null && str.length() != 0 && ((Number) C18154079c.LIZ.getValue()).intValue() == 1) {
            try {
                Map<String, C0N98> map = LIZIZ;
                synchronized (map) {
                    try {
                        map.put(str, new C0N98(str2, SystemClock.elapsedRealtime()));
                        if (map.size() > 256) {
                            map.remove(map.keySet().iterator().next());
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th) {
            }
        }
    }

    public static final void LIZ(final String str, final int i, final boolean z, final String str2, final int i2, final String str3) {
        if (str != null && str.length() != 0 && ((Number) C18154079c.LIZ.getValue()).intValue() == 1) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0PQh
                public final /* synthetic */ String LLILZ = "search_photo_card";

                /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: Exception -> 0x0107, TryCatch #3 {Exception -> 0x0107, blocks: (B:2:0x0000, B:4:0x001c, B:5:0x0024, B:10:0x0039, B:11:0x0048, B:24:0x006d, B:26:0x0076, B:28:0x0087, B:30:0x008d, B:32:0x009b, B:53:0x00df, B:55:0x00f6, B:58:0x00fb, B:48:0x00cd, B:22:0x0068, B:14:0x0057, B:8:0x0033, B:6:0x002d, B:12:0x0051, B:15:0x005b), top: B:69:0x0000, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00cd A[Catch: Exception -> 0x0107, TryCatch #3 {Exception -> 0x0107, blocks: (B:2:0x0000, B:4:0x001c, B:5:0x0024, B:10:0x0039, B:11:0x0048, B:24:0x006d, B:26:0x0076, B:28:0x0087, B:30:0x008d, B:32:0x009b, B:53:0x00df, B:55:0x00f6, B:58:0x00fb, B:48:0x00cd, B:22:0x0068, B:14:0x0057, B:8:0x0033, B:6:0x002d, B:12:0x0051, B:15:0x005b), top: B:69:0x0000, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 268
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC644650PQh.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchPhotoPrefetchHitTracker@a510.checkCoverHit$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchPhotoPrefetchHitTracker@a510.checkCoverHit$1");
                }
            });
        }
    }

    public static void LIZLLL(boolean z, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, long j, long j2, boolean z2, boolean z3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_hit", z ? 1 : 0);
        jSONObject.put("stage", str);
        jSONObject.put("miss_reason", str2);
        jSONObject.put("caller_id", str3);
        jSONObject.put("aweme_id", str4);
        jSONObject.put("search_id", str5);
        jSONObject.put("image_index", i);
        jSONObject.put("content_type", str6);
        jSONObject.put("surface", "search_photo_card");
        jSONObject.put("prefetch_lead_ms", j);
        jSONObject.put("saved_ms", j2);
        jSONObject.put("prefetch_group", C2190321Anu.LIZ());
        jSONObject.put("rank", i2);
        jSONObject.put("is_first_screen", z2 ? 1 : 0);
        jSONObject.put("is_first_display", z3 ? 1 : 0);
        AppLogNewUtils.onEventV3("search_photo_prefetch_hit", jSONObject);
    }
}
