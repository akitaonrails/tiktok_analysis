package X;

import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo;
import com.bytedance.android.livesdkapi.depend.model.live.OnlineAudience;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.00hO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C147600hO implements InterfaceC192300ob {
    public final InterfaceC146700hF LIZ;
    public final InterfaceC148000hS LIZIZ;
    public final C148700hZ LIZJ;
    public final C148500hX LIZLLL;
    public Boolean LJ;
    public EnumC187400no LJFF = EnumC187400no.TOP_VIEWER;

    @Override // X.InterfaceC192300ob
    public final C148100hT LIZJ() {
        C20441214yg.LIZIZ("AudienceRankingEntranceRepositoryImpl", "getTopViewerRankingDataFromRoom");
        C148700hZ c148700hZ = this.LIZJ;
        OnlineAudience onlineAudienceLIZJ = this.LIZ.LIZJ();
        c148700hZ.getClass();
        C20441214yg.LIZIZ("TopViewerDataMapper", "fromLocal");
        OnlineRankConfig onlineRankConfig = null;
        if (onlineAudienceLIZJ == null) {
            return null;
        }
        OnlineRankListResponse onlineRankListResponse = new OnlineRankListResponse();
        onlineRankListResponse.ranks = new ArrayList();
        Iterator<OnlineAudience.Rank> it2 = onlineAudienceLIZJ.ranks.iterator();
        while (it2.hasNext()) {
            onlineRankListResponse.ranks.add(C147700hP.LJ(it2.next()));
        }
        OnlineAudience.Rank rank = onlineAudienceLIZJ.selfInfo;
        onlineRankListResponse.selfInfo = rank != null ? C147700hP.LJ(rank) : null;
        onlineRankListResponse.currency = onlineAudienceLIZJ.currency;
        onlineRankListResponse.isBroadcastMENAT = onlineAudienceLIZJ.anchorShowContribution;
        onlineRankListResponse.ruleUrl = onlineAudienceLIZJ.ruleUrl;
        onlineRankListResponse.total = (int) onlineAudienceLIZJ.total;
        OnlineAudience.DisplayConfig displayConfig = onlineAudienceLIZJ.displayConfig;
        if (displayConfig != null) {
            onlineRankConfig = new OnlineRankConfig(true, true, true, 2, true);
            onlineRankConfig.onlinePanelShow = displayConfig.showOnlinePanel;
            onlineRankConfig.onlinePanelClick = displayConfig.canPanelClick;
            onlineRankConfig.avatarShow = displayConfig.showAvatarList;
            onlineRankConfig.avatarNumber = (int) displayConfig.avatarCount;
            onlineRankConfig.scoreShow = displayConfig.showScore;
        }
        onlineRankListResponse.config = onlineRankConfig;
        return new C148100hT(onlineRankListResponse);
    }

    @Override // X.InterfaceC192300ob
    public final C148100hT LIZLLL() {
        C20441214yg.LIZIZ("AudienceRankingEntranceRepositoryImpl", "getTopBuyerRankingDataFromRoom");
        C148500hX c148500hX = this.LIZLLL;
        EcomRankInfo ecomRankInfoLIZLLL = this.LIZ.LIZLLL();
        c148500hX.getClass();
        C20441214yg.LIZIZ("EcommerceTopBuyerDataMapper", "fromLocal");
        if (ecomRankInfoLIZLLL == null) {
            return null;
        }
        OnlineRankListResponse onlineRankListResponse = new OnlineRankListResponse();
        onlineRankListResponse.ranks = new ArrayList();
        Iterator<EcomRankInfo.Rank> it2 = ecomRankInfoLIZLLL.ranks.iterator();
        while (it2.hasNext()) {
            onlineRankListResponse.ranks.add(C147700hP.LIZLLL(it2.next()));
        }
        EcomRankInfo.Rank rank = ecomRankInfoLIZLLL.selfInfo;
        onlineRankListResponse.selfInfo = rank != null ? C147700hP.LIZLLL(rank) : null;
        onlineRankListResponse.currency = "";
        onlineRankListResponse.isBroadcastMENAT = false;
        onlineRankListResponse.ruleUrl = ecomRankInfoLIZLLL.ruleUrl;
        onlineRankListResponse.total = 0;
        EcomRankInfo.DisplayConfig displayConfig = ecomRankInfoLIZLLL.displayConfig;
        onlineRankListResponse.config = displayConfig != null ? C147700hP.LIZJ(displayConfig) : null;
        C148100hT c148100hT = new C148100hT(onlineRankListResponse);
        c148100hT.LIZJ = ecomRankInfoLIZLLL.canShowRank;
        return c148100hT;
    }

    @Override // X.InterfaceC192300ob
    public final void release() {
        C20441214yg.LIZIZ("AudienceRankingEntranceRepositoryImpl", "release");
    }

    @Override // X.InterfaceC192300ob
    public final EnumC187400no LJFF() {
        return this.LJFF;
    }

    @Override // X.InterfaceC192300ob
    public final Boolean LJI() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // X.InterfaceC192300ob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C148100hT> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C147900hR
            if (r0 == 0) goto L4d
            r4 = r6
            X.00hR r4 = (X.C147900hR) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L7a
            X.00hZ r1 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L24:
            com.bytedance.android.live.network.response.BaseResponse r0 = (com.bytedance.android.live.network.response.BaseResponse) r0
            r1.getClass()
            java.lang.String r1 = "fromRemote"
            java.lang.String r4 = "TopViewerDataMapper"
            X.C20441214yg.LIZIZ(r4, r1)
            r3 = 0
            if (r0 == 0) goto L53
            goto L55
        L34:
            X.C155000ia.LIZIZ(r0)
            java.lang.String r1 = "AudienceRankingEntranceRepositoryImpl"
            java.lang.String r0 = "fetchTopViewerRankingData"
            X.C20441214yg.LIZIZ(r1, r0)
            X.00hZ r1 = r5.LIZJ
            X.00hS r0 = r5.LIZIZ
            r4.LL = r1
            r4.LLILZ = r2
            java.lang.Object r0 = r0.LIZ(r4)
            if (r0 != r3) goto L24
            return r3
        L4d:
            X.00hR r4 = new X.00hR
            r4.<init>(r5, r6)
            goto L12
        L53:
            r0 = r3
            goto L59
        L55:
            T r0 = r0.data     // Catch: java.lang.Exception -> L5e
            com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse r0 = (com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse) r0     // Catch: java.lang.Exception -> L5e
        L59:
            X.00hT r3 = X.C147700hP.LIZIZ(r0)     // Catch: java.lang.Exception -> L5e
            return r3
        L5e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Error in fromRemote: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJ(r4, r0)
            return r3
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147600hO.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    @Override // X.InterfaceC192300ob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C148100hT> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C147800hQ
            if (r0 == 0) goto L7a
            r4 = r7
            X.00hQ r4 = (X.C147800hQ) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r2 = 1
            if (r1 == 0) goto L61
            if (r1 != r2) goto Lb0
            X.00hX r1 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L24:
            com.bytedance.android.live.network.response.BaseResponse r0 = (com.bytedance.android.live.network.response.BaseResponse) r0
            r1.getClass()
            java.lang.String r2 = "EcommerceTopBuyerDataMapper"
            java.lang.String r1 = "fromRemote"
            X.C20441214yg.LIZIZ(r2, r1)
            r3 = 0
            if (r0 == 0) goto Lad
            T r5 = r0.data
            com.bytedance.android.livesdk.rank.impl.api.EcomTopBuyerData r5 = (com.bytedance.android.livesdk.rank.impl.api.EcomTopBuyerData) r5
            if (r5 == 0) goto Lad
            com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse r4 = new com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.ranks = r0
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo$Rank> r0 = r5.ranks
            java.util.Iterator r2 = r0.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo$Rank r0 = (com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo.Rank) r0
            java.util.List<com.bytedance.android.livesdk.rank.api.model.Rank> r1 = r4.ranks
            com.bytedance.android.livesdk.rank.api.model.Rank r0 = X.C147700hP.LIZLLL(r0)
            r1.add(r0)
            goto L4b
        L61:
            X.C155000ia.LIZIZ(r0)
            java.lang.String r1 = "AudienceRankingEntranceRepositoryImpl"
            java.lang.String r0 = "fetchTopBuyerRankingData"
            X.C20441214yg.LIZIZ(r1, r0)
            X.00hX r1 = r6.LIZLLL
            X.00hS r0 = r6.LIZIZ
            r4.LL = r1
            r4.LLILZ = r2
            java.lang.Object r0 = r0.LIZIZ(r4)
            if (r0 != r3) goto L24
            return r3
        L7a:
            X.00hQ r4 = new X.00hQ
            r4.<init>(r6, r7)
            goto L12
        L80:
            com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo$Rank r0 = r5.selfInfo
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdk.rank.api.model.Rank r0 = X.C147700hP.LIZLLL(r0)
        L88:
            r4.selfInfo = r0
            java.lang.String r0 = ""
            r4.currency = r0
            r0 = 0
            r4.isBroadcastMENAT = r0
            java.lang.String r0 = r5.ruleUrl
            r4.ruleUrl = r0
            long r1 = r5.total
            int r0 = (int) r1
            r4.total = r0
            com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo$DisplayConfig r0 = r5.displayConfig
            if (r0 == 0) goto La2
            com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig r3 = X.C147700hP.LIZJ(r0)
        La2:
            r4.config = r3
            X.00hT r3 = new X.00hT
            r3.<init>(r4)
            boolean r0 = r5.canShowRank
            r3.LIZJ = r0
        Lad:
            return r3
        Lae:
            r0 = r3
            goto L88
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147600hO.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC192300ob
    public final void LJ(EnumC187400no enumC187400no) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurrentRankingType: ");
        sbLIZ.append(enumC187400no);
        C20441214yg.LIZIZ("AudienceRankingEntranceRepositoryImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = enumC187400no;
    }

    @Override // X.InterfaceC192300ob
    public final void LJII(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCanShowTopBuyer: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("AudienceRankingEntranceRepositoryImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = Boolean.valueOf(z);
    }

    public C147600hO(C146600hE c146600hE, C148800ha c148800ha, C148700hZ c148700hZ, C148500hX c148500hX) {
        this.LIZ = c146600hE;
        this.LIZIZ = c148800ha;
        this.LIZJ = c148700hZ;
        this.LIZLLL = c148500hX;
    }
}
