package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.IStoryService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SR2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SR2 {
    public final Fragment LIZ;
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(417));

    public C0SR2(Fragment fragment) {
        this.LIZ = fragment;
    }

    public static String LJIIIIZZ(C2189821An6 c2189821An6) {
        String str;
        Map<String, String> extra = c2189821An6.getExtra();
        if (extra != null && (str = extra.get("previous_page")) != null && Intrinsics.LJFF(str, "chat_settings")) {
            return str;
        }
        String eventType = c2189821An6.getEventType();
        if (eventType == null) {
            return "";
        }
        return eventType;
    }

    public final boolean LJIIIZ(Aweme aweme) {
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL;
        boolean z;
        C0RJN c0rjnLIZIZ;
        IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
        if (iStoryService == null || (interfaceC438360HGwLJJLIIIJL = iStoryService.LJJLIIIJL()) == null) {
            return false;
        }
        boolean zLJJIIJZLJL = C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(this.LIZ);
        Fragment fragment = this.LIZ;
        if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && C1389300mG0.LJII(c0rjnLIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC438360HGwLJJLIIIJL.LIZ(aweme, zLJJIIJZLJL, z, false)) {
            return false;
        }
        return true;
    }

    public static AbstractC1386130mAt LIZ(AbstractC1386140mAu abstractC1386140mAu, C2189821An6 c2189821An6) {
        if (!C1360340lVI.LIZ(c2189821An6)) {
            return abstractC1386140mAu;
        }
        abstractC1386140mAu.LIZLLL(1, "is_detail_page");
        abstractC1386140mAu.LJ("friends_tab_version", "v3.0");
        return abstractC1386140mAu;
    }

    public static void LIZJ(AbstractC1386140mAu abstractC1386140mAu, C2189821An6 c2189821An6) {
        String str;
        Map<String, String> extra = c2189821An6.getExtra();
        if (extra != null && (str = extra.get("tab_name")) != null && str.length() != 0) {
            abstractC1386140mAu.LJ("tab_name", str);
        }
    }

    public static void LJI(Aweme aweme, String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" aid=");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(" isTikTokStory=");
        sbLIZ.append(aweme.getIsTikTokStory());
        sbLIZ.append(" hasShareToStoryMeta=");
        sbLIZ.append(C1609960rzu.LIZJ(aweme));
        sbLIZ.append(" story=");
        boolean z2 = true;
        int size = 0;
        if (aweme.getStory() != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" socialBlob=");
        if (aweme.getSocialInteractionBlob() == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" stickerCount=");
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            size = interactStickerStructs.size();
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJII(Aweme aweme, C2189821An6 c2189821An6) {
        if (aweme == null || c2189821An6 == null || this.LIZIZ <= 0) {
            return;
        }
        LJI(aweme, "onPausePlay(play_time)");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        this.LIZIZ = 0L;
        try {
            LJFF(aweme, c2189821An6, jCurrentTimeMillis).LJIILJJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(AbstractC1386140mAu abstractC1386140mAu, Aweme aweme, C2189821An6 c2189821An6) {
        String str;
        String str2;
        if (C729510SjV.LJIJI(aweme)) {
            if (C729510SjV.LJIJJ(aweme)) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            Map<String, String> extra = c2189821An6.getExtra();
            if (extra == null || (str2 = extra.get("is_centralized_avatar")) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386140mAu.LJ("story_reveal_status", str);
            abstractC1386140mAu.LJ("is_centralized_avatar", str2);
        }
    }

    public final AbstractC1386130mAt<?> LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        boolean z;
        String str2;
        String str3;
        String strLJIIIIZZ = LJIIIIZZ(c2189821An6);
        boolean zLJIIIZ = LJIIIZ(aweme);
        C1400330mXn c1400330mXn = C1400330mXn.LIZ;
        C1386190mAz c1386190mAz = new C1386190mAz();
        c1386190mAz.LJIJI(aweme);
        c1386190mAz.LIZLLL = strLJIIIIZZ;
        c1386190mAz.LJLIIIL = c2189821An6.getEnterMethodValue();
        c1386190mAz.LJJLL = c2189821An6.getPreviousPage();
        c1386190mAz.LJJJLZIJ = "story";
        C1365450ldX.LIZ(c1386190mAz, aweme);
        C1609930rzr.LJIJ(aweme, c1386190mAz);
        C1609930rzr.LJIIJJI(aweme, c1386190mAz);
        C1609930rzr.LJIIIIZZ(aweme, c1386190mAz);
        if (aweme != null && C453800Hqs.LIZIZ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1609930rzr.LIZ(c1386190mAz, "has_studio_sticker", str2);
        if (aweme != null && C453800Hqs.LIZ(aweme)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C1609930rzr.LIZ(c1386190mAz, "has_remix_button", str3);
        C1609930rzr.LIZIZ(aweme, c1386190mAz);
        C1609930rzr.LJIIJ(c1386190mAz, zLJIIIZ);
        String strLJIL = C1609930rzr.LJIL(c2189821An6);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c1386190mAz.LJFF("enter_position", strLJIL, c2082308Dt);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c1386190mAz.LJFF("aweme_id", aid, c2082308Dt);
        if (str == null) {
            str = "";
        }
        c1386190mAz.LJ("story_enter_method", str);
        c1386190mAz.LJFF("story_enter_first_feed_method", c2189821An6.getStoryEnterFirstFeedMethod(), c2082308Dt);
        c1386190mAz.LIZLLL(this.LIZJ, "story_start_num");
        c1386190mAz.LJFF("story_collection_id", C729510SjV.LJII(aweme), c2082308Dt);
        c1386190mAz.LIZLLL(this.LJ, "item_cnt");
        c1386190mAz.LIZLLL(this.LIZLLL, "story_current_num");
        c1386190mAz.LJFF("story_theme", C729510SjV.LJIIIIZZ(aweme), c2082308Dt);
        c1386190mAz.LIZLLL(C729510SjV.LJJIIZI(aweme) ? 1 : 0, "is_note");
        if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS")) {
            str4 = "1";
        }
        c1386190mAz.LJFF("is_highlight_immersive_flow", str4, c2082308Dt);
        C1609930rzr.LJI(c1386190mAz, c2189821An6);
        C1609930rzr.LJ(this.LIZ, c2189821An6.getFrom(), c1386190mAz);
        Fragment fragment = this.LIZ;
        c1400330mXn.getClass();
        C1400330mXn.LIZ(fragment, c1386190mAz);
        LIZJ(c1386190mAz, c2189821An6);
        LIZIZ(c1386190mAz, aweme, c2189821An6);
        LIZ(c1386190mAz, c2189821An6);
        return c1386190mAz;
    }

    public final AbstractC1386130mAt<?> LJ(Aweme aweme, C2189821An6 c2189821An6, String str) {
        int size;
        List<PhotoModeImageUrlModel> imageList;
        boolean zLJIIIZ = LJIIIZ(aweme);
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        int fansCount = 0;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            fansCount = author.getFansCount();
        }
        C1386170mAx c1386170mAx = new C1386170mAx();
        c1386170mAx.LJIJI(aweme);
        c1386170mAx.LIZLLL = c2189821An6.getEventType();
        c1386170mAx.LJJLIIIJL = c2189821An6.getEnterMethodValue();
        c1386170mAx.LJJLIL = c2189821An6.getPreviousPage();
        c1386170mAx.LJJJLZIJ = "story";
        C1365450ldX.LIZ(c1386170mAx, aweme);
        C1609930rzr.LJIJ(aweme, c1386170mAx);
        C1609930rzr.LJIIJJI(aweme, c1386170mAx);
        C1609930rzr.LJIIIIZZ(aweme, c1386170mAx);
        C1609930rzr.LIZIZ(aweme, c1386170mAx);
        C1609930rzr.LJIIJ(c1386170mAx, zLJIIIZ);
        String strLJIL = C1609930rzr.LJIL(c2189821An6);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c1386170mAx.LJFF("enter_position", strLJIL, c2082308Dt);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c1386170mAx.LJFF("aweme_id", aid, c2082308Dt);
        c1386170mAx.LIZLLL(size, "pic_cnt");
        c1386170mAx.LIZLLL(1, "pic_location");
        c1386170mAx.LIZLLL(fansCount, "fans");
        if (str == null) {
            str = "";
        }
        c1386170mAx.LJ("story_enter_method", str);
        c1386170mAx.LJFF("story_enter_first_feed_method", c2189821An6.getStoryEnterFirstFeedMethod(), c2082308Dt);
        c1386170mAx.LIZLLL(this.LIZJ, "story_start_num");
        c1386170mAx.LJFF("story_collection_id", C729510SjV.LJII(aweme), c2082308Dt);
        c1386170mAx.LIZLLL(this.LJ, "item_cnt");
        c1386170mAx.LIZLLL(this.LIZLLL, "story_current_num");
        c1386170mAx.LIZLLL(C729510SjV.LJJIIZI(aweme) ? 1 : 0, "is_note");
        LIZIZ(c1386170mAx, aweme, c2189821An6);
        LIZ(c1386170mAx, c2189821An6);
        return c1386170mAx;
    }

    public final AbstractC1386130mAt<?> LJFF(Aweme aweme, C2189821An6 c2189821An6, long j) {
        String str;
        String strLJIIIIZZ = LJIIIIZZ(c2189821An6);
        boolean zLJIIIZ = LJIIIZ(aweme);
        C1386180mAy c1386180mAy = new C1386180mAy();
        c1386180mAy.LJIJI(aweme);
        c1386180mAy.LJJLIIIJL = j;
        c1386180mAy.LJJLIIJ = aweme.getRequestId();
        c1386180mAy.LIZLLL = strLJIIIIZZ;
        c1386180mAy.LJJLIL = c2189821An6.getEnterMethodValue();
        c1386180mAy.LJJLJLI = c2189821An6.getPreviousPage();
        c1386180mAy.LJJJLZIJ = "story";
        C1365450ldX.LIZ(c1386180mAy, aweme);
        C1609930rzr.LJIJ(aweme, c1386180mAy);
        C1609930rzr.LJIIJJI(aweme, c1386180mAy);
        C1609930rzr.LJIIIIZZ(aweme, c1386180mAy);
        C1609930rzr.LIZIZ(aweme, c1386180mAy);
        C1609930rzr.LJIIJ(c1386180mAy, zLJIIIZ);
        C1609930rzr.LJIILIIL(c1386180mAy, aweme, c2189821An6.getEmojiDisplaySet().get(aweme.getAid()));
        String strLJIL = C1609930rzr.LJIL(c2189821An6);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c1386180mAy.LJFF("enter_position", strLJIL, c2082308Dt);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c1386180mAy.LJFF("aweme_id", aid, c2082308Dt);
        c1386180mAy.LJFF("story_enter_first_feed_method", c2189821An6.getStoryEnterFirstFeedMethod(), c2082308Dt);
        c1386180mAy.LIZLLL(this.LIZJ, "story_start_num");
        c1386180mAy.LJFF("story_collection_id", C729510SjV.LJII(aweme), c2082308Dt);
        c1386180mAy.LIZLLL(this.LJ, "item_cnt");
        c1386180mAy.LIZLLL(this.LIZLLL, "story_current_num");
        c1386180mAy.LIZLLL(C729510SjV.LJJIIZI(aweme) ? 1 : 0, "is_note");
        if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1386180mAy.LJFF("is_highlight_immersive_flow", str, c2082308Dt);
        LIZJ(c1386180mAy, c2189821An6);
        LIZIZ(c1386180mAy, aweme, c2189821An6);
        LIZ(c1386180mAy, c2189821An6);
        return c1386180mAy;
    }
}
