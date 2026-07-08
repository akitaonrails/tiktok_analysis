package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import com.ss.android.ugc.aweme.story.model.RevealStoryPromoCardInfo;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729510SjV {
    public static final boolean LIZ(Aweme aweme) {
        if (!C1618440sDa.LIZIZ.LIZ() || !LJJIJIL(aweme)) {
            return true;
        }
        if (!C729980SkG.LJIIIIZZ(aweme) && !LJIJ(aweme) && !C10IT.LJIIJJI(aweme)) {
            return true;
        }
        return false;
    }

    public static final Aweme LIZIZ(Aweme aweme) {
        if (!LJJIJIL(aweme) || aweme.getUserStory() != null) {
            return aweme;
        }
        Aweme awemeM199clone = aweme.m199clone();
        if (C1601110rld.LIZ()) {
            awemeM199clone.setAid(AwemeExtKt.getAuthorUid(aweme));
        }
        awemeM199clone.setStory(null);
        boolean z = false;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme));
        Story story = aweme.getStory();
        if (story != null) {
            z = story.viewed;
        }
        UserStory userStory = new UserStory(listLJIILJJIL, 1L, 0L, z, 0L, 0L, false, false, aweme.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT), !C1601110rld.LIZ(), null, null, false, null, 1L, new UserStoryCurrentInfo(null, null, 0), false, true, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false);
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin total count: ");
        sbLIZ.append(userStory.getOriginTotalCount());
        sbLIZ.append(", user story instance: ");
        sbLIZ.append(System.identityHashCode(userStory));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("huangxin.2020", strLIZIZ);
        awemeM199clone.setUserStory(userStory);
        awemeM199clone.setAwemeType(40);
        awemeM199clone.setAuthor(aweme.getAuthor());
        awemeM199clone.setRequestId(aweme.getRequestId());
        awemeM199clone.setIsTikTokStory(true);
        return awemeM199clone;
    }

    public static final String LJ(String str) {
        long j = 86400000;
        long jCurrentTimeMillis = ((System.currentTimeMillis() / j) * j) - ((long) TimeZone.getDefault().getRawOffset());
        String strValueOf = String.valueOf(jCurrentTimeMillis - j);
        String strValueOf2 = String.valueOf(jCurrentTimeMillis + j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(strValueOf);
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Aweme LJFF(Aweme aweme) {
        UserStory userStory;
        if (LJJIIZ(aweme)) {
            if (aweme != null && (userStory = aweme.getUserStory()) != null) {
                if (UserStoryKt.currentStory(userStory) != null) {
                    return UserStoryKt.currentStory(userStory);
                }
                if (userStory.getStories().size() > 0) {
                    return (Aweme) ListProtector.get(userStory.getStories(), 0);
                }
            }
            return null;
        }
        if (!LJJ(aweme)) {
            return null;
        }
        return aweme;
    }

    public static final Aweme LJI(Aweme aweme) {
        UserStory userStory;
        if (!LJJIIZ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.isPostStyle()) {
            return null;
        }
        return (Aweme) C13LP.LJJJLL(userStory.getStories());
    }

    public static final String LJII(Aweme aweme) {
        if (!LJJIJIL(aweme)) {
            return "";
        }
        return LJ(LJIIIZ(aweme));
    }

    public static final String LJIIIIZZ(Aweme aweme) {
        CelebrationMetaData celebrationMetaData;
        Integer num;
        String strLIZ;
        if (aweme == null || aweme.getCelebrationMetaData() == null || (celebrationMetaData = aweme.getCelebrationMetaData()) == null || (num = celebrationMetaData.celebrationType) == null || (strLIZ = C0MLA.LIZ(num)) == null) {
            return "";
        }
        return strLIZ;
    }

    public static final String LJIIIZ(Aweme aweme) {
        String authorUid;
        if (C123100dR.LIZ(AwemeExtKt.getAuthorUid(aweme))) {
            String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            if (authorUid2 == null) {
                return "";
            }
            return authorUid2;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null || userStory.getStories().size() <= 0 || (authorUid = AwemeExtKt.getAuthorUid((Aweme) ListProtector.get(userStory.getStories(), 0))) == null) {
            return "";
        }
        return authorUid;
    }

    public static final int LJIIJ(Aweme aweme) {
        UserStory userStory;
        String uid;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return 0;
        }
        int originTotalCount = (int) userStory.getOriginTotalCount();
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (LJIILJJIL(uid)) {
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            return (originTotalCount + c1618440sDa.LJJIFFI().LJIILL().size()) - c1618440sDa.LJJIFFI().LJIILJJIL(userStory);
        }
        return originTotalCount;
    }

    public static final boolean LJIIL(Aweme aweme) {
        Aweme awemeLJFF;
        if (LJJ(aweme)) {
            if (aweme != null && aweme.storyHighlightInfo != null) {
                return true;
            }
            return false;
        }
        if (LJJIIZ(aweme) && (awemeLJFF = LJFF(aweme)) != null && awemeLJFF.storyHighlightInfo != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory() || aweme.getAwemeType() != 190) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(String str) {
        return TextUtils.equals(str, C0XQ7.LJFF().getCurUser().getUid());
    }

    public static final boolean LJIILL(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(Integer num) {
        if (num != null && num.intValue() == 15) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIZILJ(Aweme aweme) {
        EnumC696090RSd enumC696090RSd;
        if (AwemeBizExtKt.getScheduleId(aweme) == null) {
            return false;
        }
        InterfaceC1593650rZb interfaceC1593650rZbLJJIFFI = C1618440sDa.LIZIZ.LJJIFFI();
        String scheduleId = AwemeBizExtKt.getScheduleId(aweme);
        if (scheduleId != null) {
            C729450SjP c729450SjPLIZLLL = interfaceC1593650rZbLJJIFFI.LIZLLL(scheduleId);
            if (c729450SjPLIZLLL != null) {
                enumC696090RSd = c729450SjPLIZLLL.LIZIZ;
            } else {
                enumC696090RSd = null;
            }
            if (enumC696090RSd != EnumC696090RSd.FAILED) {
                return false;
            }
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final boolean LJIJ(Aweme aweme) {
        Story story;
        if (!LJJ(aweme) || aweme == null || (story = aweme.getStory()) == null || !story.isPublishing()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(Aweme aweme) {
        if (aweme.getAwemeType() == 46) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJ(Aweme aweme) {
        C1517550par c1517550par;
        IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
        if (iStoryRevealService != null && iStoryRevealService.LJ()) {
            return true;
        }
        C1C1T c1c1t = C2203191BKr.LIZ(aweme).socialBlob;
        if (c1c1t != null && (c1517550par = c1c1t.reveal_story_blob) != null && Intrinsics.LJFF(c1517550par.is_unlocked, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(Aweme aweme) {
        if (aweme == null || !LJJIJIL(aweme) || aweme.getShare2StoryStruct() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory()) {
            return false;
        }
        if (aweme.getAwemeType() != 180 && aweme.getAwemeType() != 181) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(Aweme aweme) {
        if (LJJIJIL(aweme) && aweme != null && aweme.getStory() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJI(Aweme aweme) {
        Aweme awemeLJFF;
        Story story;
        Story story2;
        if (LJJ(aweme)) {
            if (aweme == null || (story2 = aweme.getStory()) == null) {
                return false;
            }
            return StoryKt.isExpired(story2);
        }
        if (!LJJIIZ(aweme) || (awemeLJFF = LJFF(aweme)) == null || (story = awemeLJFF.getStory()) == null) {
            return false;
        }
        return StoryKt.isExpired(story);
    }

    public static final boolean LJJIFFI(Aweme aweme) {
        UserStory userStory;
        if (aweme == null || !LJJIIZ(aweme) || (userStory = aweme.getUserStory()) == null || !userStory.isStoryGuideCard()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJII(Aweme aweme) {
        String uid;
        User author;
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            uid = author2.getUid();
        } else {
            uid = null;
        }
        if (!LJIILJJIL(uid) || !(!C1618440sDa.LIZIZ.LJJIFFI().LJIIIZ().isEmpty())) {
            if (userStory.getTotalCount() < 1) {
                return true;
            }
            List<Aweme> stories = userStory.getStories();
            if (((stories == null || stories.isEmpty()) && !userStory.getHasMoreBefore() && !userStory.getHasMoreAfter()) || (author = aweme.getAuthor()) == null || author.isBlock || author.isBlocked()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        if (LJJIJIL(aweme) && aweme != null && aweme.getUserStory() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory() || aweme.getAwemeType() != 45) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory() || aweme.getAwemeType() != 180) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJI(Aweme aweme) {
        RevealStoryPromoCardInfo revealStoryPromoCardInfo = aweme.getRevealStoryPromoCardInfo();
        if (revealStoryPromoCardInfo != null) {
            return Intrinsics.LJFF(revealStoryPromoCardInfo.isStoryRevealPromoCard(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJIJIIJIL(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        if (aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || stories.size() != 1 || (aweme2 = (Aweme) C13LP.LJJJLL(stories)) == null) {
            return false;
        }
        return LJJIJIIJI(aweme2);
    }

    public static final boolean LJJIJIL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
            return false;
        }
        return true;
    }

    public static final void LJJJ(EnumC729530SjX enumC729530SjX) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(enumC729530SjX.getId(), "reason");
        C20684815ws.LJIILLIIL("share_to_story_entrance_not_showing", c2344009Gk.LIZ);
    }

    public static final boolean LJJJI(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory()) {
            return false;
        }
        C01GW c01gw = C287120BNe.LIZ;
        if (!C287120BNe.LIZJ) {
            return false;
        }
        if (aweme.getContentOriginalType() == 1 && Intrinsics.LJFF(aweme.getContentType(), "video")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(Aweme aweme) {
        ILiveOuterService iLiveOuterService;
        C0K77 c0k77C3;
        if (aweme == null) {
            return false;
        }
        if (!C710930Rud.LJIIIIZZ(aweme) && !LJJIIZI(aweme) && (!((Boolean) C0AWU.LIZ.getValue()).booleanValue() || !aweme.getIsTikTokStory() || (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null || (c0k77C3 = iLiveOuterService.C3()) == null || !c0k77C3.LJIJJ(aweme))) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJIZL(PublishModel publishModel) {
        PublishFailureReason publishFailureReason;
        if (publishModel != null && publishModel.LIZJ()) {
            String str = null;
            if (publishModel.LIZJ() && (publishFailureReason = publishModel.LIZLLL) != null) {
                str = publishFailureReason.scene;
            }
            if (Intrinsics.LJFF(str, "AVATAR")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJJJJL(PublishModel publishModel) {
        String shootEnterMethod;
        boolean z;
        boolean z2;
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModelKt videoPublishEditModelKt;
        if (publishModel == null || !publishModel.isStoryPublish) {
            return false;
        }
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) == null || (shootEnterMethod = videoPublishEditModelKt.getShootEnterMethod()) == null) {
            shootEnterMethod = "";
        }
        if (!Intrinsics.LJFF(shootEnterMethod, "inbox_top_cell") && !Intrinsics.LJFF(shootEnterMethod, "click_head_plus") && !Intrinsics.LJFF(shootEnterMethod, "click_profile_photo")) {
            z = false;
        } else {
            z = true;
        }
        BaseShortVideoContext baseShortVideoContext2 = publishModel.editModel;
        if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null && C1428470nHB.LLF(videoPublishEditModel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || LJJJJIZL(publishModel) || publishModel.retryType != EnumC1405170mfb.NOT_RETRY || z2) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJLI(String str) {
        if (str == null || C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, str) != 1) {
            return false;
        }
        return true;
    }

    public static final String LIZJ(Aweme aweme, String str) {
        boolean z;
        if (aweme == null) {
            return "";
        }
        boolean zLJJIL = LJJIL(aweme, str);
        if (!LJJIJLIJ(aweme, str) && !LJJIJL(aweme, str) && !AwemeExtKt.getIsUserInVideoMention(aweme)) {
            z = false;
        } else {
            z = true;
        }
        if (zLJJIL) {
            if (z) {
                return "mentioned_tagged_video";
            }
            return "tagged_video";
        }
        if (!z) {
            return "";
        }
        return "mentioned_video";
    }

    public static final void LIZLLL(Aweme aweme, Function1<? super Aweme, Unit> function1) {
        if (LJJIJIL(aweme) && aweme != null) {
            if (!AwemeExtKt.isSharedStoryVisible(aweme) || AwemeExtKt.isCommentPostInvisible(aweme)) {
                function1.invoke(aweme);
            }
        }
    }

    public static final boolean LJIIJJI(UserStory userStory, boolean z) {
        List<Aweme> listLJIILL;
        if (userStory.getStories().size() == 0 && !userStory.getHasMoreAfter() && !userStory.getHasMoreBefore()) {
            InterfaceC1593650rZb interfaceC1593650rZbLJJIFFI = C1618440sDa.LIZIZ.LJJIFFI();
            if (z) {
                listLJIILL = interfaceC1593650rZbLJJIFFI.LJIIIZ();
            } else {
                listLJIILL = interfaceC1593650rZbLJJIFFI.LJIILL();
            }
            if (listLJIILL.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIJL(Aweme aweme, String str) {
        if (aweme.getInteractStickerStructs() == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
            if (interactStickerStruct.getMentionInfo() != null && Intrinsics.LJFF(interactStickerStruct.getMentionInfo().getUserId(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJLIJ(Aweme aweme, String str) {
        if (aweme != null && aweme.getTextExtra() != null) {
            Iterator<TextExtraStruct> it2 = aweme.getTextExtra().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getUserId(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJIL(Aweme aweme, String str) {
        List<InteractionTagUserInfo> list;
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null && (list = interactionTagInfo.taggedUsers) != null) {
            Iterator<InteractionTagUserInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().uid, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJIZ(Aweme aweme, String str) {
        boolean z;
        boolean zLJJIL = LJJIL(aweme, str);
        if (!LJJIJLIJ(aweme, str) && !LJJIJL(aweme, str)) {
            z = false;
        } else {
            z = true;
        }
        boolean isUserInVideoMention = AwemeExtKt.getIsUserInVideoMention(aweme);
        if (!zLJJIL && !z && !isUserInVideoMention) {
            return false;
        }
        return true;
    }

    public static final void LJJJJ(String str, List list) {
        if (C1601110rld.LIZ() && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (LJJIIZ(aweme)) {
                    C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZIZ(aweme, str, true);
                }
            }
        }
    }

    public static final boolean LJJJJL(Aweme aweme, String str) {
        if (aweme == null) {
            LJJJ(EnumC729530SjX.AWEME_NULL);
            return false;
        }
        if (str == null) {
            LJJJ(EnumC729530SjX.USER_ID_NULL);
            return false;
        }
        if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), str)) {
            LJJJ(EnumC729530SjX.USER_IS_OWNER);
            return false;
        }
        if (aweme.isAd()) {
            LJJJ(EnumC729530SjX.VIDEO_IS_AD);
            return false;
        }
        if (!AwemeExtKt.isPublic(aweme)) {
            LJJJ(EnumC729530SjX.VIDEO_IS_PRIVATE);
            return false;
        }
        if (AwemeExtKt.canShare(aweme) && !AwemeExtKt.isDelete(aweme) && AwemeExtKt.isSharedStoryVisible(aweme)) {
            if (!AwemeExtKt.isDelete(aweme) && AwemeExtKt.isSharedStoryVisible(aweme)) {
                if (!AwemeExtKt.isSharedStoryVisible(aweme)) {
                    LJJJ(EnumC729530SjX.VIDEO_SHARED_STORY_NOT_VISIBLE);
                    return false;
                }
                if (!C1618440sDa.LIZIZ.LJIJJLI().LJIJI(aweme, true)) {
                    return false;
                }
                if (LJJIZ(aweme, str)) {
                    return true;
                }
                LJJJ(EnumC729530SjX.USER_NOT_TAGGED_OR_MENTIONED);
                return false;
            }
            LJJJ(EnumC729530SjX.VIDEO_STATUS_IS_DELETED);
            return false;
        }
        LJJJ(EnumC729530SjX.USER_CANT_SHARE_TO_STORY);
        return false;
    }

    public static final boolean LJJIII(Aweme aweme, String str, boolean z) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        if (!z || !LJJIFFI(aweme) || !Intrinsics.LJFF("homepage_hot", str) || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) C13LP.LJJJLL(stories)) == null || !C710930Rud.LJIIIIZZ(aweme2)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(Aweme aweme, String str, boolean z) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        UserStory userStory2;
        List<Aweme> stories2;
        Aweme aweme3;
        if (!z || !LJJIFFI(aweme) || !Intrinsics.LJFF("homepage_hot", str) || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) C13LP.LJJJLL(stories)) == null || C710930Rud.LJIIIIZZ(aweme2) || (userStory2 = aweme.getUserStory()) == null || (stories2 = userStory2.getStories()) == null || (aweme3 = (Aweme) C13LP.LJJJLL(stories2)) == null || !LJJIIZI(aweme3)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJZLJL(Aweme aweme, String str, boolean z) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        UserStory userStory2;
        List<Aweme> stories2;
        Aweme aweme3;
        if (!z || !LJJIFFI(aweme) || !Intrinsics.LJFF("homepage_hot", str) || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) C13LP.LJJJLL(stories)) == null || C710930Rud.LJIIIIZZ(aweme2) || (userStory2 = aweme.getUserStory()) == null || (stories2 = userStory2.getStories()) == null || (aweme3 = (Aweme) C13LP.LJJJLL(stories2)) == null || LJJIIZI(aweme3)) {
            return false;
        }
        return true;
    }

    public static final void LJJJJI(List<? extends Aweme> list, List<SkylightStoryUser> list2, boolean z) {
        List<Aweme> stories;
        Aweme aweme;
        String authorUid;
        UserStory userStory;
        UserStory userStory2;
        List<Aweme> stories2;
        Aweme next;
        User author;
        UserStory userStory3;
        List<Aweme> stories3;
        if (list != null) {
            for (Aweme aweme2 : list) {
                int i = 0;
                List<String> list3 = null;
                if (z && (userStory2 = aweme2.getUserStory()) != null && (stories2 = userStory2.getStories()) != null) {
                    Iterator<Aweme> it2 = stories2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getAuthor() != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Aweme aweme3 = next;
                    if (aweme3 != null && (author = aweme3.getAuthor()) != null && (userStory3 = aweme2.getUserStory()) != null && (stories3 = userStory3.getStories()) != null) {
                        for (Aweme aweme4 : stories3) {
                            if (aweme4.getAuthor() == null) {
                                aweme4.setAuthor(author);
                            }
                        }
                    }
                }
                UserStory userStory4 = aweme2.getUserStory();
                if (userStory4 != null && (stories = userStory4.getStories()) != null && (aweme = (Aweme) C13LP.LJJJLL(stories)) != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null && (userStory = aweme2.getUserStory()) != null) {
                    if (list2 != null) {
                        Iterator<SkylightStoryUser> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            SkylightStoryUser next2 = it3.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                SkylightStoryUser skylightStoryUser = next2;
                                if (Intrinsics.LJFF(String.valueOf(skylightStoryUser.userId), authorUid)) {
                                    list3 = skylightStoryUser.unViewedStoryIds;
                                    break;
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    userStory.setUnReadStoryAids(list3);
                }
            }
        }
    }

    public static final void LJJJJJ(Context context, Aweme aweme, String str, String str2, C729570Sjb c729570Sjb, int i) {
        boolean z;
        String str3;
        if (aweme == null) {
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).enterFromService().setEnterFrom(str);
        InterfaceC1618460sDc interfaceC1618460sDc = (InterfaceC1618460sDc) C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(312)).getValue();
        if (c729570Sjb != null) {
            z = c729570Sjb.LIZ;
        } else {
            z = false;
        }
        interfaceC1618460sDc.LJIIJ(new C20271514Tp(context, aweme, str, null, str2, null, 0, 0, null, false, null, null, false, z, null, null, null, null, 999400));
        if (i == 1) {
            str3 = "dm";
        } else {
            str3 = "story_page";
        }
        ((InterfaceC1618460sDc) C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(311)).getValue()).LJIIIIZZ("click", str3);
    }
}
