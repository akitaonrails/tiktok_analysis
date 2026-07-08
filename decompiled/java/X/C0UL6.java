package X;

/* JADX INFO: renamed from: X.0UL6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UL6 {
    public final C770660UKy LIZ;
    public final C770660UKy LIZIZ;
    public final C770660UKy LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[PHI: r4 r6 r7
      0x001f: PHI (r4v4 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>) = 
      (r4v0 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
      (r4v5 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
     binds: [B:9:0x001d, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r6v5 int) = (r6v1 int), (r6v6 int) binds: [B:9:0x001d, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r7v5 int) = (r7v1 int), (r7v6 int) binds: [B:9:0x001d, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r3 r4 r6 r7
      0x0026: PHI (r3v3 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>) = 
      (r3v0 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
      (r3v4 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
     binds: [B:9:0x001d, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r4v3 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>) = 
      (r4v0 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
      (r4v4 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
     binds: [B:9:0x001d, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r6v4 int) = (r6v1 int), (r6v5 int) binds: [B:9:0x001d, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r7v4 int) = (r7v1 int), (r7v5 int) binds: [B:9:0x001d, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r3 r4 r5 r6 r7
      0x002c: PHI (r3v1 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>) = 
      (r3v3 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
      (r3v4 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
     binds: [B:13:0x002a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r4v1 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>) = 
      (r4v3 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
      (r4v4 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
     binds: [B:13:0x002a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r5v1 int) = (r5v3 int), (r5v0 int) binds: [B:13:0x002a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r6v2 int) = (r6v4 int), (r6v5 int) binds: [B:13:0x002a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r7v2 int) = (r7v4 int), (r7v5 int) binds: [B:13:0x002a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[PHI: r4 r6 r7
      0x001b: PHI (r4v0 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>) = 
      (r4v5 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
      (r4v6 java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo>)
     binds: [B:7:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r6v1 int) = (r6v6 int), (r6v7 int) binds: [B:7:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r7v1 int) = (r7v6 int), (r7v7 int) binds: [B:7:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0UL6(com.bytedance.ies.sdk.datachannel.DataChannel r11) {
        /*
            r10 = this;
            r10.<init>()
            com.bytedance.android.livesdk.livesetting.game.BannerPriorityJsonSetting r0 = com.bytedance.android.livesdk.livesetting.game.BannerPriorityJsonSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.game.BannerPriorityConfig r0 = r0.getBannerPriorityConfig()
            r5 = 1
            if (r0 == 0) goto La3
            int r7 = r0.gameBannerCount
            int r6 = r0.obsBannerCount
            java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo> r4 = r0.gameBannerInfoList
            if (r4 != 0) goto L1b
        L14:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            if (r0 == 0) goto L1f
        L1b:
            java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo> r3 = r0.obsBannerInfoList
            if (r3 != 0) goto L26
        L1f:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r0 == 0) goto L2c
        L26:
            int r5 = r0.liveStudioBannerCount
            java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo> r2 = r0.liveStudioBannerInfoList
            if (r2 != 0) goto L31
        L2c:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L31:
            X.0UKy r9 = new X.0UKy
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            r9.<init>(r0, r6, r3)
            r10.LIZ = r9
            X.0UKy r8 = new X.0UKy
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            r8.<init>(r0, r7, r4)
            r10.LIZIZ = r8
            X.0UKy r1 = new X.0UKy
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            r1.<init>(r0, r5, r2)
            r10.LIZJ = r1
            java.lang.Class<com.bytedance.android.live.broadcast.banner.ObsBannerWidgetManagerChannel> r0 = com.bytedance.android.live.broadcast.banner.ObsBannerWidgetManagerChannel.class
            r11.zW(r0, r9)
            java.lang.Class<com.bytedance.android.live.broadcast.banner.GameBannerWidgetManagerChannel> r0 = com.bytedance.android.live.broadcast.banner.GameBannerWidgetManagerChannel.class
            r11.zW(r0, r8)
            java.lang.Class<com.bytedance.android.live.broadcast.banner.LiveStudioBannerWidgetManagerChannel> r0 = com.bytedance.android.live.broadcast.banner.LiveStudioBannerWidgetManagerChannel.class
            r11.zW(r0, r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "gameBannerCount"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "obsBannerCount"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "liveStudioBannerCount"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "gameBannerInfoList"
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = "obsBannerInfoList"
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = "liveStudioBannerInfoList"
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZ(r0)
            return
        La3:
            r7 = 1
            r6 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UL6.<init>(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
