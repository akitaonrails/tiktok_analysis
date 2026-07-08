package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C148800ha implements InterfaceC148000hS {
    public final DataChannel LIZ;

    public C148800ha(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC148000hS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse>> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C149000hc
            if (r0 == 0) goto L22
            r13 = r15
            X.00hc r13 = (X.C149000hc) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r13.LLILLL = r2
        L12:
            java.lang.Object r1 = r13.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            java.lang.String r2 = "RemoteAudienceRankingDataSourceImpl"
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            goto L85
        L22:
            X.00hc r13 = new X.00hc
            r13.<init>(r14, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "fetchTopViewerRankingData"
            X.C20441214yg.LIZIZ(r2, r0)
            long r5 = X.C1105330erz.LIZLLL
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L46
            long r0 = java.lang.System.currentTimeMillis()
            X.C1105330erz.LIZLLL = r0
        L46:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r14.LIZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L67
            long r6 = r0.getId()
        L56:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r14.LIZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L6a
            long r8 = r0.getOwnerUserId()
            goto L6a
        L67:
            r6 = 0
            goto L56
        L6a:
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L8b
            java.lang.Class<com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI> r0 = com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI.class
            r1.getClass()     // Catch: java.lang.Exception -> L8b
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L8b
            com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI r5 = (com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI) r5     // Catch: java.lang.Exception -> L8b
            r13.LLILLL = r4     // Catch: java.lang.Exception -> L8b
            r10 = 1
            r12 = 1
            java.lang.Object r1 = r5.getTopViewerRankingInfo(r6, r8, r10, r12, r13)     // Catch: java.lang.Exception -> L8b
            if (r1 != r3) goto L88
            return r3
        L85:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L8b
        L88:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L8b
            return r1
        L8b:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r14.LIZ
            X.C1105330erz.LIZLLL(r0, r3)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Top Viewer API request error: "
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r2, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148800ha.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC148000hS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.rank.impl.api.EcomTopBuyerData>> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C148900hb
            if (r0 == 0) goto L22
            r13 = r15
            X.00hb r13 = (X.C148900hb) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r13.LLILLL = r2
        L12:
            java.lang.Object r1 = r13.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            java.lang.String r3 = "RemoteAudienceRankingDataSourceImpl"
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            goto L79
        L22:
            X.00hb r13 = new X.00hb
            r13.<init>(r14, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "fetchTopBuyerRankingData"
            X.C20441214yg.LIZIZ(r3, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r14.LIZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            r8 = 0
            if (r0 == 0) goto L5b
            long r6 = r0.getId()
        L4a:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r14.LIZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L5e
            long r8 = r0.getOwnerUserId()
            goto L5e
        L5b:
            r6 = 0
            goto L4a
        L5e:
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L7f
            java.lang.Class<com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI> r0 = com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI.class
            r1.getClass()     // Catch: java.lang.Exception -> L7f
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L7f
            com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI r5 = (com.bytedance.android.livesdk.rank.impl.api.AudienceRankingAPI) r5     // Catch: java.lang.Exception -> L7f
            r13.LLILLL = r4     // Catch: java.lang.Exception -> L7f
            r10 = 1
            r12 = 1
            java.lang.Object r1 = r5.getECommerceTopBuyerRankingInfo(r6, r8, r10, r12, r13)     // Catch: java.lang.Exception -> L7f
            if (r1 != r2) goto L7c
            return r2
        L79:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7f
        L7c:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L7f
            return r1
        L7f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Top Buyer API request error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148800ha.LIZIZ(X.05Vn):java.lang.Object");
    }
}
