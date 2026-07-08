package X;

import android.text.TextUtils;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ssw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735360Ssw extends AbstractC1386140mAu<C735360Ssw> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public boolean LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public Boolean LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public final int LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public long LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public String LJLLLLLL;
    public int LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public String LLD;
    public int LLF;
    public String LLFF;
    public int LLFFF;
    public int LLFII;
    public Integer LLFZ;
    public int LLI;
    public Integer LLIFFJFJJ;
    public int LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public Map<String, String> LLIIJI;
    public boolean LLIIJLIL;
    public String LLIIL;

    public C735360Ssw() {
        super("like");
        this.LJJZZIII = Boolean.FALSE;
        this.LJLIIL = 1;
        this.LJLJJI = -1;
        this.LJLL = 0;
        this.LJLLL = -1;
        this.LJLLLL = 0;
        this.LJLZ = 0;
        this.LJZ = "";
        this.LJZI = "";
        this.LJZL = "";
        this.LL = "";
        this.LLD = "";
        this.LLF = 0;
        this.LLFF = "";
        this.LLFFF = 0;
        this.LLFII = -1;
        this.LLFZ = 0;
        this.LLI = 0;
        this.LLIFFJFJJ = 0;
        this.LLII = 0;
        this.LLIIII = "";
        this.LLIIIILZ = null;
        this.LLIIIJ = null;
        this.LLIIIL = null;
        this.LLIIIZ = null;
        this.LLIIJI = null;
        this.LLIIJLIL = false;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        Aweme aweme = this.LJJJJZ;
        if (aweme != null && aweme.getVideo() != null) {
            LIZLLL(this.LJJJJZ.getVideo().getDuration() / LSPassThroughRecordSizeConfig.DEFAULT, "vDuration");
        }
        LJ("now_type", this.LLD);
        String str = this.LJJLIIIJ;
        InterfaceC1210900hcG interfaceC1210900hcG = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, interfaceC1210900hcG);
        LJFF("author_id", this.LJJLIIIJILLIZJL, interfaceC1210900hcG);
        LJFF("request_id", this.LJJLIIIJJI, interfaceC1210900hcG);
        String str2 = this.LJJLIIJ;
        InterfaceC1210900hcG interfaceC1210900hcG2 = InterfaceC1210900hcG.LIZ;
        LJFF("previous_page", str2, interfaceC1210900hcG2);
        LJFF("previous_page_position", this.LJJLIL, interfaceC1210900hcG2);
        if (this.LJJLJ) {
            LJFF("is_instructive", "1", interfaceC1210900hcG2);
            LJFF("bottom_bar_show", "1", interfaceC1210900hcG2);
        }
        String str3 = this.LIZLLL;
        if (str3 != null && str3.equals("creation_inspiration")) {
            LJ("creation_inspiration_category", this.LJJLJLI);
        }
        LJFF("duration", String.valueOf(this.LJLLILLLL), interfaceC1210900hcG2);
        if ("homepage_hot".equals(this.LIZLLL)) {
            LIZLLL(this.LLFFF, "has_ad");
            Aweme aweme2 = this.LJJJJZ;
            if (aweme2 != null) {
                if (AwemeBizExtKt.getPullType(aweme2) >= 0) {
                    LIZLLL(AwemeBizExtKt.getPullType(this.LJJJJZ), "pull_type");
                }
                LIZLLL(AwemeBizOptExtKt.getAwemeCacheType(this.LJJJJZ), "cache_type");
            }
        }
        if (!TextUtils.isEmpty(this.LJZL)) {
            LJ("news_id", this.LJZL);
        }
        if (!TextUtils.isEmpty(this.LJLI)) {
            LJ("enter_position", this.LJLI);
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(this.LJJLIIIJJI);
        }
        Aweme aweme3 = this.LJJJJZ;
        if (aweme3 != null) {
            C1380890m2R.LJ(aweme3, this);
        }
        if (!TextUtils.isEmpty(this.LJLLI)) {
            LJ("push_label", this.LJLLI);
        }
        TextUtils.equals(this.LIZ, "like_cancel");
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJ)) {
            LJFF("previous_page", "push", interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLJLI)) {
            LJFF(this.LJJLIIIJLJLI, this.LJJLIIIJLLLLLLLZ, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJFF("playlist_type", this.LJJLIIIJL, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJZ) && (TextUtils.equals(this.LJZ, "click_comment_chain") || TextUtils.equals(this.LJZ, "click_comment_bubble") || TextUtils.equals(this.LJZ, "push") || TextUtils.equals(this.LJZ, "web"))) {
            LJ("comment_enter_method", this.LJZ);
            LJ("last_group_id", this.LJZI);
        } else if (!TextUtils.isEmpty(this.LJZ) && TextUtils.equals(this.LJZ, "notification_page")) {
            LJ("comment_enter_method", "notification");
            LJ("last_group_id", this.LJZI);
        } else if (!TextUtils.isEmpty(this.LJZ) && TextUtils.equals(this.LJZ, "comment")) {
            LJ("comment_enter_method", "comment_panel");
            LJ("last_group_id", this.LJZI);
        }
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJFF("impr_type", this.LJJLL, interfaceC1210900hcG2);
        }
        LJ("is_text_empty", CardStruct.IStatusCode.DEFAULT);
        LJ("has_text", "1");
        if (C735370Ssx.LJJIJ(this.LIZLLL)) {
            if (!TextUtils.isEmpty(this.LJL)) {
                LJFF("enter_method", this.LJL, interfaceC1210900hcG2);
            }
            if (!TextUtils.isEmpty(this.LJLIIIL)) {
                LJFF("content_type", this.LJLIIIL, interfaceC1210900hcG2);
            }
            LJFF("enter_fullscreen", String.valueOf(this.LJLIIL), interfaceC1210900hcG2);
            C1386210mB1.LIZ.getClass();
            LJ("notice_type", C1386210mB1.LIZIZ);
            LJ("show_cnt", String.valueOf(0));
            LJ("yellow_dot_logid", C1386210mB1.LIZJ);
        }
        if (!TextUtils.isEmpty(this.LJLIL)) {
            LJFF("is_reposted", "1", interfaceC1210900hcG2);
            LJFF("repost_from_group_id", this.LJLIL, interfaceC1210900hcG2);
            LJFF("repost_from_user_id", this.LJLILLLLZI, interfaceC1210900hcG2);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        if (!TextUtils.isEmpty(this.LLIIL)) {
            LJ("tab_name", this.LLIIL);
        }
        if (C735370Ssx.LJJIIZI(this.LIZLLL)) {
            LJ("relation_type", this.LJLJJL ? "follow" : "unfollow");
            LJ("video_type", this.LJLJJLL);
            LJ("rec_uid", this.LJLJL);
        }
        if (!TextUtils.isEmpty(this.LJL)) {
            LJFF("enter_method", this.LJL, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJLJI)) {
            LJFF("compilation_id", this.LJLJI, interfaceC1210900hcG2);
        }
        if (this.LJLJJI != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJLJJI);
            sbLIZ.append("");
            LJFF("is_logged_in", C2188811AlT.LIZIZ(sbLIZ), interfaceC1210900hcG2);
        }
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("is_fullscreen", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_keyword", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_type", null);
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            LJ("creation_id", this.LJII);
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJ("tag_id", this.LJJZ);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJ("parent_tag_id", this.LJJZZI);
        }
        if (this.LJLL != 0) {
            LJ("is_avatar", "1");
        }
        if (!TextUtils.isEmpty(this.LJLJLJ) && !C729510SjV.LJJIJIL(this.LJJJJZ)) {
            if (("homepage_friends".equals(this.LIZLLL) && C319860CgK.LIZ()) || C817650W5r.LIZ(this.LJJJJZ)) {
                LJ("follow_status", C735370Ssx.LJIJJLI(this.LJJJJZ.getAuthor()));
            } else {
                LJ("follow_status", this.LJLJLJ);
            }
        }
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            LJ("playlist_id", this.LJLLLLLL);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJLJLLL);
        sbLIZ2.append("");
        LJ("relation_tag", C2188811AlT.LIZIZ(sbLIZ2));
        LIZLLL(this.LJLLJ ? 1 : 0, "is_highlighted");
        LIZLLL(this.LJLLL, "rank_index");
        if ("self_profile_search_result_feed".equals(this.LIZLLL) || "other_profile_search_result_feed".equals(this.LIZLLL)) {
            LJ("item_position", this.LJJJJL);
            LJ("profile_search_id", this.LJJJJLI);
        }
        if (!C727520SgI.LJFF(this.LJJJJZ)) {
            LJ("rec_type", C727520SgI.LIZJ(this.LJJJJZ));
            LJ("relation_type", C727520SgI.LIZ(this.LJJJJZ));
        }
        LIZLLL(this.LJLZ, "is_long");
        LIZLLL(this.LJLLLL, "is_promoted");
        LIZLLL(0, "is_music");
        Aweme aweme4 = this.LJJJJZ;
        if (aweme4 != null) {
            if (aweme4.getAuthor() != null) {
                LIZLLL(this.LJJJJZ.getAuthor().getFollowStatusRelation(), "follow_status_relation");
            }
            LIZLLL(this.LJJJJZ.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJJJZ), "text_post_content");
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            if (C735370Ssx.LJJIII(this.LJJJJZ)) {
                LJ("is_comment_to_post", "1");
            }
            LIZLLL(C735370Ssx.LJIILL(this.LJJJJZ), "pic_cnt");
            int iLIZJ = C720360SNm.LIZJ(this.LJJJJZ);
            if (iLIZJ >= 0) {
                LIZLLL(iLIZJ + 1, "pic_location");
            }
            if (this.LJJJJZ.getMobParams() != null) {
                LIZIZ(this.LJJJJZ.getMobParams());
            }
            LJ("is_ad", this.LJJJJZ.isAd() ? "1" : CardStruct.IStatusCode.DEFAULT);
            LIZLLL(C1017070cZd.LJJIIJ(this.LJJJJZ), "has_nova_like_effect");
            LIZLLL(this.LLFZ.intValue(), "artist_label");
            LIZLLL(this.LLI, "is_fan_spotlight");
            LIZLLL(this.LLIFFJFJJ.intValue(), "bts_type");
            LIZLLL(this.LLII, "is_pgc");
            LJ("meta_song_id", this.LLIIII);
            if (this.LLIIJLIL && this.LJJJJZ.getMusic() != null && this.LJJJJZ.getMusic().carryMetaSongId() != null) {
                LJ("meta_song_id", this.LJJJJZ.getMusic().carryMetaSongId());
            }
            Map map = this.LLIIJI;
            if (map != null) {
                LIZIZ(map);
            }
            LIZLLL(AwemeExtKt.getPromoteAdTypeForReport(this.LJJJJZ), "promote_ad_type");
            String strLIZ = C1381730m3n.LIZ(this.LJJJJZ);
            if (strLIZ != null && !strLIZ.isEmpty()) {
                LJ("photo_content_type", strLIZ);
            }
            LIZLLL(this.LJJJJZ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIILLIIL(this.LJJJJZ, this);
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LJ("last_from_group_id", this.LL);
        }
        HashMap<String, String> map2 = new HashMap<>();
        C1606660rua.LIZIZ.LIZJ(this.LIZLLL, map2, this.LJJJJZ, false);
        if (!map2.isEmpty()) {
            LIZIZ(map2);
        }
        if (C1367960lha.LIZ != null && C1367960lha.LIZ() != null && this.LJJJJZ != null) {
            LIZIZ(C1367960lha.LIZ().LJIILJJIL(this.LJJJJZ, C1367960lha.LIZ().LJLJL(this.LJJJJZ.getAid())));
        }
        String str4 = this.LLIIIL;
        if (str4 != null && str4.equals(CardStruct.IStatusCode.DEFAULT)) {
            LJIILL("nearby_rank");
            LJIILL("rank_inner");
            LJIILL("is_inner");
        }
        String str5 = this.LLIIIZ;
        if (str5 != null) {
            LJ("is_cache", str5);
        }
        int i = this.LLFII;
        if (i != -1) {
            LIZLLL(i, "music_name");
        }
        String str6 = this.LLIIIILZ;
        if (str6 != null) {
            LJ("tt_template_type", str6);
        }
        String str7 = this.LLIIIJ;
        if (str7 != null) {
            LJ("tt_template_id", str7);
        }
        LIZLLL(this.LLF, "is_landscape_screen");
        C1365450ldX.LIZ(this, this.LJJJJZ);
        C1609930rzr.LJIJ(this.LJJJJZ, this);
        LJ("music_type", C0SP9.LJFF(this.LJJJJZ));
        LJ("redistribute_reason", "homepage_hot".equals(this.LIZLLL) ? C1383360m6Q.LIZ(this.LJJJJZ) : "");
        if (!this.LLFF.isEmpty()) {
            LJ("chat_type", this.LLFF);
        }
        Map<String, String> contentRecReasonParams = C529890KqJ.LIZ().getContentRecReasonParams(this.LJJJJZ, this.LIZLLL);
        if (contentRecReasonParams != null) {
            for (Map.Entry<String, String> entry : contentRecReasonParams.entrySet()) {
                LJ(entry.getKey(), entry.getValue());
            }
        }
        String strLIZ2 = C07TZ.LIZ(this.LJJJJZ);
        if (!TextUtils.isEmpty(strLIZ2)) {
            LJ("sticker_type_str", strLIZ2);
        }
        LJI("if_default", this.LJJZZIII.booleanValue());
        C1EE2.LIZIZ.LJJLIL(this.LJJJJZ, this);
        LJIIZILJ();
        LJIJ();
        PageFinder pageFinderVia = PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage());
        if (TextUtils.equals(this.LIZ, "like_cancel")) {
            ((ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi(ILocalServicePassThroughService.class)).LJII(pageFinderVia, "like_cancel", this.LIZIZ, null);
        } else {
            ((ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi(ILocalServicePassThroughService.class)).LJII(pageFinderVia, "like", this.LIZIZ, null);
        }
    }

    public C735360Ssw(String str) {
        super(str);
        this.LJJZZIII = Boolean.FALSE;
        this.LJLIIL = 1;
        this.LJLJJI = -1;
        this.LJLL = 0;
        this.LJLLL = -1;
        this.LJLLLL = 0;
        this.LJLZ = 0;
        this.LJZ = "";
        this.LJZI = "";
        this.LJZL = "";
        this.LL = "";
        this.LLD = "";
        this.LLF = 0;
        this.LLFF = "";
        this.LLFFF = 0;
        this.LLFII = -1;
        this.LLFZ = 0;
        this.LLI = 0;
        this.LLIFFJFJJ = 0;
        this.LLII = 0;
        this.LLIIII = "";
        this.LLIIIILZ = null;
        this.LLIIIJ = null;
        this.LLIIIL = null;
        this.LLIIIZ = null;
        this.LLIIJI = null;
        this.LLIIJLIL = false;
        this.LJI = true;
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        String strLJIJ;
        int followStatus;
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIIIJ = aweme.getAid();
            this.LJJLIIIJILLIZJL = AbstractC1386130mAt.LJIIJ(aweme);
            if (TextUtils.isEmpty(C735370Ssx.LJIJ(this.LJJLIIIJJIZ, aweme))) {
                strLJIJ = aweme.getRequestId();
            } else {
                strLJIJ = C735370Ssx.LJIJ(this.LJJLIIIJJIZ, aweme);
            }
            this.LJJLIIIJJI = strLJIJ;
            this.LJJLL = C735370Ssx.LJI(aweme);
            this.LJLIIIL = C735370Ssx.LJFF(aweme);
            this.LJLIL = AwemeExtKt.getRepostFromGroupId(aweme);
            this.LJLILLLLZI = AwemeExtKt.getRepostFromUserId(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJLJI = aweme.getMixInfo().mixId;
            }
            if (!C727520SgI.LJI(this.LJJJJZ)) {
                this.LJLL = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
            }
            this.LJLJJL = C10EU.LJIIJJI(aweme);
            this.LJLJJLL = C735370Ssx.LJIIIIZZ(aweme);
            this.LJLJL = C735370Ssx.LJII(aweme);
            this.LJLJLJ = C735370Ssx.LJIIJ(aweme);
            this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
            C727520SgI.LJFF(aweme);
            this.LJIJJLI = "";
            if (aweme.getAuthor() == null) {
                followStatus = -2;
            } else {
                followStatus = aweme.getAuthor().getFollowStatus();
            }
            this.LJLJLLL = followStatus;
            this.LJLLJ = AwemeBizExtKt.isHighlighted(aweme);
            this.LJLLL = AwemeBizExtKt.getOriginalPos(aweme);
            this.LLFFF = AwemeBizExtKt.getHasAd(aweme);
            this.LLIFFJFJJ = Integer.valueOf(AwemeBizExtKt.getBehindTheSongVideoType(aweme));
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
                this.LJLLLL = 1;
            }
            C1365450ldX.LIZLLL(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LJLZ = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LJLZ = 1;
            }
            if (aweme.isPinnedByArtist()) {
                this.LLFZ = 1;
            }
            if (aweme.getPickedUsers() != null && aweme.getPickedUsers().size() > 0) {
                this.LLI = 1;
            }
            if (aweme.getMusic() != null) {
                if (aweme.getMusic().isPgc()) {
                    this.LLII = 1;
                }
                if (aweme.getMusic().getMatchedSongInfo() != null) {
                    this.LLIIII = aweme.getMusic().getMatchedSongInfo().getId();
                }
                if (aweme.getMusic().getLogExtraMap() != null) {
                    this.LLIIJI = aweme.getMusic().getLogExtraMap();
                }
            }
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LLIIIILZ = c1387380mCuLIZLLL.LIZJ;
                this.LLIIIJ = c1387380mCuLIZLLL.LIZLLL;
            }
        }
    }
}
