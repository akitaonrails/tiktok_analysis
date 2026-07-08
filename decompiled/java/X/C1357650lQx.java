package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0lQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357650lQx extends AbstractC1386140mAu<C1357650lQx> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public int LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public Aweme LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public String LJZI;
    public int LJZL;
    public String LL;
    public String LLD;
    public boolean LLF;
    public String LLFF;
    public String LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;
    public boolean LLIFFJFJJ;
    public int LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public Boolean LLIIIZ;
    public String LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public final String LLIIZ;
    public int LLIL;
    public final int LLILII;
    public int LLILIL;
    public String LLILL;
    public String LLILLIZIL;
    public Boolean LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;

    public C1357650lQx() {
        super("share_video");
        this.LJJZZIII = "normal_share";
        this.LLII = -1;
        this.LLIIII = "";
        this.LLIIIILZ = "";
        Boolean bool = Boolean.FALSE;
        this.LLIIIZ = bool;
        this.LLIIJLIL = "";
        this.LLIIL = "";
        this.LLIILII = CardStruct.IStatusCode.DEFAULT;
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = 0;
        this.LLILII = -1;
        this.LLILIL = 0;
        this.LLILL = "";
        this.LLILLIZIL = "";
        this.LLILLJJLI = bool;
        this.LLILLL = "";
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJJLIIIJ;
        InterfaceC1210900hcG interfaceC1210900hcG = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, interfaceC1210900hcG);
        LJFF("author_id", this.LJJLIIIJILLIZJL, interfaceC1210900hcG);
        String str2 = this.LJJLIIIJJI;
        InterfaceC1210900hcG interfaceC1210900hcG2 = InterfaceC1210900hcG.LIZ;
        LJFF("platform", str2, interfaceC1210900hcG2);
        LJFF("content_type", this.LJLJI, interfaceC1210900hcG2);
        LJFF("share_mode", null, interfaceC1210900hcG2);
        LJFF("reflow_flag", String.valueOf(this.LJLJJL), interfaceC1210900hcG2);
        LJFF("enter_method", this.LJJZZIII, interfaceC1210900hcG2);
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        String str3 = c650960Pg6LIZJ != null ? c650960Pg6LIZJ.searchVideoModel.groupId : "";
        if ("search_result".equals(this.LIZLLL) || "general_search".equals(this.LIZLLL)) {
            LJ("last_from_group_id", str3);
        }
        if ("homepage_hot".equals(this.LIZLLL)) {
            LIZLLL(this.LLIL, "has_ad");
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(C735370Ssx.LJIJJ(this.LJLLILLLL));
        }
        if (this.LJLJJI != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJLJJI);
            sbLIZ.append("");
            LJFF("is_long_item", C2188811AlT.LIZIZ(sbLIZ), interfaceC1210900hcG2);
        }
        String str4 = this.LJLIL;
        if (str4 != null) {
            LJ("tt_template_type", str4);
        }
        String str5 = this.LJLILLLLZI;
        if (str5 != null) {
            LJ("tt_template_id", str5);
        }
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJ)) {
            LJFF("previous_page", "push", interfaceC1210900hcG2);
        } else {
            LJFF("previous_page", this.LJLLLLLL, interfaceC1210900hcG2);
            LJFF("previous_page_position", this.LJLZ, interfaceC1210900hcG2);
        }
        if (this.LJZ) {
            LJFF("is_instructive", "1", interfaceC1210900hcG2);
            LJFF("bottom_bar_show", "1", interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            LJFF("share_url", this.LJLJJLL, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJLJL)) {
            LJFF("news_id", this.LJLJL, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            LJ("is_referral", this.LJLJLJ);
        }
        if (!TextUtils.isEmpty(this.LLILZIL)) {
            LJ("incentive_operation_type", this.LLILZIL);
        }
        LIZLLL(this.LJJLIIIJJIZ, "platform_flag");
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJ("now_type", this.LJJLIIIJL);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJLIIL);
        sbLIZ2.append("");
        LJFF("is_landscape_screen", C2188811AlT.LIZIZ(sbLIZ2), interfaceC1210900hcG2);
        if (!TextUtils.isEmpty(this.LJJLIIIJLJLI)) {
            LJ("og_type", this.LJJLIIIJLJLI);
        }
        LIZLLL(this.LJJLIIIJLLLLLLLZ, "is_today");
        LIZLLL(this.LJJLIIJ, "with_direct_link");
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJ("is_self", this.LJJLIL);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ("privacy_setting", this.LJJLJ);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJ("detail_tab_name", this.LJJLJLI);
        }
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJ("cover_template_id", this.LJJLL);
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJ("holiday_id", this.LJJZ);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJ("is_holiday_limit", this.LJJZZI);
        }
        if (!TextUtils.isEmpty(this.LJL)) {
            LJFF("panel_source", this.LJL, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJLI)) {
            LJFF("panel_source_v2", this.LJLI, interfaceC1210900hcG2);
        }
        Aweme aweme = this.LJJJJZ;
        if (aweme != null) {
            try {
                LJFF("item_type", String.valueOf(C621180OYa.LIZIZ.LJFF(aweme)), interfaceC1210900hcG2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            PaidContentInfo mPaidContentInfo = this.LJJJJZ.getMPaidContentInfo();
            if (mPaidContentInfo != null) {
                LJFF("series_category", String.valueOf(mPaidContentInfo.getCategory()), InterfaceC1210900hcG.LIZ);
            }
        }
        if (!TextUtils.isEmpty(this.LJLIIIL)) {
            LJFF("setting_platform_list_status", this.LJLIIIL, InterfaceC1210900hcG.LIZ);
        }
        LIZLLL(this.LJLL, "aweme_type");
        LIZLLL(this.LJLLI, "pic_cnt");
        if (!TextUtils.isEmpty(this.LJLLL)) {
            LJFF(this.LJLLL, this.LJLLLL, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJLLJ)) {
            LJFF("playlist_type", this.LJLLJ, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        InterfaceC1210900hcG interfaceC1210900hcG3 = InterfaceC1210900hcG.LIZ;
        LJFF("sector", null, interfaceC1210900hcG3);
        if (!TextUtils.isEmpty(this.LJZI)) {
            LJFF("impr_type", this.LJZI, interfaceC1210900hcG3);
        }
        String str6 = this.LIZLLL;
        if (str6 != null && str6.equals("creation_inspiration")) {
            LJ("creation_inspiration_category", this.LLILZ);
        }
        if (!TextUtils.isEmpty(this.LL)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LJZL);
            sbLIZ3.append("");
            LJFF("is_reposted", C2188811AlT.LIZIZ(sbLIZ3), interfaceC1210900hcG3);
            LJFF("repost_from_group_id", this.LL, interfaceC1210900hcG3);
            LJFF("repost_from_user_id", this.LLD, interfaceC1210900hcG3);
        }
        if ("self_profile_search_result_feed".equals(this.LIZLLL) || "other_profile_search_result_feed".equals(this.LIZLLL)) {
            LJ("item_position", this.LJJJJL);
            LJ("profile_search_id", this.LJJJJLI);
        }
        LJ("is_horizontal_screen", CardStruct.IStatusCode.DEFAULT);
        LJFF("request_id", C735370Ssx.LJIJJ(this.LJLLILLLL), InterfaceC1210900hcG.LIZIZ);
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (C735370Ssx.LJJIIZI(this.LIZLLL)) {
            LJ("relation_type", this.LLF ? "follow" : "unfollow");
            LJ("video_type", this.LLFF);
            LJ("rec_uid", this.LLFFF);
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            LJ("creation_id", this.LJII);
        }
        if (!TextUtils.isEmpty(this.LLFII)) {
            LJ("share_form", this.LLFII);
        }
        if (!TextUtils.isEmpty(this.LLFZ)) {
            LJ("tag_id", this.LLFZ);
        }
        if (!TextUtils.isEmpty(this.LLI)) {
            LJ("parent_tag_id", this.LLI);
        }
        if (!C727520SgI.LJFF(this.LJJJJZ)) {
            LJ("rec_type", C727520SgI.LIZJ(this.LJJJJZ));
            LJ("relation_type", C727520SgI.LIZ(this.LJJJJZ));
        }
        LIZLLL(this.LLIFFJFJJ ? 1 : 0, "is_highlighted");
        LIZLLL(this.LLII, "rank_index");
        LIZLLL(this.LLIIIL, "is_promoted");
        if (!TextUtils.isEmpty(this.LLIIII)) {
            LJ("playlist_id", this.LLIIII);
        }
        Aweme aweme2 = this.LJLLILLLL;
        if (aweme2 != null && aweme2.getMobParams() != null && !TextUtils.isEmpty(this.LJLLILLLL.getMobParams().get("playlist_session_id"))) {
            LJ("playlist_session_id", this.LJLLILLLL.getMobParams().get("playlist_session_id"));
        }
        if (!TextUtils.isEmpty(this.LLIIIILZ)) {
            LJ("category_name", this.LLIIIILZ);
        }
        LIZLLL(this.LLIIIJ, "is_long");
        if (!TextUtils.isEmpty(this.LLIIJLIL) && (TextUtils.equals(this.LLIIJLIL, "click_comment_chain") || TextUtils.equals(this.LLIIJLIL, "click_comment_bubble") || TextUtils.equals(this.LLIIJLIL, "push") || TextUtils.equals(this.LLIIJLIL, "web"))) {
            LJ("comment_enter_method", this.LLIIJLIL);
            LJ("last_group_id", this.LLIIL);
        } else if (!TextUtils.isEmpty(this.LLIIJLIL) && TextUtils.equals(this.LLIIJLIL, "notification_page")) {
            LJ("comment_enter_method", "notification");
            LJ("last_group_id", this.LLIIL);
        } else if (!TextUtils.isEmpty(this.LLIIJLIL) && TextUtils.equals(this.LLIIJLIL, "comment")) {
            LJ("comment_enter_method", "comment_panel");
            LJ("last_group_id", this.LLIIL);
        }
        if (this.LLIIIZ.booleanValue()) {
            LJ("story_type", "story");
        } else {
            LJ("story_type", "post");
        }
        if (this.LLILLJJLI.booleanValue()) {
            LJ("is_casting", "true");
            LJ("casting_session_id", this.LLILLL);
        } else {
            LJ("is_casting", "false");
        }
        Aweme aweme3 = this.LJJJJZ;
        if (aweme3 != null && aweme3.getMobParams() != null) {
            LIZIZ(this.LJJJJZ.getMobParams());
        }
        Aweme aweme4 = this.LJJJJZ;
        if (aweme4 != null) {
            C1380890m2R.LJ(aweme4, this);
        }
        if (!TextUtils.isEmpty(this.LLIIJI)) {
            LJ("story_collection_id", this.LLIIJI);
        }
        LJ("is_invite", this.LLIILII);
        if (!TextUtils.isEmpty(this.LLIILZL)) {
            LJ("follow_status", this.LLIILZL);
        }
        if (!this.LLIIZ.isEmpty()) {
            LJ("share_id", this.LLIIZ);
        }
        String str7 = C1357670lQz.LIZIZ;
        if (!TextUtils.isEmpty(str7)) {
            LJ("share_link_id", str7);
        }
        Aweme aweme5 = this.LJJJJZ;
        if (aweme5 != null) {
            LJ("is_ad", aweme5.isAd() ? "1" : CardStruct.IStatusCode.DEFAULT);
            LIZLLL(C1017070cZd.LJJIIJ(this.LJLLILLLL), "has_nova_like_effect");
            LIZLLL(AwemeExtKt.getPromoteAdTypeForReport(this.LJJJJZ), "promote_ad_type");
            LIZLLL(this.LJJJJZ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            if (this.LJJJJZ.getIsTikTokStory() && this.LJJJJZ.getAwemeType() == 152) {
                LJ("is_batch_sub", TextUtils.isEmpty(this.LJJJJZ.getBatchId()) ? CardStruct.IStatusCode.DEFAULT : "1");
            }
            if (this.LJJJJZ.getMusic() != null && this.LJJJJZ.getMusic().getIdStr() != null) {
                LJ("music_id", this.LJJJJZ.getMusic().getIdStr());
            }
        }
        ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIILLIIL(this.LJJJJZ, this);
        int i = this.LLILII;
        if (i != -1) {
            LIZLLL(i, "music_name");
        }
        String str8 = this.LJLJLLL;
        if (str8 != null) {
            LJ("enter_position", str8);
        }
        LIZLLL(this.LLILIL, "link_attached");
        if (!this.LLILL.isEmpty()) {
            LJ("external_sharer_uid", this.LLILL);
        }
        if (!this.LLILLIZIL.isEmpty()) {
            LJ("_oid", this.LLILLIZIL);
        }
        Aweme aweme6 = this.LJJJJZ;
        if (aweme6 != null) {
            for (Map.Entry entry : ((LinkedHashMap) C1375920luQ.LIZ(2, aweme6.getAid(), str7)).entrySet()) {
                String str9 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str9)) {
                    LJ((String) entry.getKey(), str9);
                }
            }
        }
        C1357670lQz.LIZIZ = "";
        C1365450ldX.LIZ(this, this.LJJJJZ);
        HashMap<String, String> map = new HashMap<>();
        C1606660rua.LIZIZ.LIZJ(this.LIZLLL, map, this.LJJJJZ, true);
        if (!map.isEmpty()) {
            LIZIZ(map);
        }
        Map<String, String> contentRecReasonParams = C529890KqJ.LIZ().getContentRecReasonParams(this.LJJJJZ, this.LIZLLL);
        if (contentRecReasonParams != null) {
            for (Map.Entry<String, String> entry2 : contentRecReasonParams.entrySet()) {
                LJ(entry2.getKey(), entry2.getValue());
            }
        }
        C1EE2.LIZIZ.LJJLIL(this.LJLLILLLL, this);
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJLLILLLL = aweme;
            this.LJJLIIIJ = aweme.getAid();
            this.LJJLIIIJILLIZJL = AbstractC1386130mAt.LJIIJ(aweme);
            this.LJLJI = C735370Ssx.LJFF(aweme);
            this.LJZI = C735370Ssx.LJI(aweme);
            this.LJZL = AwemeSaaSExtKt.isForwardAweme(aweme) ? 1 : 0;
            this.LL = AwemeExtKt.getRepostFromGroupId(aweme);
            this.LLD = AwemeExtKt.getRepostFromUserId(aweme);
            this.LLF = C10EU.LJIIJJI(aweme);
            this.LLFF = C735370Ssx.LJIIIIZZ(aweme);
            this.LLFFF = C735370Ssx.LJII(aweme);
            this.LLIFFJFJJ = AwemeBizExtKt.isHighlighted(aweme);
            this.LLII = AwemeBizExtKt.getOriginalPos(aweme);
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LJLIL = c1387380mCuLIZLLL.LIZJ;
                this.LJLILLLLZI = c1387380mCuLIZLLL.LIZLLL;
            }
            this.LLIL = AwemeBizExtKt.getHasAd(aweme);
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
                this.LLIIIL = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LLIIII = aweme.playlist_info.getMixId();
            }
            C1365450ldX.LIZLLL(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LLIIIJ = 2;
            } else {
                if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                    return;
                }
                this.LLIIIJ = 1;
            }
        }
    }
}
