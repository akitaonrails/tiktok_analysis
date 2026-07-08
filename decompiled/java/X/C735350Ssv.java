package X;

import android.text.TextUtils;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ssv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735350Ssv extends AbstractC1386140mAu<C735350Ssv> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public boolean LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public int LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public final int LJL;
    public final String LJLI;
    public int LJLIIIL;
    public final int LJLIIL;
    public AwemeRelationRecommendModel LJLIL;
    public MatchedFriendStruct LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final int LJLJLLL;
    public Integer LJLL;
    public int LJLLI;
    public Integer LJLLILLLL;
    public int LJLLJ;
    public String LJLLL;
    public Map<String, String> LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public boolean LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public boolean LLD;

    public C735350Ssv() {
        super("follow");
        this.LJL = -1;
        this.LJLI = "";
        this.LJLIIIL = -1;
        this.LJLIIL = -1;
        this.LJLJJI = -1;
        this.LJLJJL = "";
        this.LJLJJLL = "";
        this.LJLJLLL = -1;
        this.LJLL = 0;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = "";
        this.LJLLLL = null;
        this.LJLLLLLL = "";
        this.LJLZ = "";
        this.LJZ = false;
        this.LJZI = "";
        this.LJZL = null;
        this.LL = null;
        this.LLD = false;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        Aweme aweme;
        Aweme aweme2 = this.LJJJJZ;
        if (aweme2 != null && aweme2.getVideo() != null) {
            LIZLLL(this.LJJJJZ.getVideo().getDuration() / LSPassThroughRecordSizeConfig.DEFAULT, "vDuration");
        }
        String string = Boolean.toString(this.LJZ);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("is_casting", string, c2082308Dt);
        LJFF("casting_session_id", this.LJZI, c2082308Dt);
        LJFF("scene_id", null, c2082308Dt);
        LJFF("previous_page", this.LJJLIIIJ, c2082308Dt);
        LJFF("previous_page_position", this.LJJLIIIJILLIZJL, c2082308Dt);
        if (this.LJJLIIIJJI) {
            LJFF("is_instructive", "1", c2082308Dt);
            LJFF("bottom_bar_show", "1", c2082308Dt);
        }
        LJFF("enter_method", this.LJJLIIJ, c2082308Dt);
        String str = this.LJJLIIIJJIZ;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("to_user_id", str, c1210890hcF);
        LJFF("group_id", this.LJJLIIIJL, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJJIZ, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJJIZ, c1210890hcF);
        LJFF("follow_type", this.LJJZ, c2082308Dt);
        LJFF("page_status", null, c2082308Dt);
        LJFF("request_id", this.LJJLIIIJLJLI, c1210890hcF);
        LJFF("req_id", this.LJJLIIIJLLLLLLLZ, c1210890hcF);
        LJFF("enter_type", null, c2082308Dt);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(0);
        sbLIZ.append("");
        LJ("is_reposted", C2188811AlT.LIZIZ(sbLIZ));
        LJ("repost_from_group_id", null);
        LJ("repost_from_user_id", null);
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            LJ("share_type", this.LJLLLLLL);
        }
        if (!TextUtils.isEmpty(this.LJLZ)) {
            LJ("share_source", this.LJLZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("enter_from_request", null, c1210890hcF);
        }
        if (!TextUtils.isEmpty(this.LJLI)) {
            LJ("homepage_user_id", this.LJLI);
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL) || "homepage_hot".equals(this.LJJLIIIJ) || "potential_friends".equals(this.LJJLIIIJ) || "homepage_familiar".equals(this.LJJLIIIJ)) {
            LIZJ(this.LJJLIIIJLJLI);
        }
        if ("homepage_hot".equals(this.LIZLLL) && (aweme = this.LJJJJZ) != null) {
            if (AwemeBizExtKt.getPullType(aweme) >= 0) {
                LIZLLL(AwemeBizExtKt.getPullType(this.LJJJJZ), "pull_type");
            }
            LIZLLL(AwemeBizOptExtKt.getAwemeCacheType(this.LJJJJZ), "cache_type");
        }
        TextUtils.equals(this.LIZ, "follow_cancel");
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJL)) {
            LJFF("previous_page", "push", c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF(null, null, c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("playlist_type", null, c2082308Dt);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("rule_id", null, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJFF("impr_type", this.LJJLJ, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJFF("compilation_id", this.LJJLJLI, c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("card_type", null, c2082308Dt);
        }
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (C735370Ssx.LJJIIZI(this.LIZLLL)) {
            LJ("video_type", this.LJJLL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_keyword", null);
        }
        if (this.LJJLIL != 0) {
            LJ("is_avatar", "1");
        }
        if (TextUtils.equals(this.LIZLLL, "others_homepage") && !TextUtils.isEmpty(this.LJIJJ)) {
            LJFF("rec_type", this.LJIJJ, c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("cid", null);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJ("tag_id", this.LJJZZI);
        }
        if (!TextUtils.isEmpty(this.LJJZZIII)) {
            LJ("parent_tag_id", this.LJJZZIII);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("log_extra", null);
        }
        int i = this.LJL;
        if (i != -1) {
            LJ("is_child_mode", String.valueOf(i));
        }
        int i2 = this.LJLIIIL;
        if (i2 != -1) {
            LJ("is_private", String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(this.LJZL)) {
            LJ("tt_template_type", this.LJZL);
        }
        if (!TextUtils.isEmpty(this.LL)) {
            LJ("tt_template_id", this.LL);
        }
        int i3 = this.LJLIIL;
        if (i3 != -1) {
            LJ("cancel_type", String.valueOf(i3));
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.LJLIL;
        if (awemeRelationRecommendModel != null) {
            LJ("rec_type", awemeRelationRecommendModel.recType);
            LJ("relation_type", this.LJLIL.friendTypeStr);
        }
        MatchedFriendStruct matchedFriendStruct = this.LJLILLLLZI;
        if (matchedFriendStruct != null) {
            LJ("rec_type", matchedFriendStruct.recType);
            LJ("relation_type", this.LJLILLLLZI.relationType);
        }
        LJ("is_highlighted", String.valueOf(this.LJLJI));
        LJ("rank_index", String.valueOf(this.LJLJJI));
        if (!TextUtils.isEmpty(this.LJLJJL)) {
            LJ("playlist_id", this.LJLJJL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("account_type", null);
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            LJ("category_name", this.LJLJJLL);
        }
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        String str2 = c650960Pg6LIZJ != null ? c650960Pg6LIZJ.searchVideoModel.groupId : "";
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL) || "others_homepage" == this.LIZLLL) {
            LJ("last_from_group_id", str2);
        }
        LIZLLL(this.LJLJL, "is_long");
        LIZLLL(this.LJLJLJ, "is_landscape_screen");
        Aweme aweme3 = this.LJJJJZ;
        if (aweme3 != null) {
            LIZLLL(aweme3.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJJJZ), "text_post_content");
            LIZLLL(C735370Ssx.LJIILL(this.LJJJJZ), "pic_cnt");
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            if (C735370Ssx.LJJIII(this.LJJJJZ)) {
                LJ("is_comment_to_post", "1");
            }
            if (this.LJJJJZ.getMobParams() != null) {
                LIZIZ(this.LJJJJZ.getMobParams());
            }
            ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIILLIIL(this.LJJJJZ, this);
            LJ("is_ad", this.LJJJJZ.isAd() ? "1" : CardStruct.IStatusCode.DEFAULT);
            C1606660rua.LIZIZ.LIZJ(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJZ, false);
            if (C1367960lha.LIZ != null && C1367960lha.LIZ() != null) {
                LIZIZ(C1367960lha.LIZ().LJIILJJIL(this.LJJJJZ, C1367960lha.LIZ().LJLJL(this.LJJJJZ.getAid())));
            }
            int i4 = this.LJLJLLL;
            if (i4 != -1) {
                LIZLLL(i4, "music_name");
            }
            LIZLLL(this.LJLL.intValue(), "artist_label");
            LIZLLL(this.LJLLI, "is_fan_spotlight");
            LIZLLL(this.LJLLILLLL.intValue(), "bts_type");
            LIZLLL(this.LJLLJ, "is_pgc");
            LJ("meta_song_id", this.LJLLL);
            if (this.LLD && this.LJJJJZ.getMusic() != null && this.LJJJJZ.getMusic().carryMetaSongId() != null) {
                LJ("meta_song_id", this.LJJJJZ.getMusic().carryMetaSongId());
            }
            Map<String, String> map = this.LJLLLL;
            if (map != null) {
                LIZIZ(map);
            }
            String strLIZ = C1381730m3n.LIZ(this.LJJJJZ);
            if (strLIZ != null && !strLIZ.isEmpty()) {
                LJ("photo_content_type", strLIZ);
            }
            LJ("music_type", C0SP9.LJFF(this.LJJJJZ));
            LJ("redistribute_reason", "homepage_hot".equals(this.LIZLLL) ? C1383360m6Q.LIZ(this.LJJJJZ) : "");
            Map<String, String> contentRecReasonParams = C529890KqJ.LIZ().getContentRecReasonParams(this.LJJJJZ, this.LIZLLL);
            if (contentRecReasonParams != null) {
                for (Map.Entry<String, String> entry : contentRecReasonParams.entrySet()) {
                    LJ(entry.getKey(), entry.getValue());
                }
            }
            C1EE2.LIZIZ.LJJLIL(this.LJJJJZ, this);
            try {
                ((ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi(ILocalServicePassThroughService.class)).LJII(PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage()), "follow", null, this.LIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJIJIL(int i, Aweme aweme) {
        MatchedFriendStruct matchedFriendStruct;
        LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIIIJL = aweme.getAid();
            this.LJJLIIIJLJLI = AbstractC1386130mAt.LJIIL(i, aweme);
            this.LJJLIIIJJIZ = AwemeExtKt.getAuthorUid(aweme);
            this.LJJLJ = C735370Ssx.LJI(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJJLJLI = aweme.getMixInfo().mixId;
            }
            if (!C727520SgI.LJI(this.LJJJJZ)) {
                this.LJJLIL = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
            }
            this.LJJLL = C735370Ssx.LJIIIIZZ(aweme);
            this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
            C727520SgI.LJFF(aweme);
            this.LJIJJLI = "";
            this.LJLIL = aweme.getRelationRecommendInfo();
            User author = aweme.getAuthor();
            if (author != null) {
                matchedFriendStruct = author.getMatchedFriendStruct();
            } else {
                matchedFriendStruct = null;
            }
            this.LJLILLLLZI = matchedFriendStruct;
            this.LJLLILLLL = Integer.valueOf(AwemeBizExtKt.getBehindTheSongVideoType(aweme));
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LJLJJL = aweme.playlist_info.getMixId();
            }
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LJLJL = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LJLJL = 1;
            }
            if (aweme.isPinnedByArtist()) {
                this.LJLL = 1;
            }
            if (aweme.getPickedUsers() != null && aweme.getPickedUsers().size() > 0) {
                this.LJLLI = 1;
            }
            if (aweme.getMusic() != null) {
                if (aweme.getMusic().isPgc()) {
                    this.LJLLJ = 1;
                }
                if (aweme.getMusic().getMatchedSongInfo() != null) {
                    this.LJLLL = aweme.getMusic().getMatchedSongInfo().getId();
                }
                if (aweme.getMusic().getLogExtraMap() != null) {
                    this.LJLLLL = aweme.getMusic().getLogExtraMap();
                }
            }
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LJZL = c1387380mCuLIZLLL.LIZJ;
                this.LL = c1387380mCuLIZLLL.LIZLLL;
            }
        }
    }
}
