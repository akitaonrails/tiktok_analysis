package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0St1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735410St1 extends AbstractC735380Ssy<C735410St1> {
    public Aweme LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public boolean LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public boolean LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public int LJLZ;
    public String LJZ;
    public String LJZI;
    public Boolean LJZL;
    public Integer LL;
    public Integer LLD;
    public int LLF;
    public String LLFF;
    public String LLFFF;
    public Map<String, String> LLFII;
    public int LLFZ;
    public int LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public String LLIIIL;
    public User LLIIIZ;
    public String LLIIJI;

    public C735410St1() {
        super("enter_personal_detail");
        this.LJLLLLLL = "";
        this.LL = 0;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = "";
        this.LLFFF = "";
        this.LLFII = null;
        this.LLFZ = -1;
        this.LLI = -1;
        this.LLIFFJFJJ = null;
        this.LLII = null;
        this.LLIIII = null;
        this.LLIIIILZ = -1;
        this.LLIIIJ = -1;
        this.LLIIIL = null;
        this.LLIIIZ = null;
        this.LLIIJI = null;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJJLIIIJLJLI;
        InterfaceC1210900hcG interfaceC1210900hcG = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, interfaceC1210900hcG);
        LJFF("author_id", this.LJJLIIIJLLLLLLLZ, interfaceC1210900hcG);
        LJFF("to_user_id", this.LJJLIIJ, interfaceC1210900hcG);
        LJFF("request_id", this.LJJLIL, interfaceC1210900hcG);
        LJFF("req_id", this.LJJLJ, interfaceC1210900hcG);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(0);
        sbLIZ.append("");
        LJ("is_reposted", C2188811AlT.LIZIZ(sbLIZ));
        LJ("repost_from_group_id", null);
        LJ("repost_from_user_id", null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(0);
        sbLIZ2.append("");
        LJ("is_original_author_homepage", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LJLJL);
        sbLIZ3.append("");
        LJ("relation_tag", C2188811AlT.LIZIZ(sbLIZ3));
        boolean z = this.LJLL;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        LJ("is_live_record", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        LIZLLL(this.LJLZ, "is_landscape_screen");
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJLJLI)) {
            LJFF("previous_page", "push", InterfaceC1210900hcG.LIZ);
        } else if (!TextUtils.isEmpty(this.LJJZZIII)) {
            String str3 = this.LJJZZIII;
            InterfaceC1210900hcG interfaceC1210900hcG2 = InterfaceC1210900hcG.LIZ;
            LJFF("previous_page", str3, interfaceC1210900hcG2);
            LJFF("previous_page_position", this.LJL, interfaceC1210900hcG2);
        }
        if (this.LJLI) {
            InterfaceC1210900hcG interfaceC1210900hcG3 = InterfaceC1210900hcG.LIZ;
            LJFF("is_instructive", "1", interfaceC1210900hcG3);
            LJFF("bottom_bar_show", "1", interfaceC1210900hcG3);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(this.LJJLIL);
        }
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJFF(this.LJJLL, this.LJJZ, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJFF("playlist_type", this.LJJLJLI, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LLIIIL)) {
            LJ("enter_position", this.LLIIIL);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJFF("scene_id", this.LJJZZI, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJLIIIL)) {
            LJFF("impr_type", this.LJLIIIL, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJLIIL)) {
            LJFF("compilation_id", this.LJLIIL, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("card_type", null, InterfaceC1210900hcG.LIZ);
        }
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (C735370Ssx.LJJIIZI(this.LIZLLL)) {
            LJ("relation_type", this.LJLIL ? "follow" : "unfollow");
            LJ("video_type", this.LJLILLLLZI);
            LJ("rec_uid", this.LJLJI);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("rec_user_type", null, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            LJ("follow_status", this.LJLJJLL);
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LJ("tab_name", this.LJIIZILJ);
        }
        if (this.LJLJLJ != 0) {
            LJ("is_avatar", "1");
        }
        String str4 = this.LLII;
        if (str4 != null) {
            LJ("tt_template_id", str4);
        }
        C1380890m2R.LJ(this.LJJLIIIJL, this);
        String str5 = this.LLIFFJFJJ;
        if (str5 != null) {
            LJ("tt_template_type", str5);
        }
        if (TextUtils.equals(this.LIZLLL, "general_search") || TextUtils.equals(this.LIZLLL, "search_result") || TextUtils.equals(this.LIZLLL, "trending_page") || C1ER1.LIZIZ.LLJJL(this.LIZLLL)) {
            if (TextUtils.isEmpty(this.LJLJLLL)) {
                LJ("user_tag", "");
            } else {
                LJ("user_tag", this.LJLJLLL);
            }
            if (!TextUtils.isEmpty(this.LJJIJLIJ)) {
                LJ("search_id", this.LJJIJLIJ);
            } else if (TextUtils.isEmpty(this.LJJIIJZLJL)) {
                LJ("search_id", this.LJJLIL);
            } else {
                LJ("search_id", this.LJJIIJZLJL);
            }
        }
        if (!C727520SgI.LJFF(this.LJJJJZ)) {
            LJ("rec_type", C727520SgI.LIZJ(this.LJJJJZ));
            LJ("relation_type", C727520SgI.LIZ(this.LJJJJZ));
        }
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LJ("last_from_group_id", this.LJLLLLLL);
        }
        LJI("is_highlighted", this.LJLLILLLL);
        LIZLLL(this.LJLLJ, "rank_index");
        LIZLLL(this.LJLLI, "is_promoted");
        LJ("category_name", this.LJLLL);
        String str6 = this.LJLLLL;
        if (str6 != null && !"".equals(str6)) {
            LJ("new_sug_session_id", this.LJLLLL);
        }
        Aweme aweme = this.LJJLIIIJL;
        if (aweme != null) {
            User user = this.LLIIIZ;
            if (user != null) {
                LIZLLL(user.getFollowStatusRelation(), "follow_status_relation");
            } else if (aweme.getAuthor() != null) {
                LIZLLL(this.LJJLIIIJL.getAuthor().getFollowStatusRelation(), "follow_status_relation");
            }
            LIZLLL(this.LJJLIIIJL.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJLIIIJL), "text_post_content");
            LIZLLL(C735370Ssx.LJIILL(this.LJJLIIIJL), "pic_cnt");
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            if (C735370Ssx.LJJIII(this.LJJJJZ)) {
                LJ("is_comment_to_post", "1");
            }
            LIZLLL(C735370Ssx.LIZ(this.LJJJJZ), "has_title");
            String str7 = this.LJLJJI;
            if (str7 != null && !str7.isEmpty()) {
                LJ("from_page", this.LJLJJI);
            }
            String str8 = this.LJLJJL;
            if (str8 != null && !str8.isEmpty()) {
                LJ("action_from_page", this.LJLJJL);
            }
            Map mobParams = this.LJJLIIIJL.getMobParams();
            if (mobParams != null) {
                LIZIZ(mobParams);
            }
            Map<String, Object> mapLIZIZ = EcommerceAnchorService.LIZJ().LIZIZ(this.LJJJJZ);
            if (mapLIZIZ != null) {
                for (Map.Entry<String, Object> entry : mapLIZIZ.entrySet()) {
                    LJ(entry.getKey(), entry.getValue().toString());
                }
            }
            HashMap<String, String> map = new HashMap<>();
            C1606660rua.LIZIZ.LIZJ(this.LIZLLL, map, this.LJJJJZ, false);
            if (!map.isEmpty()) {
                LIZIZ(map);
                LJ("is_cache", this.LLIIJI);
            }
            C1367960lha.LIZ.getClass();
            Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(this.LJJJJZ, C1367960lha.LIZ().LJLJL(this.LJJJJZ.getAid()));
            if (!mapLJIILJJIL.isEmpty()) {
                LIZIZ(mapLJIILJJIL);
            }
            LIZLLL(this.LL.intValue(), "artist_label");
            LIZLLL(this.LLD.intValue(), "bts_type");
            LIZLLL(this.LLF, "is_pgc");
            LJ("meta_song_id", this.LLFF);
            LJ("music_id", this.LLFFF);
            if ("self_profile_search_result_feed".equals(this.LIZLLL) || "other_profile_search_result_feed".equals(this.LIZLLL)) {
                LJ("item_position", this.LJJJJL);
                LJ("profile_search_id", this.LJJJJLI);
            }
            Map map2 = this.LLFII;
            if (map2 != null) {
                LIZIZ(map2);
            }
            String strLIZ = C1381730m3n.LIZ(this.LJJLIIIJL);
            if (strLIZ != null && !strLIZ.isEmpty()) {
                LJ("photo_content_type", strLIZ);
            }
            LIZLLL(this.LJJLIIIJL.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            if (this.LJJLIIIJL.getIsTikTokStory() && this.LJJLIIIJL.getAwemeType() == 152) {
                LJ("is_batch_sub", TextUtils.isEmpty(this.LJJLIIIJL.getBatchId()) ? CardStruct.IStatusCode.DEFAULT : "1");
            }
            C1366720lfa.LIZ(this.LJJLIIIJL, this);
            C1366720lfa.LIZIZ(this.LJJLIIIJL, this, this.LIZLLL, this.LJJLIIIJJIZ);
            C15WT.LIZIZ.LJIJJLI(this, this.LIZLLL, this.LJJLIIIJJIZ, this.LJJLIIIJL.getAid());
        }
        Boolean bool = this.LJZL;
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            }
            LJ("has_label", str2);
        }
        String str9 = this.LJIJJ;
        if (str9 != null) {
            LJ("rec_type", str9);
        }
        String str10 = this.LJZ;
        if (str10 != null) {
            LJ("position", str10);
        }
        String str11 = this.LJZI;
        if (str11 != null) {
            LJ("account_type", str11);
        }
        int i = this.LLFZ;
        if (i != -1) {
            LIZLLL(i, "unread_num");
        }
        int i2 = this.LLI;
        if (i2 != -1) {
            LIZLLL(i2, "is_unread_post_show");
        }
        C1365450ldX.LIZ(this, this.LJJLIIIJL);
        LJ("redistribute_reason", "homepage_hot".equals(this.LIZLLL) ? C1383360m6Q.LIZ(this.LJJJJZ) : "");
        Map<String, String> contentRecReasonParams = C529890KqJ.LIZ().getContentRecReasonParams(this.LJJLIIIJL, this.LIZLLL);
        if (contentRecReasonParams != null) {
            for (Map.Entry<String, String> entry2 : contentRecReasonParams.entrySet()) {
                LJ(entry2.getKey(), entry2.getValue());
            }
        }
        String str12 = this.LLIIII;
        if (str12 != null) {
            LJ("channel_id", str12);
            LIZLLL(this.LLIIIILZ, "is_author");
            if (this.LLIIIILZ == 0) {
                LIZLLL(this.LLIIIJ, "is_subscribed");
            }
        }
        LJ("profile_entrance_id", String.valueOf(System.currentTimeMillis()));
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIL = C735370Ssx.LJIJJ(aweme);
            LJJIZ(aweme);
        }
    }

    public final void LJJIZ(Aweme aweme) {
        int followStatus;
        boolean z;
        if (aweme != null) {
            this.LJJLIIIJL = aweme;
            this.LJJLIIIJLJLI = aweme.getAid();
            this.LJJLIIIJLLLLLLLZ = AbstractC1386130mAt.LJIIJ(aweme);
            this.LJJLIIJ = AwemeExtKt.getAuthorUid(aweme);
            if (aweme.getAuthor() != null) {
                followStatus = aweme.getAuthor().getFollowStatus();
            } else {
                followStatus = -2;
            }
            this.LJLJL = followStatus;
            this.LJLIIIL = C735370Ssx.LJI(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJLIIL = aweme.getMixInfo().mixId;
            }
            if (!C727520SgI.LJI(this.LJJJJZ)) {
                this.LJLJLJ = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
            }
            this.LJLIL = C10EU.LJIIJJI(aweme);
            this.LJLILLLLZI = C735370Ssx.LJIIIIZZ(aweme);
            this.LJLJI = C735370Ssx.LJII(aweme);
            this.LJLJJLL = C735370Ssx.LJIIJ(aweme);
            this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
            C727520SgI.LJFF(aweme);
            this.LJIJJLI = "";
            if (aweme.getAwemeType() == 63) {
                z = true;
            } else {
                z = false;
            }
            this.LJLL = z;
            this.LJLLILLLL = AwemeBizExtKt.isHighlighted(aweme);
            this.LJLLJ = AwemeBizExtKt.getOriginalPos(aweme);
            this.LLD = Integer.valueOf(AwemeBizExtKt.getBehindTheSongVideoType(aweme));
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
                this.LJLLI = 1;
            }
            C1365450ldX.LIZLLL(this, aweme.getAuthor());
            if (aweme.isPinnedByArtist()) {
                this.LL = 1;
            }
            if (aweme.getMusic() != null) {
                this.LLFFF = this.LJJJJZ.getMusic().getIdStr();
                if (aweme.getMusic().isPgc()) {
                    this.LLF = 1;
                }
                if (aweme.getMusic().getMatchedSongInfo() != null) {
                    this.LLFF = aweme.getMusic().getMatchedSongInfo().getId();
                }
                if (aweme.getMusic().getLogExtraMap() != null) {
                    this.LLFII = aweme.getMusic().getLogExtraMap();
                }
            }
            C735400St0 c735400St0LIZ = C1380820m2K.LIZ(aweme);
            this.LLIFFJFJJ = c735400St0LIZ.LIZ;
            this.LLII = c735400St0LIZ.LIZIZ;
        }
    }

    public final void LJJIJLIJ(int i, Aweme aweme) {
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIL = AbstractC1386130mAt.LJIIL(i, aweme);
            LJJIZ(aweme);
        }
    }
}
