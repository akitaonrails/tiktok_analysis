package X;

/* JADX INFO: renamed from: X.0Pos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656400Pos {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[PHI: r0
      0x0044: PHI (r0v24 java.lang.String) = (r0v23 java.lang.String), (r0v28 java.lang.String) binds: [B:21:0x003f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            X.01GW r0 = X.C276320AsI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L42
            r0 = 1
        L10:
            r4 = 0
            java.lang.String r3 = ""
            if (r0 != 0) goto L45
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r6)
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary r0 = r0.topFrameSummary
            if (r0 == 0) goto L35
            long r1 = r0.getId()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r6)
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.getTotalUserDes()
            if (r0 != 0) goto L44
        L34:
            return r3
        L35:
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r6)
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.getUserCountDes()
            if (r0 != 0) goto L44
            return r3
        L42:
            r0 = 0
            goto L10
        L44:
            return r0
        L45:
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r6)
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary r0 = r0.topFrameSummary
            if (r0 == 0) goto L77
            long r1 = r0.getId()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r6)
            if (r0 == 0) goto L85
            int r0 = r0.total_user
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L64:
            if (r0 == 0) goto L85
            long r0 = r0.longValue()
            java.lang.CharSequence r0 = X.C820940WIi.LIZ(r0)
            if (r0 == 0) goto L85
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L85
            return r0
        L77:
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r6)
            if (r0 == 0) goto L85
            int r0 = r0.user_count
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L64
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C656400Pos.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }
}
