package Y;

import X.AbstractC1153360g7S;
import X.AbstractC1255880imo;
import X.AbstractC1557360qd4;
import X.AbstractC1586100rNQ;
import X.AbstractC19486711Lt;
import X.C01VW;
import X.C01VZ;
import X.C05XL;
import X.C09JN;
import X.C0DMM;
import X.C0N0Y;
import X.C0NBD;
import X.C0S4U;
import X.C0VNS;
import X.C0VWN;
import X.C11JF;
import X.C11RK;
import X.C1209404oG;
import X.C1322090kVb;
import X.C1388190mED;
import X.C13LP;
import X.C15438062q;
import X.C1557340qd2;
import X.C1558360qeg;
import X.C1567000qsc;
import X.C1567040qsg;
import X.C1567630qtd;
import X.C1567820qtw;
import X.C1580280rE2;
import X.C1583510rJF;
import X.C1585030rLh;
import X.C1587030rOv;
import X.C1596480reA;
import X.C1597470rfl;
import X.C1599020riG;
import X.C1599790rjV;
import X.C1600070rjx;
import X.C1600200rkA;
import X.C1602720roE;
import X.C1602750roH;
import X.C1602820roO;
import X.C1602840roQ;
import X.C1610420s0e;
import X.C1610740s1A;
import X.C1617670sCL;
import X.C1617700sCO;
import X.C1617730sCR;
import X.C1618540sDk;
import X.C1620870sHV;
import X.C1623606Xi;
import X.C1640210smh;
import X.C1641660sp2;
import X.C1644460stY;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C486860J7k;
import X.C606810Nr5;
import X.C622680Oba;
import X.C631370Opb;
import X.C786410Ut5;
import X.C882650Yjv;
import X.EnumC1570650qyV;
import X.EnumC1574730r55;
import X.EnumC1581150rFR;
import X.EnumC1584350rKb;
import X.EnumC1586890rOh;
import X.EnumC1586970rOp;
import X.EnumC1596540reG;
import X.InterfaceC1602960roc;
import X.InterfaceC1660990tKD;
import X.InterfaceC1805160x4k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItemBizData;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.friendstab.component.FriendsFeedComponent;
import com.ss.android.ugc.aweme.friendstab.guidecard.component.FriendsGuideCardRootAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3RepostEntranceCell;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterPanelAssem;
import com.ss.android.ugc.aweme.im.service.avatar.AvatarActiveDataAdapter;
import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFoldConfig;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.item.StoryCacheExtra;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFComplianceAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor;
import com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.power.scene.SceneGenerator;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeed;
import com.ss.android.ugc.aweme.repostfeed.ui.RepostFeedFragment;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl;
import com.ss.android.ugc.aweme.series.commonfeed.component.overlay.PaidContentCellOverlayComponent;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.ColdStartOptimization;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel;
import com.ss.android.ugc.aweme.series.feed.tab.toptab.SeriesTopTabVM;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment;
import com.ss.android.ugc.aweme.sidebar.components.SidebarContainerAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeFeedDiggTopInfoAssem;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public class AfS193S0100000_24 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
            case 37:
                accept$37(this, obj);
                break;
            case 38:
                accept$38(this, obj);
                break;
            case 39:
                accept$39(this, obj);
                break;
            case 40:
                accept$40(this, obj);
                break;
            case 41:
                accept$41(this, obj);
                break;
            case 42:
                accept$42(this, obj);
                break;
            case 43:
                accept$43(this, obj);
                break;
            case 44:
                accept$44(this, obj);
                break;
            case 45:
                accept$45(this, obj);
                break;
            case 46:
                accept$46(this, obj);
                break;
            case 47:
                accept$47(this, obj);
                break;
            case 48:
                accept$48(this, obj);
                break;
            case 49:
                accept$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                accept$50(this, obj);
                break;
            case 51:
                accept$51(this, obj);
                break;
            case 52:
                accept$52(this, obj);
                break;
            case 53:
                accept$53(this, obj);
                break;
            case 54:
                accept$54(this, obj);
                break;
            case 55:
                accept$55(this, obj);
                break;
            case 56:
                accept$56(this, obj);
                break;
        }
    }

    public AfS193S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        SceneGenerator sceneGenerator = (SceneGenerator) afS193S0100000_24.l0;
        sceneGenerator.getClass();
        C1C7U.LIZ("SceneGenerator@100b.init$1L");
        if (((Boolean) obj).booleanValue()) {
            if (sceneGenerator.LIZ) {
                if (sceneGenerator.LJFF.hasMessages(1)) {
                    sceneGenerator.LJFF.removeMessages(1);
                }
                sceneGenerator.LJFF.sendEmptyMessageDelayed(2, 0L);
            }
        } else {
            sceneGenerator.LJ();
        }
        C1C7U.LIZIZ("SceneGenerator@100b.init$1L");
    }

    public static final void accept$1(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesVipSubscriptionFragment@9721.observePurchaseState$2");
        ((SeriesVipSubscriptionFragment) afS193S0100000_24.l0).UR();
        C1C7U.LIZIZ("SeriesVipSubscriptionFragment@9721.observePurchaseState$2");
    }

    public static final void accept$10(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("MFComplianceAssem@545b.onPause$2");
        C1599790rjV c1599790rjV = (C1599790rjV) obj;
        if (c1599790rjV.LIZIZ && C2214201BlK.LJIIJJI) {
            c1599790rjV.LIZ.LIZIZ();
        }
        C11JF c11jf = ((MFComplianceAssem) afS193S0100000_24.l0).LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1C7U.LIZIZ("MFComplianceAssem@545b.onPause$2");
    }

    public static final void accept$11(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("MFComplianceAssem@545b.onResume$1");
        ((ITpcConsentService) obj).LIZLLL();
        C11JF c11jf = ((MFComplianceAssem) afS193S0100000_24.l0).LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1C7U.LIZIZ("MFComplianceAssem@545b.onResume$1");
    }

    public static final void accept$12(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("MiniDramaVideoApi$Companion@f8f1.fetchMiniDramaVideoList$observable$2");
        TiktokV1PaidContentMiniDramaVideoResponse tiktokV1PaidContentMiniDramaVideoResponse = (TiktokV1PaidContentMiniDramaVideoResponse) obj;
        if (tiktokV1PaidContentMiniDramaVideoResponse.videoList != null && (!r0.isEmpty())) {
            ((Function1) afS193S0100000_24.l0).invoke(tiktokV1PaidContentMiniDramaVideoResponse.videoList);
            MiniDramaPreloadMonitor.LIZJ(EnumC1574730r55.AWEME_PRELOAD, AFwS264S0000000_24.get$arr$(222));
        } else {
            ((Function1) afS193S0100000_24.l0).invoke(null);
            MiniDramaPreloadMonitor.LIZJ(EnumC1574730r55.AWEME_PRELOAD, new AwS603S0100000_24(tiktokV1PaidContentMiniDramaVideoResponse, 144));
        }
        C1C7U.LIZIZ("MiniDramaVideoApi$Companion@f8f1.fetchMiniDramaVideoList$observable$2");
    }

    public static final void accept$13(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("MiniDramaVideoApi$Companion@f8f1.fetchMiniDramaVideoList$observable$3");
        ((Function1) afS193S0100000_24.l0).invoke(null);
        MiniDramaPreloadMonitor.LIZJ(EnumC1574730r55.AWEME_PRELOAD, new AwS603S0100000_24((Throwable) obj, 145));
        C1C7U.LIZIZ("MiniDramaVideoApi$Companion@f8f1.fetchMiniDramaVideoList$observable$3");
    }

    public static final void accept$14(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("ListLiveCircleItemVM@a76e.startRefreshListLiveState$2");
        C20441214yg.LIZIZ("LYP_LOG", "check live state error!!!!!!!!!!!!");
        ((ListLiveCircleItemVM) afS193S0100000_24.l0).LL.postValue(Boolean.FALSE);
        C1C7U.LIZIZ("ListLiveCircleItemVM@a76e.startRefreshListLiveState$2");
    }

    public static final void accept$15(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C0N0Y playerManager;
        C1C7U.LIZ("PaidContentCellOverlayComponent@4c2a.onViewCreated$2$2");
        IPlayerComponentAbility iPlayerComponentAbilityX32 = ((PaidContentCellOverlayComponent) afS193S0100000_24.l0).x32();
        if (iPlayerComponentAbilityX32 != null && (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) != null) {
            playerManager.LJJJ();
        }
        C1C7U.LIZIZ("PaidContentCellOverlayComponent@4c2a.onViewCreated$2$2");
    }

    public static final void accept$16(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesCenterMainPageAssemViewModel@b1e8.requestDataWithPagination$response$1");
        ((ColdStartOptimization) ((SeriesCenterMainPageAssemViewModel) afS193S0100000_24.l0).LLILZ.getValue()).LIZIZ();
        C1C7U.LIZIZ("SeriesCenterMainPageAssemViewModel@b1e8.requestDataWithPagination$response$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$17(Y.AfS193S0100000_24 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS193S0100000_24.accept$17(Y.AfS193S0100000_24, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$18(Y.AfS193S0100000_24 r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS193S0100000_24.accept$18(Y.AfS193S0100000_24, java.lang.Object):void");
    }

    public static final void accept$19(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesInnerFeedViewModel@ef4a.getCollectionDetail$1");
        ((SeriesInnerFeedViewModel) afS193S0100000_24.l0).setState(AFwS264S0000000_24.get$arr$(322));
        C1C7U.LIZIZ("SeriesInnerFeedViewModel@ef4a.getCollectionDetail$1");
    }

    public static final void accept$2(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("RechargeDialogNew@383d.initAction$1");
        InterfaceC1805160x4k interfaceC1805160x4k = ((RechargeDialogNew) afS193S0100000_24.l0).LLJZIJLIL;
        if (interfaceC1805160x4k == null) {
            interfaceC1805160x4k = null;
        }
        interfaceC1805160x4k.dismiss();
        C1C7U.LIZIZ("RechargeDialogNew@383d.initAction$1");
    }

    public static final void accept$20(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.requestSeriesDetailWithRetry$1");
        ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).setState(AFwS264S0000000_24.get$arr$(353));
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.requestSeriesDetailWithRetry$1");
    }

    public static final void accept$21(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.requestSeriesDetailWithRetry$2");
        PaidCollectionDetailResponse paidCollectionDetailResponse = (PaidCollectionDetailResponse) obj;
        ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).setState(new AwS603S0100000_24(paidCollectionDetailResponse, 268));
        CollectionDetailModel collectionDetailModel = paidCollectionDetailResponse.collectionDetail;
        if (collectionDetailModel != null) {
            ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).MQ2(new C1623606Xi(collectionDetailModel));
        }
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.requestSeriesDetailWithRetry$2");
    }

    public static final void accept$22(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.requestSeriesDetailWithRetry$3");
        ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).setState(new AwS603S0100000_24((Throwable) obj, 269));
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.requestSeriesDetailWithRetry$3");
    }

    public static final void accept$23(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("VibeFeedDiggTopInfoAssem@b84f.bindAvatarForTwo$1");
        Bitmap bitmap = (Bitmap) obj;
        TuxIconView tuxIconView = ((VibeFeedDiggTopInfoAssem) afS193S0100000_24.l0).LLJJIII;
        if (tuxIconView != null) {
            tuxIconView.setImageBitmap(bitmap);
        }
        C1C7U.LIZIZ("VibeFeedDiggTopInfoAssem@b84f.bindAvatarForTwo$1");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0r2P, java.lang.Object] */
    public static final void accept$24(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesTopTabVM@c168.handleInit$2");
        Boolean bool = (Boolean) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShow: ");
        sbLIZ.append(bool);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bool.booleanValue()) {
            ((SeriesTopTabVM) afS193S0100000_24.l0).LL.postValue(new C1567820qtw<>(Boolean.TRUE));
            final SeriesTopTabVM seriesTopTabVM = (SeriesTopTabVM) afS193S0100000_24.l0;
            ?? r1 = new Object() { // from class: X.0r2P
                @C14EU
                public final void onSeriesFeedPageSelected(C1573090r2R c1573090r2R) {
                    if (c1573090r2R.LIZ) {
                        seriesTopTabVM.LL.postValue(new C1567820qtw<>(Boolean.FALSE));
                        C622680Oba.LIZLLL(this);
                        seriesTopTabVM.LLILLL = null;
                    }
                }
            };
            seriesTopTabVM.LLILLL = r1;
            C622680Oba.LIZJ(r1);
        }
        C1C7U.LIZIZ("SeriesTopTabVM@c168.handleInit$2");
    }

    public static final void accept$25(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("FollowWidgetProvider@af2.fetchData$subscribe$1");
        FollowingInterestUsersResponse followingInterestUsersResponse = (FollowingInterestUsersResponse) obj;
        List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponse.getFollowingInterestUsers();
        if (followingInterestUsers != null) {
            Context context = (Context) afS193S0100000_24.l0;
            Iterator<FollowingInterestUser> it2 = followingInterestUsers.iterator();
            while (it2.hasNext()) {
                it2.next().setLogPbBean(followingInterestUsersResponse.getLogPbBean());
            }
            FollowFeedServiceImpl.LJIL().LIZ(context, followingInterestUsers);
        }
        C1C7U.LIZIZ("FollowWidgetProvider@af2.fetchData$subscribe$1");
    }

    public static final void accept$26(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("FriendsV3RepostEntranceCell@9c77.updateAvatars$1");
        ((C1322090kVb) ((FriendsV3RepostEntranceCell) afS193S0100000_24.l0).LLILLL.getValue()).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("FriendsV3RepostEntranceCell@9c77.updateAvatars$1");
    }

    public static final void accept$27(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.observeBackgroundSwitch$1");
        if (((C606810Nr5) obj).LIZIZ) {
            C0NBD.LIZ = null;
        } else if (((InboxFragmentV2) afS193S0100000_24.l0).LLLFF) {
            C0NBD.LIZ = null;
            C1618540sDk.LIZ();
            String str = C0NBD.LIZ;
            if (str == null) {
                str = "";
            }
            InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("inbox_page");
            if (interfaceC1602960rocLIZIZ != null) {
                interfaceC1602960rocLIZIZ.LIZ("inbox_session_id", str);
            }
        }
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.observeBackgroundSwitch$1");
    }

    public static final void accept$28(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        C1C7U.LIZ("SidebarContainerAssem@32db.setupListener$2");
        if (((C606810Nr5) obj).LIZIZ && (scrollSwitchStateManager = ((SidebarContainerAssem) afS193S0100000_24.l0).LLJJIJIL) != null && scrollSwitchStateManager.FQ2("page_sidebar")) {
            ((SidebarContainerAssem) afS193S0100000_24.l0).LLJJLIIIJLLLLLLLZ = true;
            C1580280rE2.LIZJ(EnumC1570650qyV.ENTER_BACKGROUND);
            C1580280rE2.LIZIZ();
        }
        C1C7U.LIZIZ("SidebarContainerAssem@32db.setupListener$2");
    }

    public static final void accept$29(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("ActivityTimeManager@c42c.<init>$1");
        if (((C606810Nr5) obj).LIZIZ) {
            ((AbstractC1586100rNQ) afS193S0100000_24.l0).LIZ();
        }
        C1C7U.LIZIZ("ActivityTimeManager@c42c.<init>$1");
    }

    public static final void accept$3(AfS193S0100000_24 afS193S0100000_24, Object obj) throws JSONException {
        C1C7U.LIZ("MovingReminderManager@547e.<init>$2");
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C1602840roQ c1602840roQ = C1602820roO.LIZ;
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24((C1602750roH) afS193S0100000_24.l0, 37);
            C1602840roQ c1602840roQ2 = C1602820roO.LIZ;
            if (c1602840roQ2 != null) {
                c1602840roQ2.dismiss();
            }
            awS568S0100000_24.invoke();
        }
        C1C7U.LIZIZ("MovingReminderManager@547e.<init>$2");
    }

    public static final void accept$30(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.startMixRankPreRequest$1");
        MixRankSkylightResponse mixRankSkylightResponse = (MixRankSkylightResponse) obj;
        if (((C1600200rkA) afS193S0100000_24.l0).LIZ.LIZIZ(5)) {
            ((C1600200rkA) afS193S0100000_24.l0).LIZ();
            C1600200rkA c1600200rkA = (C1600200rkA) afS193S0100000_24.l0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ((C1600200rkA) afS193S0100000_24.l0).getClass();
            String strLJ = C1600200rkA.LJ();
            if (strLJ == null) {
                strLJ = "";
            }
            c1600200rkA.LJII = new StoryCacheData.MixRankResponseCache(mixRankSkylightResponse, new StoryCacheExtra(jCurrentTimeMillis, strLJ, 2));
        }
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.startMixRankPreRequest$1");
    }

    public static final void accept$31(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.startMixRankPreRequest$2");
        ((C1600200rkA) afS193S0100000_24.l0).LIZ.LIZIZ(6);
        C1597470rfl.LIZ("notification_page", (Throwable) obj, C2097608Jq.LJIIIIZZ(new Pair("checkpoint", "SkylightStoryDataCenter#startMixRankPreRequest"), new Pair("api_path", "skylight/feed")));
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.startMixRankPreRequest$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$32(Y.AfS193S0100000_24 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "BottomMultiTabRedDotImpl@2239.tryToShowGuideRedDot$2"
            X.C1C7U.LIZ(r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner r4 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LL
            X.19EG r1 = r4.LIZIZ()
            if (r1 == 0) goto Lab
            r0 = 0
            X.0Q7z r0 = X.C1558360qeg.LJI(r1, r0)
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility r0 = X.C1583510rJF.LJIIIZ(r0)
            if (r0 == 0) goto Lab
            boolean r3 = r0.hv0()
        L1e:
            java.lang.Object r0 = r6.l0
            X.0rOu r0 = (X.C1587020rOu) r0
            X.0rOx r1 = r0.LLIZ
            java.lang.String r0 = "REPOST_FEED"
            int r0 = r1.LJII(r0)
            r1 = 1
            if (r0 <= 0) goto La9
            X.0rIu r0 = X.C1583300rIu.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig r0 = X.C1583300rIu.LIZ()
            if (r0 == 0) goto La9
            int r0 = r0.bottomReminder
            r0 = r0 & 1
            if (r0 != r1) goto La9
            r2 = 1
        L3f:
            if (r3 != 0) goto L9a
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L49
            if (r2 == 0) goto L9a
        L49:
            java.lang.Object r0 = r6.l0
            X.0rOu r0 = (X.C1587020rOu) r0
            X.0rOy r0 = r0.LLILZIL
            if (r0 == 0) goto L9a
            int r0 = r0.getDotCount()
            if (r0 != 0) goto L9a
            java.lang.Object r0 = r6.l0
            X.0rOu r0 = (X.C1587020rOu) r0
            X.0rOy r0 = r0.LLILZIL
            if (r0 == 0) goto L62
            r0.LJFF()
        L62:
            java.lang.Object r0 = r6.l0
            X.0rOu r0 = (X.C1587020rOu) r0
            X.0rOy r1 = r0.LLILZIL
            if (r1 == 0) goto L76
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto La1
            if (r2 == 0) goto L9e
            java.lang.String r0 = "repost"
        L74:
            r1.LIZ = r0
        L76:
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L83
            java.lang.Object r0 = r6.l0
            X.0rOu r0 = (X.C1587020rOu) r0
            r0.LJJIIJZLJL()
        L83:
            X.19EG r3 = r4.LIZIZ()
            if (r3 == 0) goto L9a
            java.lang.Object r2 = r6.l0
            X.0rOu r2 = (X.C1587020rOu) r2
            X.0sHU r1 = new X.0sHU
            r0 = 0
            r1.<init>(r3, r2, r0)
            X.11LJ r0 = X.AbstractC19486711Lt.LJIIJJI(r1)
            r0.LJIIZILJ()
        L9a:
            X.C1C7U.LIZIZ(r5)
            return
        L9e:
            java.lang.String r0 = ""
            goto L74
        La1:
            if (r2 == 0) goto La6
            java.lang.String r0 = "repost_and_friends"
            goto L74
        La6:
            java.lang.String r0 = "friends"
            goto L74
        La9:
            r2 = 0
            goto L3f
        Lab:
            r3 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS193S0100000_24.accept$32(Y.AfS193S0100000_24, java.lang.Object):void");
    }

    public static final void accept$33(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesServiceImpl@1551.getPaidContentDetailResponse$1");
        CollectionDetailModel collectionDetailModel = ((PaidCollectionDetailResponse) obj).collectionDetail;
        if (collectionDetailModel != null) {
            ((SeriesServiceImpl) afS193S0100000_24.l0).LIZ.put(Long.valueOf(collectionDetailModel.collectionId), collectionDetailModel);
        }
        C1C7U.LIZIZ("SeriesServiceImpl@1551.getPaidContentDetailResponse$1");
    }

    public static final void accept$34(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesServiceImpl@1551.pollCollectionDetailAfterPurchase$2");
        CollectionDetailModel collectionDetailModel = ((PaidCollectionDetailResponse) obj).collectionDetail;
        if (collectionDetailModel != null) {
            ((SeriesServiceImpl) afS193S0100000_24.l0).LIZ.put(Long.valueOf(collectionDetailModel.collectionId), collectionDetailModel);
        }
        C1C7U.LIZIZ("SeriesServiceImpl@1551.pollCollectionDetailAfterPurchase$2");
    }

    public static final void accept$35(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        Activity activity;
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C19EG c19egLIZIZ2;
        MainActivityScope mainActivityScopeLIZJ2;
        HomeTabAbility homeTabAbilityLIZ2;
        BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) afS193S0100000_24.l0;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) obj;
        baseListFragmentPanel.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.checkCanScrollState$1L");
        if (baseListFragmentPanel.LLJL == null) {
            C1C7U.LIZIZ("BaseListFragmentPanel@112.checkCanScrollState$1L");
            return;
        }
        Activity activity2 = baseListFragmentPanel.activity;
        if ((activity2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(activity2)) != null && C486860J7k.LIZIZ(c19egLIZIZ2).FQ2("page_feed") && (mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLIZIZ2)) != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ2)) != null && homeTabAbilityLIZ2.ft0("Nearby") && C1585030rLh.LJIIJ(EnumC1584350rKb.INBOX.getTag()) == 0) || ((activity = baseListFragmentPanel.activity) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null && C486860J7k.LIZIZ(c19egLIZIZ).FQ2("page_feed") && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && homeTabAbilityLIZ.ft0("For You") && C1585030rLh.LJIIJ(EnumC1584350rKb.INBOX.getTag()) == 1)) {
            baseScrollSwitchStateManager.KQ2(true);
            C1C7U.LIZIZ("BaseListFragmentPanel@112.checkCanScrollState$1L");
        } else {
            baseScrollSwitchStateManager.KQ2(baseListFragmentPanel.LJLJI());
            C1C7U.LIZIZ("BaseListFragmentPanel@112.checkCanScrollState$1L");
        }
    }

    public static final void accept$36(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("FriendsFeedComponent@e3d9.filterAlreadyReadFeedData$1");
        HashSet hashSet = new HashSet();
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            hashSet.add(((C0VNS) it2.next()).LIZ);
        }
        ArrayList arrayList = new ArrayList();
        List items = ((AbstractC1255880imo) ((FriendsFeedComponent) afS193S0100000_24.l0).Ho().LIZLLL.LL).getItems();
        if (items != null) {
            int size = items.size();
            for (int iLJLLJ = ((BaseListFragmentPanel) ((FriendsFeedComponent) afS193S0100000_24.l0).LLJJIJI.getValue()).LJLLJ() + 1; iLJLLJ < size && ((FriendsFeed) ListProtector.get(items, iLJLLJ)).getSource() != EnumC1586890rOh.HISTORY_VIEWED.getDataLevel(); iLJLLJ++) {
                Aweme aweme2 = ((FriendsFeed) ListProtector.get(items, iLJLLJ)).getAweme();
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (C13LP.LJJJJ(aid, hashSet) && (aweme = ((FriendsFeed) ListProtector.get(items, iLJLLJ)).getAweme()) != null) {
                    arrayList.add(aweme);
                }
            }
        }
        if (arrayList.size() != 0) {
            if (items != null && arrayList.size() == (items.size() - ((BaseListFragmentPanel) ((FriendsFeedComponent) afS193S0100000_24.l0).LLJJIJI.getValue()).LJLLJ()) - 1) {
                ((FriendsFeedComponent) afS193S0100000_24.l0).Ho().LIZLLL.LJIJJ(arrayList);
                ((FriendsFeedComponent) afS193S0100000_24.l0).Ho().LIZIZ();
            } else {
                ((FriendsFeedComponent) afS193S0100000_24.l0).Ho().LIZLLL.LJIJJ(arrayList);
            }
        }
        C1C7U.LIZIZ("FriendsFeedComponent@e3d9.filterAlreadyReadFeedData$1");
    }

    public static final void accept$37(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        MixRankSkylightItemBizData mixRankSkylightItemBizData;
        String str;
        List<SkylightData> dataList;
        String str2;
        Keva kevaLIZIZ;
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.makeSkylightRequest$1$2");
        InboxSkylightWidgetV2 inboxSkylightWidgetV2 = (InboxSkylightWidgetV2) afS193S0100000_24.l0;
        inboxSkylightWidgetV2.getClass();
        if (obj instanceof StoryGetFeedByPageResponse) {
            C1600070rjx.LIZ();
            inboxSkylightWidgetV2.LLJJIJI = (StoryGetFeedByPageResponse) obj;
        } else {
            boolean zIsEmpty = true;
            ArrayList arrayList = null;
            if (obj instanceof SkylightDataResponse) {
                SkylightDataResponse skylightDataResponse = (SkylightDataResponse) obj;
                inboxSkylightWidgetV2.LLJJIJIIJIL = skylightDataResponse;
                C01VZ c01vz = C01VZ.LL;
                SkylightFoldConfig foldConfig = skylightDataResponse.getFoldConfig();
                c01vz.getClass();
                if (C882650Yjv.LJ()) {
                    if (foldConfig == null) {
                        C01VW.LIZ.getClass();
                        Keva kevaLIZIZ2 = C01VW.LIZIZ();
                        if (kevaLIZIZ2 != null) {
                            kevaLIZIZ2.storeInt("pending_fold_strategy", 0);
                        }
                        C01VW.LJ(null);
                        Keva kevaLIZIZ3 = C01VW.LIZIZ();
                        if (kevaLIZIZ3 != null) {
                            kevaLIZIZ3.storeStringArray("active_use_records", new String[0]);
                        }
                    } else {
                        int i = foldConfig.foldStrategy;
                        C01VW.LIZ.getClass();
                        Keva kevaLIZIZ4 = C01VW.LIZIZ();
                        if (kevaLIZIZ4 != null) {
                            kevaLIZIZ4.storeInt("pending_fold_strategy", i);
                        }
                        C01VW.LJ(foldConfig.foldStrategyEventTrackingFields);
                        if (i != 1 && (kevaLIZIZ = C01VW.LIZIZ()) != null) {
                            kevaLIZIZ.storeStringArray("active_use_records", new String[0]);
                        }
                    }
                }
                C1600070rjx.LIZIZ(AFwS264S0000000_24.get$arr$(646));
                if (!C1209404oG.LIZ()) {
                    List<SkylightData> dataList2 = skylightDataResponse.getDataList();
                    if (dataList2 != null && !dataList2.isEmpty()) {
                        zIsEmpty = false;
                    }
                    SkylightDataResponse skylightDataResponse2 = inboxSkylightWidgetV2.LLJJIJIIJIL;
                    if (skylightDataResponse2 != null && (dataList = skylightDataResponse2.getDataList()) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(dataList, 10));
                        Iterator<SkylightData> it2 = dataList.iterator();
                        while (it2.hasNext()) {
                            CustomBizData customBizData = it2.next().customBizData;
                            if (customBizData == null || (str2 = customBizData.roomInfo) == null) {
                                str2 = "";
                            }
                            arrayList.add(str2);
                        }
                    }
                    inboxSkylightWidgetV2.Vo(arrayList, zIsEmpty);
                }
            } else if (obj instanceof MixRankSkylightResponse) {
                C1600070rjx.LIZ();
                MixRankSkylightResponse mixRankSkylightResponse = (MixRankSkylightResponse) obj;
                if (!C1596480reA.LIZLLL(mixRankSkylightResponse, EnumC1596540reG.INBOX_TAB.getValue())) {
                    inboxSkylightWidgetV2.LLJJIJIL = mixRankSkylightResponse;
                    zIsEmpty = mixRankSkylightResponse.getSkylightItems().isEmpty();
                    List<MixRankSkylightItem> skylightItems = mixRankSkylightResponse.getSkylightItems();
                    arrayList = new ArrayList();
                    for (MixRankSkylightItem mixRankSkylightItem : skylightItems) {
                        Integer num = mixRankSkylightItem.bizGroup;
                        if (num != null && num.intValue() == 2 && (mixRankSkylightItemBizData = mixRankSkylightItem.bizData) != null && (str = mixRankSkylightItemBizData.roomInfo) != null) {
                            arrayList.add(str);
                        }
                    }
                }
                inboxSkylightWidgetV2.Vo(arrayList, zIsEmpty);
            }
        }
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.makeSkylightRequest$1$2");
    }

    public static final void accept$38(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.makeSkylightRequest$1$3");
        ((InboxSkylightWidgetV2) afS193S0100000_24.l0).So((Throwable) obj);
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.makeSkylightRequest$1$3");
    }

    public static final void accept$39(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.requestMixRankSkylight$1");
        C1599020riG.LIZ.getClass();
        C1599020riG.LIZIZ();
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.requestMixRankSkylight$1");
    }

    public static final void accept$4(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        Aweme aweme;
        C1C7U.LIZ("FeedAvatarLiveAssem@f991.liveStateChangeCallback$1");
        C1610420s0e c1610420s0e = (C1610420s0e) obj;
        if (c1610420s0e != null && (aweme = ((VideoItemParams) C631370Opb.LIZ((FeedAvatarLiveAssem) afS193S0100000_24.l0)).getAweme()) != null && Intrinsics.LJFF(String.valueOf(c1610420s0e.LIZ), AwemeExtKt.getAuthorUid(aweme))) {
            User author = aweme.getAuthor();
            if (author != null) {
                author.roomId = c1610420s0e.LIZIZ;
            }
            FeedAvatarAssemWrap.LLLFZ.getClass();
            C1610740s1A c1610740s1A = null;
            if (!C1602720roE.LIZIZ(aweme, null)) {
                C1610740s1A c1610740s1A2 = ((FeedAvatarLiveAssem) afS193S0100000_24.l0).LLJJLIIIJLLLLLLLZ;
                if (c1610740s1A2 != null) {
                    c1610740s1A = c1610740s1A2;
                }
                c1610740s1A.LJIIIIZZ();
                FeedAvatarLiveAssem feedAvatarLiveAssem = (FeedAvatarLiveAssem) afS193S0100000_24.l0;
                feedAvatarLiveAssem.LLJLL = true;
                feedAvatarLiveAssem.LLLFZ.invoke(Boolean.FALSE);
            }
        }
        C1C7U.LIZIZ("FeedAvatarLiveAssem@f991.liveStateChangeCallback$1");
    }

    public static final void accept$40(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("RedDotRepository@a90a.request$requestTask$1$2");
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = ((NewContentResponse) obj).getFriendsFeedResponse();
        if (friendsFeedResponse != null) {
            friendsFeedResponse.setSource(((EnumC1586970rOp) afS193S0100000_24.l0).ordinal());
        }
        C1C7U.LIZIZ("RedDotRepository@a90a.request$requestTask$1$2");
    }

    public static final void accept$41(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("RedDotRepository@a90a.requestAnyway$2");
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = ((NewContentResponse) obj).getFriendsFeedResponse();
        if (friendsFeedResponse != null) {
            friendsFeedResponse.setSource(((EnumC1586970rOp) afS193S0100000_24.l0).ordinal());
        }
        C1C7U.LIZIZ("RedDotRepository@a90a.requestAnyway$2");
    }

    public static final void accept$42(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        C1C7U.LIZ("TopRedDotImpl@4619.tryToShowGuideRedDot$2");
        Boolean bool = (Boolean) obj;
        StateOwner stateOwner = StateOwner.LL;
        C19EG c19egLIZIZ = stateOwner.LIZIZ();
        if ((c19egLIZIZ == null || (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) == null || !iBottomTabLayoutAbilityLJIIIZ.hv0()) && !bool.booleanValue()) {
            C1587030rOv c1587030rOv = (C1587030rOv) afS193S0100000_24.l0;
            if (c1587030rOv.LLILZIL.LIZIZ == 0) {
                c1587030rOv.LLIZ.setShowGuideRedDot(true);
                ((C1587030rOv) afS193S0100000_24.l0).LLILZIL.LJI();
                ((C1587030rOv) afS193S0100000_24.l0).LJJIIJZLJL();
                C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
                if (c19egLIZIZ2 != null) {
                    AbstractC19486711Lt.LJIIJJI(new C1620870sHV(c19egLIZIZ2, 3)).LJIIZILJ();
                }
            }
        }
        C1C7U.LIZIZ("TopRedDotImpl@4619.tryToShowGuideRedDot$2");
    }

    public static final void accept$43(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.onFavoriteButtonClick$2");
        ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).setState(AFwS264S0000000_24.get$arr$(670));
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.onFavoriteButtonClick$2");
    }

    public static final void accept$44(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.refreshAfterEpisodePurchase$1");
        CollectionDetailModel collectionDetailModel = ((PaidCollectionDetailResponse) obj).collectionDetail;
        if (collectionDetailModel != null) {
            ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).FQ2(collectionDetailModel);
        }
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.refreshAfterEpisodePurchase$1");
    }

    public static final void accept$45(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        MiniDramaPlayProgressService miniDramaPlayProgressServiceDQ2;
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.updateCtaButtonExp$1");
        PaidContentVideoListResponse paidContentVideoListResponse = (PaidContentVideoListResponse) obj;
        List<PaidVideoItem> list = paidContentVideoListResponse.paidVideoList;
        SeriesDetailVideoListViewModel seriesDetailVideoListViewModel = (SeriesDetailVideoListViewModel) afS193S0100000_24.l0;
        for (PaidVideoItem paidVideoItem : list) {
            Aweme aweme = paidVideoItem.aweme;
            if (aweme != null && (miniDramaPlayProgressServiceDQ2 = seriesDetailVideoListViewModel.DQ2()) != null) {
                miniDramaPlayProgressServiceDQ2.LIZLLL(paidVideoItem.videoDuration, aweme.mPaidContentInfo.getPaidContentResumeTimestamp() * ((long) LSPassThroughRecordSizeConfig.DEFAULT), aweme.getAid(), paidVideoItem.isComplete());
            }
        }
        ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).NQ2();
        ((SeriesDetailVideoListViewModel) afS193S0100000_24.l0).setState(new AwS603S0100000_24(paidContentVideoListResponse, 551));
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.updateCtaButtonExp$1");
    }

    public static final void accept$46(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("NonPersonalizedAssem@7342.observeToastShowingTriggers$4");
        C1567000qsc c1567000qsc = (C1567000qsc) obj;
        if (!c1567000qsc.LIZIZ) {
            ((NonPersonalizedAssem) afS193S0100000_24.l0).op().LIZIZ(AFwS213S0000000_24.get$arr$(568));
            ((NonPersonalizedAssem) afS193S0100000_24.l0).tp().vQ2();
            if (C1567040qsg.LIZIZ()) {
                ((NonPersonalizedAssem) afS193S0100000_24.l0).tp().xQ2(5, c1567000qsc.LIZ);
            }
        }
        C1C7U.LIZIZ("NonPersonalizedAssem@7342.observeToastShowingTriggers$4");
    }

    public static final void accept$47(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("AbstractStickerView@dd31.initCategoryList$1$1");
        Pair pair = (Pair) obj;
        ((AbstractStickerView) afS193S0100000_24.l0).LLJLILLLLZIIL.onNext(new C1557340qd2(((Number) pair.getSecond()).intValue(), (EffectCategoryModel) pair.getFirst()));
        C1C7U.LIZIZ("AbstractStickerView@dd31.initCategoryList$1$1");
    }

    public static final void accept$48(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("AbstractStickerView@dd31.initCategoryList$1$2");
        Pair pair = (Pair) obj;
        C11RK<AbstractC1557360qd4> c11rk = ((AbstractStickerView) afS193S0100000_24.l0).LLJLILLLLZIIL;
        final EffectCategoryModel effectCategoryModel = (EffectCategoryModel) pair.getFirst();
        final int iIntValue = ((Number) pair.getSecond()).intValue();
        c11rk.onNext(new AbstractC1557360qd4(iIntValue, effectCategoryModel) { // from class: X.0qd1
            public final EffectCategoryModel LIZ;
            public final int LIZIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1557330qd1)) {
                    return false;
                }
                C1557330qd1 c1557330qd1 = (C1557330qd1) obj2;
                return Intrinsics.LJFF(this.LIZ, c1557330qd1.LIZ) && this.LIZIZ == c1557330qd1.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TabClick(tab=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", index=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = effectCategoryModel;
                this.LIZIZ = iIntValue;
            }
        });
        C1C7U.LIZIZ("AbstractStickerView@dd31.initCategoryList$1$2");
    }

    public static final void accept$49(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("AbstractStickerView@dd31.initCategoryList$1$3");
        ((AbstractStickerView) afS193S0100000_24.l0).LLJLLIL.onNext(obj);
        C1C7U.LIZIZ("AbstractStickerView@dd31.initCategoryList$1$3");
    }

    public static final void accept$5(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("IMEditFilterPanelAssem@4829.onViewCreated$1");
        ((IMEditFilterPanelAssem) afS193S0100000_24.l0).lp().of(((Boolean) obj).booleanValue());
        C1C7U.LIZIZ("IMEditFilterPanelAssem@4829.onViewCreated$1");
    }

    public static final void accept$50(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("ExploreInnerCacheManager@a9c3.request$3");
        C1617700sCO c1617700sCO = C1617700sCO.LIZ;
        C1617700sCO.LIZLLL = false;
        for (C1617730sCR c1617730sCR : (List) afS193S0100000_24.l0) {
            Map<String, C05XL<Unit>> map = C1617700sCO.LJ;
            C05XL c05xl = (C05XL) ((LinkedHashMap) map).get(c1617730sCR.LIZ);
            if (c05xl != null) {
                c05xl.LJIIZILJ(Unit.LIZ);
            }
            map.remove(c1617730sCR.LIZ);
        }
        C1C7U.LIZIZ("ExploreInnerCacheManager@a9c3.request$3");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$51(Y.AfS193S0100000_24 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "ExploreListModel@860c.fetchList$1$1"
            X.C1C7U.LIZ(r5)
            com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList r7 = (com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList) r7
            if (r7 == 0) goto L30
            java.util.List<? extends com.ss.android.ugc.aweme.music.model.RelatedAweme> r0 = r7.relatedAwemes
            if (r0 == 0) goto L30
            java.lang.Object r4 = r6.l0
            X.0sCL r4 = (X.C1617670sCL) r4
            java.util.Iterator r3 = r0.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.music.model.RelatedAweme r0 = (com.ss.android.ugc.aweme.music.model.RelatedAweme) r0
            java.lang.String r1 = r0.relatedAid
            java.lang.String r0 = r4.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L15
        L2c:
            com.ss.android.ugc.aweme.music.model.RelatedAweme r2 = (com.ss.android.ugc.aweme.music.model.RelatedAweme) r2
            if (r2 != 0) goto L44
        L30:
            com.ss.android.ugc.aweme.music.model.RelatedAweme r2 = new com.ss.android.ugc.aweme.music.model.RelatedAweme
            r2.<init>()
            java.lang.Object r1 = r6.l0
            X.0sCL r1 = (X.C1617670sCL) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.setItems(r0)
            r0 = 1
            r2.hasMore = r0
        L44:
            com.ss.android.ugc.aweme.explore.data.ExploreAwemeList r4 = new com.ss.android.ugc.aweme.explore.data.ExploreAwemeList
            r4.<init>()
            int r0 = r2.hasMore
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.hasMore = r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r2.awemeList
            if (r1 != 0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
        L57:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.aweme.explore.data.ExplorePostItem r0 = new com.ss.android.ugc.aweme.explore.data.ExplorePostItem
            r0.<init>(r1)
            r3.add(r0)
            goto L66
        L7b:
            r2 = 0
            goto L2c
        L7d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r4.items = r0
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r4
            java.lang.Object r0 = r6.l0
            X.0sCL r0 = (X.C1617670sCL) r0
            r0.handleMsg(r1)
            X.C1C7U.LIZIZ(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS193S0100000_24.accept$51(Y.AfS193S0100000_24, java.lang.Object):void");
    }

    public static final void accept$52(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("ExploreListModel@860c.fetchList$1$2");
        Message messageObtain = Message.obtain();
        messageObtain.obj = obj;
        ((C1617670sCL) afS193S0100000_24.l0).handleMsg(messageObtain);
        C1C7U.LIZIZ("ExploreListModel@860c.fetchList$1$2");
    }

    public static final void accept$53(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.pollPurchaseConfirmation$2");
        SeriesPaymentServiceImpl seriesPaymentServiceImpl = (SeriesPaymentServiceImpl) afS193S0100000_24.l0;
        seriesPaymentServiceImpl.getClass();
        ARunnableS43S0110000_24 aRunnableS43S0110000_24 = new ARunnableS43S0110000_24(seriesPaymentServiceImpl, true, 4);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS43S0110000_24.run();
        } else {
            C786410Ut5.LJJZZIII(seriesPaymentServiceImpl.LIZLLL, aRunnableS43S0110000_24);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.pollPurchaseConfirmation$2");
    }

    public static final void accept$54(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("FriendsGuideCardRootAssem@6ac3.adjustAvatar$2");
        Bitmap bitmap = (Bitmap) obj;
        SmartImageView smartImageView = ((FriendsGuideCardRootAssem) afS193S0100000_24.l0).LLJZ;
        if (smartImageView != null) {
            smartImageView.setImageBitmap(bitmap);
        }
        C1C7U.LIZIZ("FriendsGuideCardRootAssem@6ac3.adjustAvatar$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$55(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("RepostFeedFragment@91d0.filterAlreadyReadFeedData$1");
        HashSet hashSet = new HashSet();
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            hashSet.add(((C0VNS) it2.next()).LIZ);
        }
        RepostFeedFragment repostFeedFragment = (RepostFeedFragment) afS193S0100000_24.l0;
        repostFeedFragment.getClass();
        ArrayList arrayList = new ArrayList();
        List<RepostFeed> list = ((C1567630qtd) repostFeedFragment.ZR().getState()).LL.LLILZ;
        if (list != null) {
            int size = list.size();
            for (int iLJLLJ = repostFeedFragment.LLIZ.LJLLJ() + 1; iLJLLJ < size && ((RepostFeed) ListProtector.get(list, iLJLLJ)).source == EnumC1581150rFR.SORT.getDataLevel(); iLJLLJ++) {
                Aweme aweme2 = ((RepostFeed) ListProtector.get(list, iLJLLJ)).aweme;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (C13LP.LJJJJ(aid, hashSet) && (aweme = ((RepostFeed) ListProtector.get(list, iLJLLJ)).aweme) != null) {
                    arrayList.add(aweme);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            RepostFeedViewModel.vQ2(repostFeedFragment.ZR(), arrayList, null, null, 14);
        }
        C1C7U.LIZIZ("RepostFeedFragment@91d0.filterAlreadyReadFeedData$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x004e, blocks: (B:3:0x000c, B:5:0x001e, B:10:0x0030, B:13:0x0049), top: B:19:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$56(Y.AfS193S0100000_24 r6, java.lang.Object r7) {
        /*
            java.lang.String r7 = "AnchorLiveMemoryOptimizer@ce3d.checkMemory$disposable$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = r6.l0
            X.0UZT r3 = (X.C0UZT) r3
            r3.getClass()
            android.content.Context r0 = r3.LIZ     // Catch: java.lang.Throwable -> L4e
            long r1 = X.C2188571Al5.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4e
            android.content.Context r0 = r3.LIZ     // Catch: java.lang.Throwable -> L4e
            long r5 = X.C2188571Al5.LIZ(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r4 = com.bytedance.android.livesdk.performance.memory.AnchorMemoryOptimizeSetting.getConfigThreshold(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L49
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L4e
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L4e
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 * r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L2d
            r0 = 1
            goto L30
        L2d:
            r0 = 0
            if (r4 == 0) goto L49
        L30:
            r4.intValue()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L5a
            X.0w7G r2 = new X.0w7G
            r2.<init>()
            X.18Ko r0 = X.EnumC21267218Ko.LIVE_HOST
            r2.LIZJ = r0
            X.0w7F r1 = new X.0w7F
            r1.<init>(r2)
            X.1Al4 r0 = X.C476250Ilz.LIZ
            r0.LJ(r1)
            goto L5a
        L49:
            r0 = 0
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4e
            goto L5a
        L4e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L5a:
            X.C1C7U.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS193S0100000_24.accept$56(Y.AfS193S0100000_24, java.lang.Object):void");
    }

    public static final void accept$6(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        FilterBean filterBean;
        C1C7U.LIZ("IMEditFilterPanelAssem@4829.onViewCreated$4");
        C1640210smh c1640210smh = (C1640210smh) ((C1641660sp2) obj).LIZ();
        if (c1640210smh != null && (filterBean = c1640210smh.LIZ) != null) {
            ((IMEditFilterPanelAssem) afS193S0100000_24.l0).lp().wQ2(filterBean, null);
        }
        C1C7U.LIZIZ("IMEditFilterPanelAssem@4829.onViewCreated$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("IMEditFilterPanelAssem@4829.onViewCreated$5");
        C1644460stY c1644460stY = (C1644460stY) obj;
        ((IMEditFilterPanelAssem) afS193S0100000_24.l0).lp().wQ2((FilterBean) c1644460stY.LIZJ, (Integer) c1644460stY.LIZIZ);
        C1C7U.LIZIZ("IMEditFilterPanelAssem@4829.onViewCreated$5");
    }

    public static final void accept$8(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        C1C7U.LIZ("IMEditFilterPanelAssem@4829.onViewCreated$6");
        ((InterfaceC1660990tKD) ((IMEditFilterPanelAssem) afS193S0100000_24.l0).lp().LL.getValue()).LJII(null);
        C1C7U.LIZIZ("IMEditFilterPanelAssem@4829.onViewCreated$6");
    }

    public static final void accept$9(AfS193S0100000_24 afS193S0100000_24, Object obj) {
        AvatarActiveDataAdapter avatarActiveDataAdapter;
        AbstractC1153360g7S abstractC1153360g7S;
        C1C7U.LIZ("AvatarActiveDataAdapter@8794.init$3");
        if (((Boolean) obj).booleanValue() && (abstractC1153360g7S = (avatarActiveDataAdapter = (AvatarActiveDataAdapter) afS193S0100000_24.l0).LLILZ) != null) {
            avatarActiveDataAdapter.LIZ(abstractC1153360g7S);
        }
        C1C7U.LIZIZ("AvatarActiveDataAdapter@8794.init$3");
    }
}
