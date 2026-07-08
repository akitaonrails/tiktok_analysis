package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.FilterReason;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466570oGd extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(C1423960n9u c1423960n9u, int i) {
        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        this.$t = i;
        switch (i) {
            case 1:
            case 2:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                this.l0 = c1423960n9u;
                super(0, 3);
                break;
            default:
                this.l0 = c1423960n9u;
                break;
        }
    }

    public static final void LIZ$0(C1466570oGd c1466570oGd, View view) {
        InterfaceC1425150nBp playerManager = ((C1425090nBj) c1466570oGd.l0).getPlayerManager();
        if (playerManager != null && playerManager.isPlaying()) {
            ((C1425090nBj) c1466570oGd.l0).LJFF(false);
            C337180DJs.LIZJ(((C1425090nBj) c1466570oGd.l0).LLJ);
            ((C1425090nBj) c1466570oGd.l0).LLJJL = true;
        } else {
            ((C1425090nBj) c1466570oGd.l0).LJI(false);
            C337180DJs.LIZ(((C1425090nBj) c1466570oGd.l0).LLJ);
            ((C1425090nBj) c1466570oGd.l0).LLJJL = false;
        }
    }

    public static final void LIZ$1(C1466570oGd c1466570oGd, View view) {
        ((C1423960n9u) c1466570oGd.l0).LLLLIL().LJIIIZ.invoke();
    }

    public static final void LIZ$10(C1466570oGd c1466570oGd, View view) {
        ((C1423960n9u) c1466570oGd.l0).S();
    }

    public static final void LIZ$11(C1466570oGd c1466570oGd, View view) {
        ((C1427290nFH) c1466570oGd.l0).LLLLIL().LJ.invoke();
    }

    public static final void LIZ$12(C1466570oGd c1466570oGd, View view) {
        ((C1425670nCf) c1466570oGd.l0).LLLLIL().LIZLLL.invoke();
    }

    public static final void LIZ$13(C1466570oGd c1466570oGd, View view) {
        ((C1425670nCf) c1466570oGd.l0).LLLLIL().LJ.invoke();
    }

    public static final void LIZ$14(C1466570oGd c1466570oGd, View view) {
        ((C1425670nCf) c1466570oGd.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$15(C1466570oGd c1466570oGd, View view) {
        ((C1425670nCf) c1466570oGd.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$16(C1466570oGd c1466570oGd, View view) {
        ((C1425670nCf) c1466570oGd.l0).LLLLIL().LIZJ.invoke();
    }

    public static final void LIZ$17(C1466570oGd c1466570oGd, View view) {
        ((C1451530nsN) c1466570oGd.l0).LLLLIL().LIZ.invoke();
        C337180DJs.LIZ(((C1451530nsN) c1466570oGd.l0).mView);
    }

    public static final void LIZ$18(C1466570oGd c1466570oGd, View view) {
        C337180DJs.LIZJ(((C1451530nsN) c1466570oGd.l0).LLJJJJ);
        C337180DJs.LIZ(((C1451530nsN) c1466570oGd.l0).LLJJJJJIL);
        ((C1451530nsN) c1466570oGd.l0).LLLLLJIL(0.0f);
        ((C1451530nsN) c1466570oGd.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$19(C1466570oGd c1466570oGd, View view) {
        ((C1418830n1d) c1466570oGd.l0).LLLLIL().LIZJ.invoke();
    }

    public static final void LIZ$2(C1466570oGd c1466570oGd, View view) {
        ((C1423960n9u) c1466570oGd.l0).LLLLIL().LJIIJ.invoke();
    }

    public static final void LIZ$20(C1466570oGd c1466570oGd, View view) {
        ((C1418830n1d) c1466570oGd.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$21(C1466570oGd c1466570oGd, View view) {
        ((C1427280nFG) c1466570oGd.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$22(C1466570oGd c1466570oGd, View view) {
        ((C1427280nFG) c1466570oGd.l0).LLLLLJIL();
    }

    public static final void LIZ$23(C1466570oGd c1466570oGd, View view) {
        C0CHQ.LIZ().LJI().LJIIIZ(((C1458920o4I) c1466570oGd.l0).LLJILJILJ, "music");
        C1443030nef c1443030nefLJII = C1443030nef.LJII();
        C1458920o4I c1458920o4I = (C1458920o4I) c1466570oGd.l0;
        c1443030nefLJII.LJI = c1458920o4I.LLJILJILJ.creativeModel.privacySettingModel.isSubscribeOnly;
        c1458920o4I.getClass();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().start(OpenMusicPanelPerformanceMonitor.INSTANCE, "start_choose_music");
        ShortVideoContextViewModel shortVideoContextViewModel = c1458920o4I.LLJJIJIIJIL;
        ShortVideoContextViewModel shortVideoContextViewModel2 = null;
        if (shortVideoContextViewModel == null) {
            shortVideoContextViewModel = null;
        }
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.LL;
        ICommerceToolsMissionService iCommerceToolsMissionService = (ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class);
        Activity activityRequireActivity = c1458920o4I.requireActivity();
        ShortVideoContextViewModel shortVideoContextViewModel3 = c1458920o4I.LLJJIJIIJIL;
        if (shortVideoContextViewModel3 != null) {
            shortVideoContextViewModel2 = shortVideoContextViewModel3;
        }
        iCommerceToolsMissionService.LJIILJJIL(shortVideoContextViewModel2.LL, activityRequireActivity);
        if (!C1662060tLw.LIZIZ(view)) {
            C0CHQ.LIZ().LJJJJI().sceneReport("click_music_entrance_shoot");
            if (!shortVideoContext.LJJJJLL()) {
                c1458920o4I.LLJI.LJIILJJIL.LJIIJ(Unit.LIZ);
                C1638140sjM.LIZ(EnumC1647590syb.CHOOSE_MUSIC);
            }
        }
    }

    public static final void LIZ$24(C1466570oGd c1466570oGd, View view) {
        C1425870nCz c1425870nCz = (C1425870nCz) c1466570oGd.l0;
        c1425870nCz.LL = !c1425870nCz.LL;
        c1425870nCz.notifyDataSetChanged();
        ((C1425870nCz) c1466570oGd.l0).getClass();
    }

    public static final void LIZ$25(C1466570oGd c1466570oGd, View view) {
        C337180DJs.LIZ(((DescIdeasModule) c1466570oGd.l0).LLJJJ);
        ((DescIdeasModule) c1466570oGd.l0).LJIIL();
    }

    public static final void LIZ$26(C1466570oGd c1466570oGd, View view) {
        ((C1424590nAv) c1466570oGd.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$27(C1466570oGd c1466570oGd, View view) {
        ((C1424590nAv) c1466570oGd.l0).LLLLIL().LIZJ.invoke("click_cross");
    }

    public static final void LIZ$28(C1466570oGd c1466570oGd, View view) {
        C1610140s0C.LIZIZ(true);
        ((C1425080nBi) c1466570oGd.l0).I5();
        Function1<? super Boolean, Unit> function1 = ((C1425080nBi) c1466570oGd.l0).LLJJJJ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void LIZ$29(C1466570oGd c1466570oGd, View view) {
        C1610140s0C.LIZIZ(false);
        ((C1425080nBi) c1466570oGd.l0).I5();
        Function1<? super Boolean, Unit> function1 = ((C1425080nBi) c1466570oGd.l0).LLJJJJ;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public static final void LIZ$3(C1466570oGd c1466570oGd, View view) {
        C1425090nBj c1425090nBj = (C1425090nBj) c1466570oGd.l0;
        C1425160nBq c1425160nBq = c1425090nBj.LLJJJJ;
        if (c1425160nBq != null) {
            if (c1425160nBq.isPlaying()) {
                c1425090nBj.LJFF(false);
                C337180DJs.LIZJ(c1425090nBj.LLJ);
                c1425090nBj.LLJJL = true;
            } else {
                c1425090nBj.LJI(false);
                C337180DJs.LIZ(c1425090nBj.LLJ);
                c1425090nBj.LLJJL = false;
            }
        }
    }

    public static final void LIZ$30(C1466570oGd c1466570oGd, View view) {
        C1424850nBL c1424850nBL = (C1424850nBL) c1466570oGd.l0;
        c1424850nBL.LLILZLL.LJIIIIZZ(c1424850nBL.LLILLL);
    }

    public static final void LIZ$31(C1466570oGd c1466570oGd, View view) {
        ((C1422980n8K) c1466570oGd.l0).Il2("system_back_button");
    }

    public static final void LIZ$32(C1466570oGd c1466570oGd, View view) throws Throwable {
        UrlModel videoCoverAddr;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        C1445410niV c1445410niV = (C1445410niV) c1466570oGd.l0;
        C1322110kVd c1322110kVd = null;
        if (!c1445410niV.LLLFZ && !c1445410niV.LLJZIJLIL) {
            C1322110kVd c1322110kVd2 = c1445410niV.LLJJIJIL;
            if (c1322110kVd2 == null) {
                c1322110kVd2 = null;
            }
            VideoPublishEditModel videoPublishEditModel = c1445410niV.LLJLLL;
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null) {
                videoCoverAddr = editPostModel.getVideoCoverAddr();
            } else {
                videoCoverAddr = null;
            }
            c1445410niV.LLLIIIIL(c1322110kVd2, videoCoverAddr);
        }
        C1445410niV c1445410niV2 = (C1445410niV) c1466570oGd.l0;
        C1322110kVd c1322110kVd3 = c1445410niV2.LLJJIJIL;
        if (c1322110kVd3 != null) {
            c1322110kVd = c1322110kVd3;
        }
        c1445410niV2.LLLLLLIL(0, c1322110kVd);
    }

    public static final void LIZ$33(C1466570oGd c1466570oGd, View view) throws Throwable {
        String creationId;
        String str;
        String storyShootEntrance;
        String strLJIILL;
        AVETParameter avetParameter;
        String contentSource;
        AVETParameter avetParameter2;
        CreativeModel creativeModel;
        PostPageModel postPageModel;
        CreativeModel creativeModel2;
        PostPageModel postPageModel2;
        UrlModel videoCoverAddr;
        CreativeModel creativeModel3;
        EditPostModel editPostModel;
        C1445410niV c1445410niV = (C1445410niV) c1466570oGd.l0;
        if (!c1445410niV.LLLFZ && !c1445410niV.LLJZIJLIL) {
            C1322110kVd c1322110kVd = c1445410niV.LLJJIJIL;
            if (c1322110kVd == null) {
                c1322110kVd = null;
            }
            VideoPublishEditModel videoPublishEditModel = c1445410niV.LLJLLL;
            if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel3.editPostModel) != null) {
                videoCoverAddr = editPostModel.getVideoCoverAddr();
            } else {
                videoCoverAddr = null;
            }
            c1445410niV.LLLIIIIL(c1322110kVd, videoCoverAddr);
        }
        VideoPublishEditModel videoPublishEditModel2 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        if (videoPublishEditModel2 != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (postPageModel2 = creativeModel2.postPageModel) != null) {
            postPageModel2.clickCover = System.currentTimeMillis();
        }
        VideoPublishEditModel videoPublishEditModel3 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        if (videoPublishEditModel3 != null && (creativeModel = videoPublishEditModel3.creativeModel) != null && (postPageModel = creativeModel.postPageModel) != null) {
            postPageModel.coverEnterFrom = "edit_post_page";
        }
        C857150Xjt c857150Xjt = C857150Xjt.LIZ;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel4 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        if (videoPublishEditModel4 != null) {
            creationId = videoPublishEditModel4.getCreationId();
        } else {
            creationId = "mModel is null";
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("enter_from", "edit_post_page");
        VideoPublishEditModel videoPublishEditModel5 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        String str2 = "";
        if (videoPublishEditModel5 == null || (str = videoPublishEditModel5.mShootWay) == null) {
            str = "";
        }
        c0lab.LJ("shoot_way", str);
        VideoPublishEditModel videoPublishEditModel6 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        if (videoPublishEditModel6 == null || (avetParameter2 = videoPublishEditModel6.getAvetParameter()) == null || (storyShootEntrance = avetParameter2.getStoryShootEntrance()) == null) {
            storyShootEntrance = "";
        }
        c0lab.LJ("shoot_entrance", storyShootEntrance);
        VideoPublishEditModel videoPublishEditModel7 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        if (videoPublishEditModel7 == null || (strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel7)) == null) {
            strLJIILL = "";
        }
        c0lab.LJ("content_type", strLJIILL);
        VideoPublishEditModel videoPublishEditModel8 = ((C1445410niV) c1466570oGd.l0).LLJLLL;
        if (videoPublishEditModel8 != null && (avetParameter = videoPublishEditModel8.getAvetParameter()) != null && (contentSource = avetParameter.getContentSource()) != null) {
            str2 = contentSource;
        }
        c0lab.LJ("content_source", str2);
        c0lab.LJ("after_post", "1");
        c857150Xjt.getClass();
        C857150Xjt.LIZ(c0lab);
        C20684815ws.LJIILLIIL("click_cover_entrance", c0lab.LIZ);
        C1445410niV c1445410niV2 = (C1445410niV) c1466570oGd.l0;
        if (!c1445410niV2.LLLJ) {
            c1445410niV2.LLLF = EnumC1445450niZ.CLICK_SELECT_COVER;
            c1445410niV2.LLLLZ();
            ((C1445410niV) c1466570oGd.l0).LLLLZIL();
        } else {
            Activity activity = c1445410niV2.mActivity;
            if (activity != null && !c1445410niV2.LLLII) {
                C2204961BRm.n(activity, c1445410niV2.LLJLLL, 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnZwSGu628qylbxLrjLD8GB77mX1dla2pGRg=", null));
            }
        }
    }

    public static final void LIZ$4(C1466570oGd c1466570oGd, View view) {
        C1425090nBj c1425090nBj = (C1425090nBj) c1466570oGd.l0;
        c1425090nBj.LLILZIL.LIZIZ(c1425090nBj.getAsset());
    }

    public static final void LIZ$5(C1466570oGd c1466570oGd, View view) {
        C1425090nBj c1425090nBj = (C1425090nBj) c1466570oGd.l0;
        c1425090nBj.LLILZIL.LIZJ(c1425090nBj.getAsset());
    }

    public static final void LIZ$6(C1466570oGd c1466570oGd, View view) {
        ((C1423960n9u) c1466570oGd.l0).LLLLIL().LJIIL.invoke(Boolean.FALSE);
    }

    public static final void LIZ$7(C1466570oGd c1466570oGd, View view) {
        ((C1423960n9u) c1466570oGd.l0).LLLLIL().LJIIL.invoke(Boolean.FALSE);
    }

    public static final void LIZ$8(C1466570oGd c1466570oGd, View view) {
        ((C1423960n9u) c1466570oGd.l0).LLLLIL().LJIIL.invoke(Boolean.TRUE);
    }

    public static final void LIZ$9(C1466570oGd c1466570oGd, View view) {
        C21597919fl c21597919fl = ((C1423960n9u) c1466570oGd.l0).LLJJJJLIIL;
        if (c21597919fl != null) {
            int currentItem = c21597919fl.getCurrentItem();
            C1419590n2r c1419590n2rLLLLLL = ((C1423960n9u) c1466570oGd.l0).LLLLLL();
            if (c1419590n2rLLLLLL == null) {
                return;
            }
            FilteredAsset filteredAssetInvoke = ((C1423960n9u) c1466570oGd.l0).LLLLIL().LJIIJJI.invoke(c1419590n2rLLLLLL);
            if (filteredAssetInvoke != null) {
                C1423960n9u c1423960n9u = (C1423960n9u) c1466570oGd.l0;
                FilterReason filterReason = filteredAssetInvoke.filter_reason;
                if (filterReason != null) {
                    c1423960n9u.LLLLLLL(filterReason.filter_reason);
                    return;
                }
                return;
            }
            ((C1423960n9u) c1466570oGd.l0).LLLLIL().LIZIZ.invoke(c1419590n2rLLLLLL, Integer.valueOf(currentItem));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(C1425090nBj c1425090nBj, int i) {
        super(0, 3);
        this.$t = i;
        switch (i) {
            case 0:
            case 5:
                this.l0 = c1425090nBj;
                super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                break;
            default:
                this.l0 = c1425090nBj;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(C1425670nCf c1425670nCf, int i) {
        super(0, 3);
        this.$t = i;
        switch (i) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                this.l0 = c1425670nCf;
                super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                break;
            default:
                this.l0 = c1425670nCf;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(C1445410niV c1445410niV, int i) {
        super(600, 2);
        this.$t = i;
        this.l0 = c1445410niV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(C1458920o4I c1458920o4I, int i) {
        super(500, 2);
        this.$t = i;
        this.l0 = c1458920o4I;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(Object obj, int i) {
        super(0, 3);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(Object obj, int i, int i2) {
        super(600, true);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466570oGd(Object obj, int i, int i2, int i3) {
        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        this.$t = i;
        this.l0 = obj;
    }
}
