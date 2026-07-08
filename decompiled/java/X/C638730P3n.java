package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0P3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638730P3n implements C0P3B {
    public final Map<String, C638770P3r> LIZIZ = new LinkedHashMap();
    public final Map<String, String> LIZJ = new LinkedHashMap();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LIZ(String str) {
        switch (str.hashCode()) {
            case -1865609903:
                if (str.equals("vibe_feed_net_request_end")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C638770P3r c638770P3r = (C638770P3r) ((LinkedHashMap) this.LIZIZ).get("net_feed_duration");
                    if (c638770P3r != null) {
                        c638770P3r.LIZIZ = jCurrentTimeMillis;
                    }
                    LIZIZ(jCurrentTimeMillis);
                }
                break;
            case -1836645544:
                if (str.equals("vibe_feed_net_request_start")) {
                    this.LIZIZ.put("net_feed_duration", new C638770P3r(System.currentTimeMillis(), 2));
                }
                break;
            case -1303696021:
                if (str.equals("vibe_feed_ui_create_end")) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C638770P3r c638770P3r2 = (C638770P3r) ((LinkedHashMap) this.LIZIZ).get("ui_duration");
                    if (c638770P3r2 != null) {
                        c638770P3r2.LIZIZ = jCurrentTimeMillis2;
                    }
                    this.LIZIZ.put("ff_duration", new C638770P3r(jCurrentTimeMillis2, 2));
                }
                break;
            case -694042040:
                if (str.equals("param_construct_start")) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    ((LinkedHashMap) this.LIZIZ).clear();
                    this.LIZIZ.put("prepare_duration", new C638770P3r(jCurrentTimeMillis3, 2));
                    this.LIZIZ.put("total_duration", new C638770P3r(jCurrentTimeMillis3, 2));
                }
                break;
            case 17807348:
                if (str.equals("vibe_feed_complete_load") && !this.LIZIZ.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                        C638770P3r c638770P3r3 = (C638770P3r) entry.getValue();
                        long j = c638770P3r3.LIZ;
                        if (j > 0) {
                            long j2 = c638770P3r3.LIZIZ;
                            if (j2 > 0 && j <= j2) {
                                linkedHashMap.put(entry.getKey(), String.valueOf(((C638770P3r) entry.getValue()).LIZIZ - ((C638770P3r) entry.getValue()).LIZ));
                            }
                        }
                    }
                    linkedHashMap.putAll(this.LIZJ);
                    if (!linkedHashMap.containsKey("use_cache")) {
                        linkedHashMap.put("use_cache", CardStruct.IStatusCode.DEFAULT);
                    }
                    if (!linkedHashMap.containsKey("is_anchor_summary")) {
                        linkedHashMap.put("is_anchor_summary", CardStruct.IStatusCode.DEFAULT);
                    }
                    ((LinkedHashMap) this.LIZIZ).clear();
                    ((LinkedHashMap) this.LIZJ).clear();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleVibeFeedCompleteLoad params: ");
                    sbLIZ.append(linkedHashMap);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C20684815ws.LJIILLIIL("ttsocial_vibe_feed_page_monitor_tech", linkedHashMap);
                    break;
                }
                break;
            case 595094071:
                if (str.equals("route_feed_start")) {
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    C638770P3r c638770P3r4 = (C638770P3r) ((LinkedHashMap) this.LIZIZ).get("prepare_duration");
                    if (c638770P3r4 != null) {
                        c638770P3r4.LIZIZ = jCurrentTimeMillis4;
                    }
                    this.LIZIZ.put("ui_duration", new C638770P3r(jCurrentTimeMillis4, 2));
                }
                break;
            case 1209784312:
                if (str.equals("vibe_feed_player_first_frame")) {
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    C638770P3r c638770P3r5 = (C638770P3r) ((LinkedHashMap) this.LIZIZ).get("ff_duration");
                    if (c638770P3r5 != null) {
                        c638770P3r5.LIZIZ = jCurrentTimeMillis5;
                    }
                    LIZIZ(jCurrentTimeMillis5);
                }
                break;
        }
    }

    public final void LIZIZ(long j) {
        long j2;
        C638770P3r c638770P3r;
        C638770P3r c638770P3r2 = (C638770P3r) ((LinkedHashMap) this.LIZIZ).get("total_duration");
        if (c638770P3r2 != null) {
            j2 = c638770P3r2.LIZIZ;
        } else {
            j2 = 0;
        }
        if (j2 < j && (c638770P3r = (C638770P3r) ((LinkedHashMap) this.LIZIZ).get("total_duration")) != null) {
            c638770P3r.LIZIZ = j;
        }
    }
}
