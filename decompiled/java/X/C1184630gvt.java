package X;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184630gvt {
    public static final C1184630gvt LIZ = new C1184630gvt();

    public static void LIZJ(Context context, String str, String str2, C1185600gxS c1185600gxS) {
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiId;
        C1185410gx9 c1185410gx9;
        C1185410gx9 c1185410gx92;
        C1185410gx9 c1185410gx93;
        C1185410gx9 c1185410gx94;
        String str3 = str;
        C1188670h2P c1188670h2P = C1188670h2P.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        Pair[] pairArr = new Pair[4];
        String initialPoiFromGroupId = null;
        if (c1185600gxS != null && (c1185410gx94 = c1185600gxS.LJFF) != null) {
            initialEnterFrom = c1185410gx94.getInitialEnterFrom();
        } else {
            initialEnterFrom = null;
        }
        pairArr[0] = new Pair("initial_poi_enter_from", initialEnterFrom);
        if (c1185600gxS != null && (c1185410gx93 = c1185600gxS.LJFF) != null) {
            initialEnterMethod = c1185410gx93.getInitialEnterMethod();
        } else {
            initialEnterMethod = null;
        }
        pairArr[1] = new Pair("initial_poi_enter_method", initialEnterMethod);
        if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null) {
            initialPoiId = c1185410gx92.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        pairArr[2] = new Pair("initial_poi_id", initialPoiId);
        if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
            initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
        }
        pairArr[3] = new Pair("initial_poi_from_group_id", initialPoiFromGroupId);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1188670h2P.getClass();
        C1188670h2P.LIZLLL(context, str3, "poi_detail", "pick_entrance", null, null, str2, mapLJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final android.content.Context r5, android.view.View r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            X.0q7g r4 = X.C1541950qED.LIZJ
            com.bytedance.hybrid.spark.SparkContext r2 = new com.bytedance.hybrid.spark.SparkContext
            r2.<init>()
            java.lang.String r0 = "poi_chart_list"
            java.lang.String r0 = com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings.LIZIZ(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = ""
        L11:
            r2.LJJLIIJ(r0)
            X.0gvu r0 = new X.0gvu
            r0.<init>()
            r2.LJJJLIIL(r0)
            java.lang.String r0 = "from_poi_id"
            X.C1548420qOe.LIZIZ(r2, r0, r7)
            java.lang.String r0 = "region_poi_id"
            X.C1548420qOe.LIZIZ(r2, r0, r8)
            java.lang.String r0 = "from_group_id"
            X.C1548420qOe.LIZIZ(r2, r0, r9)
            java.lang.String r1 = "chart_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            X.C1548420qOe.LIZIZ(r2, r1, r0)
            java.lang.String r0 = "page_collect_info"
            X.C1548420qOe.LIZIZ(r2, r0, r10)
            java.lang.String r0 = "chart_id"
            X.C1548420qOe.LIZIZ(r2, r0, r12)
            java.lang.String r0 = "poi_session_id"
            X.C1548420qOe.LIZIZ(r2, r0, r13)
            java.lang.String r0 = "source_btm_token"
            X.C1548420qOe.LIZIZ(r2, r0, r14)
            r1 = 0
            if (r6 == 0) goto L4c
            goto L4e
        L4c:
            r0 = r1
            goto L58
        L4e:
            X.0mCc r0 = X.C520040KaQ.LIZ(r6)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4c
            X.0Q7z r0 = X.C1185670gxZ.LIZ(r0)     // Catch: java.lang.Throwable -> L72
        L58:
            java.util.Map r3 = X.C1182380gsG.LJII(r0)     // Catch: java.lang.Throwable -> L72
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L72
            r0 = r0 ^ 1
            if (r0 == 0) goto L6e
            java.lang.String r1 = "poi_general_track_params"
            java.lang.String r0 = X.C2365509Or.LJ(r3)     // Catch: java.lang.Throwable -> L72
            X.C1548420qOe.LIZIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L72
            r1 = r2
        L6e:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L72
            goto L7e
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7e:
            r4.getClass()
            X.0qED r0 = new X.0qED
            r0.<init>(r5, r2)
            r0.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1184630gvt.LIZ(android.content.Context, android.view.View, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
