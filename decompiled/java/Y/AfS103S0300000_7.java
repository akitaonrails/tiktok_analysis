package Y;

import X.AbstractC470790IdB;
import X.AbstractC470800IdC;
import X.AbstractC511160K2w;
import X.C013C;
import X.C08CX;
import X.C09JN;
import X.C0IK0;
import X.C0IKY;
import X.C0IKZ;
import X.C0IOL;
import X.C0ISZ;
import X.C0J7Y;
import X.C0J90;
import X.C0J9F;
import X.C0JFN;
import X.C0K2D;
import X.C0K2L;
import X.C0K34;
import X.C0K37;
import X.C0K3G;
import X.C0K3J;
import X.C0K3K;
import X.C0K3S;
import X.C0KLA;
import X.C0KM8;
import X.C0KMZ;
import X.C0KVU;
import X.C0W78;
import X.C10GR;
import X.C1109770ez9;
import X.C1110530f0N;
import X.C1148080fyw;
import X.C11S5;
import X.C1210880hcE;
import X.C1305440k4k;
import X.C1440005kM;
import X.C1529880puk;
import X.C15438062q;
import X.C1558520qew;
import X.C1701940uOG;
import X.C189200o6;
import X.C1909107dp;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C20743716Ff;
import X.C2188811AlT;
import X.C2355009Kq;
import X.C238400w2;
import X.C259800zU;
import X.C466230IQb;
import X.C466260IQe;
import X.C470600Ics;
import X.C470770Id9;
import X.C471830Ier;
import X.C474990Ijx;
import X.C475020Ik0;
import X.C480460Ism;
import X.C485050J0l;
import X.C487250J8x;
import X.C487270J8z;
import X.C497120JeY;
import X.C497740JfY;
import X.C498770JhD;
import X.C500110JjN;
import X.C500260Jjc;
import X.C500730JkN;
import X.C511110K2r;
import X.C511230K3d;
import X.C511370K3r;
import X.C511520K4g;
import X.C511970K5z;
import X.C512310K7h;
import X.C516000KLm;
import X.C516100KLw;
import X.C519870Ka9;
import X.C519930KaF;
import X.C749030TZt;
import X.C749040TZu;
import X.C766270U4b;
import X.C930940aKi;
import X.EnumC1305450k4l;
import X.EnumC466740ISa;
import X.EnumC470780IdA;
import X.InterfaceC1059280dfi;
import X.InterfaceC1103130eoR;
import X.InterfaceC1106030et7;
import X.InterfaceC1364105Vn;
import X.InterfaceC500940Jki;
import X.InterfaceC519890KaB;
import X.InterfaceC634840OvC;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.feed.api.GuideFrequencyControlApi;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.floatwindow.FloatWindowTipsDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.livesdk.chatroom.slide.v1.LiveCustomizedSlideGuideEnterFromFollowSkySetting;
import com.bytedance.android.livesdk.chatroom.slide.v1.LiveCustomizedSlideGuideSetting;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.android.livesdk.dataChannel.LiveAudienceLocationBubbleSwitchUnchecked;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMockCurTime;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import webcast.api.pgc_sub.PGCCommentPageResponse;
import webcast.api.pgc_sub.PGCPollVoteResponse;
import webcast.api.pgc_sub.PGCPostActionRequest;
import webcast.api.pgc_sub.PGCPostCreateReq;
import webcast.api.pgc_sub.PGCPostCreateResp;
import webcast.api.room.CrowdSelectionResponse;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.FrequencyControlResponse;
import webcast.api.room.StrategyCheckData;

/* JADX INFO: loaded from: classes8.dex */
public class AfS103S0300000_7 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void accept$0(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        Map<Long, Long> mapLIZ;
        C0J7Y c0j7y = (C0J7Y) afS103S0300000_7.l0;
        C09JN c09jn = (C09JN) afS103S0300000_7.l1;
        List<User> list = (List) afS103S0300000_7.l2;
        LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
        c0j7y.getClass();
        C1C7U.LIZ("LiveStateManager@a4a7.refreshUserList$1L");
        if (liveStateResponse != null && c09jn != null && (mapLIZ = liveStateResponse.mapUserIdRoomId.LIZ()) != null) {
            c0j7y.LJIIL(list, mapLIZ);
            c09jn.accept(mapLIZ);
        }
        C1C7U.LIZIZ("LiveStateManager@a4a7.refreshUserList$1L");
    }

    public static final void accept$1(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C0IOL c0iol;
        final int currentItem;
        C1305440k4k c1305440k4kLIZIZ;
        String strLIZ;
        final C466230IQb c466230IQb = (C466230IQb) afS103S0300000_7.l0;
        final View view = (View) afS103S0300000_7.l1;
        final View view2 = (View) afS103S0300000_7.l2;
        c466230IQb.getClass();
        C1C7U.LIZ("SlideUpGuideManager@27ba.showCustomizedSlideGuide$1L");
        c466230IQb.LLILLL = true;
        if (!c466230IQb.LJI() && c466230IQb.LLJJJ != null && c466230IQb.LLJJIJIIJIL != null && !c466230IQb.LLIZ && !c466230IQb.LLIZLLLIL && !c466230IQb.LLJJI && c466230IQb.LLILLL && (c0iol = c466230IQb.LLILLJJLI) != null && c0iol.size() >= 2 && (currentItem = c466230IQb.LLJJJ.getCurrentItem()) == 0 && !c466230IQb.LLJJIJIIJIL.gS(currentItem, 1, true) && !c466230IQb.LJ()) {
            c466230IQb.LLJI = view;
            if (LiveCustomizedSlideGuideSetting.INSTANCE.isEntranceEnable(c466230IQb.LLJIJIL)) {
                final int value = LiveCustomizedSlideGuideEnterFromFollowSkySetting.INSTANCE.getValue();
                if (value <= 3) {
                    if (value == 1) {
                        strLIZ = C0KVU.LIZ(c466230IQb.LLJJIJIIJIL.ZR().f8().getOwner());
                    } else {
                        strLIZ = null;
                    }
                    c466230IQb.LLILZIL = true;
                    C466260IQe.LIZ.getClass();
                    C466260IQe.LIZIZ(view, view2, value, false, strLIZ);
                    c466230IQb.LLIZLLLIL = true;
                } else {
                    C466260IQe.LIZ.getClass();
                    Context contextLJII = C497740JfY.LJII();
                    if (contextLJII != null && (c1305440k4kLIZIZ = C1305440k4k.LIZIZ(contextLJII)) != null) {
                        long curTime = LiveMockCurTime.INSTANCE.getCurTime();
                        if (curTime <= 0) {
                            curTime = System.currentTimeMillis();
                        }
                        Iterator it2 = ((Set) c1305440k4kLIZIZ.LIZLLL(C466260IQe.LIZ(UserService.getInstance().user().getCurrentUserId()), EnumC1305450k4l.STRING_SET, C08CX.INSTANCE)).iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            try {
                                long j = CastLongProtector.parseLong((String) it2.next());
                                if (j > 0 && curTime - j < 86400000) {
                                    i++;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (i <= 0) {
                            if (value == 5) {
                                c466230IQb.LLILZIL = true;
                                C466260IQe.LIZ.getClass();
                                C466260IQe.LIZIZ(view, view2, value, true, null);
                                c466230IQb.LLIZLLLIL = true;
                            } else if (value == 4 || value == 6) {
                                Long lValueOf = Long.valueOf(((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)).getId());
                                C480460Ism.LIZ().getClass();
                                ((GuideFrequencyControlApi) C480460Ism.LIZLLL(GuideFrequencyControlApi.class)).getFrequencyControl(4, lValueOf, c466230IQb.LLJIJIL, 0).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0IQd
                                    @Override // X.C09JN
                                    public final void accept(Object obj2) {
                                        C466230IQb c466230IQb2 = c466230IQb;
                                        int i2 = currentItem;
                                        int i3 = value;
                                        View view3 = view;
                                        View view4 = view2;
                                        c466230IQb2.getClass();
                                        C1C7U.LIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$1L");
                                        if (((FrequencyControlResponse) obj2).data.result) {
                                            if (i2 == 0 && !c466230IQb2.LLJJIJIIJIL.gS(i2, 1, true)) {
                                                if (c466230IQb2.LJ()) {
                                                    C1C7U.LIZIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$1L");
                                                    return;
                                                }
                                                if (i3 == 4) {
                                                    c466230IQb2.LLILZIL = true;
                                                    C466260IQe.LIZ.getClass();
                                                    C466260IQe.LIZIZ(view3, view4, i3, true, null);
                                                    c466230IQb2.LLIZLLLIL = true;
                                                } else if (i3 == 6) {
                                                    InterfaceC466370IQp currentFragment = c466230IQb2.LLJJIJIIJIL.getCurrentFragment();
                                                    InterfaceC466370IQp interfaceC466370IQpZR = c466230IQb2.LLJJIJIIJIL.ZR();
                                                    if (currentFragment != null && interfaceC466370IQpZR != null && currentFragment.Ei() == 0 && (currentFragment instanceof LivePlayFragment) && (interfaceC466370IQpZR instanceof LivePlayFragment)) {
                                                        c466230IQb2.LLILZIL = true;
                                                        C466260IQe.LIZ.getClass();
                                                        C465540INk.LJI(C465540INk.LIZ, (LivePlayFragment) currentFragment, (LivePlayFragment) interfaceC466370IQpZR, false);
                                                        C466260IQe.LIZJ();
                                                        c466230IQb2.LLIZLLLIL = true;
                                                    } else {
                                                        C1C7U.LIZIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$1L");
                                                        return;
                                                    }
                                                }
                                            } else {
                                                C1C7U.LIZIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$1L");
                                                return;
                                            }
                                        }
                                        C1C7U.LIZIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$1L");
                                    }
                                }, new AfS132S0000000_7(5));
                            }
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("SlideUpGuideManager@27ba.showCustomizedSlideGuide$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        Long lValueOf;
        StrategyCheckData strategyCheckData;
        StrategyCheckData strategyCheckData2;
        StrategyCheckData strategyCheckData3;
        C1C7U.LIZ("LiveExtraCardFrequencyManager@260.checkExtraCardStrategy$6");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check api success, resp: ");
        sbLIZ.append(baseResponse);
        C20441214yg.LJIIIZ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        if (baseResponse != null && (strategyCheckData3 = (StrategyCheckData) baseResponse.data) != null && strategyCheckData3.decision == 1) {
            ((Function1) afS103S0300000_7.l0).invoke((EncourageGoLiveCard) afS103S0300000_7.l1);
            LiveExtraCardFrequencyManager.LIZLLL((EncourageGoLiveCard) afS103S0300000_7.l1, 4, true, 0, "success", LiveExtraCardFrequencyManager.LIZJ(LiveExtraCardFrequencyManager.LIZ));
        } else {
            Function1 function1 = (Function1) afS103S0300000_7.l2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("check api failed, decision");
            Long lValueOf2 = null;
            if (baseResponse != null && (strategyCheckData2 = (StrategyCheckData) baseResponse.data) != null) {
                lValueOf = Long.valueOf(strategyCheckData2.decision);
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            function1.invoke(C2188811AlT.LIZIZ(sbLIZ2));
            LiveExtraCardFrequencyManager liveExtraCardFrequencyManager = LiveExtraCardFrequencyManager.LIZ;
            EncourageGoLiveCard encourageGoLiveCard = (EncourageGoLiveCard) afS103S0300000_7.l1;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("check api failed, decision");
            if (baseResponse != null && (strategyCheckData = (StrategyCheckData) baseResponse.data) != null) {
                lValueOf2 = Long.valueOf(strategyCheckData.decision);
            }
            sbLIZ3.append(lValueOf2);
            LiveExtraCardFrequencyManager.LIZLLL(encourageGoLiveCard, 4, false, 401, C2188811AlT.LIZIZ(sbLIZ3), LiveExtraCardFrequencyManager.LIZJ(liveExtraCardFrequencyManager));
        }
        C1C7U.LIZIZ("LiveExtraCardFrequencyManager@260.checkExtraCardStrategy$6");
    }

    public static final void accept$11(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragment@5a3c.showPermissionTipDialog$dispose$1");
        if (obj == Lifecycle.Event.ON_RESUME) {
            if (C0W78.LJFF(((BasePreviewSettingMainFragment) afS103S0300000_7.l0).getContext()) && ((FloatWindowTipsDialog) afS103S0300000_7.l1).isShowing()) {
                ((FloatWindowTipsDialog) afS103S0300000_7.l1).dismiss();
            }
            ((C013C) afS103S0300000_7.l2).element = false;
        }
        C1C7U.LIZIZ("BasePreviewSettingMainFragment@5a3c.showPermissionTipDialog$dispose$1");
    }

    public static final void accept$12(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheet@622c.showPermissionTipDialog$dispose$1");
        if (obj == Lifecycle.Event.ON_RESUME) {
            if (C0W78.LJFF(((BasePreviewSettingMainFragmentSheet) afS103S0300000_7.l0).getContext()) && ((FloatWindowTipsDialog) afS103S0300000_7.l1).isShowing()) {
                ((FloatWindowTipsDialog) afS103S0300000_7.l1).dismiss();
            }
            ((C013C) afS103S0300000_7.l2).element = false;
        }
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheet@622c.showPermissionTipDialog$dispose$1");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void accept$13(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        ArrayList<AbstractC511160K2w> arrayList;
        ArrayList<AbstractC511160K2w> arrayList2;
        SpacePost spacePost;
        C1C7U.LIZ("DetailFeedManager@2efb.loadNextReply$1");
        ((Function0) afS103S0300000_7.l0).invoke();
        PGCCommentPageResponse.ResponseData responseData = (PGCCommentPageResponse.ResponseData) ((DataResponse) obj).data;
        if (responseData != null) {
            C0K3G c0k3g = (C0K3G) afS103S0300000_7.l1;
            C0K3K c0k3k = (C0K3K) afS103S0300000_7.l2;
            SpaceCommentItem spaceCommentItem = c0k3k.LIZ;
            c0k3g.getClass();
            c0k3k.LIZJ = responseData.offset;
            C0K37 c0k37 = c0k3g.LLILLL;
            if (c0k37 != null && (arrayList = c0k37.LL) != null) {
                int iIndexOf = arrayList.indexOf(c0k3k);
                if (iIndexOf > 0) {
                    ListProtector.remove(arrayList, iIndexOf);
                    C0K37 c0k372 = c0k3g.LLILLL;
                    if (c0k372 != null) {
                        c0k372.notifyItemRemoved(iIndexOf);
                    }
                }
                ListIterator<AbstractC511160K2w> listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    AbstractC511160K2w abstractC511160K2wPrevious = listIterator.previous();
                    if ((abstractC511160K2wPrevious instanceof C0K3J) && ((C0K3J) abstractC511160K2wPrevious).LIZLLL() == c0k3k.LIZLLL()) {
                        int iNextIndex = listIterator.nextIndex();
                        if (iNextIndex >= 0) {
                            List<SpaceCommentItem> list = responseData.commentList;
                            ArrayList arrayList3 = new ArrayList();
                            C0K37 c0k373 = c0k3g.LLILLL;
                            if (c0k373 != null && (arrayList2 = c0k373.LL) != null) {
                                for (SpaceCommentItem spaceCommentItem2 : list) {
                                    Iterator<AbstractC511160K2w> it2 = arrayList2.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        AbstractC511160K2w next = it2.next();
                                        if ((next instanceof C0K3J) && ((C0K3J) next).LIZ.commentId == spaceCommentItem2.commentId) {
                                            if (i >= 0) {
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    spaceCommentItem2.replyCommentInfo = spaceCommentItem;
                                    C0K3S c0k3s = c0k3g.LLILLJJLI;
                                    if (c0k3s != null) {
                                        spacePost = c0k3s.LLILLL;
                                    } else {
                                        spacePost = null;
                                    }
                                    arrayList3.add(new C0K3J(spaceCommentItem2, spacePost));
                                }
                            }
                            int i2 = iNextIndex + 1;
                            arrayList.addAll(i2, arrayList3);
                            long jLIZLLL = c0k3k.LIZLLL();
                            ArrayList arrayList4 = new ArrayList();
                            for (AbstractC511160K2w abstractC511160K2w : arrayList) {
                                AbstractC511160K2w abstractC511160K2w2 = abstractC511160K2w;
                                if (abstractC511160K2w2 instanceof C0K3J) {
                                    C0K3J c0k3j = (C0K3J) abstractC511160K2w2;
                                    if (c0k3j.LIZJ() != C0K2L.COMMENT && c0k3j.LIZLLL() == jLIZLLL) {
                                        arrayList4.add(abstractC511160K2w);
                                    }
                                }
                            }
                            int size = arrayList4.size();
                            long j = responseData.totalCount;
                            c0k3k.LIZIZ = j - ((long) size);
                            c0k3k.LIZLLL = j;
                            ListProtector.add(arrayList, arrayList3.size() + i2, c0k3k);
                            C0K37 c0k374 = c0k3g.LLILLL;
                            if (c0k374 != null) {
                                c0k374.notifyItemRangeInserted(i2, arrayList3.size() + 1);
                            }
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("DetailFeedManager@2efb.loadNextReply$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$14(Y.AfS103S0300000_7 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS103S0300000_7.accept$14(Y.AfS103S0300000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$15(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        SpacePoll spacePoll;
        C1C7U.LIZ("SubSpaceDetailVM@57b0.votePoll$1");
        PGCPollVoteResponse.ResponseData responseData = (PGCPollVoteResponse.ResponseData) ((DataResponse) obj).data;
        if (responseData != null && (spacePoll = responseData.poll) != null) {
            ((C0K34) afS103S0300000_7.l1).LIZ.pollInfo = spacePoll;
        }
        C0K3G c0k3g = ((SubSpaceDetailVM) afS103S0300000_7.l0).LLILLL;
        if (c0k3g != null) {
            c0k3g.LJ(((C0K34) afS103S0300000_7.l1).LIZ);
        }
        ((Function0) afS103S0300000_7.l2).invoke();
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.votePoll$1");
    }

    public static final void accept$16(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        LiveDialogFragment liveDialogFragment;
        C1C7U.LIZ("OverlayPermissionController@3298.checkPermissionV2$2$dispose$1");
        if (obj == Lifecycle.Event.ON_RESUME) {
            boolean zLJFF = C0W78.LJFF(((C500730JkN) afS103S0300000_7.l0).LL.getActivity());
            if (zLJFF && (liveDialogFragment = (LiveDialogFragment) afS103S0300000_7.l1) != null && liveDialogFragment.isShowing()) {
                ((LiveDialogFragment) afS103S0300000_7.l1).dismiss();
            }
            if (!((C013C) afS103S0300000_7.l2).element && !zLJFF) {
                C500730JkN c500730JkN = (C500730JkN) afS103S0300000_7.l0;
                c500730JkN.LLILZ = "back_from_overlay";
                c500730JkN.LJII();
            }
            ((C013C) afS103S0300000_7.l2).element = false;
        }
        C1C7U.LIZIZ("OverlayPermissionController@3298.checkPermissionV2$2$dispose$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$17(Y.AfS103S0300000_7 r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS103S0300000_7.accept$17(Y.AfS103S0300000_7, java.lang.Object):void");
    }

    public static final void accept$18(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C470600Ics c470600Ics = (C470600Ics) afS103S0300000_7.l0;
        C471830Ier c471830Ier = (C471830Ier) afS103S0300000_7.l1;
        AbstractC470790IdB abstractC470790IdB = (AbstractC470790IdB) afS103S0300000_7.l2;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.loadAfter$2L");
        c470600Ics.LJIIIIZZ.postValue(new C470770Id9(EnumC470780IdA.FAILED));
        c470600Ics.LJIILL = new ARunnableS40S0300000_7(c470600Ics, c471830Ier, abstractC470790IdB, 10);
        C1C7U.LIZIZ("RxCacheDataSource@388c.loadAfter$2L");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void accept$19(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C470600Ics c470600Ics = (C470600Ics) afS103S0300000_7.l0;
        C485050J0l c485050J0l = (C485050J0l) afS103S0300000_7.l1;
        AbstractC470800IdC abstractC470800IdC = (AbstractC470800IdC) afS103S0300000_7.l2;
        Throwable th = (Throwable) obj;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.handleObservable$2L");
        c470600Ics.LJIIL.LJII = false;
        MutableLiveData<C470770Id9> mutableLiveData = c470600Ics.LJIIIZ;
        EnumC470780IdA enumC470780IdA = EnumC470780IdA.FAILED;
        mutableLiveData.postValue(new C470770Id9(enumC470780IdA));
        c470600Ics.LJIIIIZZ.postValue(new C470770Id9(enumC470780IdA));
        if (!c470600Ics.LJIILL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception not my generation ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LIZIZ("RxCacheDataSource", C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("RxCacheDataSource@388c.handleObservable$2L");
            return;
        }
        if (c470600Ics.LJIIL.LJII) {
            if (c470600Ics.LJIIL.LJII) {
                c470600Ics.LJI.LIZIZ(c470600Ics.LJFF);
                c470600Ics.LJII.LIZ(c470600Ics.LJFF);
                c470600Ics.LJIIL.LJII = false;
            }
            c470600Ics.LJIILL = new ARunnableS107S0100000_7(c470600Ics, 198);
        } else {
            c470600Ics.LJIILL = new ARunnableS40S0300000_7(c470600Ics, c485050J0l, abstractC470800IdC, 9);
        }
        C1C7U.LIZIZ("RxCacheDataSource@388c.handleObservable$2L");
    }

    public static final void accept$2(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("TryModeLiveProfileDialog@d53f.queryLatestUser$1");
        ((TryModeLiveProfileDialog) afS103S0300000_7.l0).LLILLJJLI = ((InterfaceC500940Jki) afS103S0300000_7.l1).LJIJJLI();
        Function0 function0 = (Function0) afS103S0300000_7.l2;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("TryModeLiveProfileDialog@d53f.queryLatestUser$1");
    }

    public static final void accept$20(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("BackupDataManager@227c.tryLoadMore$2");
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        StringBuilder sb = new StringBuilder("tryLoadMore: result=");
        List<T> list = baseListResponse.data;
        if (list != 0) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((FeedItem) it2.next()).getRoom().getId()));
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        C20441214yg.LIZIZ("BackupDataManager", sb.toString());
        C0ISZ c0isz = (C0ISZ) afS103S0300000_7.l0;
        c0isz.LIZIZ = false;
        ((C0ISZ) afS103S0300000_7.l0).LIZJ(c0isz.LIZ(EnumC466740ISa.LLILLJJLI, baseListResponse.data, (FeedExtra) baseListResponse.extra, (Function2) afS103S0300000_7.l1), "backup_req", System.currentTimeMillis() - ((C238400w2) afS103S0300000_7.l2).element, null);
        C1C7U.LIZIZ("BackupDataManager@227c.tryLoadMore$2");
    }

    public static final void accept$21(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("LiveRepostManager@c2f7.handleRepostBubble$1");
        ((C498770JhD) afS103S0300000_7.l0).LIZJ((InterfaceC1103130eoR) afS103S0300000_7.l1, (DataChannel) afS103S0300000_7.l2);
        C1C7U.LIZIZ("LiveRepostManager@c2f7.handleRepostBubble$1");
    }

    public static final void accept$22(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("LiveCombineReqeust@92d7.checkCombine$3");
        Map map = (Map) obj;
        Set setKeySet = map.keySet();
        C497120JeY c497120JeY = (C497120JeY) afS103S0300000_7.l0;
        for (Object obj2 : setKeySet) {
            Object obj3 = map.get(obj2);
            if (obj3 != null) {
                c497120JeY.LJFF.put((String) obj2, (String) obj3);
            } else {
                c497120JeY.LJFF.remove(obj2);
            }
        }
        ((C497120JeY) afS103S0300000_7.l0).LIZLLL((List) afS103S0300000_7.l1, (Function2) afS103S0300000_7.l2);
        C1C7U.LIZIZ("LiveCombineReqeust@92d7.checkCombine$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$23(Y.AfS103S0300000_7 r12, java.lang.Object r13) {
        /*
            java.lang.String r11 = "SubSpaceFeedVM@7436.sendComment$1"
            X.C1C7U.LIZ(r11)
            com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse r13 = (com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse) r13
            java.lang.Object r1 = r12.l0
            com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM r1 = (com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM) r1
            T r0 = r13.data
            webcast.api.pgc_sub.PGCCommentSendResp$ResponseData r0 = (webcast.api.pgc_sub.PGCCommentSendResp.ResponseData) r0
            if (r0 == 0) goto L91
            com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r8 = r0.comment
        L13:
            java.lang.Object r7 = r12.l1
            com.bytedance.android.livesdk.chatroom.api.SpacePost r7 = (com.bytedance.android.livesdk.chatroom.api.SpacePost) r7
            if (r8 != 0) goto L27
            r1.getClass()
        L1c:
            java.lang.Object r0 = r12.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            X.C1C7U.LIZIZ(r11)
            return
        L27:
            X.0K2r r6 = r1.LLILZIL
            if (r6 == 0) goto L1c
            X.0K2Z r0 = r6.LLILLL
            if (r0 == 0) goto L1c
            java.util.ArrayList<X.0K2w> r5 = r0.LL
            if (r5 == 0) goto L1c
            com.bytedance.android.livesdk.chatroom.api.SpacePoll r0 = r7.pollInfo
            if (r0 == 0) goto L73
            int r0 = r5.size()
            java.util.ListIterator r9 = r5.listIterator(r0)
        L3f:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r9.previous()
            X.0K2w r1 = (X.AbstractC511160K2w) r1
            boolean r0 = r1 instanceof X.C0K34
            if (r0 == 0) goto L3f
            X.0K34 r1 = (X.C0K34) r1
            com.bytedance.android.livesdk.chatroom.api.SpacePost r0 = r1.LIZ
            long r2 = r0.postId
            long r0 = r7.postId
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L3f
            int r9 = r9.nextIndex()
        L5f:
            if (r9 < 0) goto L1c
            int r1 = r9 + 1
            X.0K3J r0 = new X.0K3J
            r0.<init>(r8, r7)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, r1, r0)
            X.0K2Z r0 = r6.LLILLL
            if (r0 == 0) goto L1c
            r0.notifyItemInserted(r1)
            goto L1c
        L73:
            java.util.Iterator r10 = r5.iterator()
            r9 = 0
        L78:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r10.next()
            X.0K2w r0 = (X.AbstractC511160K2w) r0
            long r3 = r0.LIZIZ()
            long r1 = r7.postId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L5f
            int r9 = r9 + 1
            goto L78
        L91:
            r8 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS103S0300000_7.accept$23(Y.AfS103S0300000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$24(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        SpacePost spacePost;
        boolean zLIZJ;
        String str;
        Long lValueOf;
        String currentUserID;
        SpaceTopicContent spaceTopicContent;
        SpaceTopicCategory spaceTopicCategory;
        SpacePost spacePost2;
        C1C7U.LIZ("SubSpaceFeedVM@7436.sendPost$1");
        DataResponse dataResponse = (DataResponse) obj;
        InterfaceC665370Q7z interfaceC665370Q7z = ((SubSpaceFeedVM) afS103S0300000_7.l0).LL;
        String str2 = null;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
        if (subSpaceFeedAbility != null) {
            PGCPostCreateResp.ResponseData responseData = (PGCPostCreateResp.ResponseData) dataResponse.data;
            if (responseData != null) {
                spacePost2 = responseData.post;
            } else {
                spacePost2 = null;
            }
            subSpaceFeedAbility.jn(spacePost2);
        }
        ((Function0) afS103S0300000_7.l1).invoke();
        C0K2D c0k2dXQ2 = ((SubSpaceFeedVM) afS103S0300000_7.l0).xQ2();
        PGCPostCreateResp.ResponseData responseData2 = (PGCPostCreateResp.ResponseData) dataResponse.data;
        if (responseData2 != null) {
            spacePost = responseData2.post;
        } else {
            spacePost = null;
        }
        PGCPostCreateReq pGCPostCreateReq = (PGCPostCreateReq) afS103S0300000_7.l2;
        C511110K2r c511110K2r = ((SubSpaceFeedVM) afS103S0300000_7.l0).LLILZIL;
        if (c511110K2r != null) {
            zLIZJ = c511110K2r.LIZJ();
        } else {
            zLIZJ = 0;
        }
        c0k2dXQ2.getClass();
        if (spacePost != null) {
            C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_newpost_publish");
            c511970K5z.LIZIZ(C0K2D.LIZIZ(spacePost), "post_type");
            SpaceTopicInfo spaceTopicInfo = pGCPostCreateReq.topicInfo;
            if (spaceTopicInfo != null && (spaceTopicCategory = spaceTopicInfo.spaceTopicCategory) != null) {
                str = spaceTopicCategory.topicCategoryText;
            } else {
                str = null;
            }
            c511970K5z.LIZIZ(str, "topic_type");
            SpaceTopicInfo spaceTopicInfo2 = pGCPostCreateReq.topicInfo;
            if (spaceTopicInfo2 != null && (spaceTopicContent = spaceTopicInfo2.spaceTopicContent) != null) {
                lValueOf = Long.valueOf(spaceTopicContent.topicContentId);
            } else {
                lValueOf = null;
            }
            c511970K5z.LIZIZ(lValueOf, "template_id");
            c511970K5z.LIZIZ(Integer.valueOf(!zLIZJ), "is_first_publish");
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                currentUserID = "";
            }
            c511970K5z.LIZIZ(currentUserID, "anchor_id");
            C511370K3r c511370K3r = c0k2dXQ2.LIZ;
            if (c511370K3r != null) {
                str2 = c511370K3r.LLJIJIL;
            }
            c511970K5z.LIZIZ(str2, "space_show_entrance");
            c511970K5z.LIZLLL();
        }
        C1C7U.LIZIZ("SubSpaceFeedVM@7436.sendPost$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$25(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        SpacePoll spacePoll;
        C1C7U.LIZ("SubSpaceFeedVM@7436.votePoll$1");
        PGCPollVoteResponse.ResponseData responseData = (PGCPollVoteResponse.ResponseData) ((DataResponse) obj).data;
        if (responseData != null && (spacePoll = responseData.poll) != null) {
            ((C0K34) afS103S0300000_7.l1).LIZ.pollInfo = spacePoll;
        }
        C511110K2r c511110K2r = ((SubSpaceFeedVM) afS103S0300000_7.l0).LLILZIL;
        if (c511110K2r != null) {
            c511110K2r.LIZLLL(((C0K34) afS103S0300000_7.l1).LIZ);
        }
        ((Function0) afS103S0300000_7.l2).invoke();
        C1C7U.LIZIZ("SubSpaceFeedVM@7436.votePoll$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$26(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        long j;
        C1C7U.LIZ("ShowLocationUtil@5031.initLocationSwitchInterval$2$clickListener$1$onClick$1$2");
        DataChannel dataChannel = (DataChannel) afS103S0300000_7.l0;
        CompoundButton compoundButton = (CompoundButton) afS103S0300000_7.l1;
        Boolean boolValueOf3 = null;
        if (compoundButton != null) {
            boolValueOf = Boolean.valueOf(compoundButton.isChecked());
        } else {
            boolValueOf = null;
        }
        C475020Ik0.LIZIZ(false, C500260Jjc.LJJIFFI(boolValueOf), dataChannel);
        CompoundButton compoundButton2 = (CompoundButton) afS103S0300000_7.l1;
        if (compoundButton2 != null) {
            compoundButton2.setChecked(!compoundButton2.isChecked());
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        CompoundButton compoundButton3 = (CompoundButton) afS103S0300000_7.l1;
        if (compoundButton3 != null) {
            boolValueOf2 = Boolean.valueOf(compoundButton3.isChecked());
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf2)) {
            j = 1;
        } else {
            j = 2;
        }
        dataChannelGlobal.JQ2(C1148080fyw.class, Long.valueOf(j));
        C474990Ijx c474990Ijx = (C474990Ijx) ((C259800zU) afS103S0300000_7.l2).element;
        if (c474990Ijx != null) {
            CompoundButton compoundButton4 = (CompoundButton) afS103S0300000_7.l1;
            if (compoundButton4 != null) {
                boolValueOf3 = Boolean.valueOf(compoundButton4.isChecked());
            }
            if (C500260Jjc.LJJJI(boolValueOf3)) {
                c474990Ijx.LIZ();
                c474990Ijx.LIZIZ(true);
            } else {
                InterfaceC1106030et7.m5.LIZJ(Boolean.FALSE);
                dataChannelGlobal.FQ2(LiveAudienceLocationBubbleSwitchUnchecked.class, Boolean.TRUE);
                c474990Ijx.LIZIZ(false);
            }
        }
        C1C7U.LIZIZ("ShowLocationUtil@5031.initLocationSwitchInterval$2$clickListener$1$onClick$1$2");
    }

    public static final void accept$27(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        String containerID;
        C1C7U.LIZ("AdSubmitAdDislikeMethod@561.handle$1");
        C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "not_interested", (Aweme) afS103S0300000_7.l0));
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = ((C519930KaF) afS103S0300000_7.l1).IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(containerID);
        if (interfaceC1059280dfiLIZ != null) {
            interfaceC1059280dfiLIZ.close();
        }
        InterfaceC634840OvC interfaceC634840OvC2 = ((C519930KaF) afS103S0300000_7.l1).IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC519890KaB interfaceC519890KaB = (InterfaceC519890KaB) C1909107dp.LIZJ(InterfaceC519890KaB.class, containerID2);
        interfaceC519890KaB.setCode(1);
        ((CompletionBlock) afS103S0300000_7.l2).onSuccess(interfaceC519890KaB, "");
        C1C7U.LIZIZ("AdSubmitAdDislikeMethod@561.handle$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$28(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        T t;
        C0IKZ c0ikz = (C0IKZ) afS103S0300000_7.l0;
        C0IKY c0iky = (C0IKY) afS103S0300000_7.l1;
        C0IK0 c0ik0 = (C0IK0) afS103S0300000_7.l2;
        BaseResponse baseResponse = (BaseResponse) obj;
        C1C7U.LIZ("LiveHostAction@d608.requestAceAccountInfo$1L");
        if (c0ikz != null && (t = baseResponse.data) != 0) {
            long j = ((CrowdSelectionResponse.Data) t).anchorCrowd;
            if (j != -1) {
                c0iky.LIZ = c0ik0.enterFrom;
                c0iky.LIZIZ = c0ik0.enterMethod;
                c0iky.LIZJ = j;
                c0ikz.LIZ(c0iky);
            }
        }
        C1C7U.LIZIZ("LiveHostAction@d608.requestAceAccountInfo$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$29(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.uploadImageWhenFileReady$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        if (t != 0) {
            CoverImageModel coverImageModel = (CoverImageModel) t;
            if (coverImageModel.urlList != null) {
                Function1 function1 = (Function1) afS103S0300000_7.l0;
                if (function1 != null) {
                    function1.invoke(coverImageModel.uri);
                }
                DataChannel dataChannel = (DataChannel) afS103S0300000_7.l1;
                if (dataChannel != null) {
                    dataChannel.SX0(C749040TZu.class, ((CoverImageModel) baseResponse.data).uri);
                }
                DataChannel dataChannel2 = (DataChannel) afS103S0300000_7.l1;
                if (dataChannel2 != null) {
                    C0JFN.LIZ.getClass();
                    dataChannel2.SX0(C749030TZt.class, C0JFN.LJIJJ(dataChannel2));
                }
                C2355009Kq.LJIILL(((File) afS103S0300000_7.l2).getPath());
            }
        }
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.uploadImageWhenFileReady$1");
    }

    public static final void accept$3(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("LiveHostWatch@2a8.watchLive$2");
        com.bytedance.android.live.base.model.user.User user = (com.bytedance.android.live.base.model.user.User) obj;
        long liveRoomId = user.getLiveRoomId();
        if (liveRoomId > 0) {
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) afS103S0300000_7.l0;
            enterRoomConfig.mRoomsData.roomId = liveRoomId;
            enterRoomConfig.mLogData.userFrom = liveRoomId;
            ((LiveHostWatch) afS103S0300000_7.l1).watchLiveFromSchema((Context) afS103S0300000_7.l2, (EnterRoomConfig) afS103S0300000_7.l0);
        } else if (C500260Jjc.LJJIIZ(user.getUsername())) {
            ((LiveHostWatch) afS103S0300000_7.l1).watchLive((Context) afS103S0300000_7.l2, (EnterRoomConfig) afS103S0300000_7.l0, user.getUsername());
        } else {
            LiveHostWatch liveHostWatch = (LiveHostWatch) afS103S0300000_7.l1;
            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) afS103S0300000_7.l0;
            liveHostWatch.getClass();
            LiveHostWatch.LIZIZ(enterRoomConfig2, "failed_by_userid");
            C766270U4b.LJIIIZ((Context) afS103S0300000_7.l2, C497740JfY.LJII().getString(2131853475));
        }
        C1C7U.LIZIZ("LiveHostWatch@2a8.watchLive$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$30(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.requestNewRound$1");
        StartDrawGuessResponse startDrawGuessResponse = (StartDrawGuessResponse) ((BaseResponse) obj).data;
        if (startDrawGuessResponse == null) {
            ((Function1) afS103S0300000_7.l0).invoke(Boolean.FALSE);
        } else {
            C0JFN c0jfn = C0JFN.LIZ;
            DataChannel dataChannel = (DataChannel) afS103S0300000_7.l1;
            long j = startDrawGuessResponse.pictionaryId;
            long j2 = startDrawGuessResponse.sessionId;
            DrawGuessWord drawGuessWord = (DrawGuessWord) afS103S0300000_7.l2;
            c0jfn.getClass();
            C0JFN.LJIJ(j, j2, drawGuessWord, dataChannel, false);
            ((Function1) afS103S0300000_7.l0).invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestNewRound$1");
    }

    public static final void accept$4(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        Context context;
        C1C7U.LIZ("SubSpaceDetailVM@57b0.postActionTopic$2");
        Throwable th = (Throwable) obj;
        ((SubSpaceDetailVM) afS103S0300000_7.l0).LLILZIL.remove((PGCPostActionRequest) afS103S0300000_7.l1);
        C0K3S c0k3sXQ2 = ((SubSpaceDetailVM) afS103S0300000_7.l0).xQ2();
        if (c0k3sXQ2 != null) {
            context = c0k3sXQ2.LL;
        } else {
            context = null;
        }
        C511230K3d.LIZ(context, th, 2131839337);
        C0K3G c0k3g = ((SubSpaceDetailVM) afS103S0300000_7.l0).LLILLL;
        if (c0k3g != null) {
            c0k3g.LJ(((AbstractC511160K2w) afS103S0300000_7.l2).LIZ());
        }
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.postActionTopic$2");
    }

    public static final void accept$5(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("SubSpaceFeedVM@7436.postAction$2");
        ((SubSpaceFeedVM) afS103S0300000_7.l0).LLIZLLLIL.remove((PGCPostActionRequest) afS103S0300000_7.l1);
        C511230K3d.LIZ(((SubSpaceFeedVM) afS103S0300000_7.l0).LLILLJJLI, (Throwable) obj, 2131839337);
        C511110K2r c511110K2r = ((SubSpaceFeedVM) afS103S0300000_7.l0).LLILZIL;
        if (c511110K2r != null) {
            c511110K2r.LIZLLL((SpacePost) afS103S0300000_7.l2);
        }
        C1C7U.LIZIZ("SubSpaceFeedVM@7436.postAction$2");
    }

    public static final void accept$6(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        boolean z;
        TuxIconView tuxIconView;
        int i;
        Long lValueOf;
        com.bytedance.android.live.base.model.user.User owner;
        C1C7U.LIZ("FollowLiveBubbleManager@dbde.showFollowBubble$1");
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        int i2 = 0;
        ((C487270J8z) afS103S0300000_7.l0).LJIIIIZZ = false;
        if (C0J9F.LIZIZ(true).length() == 0) {
            C487270J8z c487270J8z = (C487270J8z) afS103S0300000_7.l0;
            if (!c487270J8z.LJIIJJI && Intrinsics.LJFF(c487270J8z.LIZJ, "For You") && Intrinsics.LJFF(c487270J8z.LIZLLL, "HOME") && (!baseListResponse.data.isEmpty())) {
                C487270J8z c487270J8z2 = (C487270J8z) afS103S0300000_7.l0;
                List<T> list = baseListResponse.data;
                c487270J8z2.getClass();
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Room room = ((FeedItem) it2.next()).getRoom();
                    if (room != null && (owner = room.getOwner()) != null) {
                        lValueOf = Long.valueOf(owner.getId());
                    } else {
                        lValueOf = null;
                    }
                    arrayList.add(String.valueOf(lValueOf));
                }
                int size = list.size();
                C0J90 c0j90 = C0J9F.LIZJ;
                c0j90.LIZ = 2;
                c0j90.LIZIZ = size;
                c0j90.LIZJ = arrayList;
                C487270J8z c487270J8z3 = (C487270J8z) afS103S0300000_7.l0;
                C487250J8x c487250J8x = (C487250J8x) afS103S0300000_7.l1;
                List<T> list2 = baseListResponse.data;
                c487270J8z3.getClass();
                if (list2.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                TextView textView = (TextView) c487250J8x.LIZLLL.findViewById(R.id.z0c);
                if (textView != null) {
                    if (z) {
                        i = 2131841008;
                    } else {
                        i = 2131841006;
                    }
                    textView.setText(i);
                }
                for (T t : list2) {
                    int i3 = i2 + 1;
                    if (i2 > 2) {
                        break;
                    }
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && (tuxIconView = (TuxIconView) c487250J8x.LIZLLL.findViewById(R.id.z0b)) != null) {
                                C487270J8z.LJIILIIL(tuxIconView, t);
                            }
                        } else {
                            TuxIconView tuxIconView2 = (TuxIconView) c487250J8x.LIZLLL.findViewById(R.id.z0a);
                            if (tuxIconView2 != null) {
                                C487270J8z.LJIILIIL(tuxIconView2, t);
                            }
                        }
                    } else {
                        TuxIconView tuxIconView3 = (TuxIconView) c487250J8x.LIZLLL.findViewById(R.id.z0_);
                        if (tuxIconView3 != null) {
                            C487270J8z.LJIILIIL(tuxIconView3, t);
                        }
                    }
                    i2 = i3;
                }
                C487270J8z c487270J8z4 = (C487270J8z) afS103S0300000_7.l0;
                c487270J8z4.LJIIJ = true;
                final C19EG c19eg = (C19EG) afS103S0300000_7.l2;
                final C487250J8x c487250J8x2 = (C487250J8x) afS103S0300000_7.l1;
                final ARunnableS76S0200000_7 aRunnableS76S0200000_7 = new ARunnableS76S0200000_7(c487250J8x2, c487270J8z4, 35);
                PopupManager.LJIJI(new C10GR(c19eg, c487250J8x2, aRunnableS76S0200000_7) { // from class: X.0Ns1
                    public final C19EG LL;
                    public final C487250J8x LLILLJJLI;
                    public final Runnable LLILLL;
                    public final int LLILZ = 1999;

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        C19EG c19eg2 = this.LL;
                        return new C688120Qyw(c19eg2, c19eg2, null);
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LLILZ;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                        C487250J8x c487250J8x3 = this.LLILLJJLI;
                        c487250J8x3.LJ.add(new InterfaceC482890Iwh() { // from class: X.0Ns2
                            @Override // X.InterfaceC482890Iwh
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC482890Iwh
                            public final void LIZJ() {
                            }

                            @Override // X.InterfaceC482890Iwh
                            public final void LIZIZ() {
                                c20656615sK.LIZ();
                            }
                        });
                        this.LLILLL.run();
                    }

                    {
                        this.LL = c19eg;
                        this.LLILLJJLI = c487250J8x2;
                        this.LLILLL = aRunnableS76S0200000_7;
                    }
                }, true);
            }
        }
        C1C7U.LIZIZ("FollowLiveBubbleManager@dbde.showFollowBubble$1");
    }

    public static final void accept$7(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        C1C7U.LIZ("FansClubEmotePresenter@7db8.showEmotePanel$1");
        C519870Ka9 c519870Ka9 = (C519870Ka9) afS103S0300000_7.l0;
        C1109770ez9 c1109770ez9 = (C1109770ez9) afS103S0300000_7.l1;
        EmoteModel emoteModel = (EmoteModel) afS103S0300000_7.l2;
        c519870Ka9.getClass();
        C1110530f0N c1110530f0N = new C1110530f0N(4, "fans_sticker", "fans_club_sticker", false);
        c1110530f0N.LJIIJJI = emoteModel;
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        if (dataChannel != null) {
            dataChannel.LC0(UserWannaSendMessageEvent.class, c1110530f0N);
        }
        C1C7U.LIZIZ("FansClubEmotePresenter@7db8.showEmotePanel$1");
    }

    public static final void accept$8(AfS103S0300000_7 afS103S0300000_7, Object obj) throws JSONException {
        C1C7U.LIZ("ResubscribeStrategy@155b.tryRecoverContract$2$1$2");
        Throwable th = (Throwable) obj;
        Context contextLIZJ = C511520K4g.LIZJ();
        if (contextLIZJ != null || (contextLIZJ = ((C0KLA) afS103S0300000_7.l0).LJIIIZ) != null) {
            C511230K3d.LIZ(contextLIZJ, th, 2131839337);
        }
        C516100KLw c516100KLwLIZ = C0KM8.LIZ();
        C516000KLm c516000KLm = C516000KLm.LIZ;
        c516000KLm.LJIIJ(true, "", "recover_sub", ((C0KMZ) afS103S0300000_7.l1).LIZ, c516100KLwLIZ, null);
        c516000KLm.LJIIIIZZ(true, System.currentTimeMillis(), C512310K7h.LIZIZ(th), "recover_sub", ((C0KMZ) afS103S0300000_7.l1).LIZ, c516100KLwLIZ, 0, C512310K7h.LIZJ(th), th, null);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS103S0300000_7.l2;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
        C1C7U.LIZIZ("ResubscribeStrategy@155b.tryRecoverContract$2$1$2");
    }

    public static final void accept$9(AfS103S0300000_7 afS103S0300000_7, Object obj) {
        Context context;
        C1C7U.LIZ("ToolbarFloatWindowBehavior@fa46.showPermissionTipDialog$dispose$1");
        if (obj == Lifecycle.Event.ON_RESUME) {
            C20743716Ff c20743716Ff = ((C500110JjN) afS103S0300000_7.l0).LL;
            if (c20743716Ff != null) {
                context = c20743716Ff.getContext();
            } else {
                context = null;
            }
            if (C0W78.LJFF(context) && ((FloatWindowTipsDialog) afS103S0300000_7.l1).isShowing()) {
                ((FloatWindowTipsDialog) afS103S0300000_7.l1).dismiss();
            }
            ((C013C) afS103S0300000_7.l2).element = false;
        }
        C1C7U.LIZIZ("ToolbarFloatWindowBehavior@fa46.showPermissionTipDialog$dispose$1");
    }

    public AfS103S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
