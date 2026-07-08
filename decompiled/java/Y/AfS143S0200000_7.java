package Y;

import X.AbstractC511160K2w;
import X.C09JN;
import X.C0IJT;
import X.C0IKQ;
import X.C0IO0;
import X.C0IO1;
import X.C0ISZ;
import X.C0IXN;
import X.C0J7Y;
import X.C0JDS;
import X.C0JDY;
import X.C0JFN;
import X.C0JHC;
import X.C0K0R;
import X.C0K2D;
import X.C0K2Q;
import X.C0K37;
import X.C0K3A;
import X.C0K3G;
import X.C0K3I;
import X.C0K3J;
import X.C0K3K;
import X.C0K3O;
import X.C0K3S;
import X.C0K3T;
import X.C0K4A;
import X.C0K4F;
import X.C0K9V;
import X.C0KBS;
import X.C0UO0;
import X.C0UX8;
import X.C1102070emj;
import X.C1102420enI;
import X.C1106110etF;
import X.C1110530f0N;
import X.C1161920gLG;
import X.C11JF;
import X.C13BV;
import X.C13LP;
import X.C1529880puk;
import X.C15438062q;
import X.C181500mr;
import X.C1909107dp;
import X.C19322110iZ;
import X.C19719512Dh;
import X.C1C7U;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C238400w2;
import X.C464330IIt;
import X.C467770IVz;
import X.C469620IbI;
import X.C470570Icp;
import X.C470600Ics;
import X.C470610Ict;
import X.C472820IgS;
import X.C473300IhE;
import X.C474500IjA;
import X.C477290Inf;
import X.C479040IqU;
import X.C482260Ivg;
import X.C489040JFu;
import X.C501470JlZ;
import X.C501520Jle;
import X.C510430K0b;
import X.C511230K3d;
import X.C511240K3e;
import X.C511370K3r;
import X.C511520K4g;
import X.C512300K7g;
import X.C512760K9a;
import X.C519930KaF;
import X.C570810Ma7;
import X.C748850TZb;
import X.C748880TZe;
import X.C749020TZs;
import X.C749080TZy;
import X.C749960TbO;
import X.C766270U4b;
import X.C776250Uch;
import X.C782710Un7;
import X.C786410Ut5;
import X.C916790Zxt;
import X.EnumC471720Ieg;
import X.EnumC507420JvA;
import X.InterfaceC1059280dfi;
import X.InterfaceC1102120emo;
import X.InterfaceC1106030et7;
import X.InterfaceC1631620sYq;
import X.InterfaceC466370IQp;
import X.InterfaceC469640IbK;
import X.InterfaceC475140IkC;
import X.InterfaceC475810IlH;
import X.InterfaceC519890KaB;
import X.InterfaceC634840OvC;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.programmedlive.model.FollowCard;
import com.bytedance.android.live.programmedlive.model.FollowCardResponse;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdk.model.message.ShareGuideMessage;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyRecord;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyRecord;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseDescVAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.fragment.SubSpacePostCategoryFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCCommentSendResp;
import webcast.api.pgc_sub.PGCPollUserListResponse;
import webcast.api.pgc_sub.PGCTopicByCategory;
import webcast.api.pgc_sub.PGCTopicResponse;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.smb.GetSMBCourseDetailResponse;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AfS143S0200000_7 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void accept$0(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C0J7Y c0j7y = (C0J7Y) afS143S0200000_7.l0;
        List list = (List) afS143S0200000_7.l1;
        c0j7y.getClass();
        C1C7U.LIZ("LiveStateManager@a4a7.refreshUserListForFeed$2L");
        c0j7y.LJIILJJIL(list, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError:");
        sbLIZ.append(Log.getStackTraceString((Throwable) obj));
        C2344809Gs.LJFF("LiveStateManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveStateManager@a4a7.refreshUserListForFeed$2L");
    }

    public static final void accept$1(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("RedDotManager@1a7e.init$2");
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        C0UX8 c0ux8 = (C0UX8) afS143S0200000_7.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) afS143S0200000_7.l1;
        c782710Un7.getClass();
        C782710Un7.LJIILIIL(c0ux8, lifecycleOwner);
        C1C7U.LIZIZ("RedDotManager@1a7e.init$2");
    }

    public static final void accept$10(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("TryModeLiveProfileDialog@d53f.queryLatestUser$3");
        ((TryModeLiveProfileDialog) afS143S0200000_7.l0).LLILLJJLI = (User) obj;
        Function0 function0 = (Function0) afS143S0200000_7.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("TryModeLiveProfileDialog@d53f.queryLatestUser$3");
    }

    public static final void accept$11(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("LiveHostWatch@2a8.watchLive$3");
        LiveHostWatch liveHostWatch = (LiveHostWatch) afS143S0200000_7.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) afS143S0200000_7.l1;
        liveHostWatch.getClass();
        LiveHostWatch.LIZIZ(enterRoomConfig, "network_error");
        C20441214yg.LJI("userid_watchLive", (Throwable) obj);
        C1C7U.LIZIZ("LiveHostWatch@2a8.watchLive$3");
    }

    public static final void accept$12(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        Long l;
        String strI90;
        String str;
        LinkedHashMap linkedHashMap;
        SMBCourse sMBCourse;
        ContentAuditStatus contentAuditStatus;
        LinkedHashMap linkedHashMap2;
        SMBCourse sMBCourse2;
        ContentAuditStatus contentAuditStatus2;
        LinkedHashMap linkedHashMap3;
        C1C7U.LIZ("PcsCourseManageVM@778d.postCourseDetail$2");
        PcsCourseManageVM pcsCourseManageVM = (PcsCourseManageVM) afS143S0200000_7.l0;
        C0JHC c0jhcZQ2 = pcsCourseManageVM.zQ2();
        if (c0jhcZQ2 != null && (l = c0jhcZQ2.LLILLJJLI) != null) {
            long jLongValue = l.longValue();
            if (pcsCourseManageVM.CQ2()) {
                C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.g9;
                Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                if (mapLIZIZ != null) {
                    linkedHashMap3 = new LinkedHashMap(mapLIZIZ);
                } else {
                    linkedHashMap3 = new LinkedHashMap();
                }
                linkedHashMap3.put(String.valueOf(jLongValue), Boolean.TRUE);
                c20337914i1.LJFF(linkedHashMap3);
            }
            IPcsCourseDescVAbility iPcsCourseDescVAbilityYQ2 = pcsCourseManageVM.yQ2();
            if (iPcsCourseDescVAbilityYQ2 == null || (strI90 = iPcsCourseDescVAbilityYQ2.I90()) == null) {
                strI90 = "";
            }
            GetSMBCourseDetailResponse.Data data = pcsCourseManageVM.getState().LLILLJJLI;
            String str2 = null;
            if (data != null && (sMBCourse2 = data.course) != null && (contentAuditStatus2 = sMBCourse2.description) != null) {
                str = contentAuditStatus2.content;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(strI90, str)) {
                C20337914i1<Map<String, Boolean>> c20337914i12 = InterfaceC1106030et7.h9;
                Map<String, Boolean> mapLIZIZ2 = c20337914i12.LIZIZ();
                if (mapLIZIZ2 != null) {
                    linkedHashMap2 = new LinkedHashMap(mapLIZIZ2);
                } else {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap2.put(String.valueOf(jLongValue), Boolean.TRUE);
                c20337914i12.LJFF(linkedHashMap2);
            }
            String strLIZ = C0JDS.LIZ(pcsCourseManageVM.getState());
            GetSMBCourseDetailResponse.Data data2 = pcsCourseManageVM.getState().LLILLJJLI;
            if (data2 != null && (sMBCourse = data2.course) != null && (contentAuditStatus = sMBCourse.pinText) != null) {
                str2 = contentAuditStatus.content;
            }
            if (!Intrinsics.LJFF(strLIZ, str2)) {
                C20337914i1<Map<String, Boolean>> c20337914i13 = InterfaceC1106030et7.i9;
                Map<String, Boolean> mapLIZIZ3 = c20337914i13.LIZIZ();
                if (mapLIZIZ3 != null) {
                    linkedHashMap = new LinkedHashMap(mapLIZIZ3);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(String.valueOf(jLongValue), Boolean.TRUE);
                c20337914i13.LJFF(linkedHashMap);
            }
        }
        ((C0JDY) afS143S0200000_7.l1).onSuccess();
        C1C7U.LIZIZ("PcsCourseManageVM@778d.postCourseDetail$2");
    }

    public static final void accept$13(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("VideoPublishEditModelExtAPIKt@36de.musicPermissionCheck$2");
        C570810Ma7.LIZ(0, "response is null", (String) C13LP.LJJJJZI((List) afS143S0200000_7.l0));
        ((Function1) afS143S0200000_7.l1).invoke(Boolean.TRUE);
        C1C7U.LIZIZ("VideoPublishEditModelExtAPIKt@36de.musicPermissionCheck$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        PGCTopicResponse.ResponseData responseData;
        C1C7U.LIZ("SubSpacePostCategoryFragment@37c6.initPostTopic$1$1$2");
        DataResponse dataResponse = (DataResponse) obj;
        if (dataResponse != null && (responseData = (PGCTopicResponse.ResponseData) dataResponse.data) != null) {
            FragmentManager fragmentManager = (FragmentManager) afS143S0200000_7.l1;
            SubSpacePostCategoryFragment subSpacePostCategoryFragment = (SubSpacePostCategoryFragment) afS143S0200000_7.l0;
            C0K2Q c0k2q = SubOnlySpacePostTopicFragment.LLLF;
            String str = subSpacePostCategoryFragment.LLJLLIL;
            c0k2q.getClass();
            SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment = new SubOnlySpacePostTopicFragment();
            subOnlySpacePostTopicFragment.LLJLLL = str;
            subOnlySpacePostTopicFragment.LLJZ = responseData;
            subOnlySpacePostTopicFragment.show(fragmentManager, "SubOnlySpacePostTopicFragment");
            subSpacePostCategoryFragment.dismissAllowingStateLoss();
        } else {
            C511230K3d.LIZ(((SubSpacePostCategoryFragment) afS143S0200000_7.l0).getContext(), new IllegalStateException("response empty"), 2131839337);
            ((SubSpacePostCategoryFragment) afS143S0200000_7.l0).dismissAllowingStateLoss();
        }
        C1C7U.LIZIZ("SubSpacePostCategoryFragment@37c6.initPostTopic$1$1$2");
    }

    public static final void accept$15(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("MultiGuestOperationCell@3d05.onBindData$4");
        if (((C749960TbO) obj).LIZ && ((MultiGuestOperationCell) afS143S0200000_7.l0).LL.LIZJ.LJI) {
            FollowInfo followInfo = ((User) afS143S0200000_7.l1).getFollowInfo();
            if (followInfo != null) {
                followInfo.setFollowStatus(0L);
            }
            FollowInfo followInfo2 = ((User) afS143S0200000_7.l1).getFollowInfo();
            if (followInfo2 != null) {
                followInfo2.setPushStatus(0L);
            }
            ((User) afS143S0200000_7.l1).isBlock = true;
            ((MultiGuestOperationCell) afS143S0200000_7.l0).LJJI(true);
        }
        C1C7U.LIZIZ("MultiGuestOperationCell@3d05.onBindData$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        IMessageManager iMessageManager;
        C1C7U.LIZ("ShareUtils@6182.reportShare$1");
        Room room = (Room) afS143S0200000_7.l0;
        DataChannel dataChannel = (DataChannel) afS143S0200000_7.l1;
        ShareReportResult shareReportResult = (ShareReportResult) ((BaseResponse) obj).data;
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.insertMessage(C181500mr.LJFF(room.getId(), shareReportResult.getDisplayText(), (User) dataChannel.gg0(RoomUserChannel.class)), true);
        }
        C1C7U.LIZIZ("ShareUtils@6182.reportShare$1");
    }

    public static final void accept$17(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("InteractModuleViewBinder@6edc.showRandomItem$4");
        List list = (List) obj;
        ((C479040IqU) afS143S0200000_7.l0).LJIIIIZZ((View) afS143S0200000_7.l1, (Bitmap) ListProtector.get(list, 0), (Bitmap) ListProtector.get(list, 1), (Bitmap) ListProtector.get(list, 2), (Bitmap) ListProtector.get(list, 3), (Bitmap) ListProtector.get(list, 4), (Bitmap) ListProtector.get(list, 5));
        C1C7U.LIZIZ("InteractModuleViewBinder@6edc.showRandomItem$4");
    }

    public static final void accept$18(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("InteractModuleViewBinder@6edc.showRandomItem$5");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to load avatars,show default lottie err:");
        sbLIZ.append(Unit.LIZ);
        C20441214yg.LJ("InteractModuleViewBinder", C2188811AlT.LIZIZ(sbLIZ));
        ((C479040IqU) afS143S0200000_7.l0).LJIIIIZZ((View) afS143S0200000_7.l1, null, null, null, null, null, null);
        C1C7U.LIZIZ("InteractModuleViewBinder@6edc.showRandomItem$5");
    }

    public static final void accept$19(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("LiveExtraCardFrequencyManager@260.checkExtraCardStrategy$7");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) afS143S0200000_7.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check api error, errorCode: ");
        sbLIZ.append(C512300K7g.LIZIZ(th));
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        LiveExtraCardFrequencyManager liveExtraCardFrequencyManager = LiveExtraCardFrequencyManager.LIZ;
        EncourageGoLiveCard encourageGoLiveCard = (EncourageGoLiveCard) afS143S0200000_7.l1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("check api error, errorCode: ");
        sbLIZ2.append(C512300K7g.LIZIZ(th));
        LiveExtraCardFrequencyManager.LIZLLL(encourageGoLiveCard, 4, false, 402, C2188811AlT.LIZIZ(sbLIZ2), LiveExtraCardFrequencyManager.LIZJ(liveExtraCardFrequencyManager));
        C1C7U.LIZIZ("LiveExtraCardFrequencyManager@260.checkExtraCardStrategy$7");
    }

    public static final void accept$2(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("RedDotManager@1a7e.init$3");
        Throwable th = (Throwable) obj;
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        C0UX8 c0ux8 = (C0UX8) afS143S0200000_7.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) afS143S0200000_7.l1;
        c782710Un7.getClass();
        C782710Un7.LJIILIIL(c0ux8, lifecycleOwner);
        if (C782710Un7.LJIIL) {
            C20441214yg.LJI("[RedDotManager]", th);
        }
        C1C7U.LIZIZ("RedDotManager@1a7e.init$3");
    }

    public static final void accept$20(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("LiveExtraCardFrequencyManager@260.fetchSpecialCardFromServer$2");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) afS143S0200000_7.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchSpecialCard error: ");
        sbLIZ.append(C512300K7g.LIZIZ(th));
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        LiveExtraCardFrequencyManager liveExtraCardFrequencyManager = LiveExtraCardFrequencyManager.LIZ;
        EncourageGoLiveCard encourageGoLiveCard = (EncourageGoLiveCard) afS143S0200000_7.l1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchSpecialCard error: ");
        sbLIZ2.append(C512300K7g.LIZIZ(th));
        LiveExtraCardFrequencyManager.LIZLLL(encourageGoLiveCard, 4, false, 407, C2188811AlT.LIZIZ(sbLIZ2), LiveExtraCardFrequencyManager.LIZJ(liveExtraCardFrequencyManager));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("fetchSpecialCard error: ");
        sbLIZ3.append(C512300K7g.LIZIZ(th));
        sbLIZ3.append(", ");
        sbLIZ3.append(th.getMessage());
        C20441214yg.LJ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ3));
        C1C7U.LIZIZ("LiveExtraCardFrequencyManager@260.fetchSpecialCardFromServer$2");
    }

    public static final void accept$21(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        T t;
        String str;
        String str2;
        boolean z;
        MultiRoomIdListProvider multiRoomIdListProvider = (MultiRoomIdListProvider) afS143S0200000_7.l0;
        List<RoomInfo> list = (List) afS143S0200000_7.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        multiRoomIdListProvider.getClass();
        C1C7U.LIZ("MultiRoomIdListProvider@e61e.<init>$1L");
        if (baseResponse != null && (t = baseResponse.data) != 0) {
            Map map = (Map) t;
            ArrayList<Room> arrayList = new ArrayList();
            EnterRoomConfig enterRoomConfig = multiRoomIdListProvider.LLIZLLLIL;
            if (enterRoomConfig != null) {
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                str = logData.requestId;
                str2 = logData.logPb;
            } else {
                str = "";
                str2 = "";
            }
            for (RoomInfo roomInfo : list) {
                if (roomInfo != null && map.containsKey(String.valueOf(roomInfo.getRoomId()))) {
                    arrayList.add(map.get(String.valueOf(roomInfo.getRoomId())));
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
            for (Room room : arrayList) {
                room.setLog_pb(str2);
                room.setRequestId(str);
            }
            if (!z) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                multiRoomIdListProvider.LLILZLL = arrayList2;
                ((ArrayList) multiRoomIdListProvider.LLIZ).clear();
                if (!C0IKQ.LIZ(arrayList2)) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        Room room2 = (Room) ListProtector.get(arrayList2, i);
                        EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(false, room2);
                        if (i == 0) {
                            EnterRoomConfig.RoomsData roomsData = enterRoomConfigLIZJ.mRoomsData;
                            long j = roomsData.roomId;
                            EnterRoomConfig.RoomsData roomsData2 = multiRoomIdListProvider.LLIZLLLIL.mRoomsData;
                            if (j == roomsData2.roomId) {
                                roomsData.enterRoomScene = roomsData2.enterRoomScene;
                            }
                        }
                        if (room2 != null) {
                            enterRoomConfigLIZJ.mRoomsData.isSubOnlyLive = room2.liveSubOnly;
                        }
                        multiRoomIdListProvider.LJJJIL(enterRoomConfigLIZJ);
                        ((ArrayList) multiRoomIdListProvider.LLIZ).add(enterRoomConfigLIZJ);
                    }
                }
            }
        }
        C1C7U.LIZIZ("MultiRoomIdListProvider@e61e.<init>$1L");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r0 = r5.LLILLJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r0 = r0.LLJJIJIIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        r8 = r0.topComment;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        r0 = r5.LIZJ(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r4.addAll(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$22(Y.AfS143S0200000_7 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.accept$22(Y.AfS143S0200000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$23(Y.AfS143S0200000_7 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.accept$23(Y.AfS143S0200000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$24(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        SpaceCommentItem spaceCommentItem;
        C0K37 c0k37;
        ArrayList<AbstractC511160K2w> arrayList;
        SpaceCommentItem spaceCommentItem2;
        ArrayList<AbstractC511160K2w> arrayList2;
        SpaceCommentItem spaceCommentItem3;
        C0K37 c0k372;
        ArrayList<AbstractC511160K2w> arrayList3;
        int size;
        C1C7U.LIZ("SubSpaceDetailVM@57b0.sendComment$1");
        DataResponse dataResponse = (DataResponse) obj;
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) afS143S0200000_7.l0;
        PGCCommentSendResp.ResponseData responseData = (PGCCommentSendResp.ResponseData) dataResponse.data;
        SpacePost spacePost = null;
        if (responseData != null && (spaceCommentItem = responseData.comment) != null) {
            C0K3G c0k3g = subSpaceDetailVM.LLILLL;
            if (c0k3g != null) {
                c0k3g.LJII();
                if (spaceCommentItem.commentType == C0K3I.COMMENT.getValue()) {
                    C0K37 c0k373 = c0k3g.LLILLL;
                    if (c0k373 != null && (arrayList3 = c0k373.LL) != null) {
                        Iterator<AbstractC511160K2w> it2 = arrayList3.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            AbstractC511160K2w next = it2.next();
                            if ((next instanceof C0K3A) && ((C0K3A) next).LIZIZ == EnumC507420JvA.RECENT) {
                                if (i >= 0) {
                                    C0K3S c0k3s = c0k3g.LLILLJJLI;
                                    if (c0k3s != null) {
                                        spacePost = c0k3s.LLILLL;
                                    }
                                    size = i + 1;
                                    ListProtector.add(arrayList3, size, new C0K3J(spaceCommentItem, spacePost));
                                    C0K37 c0k374 = c0k3g.LLILLL;
                                    if (c0k374 != null) {
                                        c0k374.notifyItemInserted(size);
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                        C0K3S c0k3s2 = c0k3g.LLILLJJLI;
                        if (c0k3s2 != null) {
                            spacePost = c0k3s2.LLILLL;
                        }
                        arrayList3.add(new C0K3J(spaceCommentItem, spacePost));
                        C0K37 c0k375 = c0k3g.LLILLL;
                        if (c0k375 != null) {
                            c0k375.notifyItemRangeInserted(arrayList3.size() - 1, 1);
                        }
                        size = arrayList3.size() - 1;
                        RecyclerView recyclerView = c0k3g.LLILZ;
                        if (recyclerView != null) {
                            recyclerView.smoothScrollToPosition(size);
                        }
                    }
                } else if ((spaceCommentItem.commentType == C0K3I.REPLY.getValue() || spaceCommentItem.commentType == C0K3I.REPLY_TO_REPLY.getValue()) && (c0k37 = c0k3g.LLILLL) != null && (arrayList = c0k37.LL) != null) {
                    ListIterator<AbstractC511160K2w> listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        AbstractC511160K2w abstractC511160K2wPrevious = listIterator.previous();
                        if ((abstractC511160K2wPrevious instanceof C0K3J) && (spaceCommentItem2 = spaceCommentItem.replyCommentInfo) != null && ((C0K3J) abstractC511160K2wPrevious).LIZLLL() == spaceCommentItem2.commentId) {
                            int iNextIndex = listIterator.nextIndex();
                            if (iNextIndex >= 0) {
                                C0K3S c0k3s3 = c0k3g.LLILLJJLI;
                                if (c0k3s3 != null) {
                                    spacePost = c0k3s3.LLILLL;
                                }
                                int i2 = iNextIndex + 1;
                                ListProtector.add(arrayList, i2, new C0K3J(spaceCommentItem, spacePost));
                                C0K37 c0k376 = c0k3g.LLILLL;
                                if (c0k376 != null) {
                                    c0k376.notifyItemInserted(i2);
                                }
                                RecyclerView recyclerView2 = c0k3g.LLILZ;
                                if (recyclerView2 != null) {
                                    recyclerView2.smoothScrollToPosition(i2);
                                }
                                C0K37 c0k377 = c0k3g.LLILLL;
                                if (c0k377 != null && (arrayList2 = c0k377.LL) != null) {
                                    ListIterator<AbstractC511160K2w> listIterator2 = arrayList2.listIterator(arrayList2.size());
                                    while (true) {
                                        if (!listIterator2.hasPrevious()) {
                                            break;
                                        }
                                        AbstractC511160K2w abstractC511160K2wPrevious2 = listIterator2.previous();
                                        if ((abstractC511160K2wPrevious2 instanceof C0K3K) && (spaceCommentItem3 = spaceCommentItem.replyCommentInfo) != null && ((C0K3K) abstractC511160K2wPrevious2).LIZLLL() == spaceCommentItem3.commentId) {
                                            int iNextIndex2 = listIterator2.nextIndex();
                                            if (iNextIndex2 >= 0 && (c0k372 = c0k3g.LLILLL) != null) {
                                                c0k372.notifyItemChanged(iNextIndex2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            subSpaceDetailVM.getClass();
        }
        ((SubSpaceDetailVM) afS143S0200000_7.l0).setState(new AwS586S0100000_7(dataResponse, (DataResponse<PGCCommentSendResp.ResponseData>) 388));
        ((Function0) afS143S0200000_7.l1).invoke();
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.sendComment$1");
    }

    public static final void accept$25(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("SkylightMultiGuestApplyController@1f6b.tryStartCountdownBanner$1$1");
        C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", "tryStartCountdownBanner: update lastest");
        C477290Inf c477290Inf = (C477290Inf) afS143S0200000_7.l0;
        GuestApplyInfo guestApplyInfo = (GuestApplyInfo) afS143S0200000_7.l1;
        c477290Inf.getClass();
        GuestApplyInfo guestApplyInfoLIZIZ = C477290Inf.LIZIZ(guestApplyInfo);
        guestApplyInfoLIZIZ.applyStatus = 2;
        c477290Inf.LJIIIZ(guestApplyInfoLIZIZ, false);
        C1C7U.LIZIZ("SkylightMultiGuestApplyController@1f6b.tryStartCountdownBanner$1$1");
    }

    public static final void accept$26(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("StrategySDKManager@738d.queryScenes$1$1");
        C469620IbI c469620IbI = C469620IbI.LIZ;
        C469620IbI.LJII((C470570Icp) obj, (List) afS143S0200000_7.l0, (InterfaceC469640IbK) afS143S0200000_7.l1);
        C1C7U.LIZIZ("StrategySDKManager@738d.queryScenes$1$1");
    }

    public static final void accept$27(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C470600Ics c470600Ics = (C470600Ics) afS143S0200000_7.l0;
        C470610Ict c470610Ict = (C470610Ict) afS143S0200000_7.l1;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.<init>$3L");
        if (c470600Ics.LJIIL.LJII) {
            C1C7U.LIZIZ("RxCacheDataSource@388c.<init>$3L");
            return;
        }
        if (c470610Ict.LJIIIIZZ) {
            C20441214yg.LIZIZ("RxCacheDataSource", "called refresh, but paging not rebuild data source");
        }
        c470610Ict.LJIIIIZZ = true;
        c470600Ics.LIZJ();
        C1C7U.LIZIZ("RxCacheDataSource@388c.<init>$3L");
    }

    public static final void accept$28(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("BackupDataManager@227c.tryLoadMore$1");
        ((C0ISZ) afS143S0200000_7.l0).LIZIZ = true;
        ((C238400w2) afS143S0200000_7.l1).element = System.currentTimeMillis();
        C1C7U.LIZIZ("BackupDataManager@227c.tryLoadMore$1");
    }

    public static final void accept$29(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        String message;
        C1C7U.LIZ("BackupDataManager@227c.tryLoadMore$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryLoadMore: error=");
        sbLIZ.append(th.getMessage());
        C20441214yg.LIZIZ("BackupDataManager", C2188811AlT.LIZIZ(sbLIZ));
        ((C0ISZ) afS143S0200000_7.l0).LIZIZ = false;
        if (th instanceof C501470JlZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            sbLIZ2.append(c501470JlZ.getErrorMsg());
            sbLIZ2.append('_');
            sbLIZ2.append(c501470JlZ.getErrorCode());
            message = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (th instanceof C501520Jle) {
            message = String.valueOf(((C501520Jle) th).getErrorCode());
        } else {
            message = th.getMessage();
        }
        ((C0ISZ) afS143S0200000_7.l0).LIZJ(0, "backup_req", System.currentTimeMillis() - ((C238400w2) afS143S0200000_7.l1).element, message);
        C1C7U.LIZIZ("BackupDataManager@227c.tryLoadMore$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("SubSpacePollMemberVM@12b5.fetchMembers$1");
        ((Function0) afS143S0200000_7.l0).invoke();
        PGCPollUserListResponse.ResponseData responseData = (PGCPollUserListResponse.ResponseData) ((DataResponse) obj).data;
        if (responseData != null) {
            SubSpacePollMemberVM subSpacePollMemberVM = (SubSpacePollMemberVM) afS143S0200000_7.l1;
            Function0 function0 = (Function0) afS143S0200000_7.l0;
            C0K3O c0k3o = subSpacePollMemberVM.LLILZ;
            if (c0k3o != null) {
                ArrayList<AbstractC511160K2w> arrayList = c0k3o.LL;
                arrayList.clear();
                int size = arrayList.size();
                Iterator<User> it2 = responseData.userList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0K3T(it2.next()));
                }
                int size2 = arrayList.size() - size;
                if (size2 > 0) {
                    c0k3o.notifyItemRangeInserted(size, size2);
                }
            }
            function0.invoke();
        }
        C1C7U.LIZIZ("SubSpacePollMemberVM@12b5.fetchMembers$1");
    }

    public static final void accept$30(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("ToolbarShareBehavior@28ff.onShareBreathAnimResEvent$1");
        Long l = (Long) obj;
        if (((C1106110etF) afS143S0200000_7.l1).LLILZIL != null && l.longValue() != ((C1106110etF) afS143S0200000_7.l1).LLILZIL.getId()) {
            ((C1106110etF) afS143S0200000_7.l1).LJIILLIIL((ShareGuideMessage) afS143S0200000_7.l0, -1);
        }
        C1C7U.LIZIZ("ToolbarShareBehavior@28ff.onShareBreathAnimResEvent$1");
    }

    public static final void accept$31(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("SkylightNearbyDataManager@a178.startPollingNearbyData$subscribe$1");
        C473300IhE c473300IhE = (C473300IhE) afS143S0200000_7.l0;
        InterfaceC475140IkC.LIZ.getClass();
        c473300IhE.LIZIZ(2, (EnumC471720Ieg) afS143S0200000_7.l1, null);
        C1C7U.LIZIZ("SkylightNearbyDataManager@a178.startPollingNearbyData$subscribe$1");
    }

    public static final void accept$32(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        Map map = (Map) afS143S0200000_7.l0;
        DataChannel dataChannel = (DataChannel) afS143S0200000_7.l1;
        C1C7U.LIZ("LiveNewAudienceEndMonitor@da9f.logLiveShow$1L");
        map.putAll((Map) obj);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
        }
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("LiveNewAudienceEndMonitor@da9f.logLiveShow$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$33(Y.AfS143S0200000_7 r5, java.lang.Object r6) {
        /*
            java.lang.String r6 = "GiftPanelBottomLeaf@1211.setupDataChannelObservers$3$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r0 = r5.l0
            X.0fMZ r0 = (X.C1124290fMZ) r0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel r2 = r0.LJJJJL()
            if (r2 == 0) goto L4e
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r0 = (com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig) r0
            java.lang.Object r5 = r5.l0
            X.0fMZ r5 = (X.C1124290fMZ) r5
            androidx.lifecycle.MutableLiveData<com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig> r1 = r2.LL
            r4 = 0
            if (r1 == 0) goto L32
            java.lang.Object r1 = r1.getValue()
            com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r1 = (com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig) r1
            if (r1 == 0) goto L32
            tikcast.api.privilege.QueryUserPrivilegesResponse$EntranceConfig r1 = r1.entranceConfig
            if (r1 == 0) goto L32
            androidx.lifecycle.MutableLiveData<com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig> r0 = r2.LL
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r0 = (com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig) r0
        L32:
            r4 = r0
        L33:
            com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel r0 = r5.LJJJJL()
            if (r0 == 0) goto L4e
            android.content.Context r3 = r5.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r5.LLJLLL
            r5.LJJJJJ()
            if (r4 == 0) goto L52
            tikcast.api.privilege.QueryUserPrivilegesResponse$EntranceConfig r0 = r4.entranceConfig
            if (r0 == 0) goto L52
            boolean r1 = r0.showRedDot
            r0 = 1
            if (r1 != r0) goto L52
        L4b:
            com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel.wQ2(r3, r2, r4, r0)
        L4e:
            X.C1C7U.LIZIZ(r6)
            return
        L52:
            r0 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.accept$33(Y.AfS143S0200000_7, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        r0 = r4.LLILLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r1 = r0.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r1.add(new X.C0K2M(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        r1 = r8.postType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r1 != X.EnumC507460JvE.TEXT.getValue()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r1 = X.C511110K2r.LIZIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        r0 = r4.LLILLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r0 = r0.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r0.addAll(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        if (r1 != X.EnumC507460JvE.POLL.getValue()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        r1 = X.C511110K2r.LIZ(r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$34(Y.AfS143S0200000_7 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.accept$34(Y.AfS143S0200000_7, java.lang.Object):void");
    }

    public static final void accept$35(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        HomePageInfo homePageInfo;
        C1C7U.LIZ("SubSpaceFeedVM@7436.exitSpace$1");
        ((Function0) afS143S0200000_7.l0).invoke();
        ((SubSpaceFeedVM) afS143S0200000_7.l1).setState(AFwS237S0000000_7.get$arr$(313));
        C0K2D c0k2dXQ2 = ((SubSpaceFeedVM) afS143S0200000_7.l1).xQ2();
        C511370K3r c511370K3rWQ2 = ((SubSpaceFeedVM) afS143S0200000_7.l1).wQ2();
        if (c511370K3rWQ2 != null) {
            homePageInfo = c511370K3rWQ2.LLILZLL;
        } else {
            homePageInfo = null;
        }
        c0k2dXQ2.LIZLLL("exit_space", homePageInfo, ((SubSpaceFeedVM) afS143S0200000_7.l1).AQ2());
        C1C7U.LIZIZ("SubSpaceFeedVM@7436.exitSpace$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$36(Y.AfS143S0200000_7 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.accept$36(Y.AfS143S0200000_7, java.lang.Object):void");
    }

    public static final void accept$37(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        HomePageInfo homePageInfo;
        C1C7U.LIZ("SubSpaceFeedVM@7436.joinSpace$1");
        ((Function0) afS143S0200000_7.l0).invoke();
        ((SubSpaceFeedVM) afS143S0200000_7.l1).setState(AFwS237S0000000_7.get$arr$(316));
        C0K2D c0k2dXQ2 = ((SubSpaceFeedVM) afS143S0200000_7.l1).xQ2();
        C511370K3r c511370K3rWQ2 = ((SubSpaceFeedVM) afS143S0200000_7.l1).wQ2();
        if (c511370K3rWQ2 != null) {
            homePageInfo = c511370K3rWQ2.LLILZLL;
        } else {
            homePageInfo = null;
        }
        c0k2dXQ2.LIZLLL("join_space", homePageInfo, ((SubSpaceFeedVM) afS143S0200000_7.l1).AQ2());
        C1C7U.LIZIZ("SubSpaceFeedVM@7436.joinSpace$1");
    }

    public static final void accept$38(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("FollowButton@6779.follow$1");
        ((C489040JFu) afS143S0200000_7.l0).LJI = false;
        Function1 function1 = (Function1) afS143S0200000_7.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("FollowButton@6779.follow$1");
    }

    public static final void accept$39(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("FollowButton@6779.follow$2");
        Throwable th = (Throwable) obj;
        ((C489040JFu) afS143S0200000_7.l0).LJI = false;
        Function1 function1 = (Function1) afS143S0200000_7.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        ((C489040JFu) afS143S0200000_7.l0).getClass();
        C489040JFu.LIZJ(th);
        C1C7U.LIZIZ("FollowButton@6779.follow$2");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void accept$4(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("MultiGuestLinkMicMatchViewModel@acb0.checkRoomState$dispose$1");
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        if (!C0IKQ.LIZ(baseListResponse.data)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlivesdk room status controller check room status, model:");
            sbLIZ.append(baseListResponse);
            sbLIZ.append(".data");
            C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            List<T> list = baseListResponse.data;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((RoomStatsModel) obj2).alive) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((RoomStatsModel) it2.next()).roomId));
            }
            MutableLiveData<List<Long>> mutableLiveData = ((MultiGuestLinkMicMatchViewModel) afS143S0200000_7.l0).LLILLL;
            List list2 = (List) afS143S0200000_7.l1;
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (setLLIIJI.contains(Long.valueOf(((Number) obj3).longValue()))) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (true ^ arrayList3.contains(Long.valueOf(((Number) obj4).longValue()))) {
                    arrayList5.add(obj4);
                }
            }
            arrayList4.addAll(arrayList5);
            mutableLiveData.setValue(arrayList4);
            List<Long> value = ((MultiGuestLinkMicMatchViewModel) afS143S0200000_7.l0).LLILLL.getValue();
            if (value == null || value.isEmpty()) {
                ((MultiGuestLinkMicMatchViewModel) afS143S0200000_7.l0).LLILLL.setValue(C13BV.INSTANCE);
                ((MultiGuestLinkMicMatchViewModel) afS143S0200000_7.l0).LLILZ.setValue(Boolean.TRUE);
            }
        } else {
            ((MultiGuestLinkMicMatchViewModel) afS143S0200000_7.l0).LLILLL.setValue(C13BV.INSTANCE);
            ((MultiGuestLinkMicMatchViewModel) afS143S0200000_7.l0).LLILZ.setValue(Boolean.TRUE);
        }
        C1C7U.LIZIZ("MultiGuestLinkMicMatchViewModel@acb0.checkRoomState$dispose$1");
    }

    public static final void accept$40(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("FollowButton@6779.unFollow$1");
        ((C489040JFu) afS143S0200000_7.l0).LJI = false;
        Function1 function1 = (Function1) afS143S0200000_7.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("FollowButton@6779.unFollow$1");
    }

    public static final void accept$41(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("FollowButton@6779.unFollow$2");
        Throwable th = (Throwable) obj;
        ((C489040JFu) afS143S0200000_7.l0).LJI = false;
        Function1 function1 = (Function1) afS143S0200000_7.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        ((C489040JFu) afS143S0200000_7.l0).getClass();
        C489040JFu.LIZJ(th);
        C1C7U.LIZIZ("FollowButton@6779.unFollow$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[EDGE_INSN: B:97:0x004c->B:24:0x004c BREAK  A[LOOP:0: B:42:0x0084->B:98:?]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$42(Y.AfS143S0200000_7 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.accept$42(Y.AfS143S0200000_7, java.lang.Object):void");
    }

    public static final void accept$43(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        String containerID;
        C1C7U.LIZ("AdSubmitAdDislikeMethod@561.handle$2");
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = ((C519930KaF) afS143S0200000_7.l0).IBridgeSdkContext;
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
        InterfaceC634840OvC interfaceC634840OvC2 = ((C519930KaF) afS143S0200000_7.l0).IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC519890KaB interfaceC519890KaB = (InterfaceC519890KaB) C1909107dp.LIZJ(InterfaceC519890KaB.class, containerID2);
        interfaceC519890KaB.setCode(0);
        ((CompletionBlock) afS143S0200000_7.l1).onSuccess(interfaceC519890KaB, "");
        C1C7U.LIZIZ("AdSubmitAdDislikeMethod@561.handle$2");
    }

    public static final void accept$44(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.loadSingleEmote$3");
        if (obj != null) {
            EmoteModel emoteModel = (EmoteModel) afS143S0200000_7.l0;
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) afS143S0200000_7.l1;
            Map<String, EmoteModel> map = C0KBS.LJFF;
            if (map.containsKey(emoteModel.emoteId)) {
                List<EmoteModel> list = C0KBS.LJ;
                C19719512Dh.LIZ(list).remove(((LinkedHashMap) map).get(emoteModel.emoteId));
                map.remove(emoteModel.emoteId);
            }
            ((ArrayList) C0KBS.LJ).add(emoteModel);
            map.put(emoteModel.emoteId, emoteModel);
            interfaceC1631620sYq.invoke(emoteModel, "", 1);
        }
        C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.loadSingleEmote$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$45(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        PGCTopicResponse.ResponseData responseData;
        List<PGCTopicByCategory> list;
        SpaceTopicCategory spaceTopicCategory;
        C0K4A c0k4a;
        ArrayList<AbstractC511160K2w> arrayList;
        ArrayList<AbstractC511160K2w> arrayList2;
        C0K4A c0k4a2;
        C0K4F c0k4fDQ2;
        C0K4A c0k4a3;
        C1C7U.LIZ("SubSpaceNewPostVM@bce1.fetchTopics$1");
        DataResponse dataResponse = (DataResponse) obj;
        SubSpaceNewPostVM subSpaceNewPostVM = (SubSpaceNewPostVM) afS143S0200000_7.l0;
        SpaceTopicContent spaceTopicContent = null;
        if (dataResponse != null) {
            responseData = (PGCTopicResponse.ResponseData) dataResponse.data;
            if (responseData != null) {
                subSpaceNewPostVM.getClass();
                List<PGCTopicByCategory> list2 = responseData.topicByCategoryList;
                if (list2 != null && (c0k4fDQ2 = subSpaceNewPostVM.DQ2()) != null && (c0k4a3 = c0k4fDQ2.LL) != null) {
                    c0k4a3.LIZ = list2;
                }
            }
        } else {
            responseData = null;
        }
        subSpaceNewPostVM.LLILLL = false;
        subSpaceNewPostVM.HQ2();
        if (responseData != null) {
            list = responseData.topicByCategoryList;
        } else {
            list = null;
        }
        C0K4F c0k4fDQ22 = subSpaceNewPostVM.DQ2();
        if (c0k4fDQ22 != null && (c0k4a2 = c0k4fDQ22.LL) != null) {
            spaceTopicCategory = c0k4a2.LIZIZ;
        } else {
            spaceTopicCategory = null;
        }
        ArrayList<AbstractC511160K2w> arrayListGQ2 = subSpaceNewPostVM.GQ2(list, spaceTopicCategory);
        if (arrayListGQ2 != null) {
            C511240K3e c511240K3e = subSpaceNewPostVM.LLILZ;
            if (c511240K3e != null && (arrayList2 = c511240K3e.LL) != null) {
                arrayList2.clear();
            }
            C511240K3e c511240K3e2 = subSpaceNewPostVM.LLILZ;
            if (c511240K3e2 != null && (arrayList = c511240K3e2.LL) != null) {
                arrayList.addAll(arrayListGQ2);
            }
            C511240K3e c511240K3e3 = subSpaceNewPostVM.LLILZ;
            if (c511240K3e3 != null) {
                c511240K3e3.notifyDataSetChanged();
            }
            C0K4F c0k4fDQ23 = subSpaceNewPostVM.DQ2();
            if (c0k4fDQ23 != null && (c0k4a = c0k4fDQ23.LL) != null) {
                spaceTopicContent = c0k4a.LIZLLL;
            }
            subSpaceNewPostVM.JQ2(spaceTopicContent);
            subSpaceNewPostVM.IQ2();
        }
        ((Function0) afS143S0200000_7.l1).invoke();
        C1C7U.LIZIZ("SubSpaceNewPostVM@bce1.fetchTopics$1");
    }

    public static final void accept$46(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("PersistenceTaskManagerKt@677b.trans2NonCancelableObservable$disposable$1");
        ((InterfaceC475810IlH) afS143S0200000_7.l0).LIZIZ(obj, (Map) afS143S0200000_7.l1);
        C1C7U.LIZIZ("PersistenceTaskManagerKt@677b.trans2NonCancelableObservable$disposable$1");
    }

    public static final void accept$47(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("CustomizedPerksItemViewHolder@12a2.onBindViewHolder$4");
        List<View> list = (List) obj;
        LinearLayout linearLayout = ((C510430K0b) afS143S0200000_7.l0).LLILLJJLI;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (list.size() <= 6) {
            C510430K0b c510430K0b = (C510430K0b) afS143S0200000_7.l0;
            for (View view : list) {
                LinearLayout linearLayout2 = c510430K0b.LLILLJJLI;
                if (linearLayout2 != null) {
                    linearLayout2.addView(view);
                }
            }
            ((C510430K0b) afS143S0200000_7.l0).LLIZLLLIL = true;
        } else {
            TextView textView = ((C510430K0b) afS143S0200000_7.l0).LLIZ;
            if (textView != null) {
                textView.setText(C511520K4g.LJIIIIZZ(2131839637, Integer.valueOf(list.size())));
            }
            List<View> listSubList = list.subList(0, 6);
            List listSubList2 = list.subList(6, list.size());
            C510430K0b c510430K0b2 = (C510430K0b) afS143S0200000_7.l0;
            for (View view2 : listSubList) {
                LinearLayout linearLayout3 = c510430K0b2.LLILLJJLI;
                if (linearLayout3 != null) {
                    linearLayout3.addView(view2);
                }
            }
            C510430K0b c510430K0b3 = (C510430K0b) afS143S0200000_7.l0;
            ViewGroup viewGroup = c510430K0b3.LLILZLL;
            if (viewGroup != null) {
                SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) afS143S0200000_7.l1;
                C0K0R.LIZJ(viewGroup);
                C786410Ut5.K7(viewGroup, new ACListenerS46S0400000_7(c510430K0b3, viewGroup, subscriptionPrivilegeDetailFragment, listSubList2, 2));
            }
        }
        C1C7U.LIZIZ("CustomizedPerksItemViewHolder@12a2.onBindViewHolder$4");
    }

    public static final void accept$48(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.uploadImage$1");
        File file = (File) obj;
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel = (DataChannel) afS143S0200000_7.l0;
        Function1 function1 = (Function1) afS143S0200000_7.l1;
        c0jfn.getClass();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        ((DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class)).uploadImage(multipartTypedOutput).LJFF(new C0UO0()).LJJIIZ(new AfS103S0300000_7(file, function1, dataChannel, 29), new AfS139S0200000_3((Object) file, (Context) function1, (Function1<? super Drawable, Unit>) 9));
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.uploadImage$1");
    }

    public static final void accept$49(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.endCurrentRound$3");
        ((DataChannel) afS143S0200000_7.l0).SX0(C749020TZs.class, 0L);
        ((DataChannel) afS143S0200000_7.l0).SX0(C748850TZb.class, Boolean.TRUE);
        C766270U4b.LIZLLL(2131854909);
        ((Function0) afS143S0200000_7.l1).invoke();
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.endCurrentRound$3");
    }

    public static final void accept$5(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("CoHostOperationCell@1f42.onBindData$3");
        if (((C749960TbO) obj).LIZ && ((CoHostOperationCell) afS143S0200000_7.l0).LL.LIZJ.LJI) {
            ((User) afS143S0200000_7.l1).getFollowInfo().setFollowStatus(0L);
            ((User) afS143S0200000_7.l1).isBlock = true;
            ((CoHostOperationCell) afS143S0200000_7.l0).LJJII(true);
        }
        C1C7U.LIZIZ("CoHostOperationCell@1f42.onBindData$3");
    }

    public static final void accept$50(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.exitFreeDrawGuess$1");
        ((Function1) afS143S0200000_7.l0).invoke(Boolean.TRUE);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel = (DataChannel) afS143S0200000_7.l1;
        c0jfn.getClass();
        C0JFN.LJIIL(dataChannel);
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.exitFreeDrawGuess$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$51(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        StartDrawGuessResponse startDrawGuessResponse;
        C1C7U.LIZ("DrawGuessUtil@bdeb.requestFreeDrawGuess$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = (DataChannel) afS143S0200000_7.l0;
        if (dataChannel != null) {
            if (baseResponse != null && (startDrawGuessResponse = (StartDrawGuessResponse) baseResponse.data) != null) {
                dataChannel.zW(DrawGuessSessionIdChannel.class, Long.valueOf(startDrawGuessResponse.sessionId));
                ((Function1) afS143S0200000_7.l1).invoke(Boolean.TRUE);
                C0JFN c0jfn = C0JFN.LIZ;
                DataChannel dataChannel2 = (DataChannel) afS143S0200000_7.l0;
                c0jfn.getClass();
                C0JFN.LJIILIIL(dataChannel2, false);
            } else {
                ((Function1) afS143S0200000_7.l1).invoke(Boolean.FALSE);
            }
        } else {
            ((Function1) afS143S0200000_7.l1).invoke(Boolean.TRUE);
            C0JFN c0jfn2 = C0JFN.LIZ;
            DataChannel dataChannel22 = (DataChannel) afS143S0200000_7.l0;
            c0jfn2.getClass();
            C0JFN.LJIILIIL(dataChannel22, false);
        }
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestFreeDrawGuess$1");
    }

    public static final void accept$52(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        C1C7U.LIZ("LiveNotifyMessageFrequencyManager@3a91.reportImmediately$2");
        if (C1102420enI.LJIILL <= C1102420enI.LJIIL) {
            C1102420enI.LJIILL++;
            C1102420enI.LJFF.addAll((ArrayList) afS143S0200000_7.l0);
            List<NotifyRecord> list = C1102420enI.LJI;
            ((ArrayList) list).addAll((List) afS143S0200000_7.l1);
            C20337914i1<List<MsgNotifyRecord>> c20337914i1 = InterfaceC1106030et7.a7;
            c20337914i1.LJFF(C1102420enI.LJFF);
            c20337914i1.LIZJ();
            C20337914i1<List<NotifyRecord>> c20337914i12 = InterfaceC1106030et7.b7;
            c20337914i12.LJFF(list);
            c20337914i12.LIZJ();
        } else {
            C11JF c11jf = C1102420enI.LJIILIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C1102420enI.LJIILL = 0;
        }
        C1C7U.LIZIZ("LiveNotifyMessageFrequencyManager@3a91.reportImmediately$2");
    }

    public static final void accept$6(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) afS143S0200000_7.l0;
        C1110530f0N c1110530f0N = (C1110530f0N) afS143S0200000_7.l1;
        portraitAudienceInteractionFragment.getClass();
        C1C7U.LIZ("PortraitAudienceInteractionFragment@93b7.continueAfterWidgetLoaded$1L");
        portraitAudienceInteractionFragment.LLJIJIL.LC0(UserWannaSendMessageEvent.class, c1110530f0N);
        C1C7U.LIZIZ("PortraitAudienceInteractionFragment@93b7.continueAfterWidgetLoaded$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0K9T, X.0emo] */
    public static final void accept$7(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        FollowCardResponse followCardResponse;
        final FollowCard followCard;
        C1C7U.LIZ("ProgrammedLiveFollowCardWidget@cec8.consumeMessage$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (followCardResponse = (FollowCardResponse) baseResponse.data) != null && (followCard = followCardResponse.followCard) != null) {
            final FollowCardMessage followCardMessage = (FollowCardMessage) afS143S0200000_7.l0;
            final ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = (ProgrammedLiveFollowCardWidget) afS143S0200000_7.l1;
            if (Intrinsics.LJFF(followCard.id, followCardMessage.followCardId)) {
                programmedLiveFollowCardWidget.LLJJ = followCard;
                ?? r1 = new InterfaceC1102120emo(followCard, followCardMessage) { // from class: X.0K9T
                    public final FollowCard LIZ;
                    public final FollowCardMessage LIZIZ;
                    public final long LIZJ = C963140bAe.LIZIZ();

                    @Override // X.InterfaceC1102120emo
                    public final boolean LIZJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJ() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJFF() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJIIIIZZ() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJIIJJI() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final Boolean LJIIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJIILIIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String getBusinessName() {
                        return "programmed_live";
                    }

                    @Override // X.InterfaceC1102120emo
                    public final Map<String, String> getExtras() {
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String LIZIZ() {
                        List<User> list;
                        ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget2 = this.LIZLLL;
                        FollowCard followCard2 = this.LIZ;
                        programmedLiveFollowCardWidget2.getClass();
                        return C500260Jjc.LJJJI((followCard2 == null || (list = followCard2.multiUserList) == null) ? null : Boolean.valueOf(list.isEmpty() ^ true)) ? "program_live_multi_following_card" : "program_live_following_card";
                    }

                    @Override // X.InterfaceC1102120emo
                    public final C1099880ejC LJIIIZ() {
                        View view = this.LIZLLL.getView();
                        return new C1099880ejC(view != null ? view.hasWindowFocus() : false);
                    }

                    @Override // X.InterfaceC1102120emo
                    public final View LJIILJJIL() {
                        View view = this.LIZLLL.getView();
                        if (view != null) {
                            return view.getRootView();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String LJJJ() {
                        return String.valueOf(this.LIZIZ.getMessageId());
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String getId() {
                        return String.valueOf(this.LIZIZ.getMessageId());
                    }

                    @Override // X.InterfaceC1102120emo
                    public final EnumC245600xC LIZLLL() {
                        return C245700xD.LIZ(this);
                    }

                    @Override // X.InterfaceC1102120emo
                    public final int getComponentType() {
                        return ((ProgrammedLiveFollowCardWidget) LJII()).getComponentType();
                    }

                    @Override // X.InterfaceC1102120emo
                    public final InterfaceC1102150emr LJII() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final long LJIIJ() {
                        return this.LIZJ;
                    }

                    {
                        this.LIZ = followCard;
                        this.LIZIZ = followCardMessage;
                    }
                };
                programmedLiveFollowCardWidget.LLJJJIL = r1;
                C1102070emj c1102070emj = C1102070emj.LIZ;
                DataChannel dataChannel = programmedLiveFollowCardWidget.dataChannel;
                c1102070emj.getClass();
                C1102070emj.LJJIII(dataChannel, programmedLiveFollowCardWidget, r1);
                programmedLiveFollowCardWidget.dataChannel.SX0(C749080TZy.class, new C512760K9a(followCard, SystemClock.elapsedRealtime()));
                FollowCard followCard2 = programmedLiveFollowCardWidget.LLJJ;
                if (followCard2 != null) {
                    c1102070emj.LJJI(programmedLiveFollowCardWidget.dataChannel, programmedLiveFollowCardWidget, programmedLiveFollowCardWidget.LLJJJIL, null);
                    if (programmedLiveFollowCardWidget.LLJJIII) {
                        programmedLiveFollowCardWidget.F1(followCard2);
                        if (!C916790Zxt.LIZ(8)) {
                            programmedLiveFollowCardWidget.J1(followCard2, true);
                        }
                    } else {
                        programmedLiveFollowCardWidget.A1(C0K9V.NETWORK, true, false);
                    }
                }
            }
        }
        C1C7U.LIZIZ("ProgrammedLiveFollowCardWidget@cec8.consumeMessage$1$1");
    }

    public static final void accept$8(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        FragmentManager fragmentManager;
        C1C7U.LIZ("FansClubViewModel@394b.openSuperFansGoalJoinDialog$2");
        DataChannel dataChannel = ((FansClubViewModel) afS143S0200000_7.l0).getDataChannel();
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C19322110iZ.LJFF(fragmentManager, (SuperFansGoalJoinDialog) afS143S0200000_7.l1, "super_fans_goal_dialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
        }
        C1C7U.LIZIZ("FansClubViewModel@394b.openSuperFansGoalJoinDialog$2");
    }

    public static final void accept$9(AfS143S0200000_7 afS143S0200000_7, Object obj) {
        String str;
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) afS143S0200000_7.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) afS143S0200000_7.l1;
        FollowPair followPair = (FollowPair) obj;
        liveRoomFragment.getClass();
        C1C7U.LIZ("LiveRoomFragment@108c.initFollowStatusChange$1L");
        InterfaceC466370IQp currentFragment = liveRoomFragment.getCurrentFragment();
        if (followPair != null && currentFragment != null && currentFragment.Eq() != null && currentFragment.f8() != null && followPair.LIZ == currentFragment.f8().getOwnerUserId()) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            String str2 = roomsData.enterFromMerge;
            String str3 = roomsData.enterMethod;
            if (Intrinsics.LJFF(str2, "homepage_hot") && (Intrinsics.LJFF(str3, "live_head") || Intrinsics.LJFF(str3, "live_cell"))) {
                EnterRoomConfig.RoomsData roomsData2 = currentFragment.Eq().mRoomsData;
                String str4 = roomsData2.enterFromMerge;
                String str5 = roomsData2.enterMethod;
                String str6 = roomsData2.actionType;
                long j = roomsData2.roomId;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str4);
                sbLIZ.append("&");
                sbLIZ.append(str5);
                sbLIZ.append("&");
                sbLIZ.append(str6);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0IO1 c0io1 = C0IO1.LIZ;
                C0IO0 c0io0 = new C0IO0(followPair.LIZ, j, strLIZIZ);
                if (followPair.LIZIZ()) {
                    C0IO1.LIZIZ.add(c0io0);
                } else {
                    C0IO1.LIZIZ.remove(c0io0);
                }
            }
            User owner = currentFragment.f8().getOwner();
            if (owner != null && owner.getAvatarThumb() != null && owner.getAvatarThumb().getUrls() != null && !owner.getAvatarThumb().getUrls().isEmpty()) {
                str = (String) ListProtector.get(owner.getAvatarThumb().getUrls(), 0);
            } else {
                str = "";
            }
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryShowPushGuidePopup(liveRoomFragment.getActivity(), str, liveRoomFragment.LLJJ, liveRoomFragment.LLJILLL);
        }
        C1C7U.LIZIZ("LiveRoomFragment@108c.initFollowStatusChange$1L");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS143S0200000_7(com.bytedance.ies.sdk.datachannel.DataChannel r2, kotlin.jvm.internal.AwS586S0100000_7 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 50 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS143S0200000_7.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, kotlin.jvm.internal.AwS586S0100000_7, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS143S0200000_7(Object obj, EmoteModel emoteModel, InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit> interfaceC1631620sYq) {
        this.$t = interfaceC1631620sYq;
        this.l0 = obj;
        this.l1 = emoteModel;
    }
}
