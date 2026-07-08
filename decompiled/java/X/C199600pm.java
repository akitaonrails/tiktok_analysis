package X;

/* JADX INFO: renamed from: X.00pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C199600pm {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r9, com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            r2 = 0
            if (r9 == 0) goto L8d
            if (r10 == 0) goto L8d
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r9.getStreamType()
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r1 == r0) goto L16
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r9.getStreamType()
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            if (r1 == r0) goto L16
            return r2
        L16:
            com.bytedance.android.livesdkapi.depend.model.live.EnlargeViewInfo r8 = r9.enlargeViewInfo
            if (r8 != 0) goto L1b
            return r2
        L1b:
            java.lang.Class<X.0Ta5> r0 = X.C749150Ta5.class
            java.lang.Object r1 = r10.gg0(r0)
            kotlin.Pair r1 = (kotlin.Pair) r1
            r7 = 0
            if (r1 == 0) goto L8a
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
        L3a:
            long r3 = r9.multiStreamScene
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L4a
            if (r6 <= 0) goto L4a
            if (r5 <= 0) goto L4a
            if (r6 < r5) goto L4a
            r7 = 1
        L4a:
            boolean r0 = r8.enablerEnlargeView
            if (r0 == 0) goto L87
            r1 = 2
            if (r7 == 0) goto L7b
            int r0 = r8.landscapeView
            if (r0 == r2) goto L78
            if (r0 != r1) goto L87
            java.lang.String r1 = "1:1crop"
        L59:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r0 = "screen_adaptation"
            r2.put(r0, r1)
            com.bytedance.android.livesdk.livesetting.game.GameLiveOriginHorizontalReportSetting r0 = com.bytedance.android.livesdk.livesetting.game.GameLiveOriginHorizontalReportSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L74
            if (r7 == 0) goto L75
            java.lang.String r1 = "1"
        L6f:
            java.lang.String r0 = "is_origin_horizontal"
            r2.put(r0, r1)
        L74:
            return r2
        L75:
            java.lang.String r1 = "0"
            goto L6f
        L78:
            java.lang.String r1 = "4:3crop"
            goto L59
        L7b:
            int r0 = r8.portraitView
            if (r0 == r2) goto L84
            if (r0 != r1) goto L87
            java.lang.String r1 = "fit_screen"
            goto L59
        L84:
            java.lang.String r1 = "fill_screen"
            goto L59
        L87:
            java.lang.String r1 = "original"
            goto L59
        L8a:
            r6 = 0
            r5 = 0
            goto L3a
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199600pm.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):java.util.Map");
    }
}
