package X;

import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0b2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958110b2X extends C0K04 {
    public static final Map<String, Boolean> LIZ = new LinkedHashMap();
    public static final LruCache<Long, Integer> LIZIZ = new LruCache<>(3);
    public static String LIZJ = "";
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;

    public static void LJIIJ() {
        if (LIZLLL == C915980Zwa.LJI().LJIIJ().getChannelId()) {
            return;
        }
        LIZLLL = C915980Zwa.LJI().LJIIJ().getChannelId();
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        for (EnumC958120b2Y enumC958120b2Y : EnumC958120b2Y.values()) {
            boolean zLJFF = Intrinsics.LJFF(((LinkedHashMap) LIZ).get(enumC958120b2Y.getScene()), Boolean.TRUE);
            if (zLJFF) {
                i++;
            }
            C0K04.LJFF(enumC958120b2Y.getScene(), zLJFF ? "display_success" : "display_failed", jSONObject);
        }
        C0K04.LIZLLL(EnumC958120b2Y.values().length == i ? 1 : 0, "full_display", jSONObject);
        C0K04.LIZLLL(C915980Zwa.LJII().LLI().getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, jSONObject);
        LJIILIIL("component_identify_result", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL() {
        /*
            android.util.LruCache<java.lang.Long, java.lang.Integer> r4 = X.C958110b2X.LIZIZ
            long r0 = X.C958110b2X.LJFF
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 2
            if (r0 == 0) goto L18
            int r0 = r0.intValue()
            if (r0 != r2) goto L18
            return
        L18:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            long r0 = X.C958110b2X.LJFF
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r0)
            X.0b2Y[] r6 = X.EnumC958120b2Y.values()
            int r5 = r6.length
            r7 = 0
            r4 = 0
            r8 = 0
        L32:
            if (r4 >= r5) goto L5d
            r2 = r6[r4]
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = X.C958110b2X.LIZ
            java.lang.String r0 = r2.getScene()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4c
            int r8 = r8 + 1
        L4c:
            java.lang.String r1 = r2.getScene()
            if (r0 == 0) goto L5a
            java.lang.String r0 = "display_success"
        L54:
            X.C0K04.LJFF(r1, r0, r3)
            int r4 = r4 + 1
            goto L32
        L5a:
            java.lang.String r0 = "display_failed"
            goto L54
        L5d:
            long r5 = X.C958110b2X.LJ
            r9 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            java.lang.String r4 = "match_contribute_entrance_display_duration"
            if (r0 <= 0) goto Lb9
            long r1 = X.C958110b2X.LJI
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            long r5 = r5 - r1
            X.C0K04.LJ(r4, r5, r3)
        L71:
            r0 = 0
            X.C958110b2X.LJI = r0
            X.C958110b2X.LJ = r0
            X.0b2Y[] r0 = X.EnumC958120b2Y.values()
            int r1 = r0.length
            r0 = 1
            int r1 = r1 - r0
            if (r1 != r8) goto L81
            r7 = 1
        L81:
            java.lang.String r0 = "full_display"
            X.C0K04.LIZLLL(r7, r0, r3)
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0aym r0 = r0.LJIIJ()
            long r0 = r0.getChannelId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "channel_id"
            X.C0K04.LJFF(r0, r1, r3)
            java.lang.String r2 = "sei_channel_id"
            long r0 = X.C958110b2X.LJFF
            X.C0K04.LJ(r2, r0, r3)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            X.0ape r0 = r0.LLI()
            int r1 = r0.getValue()
            java.lang.String r0 = "status"
            X.C0K04.LIZLLL(r1, r0, r3)
            java.lang.String r0 = "component_identify_result"
            LJIILJJIL(r0, r3)
            return
        Lb9:
            r0 = 10
            X.C0K04.LJ(r4, r0, r3)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C958110b2X.LJIIL():void");
    }

    public static void LJIIJJI(long j) {
        LruCache<Long, Integer> lruCache = LIZIZ;
        Integer num = lruCache.get(Long.valueOf(j));
        if (num != null && num.intValue() != 0) {
            return;
        }
        lruCache.put(Long.valueOf(j), 1);
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("channel_id", j, jSONObject);
        LJI = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--------1111----loadSuccess = ");
        sbLIZ.append(LJI);
        C20441214yg.LIZIZ("loadTimeCohost", C2188811AlT.LIZIZ(sbLIZ));
        LJFF = j;
        LJIILJJIL("component_identify_beigin", jSONObject);
    }

    public static void LJIILL(EnumC958120b2Y enumC958120b2Y) {
        LIZ.put(enumC958120b2Y.getScene(), Boolean.TRUE);
    }

    public static void LJIILIIL(String str, JSONObject jSONObject) {
        C0K04.LJFF("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()), jSONObject);
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_sdk", C915980Zwa.LJII().LLFFF());
        C1CC2.LJI("ttlive_client_anchor_cohost_component_monitor", new JSONObject(), null, jSONObject);
        C962910bAH.LIZJ(str, jSONObject, null, null, true, 0, true);
    }

    public static void LJIILJJIL(String str, JSONObject jSONObject) {
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LJIIIZ(jSONObject, "is_sdk", C915980Zwa.LJII().LLFFF());
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_audience_cohost_component_monitor", 0.2d)) {
            C1CC2.LJI("ttlive_client_audience_cohost_component_monitor", new JSONObject(), null, jSONObject);
        }
        C962910bAH.LIZJ(str, jSONObject, null, null, true, 0, true);
    }
}
