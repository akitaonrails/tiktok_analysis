package X;

import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.RankUserEnigmaInfo;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo;
import com.bytedance.android.livesdkapi.depend.model.live.OnlineAudience;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: renamed from: X.00hP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C147700hP {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: Exception -> 0x006d, TryCatch #1 {Exception -> 0x006d, blocks: (B:14:0x003a, B:16:0x0041, B:18:0x0049, B:20:0x0055, B:21:0x0059, B:23:0x0060, B:25:0x0065, B:27:0x006a), top: B:61:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data LIZ(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r4 = 0
            if (r0 == 0) goto L8
            return r4
        L8:
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L6f
            r0.<init>()     // Catch: java.lang.Exception -> L6f
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r5)     // Catch: java.lang.Exception -> L6f
            com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = "status_code"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L24
            int r0 = r0.LJIIJJI()     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L24
            return r4
        L24:
            java.lang.String r0 = "data"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L75
            com.google.gson.n r2 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L6f
            com.google.gson.Gson r1 = X.C19748512Ol.LIZJ     // Catch: java.lang.Exception -> L6f
            java.lang.Class<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data> r0 = com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data.class
            java.lang.Object r3 = r1.LIZJ(r2, r0)     // Catch: java.lang.Exception -> L6f
            if (r3 == 0) goto L65
            r0 = r3
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r0     // Catch: java.lang.Exception -> L6d
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r0.rankView     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L65
            java.lang.String r0 = "lynx_rank_view"
            com.google.gson.k r0 = r2.LJJIIZ(r0)     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L63
            com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = "lynx_rank_data"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L63
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L6d
        L59:
            r0 = r3
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r0     // Catch: java.lang.Exception -> L6d
            webcast.api.ranklist.LynxRankView r0 = r0.lynxRankView     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L76
            r0.LIZ = r1     // Catch: java.lang.Exception -> L6d
            goto L76
        L63:
            r1 = r4
            goto L59
        L65:
            r0 = r3
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r0     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L76
            r0.lynxRankView = r4     // Catch: java.lang.Exception -> L6d
            goto L76
        L6d:
            r0 = move-exception
            goto L71
        L6f:
            r0 = move-exception
            r3 = r4
        L71:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L76
        L75:
            r3 = r4
        L76:
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r3 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r3
            if (r3 == 0) goto Lbc
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r3.rankView
            if (r0 == 0) goto L9b
            java.util.List<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo> r0 = r0.ranks
            if (r0 == 0) goto L9b
            java.util.Iterator r2 = r0.iterator()
        L86:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r1 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo) r1
            com.bytedance.android.live.base.model.user.User r0 = r1.rankUser
            if (r0 == 0) goto L86
            r1.user = r0
            r1.rankUser = r4
            goto L86
        L9b:
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r3.rankView
            if (r0 == 0) goto Lac
            java.util.List<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo> r1 = r0.ranks
            if (r1 == 0) goto Lac
            r0 = 164(0xa4, float:2.3E-43)
            X.0207 r0 = X.AnonymousClass0207.get$arr$(r0)
            X.C500260Jjc.LJJJLIIL(r1, r0)
        Lac:
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r3.rankView
            if (r0 == 0) goto Lbc
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r1 = r0.ownerRank
            if (r1 == 0) goto Lbc
            com.bytedance.android.live.base.model.user.User r0 = r1.rankUser
            if (r0 == 0) goto Lbc
            r1.user = r0
            r1.rankUser = r4
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147700hP.LIZ(java.lang.String):com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data");
    }

    public static C148100hT LIZIZ(OnlineRankListResponse onlineRankListResponse) {
        Rank rank;
        User user;
        List<Rank> list;
        C148100hT c148100hT = new C148100hT(onlineRankListResponse);
        if (onlineRankListResponse != null && (list = onlineRankListResponse.ranks) != null) {
            for (Rank rank2 : list) {
                User user2 = rank2.rankUser;
                if (user2 != null) {
                    rank2.user = user2;
                    rank2.rankUser = null;
                }
            }
        }
        OnlineRankListResponse onlineRankListResponse2 = c148100hT.LIZ;
        if (onlineRankListResponse2 != null && (rank = onlineRankListResponse2.selfInfo) != null && (user = rank.rankUser) != null) {
            rank.user = user;
            rank.rankUser = null;
        }
        return c148100hT;
    }

    public static OnlineRankConfig LIZJ(EcomRankInfo.DisplayConfig displayConfig) {
        OnlineRankConfig onlineRankConfig = new OnlineRankConfig(true, true, true, 2, true);
        onlineRankConfig.onlinePanelShow = displayConfig.showOnlinePanel;
        onlineRankConfig.onlinePanelClick = displayConfig.canPanelClick;
        onlineRankConfig.avatarShow = displayConfig.showAvatarList;
        onlineRankConfig.avatarNumber = (int) displayConfig.avatarCount;
        onlineRankConfig.scoreShow = displayConfig.showScore;
        return onlineRankConfig;
    }

    public static Rank LIZLLL(EcomRankInfo.Rank rank) {
        Rank rank2 = new Rank();
        rank2.user = rank.user;
        RankUser rankUser = rank.rankUser;
        if (rankUser != null) {
            rank2.user = LJFF(rankUser);
        }
        rank2.score = rank.score;
        rank2.rank = rank.rank;
        rank2.gapDescription = rank.gapDescription;
        rank2.userRestrictionLevel = rank.userRestrictionLevel;
        return rank2;
    }

    public static Rank LJ(OnlineAudience.Rank rank) {
        Rank rank2 = new Rank();
        rank2.user = rank.user;
        RankUser rankUser = rank.rankUser;
        if (rankUser != null) {
            rank2.user = LJFF(rankUser);
        }
        rank2.score = rank.score;
        rank2.rank = rank.rank;
        rank2.gapDescription = rank.gapDescription;
        rank2.userRestrictionLevel = rank.userRestrictionLevel;
        return rank2;
    }

    public static User LJFF(RankUser rankUser) {
        FollowInfo followInfo;
        User user = new User();
        user.setId(rankUser.id);
        user.setNickName(rankUser.nickname);
        RankUserEnigmaInfo rankUserEnigmaInfo = rankUser.enigmaInfo;
        if (rankUserEnigmaInfo != null && rankUserEnigmaInfo.isEnigmaMaskOn) {
            User.EnigmaInfo enigmaInfo = new User.EnigmaInfo();
            user.enigmaInfo = enigmaInfo;
            enigmaInfo.isEnigmaMaskOn = true;
        }
        user.setAvatarThumb(rankUser.avatarThumb);
        user.setSecret(rankUser.secret);
        RankUser.FollowInfo followInfo2 = rankUser.followInfo;
        BorderInfo borderInfo = null;
        if (followInfo2 != null) {
            followInfo = new FollowInfo();
            followInfo.setFollowingCount(followInfo2.followingCount);
            followInfo.setFollowerCount(followInfo2.followerCount);
            followInfo.setFollowStatus(followInfo2.followStatus);
            followInfo.setPushStatus(followInfo2.pushStatus);
        } else {
            followInfo = null;
        }
        user.setFollowInfo(followInfo);
        RankUser.Border border = rankUser.border;
        if (border != null) {
            borderInfo = new BorderInfo();
            borderInfo.icon = border.icon;
            borderInfo.level = border.level;
            borderInfo.source = border.source;
            borderInfo.profileDecorationRibbon = border.profileDecorationRibbon;
            borderInfo.borderLogExtra = border.borderPrivilegeLogExtra;
            borderInfo.ribbonLogExtra = border.profilePrivilegeLogExtra;
        }
        user.setBorder(borderInfo);
        user.setBadgeList(rankUser.badgeList);
        user.followStatus = Long.valueOf(rankUser.followStatus);
        user.setIdStr(rankUser.idStr);
        return user;
    }
}
