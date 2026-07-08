package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467860IWi {
    public static final boolean LIZ(Context context) {
        Integer numLIZ;
        boolean z = false;
        if (context != null && (numLIZ = C1308910kAL.LIZ(R.attr.g0d, context)) != null && numLIZ.intValue() == 0) {
            z = true;
        }
        return !(!z);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.android.livesdkapi.session.EnterRoomConfig r5, org.json.JSONObject r6) {
        /*
            if (r6 == 0) goto L99
            if (r5 == 0) goto L22
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r1 = r5.mRoomsData     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L10
            java.lang.String r0 = "first_show_rank_type"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Exception -> L95
            r1.firstShowRankType = r0     // Catch: java.lang.Exception -> L95
        L10:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r2 = r5.mRoomsData     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L22
            java.lang.String r0 = "is_enter_from_trendinglive"
            java.lang.String r1 = r6.optString(r0)     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = "1"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L95
            r2.fromSearchTrendingLive = r0     // Catch: java.lang.Exception -> L95
        L22:
            java.lang.String r0 = "search_mob_extra"
            org.json.JSONObject r3 = r6.optJSONObject(r0)     // Catch: java.lang.Exception -> L95
            if (r3 == 0) goto L5e
            java.lang.String r0 = "search_result_id"
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.Exception -> L95
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L95
            r2 = 0
            if (r0 == 0) goto L3e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
        L37:
            boolean r0 = X.C1533950q1J.LJ(r1)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L48
            goto L40
        L3e:
            r1 = r2
            goto L37
        L40:
            if (r5 == 0) goto L48
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r5.mLogData     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L48
            r0.search_result_id = r1     // Catch: java.lang.Exception -> L95
        L48:
            java.lang.String r0 = "search_token_type"
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.Exception -> L95
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L55
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L95
        L55:
            boolean r0 = X.C1533950q1J.LJ(r2)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L5e
            if (r5 == 0) goto L99
            goto L61
        L5e:
            if (r5 == 0) goto L99
            goto L67
        L61:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r5.mLogData     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L67
            r0.search_token_type = r2     // Catch: java.lang.Exception -> L95
        L67:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r5 = r5.mRoomsData     // Catch: java.lang.Exception -> L95
            if (r5 == 0) goto L99
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L95
            r4.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = "live_enter_extra_data"
            org.json.JSONObject r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r6, r0)     // Catch: java.lang.Exception -> L95
            java.util.Iterator r2 = r3.keys()     // Catch: java.lang.Exception -> L95
        L7a:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L95
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L95
            goto L7a
        L92:
            r5.gamePartnershipExtra = r4     // Catch: java.lang.Exception -> L95
            return
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467860IWi.LIZIZ(com.bytedance.android.livesdkapi.session.EnterRoomConfig, org.json.JSONObject):void");
    }
}
