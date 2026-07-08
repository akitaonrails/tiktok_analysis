package Y;

import X.AbstractC1386130mAt;
import X.AbstractC736370SuZ;
import X.AbstractC737180Svs;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C0C64;
import X.C0OBG;
import X.C0PEM;
import X.C0R5H;
import X.C0RJN;
import X.C0RQ0;
import X.C0RZ7;
import X.C0S11;
import X.C0S2L;
import X.C0SH1;
import X.C0SPG;
import X.C0SPY;
import X.C0SQ1;
import X.C0SQ6;
import X.C0SQA;
import X.C0SR4;
import X.C0SUC;
import X.C0SVD;
import X.C0T0Y;
import X.C0XF1;
import X.C0XPD;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1029590ctp;
import X.C10EU;
import X.C10IT;
import X.C11S5;
import X.C1233040iBy;
import X.C1233440iCc;
import X.C1234220iDs;
import X.C1336205Ku;
import X.C1349800lEI;
import X.C1360330lVH;
import X.C1374220lrg;
import X.C1375500ltk;
import X.C1386280mB8;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13LP;
import X.C14T5;
import X.C1558520qew;
import X.C1599640rjG;
import X.C15O7;
import X.C1600750rl3;
import X.C1619720sFe;
import X.C1701940uOG;
import X.C1893580zNM;
import X.C1894320zOY;
import X.C19651011uW;
import X.C19EG;
import X.C19GS;
import X.C1D0F;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C209800rQ;
import X.C21279718Pj;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2201941BFw;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2448709if;
import X.C299790Bp3;
import X.C337180DJs;
import X.C343970De7;
import X.C436260H8u;
import X.C523420Kfs;
import X.C563980MAa;
import X.C610560Nx8;
import X.C627150Oin;
import X.C631370Opb;
import X.C666690QDb;
import X.C680810Qn9;
import X.C680850QnD;
import X.C689990R4r;
import X.C706130Rmt;
import X.C708430Rqb;
import X.C720360SNm;
import X.C720890SPn;
import X.C721190SQr;
import X.C721630SSj;
import X.C721680SSo;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C727350Sg1;
import X.C729510SjV;
import X.C734070Sqr;
import X.C734960SsI;
import X.C734990SsL;
import X.C735010SsN;
import X.C735020SsO;
import X.C735370Ssx;
import X.C735410St1;
import X.C735840Sti;
import X.C737360SwA;
import X.C737560SwU;
import X.C738970Syl;
import X.C786410Ut5;
import X.C816930W2x;
import X.C844470XAv;
import X.EnumC1260930iux;
import X.InterfaceC1897260zTI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC626120Oh8;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.IncentiveShareCard;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommonCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleAvatarCell;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailTopBarAssem;
import com.ss.android.ugc.aweme.detail.ui.DetailFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescTagAssem;
import com.ss.android.ugc.aweme.feed.assem.dislike.DislikeAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.assem.stitchbutton.VideoStitchButtonAssem;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.ICellSpeedActionAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.bottom.LandscapeCellSeekBarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem;
import com.ss.android.ugc.aweme.search.detail.comment.viewmodel.SearchDetailCommentVM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive.StoryArchListCell;
import com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryNoteComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryNoteConsumptionViewModel;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardThoughtComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardAvatarViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.left.StoryHighlightsCoverComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.dislike.ImmersiveStoryDislikeAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.dislike.ImmersiveStoryUndoAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGuideUploadPanelAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsImmersiveActionService;
import com.ss.android.ugc.aweme.tag.FeedTaggedListCell;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomFixedEntrance;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomInCellEntrance;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceFixedViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssem;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ACListenerS115S0200000_11 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
            case 26:
                onClick$26(this, view);
                break;
            case 27:
                onClick$27(this, view);
                break;
            case 28:
                onClick$28(this, view);
                break;
            case 29:
                onClick$29(this, view);
                break;
            case 30:
                onClick$30(this, view);
                break;
            case 31:
                onClick$31(this, view);
                break;
            case 32:
                onClick$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onClick$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onClick$34(this, view);
                break;
            case 35:
                onClick$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onClick$36(this, view);
                break;
            case 37:
                onClick$37(this, view);
                break;
            case 38:
                onClick$38(this, view);
                break;
            case 39:
                onClick$39(this, view);
                break;
            case 40:
                onClick$40(this, view);
                break;
            case 41:
                onClick$41(this, view);
                break;
            case 42:
                onClick$42(this, view);
                break;
            case 43:
                onClick$43(this, view);
                break;
            case 44:
                onClick$44(this, view);
                break;
            case 45:
                onClick$45(this, view);
                break;
            case 46:
                onClick$46(this, view);
                break;
            case 47:
                onClick$47(this, view);
                break;
            case 48:
                onClick$48(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String eventType;
        C0SR4 c0sr4LJJLIIIJL;
        Context context = ((StoryHighlightsCoverComponent) aCListenerS115S0200000_11.l0).getContext();
        if (context == null) {
            return;
        }
        Integer numValueOf = null;
        if (!C10EU.LJIILLIIL(((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme().getAuthor())) {
            DataCenter dataCenter = ((VideoItemParams) aCListenerS115S0200000_11.l1).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "to_profile");
                return;
            }
            return;
        }
        IStoryHighlightsImmersiveActionService iStoryHighlightsImmersiveActionService = (IStoryHighlightsImmersiveActionService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsImmersiveActionService.class, false, false, false, 14, null);
        if (iStoryHighlightsImmersiveActionService == null) {
            return;
        }
        Aweme aweme = ((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI((StoryHighlightsCoverComponent) aCListenerS115S0200000_11.l0);
        IAdapterAbility iAdapterAbility = (IAdapterAbility) ((StoryHighlightsCoverComponent) aCListenerS115S0200000_11.l0).LLJLLIL.getValue();
        if (iAdapterAbility != null && (c0sr4LJJLIIIJL = iAdapterAbility.LJJLIIIJL()) != null) {
            numValueOf = Integer.valueOf(c0sr4LJJLIIIJL.getCount());
        }
        C2189821An6 c2189821An6 = (C2189821An6) ((StoryHighlightsCoverComponent) aCListenerS115S0200000_11.l0).LLJLLL.getValue();
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        iStoryHighlightsImmersiveActionService.LIZ(aweme, context, fragmentLJI, numValueOf, eventType, "click_cover", new AwS555S0100000_11((StoryHighlightsCoverComponent) aCListenerS115S0200000_11.l0, 0), new AwS590S0100000_11((StoryHighlightsCoverComponent) aCListenerS115S0200000_11.l0, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[PHI: r1
      0x005e: PHI (r1v12 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:10:0x005c, B:8:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[PHI: r1
      0x0074: PHI (r1v10 java.lang.String) = (r1v7 java.lang.String), (r1v11 java.lang.String) binds: [B:17:0x0072, B:15:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS115S0200000_11 r4, android.view.View r5) {
        /*
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            java.lang.String r0 = "aweme://user/profile/"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.Object r0 = r4.l0
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount r0 = (com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount) r0
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "uid"
            r2.withParam(r0, r1)
            java.lang.Object r0 = r4.l1
            X.0SPV r0 = (X.C0SPV) r0
            X.0SPY r0 = r0.LLJJJJLIIL
            if (r0 != 0) goto L2a
            r0 = 0
        L2a:
            java.lang.String r1 = r0.enterFrom
            java.lang.String r0 = "enter_from"
            r2.withParam(r0, r1)
            r2.open()
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r1 = "is_from_bc_video"
            java.lang.String r0 = "4"
            r4.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "to_user_id"
            r4.LJIIIIZZ(r0, r1)
            X.1D0F r3 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L5b
            java.lang.String r1 = r3.LIZ()
            if (r1 != 0) goto L5e
        L5b:
            r1 = r2
            if (r3 == 0) goto L62
        L5e:
            boolean r5 = r3.isConnected()
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.LJ(r0, r1)
            if (r3 == 0) goto L71
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L74
        L71:
            r1 = r2
            if (r3 == 0) goto L7b
        L74:
            java.lang.String r0 = r3.LIZJ()
            if (r0 == 0) goto L7b
            r2 = r0
        L7b:
            r4.LJIIIIZZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS115S0200000_11.onClick$1(Y.ACListenerS115S0200000_11, android.view.View):void");
    }

    public static final void onClick$10(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String str;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((View) aCListenerS115S0200000_11.l0).getContext());
        if (c19egLIZIZ != null) {
            AssemVMLazy assemVMLazy = ((StoryGuideUploadPanelAssem) aCListenerS115S0200000_11.l1).LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryGuideUploadPanelAssem.LLJJIJIL;
            C727350Sg1 c727350Sg1 = ((StoryViewerListViewModel) assemVMLazy.getValue()).LLILLL;
            if (c727350Sg1 == null || (str = c727350Sg1.feedEnterFrom) == null) {
                str = "";
            }
            C563980MAa.LIZ(c19egLIZIZ, "click_view_lists_panel_camera_button", str);
        }
    }

    public static final void onClick$11(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        C2189821An6 c2189821An6;
        TakoFeedRightBottomEntranceFixedViewModel takoFeedRightBottomEntranceFixedViewModelGp = ((TakoRightBottomFixedEntrance) aCListenerS115S0200000_11.l0).Gp();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoRightBottomFixedEntrance) aCListenerS115S0200000_11.l0);
        Context context = ((View) aCListenerS115S0200000_11.l1).getContext();
        C0RJN c0rjnLIZIZ = ((TakoRightBottomFixedEntrance) aCListenerS115S0200000_11.l0).jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            c2189821An6 = c0rjnLIZIZ.LIZJ;
        } else {
            c2189821An6 = null;
        }
        Aweme aweme = (Aweme) takoFeedRightBottomEntranceFixedViewModelGp.LLILLJJLI.getValue();
        if (aweme != null) {
            C14T5.LIZ(interfaceC665370Q7zLJIIL, context, c2189821An6, aweme);
        }
    }

    public static final void onClick$12(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        C2189821An6 c2189821An6;
        ITakoFeedRightBottomEntranceViewModel iTakoFeedRightBottomEntranceViewModelBp = ((TakoRightBottomInCellEntrance) aCListenerS115S0200000_11.l0).Bp();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoRightBottomInCellEntrance) aCListenerS115S0200000_11.l0);
        Context context = ((View) aCListenerS115S0200000_11.l1).getContext();
        C0RJN c0rjnLIZIZ = ((TakoRightBottomInCellEntrance) aCListenerS115S0200000_11.l0).jm().LIZIZ();
        Aweme aweme = null;
        if (c0rjnLIZIZ != null) {
            c2189821An6 = c0rjnLIZIZ.LIZJ;
        } else {
            c2189821An6 = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ((TakoRightBottomInCellEntrance) aCListenerS115S0200000_11.l0);
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        }
        iTakoFeedRightBottomEntranceViewModelBp.xQ2(interfaceC665370Q7zLJIIL, context, c2189821An6, aweme);
    }

    public static final void onClick$13(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((FeedCommonBannerProtocol) aCListenerS115S0200000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP, new C0SH1((BannerCommonAction) aCListenerS115S0200000_11.l1, 1));
    }

    public static final void onClick$14(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((FeedCommonBannerProtocol) aCListenerS115S0200000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON, new C0SH1((BannerCommonAction) aCListenerS115S0200000_11.l1, 1));
    }

    public static final void onClick$15(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        StoryArchListCell storyArchListCell = (StoryArchListCell) aCListenerS115S0200000_11.l0;
        String aid = ((C209800rQ) aCListenerS115S0200000_11.l1).LL.getAid();
        storyArchListCell.getClass();
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if ((validTopActivity instanceof C19GS) && validTopActivity != null) {
            C735840Sti.LIZ.getClass();
            C735840Sti.LIZIZ = "click";
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(validTopActivity, "aweme://story/detail");
            smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_ARCHIVE");
            smartRouteBuildRoute.withParam("enter_from", "story_archive");
            smartRouteBuildRoute.withParam("feed_param_extra", C2097608Jq.LJI(new Pair("enter_position", "video_cover")));
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aid);
            smartRouteBuildRoute.open();
        }
    }

    public static final void onClick$16(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((StoryNoteComponent) aCListenerS115S0200000_11.l0).Fp();
        StoryNoteConsumptionViewModel.vQ2("note_bubble_click", (String) ((StoryNoteComponent) aCListenerS115S0200000_11.l0).LLLFZ.getValue(), null);
        StoryNoteConsumptionViewModel.wQ2(((StoryNoteComponent) aCListenerS115S0200000_11.l0).Fp(), ((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme(), ((StoryNoteComponent) aCListenerS115S0200000_11.l0).jm(), "story_immersive_feed_bubble");
    }

    public static final void onClick$17(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((StoryNoteComponent) aCListenerS115S0200000_11.l0).Fp();
        StoryNoteConsumptionViewModel.vQ2("note_bubble_click", (String) ((StoryNoteComponent) aCListenerS115S0200000_11.l0).LLLFZ.getValue(), null);
        StoryNoteConsumptionViewModel.wQ2(((StoryNoteComponent) aCListenerS115S0200000_11.l0).Fp(), ((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme(), ((StoryNoteComponent) aCListenerS115S0200000_11.l0).jm(), "story_immersive_feed_head");
    }

    public static final void onClick$18(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String str;
        String strLIZJ;
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://user/profile/");
        boolean zIsConnected = false;
        BrandedContentAccount brandedContentAccount = (BrandedContentAccount) C13LP.LJJJLZIJ(0, (List) aCListenerS115S0200000_11.l0);
        String str2 = "";
        if (brandedContentAccount == null || (str = brandedContentAccount.userId) == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("uid", str);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("is_from_bc_video", "2");
        c2344009Gk.LJIIIIZZ("to_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C1D0F c1d0f = C1D0F.LIZ;
        if (c1d0f != null) {
            zIsConnected = c1d0f.isConnected();
        }
        c2344009Gk.LJ(Boolean.valueOf(zIsConnected), "is_casting");
        if (c1d0f != null && (strLIZJ = c1d0f.LIZJ()) != null) {
            str2 = strLIZJ;
        }
        c2344009Gk.LJIIIIZZ("casting_session_id", str2);
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        VideoDescTagAssem videoDescTagAssem = (VideoDescTagAssem) aCListenerS115S0200000_11.l1;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C21279718Pj c21279718Pj = videoDescTagAssem.LLJJL;
        if (c21279718Pj == null) {
            c21279718Pj = null;
        }
        for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, "c0.d0", PageFinder.via((View) c21279718Pj), null, 4, null).entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
    }

    public static final void onClick$19(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        Integer numValueOf;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((VideoDescTagAssem) aCListenerS115S0200000_11.l0).getContext(), "aweme://webview");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/tns-inapp/pages/ai-generated-content?hide_nav_bar=1&enter_from=");
        sbLIZ.append(((VideoItemParams) C631370Opb.LIZ((VideoDescTagAssem) aCListenerS115S0200000_11.l0)).mEventType);
        smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) C631370Opb.LIZ((VideoDescTagAssem) aCListenerS115S0200000_11.l0)).mEventType);
        c2344009Gk.LJII((Map) aCListenerS115S0200000_11.l1);
        AIGCInfo aIGCInfo = ((VideoItemParams) C631370Opb.LIZ((VideoDescTagAssem) aCListenerS115S0200000_11.l0)).getAweme().aigcInfo;
        if (aIGCInfo != null) {
            numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aigc_label_type");
        C20684815ws.LJIILLIIL("click_creator_label_aigc", c2344009Gk.LIZ);
    }

    public static final void onClick$2(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        if (C0OBG.LIZIZ(view) || ((AwemeRawAd) aCListenerS115S0200000_11.l0).getLabel().byUid == 0) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((CommerceVideoDelegateKt) aCListenerS115S0200000_11.l1).context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", String.valueOf(((AwemeRawAd) aCListenerS115S0200000_11.l0).getLabel().byUid));
        smartRouteBuildRoute.open();
    }

    public static final void onClick$20(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        AbstractC736370SuZ abstractC736370SuZ = (AbstractC736370SuZ) aCListenerS115S0200000_11.l0;
        if (abstractC736370SuZ instanceof C734960SsI) {
            C734960SsI c734960SsI = (C734960SsI) abstractC736370SuZ;
            if (c734960SsI != null) {
                c734960SsI.LJIIJ(view, (C734990SsL) aCListenerS115S0200000_11.l1);
                return;
            }
            return;
        }
        if (abstractC736370SuZ instanceof C737360SwA) {
            if (abstractC736370SuZ == null) {
                return;
            }
            abstractC736370SuZ.LJII(view);
        } else {
            if (!(abstractC736370SuZ instanceof C1374220lrg) || abstractC736370SuZ == null) {
                return;
            }
            abstractC736370SuZ.LIZIZ(view);
        }
    }

    public static final void onClick$21(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((C0S11) aCListenerS115S0200000_11.l0).LLIZ = false;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) aCListenerS115S0200000_11.l1, C343970De7.LIZ);
        C0S11 c0s11 = (C0S11) aCListenerS115S0200000_11.l0;
        c0s11.getClass();
        C15O7.LIZJ(new ACallableS63S1100000_11("close", c0s11, 0));
    }

    public static final void onClick$22(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((C0S11) aCListenerS115S0200000_11.l0).LLIZ = false;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) aCListenerS115S0200000_11.l1, C343970De7.LIZ);
        C0S11 c0s11 = (C0S11) aCListenerS115S0200000_11.l0;
        c0s11.getClass();
        C15O7.LIZJ(new ACallableS63S1100000_11("click_ok", c0s11, 0));
    }

    public static final void onClick$23(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String from;
        Object obj;
        String from2;
        Aweme aweme;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        ImmersiveStoryDislikeAssem immersiveStoryDislikeAssem = (ImmersiveStoryDislikeAssem) aCListenerS115S0200000_11.l0;
        AssemViewModel assemViewModel = (AssemViewModel) immersiveStoryDislikeAssem.LLJZ.getValue(immersiveStoryDislikeAssem, ImmersiveStoryDislikeAssem.LLL[0]);
        assemViewModel.getClass();
        assemViewModel.setState(new AwS24S0010000_9(false, 16));
        C0SVD c0svd = C0SVD.LL;
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme());
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) aCListenerS115S0200000_11.l1).baseFeedPageParams;
        User author = null;
        if (baseFeedPageParams != null && (c2189821An62 = baseFeedPageParams.param) != null) {
            from = c2189821An62.getFrom();
        } else {
            from = null;
        }
        c0svd.LJ(C1600750rl3.LIZJ(from), authorUid);
        ImmersiveStoryDislikeAssem immersiveStoryDislikeAssem2 = (ImmersiveStoryDislikeAssem) aCListenerS115S0200000_11.l0;
        C786410Ut5.LJLIIL(1500L, (Handler) immersiveStoryDislikeAssem2.LLJZIJLIL.getValue(), new ARunnableS111S0100000_11(immersiveStoryDislikeAssem2, 110));
        C724270Sb3 c724270Sb3 = ((ImmersiveStoryDislikeAssem) aCListenerS115S0200000_11.l0).LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj).baseFeedPageParams;
        if (baseFeedPageParams2 != null && (c2189821An6 = baseFeedPageParams2.param) != null) {
            from2 = c2189821An6.getFrom();
        } else {
            from2 = null;
        }
        String strLIZIZ = C1600750rl3.LIZIZ(from2);
        EnumC1260930iux enumC1260930iux = EnumC1260930iux.DISLIKE;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS115S0200000_11.l1;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            author = aweme.getAuthor();
        }
        c0svd.LJFF(strLIZIZ, "story_immersive_feed", enumC1260930iux, author, null, false);
    }

    public static final void onClick$24(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String from;
        C2189821An6 c2189821An6;
        ImmersiveStoryUndoAssem immersiveStoryUndoAssem = (ImmersiveStoryUndoAssem) aCListenerS115S0200000_11.l0;
        AssemViewModel assemViewModel = (AssemViewModel) immersiveStoryUndoAssem.LLJZ.getValue(immersiveStoryUndoAssem, ImmersiveStoryUndoAssem.LLJZIJLIL[0]);
        assemViewModel.getClass();
        assemViewModel.setState(new AwS24S0010000_9(true, 16));
        C0SVD c0svd = C0SVD.LL;
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme());
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) aCListenerS115S0200000_11.l1).baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        int iLIZJ = C1600750rl3.LIZJ(from);
        c0svd.getClass();
        if (authorUid != null) {
            C0SVD.LLILLJJLI.remove(authorUid);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C610560Nx8(iLIZJ, authorUid, null), 3);
        }
    }

    public static final void onClick$25(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((FeedCommonBannerProtocol) aCListenerS115S0200000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP, new C0SH1((BannerCommonAction) aCListenerS115S0200000_11.l1, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$26(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String str;
        String str2;
        String str3;
        ReactionBubbleCommonCell reactionBubbleCommonCell = (ReactionBubbleCommonCell) aCListenerS115S0200000_11.l0;
        C0SQ6 c0sq6 = (C0SQ6) aCListenerS115S0200000_11.l1;
        User user = c0sq6.LLILLJJLI;
        C0SQ1 c0sq1 = c0sq6.LLILZLL;
        reactionBubbleCommonCell.getClass();
        if (!C10EU.LJIIZILJ(user.getUid())) {
            if (c0sq1 != null) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                C19651011uW c19651011uW = C19651011uW.LIZIZ;
                C735410St1 c735410St1 = new C735410St1();
                c735410St1.LJIJI(c0sq1.LIZ);
                String str4 = c0sq1.LIZIZ;
                if (str4 == null) {
                    str4 = "";
                }
                c735410St1.LIZLLL = str4;
                c735410St1.LJJLIIIJILLIZJL = "click_head";
                c735410St1.LJJZZIII = "bullet";
                c735410St1.LJL = "bullet";
                c735410St1.LJJJLL = user.getFollowStatus();
                Object objLJIIIZ = c19651011uW.LJIIIZ(c0sq1.LIZ, c735410St1);
                Aweme aweme = c0sq1.LIZ;
                c735840Sti.getClass();
                C735840Sti.LIZIZ(aweme, objLJIIIZ);
                ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
            }
            Pair[] pairArr = new Pair[4];
            Aweme aweme2 = null;
            if (c0sq1 != null) {
                str = c0sq1.LIZIZ;
            } else {
                str = null;
            }
            pairArr[0] = new Pair(str, "enter_from");
            C0SQ6 c0sq62 = (C0SQ6) reactionBubbleCommonCell.getItem();
            if (c0sq62 != null) {
                str2 = c0sq62.LLILZIL;
            } else {
                str2 = null;
            }
            pairArr[1] = new Pair(str2, "notice_type");
            if (c0sq1 != null) {
                aweme2 = c0sq1.LIZ;
            }
            if (C729510SjV.LJJ(aweme2)) {
                str3 = "story";
            } else {
                str3 = "post";
            }
            pairArr[2] = new Pair(str3, "story_type");
            pairArr[3] = new Pair(user.getUid(), "from_user_id");
            C20684815ws.LJIJI("interaction_bullet_click", pairArr);
            Context context = reactionBubbleCommonCell.itemView.getContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://user/profile/");
            sbLIZ.append(user.getUid());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
            smartRouteBuildRoute.open();
        }
    }

    public static final void onClick$27(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((ReactionBubbleDescriptionCell) aCListenerS115S0200000_11.l0).N5((C720890SPn) aCListenerS115S0200000_11.l1);
    }

    public static final void onClick$28(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ReactionBubbleDescriptionCell reactionBubbleDescriptionCell = (ReactionBubbleDescriptionCell) aCListenerS115S0200000_11.l0;
        C720890SPn c720890SPn = (C720890SPn) aCListenerS115S0200000_11.l1;
        reactionBubbleDescriptionCell.L5(c720890SPn.LLILLJJLI, c720890SPn.LLILZIL);
    }

    public static final void onClick$29(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ReactionBubbleDescriptionCell reactionBubbleDescriptionCell = (ReactionBubbleDescriptionCell) aCListenerS115S0200000_11.l0;
        C720890SPn c720890SPn = (C720890SPn) aCListenerS115S0200000_11.l1;
        reactionBubbleDescriptionCell.L5(c720890SPn.LLILLJJLI, c720890SPn.LLILZIL);
    }

    public static final void onClick$3(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        C19EG activity;
        DetailFeedVideoViewHolder detailFeedVideoViewHolder = (DetailFeedVideoViewHolder) aCListenerS115S0200000_11.l0;
        Aweme aweme = (Aweme) aCListenerS115S0200000_11.l1;
        Fragment fragment = detailFeedVideoViewHolder.LLJJIII;
        if (fragment != null && (activity = fragment.getActivity()) != null && !C0XF1.LIZLLL(activity)) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        } else {
            if (aweme == null) {
                return;
            }
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                detailFeedVideoViewHolder.p1(aweme);
                return;
            }
            String from = C0SUC.LIZ(detailFeedVideoViewHolder.LLLLLLLLLL).getFrom();
            C19EG activity2 = detailFeedVideoViewHolder.getActivity();
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("group_id", aweme.getAid(), c627150Oin.LIZ);
            C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin.LIZ);
            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aweme.getAid()), c627150Oin.LIZ);
            C0XPD.LIZIZ(activity2, from, "click_favorite_video", c627150Oin.LIZ, null);
            detailFeedVideoViewHolder.p1(aweme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[PHI: r1
      0x0065: PHI (r1v13 java.lang.String) = (r1v6 java.lang.String), (r1v14 java.lang.String) binds: [B:12:0x0063, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[PHI: r1
      0x007b: PHI (r1v11 java.lang.String) = (r1v8 java.lang.String), (r1v12 java.lang.String) binds: [B:19:0x0079, B:17:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$30(Y.ACListenerS115S0200000_11 r4, android.view.View r5) {
        /*
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            java.lang.String r0 = "aweme://user/profile/"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.Object r0 = r4.l0
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount r0 = (com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount) r0
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "uid"
            r2.withParam(r0, r1)
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r0 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r0
            X.0zJl r0 = r0.getItem()
            X.0SPn r0 = (X.C720890SPn) r0
            if (r0 == 0) goto L8d
            X.0SQ1 r0 = r0.LLILZIL
            if (r0 == 0) goto L8d
            java.lang.String r1 = r0.LIZIZ
        L33:
            java.lang.String r0 = "enter_from"
            r2.withParam(r0, r1)
            r2.open()
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r1 = "is_from_bc_video"
            java.lang.String r0 = "3"
            r4.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "to_user_id"
            r4.LJIIIIZZ(r0, r1)
            X.1D0F r3 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L62
            java.lang.String r1 = r3.LIZ()
            if (r1 != 0) goto L65
        L62:
            r1 = r2
            if (r3 == 0) goto L69
        L65:
            boolean r5 = r3.isConnected()
        L69:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.LJ(r0, r1)
            if (r3 == 0) goto L78
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L7b
        L78:
            r1 = r2
            if (r3 == 0) goto L82
        L7b:
            java.lang.String r0 = r3.LIZJ()
            if (r0 == 0) goto L82
            r2 = r0
        L82:
            r4.LJIIIIZZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L8d:
            r1 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS115S0200000_11.onClick$30(Y.ACListenerS115S0200000_11, android.view.View):void");
    }

    public static final void onClick$31(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        TaggedPeopleAvatarCell taggedPeopleAvatarCell = (TaggedPeopleAvatarCell) aCListenerS115S0200000_11.l0;
        C0SQA c0sqa = (C0SQA) aCListenerS115S0200000_11.l1;
        User user = c0sqa.LL;
        Context context = taggedPeopleAvatarCell.itemView.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(user.getUid());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.open();
        C0SPY c0spy = c0sqa.LLILLJJLI;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LJIJI(c0spy.aweme);
        String str = c0spy.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c735410St1.LIZLLL = str;
        c735410St1.LJJLIIIJILLIZJL = "tag";
        c735410St1.LJJLIIJ = user.getUid();
        c735410St1.LJJLIIIJLJLI = c0spy.awemeId;
        c735410St1.LJJLIIIJLLLLLLLZ = c0spy.authorUid;
        Object objLJIIIZ = c19651011uW.LJIIIZ(c0spy.aweme, c735410St1);
        Aweme aweme = c0spy.aweme;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0sqa.LLILLJJLI.enterFrom);
        String str3 = c0sqa.LLILLJJLI.awemeId;
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        String str4 = c0sqa.LLILLJJLI.authorUid;
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", str4);
        String uid = c0sqa.LL.getUid();
        if (uid != null) {
            str2 = uid;
        }
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("click_type", "click_head");
        c2344009Gk.LJIIIIZZ("anchor_type", "low_interest");
        C20684815ws.LJIILLIIL("click_tagged_user", c2344009Gk.LIZ);
    }

    public static final void onClick$32(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        AbstractC737180Svs abstractC737180Svs = (AbstractC737180Svs) aCListenerS115S0200000_11.l0;
        if (abstractC737180Svs instanceof C734070Sqr) {
            ((LongPressAwemeFragment) aCListenerS115S0200000_11.l1).LLJJLIIIJLLLLLLLZ = true;
        }
        abstractC737180Svs.LJJ();
    }

    public static final void onClick$33(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String secUid;
        FriendsDetailTopBarAssem friendsDetailTopBarAssem = (FriendsDetailTopBarAssem) aCListenerS115S0200000_11.l0;
        Aweme aweme = (Aweme) aCListenerS115S0200000_11.l1;
        if (aweme == null) {
            friendsDetailTopBarAssem.getClass();
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(friendsDetailTopBarAssem.getContext(), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", AwemeExtKt.getAuthorUid(aweme));
        User author = aweme.getAuthor();
        if (author != null) {
            secUid = author.getSecUid();
        } else {
            secUid = null;
        }
        smartRouteBuildRoute.withParam("sec_user_id", secUid);
        smartRouteBuildRoute.withParam("video_id", aweme.getAid());
        smartRouteBuildRoute.withParam("enter_from", "homepage_friends");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "homepage_friends");
        smartRouteBuildRoute.withParam("enter_method", "click_name");
        smartRouteBuildRoute.open();
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = "homepage_friends";
        c735410St1.LJJLIIIJILLIZJL = "click_name";
        c735410St1.LJIJI(aweme);
        c735410St1.LJJJLZIJ = "post";
        c735410St1.LJJLIIIJLLLLLLLZ = aweme.getAuthor().getUid();
        c735410St1.LJJJLL = aweme.getAuthor().getFollowStatus();
        c735410St1.LJJLIIJ = aweme.getAuthor().getUid();
        C1599640rjG.LIZIZ.Ou(c735410St1, new C1360330lVH(C1389300mG0.LIZIZ(C724240Sb0.LJI(friendsDetailTopBarAssem)), null, null, null, 14));
        c735410St1.LJIILJJIL();
    }

    public static final void onClick$34(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ICellSpeedActionAbility iCellSpeedActionAbility = (ICellSpeedActionAbility) C1558520qew.LIZ(C1558520qew.LJIIL((LandscapeCellSeekBarAssem) aCListenerS115S0200000_11.l0), ICellSpeedActionAbility.class, null);
        if (iCellSpeedActionAbility != null) {
            iCellSpeedActionAbility.wi2();
        }
        DataCenter dataCenter = ((VideoItemParams) aCListenerS115S0200000_11.l1).dataCenter;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "enter_play_mode");
        }
    }

    public static final void onClick$35(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        Aweme aweme;
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) aCListenerS115S0200000_11.l0;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS115S0200000_11.l1;
        videoRelationBtnAssem.getClass();
        if (C299790Bp3.LIZIZ(videoRelationBtnAssem.LLL, "bottom_button_user_suggestion")) {
            videoRelationBtnAssem.Ap(false);
        }
        if (videoRelationBtnAssem.LLJLLIL != null && (aweme = videoRelationBtnAssem.LLL) != null) {
            String str = videoItemParams.mEventType;
            if (str == null) {
                str = "homepage_hot";
            }
            C0T0Y.LIZJ(aweme, true);
            new C735010SsN(aweme, str).LIZ();
            if (C816930W2x.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2448709if(videoItemParams, null), 3);
            }
        }
    }

    public static final void onClick$36(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        IFeedAdService iFeedAdService;
        C708430Rqb c708430Rqb = (C708430Rqb) aCListenerS115S0200000_11.l0;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS115S0200000_11.l1;
        c708430Rqb.getClass();
        boolean zLL = C1017070cZd.LL(videoItemParams.getAweme());
        if (!AwemeExtKt.isAdTraffic(videoItemParams.getAweme()) && zLL) {
            if (view != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131824738);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LIZJ(((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme());
        Fragment fragment = ((VideoItemParams) aCListenerS115S0200000_11.l1).fragment;
        if (fragment != null && (iFeedAdService = (IFeedAdService) PluggableExtentionKt.pluggableSpi$default(IFeedAdService.class, false, false, false, 14, null)) != null) {
            iFeedAdService.setEnterFrom(fragment.getClass().getSimpleName());
        }
        AwemeRawAd awemeRawAd = ((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme().getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.setBtmPageId(BtmSDK.INSTANCE.getPageId(PageFinder.via(((VideoItemParams) aCListenerS115S0200000_11.l1).fragment)));
            awemeRawAd.setSponsored(true);
        }
        ((IAdOpenHelper) ServiceManager.get().getService(IAdOpenHelper.class)).LIZ(((C708430Rqb) aCListenerS115S0200000_11.l0).LIZ, ((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme(), 1);
    }

    public static final void onClick$37(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String mid;
        int videoLength;
        String str;
        C19EG c19eg;
        C0SPG c0spg = (C0SPG) aCListenerS115S0200000_11.l0;
        Aweme aweme = (Aweme) aCListenerS115S0200000_11.l1;
        c0spg.getClass();
        if (!C0SPG.LIZIZ(aweme)) {
            if ((C720360SNm.LJIIIZ((Aweme) aCListenerS115S0200000_11.l1) || C10IT.LJII((Aweme) aCListenerS115S0200000_11.l1)) && (c19eg = ((C0SPG) aCListenerS115S0200000_11.l0).LL.LIZIZ) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIIZ(2131839802);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        C0SPG c0spg2 = (C0SPG) aCListenerS115S0200000_11.l0;
        Aweme aweme2 = (Aweme) aCListenerS115S0200000_11.l1;
        c0spg2.getClass();
        if (aweme2.getMusic() != null && !TextUtils.isEmpty(aweme2.getMusic().getMid())) {
            mid = aweme2.getMusic().getMid();
        } else {
            mid = "";
        }
        Video video = aweme2.getVideo();
        if (video != null) {
            videoLength = video.getVideoLength();
        } else {
            videoLength = 0;
        }
        String string = UUID.randomUUID().toString();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c0spg2.LL.LIZIZ, "aweme://music/detail/");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, mid);
        smartRouteBuildRoute.withParam("aweme_id", aweme2.getAid());
        PostModeDetailParams postModeDetailParams = c0spg2.LL.LJII;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("extra_music_from", str);
        smartRouteBuildRoute.withParam("sticker_id", aweme2.getStickerIDs());
        C1386280mB8.LIZ(smartRouteBuildRoute, aweme2);
        smartRouteBuildRoute.withParam("process_id", string);
        smartRouteBuildRoute.withParam("extra_video_length", videoLength);
        smartRouteBuildRoute.withParam("aweme_type", aweme2.getAwemeType());
        smartRouteBuildRoute.open(10086);
        FullPageParam fullPageParam = new FullPageParam(aweme2, c0spg2.LL.LJII, new ArrayList(), false);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        C19EG c19eg2 = c0spg2.LL.LIZIZ;
        c721190SQr.getClass();
        C721190SQr.LJIIZILJ(mid, c19eg2, fullPageParam);
    }

    public static final void onClick$38(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        final C721630SSj c721630SSj = (C721630SSj) aCListenerS115S0200000_11.l0;
        final Context context = (Context) aCListenerS115S0200000_11.l1;
        c721630SSj.getClass();
        if (!C0XF1.LIZLLL(context)) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
        } else {
            final Aweme aweme = c721630SSj.LIZ.LIZJ;
            if (aweme != null && aweme.getReportMaskInfo() != null) {
                C735020SsO c735020SsO = C735020SsO.LIZ;
                String aid = aweme.getAid();
                Integer num = aweme.getReportMaskInfo().maskType;
                Integer num2 = aweme.getReportMaskInfo().status;
                c735020SsO.getClass();
                C735020SsO.LIZIZ.LIZ(aid, num, num2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<BaseResponse>() { // from class: X.0SXj
                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                        String errorMsg;
                        if (th instanceof C0XIR) {
                            C0XIR c0xir = (C0XIR) th;
                            if (TextUtils.isEmpty(c0xir.getErrorMsg())) {
                                errorMsg = context.getString(2131837958);
                            } else {
                                errorMsg = c0xir.getErrorMsg();
                            }
                            C844470XAv.LIZ.getClass();
                            C1233040iBy c1233040iBy2 = new C1233040iBy(C844470XAv.LIZ());
                            c1233040iBy2.LIZJ(errorMsg);
                            c1233040iBy2.LIZLLL();
                            C735020SsO c735020SsO2 = C735020SsO.LIZ;
                            String str = ((BaseResponse) c0xir.getRawResponse()).extra.logid;
                            String strValueOf = String.valueOf(((BaseResponse) c0xir.getRawResponse()).status_code);
                            c735020SsO2.getClass();
                            C735020SsO.LIZIZ(str, strValueOf);
                            return;
                        }
                        C844470XAv.LIZ.getClass();
                        C1233040iBy c1233040iBy3 = new C1233040iBy(C844470XAv.LIZ());
                        c1233040iBy3.LIZIZ(2131837958);
                        c1233040iBy3.LIZLLL();
                        C735020SsO.LIZ.getClass();
                        C735020SsO.LIZ(1);
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(BaseResponse baseResponse) {
                        String aid2;
                        BaseResponse baseResponse2 = baseResponse;
                        int i = baseResponse2.status_code;
                        if (i == 0) {
                            c721630SSj.LIZ.LIZJ.setReportMaskInfo(new VideoMaskInfo(Boolean.FALSE, 0, null, null, null, "", "", "", null));
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                            c721630SSj.LIZIZ(false, new VideoMaskInfo(Boolean.FALSE, 0, null, null, null, "", "", "", null));
                            InterfaceC721020SQa interfaceC721020SQa = c721630SSj.LIZLLL;
                            if (interfaceC721020SQa != null) {
                                interfaceC721020SQa.LIZ();
                            }
                            C721630SSj c721630SSj2 = c721630SSj;
                            c721630SSj2.getClass();
                            Aweme aweme2 = c721630SSj2.LIZ.LIZJ;
                            if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
                                aid2 = "";
                            }
                            C1440005kM.LIZ(new C0RO7(false, aid2, false));
                            C1440005kM.LIZ(new C716550S8v(false));
                            C735020SsO.LIZ.getClass();
                            C735020SsO.LIZ(0);
                            return;
                        }
                        BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse2.extra;
                        if (serverTimeExtra == null) {
                            return;
                        }
                        C735020SsO c735020SsO2 = C735020SsO.LIZ;
                        String str = serverTimeExtra.logid;
                        String strValueOf = String.valueOf(i);
                        c735020SsO2.getClass();
                        C735020SsO.LIZIZ(str, strValueOf);
                    }
                });
            }
        }
        ((C721630SSj) aCListenerS115S0200000_11.l0).LIZ("showpost_click");
    }

    public static final void onClick$39(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String aid = ((VideoItemParams) aCListenerS115S0200000_11.l0).getAweme().getAid();
        Keva keva = (Keva) C0RZ7.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_replace_music_close");
        sbLIZ.append(aid);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        ViewGroup viewGroup = ((ReplaceMusicBottomBarAssem) aCListenerS115S0200000_11.l1).LLJLLL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
    }

    public static final void onClick$4(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11((VideoItemParams) aCListenerS115S0200000_11.l0, (ReportViewAssem) aCListenerS115S0200000_11.l1, 17);
        ReportViewAssem.AppDiffProtocol.LIZ.getClass();
        C0RQ0.LIZIZ.getValue().LJIILIIL();
        awS412S0200000_11.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$40(Y.ACListenerS115S0200000_11 r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS115S0200000_11.onClick$40(Y.ACListenerS115S0200000_11, android.view.View):void");
    }

    public static final void onClick$41(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((FeedTaggedListCell) aCListenerS115S0200000_11.l0).I5((User) aCListenerS115S0200000_11.l1);
        ((FeedTaggedListCell) aCListenerS115S0200000_11.l0).L5().wQ2(((User) aCListenerS115S0200000_11.l1).getUid(), "click_head");
    }

    public static final void onClick$42(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((FeedTaggedListCell) aCListenerS115S0200000_11.l0).I5((User) aCListenerS115S0200000_11.l1);
    }

    public static final void onClick$43(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((C737560SwU) aCListenerS115S0200000_11.l0).setCloseType("delete");
        ((Function0) aCListenerS115S0200000_11.l1).invoke();
    }

    public static final void onClick$44(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((C737560SwU) aCListenerS115S0200000_11.l0).setCloseType("confirm");
        ((Function0) aCListenerS115S0200000_11.l1).invoke();
    }

    public static final void onClick$45(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((DislikeAssem) aCListenerS115S0200000_11.l0).Fp((VideoItemParams) aCListenerS115S0200000_11.l1);
    }

    public static final void onClick$46(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((DislikeAssem) aCListenerS115S0200000_11.l0).Fp((VideoItemParams) aCListenerS115S0200000_11.l1);
    }

    public static final void onClick$47(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        int i = ((IncentiveShareCard) aCListenerS115S0200000_11.l0).LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_position", "share");
        c1894320zOY.getClass();
        C1894320zOY.LJIILJJIL(i, linkedHashMap, null, null, null);
        Map<String, String> mapLIZIZ = C1894320zOY.LIZIZ(((C721680SSo) aCListenerS115S0200000_11.l1).LJIJ, "feed_card", "feed_card", "homepage");
        mapLIZIZ.put("module_form", "share_button");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("invite_button_click", mapLIZIZ);
        }
        C721680SSo c721680SSo = (C721680SSo) aCListenerS115S0200000_11.l1;
        c721680SSo.getClass();
        C15O7.LIZJ(new ACallableS95S0101000_11(c721680SSo, 0, 1));
        C0R5H c0r5h = ((C721680SSo) aCListenerS115S0200000_11.l1).LJIJI;
        if (c0r5h != null) {
            ((C689990R4r) c0r5h).LIZ.LLZL.zQ2(null, "incentive_share_click");
        }
    }

    public static final void onClick$48(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String str;
        FeedButton feedButton;
        IncentiveShareCard incentiveShareCard = (IncentiveShareCard) aCListenerS115S0200000_11.l0;
        if (incentiveShareCard != null && (feedButton = incentiveShareCard.detailButton) != null) {
            str = feedButton.jumpLink;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            C721680SSo c721680SSo = (C721680SSo) aCListenerS115S0200000_11.l1;
            Context context = c721680SSo.LJIJJ;
            if (context != null) {
                IncentiveShareCard incentiveShareCard2 = (IncentiveShareCard) aCListenerS115S0200000_11.l0;
                C1893580zNM c1893580zNM = C1893580zNM.LIZ;
                Integer numValueOf = Integer.valueOf(incentiveShareCard2.LIZ);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = incentiveShareCard2.LIZIZ;
                if (str3 != null) {
                    str2 = str3;
                }
                C1893580zNM.LJ(c1893580zNM, context, numValueOf, str, str2, false, incentiveShareCard2.LJ, null, c721680SSo.LJIJ, 64);
            }
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i = ((IncentiveShareCard) aCListenerS115S0200000_11.l0).LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("click_position", "view_detail");
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(i, linkedHashMap, null, null, null);
        }
        C721680SSo c721680SSo2 = (C721680SSo) aCListenerS115S0200000_11.l1;
        c721680SSo2.getClass();
        C15O7.LIZJ(new ACallableS95S0101000_11(c721680SSo2, 0, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$5(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        boolean z;
        C1233440iCc c1233440iCcLIZLLL;
        Aweme aweme;
        User sharer;
        AwemeRawAd awemeRawAd;
        Intent intent;
        IMUser iMUserLIZJ;
        String str;
        User userYQ2;
        VideoExposeSharerInformationVM videoExposeSharerInformationVMFp = ((VideoExposeSharerInformationAssem) aCListenerS115S0200000_11.l0).Fp();
        videoExposeSharerInformationVMFp.getClass();
        if (!C1336205Ku.LIZJ().LIZJ() && (userYQ2 = videoExposeSharerInformationVMFp.yQ2()) != null && userYQ2.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        Activity activityLIZ = null;
        String string = null;
        if (z) {
            VideoExposeSharerInformationVM videoExposeSharerInformationVMFp2 = ((VideoExposeSharerInformationAssem) aCListenerS115S0200000_11.l0).Fp();
            User userYQ22 = videoExposeSharerInformationVMFp2.yQ2();
            if (userYQ22 != null) {
                IMUser.Companion.getClass();
                iMUserLIZJ = C2201941BFw.LIZJ(userYQ22);
            } else {
                iMUserLIZJ = null;
            }
            String str2 = ((C0S2L) videoExposeSharerInformationVMFp2.getState()).LLILZLL;
            Context context = videoExposeSharerInformationVMFp2.getContext();
            if (context != null) {
                string = context.getString(2131837236);
            }
            if (Intrinsics.LJFF(str2, string)) {
                str = "message";
            } else {
                str = "sayhi";
            }
            EnterChatParams enterChatParams = new EnterChatParams(videoExposeSharerInformationVMFp2.getContext(), iMUserLIZJ);
            enterChatParams.setEnterFromForMob("share_user_info_card");
            enterChatParams.setEnterMethodForMob("share");
            enterChatParams.setButtonType(str);
            IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
            if (iMUserLIZJ != null) {
                if (iIMServiceLIZ.getImSayHiService().LJ(iMUserLIZJ.getUid(), true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(r8), false)) {
                    videoExposeSharerInformationVMFp2.BQ2(iMUserLIZJ.getUid(), "click");
                    String uid = iMUserLIZJ.getUid();
                    if (uid != null) {
                        iIMServiceLIZ.getImSayHiService().LIZLLL(videoExposeSharerInformationVMFp2.getContext(), uid, iMUserLIZJ.getDisplayName(), true, C2097608Jq.LJIIJ(new Pair("enter_from", "share_user_info_card"), new Pair("message_type", "emoji"), new Pair("message_from", "greeting_button")), true, null, new AwS412S0200000_11(iIMServiceLIZ, enterChatParams, 97));
                        videoExposeSharerInformationVMFp2.setState(new AwS62S1000000_11(C20642515q3.LJI(2131837236), 17));
                        return;
                    }
                }
            }
            iIMServiceLIZ.getImChatService().LJIILLIIL(enterChatParams, null);
            videoExposeSharerInformationVMFp2.setState(new AwS62S1000000_11(C20642515q3.LJI(2131837236), 17));
            return;
        }
        Activity activityLIZ2 = C1388190mED.LIZ(((View) aCListenerS115S0200000_11.l1).getContext());
        if (activityLIZ2 != null && (intent = activityLIZ2.getIntent()) != null) {
            c1233440iCcLIZLLL = C1234220iDs.LIZLLL(intent);
        } else {
            c1233440iCcLIZLLL = null;
        }
        VideoExposeSharerInformationVM videoExposeSharerInformationVMFp3 = ((VideoExposeSharerInformationAssem) aCListenerS115S0200000_11.l0).Fp();
        AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11((VideoExposeSharerInformationAssem) aCListenerS115S0200000_11.l0, c1233440iCcLIZLLL, 19);
        VideoItemParams item = videoExposeSharerInformationVMFp3.getItem();
        if (item != null && (aweme = item.getAweme()) != null && (sharer = AwemeBizExtKt.getSharer(aweme)) != null && !AwemeExtKt.isDelete(aweme) && !Intrinsics.LJFF(sharer.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            if (AwemeExtKt.isAdTraffic(aweme) && !C1017070cZd.LLF(aweme)) {
                C1029590ctp.LIZLLL().LJJIII(videoExposeSharerInformationVMFp3.getContext(), aweme);
                C2184171Adz.LIZLLL("draw_ad", "follow", aweme.getAwemeRawAd()).LJIIIIZZ();
            }
            if ((C1017070cZd.LJLJJLL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getDisableFollowToClick() == 0) || C1017070cZd.LLF(aweme)) {
                C1029590ctp.LIZLLL().LJIILLIIL(videoExposeSharerInformationVMFp3.getContext(), aweme);
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                Context context2 = videoExposeSharerInformationVMFp3.getContext();
                if (context2 != null) {
                    activityLIZ = C1388190mED.LIZ(context2);
                }
                String str3 = videoExposeSharerInformationVMFp3.eventType;
                if (str3 == null) {
                    str3 = "";
                }
                C627150Oin c627150Oin = new C627150Oin();
                C786410Ut5.LJJJI("group_id", aweme.getAid(), c627150Oin.LIZ);
                C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin.LIZ);
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aweme.getAid()), c627150Oin.LIZ);
                C0XPD.LIZIZ(activityLIZ, str3, "click_follow", c627150Oin.LIZ, new C738970Syl(awS412S0200000_11, 2));
            } else {
                awS412S0200000_11.invoke();
            }
        }
        ((VideoExposeSharerInformationAssem) aCListenerS115S0200000_11.l0).Fp().EQ2("follow");
    }

    public static final void onClick$6(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        Object obj;
        VideoStitchButtonAssem videoStitchButtonAssem = (VideoStitchButtonAssem) aCListenerS115S0200000_11.l0;
        View view2 = (View) aCListenerS115S0200000_11.l1;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(videoStitchButtonAssem)).getAweme();
        if (aweme != null) {
            if (C1017070cZd.LJJLIL(aweme)) {
                C1389890mGx c1389890mGx = new C1389890mGx(view2);
                c1389890mGx.LJIIIZ(2131824739);
                c1389890mGx.LJIIJJI();
                return;
            }
            Context context = view2.getContext();
            C724270Sb3 c724270Sb3 = videoStitchButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str = ((VideoItemParams) obj).mEventType;
            if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(context)) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZJ("Camera is only available in the single screen mod");
                c1233040iBy.LIZLLL();
                return;
            }
            Activity activityLJII = C1375500ltk.LJII(context);
            if (activityLJII == null) {
                return;
            }
            C706130Rmt.LIZ.getClass();
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3 || C0C64.LJIILLIIL().LJIJ(31744, 0, "show_stitch_button_on_player", true) != 1) {
                return;
            }
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJIL(aweme, activityLJII, str, String.valueOf(true));
        }
    }

    public static final void onClick$7(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        String str;
        final Comment comment;
        C680810Qn9<C680850QnD> c680810Qn9;
        Comment comment2;
        Aweme aweme;
        SearchDetailCommentVM searchDetailCommentVMFp = ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0).Fp();
        Context context = ((View) aCListenerS115S0200000_11.l1).getContext();
        Fragment fragmentLJI = C724240Sb0.LJI((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0);
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0);
        searchDetailCommentVMFp.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (comment2 = searchDetailCommentVMFp.getState().LL) != null && (aweme = videoItemParams.getAweme()) != null) {
            C666690QDb.LJIIZILJ = comment2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(comment2.getCid());
            CommentService.LIZ.getClass();
            CommentService commentServiceLIZ = C523420Kfs.LIZ();
            C1349800lEI c1349800lEI = new C1349800lEI(aweme.getAid());
            c1349800lEI.setAuthorUid(AwemeExtKt.getAuthorUid(aweme));
            boolean z = false;
            c1349800lEI.setInsertCids(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), false, true);
            c1349800lEI.setLocatePageType(1);
            c1349800lEI.setEventType(videoItemParams.mEventType);
            c1349800lEI.setEnableComment(!aweme.isCmtSwt());
            c1349800lEI.setAdCommentStruct(AwemeExtKt.getAdCommentStruct(aweme));
            c1349800lEI.setCommentClose(commentServiceLIZ.LJIILLIIL(aweme));
            if (commentServiceLIZ.LJIILLIIL(aweme) && !commentServiceLIZ.LJJIJIIJIL(aweme)) {
                z = true;
            }
            c1349800lEI.setCommentLimited(z);
            c1349800lEI.setEnterMethod("click_comment_external_exposure");
            c1349800lEI.setEnterFullScreen(true);
            c1349800lEI.forceRefresh(true);
            commentServiceLIZ.LJJL(c19egLIZIZ, fragmentLJI, aweme, c1349800lEI);
        }
        SearchDetailCommentVM searchDetailCommentVMFp2 = ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0).Fp();
        final Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0)).getAweme();
        BaseSearchVideoDetailCommentAssem baseSearchVideoDetailCommentAssem = (BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0;
        C436260H8u c436260H8u = baseSearchVideoDetailCommentAssem.LLLFF;
        if (c436260H8u != null) {
            str = c436260H8u.LIZ;
        } else {
            str = null;
        }
        boolean zIp = baseSearchVideoDetailCommentAssem.Ip();
        searchDetailCommentVMFp2.getClass();
        if (aweme2 != null && str != null && (comment = searchDetailCommentVMFp2.getState().LL) != null) {
            if (zIp) {
                c680810Qn9 = new C680810Qn9<C680850QnD>(comment, aweme2) { // from class: X.0QnC
                };
            } else {
                c680810Qn9 = new C680810Qn9<C680850QnD>(comment, aweme2) { // from class: X.0QnD
                };
            }
            searchDetailCommentVMFp2.vQ2(c680810Qn9);
            c680810Qn9.LJIIZILJ("show_text", str);
            c680810Qn9.LJIIZILJ("show_text_length", String.valueOf(str.length()));
            c680810Qn9.LJIILJJIL();
        }
        ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0).Fp().wQ2(((VideoItemParams) C631370Opb.LIZ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0)).getAweme(), System.currentTimeMillis(), C724240Sb0.LJI((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0), (VideoItemParams) C631370Opb.LIZ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0));
        C337180DJs.LIZ(((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0).LJJIJL());
        AnonymousClass0956 anonymousClass0956 = ((BaseSearchVideoDetailCommentAssem) aCListenerS115S0200000_11.l0).LLLFZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void onClick$8(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((FeedCommonBannerProtocol) aCListenerS115S0200000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP, new C0SH1((BannerCommonAction) aCListenerS115S0200000_11.l1, 1));
    }

    public static final void onClick$9(ACListenerS115S0200000_11 aCListenerS115S0200000_11, View view) {
        ((StoryGuideCardThoughtComponent) aCListenerS115S0200000_11.l0).Fp().vQ2("story_card_bubble");
        StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = ((StoryGuideCardThoughtComponent) aCListenerS115S0200000_11.l0).Fp();
        storyGuideCardAvatarViewModelFp.getClass();
        storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(783));
        ((StoryGuideCardThoughtComponent) aCListenerS115S0200000_11.l0).Tp(((VideoItemParams) aCListenerS115S0200000_11.l1).getAweme(), false);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS115S0200000_11(com.ss.android.ugc.aweme.feed.model.VideoItemParams r2, com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssem r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 39 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS115S0200000_11.<init>(com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssem, int):void");
    }

    public ACListenerS115S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
