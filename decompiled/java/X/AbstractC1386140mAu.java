package X;

import X.AbstractC1386140mAu;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1386140mAu<E extends AbstractC1386140mAu> extends AbstractC1386130mAt {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public Boolean LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public int LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public String LJJJI;
    public String LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public String LJJJJIZL;
    public String LJJJJJ;
    public String LJJJJJL;
    public String LJJJJL;
    public String LJJJJLI;
    public String LJJJJLL;
    public Aweme LJJJJZ;
    public String LJJJJZI;
    public String LJJJLIIL;
    public int LJJJLL;
    public String LJJJLZIJ;
    public String LJJJZ;
    public int LJJL;
    public int LJJLI;
    public String LJJLIIIIJ;

    public String LJJI() {
        return "";
    }

    @Override // X.AbstractC1386130mAt
    public void LJII() {
        List<AnchorCommonStruct> anchors;
        if ("homepage_country".equals(this.LIZLLL) && !TextUtils.isEmpty(this.LJIILLIIL)) {
            LJFF("country_name", this.LJIILLIIL, InterfaceC1210900hcG.LIZ);
        }
        if (("others_homepage".equals(this.LIZLLL) || "collection_video".equals(this.LIZLLL) || "personal_homepage".equals(this.LIZLLL) || "playlist".equals(this.LIZLLL)) && !TextUtils.isEmpty(this.LJIIZILJ)) {
            String str = this.LJIIZILJ;
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            LJFF("tab_name", str, c2082308Dt);
            LJFF("order", this.LJIJ, c2082308Dt);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        if (!TextUtils.isEmpty(this.LJ)) {
            if (TextUtils.equals(this.LIZLLL, "homepage_fresh_topic") || this.LJFF) {
                LJFF("topic_name", this.LJ, InterfaceC1210900hcG.LIZ);
            } else {
                LJFF("trending_topic", this.LJ, InterfaceC1210900hcG.LIZ);
            }
        }
        if ("discovery_category".equals(this.LIZLLL) && !TextUtils.isEmpty(this.LJIIZILJ)) {
            String str2 = this.LJIIZILJ;
            C2082308Dt c2082308Dt2 = InterfaceC1210900hcG.LIZ;
            LJFF("discovery_category", str2, c2082308Dt2);
            LJFF("order", this.LJIJ, c2082308Dt2);
        }
        String str3 = this.LIZLLL;
        C2082308Dt c2082308Dt3 = InterfaceC1210900hcG.LIZ;
        LJFF("enter_from", str3, c2082308Dt3);
        if (!TextUtils.isEmpty(this.LJJIIZI)) {
            LJ("is_from_trending_card", this.LJJIIZI);
        }
        if (!TextUtils.isEmpty(this.LJJIJ)) {
            LJ("trending_topic", this.LJJIJ);
        }
        if (!TextUtils.isEmpty(this.LJJIJIIJI)) {
            LJ("trending_topic_id", this.LJJIJIIJI);
        }
        int i = 0;
        LIZLLL(0, "is_long");
        String strValueOf = "1";
        LJ("is_background", C2214201BlK.LJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (TextUtils.equals(this.LIZLLL, "general_search") || TextUtils.equals(this.LIZLLL, "visual_search") || TextUtils.equals(this.LIZLLL, "smart_search") || TextUtils.equals(this.LIZLLL, "smart_search_title")) {
            LJ("video_tag", this.LJIIIZ);
        }
        if (LJJ()) {
            LJFF("rank", this.LJIIJ, c2082308Dt3);
            int i2 = this.LJIL;
            if (i2 != -1) {
                strValueOf = String.valueOf(i2);
            } else if (!C584460Mw8.LIZ) {
                strValueOf = CardStruct.IStatusCode.DEFAULT;
            }
            LJ("is_fullscreen", strValueOf);
            if (!TextUtils.isEmpty(this.LJJII)) {
                LJFF("search_result_id", this.LJJII, c2082308Dt3);
                if (this.LJIIL) {
                    if (!TextUtils.isEmpty(this.LJJIII)) {
                        LJFF("list_item_id", this.LJJIII, c2082308Dt3);
                    } else if (!TextUtils.isEmpty(LJJI())) {
                        LJFF("list_item_id", LJJI(), c2082308Dt3);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.LJJJIL)) {
                LJFF("end_to_end_search_session_id", this.LJJJIL, c2082308Dt3);
            }
            if (!TextUtils.isEmpty(null)) {
                LJFF("list_result_type", null, c2082308Dt3);
            }
            if (!TextUtils.isEmpty(null)) {
                LJFF("module", null, c2082308Dt3);
            }
            if (!TextUtils.isEmpty(this.LJJIIJ)) {
                String strLJJI = this.LJJIIJ;
                if (!TextUtils.isEmpty(LJJI())) {
                    strLJJI = LJJI();
                }
                LJFF("search_third_item_id", strLJJI, c2082308Dt3);
            }
            if (TextUtils.isEmpty(this.LJJIIJZLJL)) {
                LJ("impr_id", this.LJJIIZ);
            } else {
                LJ("impr_id", this.LJJIIJZLJL);
            }
        }
        if (!TextUtils.isEmpty(this.LJJIJLIJ)) {
            LJ("search_id", this.LJJIJLIJ);
        }
        if (!TextUtils.isEmpty(this.LJJIFFI)) {
            LJ("search_keyword", this.LJJIFFI);
        }
        if (!TextUtils.isEmpty(this.LJJI)) {
            LJ("search_type", this.LJJI);
        }
        if (!TextUtils.isEmpty(this.LJJ)) {
            LJ("is_search_scene", this.LJJ);
        }
        if (!TextUtils.isEmpty(this.LJJII)) {
            LJ("search_result_id", this.LJJII);
        }
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            LJ("rank", this.LJIIJ);
        }
        if (!TextUtils.isEmpty(this.LJIIJJI)) {
            LJ("search_rank", this.LJIIJJI);
        }
        if (!TextUtils.isEmpty(this.LJJIJL)) {
            LJ("item_rank", this.LJJIJL);
        }
        if (!TextUtils.isEmpty(this.LJJIJIIJIL)) {
            LJ("activity_keyword", this.LJJIJIIJIL);
        }
        if (!TextUtils.isEmpty(this.LJJIJIL)) {
            LJ("video_card_type", this.LJJIJIL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_tab_name", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_tab_rank", null);
        }
        if (!TextUtils.isEmpty(this.LJJJIL)) {
            LJ("end_to_end_search_session_id", this.LJJJIL);
        }
        if (!TextUtils.isEmpty(this.LJJJJ)) {
            LJ("enter_from", this.LJJJJ);
        }
        if (!TextUtils.isEmpty(this.LJJJJI)) {
            LJ("vs_entrance_type", this.LJJJJI);
        }
        if (!TextUtils.isEmpty(this.LJJJJIZL)) {
            LJ("vs_session_id", this.LJJJJIZL);
        }
        if (!TextUtils.isEmpty(this.LJJJJJ)) {
            LJ("result_id", this.LJJJJJ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("vs_group_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("news_id", null);
        }
        if (this.LJIJI.booleanValue()) {
            LJ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("is_pinned", null);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_hot") || TextUtils.equals(this.LIZLLL, "homepage_follow")) {
            if (!TextUtils.isEmpty(this.LJIJJ)) {
                LJFF("rec_type", this.LJIJJ, c2082308Dt3);
            }
            if (!TextUtils.isEmpty(this.LJIJJLI)) {
                LJFF("label_text", this.LJIJJLI, c2082308Dt3);
            }
        }
        int i3 = this.LJJJLL;
        if (i3 >= 0) {
            LIZLLL(i3, "follow_status");
        }
        if (!TextUtils.isEmpty(this.LJJJLZIJ) && !((HashMap) this.LIZIZ).containsKey("story_type")) {
            LJ("story_type", this.LJJJLZIJ);
        }
        if (!TextUtils.isEmpty(this.LJJJZ)) {
            LJ("story_collection_id", this.LJJJZ);
        }
        int i4 = this.LJJL;
        if (i4 >= 0) {
            LIZLLL(i4, "is_share_to_story");
        }
        LIZLLL(this.LJJLI, "is_story_to_normal");
        if (!TextUtils.isEmpty(this.LJJJJJL)) {
            LJ("play_mode", this.LJJJJJL);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIIJ)) {
            LJ("from_group_id", this.LJJLIIIIJ);
        }
        if (!TextUtils.isEmpty(this.LJJJJZI)) {
            LJ("collection_id", this.LJJJJZI);
        }
        if (!TextUtils.isEmpty(this.LJJJLIIL)) {
            LJ("collection_name", this.LJJJLIIL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("prop_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("effect_id", null);
        }
        Aweme aweme = this.LJJJJZ;
        if (aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (Intrinsics.LJFF(it2.next().getComponentKey(), "anchor_aigc_avatar")) {
                    i = 1;
                    break;
                }
            }
        }
        LIZLLL(i, "is_ai_avatar");
        Aweme aweme2 = this.LJJJJZ;
        if (aweme2 == null || !AwemeExtKt.isOfflineVideo(aweme2)) {
            return;
        }
        LIZLLL(1, "is_offline_video");
    }

    public final void LJIILLIIL() {
        Aweme aweme = this.LJJJJZ;
        if (aweme != null) {
            LJ("has_friends_tag", AwemeBizExtKt.getHasFriendsTag(aweme) ? "1" : CardStruct.IStatusCode.DEFAULT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013 A[PHI: r6
      0x0013: PHI (r6v1 com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection) = 
      (r6v0 com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection)
      (r6v3 com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection)
      (r6v3 com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection)
     binds: [B:29:0x0057, B:8:0x000d, B:10:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.LJJJJZ
            r6 = 0
            if (r1 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r0 = r1.storyHighlightInfo
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r6 = r0.containerCollectionInfo
        Lb:
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo r0 = r1.storyHighlightInfo
            if (r0 == 0) goto L13
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r2 = r0.primaryCollectionInfo
            if (r2 != 0) goto L14
        L13:
            r2 = r6
        L14:
            java.lang.String r5 = "1"
            java.lang.String r4 = "0"
            if (r2 != 0) goto L55
            r1 = r4
        L1b:
            java.lang.String r0 = "is_add_story_highlight"
            r7.LJ(r0, r1)
            java.lang.String r3 = ""
            if (r2 != 0) goto L52
            r1 = r3
        L25:
            java.lang.String r0 = "story_highlight_id"
            r7.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.LIZIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r2 = "is_highlight_immersive_flow"
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L51
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.LIZIZ
            java.lang.String r0 = "enter_position"
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L46
            java.lang.String r3 = r0.toString()
        L46:
            java.lang.String r0 = "top_cell"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L5a
            r7.LJ(r2, r4)
        L51:
            return
        L52:
            java.lang.String r1 = r2.collectionId
            goto L25
        L55:
            r1 = r5
            goto L1b
        L57:
            if (r1 == 0) goto L13
            goto Lb
        L5a:
            if (r6 != 0) goto L5d
            r5 = r4
        L5d:
            r7.LJ(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1386140mAu.LJIIZILJ():void");
    }

    public final void LJIJ() {
        Integer num;
        String str;
        Aweme aweme = this.LJJJJZ;
        if (aweme == null || aweme.getAwemeType() != 45) {
            return;
        }
        LJ("is_note", "1");
        StoryNoteInfo storyNoteInfo = this.LJJJJZ.storyNoteInfo;
        if (storyNoteInfo != null) {
            if (storyNoteInfo.subType != 0) {
                LJ("has_festivals_custom", "1");
                LJ("holiday_type", String.valueOf(storyNoteInfo.subType));
            }
            List<RichTextInfo> list = storyNoteInfo.richText;
            String str2 = storyNoteInfo.text;
            if (list != null && !list.isEmpty()) {
                LJ("thought_text_type", "festivals_color");
            } else if (str2 != null) {
                if (str2.isEmpty()) {
                    LJ("thought_text_type", "none");
                } else {
                    LJ("thought_text_type", "normal");
                }
            }
            BackgroundModel backgroundModel = storyNoteInfo.backGroundInfo;
            if (backgroundModel != null) {
                int i = backgroundModel.backgroundType;
                if (i == 1) {
                    str = "avatar_gradient";
                } else {
                    str = "";
                    if (i == 2) {
                        str = "general_gradient";
                    } else if (i == 3) {
                        str = "image";
                    }
                }
                LJ("thought_background_type", str);
                LJ("thought_bg_gecko_id", backgroundModel.backgroundGeckoId);
            }
            AvatarThoughtInfo avatarThoughtInfo = storyNoteInfo.avatarInfo;
            LJ("is_avatar_thought", ((avatarThoughtInfo == null || (num = avatarThoughtInfo.avatarType) == null) ? 0 : num.intValue()) != AvatarThoughtType.AVATARTYPE_AVATAR_THOUGHT.getValue() ? CardStruct.IStatusCode.DEFAULT : "1");
        }
    }

    public final boolean LJJ() {
        if (TextUtils.equals(this.LIZLLL, "general_search") || TextUtils.equals(this.LIZLLL, "search_result") || TextUtils.equals(this.LIZLLL, "search_ecommerce") || TextUtils.equals(this.LIZLLL, "search_music") || TextUtils.equals(this.LIZLLL, "visual_search") || TextUtils.equals(this.LIZLLL, "smart_search") || TextUtils.equals(this.LIZLLL, "smart_search_title") || (TextUtils.equals(this.LIZLLL, "others_homepage") && !TextUtils.isEmpty(this.LJJIJLIJ))) {
            return true;
        }
        if (!TextUtils.equals(this.LIZLLL, "single_song") || TextUtils.isEmpty(this.LJJIJLIJ)) {
            return TextUtils.equals(this.LIZLLL, "challenge") && !TextUtils.isEmpty(this.LJJIJLIJ);
        }
        return true;
    }

    public AbstractC1386140mAu(String str) {
        super(str);
        this.LJIJI = Boolean.FALSE;
        this.LJIL = -1;
        this.LJJJLL = -1;
        this.LJJJLZIJ = "";
        this.LJJJZ = "";
        this.LJJL = -1;
        this.LJJLI = -1;
        this.LJJLIIIIJ = "";
    }

    public void LJIJI(Aweme aweme) {
        String str;
        if (aweme != null) {
            if (aweme.getAuthor() != null) {
                this.LJIILLIIL = aweme.getAuthor().getRegion();
            }
            this.LJJIIZI = AwemeBizExtKt.isFromTrendingCard(aweme);
            this.LJJIJ = AwemeBizExtKt.getTrendingName(aweme);
            this.LJJIJIIJI = AwemeBizExtKt.getTrendingId(aweme);
            this.LJJJJZ = aweme;
            this.LJJLI = aweme.getIsStoryToNormal() ? 1 : 0;
            if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
                str = "post";
            } else {
                str = "story";
            }
            this.LJJJLZIJ = str;
            HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
            if (hotSearchInfo != null && hotSearchInfo.getSentence() != null) {
                this.LJ = hotSearchInfo.getSentence();
            } else {
                this.LJ = AwemeBizExtKt.getHotSpot(aweme);
            }
            HotListStruct hotListStruct = aweme.getHotListStruct();
            if (hotListStruct != null) {
                if (hotListStruct.getType() == 9) {
                    this.LJFF = true;
                }
                if (hotListStruct.getType() == 9 && TextUtils.isEmpty(this.LJ)) {
                    this.LJ = hotListStruct.getTitile();
                }
            }
        }
        LJIIIZ(aweme);
    }

    public final void LJIJJ(String str) {
        this.LJJJJZI = str;
    }

    public final void LJIJJLI(String str) {
        this.LJJJLIIL = str;
    }

    public final void LJIL(String str) {
        this.LJJLIIIIJ = str;
    }

    public final void LJJIFFI(String str) {
        this.LJJIIJZLJL = str;
    }

    public final void LJJII(Map map) {
        if (map != null && !map.isEmpty()) {
            if (!TextUtils.isEmpty((CharSequence) map.get("search_id"))) {
                this.LJJIJLIJ = (String) map.get("search_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_keyword"))) {
                this.LJJIFFI = (String) map.get("search_keyword");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_result_id"))) {
                this.LJJII = (String) map.get("search_result_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("is_search_scene"))) {
                this.LJJ = (String) map.get("is_search_scene");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_type"))) {
                this.LJJI = (String) map.get("search_type");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("rank"))) {
                this.LJIIJ = (String) map.get("rank");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_rank"))) {
                this.LJIIJJI = (String) map.get("search_rank");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_third_item_id"))) {
                this.LJJIIJ = (String) map.get("search_third_item_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("list_item_id"))) {
                this.LJJIII = (String) map.get("list_item_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("activity_keyword"))) {
                this.LJJIJIIJIL = (String) map.get("activity_keyword");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("video_card_type"))) {
                this.LJJIJIL = (String) map.get("video_card_type");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("item_rank"))) {
                this.LJJIJL = (String) map.get("item_rank");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("inspiration_keyword"))) {
                this.LJJIZ = (String) map.get("inspiration_keyword");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("inspiration_result_id"))) {
                this.LJJIL = (String) map.get("inspiration_result_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("inspiration_session_id"))) {
                this.LJJJ = (String) map.get("inspiration_session_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("page_tab"))) {
                this.LJJJI = (String) map.get("page_tab");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("end_to_end_search_session_id"))) {
                this.LJJJIL = (String) map.get("end_to_end_search_session_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("token_type"))) {
                LJ("token_type", (String) map.get("token_type"));
            }
        }
    }

    public final void LJJIII(String str) {
        this.LJIJ = str;
    }

    public final void LJJIIJ(String str) {
        this.LJJJJJL = str;
    }

    public final void LJJIIJZLJL(String str) {
        this.LJJIJLIJ = str;
    }

    public final void LJJIIZ(String str) {
        this.LJJII = str;
    }

    public final void LJJIIZI(Boolean bool) {
        this.LJIJI = bool;
    }

    public final void LJJIJ(String str) {
        this.LJJJJL = str;
    }

    public final void LJJIJIIJI(String str) {
        this.LJJJJLI = str;
    }

    public final void LJJIJIIJIL(String str) {
        this.LJIIZILJ = str;
    }
}
