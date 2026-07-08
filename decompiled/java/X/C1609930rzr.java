package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609930rzr {
    public static final String LJIJJLI(Integer num) {
        if (num != null && num.intValue() != 0) {
            return num.toString();
        }
        return null;
    }

    public static final String LJIL(C2189821An6 c2189821An6) {
        String str = c2189821An6.getExtra().get("enter_position");
        if (str == null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            String eventType = c2189821An6.getEventType();
            String from = c2189821An6.getFrom();
            c735840Sti.getClass();
            return C735840Sti.LJIIJ(null, eventType, from);
        }
        return str;
    }

    public static final String LJJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "avatar_gradient";
            }
            if (num.intValue() == 3) {
                return "image";
            }
            if (num.intValue() == 2) {
                return "general_gradient";
            }
            return "";
        }
        return "";
    }

    public static final String LJJIFFI(Aweme aweme) {
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (!C729510SjV.LJJIJIL(aweme)) {
            return "";
        }
        if (aweme.getMusic() != null) {
            Music music = aweme.getMusic();
            if (music != null && music.getMusicStatus() == 0) {
                return "no_music";
            }
            AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null && videoMuteInfo.isMute()) {
                return "no_music";
            }
            return "with_music";
        }
        return "no_music";
    }

    public static final String LJJII(AvatarComponentView avatarComponentView) {
        InterfaceC1606880ruw interfaceC1606880ruw;
        Map<EnumC1607270rvZ, InterfaceC1606880ruw> currentActiveBusiness;
        if (avatarComponentView != null && (currentActiveBusiness = avatarComponentView.getCurrentActiveBusiness()) != null) {
            interfaceC1606880ruw = currentActiveBusiness.get(EnumC1607270rvZ.STORY);
        } else {
            interfaceC1606880ruw = null;
        }
        if (interfaceC1606880ruw instanceof C1606850rut) {
            return "publish_failed";
        }
        if (interfaceC1606880ruw instanceof C1606840rus) {
            return "posting";
        }
        if (interfaceC1606880ruw instanceof C1606820ruq) {
            return "unread";
        }
        if (interfaceC1606880ruw instanceof C1606790run) {
            return "all_read";
        }
        return "none";
    }

    public static final void LIZIZ(Aweme aweme, Object obj) {
        if (aweme == null) {
            LIZ(obj, "is_share_to_story", CardStruct.IStatusCode.DEFAULT);
            return;
        }
        if (!C1609960rzu.LIZJ(aweme)) {
            LIZ(obj, "is_share_to_story", CardStruct.IStatusCode.DEFAULT);
            return;
        }
        try {
            LJIILL(aweme, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(obj, "is_share_to_story", CardStruct.IStatusCode.DEFAULT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static void LIZLLL(C2344009Gk c2344009Gk, VideoPublishEditModel videoPublishEditModel) {
        int i;
        String second;
        Pair<String, String> pairLIZ;
        IAVPublishService iAVPublishServicePublishService;
        c2344009Gk.LJFF("shoot_way", videoPublishEditModel.mShootWay);
        String pipelineEnterFrom = videoPublishEditModel.creativeModel.storyModel.getPipelineEnterFrom();
        if (pipelineEnterFrom == null) {
            pipelineEnterFrom = videoPublishEditModel.getEnterFrom();
        }
        c2344009Gk.LJFF("shoot_enter_from", pipelineEnterFrom);
        c2344009Gk.LJFF("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        ?? r2 = 1;
        if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null && iAVPublishServicePublishService.isAutoRetry()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_auto");
        if (videoPublishEditModel.getTtStoryUploadModel() == null) {
            r2 = 0;
        }
        c2344009Gk.LIZJ(r2, "is_story");
        InterfaceC1593660rZc interfaceC1593660rZcLJ = C1618440sDa.LIZIZ.LJJIFFI().LJ();
        if (interfaceC1593660rZcLJ != 0 && (pairLIZ = interfaceC1593660rZcLJ.LIZ(r2)) != null) {
            second = pairLIZ.getSecond();
        } else {
            second = null;
        }
        c2344009Gk.LJFF("landing_enter_from", second);
        c2344009Gk.LJFF("landing_method", "publish_rate_window");
    }

    public static final void LJFF(Object obj, Boolean bool) {
        String str;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(obj, "has_friends_tag", str);
    }

    public static final void LJI(Object obj, C2189821An6 c2189821An6) {
        Map<String, String> extra;
        String str;
        String str2;
        if (c2189821An6 != null && (extra = c2189821An6.getExtra()) != null && (str = extra.get("story_archive_v2_page_key")) != null) {
            if (Intrinsics.LJFF(str, "story_archive_v2_thought")) {
                str2 = "thought";
            } else if (Intrinsics.LJFF(str, "story_archive_v2_calendar")) {
                str2 = "calendar";
            } else {
                str2 = "story";
            }
            LIZ(obj, "from_story_archive_tab_name", str2);
        }
    }

    public static final void LJII(Integer num, Object obj) {
        if (num != null && num.intValue() != 0) {
            LIZ(obj, "has_festivals_custom", "1");
        }
    }

    public static final void LJIIIIZZ(Aweme aweme, Object obj) {
        if (!C729510SjV.LJJIIZI(aweme)) {
            return;
        }
        LIZ(obj, "has_gif", CardStruct.IStatusCode.DEFAULT);
    }

    public static final void LJIIIZ(Integer num, Object obj) {
        if (num != null && num.intValue() != 0) {
            LIZ(obj, "holiday_type", num.toString());
        }
    }

    public static final void LJIIJ(AbstractC1386140mAu abstractC1386140mAu, boolean z) {
        String str;
        if (C1E99.LIZJ() && !((Boolean) C1E99.LJFF.getValue()).booleanValue() && z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(abstractC1386140mAu, "if_show_quick_emojis", str);
    }

    public static final void LJIIJJI(Aweme aweme, Object obj) {
        if (!C729510SjV.LJJIIZI(aweme)) {
            return;
        }
        LIZ(obj, "is_note", "1");
    }

    public static final void LJIILJJIL(CreativeModel creativeModel, C0LAB c0lab) {
        boolean z = !creativeModel.stickerModel.secretRepliesStickerModel.isEmpty();
        boolean z2 = !creativeModel.stickerModel.secretRepliesResponseStickerModel.isEmpty();
        String str = CardStruct.IStatusCode.DEFAULT;
        String str2 = "1";
        if (!z && !z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (z) {
            str = "1";
        }
        c0lab.LJ("has_secret_reply_sticker", str2);
        c0lab.LJ("is_secret_reply_initiator", str);
    }

    public static final void LJIILL(Aweme aweme, Object obj) {
        long jLongValue;
        String strValueOf;
        int iIntValue;
        String str;
        List<InteractStickerStruct> interactStickerStructs;
        InteractStickerStruct next;
        VideoShareInfoStruct videoShareInfoStruct;
        Integer numValueOf;
        C1610050s03 c1610050s03;
        Integer num;
        C1609990rzx c1609990rzx;
        Long l;
        C1610010rzz c1610010rzzLIZ = C1609960rzu.LIZ(aweme);
        if (c1610010rzzLIZ != null && (c1609990rzx = c1610010rzzLIZ.et_info) != null && (l = c1609990rzx.mention_nums) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (jLongValue >= 0) {
            strValueOf = String.valueOf(jLongValue);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(obj, "mention_nums", strValueOf);
        C1610010rzz c1610010rzzLIZ2 = C1609960rzu.LIZ(aweme);
        if (c1610010rzzLIZ2 != null && (c1610050s03 = c1610010rzzLIZ2.biz_info) != null && (num = c1610050s03.share_type) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        LIZ(obj, "share_to_story_type", String.valueOf(iIntValue));
        LIZ(obj, "share_to_story_media_type", String.valueOf(C1609960rzu.LJFF(aweme)));
        LIZ(obj, "is_share_to_story", "1");
        if (C1609960rzu.LJ(aweme)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(obj, "is_own_video", str);
        if (C1609960rzu.LIZLLL(aweme)) {
            str2 = "1";
        }
        LIZ(obj, "is_mention", str2);
        if (C1609960rzu.LIZJ(aweme)) {
            int iLJFF = C1609960rzu.LJFF(aweme);
            if ((iLJFF != 1 && iLJFF != 3 && iLJFF != 4) || (interactStickerStructs = aweme.getInteractStickerStructs()) == null) {
                return;
            }
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getVideoShareInfoStruct() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = next;
            if (interactStickerStruct == null || (videoShareInfoStruct = interactStickerStruct.getVideoShareInfoStruct()) == null || (numValueOf = Integer.valueOf(videoShareInfoStruct.awemeType)) == null) {
                return;
            }
            LIZ(obj, "repost_aweme_type", String.valueOf(numValueOf.intValue()));
        }
    }

    public static final void LJIIZILJ(Aweme aweme, Object obj) {
        String str;
        Music music;
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (!C729510SjV.LJJIJIL(aweme)) {
            return;
        }
        if (aweme.getMusic() == null || (((music = aweme.getMusic()) != null && music.getMusicStatus() == 0) || ((statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null && videoMuteInfo.isMute()))) {
            str = "no_music";
        } else {
            str = "with_music";
        }
        LIZ(obj, "story_music_with_mute", str);
    }

    public static final void LJIJ(Aweme aweme, Object obj) {
        String str;
        String batchId;
        if (C710930Rud.LJII(aweme)) {
            if (aweme != null && (batchId = aweme.getBatchId()) != null && batchId.length() != 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ(obj, "is_batch_sub", str);
            C735840Sti.LIZ.getClass();
            LIZ(obj, "story_style_version", String.valueOf(C735840Sti.LJIJJ(aweme)));
        }
    }

    public static final void LJIJI(Aweme aweme, Object obj) {
        String str;
        StoryNoteInfo storyNoteInfo;
        if (!C729510SjV.LJJIIZI(aweme)) {
            return;
        }
        List<RichTextInfo> list = null;
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null) {
            str = storyNoteInfo.text;
        } else {
            str = null;
            if (aweme != null) {
            }
            LIZ(obj, "thought_text_type", LJJI(str, list));
        }
        StoryNoteInfo storyNoteInfo2 = aweme.storyNoteInfo;
        if (storyNoteInfo2 != null) {
            list = storyNoteInfo2.richText;
        }
        LIZ(obj, "thought_text_type", LJJI(str, list));
    }

    public static final String LJJI(String str, List<RichTextInfo> list) {
        if (list != null && !list.isEmpty()) {
            return "festivals_color";
        }
        if (str != null && C123100dR.LIZ(str)) {
            return "normal";
        }
        return "none";
    }

    public static final void LIZ(Object obj, String str, String str2) {
        Object objPut;
        try {
            if (obj instanceof AbstractC1386130mAt) {
                AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) obj;
                abstractC1386130mAt.getClass();
                abstractC1386130mAt.LJFF(str, str2, InterfaceC1210900hcG.LIZ);
                objPut = abstractC1386130mAt;
            } else if (obj instanceof C2241008qG) {
                C2241008qG c2241008qG = (C2241008qG) obj;
                c2241008qG.LIZ.put(str, str2);
                objPut = c2241008qG;
            } else if (obj instanceof C0LAB) {
                C0LAB c0lab = (C0LAB) obj;
                c0lab.LJ(str, str2);
                objPut = c0lab;
            } else if (obj instanceof C2344009Gk) {
                C2344009Gk c2344009Gk = (C2344009Gk) obj;
                c2344009Gk.getClass();
                c2344009Gk.LJIIIIZZ(str, str2);
                objPut = c2344009Gk;
            } else if (obj instanceof JSONObject) {
                objPut = ((JSONObject) obj).put(str, str2);
            } else {
                objPut = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objPut);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0LAB LIZJ(X.C0LAB r3, X.C729450SjP r4, java.lang.String r5) {
        /*
            if (r4 != 0) goto L3
            return r3
        L3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJ
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getScheduleId(r0)
        Lc:
            java.lang.String r0 = "creation_id"
            r3.LJ(r0, r2)
            java.lang.String r2 = "shoot_way"
            java.lang.String r0 = r4.LJIIIIZZ
            r3.LJ(r2, r0)
            java.lang.String r2 = "shoot_enter_from"
            java.lang.String r0 = r4.LJIIJ
            r3.LJ(r2, r0)
            java.lang.String r2 = "shoot_enter_method"
            java.lang.String r0 = r4.LJIIIZ
            r3.LJ(r2, r0)
            boolean r2 = r4.LJFF
            java.lang.String r0 = "is_auto"
            r3.LIZ(r2, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJ
            if (r0 == 0) goto L60
            boolean r0 = r0.getIsTikTokStory()
            r2 = 1
            if (r0 != r2) goto L60
        L38:
            java.lang.String r0 = "is_story"
            r3.LIZ(r2, r0)
            X.0sDa r0 = X.C1618440sDa.LIZIZ
            X.0rZb r0 = r0.LJJIFFI()
            X.0rZc r0 = r0.LJ()
            if (r0 == 0) goto L55
            kotlin.Pair r0 = r0.LIZ(r2)
            if (r0 == 0) goto L55
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r1 = (java.lang.String) r1
        L55:
            java.lang.String r0 = "landing_enter_from"
            r3.LJ(r0, r1)
            java.lang.String r0 = "landing_method"
            r3.LJ(r0, r5)
            return r3
        L60:
            r2 = 0
            goto L38
        L62:
            r2 = r1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1609930rzr.LIZJ(X.0LAB, X.0SjP, java.lang.String):X.0LAB");
    }

    public static final void LJ(Fragment fragment, String str, Object obj) {
        String strLJ;
        if (fragment == null || str == null) {
            return;
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.LJJIIJ().LJJIIJZLJL(fragment) && C13LQ.LJJIJIIJI(str, C0RMB.LJI) >= 0) {
            StoryMainTrackService storyMainTrackServiceLJJIJIIJI = c1618440sDa.LJJIJIIJI();
            if (storyMainTrackServiceLJJIJIIJI != null) {
                strLJ = storyMainTrackServiceLJJIJIIJI.LJ();
            } else {
                strLJ = null;
            }
            if (C123100dR.LIZ(strLJ)) {
                LIZ(obj, "last_seen_group_id", strLJ);
            }
        }
    }

    public static final void LJIIL(String str, Object obj, Boolean bool) {
        String str2;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && C123100dR.LIZ(str)) {
            LIZ(obj, "mention_under_text_user", str);
        }
        if (Intrinsics.LJFF(bool, bool2)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(obj, "is_mention", str2);
    }

    public static final void LJIILIIL(Object obj, Aweme aweme, List list) {
        User author;
        List list2;
        float size;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        if (C10EU.LJIILLIIL(author) || aweme == null || (list2 = aweme.quickReplyEmojis) == null) {
            list2 = C13BV.INSTANCE;
        }
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        LIZ(obj, "emoji_data", list2.toString());
        LIZ(obj, "emoji_display", list.toString());
        if (list2.isEmpty()) {
            size = 0.0f;
        } else {
            Set setLLIIJI = C13LP.LLIIJI(list2);
            int i = 0;
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (setLLIIJI.contains(it2.next()) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            size = i / list2.size();
        }
        LIZ(obj, "emoji_match_rate", String.valueOf(size));
    }

    public static final void LJIILLIIL(Aweme aweme, String str, Object obj) {
        StoryHighlightCollection storyHighlightCollection;
        String str2;
        String str3;
        StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection2 = null;
        if (storyHighlightInfo != null) {
            storyHighlightCollection = storyHighlightInfo.containerCollectionInfo;
            storyHighlightCollection2 = storyHighlightInfo.primaryCollectionInfo;
            if (storyHighlightCollection2 == null) {
                storyHighlightCollection2 = storyHighlightInfo.containerCollectionInfo;
            }
        } else {
            storyHighlightCollection = null;
        }
        String str4 = "1";
        if (storyHighlightCollection2 != null) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(obj, "is_add_story_highlight", str2);
        if (storyHighlightCollection2 == null || (str3 = storyHighlightCollection2.collectionId) == null) {
            str3 = "";
        }
        LIZ(obj, "story_highlight_id", str3);
        if (storyHighlightCollection == null || Intrinsics.LJFF(str, "top_cell")) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ(obj, "is_highlight_immersive_flow", str4);
    }

    public static final void LJIJJ(Object obj, boolean z, boolean z2) {
        int i;
        if (!z) {
            i = 0;
        } else if (!z2) {
            i = 1;
        } else {
            i = 2;
        }
        LIZ(obj, "user_avatar_status", String.valueOf(i));
    }
}
