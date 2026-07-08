package Y;

import X.C09JN;
import X.C0CAU;
import X.C1076010e6h;
import X.C11TL;
import X.C1380890m2R;
import X.C13LP;
import X.C15438062q;
import X.C1601110rld;
import X.C1618440sDa;
import X.C19EG;
import X.C1C7U;
import X.C2344809Gs;
import X.C707370Rot;
import X.C727230Sfp;
import X.C727890Sgt;
import X.C728410Shj;
import X.C728430Shl;
import X.C728450Shn;
import X.C728460Sho;
import X.C728470Shp;
import X.C728480Shq;
import X.C728490Shr;
import X.C728540Shw;
import X.C729510SjV;
import X.C730000SkI;
import X.C786410Ut5;
import X.InterfaceC1209780haS;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationDetailAction;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AfS180S0100000_11 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
        }
    }

    public AfS180S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("CollabInFeedLabelAssem@bbc5.bindCollabInfoAvatars$1");
        ((TuxIconView) afS180S0100000_11.l0).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("CollabInFeedLabelAssem@bbc5.bindCollabInfoAvatars$1");
    }

    public static final void accept$1(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("TriggerAssemHost@c31f.register$1");
        ((Function1) afS180S0100000_11.l0).invoke(obj);
        C1C7U.LIZIZ("TriggerAssemHost@c31f.register$1");
    }

    public static final void accept$10(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        Fragment fragment;
        C19EG activity;
        C1C7U.LIZ("StoryInnerAppPostPushDetailOperator@d13a.requestImpl$4");
        Throwable th = (Throwable) obj;
        C728490Shr c728490Shr = (C728490Shr) afS180S0100000_11.l0;
        c728490Shr.LLILZ = false;
        InterfaceC1209780haS interfaceC1209780haS = c728490Shr.LLILLJJLI;
        if (interfaceC1209780haS != null && (fragment = interfaceC1209780haS.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            C728540Shw.LIZ(activity);
        }
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        String strValueOf = String.valueOf(th.getMessage());
        c727890Sgt.getClass();
        String strLIZLLL = C727890Sgt.LIZLLL("StoryInnerAppPostPushDetailOperator");
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, strLIZLLL, strValueOf);
        }
        C1C7U.LIZIZ("StoryInnerAppPostPushDetailOperator@d13a.requestImpl$4");
    }

    public static final void accept$11(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        List<Aweme> stories;
        Fragment fragment;
        Bundle arguments;
        Fragment fragment2;
        C19EG activity;
        UserStory userStory;
        C1C7U.LIZ("StoryOutAppPostPushDetailOperator@be1e.requestImpl$1$1");
        Pair pair = (Pair) obj;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 5);
        c730000SkI.LIZ(249372176, 1, "is_request");
        C728460Sho c728460Sho = (C728460Sho) afS180S0100000_11.l0;
        c728460Sho.LLILZ = false;
        List listSingletonList = Collections.singletonList(pair.getFirst());
        int iIntValue = ((Number) pair.getSecond()).intValue();
        c728460Sho.LLILLL = new ArrayList(listSingletonList);
        Aweme aweme = (Aweme) C13LP.LJJJLZIJ(0, listSingletonList);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            stories = userStory.getStories();
        } else {
            stories = null;
        }
        InterfaceC1209780haS interfaceC1209780haS = c728460Sho.LLILLJJLI;
        if (interfaceC1209780haS != null && (fragment2 = interfaceC1209780haS.getFragment()) != null && (activity = fragment2.getActivity()) != null) {
            C728470Shp.LIZ(iIntValue, activity);
        }
        if (stories != null && !stories.isEmpty()) {
            InterfaceC1209780haS interfaceC1209780haS2 = c728460Sho.LLILLJJLI;
            if (interfaceC1209780haS2 != null && (fragment = interfaceC1209780haS2.getFragment()) != null && (arguments = fragment.getArguments()) != null) {
                C1380890m2R.LIZLLL(arguments, stories);
            }
            InterfaceC1209780haS interfaceC1209780haS3 = c728460Sho.LLILLJJLI;
            if (interfaceC1209780haS3 != null) {
                interfaceC1209780haS3.LLJJJIL(listSingletonList, false);
            }
            InterfaceC1209780haS interfaceC1209780haS4 = c728460Sho.LLILLJJLI;
            if (interfaceC1209780haS4 != null) {
                interfaceC1209780haS4.G90(new Pair<>(0, ListProtector.get(listSingletonList, 0)));
            }
        } else {
            C786410Ut5.LJLIIL(500L, C0CAU.LIZ, new ARunnableS111S0100000_11(c728460Sho, 129));
        }
        C1C7U.LIZIZ("StoryOutAppPostPushDetailOperator@be1e.requestImpl$1$1");
    }

    public static final void accept$12(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryOutAppPostPushDetailOperator@be1e.requestImpl$1$2");
        ((C728460Sho) afS180S0100000_11.l0).LLILZ = false;
        C730000SkI.LIZIZ.LIZLLL(249372176, false);
        C1C7U.LIZIZ("StoryOutAppPostPushDetailOperator@be1e.requestImpl$1$2");
    }

    public static final void accept$13(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryWidgetFeedOperator@70ee.requestImpl$1");
        UserStoriesResponse userStoriesResponse = (UserStoriesResponse) obj;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 5);
        c730000SkI.LIZ(249372176, 1, "is_request");
        ((C728430Shl) afS180S0100000_11.l0).LLILZ = false;
        List<Aweme> awemes = userStoriesResponse.getAwemes();
        if (awemes != null) {
            C728430Shl c728430Shl = (C728430Shl) afS180S0100000_11.l0;
            C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZ(awemes, userStoriesResponse.extra.logid, null, true);
            c728430Shl.LIZ(awemes);
        }
        C1C7U.LIZIZ("StoryWidgetFeedOperator@70ee.requestImpl$1");
    }

    public static final void accept$14(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryWidgetFeedOperator@70ee.requestImpl$2");
        ((C728430Shl) afS180S0100000_11.l0).LLILZ = false;
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        String strValueOf = String.valueOf(((Throwable) obj).getMessage());
        c727890Sgt.getClass();
        String strLIZLLL = C727890Sgt.LIZLLL("StoryWidgetFeedOperator");
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, strLIZLLL, strValueOf);
        }
        C730000SkI.LIZIZ.LIZLLL(249372176, false);
        C1C7U.LIZIZ("StoryWidgetFeedOperator@70ee.requestImpl$2");
    }

    public static final void accept$15(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("FriendsDetailBottomBarQuickDMAssem@abc8.onBind$2");
        ((FriendsDetailBottomBarQuickDMAssem) afS180S0100000_11.l0).sp(false);
        ((FriendsDetailBottomBarQuickDMAssem) afS180S0100000_11.l0).op();
        C1C7U.LIZIZ("FriendsDetailBottomBarQuickDMAssem@abc8.onBind$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$$inlined$subscribeUserStoryChanged$3");
        ((Function1) afS180S0100000_11.l0).invoke(((Aweme) ((C727230Sfp) obj).LIZJ).m199clone());
        C1C7U.LIZIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$$inlined$subscribeUserStoryChanged$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$1$run$$inlined$subscribeUserStoryChanged$3");
        ((Function1) afS180S0100000_11.l0).invoke(((Aweme) ((C727230Sfp) obj).LIZJ).m199clone());
        C1C7U.LIZIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$1$run$$inlined$subscribeUserStoryChanged$3");
    }

    public static final void accept$18(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("JediUserBridge@36cc.disposable$2");
        List<FollowStatus> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C11TL c11tl = (C11TL) afS180S0100000_11.l0;
            for (FollowStatus followStatus : list) {
                c11tl.getClass();
                C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(followStatus);
                C707370Rot.LIZ.LIZ("#FollowStatus").postValue(followStatus);
                if (C1601110rld.LIZ()) {
                    C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJFF(followStatus);
                }
            }
        }
        C1C7U.LIZIZ("JediUserBridge@36cc.disposable$2");
    }

    public static final void accept$19(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("LiveNoticeCTAButtonAssem@2d4.requestNextLiveNotice$2");
        ((LiveNoticeCTAButtonAssem) afS180S0100000_11.l0).Qp(2131854993);
        C1C7U.LIZIZ("LiveNoticeCTAButtonAssem@2d4.requestNextLiveNotice$2");
    }

    public static final void accept$2(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("VideoAuthorInfoRelationAssem@40b3.bindCollabInfoAvatars$1");
        ((TuxIconView) afS180S0100000_11.l0).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("VideoAuthorInfoRelationAssem@40b3.bindCollabInfoAvatars$1");
    }

    public static final void accept$3(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("OpenCelebrationDetailAction@f9e3.open$2");
        ((OpenCelebrationDetailAction) afS180S0100000_11.l0).LIZ(2131833832);
        C1C7U.LIZIZ("OpenCelebrationDetailAction@f9e3.open$2");
    }

    public static final void accept$4(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        Aweme aweme;
        C1C7U.LIZ("CelebrationDetailModel@45a2.refreshList$1");
        List<Aweme> list = ((BatchDetailList) obj).items;
        if (list != null && (aweme = (Aweme) C13LP.LJJJLL(list)) != null) {
            C728410Shj c728410Shj = (C728410Shj) afS180S0100000_11.l0;
            if (!c728410Shj.LLILLJJLI) {
                c728410Shj.LLILLL = aweme;
            } else {
                c728410Shj.LLILLL = C729510SjV.LIZIZ(aweme);
            }
        }
        C1C7U.LIZIZ("CelebrationDetailModel@45a2.refreshList$1");
    }

    public static final void accept$5(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("CollabFeedTagAssem@1e65.renderCollaboratorAvatars$1$1");
        ((AppCompatImageView) ((CollabFeedTagAssem) afS180S0100000_11.l0).LLJZ.getValue()).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("CollabFeedTagAssem@1e65.renderCollaboratorAvatars$1$1");
    }

    public static final void accept$6(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryQuickDMBottomBarAssem@a907.onBind$2");
        StoryQuickDMBottomBarAssem storyQuickDMBottomBarAssem = (StoryQuickDMBottomBarAssem) afS180S0100000_11.l0;
        storyQuickDMBottomBarAssem.LLLFFI = false;
        C786410Ut5.LJLLLLLL(8, storyQuickDMBottomBarAssem.getContentView());
        C1C7U.LIZIZ("StoryQuickDMBottomBarAssem@a907.onBind$2");
    }

    public static final void accept$7(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("SingleStoryDetailOperator@6958.requestImpl$1");
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 5);
        c730000SkI.LIZ(249372176, 1, "is_request");
        ((C728480Shq) afS180S0100000_11.l0).LLILZ = false;
        List<Aweme> list = ((BatchDetailList) obj).items;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C729510SjV.LIZIZ(it2.next()));
        }
        ((C728480Shq) afS180S0100000_11.l0).LIZ(arrayList);
        C1C7U.LIZIZ("SingleStoryDetailOperator@6958.requestImpl$1");
    }

    public static final void accept$8(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryCommonDetailOperator@8841.requestImpl$1");
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 5);
        c730000SkI.LIZ(249372176, 1, "is_request");
        C728450Shn c728450Shn = (C728450Shn) afS180S0100000_11.l0;
        c728450Shn.LLILZ = false;
        c728450Shn.LIZ(Collections.singletonList(obj));
        C1C7U.LIZIZ("StoryCommonDetailOperator@8841.requestImpl$1");
    }

    public static final void accept$9(AfS180S0100000_11 afS180S0100000_11, Object obj) {
        C1C7U.LIZ("StoryCommonDetailOperator@8841.requestImpl$2");
        ((C728450Shn) afS180S0100000_11.l0).LLILZ = false;
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        String strValueOf = String.valueOf(((Throwable) obj).getMessage());
        c727890Sgt.getClass();
        String strLIZLLL = C727890Sgt.LIZLLL("StoryCommonDetailOperator");
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(6, strLIZLLL, strValueOf);
        }
        C730000SkI.LIZIZ.LIZLLL(249372176, false);
        C1C7U.LIZIZ("StoryCommonDetailOperator@8841.requestImpl$2");
    }
}
