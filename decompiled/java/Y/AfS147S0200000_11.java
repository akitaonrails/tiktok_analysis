package Y;

import X.C09JN;
import X.C0K77;
import X.C0S1L;
import X.C0S64;
import X.C0SFF;
import X.C0SFR;
import X.C0SJ9;
import X.C0SJF;
import X.C0XIR;
import X.C11NJ;
import X.C13LP;
import X.C15438062q;
import X.C1601110rld;
import X.C1603960rqE;
import X.C1606010rtX;
import X.C1C7U;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23112093u;
import X.C2344809Gs;
import X.C259800zU;
import X.C279580AxY;
import X.C718770SHj;
import X.C718780SHk;
import X.C718800SHm;
import X.C727110Sfd;
import X.C727760Sgg;
import X.C728090ShD;
import X.C728350Shd;
import X.C728410Shj;
import X.C728480Shq;
import X.C729510SjV;
import X.C730000SkI;
import X.C786410Ut5;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC1209780haS;
import X.InterfaceC1526205yG;
import X.InterfaceC729990SkH;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomFriendsV3DetailStoryDMAssem;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.experiment.CommentDisappearingFixKillSwitch;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceUIAssem;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AfS147S0200000_11 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws Exception {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("StoryViewerEntranceComponent@3c21.updateAvatars$1");
        Bitmap bitmap = (Bitmap) obj;
        SmartImageView smartImageView = ((StoryViewerEntranceComponent) afS147S0200000_11.l0).LLJZ;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        SmartImageView smartImageView2 = ((StoryViewerEntranceComponent) afS147S0200000_11.l0).LLJZ;
        if (smartImageView2 != null) {
            smartImageView2.setImageBitmap(bitmap);
        }
        Function0 function0 = (Function0) afS147S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
        ((StoryViewerEntranceComponent) afS147S0200000_11.l0).Ep();
        C1C7U.LIZIZ("StoryViewerEntranceComponent@3c21.updateAvatars$1");
    }

    public static final void accept$1(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("FriendsDetailViewerEntranceUIAssem@ec07.updateAvatars$1");
        Bitmap bitmap = (Bitmap) obj;
        SmartImageView smartImageView = ((FriendsDetailViewerEntranceUIAssem) afS147S0200000_11.l0).LLJJIJIIJIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        SmartImageView smartImageView2 = ((FriendsDetailViewerEntranceUIAssem) afS147S0200000_11.l0).LLJJIJIIJIL;
        if (smartImageView2 != null) {
            smartImageView2.setImageBitmap(bitmap);
        }
        Function0 function0 = (Function0) afS147S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
        ((FriendsDetailViewerEntranceUIAssem) afS147S0200000_11.l0).hp();
        C1C7U.LIZIZ("FriendsDetailViewerEntranceUIAssem@ec07.updateAvatars$1");
    }

    public static final void accept$10(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.preProcessHashtagTruncation$2");
        CharSequence charSequence = (CharSequence) obj;
        C0SFR.LIZ.LIZLLL(null, null, new AwS246S0300000_2((C718770SHj) afS147S0200000_11.l0, (Aweme) afS147S0200000_11.l1, charSequence, 27));
        ((C718770SHj) afS147S0200000_11.l0).LLLLLIL = false;
        AwemeBizExtKt.setDescWithHashTagTruncation((Aweme) afS147S0200000_11.l1, charSequence.toString());
        ((C718770SHj) afS147S0200000_11.l0).LJLLLL((Aweme) afS147S0200000_11.l1);
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.preProcessHashtagTruncation$2");
    }

    public static final void accept$11(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.preProcessHashtagTruncation$3");
        C0SFR.LIZ.LIZJ(null, (Throwable) obj, new AwS403S0200000_2((C718770SHj) afS147S0200000_11.l0, (Aweme) afS147S0200000_11.l1, 71));
        ((C718770SHj) afS147S0200000_11.l0).LLLLLIL = false;
        ((C718770SHj) afS147S0200000_11.l0).LJLLLL((Aweme) afS147S0200000_11.l1);
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.preProcessHashtagTruncation$3");
    }

    public static final void accept$12(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        String aid;
        C1C7U.LIZ("FriendsDetailBottomBarQuickDMAssem@abc8.onBind$1");
        C0S1L c0s1l = (C0S1L) obj;
        Aweme aweme = c0s1l.LIZ;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = (Aweme) afS147S0200000_11.l0;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (Intrinsics.LJFF(aid, aid2) && c0s1l.LIZIZ) {
            ((FriendsDetailBottomBarQuickDMAssem) afS147S0200000_11.l1).sp(true);
        } else {
            ((FriendsDetailBottomBarQuickDMAssem) afS147S0200000_11.l1).sp(false);
        }
        ((FriendsDetailBottomBarQuickDMAssem) afS147S0200000_11.l1).op();
        C1C7U.LIZIZ("FriendsDetailBottomBarQuickDMAssem@abc8.onBind$1");
    }

    public static final void accept$13(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("VideoDiggVM@76c8.requestUnLoginDigg$2");
        ((VideoDiggVM) afS147S0200000_11.l0).HQ2(new Exception((Throwable) obj));
        ((C11NJ) afS147S0200000_11.l1).dispose();
        C1C7U.LIZIZ("VideoDiggVM@76c8.requestUnLoginDigg$2");
    }

    public static final void accept$14(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        boolean z;
        UserStory userStory;
        List<Aweme> stories;
        C1C7U.LIZ("StoryAvatarDetailModel@7f57.refreshList$1");
        UserStoriesResponse userStoriesResponse = (UserStoriesResponse) obj;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 5);
        c730000SkI.LIZ(249372176, 1, "is_request");
        InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) afS147S0200000_11.l0;
        if (interfaceC729990SkH != null) {
            interfaceC729990SkH.LJ(16);
        }
        ((ArrayList) ((C728350Shd) afS147S0200000_11.l1).LLILLL).clear();
        List<Aweme> awemes = userStoriesResponse.getAwemes();
        Aweme aweme = null;
        if (awemes != null) {
            aweme = (Aweme) C13LP.LJJJLL(awemes);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshList success uid=");
        sbLIZ.append(((C728350Shd) afS147S0200000_11.l1).LL);
        sbLIZ.append(" storiesEmpty=");
        if (aweme != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null && !stories.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            if (!AwemeBizExtKt.isStoryPacked(aweme)) {
                C727110Sfd.LIZJ(aweme, userStoriesResponse.extra.logid, true);
            }
            ((ArrayList) ((C728350Shd) afS147S0200000_11.l1).LLILLL).add(aweme);
            C728090ShD.LIZ.LIZIZ(aweme, aweme.getRequestId(), true);
            C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.DEFAULT, Collections.singletonList(aweme.getAuthor()), AFwS243S0000000_11.get$arr$(772));
        }
        Iterator<InterfaceC1526205yG> it2 = ((C728350Shd) afS147S0200000_11.l1).mNotifyListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onSuccess();
        }
        C727760Sgg.LIZ.getClass();
        C727760Sgg.LIZ(aweme);
        C1C7U.LIZIZ("StoryAvatarDetailModel@7f57.refreshList$1");
    }

    public static final void accept$15(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("StoryAvatarDetailModel@7f57.refreshList$2");
        Throwable th = (Throwable) obj;
        InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) afS147S0200000_11.l1;
        if (interfaceC729990SkH != null) {
            interfaceC729990SkH.LJ(32);
        }
        Iterator<InterfaceC1526205yG> it2 = ((C728350Shd) afS147S0200000_11.l0).mNotifyListeners.iterator();
        while (true) {
            Exception exc = null;
            if (it2.hasNext()) {
                InterfaceC1526205yG next = it2.next();
                if (th instanceof Exception) {
                    exc = (Exception) th;
                }
                next.onFailed(exc);
            } else {
                C727760Sgg.LIZ.getClass();
                C727760Sgg.LIZ(null);
                C730000SkI.LIZIZ.LIZLLL(249372176, false);
                C1C7U.LIZIZ("StoryAvatarDetailModel@7f57.refreshList$2");
                return;
            }
        }
    }

    public static final void accept$16(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("StoryAvatarDetailModel@7f57.refreshRevealStories$1");
        UserStoryResponse userStoryResponse = (UserStoryResponse) obj;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 5);
        c730000SkI.LIZ(249372176, 1, "is_request");
        InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) afS147S0200000_11.l0;
        if (interfaceC729990SkH != null) {
            interfaceC729990SkH.LJ(16);
        }
        ((ArrayList) ((C728350Shd) afS147S0200000_11.l1).LLILLL).clear();
        Aweme aweme = new Aweme();
        aweme.setAid("reveal_story");
        aweme.setUserStory(userStoryResponse.getUserStory());
        C727110Sfd.LIZJ(aweme, null, true);
        ((ArrayList) ((C728350Shd) afS147S0200000_11.l1).LLILLL).add(aweme);
        C728090ShD.LIZ.LIZIZ(aweme, null, true);
        Iterator<InterfaceC1526205yG> it2 = ((C728350Shd) afS147S0200000_11.l1).mNotifyListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onSuccess();
        }
        C727760Sgg.LIZ.getClass();
        C727760Sgg.LIZ(aweme);
        C1C7U.LIZIZ("StoryAvatarDetailModel@7f57.refreshRevealStories$1");
    }

    public static final void accept$17(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("StoryAvatarDetailModel@7f57.refreshRevealStories$2");
        Throwable th = (Throwable) obj;
        InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) afS147S0200000_11.l0;
        if (interfaceC729990SkH != null) {
            interfaceC729990SkH.LJ(32);
        }
        Iterator<InterfaceC1526205yG> it2 = ((C728350Shd) afS147S0200000_11.l1).mNotifyListeners.iterator();
        while (true) {
            Exception exc = null;
            if (it2.hasNext()) {
                InterfaceC1526205yG next = it2.next();
                if (th instanceof Exception) {
                    exc = (Exception) th;
                }
                next.onFailed(exc);
            } else {
                C727760Sgg.LIZ.getClass();
                C727760Sgg.LIZ(null);
                C730000SkI.LIZIZ.LIZLLL(249372176, false);
                C1C7U.LIZIZ("StoryAvatarDetailModel@7f57.refreshRevealStories$2");
                return;
            }
        }
    }

    public static final void accept$2(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        String aid;
        C1C7U.LIZ("BottomFriendsV3DetailStoryDMAssem@c9c6.applyCanShowVisibility$1");
        C0S1L c0s1l = (C0S1L) obj;
        Aweme aweme = ((BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0).LLJILLL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, ((Aweme) afS147S0200000_11.l1).getAid())) {
            if (c0s1l.LIZIZ) {
                C786410Ut5.LJLLLLLL(0, ((BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0).LJJIJL());
                BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem = (BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0;
                if (bottomFriendsV3DetailStoryDMAssem.LLJJ) {
                    bottomFriendsV3DetailStoryDMAssem.Vo();
                }
                ((BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0).cp();
            } else {
                BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem2 = (BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0;
                if (bottomFriendsV3DetailStoryDMAssem2.LLJJ) {
                    C786410Ut5.LJLLLLLL(8, bottomFriendsV3DetailStoryDMAssem2.LJJIJL());
                }
            }
        }
        C1C7U.LIZIZ("BottomFriendsV3DetailStoryDMAssem@c9c6.applyCanShowVisibility$1");
    }

    public static final void accept$3(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        String aid;
        C1C7U.LIZ("BottomFriendsV3DetailStoryDMAssem@c9c6.applyCanShowVisibility$2");
        Aweme aweme = ((BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0).LLJILLL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, ((Aweme) afS147S0200000_11.l1).getAid())) {
            BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem = (BottomFriendsV3DetailStoryDMAssem) afS147S0200000_11.l0;
            if (bottomFriendsV3DetailStoryDMAssem.LLJJ) {
                C786410Ut5.LJLLLLLL(8, bottomFriendsV3DetailStoryDMAssem.LJJIJL());
            }
        }
        C1C7U.LIZIZ("BottomFriendsV3DetailStoryDMAssem@c9c6.applyCanShowVisibility$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS147S0200000_11 afS147S0200000_11, Object obj) throws Exception {
        Aweme aweme;
        C1C7U.LIZ("OpenCelebrationDetailAction@f9e3.open$1");
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        List<Aweme> list = batchDetailList.items;
        if (list != null && (aweme = (Aweme) C13LP.LJJJLZIJ(0, list)) != null) {
            boolean isTikTokStory = aweme.getIsTikTokStory();
            if (isTikTokStory) {
                List<Aweme> list2 = batchDetailList.items;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<Aweme> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C729510SjV.LIZIZ(it2.next()));
                }
                C1603960rqE.LIZ = new C728410Shj((Aweme) C13LP.LJJJLZIJ(0, arrayList), (String) ((C259800zU) afS147S0200000_11.l0).element, isTikTokStory);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) afS147S0200000_11.l1, "aweme://story/detail");
                smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_CELEBRATION");
                smartRouteBuildRoute.withParam("enter_from", "story_archive");
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, (String) ((C259800zU) afS147S0200000_11.l0).element);
                smartRouteBuildRoute.open();
            } else {
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute((Context) afS147S0200000_11.l1, "//aweme/detail");
                smartRouteBuildRoute2.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
                smartRouteBuildRoute2.open();
            }
            C1C7U.LIZIZ("OpenCelebrationDetailAction@f9e3.open$1");
            return;
        }
        throw new Exception("aweme is null");
    }

    public static final void accept$5(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        C1C7U.LIZ("PhotoFeedPreviewProvider@fdcd.refreshDescLayoutWithHashTagTruncation$2");
        ((C718780SHk) afS147S0200000_11.l0).LJII(((C0SFF) obj).LIZ);
        C718780SHk c718780SHk = (C718780SHk) afS147S0200000_11.l0;
        C0SJ9 c0sj9 = (C0SJ9) afS147S0200000_11.l1;
        View view = c718780SHk.LIZJ;
        if (view != null) {
            c0sj9.LIZ(view);
        }
        C1C7U.LIZIZ("PhotoFeedPreviewProvider@fdcd.refreshDescLayoutWithHashTagTruncation$2");
    }

    public static final void accept$6(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        String aid;
        C0K77 c0k77;
        C1C7U.LIZ("StoryQuickDMBottomBarAssem@a907.onBind$1");
        C0S1L c0s1l = (C0S1L) obj;
        Aweme aweme = c0s1l.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, ((VideoItemParams) afS147S0200000_11.l0).getAweme().getAid()) || !c0s1l.LIZIZ || ((!CommentDisappearingFixKillSwitch.INSTANCE.isEnabled() && (c0k77 = (C0K77) ((StoryQuickDMBottomBarAssem) afS147S0200000_11.l1).LLLIIII.getValue()) != null && c0k77.LJIJJ(((VideoItemParams) afS147S0200000_11.l0).getAweme())) || !((VideoItemParams) afS147S0200000_11.l0).getAweme().getIsTikTokStory())) {
            StoryQuickDMBottomBarAssem storyQuickDMBottomBarAssem = (StoryQuickDMBottomBarAssem) afS147S0200000_11.l1;
            storyQuickDMBottomBarAssem.LLLFFI = false;
            C786410Ut5.LJLLLLLL(8, storyQuickDMBottomBarAssem.getContentView());
        } else {
            C786410Ut5.LJLLLLLL(0, ((StoryQuickDMBottomBarAssem) afS147S0200000_11.l1).getContentView());
            StoryQuickDMBottomBarAssem storyQuickDMBottomBarAssem2 = (StoryQuickDMBottomBarAssem) afS147S0200000_11.l1;
            storyQuickDMBottomBarAssem2.LLLFFI = true;
            if (storyQuickDMBottomBarAssem2.LLLFF) {
                storyQuickDMBottomBarAssem2.Fp("story_dm_input_box_show", null);
                ((StoryQuickDMBottomBarAssem) afS147S0200000_11.l1).Jp();
            }
        }
        C1C7U.LIZIZ("StoryQuickDMBottomBarAssem@a907.onBind$1");
    }

    public static final void accept$7(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        InterfaceC1209780haS interfaceC1209780haS;
        C1C7U.LIZ("SingleStoryDetailOperator@6958.requestImpl$2");
        Throwable th = (Throwable) obj;
        ((C728480Shq) afS147S0200000_11.l0).LLILZ = false;
        if (C279580AxY.LIZ(((C2189821An6) afS147S0200000_11.l1).getEventType())) {
            InterfaceC1209780haS interfaceC1209780haS2 = ((C728480Shq) afS147S0200000_11.l0).LLILLJJLI;
            if (interfaceC1209780haS2 != null) {
                interfaceC1209780haS2.G90(new Pair<>(3020004, null));
            }
        } else {
            int i = 2131858200;
            if (((C2189821An6) afS147S0200000_11.l1).isExposeSharerMsg()) {
                C728480Shq c728480Shq = (C728480Shq) afS147S0200000_11.l0;
                c728480Shq.getClass();
                if ((th instanceof C0XIR) && ((C23112093u) th).getErrorCode() == 2053) {
                    InterfaceC1209780haS interfaceC1209780haS3 = c728480Shq.LLILLJJLI;
                    if (interfaceC1209780haS3 != null) {
                        interfaceC1209780haS3.JK1();
                    }
                } else {
                    C728480Shq c728480Shq2 = (C728480Shq) afS147S0200000_11.l0;
                    if (!C1601110rld.LIZ()) {
                        i = 2131858174;
                    }
                    c728480Shq2.LIZJ(i);
                }
            } else {
                C728480Shq c728480Shq3 = (C728480Shq) afS147S0200000_11.l0;
                if (!C1601110rld.LIZ()) {
                    i = 2131858174;
                }
                c728480Shq3.LIZJ(i);
            }
            if (Intrinsics.LJFF("comment_history", ((C2189821An6) afS147S0200000_11.l1).getEventType()) && (th instanceof C0XIR) && ((C23112093u) th).getErrorCode() == 2053 && (interfaceC1209780haS = ((C728480Shq) afS147S0200000_11.l0).LLILLJJLI) != null) {
                interfaceC1209780haS.G90(new Pair<>(3020004, null));
            }
        }
        C2344809Gs.LJI(th);
        C730000SkI.LIZIZ.LIZLLL(249372176, false);
        C1C7U.LIZIZ("SingleStoryDetailOperator@6958.requestImpl$2");
    }

    public static final void accept$8(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshRichTextTranslatedLayout$3");
        Pair pair = (Pair) obj;
        String aid2 = ((Aweme) afS147S0200000_11.l0).getAid();
        VideoItemParams item = ((C718770SHj) afS147S0200000_11.l1).LLILLJJLI.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid2, aid)) {
            ((C718770SHj) afS147S0200000_11.l1).LLLF.LJII = (C0SJF) pair.getFirst();
            ((C718770SHj) afS147S0200000_11.l1).LLL = (C718800SHm) pair.getSecond();
            C718770SHj c718770SHj = (C718770SHj) afS147S0200000_11.l1;
            if (c718770SHj.LLLLIIIILLL != null) {
                c718770SHj.LJLJL();
            }
            ((C718770SHj) afS147S0200000_11.l1).LLJI.getLayoutParams().height = -2;
        }
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshRichTextTranslatedLayout$3");
    }

    public static final void accept$9(AfS147S0200000_11 afS147S0200000_11, Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshTranslatedLayout$3");
        Pair pair = (Pair) obj;
        String aid2 = ((Aweme) afS147S0200000_11.l0).getAid();
        VideoItemParams item = ((C718770SHj) afS147S0200000_11.l1).LLILLJJLI.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid2, aid)) {
            ((C718770SHj) afS147S0200000_11.l1).LLLF.LJI = (C0SJF) pair.getFirst();
            ((C718770SHj) afS147S0200000_11.l1).LLLF.LJFF = (Iterable) pair.getSecond();
            C0S64 c0s64 = ((C718770SHj) afS147S0200000_11.l1).LLLLIIIILLL;
            if (c0s64 != null) {
                ((C718770SHj) afS147S0200000_11.l1).LJLJJLL(c0s64);
            }
            ((C718770SHj) afS147S0200000_11.l1).LLJI.getLayoutParams().height = -2;
        }
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshTranslatedLayout$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS147S0200000_11(X.C728350Shd r2, X.InterfaceC729990SkH r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 14: goto Le;
                case 15: goto L5;
                case 16: goto Le;
                case 17: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS147S0200000_11.<init>(X.0Shd, X.0SkH, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS147S0200000_11(X.C718770SHj r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 8: goto Le;
                case 9: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS147S0200000_11.<init>(X.0SHj, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public AfS147S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
