package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229320i5y {
    public static C1229330i5z LIZ = new C1229330i5z(null, null, null, 511);

    public static void LIZ(EnumC995320c0Y enumC995320c0Y) {
        if (!LIZ.LJIIIIZZ.containsKey(enumC995320c0Y)) {
            LIZ.LJIIIIZZ.put(enumC995320c0Y, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void LIZIZ(EnumC1227850i3b enumC1227850i3b) {
        if (!LIZ.LJII.containsKey(enumC1227850i3b)) {
            LIZ.LJII.put(enumC1227850i3b, Long.valueOf(System.currentTimeMillis()));
            EnumC1227850i3b enumC1227850i3b2 = EnumC1227850i3b.FINISH_RENDER_DATA;
            if (enumC1227850i3b == enumC1227850i3b2) {
                long jLIZIZ = C1527905yX.LIZIZ(LIZ.LJII.get(EnumC1227850i3b.FINISH_CREATE_PANEL));
                Map<EnumC1227850i3b, Long> map = LIZ.LJII;
                EnumC1227850i3b enumC1227850i3b3 = EnumC1227850i3b.READY_TO_CREATE_PANEL;
                long jLIZIZ2 = jLIZIZ - C1527905yX.LIZIZ(map.get(enumC1227850i3b3));
                long jLIZIZ3 = C1527905yX.LIZIZ(LIZ.LJII.get(EnumC1227850i3b.FINISH_LOAD_DATA)) - C1527905yX.LIZIZ(LIZ.LJII.get(EnumC1227850i3b.READY_TO_LOAD_DATA));
                long jLIZIZ4 = C1527905yX.LIZIZ(LIZ.LJII.get(enumC1227850i3b2)) - C1527905yX.LIZIZ(LIZ.LJII.get(EnumC1227850i3b.READY_TO_RENDER_DATA));
                long jLIZIZ5 = C1527905yX.LIZIZ(LIZ.LJII.get(enumC1227850i3b2)) - C1527905yX.LIZIZ(LIZ.LJII.get(enumC1227850i3b3));
                C1229330i5z c1229330i5z = LIZ;
                long j = c1229330i5z.LJI;
                long j2 = 0;
                if (j > 0) {
                    long j3 = c1229330i5z.LJFF;
                    if (j3 > 0) {
                        j2 = j - j3;
                    }
                }
                LIZJ("group_chat_invitation_panel_show", C2097608Jq.LJIIJ(new Pair("panel_create_duration", String.valueOf(jLIZIZ2)), new Pair("panel_data_load_duration", String.valueOf(jLIZIZ3)), new Pair("panel_render_duration", String.valueOf(jLIZIZ4)), new Pair("panel_first_frame_total_duration", String.valueOf(jLIZIZ5)), new Pair("prefetch_duration", String.valueOf(j2))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C1229340i60 r8) {
        /*
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            int r0 = r8.LIZ
            if (r0 == 0) goto L61
            java.lang.String r1 = "error_code"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r1, r0)
        L12:
            X.0ZBV r0 = r8.LIZJ
            int r0 = r0.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "result_status"
            r4.put(r0, r1)
            X.0i5z r1 = X.C1229320i5y.LIZ
            long r2 = r1.LJI
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L41
            long r5 = r1.LJFF
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L41
            long r2 = r2 - r5
        L32:
            java.lang.String r1 = "network_duration"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r4.put(r1, r0)
            java.lang.String r0 = "group_chat_invitation_result"
            LIZJ(r0, r4)
            return
        L41:
            java.util.Map<X.0i3b, java.lang.Long> r1 = r1.LJII
            X.0i3b r0 = X.EnumC1227850i3b.FINISH_LOAD_DATA
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = X.C1527905yX.LIZIZ(r0)
            X.0i5z r0 = X.C1229320i5y.LIZ
            java.util.Map<X.0i3b, java.lang.Long> r1 = r0.LJII
            X.0i3b r0 = X.EnumC1227850i3b.READY_TO_LOAD_DATA
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = X.C1527905yX.LIZIZ(r0)
            long r2 = r2 - r0
            goto L32
        L61:
            int r0 = r8.LIZIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "invitee_group_status"
            r4.put(r0, r1)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229320i5y.LIZLLL(X.0i60):void");
    }

    public static void LJFF(C1229340i60 c1229340i60) {
        Long l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = c1229340i60.LIZ;
        if (i != 0) {
            linkedHashMap.put("error_code", String.valueOf(i));
        } else {
            linkedHashMap.put("invitee_group_status", String.valueOf(c1229340i60.LIZIZ));
        }
        linkedHashMap.put("network_duration", String.valueOf(C1527905yX.LIZIZ(LIZ.LJIIIIZZ.get(EnumC995320c0Y.FINISH_ACCEPT)) - C1527905yX.LIZIZ(LIZ.LJIIIIZZ.get(EnumC995320c0Y.READY_TO_ACCEPT))));
        linkedHashMap.put("result_status", String.valueOf(c1229340i60.LIZJ.getValue()));
        if (c1229340i60.LIZJ == C0ZBV.SUCCESS && (l = LIZ.LJII.get(EnumC1227850i3b.READY_TO_CREATE_PANEL)) != null) {
            linkedHashMap.put("stay_duration", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        LIZJ("group_chat_join_result", linkedHashMap);
    }

    public static void LIZJ(String str, Map map) {
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("from_source", LIZ.LIZ);
        linkedHashMap.put("enter_from", LIZ.LIZIZ);
        linkedHashMap.put("enter_method", LIZ.LIZJ);
        if (LIZ.LIZLLL.length() > 0) {
            linkedHashMap.put("chat_type", LIZ.LIZLLL);
        }
        if (LIZ.LJ.length() > 0) {
            linkedHashMap.put("group_type", LIZ.LJ);
        }
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    public static void LJ(String str, String str2, String str3) {
        LIZ = new C1229330i5z(str, str2, str3, 504);
        LIZJ("group_chat_invitation_start", C2097608Jq.LJ());
    }
}
