package Y;

import X.AbstractC938650aX9;
import X.AbstractC948890anf;
import X.AbstractC977830bYL;
import X.C013C;
import X.C01ZA;
import X.C0IYA;
import X.C0R9K;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C12ES;
import X.C1308910kAL;
import X.C1319900kS4;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C15DF;
import X.C16F5;
import X.C16FS;
import X.C16FV;
import X.C16FZ;
import X.C1819620xS4;
import X.C1850730yGF;
import X.C1954807lC;
import X.C19MB;
import X.C19ME;
import X.C20441214yg;
import X.C20515815Po;
import X.C20642515q3;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C428750GrZ;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C754570Tip;
import X.C758340Tou;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C920870a4T;
import X.C921180a4y;
import X.C924790aAn;
import X.C930480aJy;
import X.C930540aK4;
import X.C933980aPc;
import X.C936030aSv;
import X.C936040aSw;
import X.C936050aSx;
import X.C938660aXA;
import X.C939680aYo;
import X.C941290abP;
import X.C942580adU;
import X.C943120aeM;
import X.C944330agJ;
import X.C945370ahz;
import X.C946850akN;
import X.C947130akp;
import X.C947270al3;
import X.C947280al4;
import X.C947590alZ;
import X.C948850anb;
import X.C948910anh;
import X.C948950anl;
import X.C950220apo;
import X.C954460awe;
import X.C972040bP0;
import X.C973070bQf;
import X.C973100bQi;
import X.C973660bRc;
import X.C973830bRt;
import X.C974540bT2;
import X.C976110bVZ;
import X.C976120bVa;
import X.C976480bWA;
import X.C976770bWd;
import X.C976800bWg;
import X.C976940bWu;
import X.C977580bXw;
import X.C977590bXx;
import X.C977620bY0;
import X.C977630bY1;
import X.C977720bYA;
import X.C977740bYC;
import X.C977820bYK;
import X.C977850bYN;
import X.C977870bYP;
import X.C978090bYl;
import X.C978110bYn;
import X.C978120bYo;
import X.C978480bZO;
import X.C978520bZS;
import X.C978980baC;
import X.C979440baw;
import X.C979480bb0;
import X.C979490bb1;
import X.C979520bb4;
import X.C979580bbA;
import X.C979600bbC;
import X.C981800bek;
import X.C981850bep;
import X.C982910bgX;
import X.C985250bkJ;
import X.C985260bkK;
import X.C985403tE;
import X.C985780blA;
import X.C986440bmE;
import X.EnumC773090UUh;
import X.EnumC919170a1j;
import X.EnumC920860a4S;
import X.EnumC935940aSm;
import X.EnumC942260acy;
import X.EnumC947440alK;
import X.EnumC948930anj;
import X.EnumC952890au7;
import X.EnumC976390bW1;
import X.EnumC976510bWD;
import X.EnumC977690bY7;
import X.InterfaceC1631620sYq;
import X.InterfaceC957770b1z;
import X.InterfaceC963450bB9;
import X.ViewOnClickListenerC1836610xtT;
import X.ViewOnClickListenerC939670aYn;
import X.ViewOnLayoutChangeListenerC986920bn0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.competition.game.connection.invitee.CatchBeansInviteeFragment;
import com.bytedance.android.live.liveinteract.competition.game.connection.inviter.CatchBeansInviterFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.invitee.TakeStageInviteeFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter.TakeStageInviterSelectFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter.TakeStageInviterWaitingFragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementPanelSheet;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.view.CombinedMatchInviterFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.invitee.view.IndividualMatchInviteeFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.inviter.view.IndividualMatchInviterFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view.TeamMatchInviteeFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.TeamPairInviteeCohostRoomFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.invitee.view.TwoMatchInviteeFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragmentV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchDataChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog.MultiGuestModeratorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.AvatarBusinessAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.biz.PlaybookBizDataChanged;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperAnchorGuideDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ApplyingTextHeaderFromServerSideChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.MultiGuestLinkMicMatchFragmentA;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.MultiGuestLinkMicMatchFragmentAuto;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.MultiGuestLinkMicMatchFragmentB;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multilive.model.LiveGuideCard;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.TopLiveHangoutInteractTypeData;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestHostTagUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMultiGuestGoLiveEntranceSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS144S0400000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS69S0100100_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class AObserverS219S0100000_15 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
            case 47:
                onChanged$47(this, obj);
                break;
            case 48:
                onChanged$48(this, obj);
                break;
            case 49:
                onChanged$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onChanged$50(this, obj);
                break;
            case 51:
                onChanged$51(this, obj);
                break;
            case 52:
                onChanged$52(this, obj);
                break;
            case 53:
                onChanged$53(this, obj);
                break;
            case 54:
                onChanged$54(this, obj);
                break;
            case 55:
                onChanged$55(this, obj);
                break;
            case 56:
                onChanged$56(this, obj);
                break;
            case 57:
                onChanged$57(this, obj);
                break;
            case 58:
                onChanged$58(this, obj);
                break;
            case 59:
                onChanged$59(this, obj);
                break;
            case 60:
                onChanged$60(this, obj);
                break;
            case 61:
                onChanged$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onChanged$62(this, obj);
                break;
            case 63:
                onChanged$63(this, obj);
                break;
            case 64:
                onChanged$64(this, obj);
                break;
            case 65:
                onChanged$65(this, obj);
                break;
            case 66:
                onChanged$66(this, obj);
                break;
            case 67:
                onChanged$67(this, obj);
                break;
            case 68:
                onChanged$68(this, obj);
                break;
            case 69:
                onChanged$69(this, obj);
                break;
            case 70:
                onChanged$70(this, obj);
                break;
            case 71:
                onChanged$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                onChanged$72(this, obj);
                break;
            case 73:
                onChanged$73(this, obj);
                break;
            case 74:
                onChanged$74(this, obj);
                break;
            case 75:
                onChanged$75(this, obj);
                break;
            case 76:
                onChanged$76(this, obj);
                break;
            case 77:
                onChanged$77(this, obj);
                break;
            case 78:
                onChanged$78(this, obj);
                break;
            case 79:
                onChanged$79(this, obj);
                break;
            case 80:
                onChanged$80(this, obj);
                break;
            case 81:
                onChanged$81(this, obj);
                break;
            case 82:
                onChanged$82(this, obj);
                break;
            case 83:
                onChanged$83(this, obj);
                break;
            case 84:
                onChanged$84(this, obj);
                break;
            case 85:
                onChanged$85(this, obj);
                break;
            case 86:
                onChanged$86(this, obj);
                break;
            case 87:
                onChanged$87(this, obj);
                break;
            case 88:
                onChanged$88(this, obj);
                break;
            case 89:
                onChanged$89(this, obj);
                break;
            case 90:
                onChanged$90(this, obj);
                break;
            case 91:
                onChanged$91(this, obj);
                break;
            case 92:
                onChanged$92(this, obj);
                break;
            case 93:
                onChanged$93(this, obj);
                break;
            case 94:
                onChanged$94(this, obj);
                break;
            case 95:
                onChanged$95(this, obj);
                break;
            case 96:
                onChanged$96(this, obj);
                break;
            case 97:
                onChanged$97(this, obj);
                break;
            case 98:
                onChanged$98(this, obj);
                break;
            case 99:
                onChanged$99(this, obj);
                break;
            case 100:
                onChanged$100(this, obj);
                break;
            case 101:
                onChanged$101(this, obj);
                break;
            case 102:
                onChanged$102(this, obj);
                break;
            case 103:
                onChanged$103(this, obj);
                break;
            case 104:
                onChanged$104(this, obj);
                break;
            case 105:
                onChanged$105(this, obj);
                break;
            case 106:
                onChanged$106(this, obj);
                break;
            case 107:
                onChanged$107(this, obj);
                break;
            case 108:
                onChanged$108(this, obj);
                break;
            case 109:
                onChanged$109(this, obj);
                break;
            case 110:
                onChanged$110(this, obj);
                break;
            case 111:
                onChanged$111(this, obj);
                break;
            case 112:
                onChanged$112(this, obj);
                break;
            case 113:
                onChanged$113(this, obj);
                break;
            case 114:
                onChanged$114(this, obj);
                break;
            case 115:
                onChanged$115(this, obj);
                break;
            case 116:
                onChanged$116(this, obj);
                break;
            case 117:
                onChanged$117(this, obj);
                break;
            case 118:
                onChanged$118(this, obj);
                break;
            case 119:
                onChanged$119(this, obj);
                break;
            case 120:
                onChanged$120(this, obj);
                break;
            case 121:
                onChanged$121(this, obj);
                break;
            case 122:
                onChanged$122(this, obj);
                break;
            case 123:
                onChanged$123(this, obj);
                break;
            case 124:
                onChanged$124(this, obj);
                break;
            case 125:
                onChanged$125(this, obj);
                break;
            case 126:
                onChanged$126(this, obj);
                break;
            case 127:
                onChanged$127(this, obj);
                break;
            case 128:
                onChanged$128(this, obj);
                break;
            case 129:
                onChanged$129(this, obj);
                break;
            case 130:
                onChanged$130(this, obj);
                break;
            case 131:
                onChanged$131(this, obj);
                break;
            case 132:
                onChanged$132(this, obj);
                break;
            case 133:
                onChanged$133(this, obj);
                break;
            case 134:
                onChanged$134(this, obj);
                break;
            case 135:
                onChanged$135(this, obj);
                break;
            case 136:
                onChanged$136(this, obj);
                break;
        }
    }

    public AObserverS219S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviteeFragment) aObserverS219S0100000_15.l0).VR();
    }

    public static final void onChanged$1(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviteeFragment) aObserverS219S0100000_15.l0).VR();
    }

    public static final void onChanged$10(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Long l = (Long) obj;
        C973070bQf c973070bQf = ((TeamPairInviteeCohostRoomFragment) aObserverS219S0100000_15.l0).LLJLLL;
        if (c973070bQf != null) {
            c973070bQf.setCountdown(l.longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$100(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean zBooleanValue;
        List list;
        C973100bQi c973100bQi;
        List list2;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        Boolean bool;
        Map map = (Map) obj;
        TwoMatchInviterFragment twoMatchInviterFragment = (TwoMatchInviterFragment) aObserverS219S0100000_15.l0;
        C977620bY0 c977620bY0 = twoMatchInviterFragment.LLILZ;
        if (c977620bY0 != null && (mutableLiveData4 = c977620bY0.LJIILJJIL) != null && (bool = (Boolean) mutableLiveData4.getValue()) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update userInfo, host = ");
        sbLIZ.append(map);
        C20441214yg.LIZIZ("TwoMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        C977620bY0 c977620bY02 = twoMatchInviterFragment.LLILZ;
        Map<Long, GiftGalleryBadgeInfo> value = null;
        if (c977620bY02 != null && (mutableLiveData3 = c977620bY02.LIZJ) != null) {
            list = (List) mutableLiveData3.getValue();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty() && (c973100bQi = twoMatchInviterFragment.LLJ) != null) {
            C977620bY0 c977620bY03 = twoMatchInviterFragment.LLILZ;
            if (c977620bY03 != null && (mutableLiveData2 = c977620bY03.LIZJ) != null) {
                list2 = (List) mutableLiveData2.getValue();
            } else {
                list2 = null;
            }
            C977620bY0 c977620bY04 = twoMatchInviterFragment.LLILZ;
            if (c977620bY04 != null && (mutableLiveData = c977620bY04.LJIIJJI) != null) {
                value = mutableLiveData.getValue();
            }
            c973100bQi.l0(map, value, list2, zBooleanValue, false);
        }
        TwoMatchInviterFragment twoMatchInviterFragment2 = (TwoMatchInviterFragment) aObserverS219S0100000_15.l0;
        twoMatchInviterFragment2.getClass();
        if (map != null) {
            if (!map.isEmpty()) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                        return;
                    }
                }
            }
            InteractDisconnectDialog interactDisconnectDialog = twoMatchInviterFragment2.LLIZLLLIL;
            if (interactDisconnectDialog == null || !interactDisconnectDialog.isShowing()) {
                return;
            }
            interactDisconnectDialog.dismiss();
        }
    }

    public static final void onChanged$101(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List list;
        MutableLiveData mutableLiveData;
        Map map = (Map) obj;
        TwoMatchInviterFragment twoMatchInviterFragment = (TwoMatchInviterFragment) aObserverS219S0100000_15.l0;
        C973100bQi c973100bQi = twoMatchInviterFragment.LLJ;
        if (c973100bQi != null) {
            C977620bY0 c977620bY0 = twoMatchInviterFragment.LLILZ;
            if (c977620bY0 != null && (mutableLiveData = c977620bY0.LIZJ) != null) {
                list = (List) mutableLiveData.getValue();
            } else {
                list = null;
            }
            C973100bQi.j0(c973100bQi, list, map);
        }
    }

    public static final void onChanged$102(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TwoMatchInviterFragment twoMatchInviterFragment = (TwoMatchInviterFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973100bQi c973100bQi = twoMatchInviterFragment.LLJ;
        if (c973100bQi != null) {
            c973100bQi.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$103(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C979580bbA c979580bbA = ((C979600bbC) aObserverS219S0100000_15.l0).LJIIIIZZ;
        if (c979580bbA != null) {
            c979580bbA.L5();
        }
    }

    public static final void onChanged$104(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        User userLJIIJ = ((AbstractC938650aX9) aObserverS219S0100000_15.l0).LJIIJ();
        if (userLJIIJ != null && userLJIIJ.getId() == C933980aPc.LIZIZ()) {
            C924790aAn.LIZLLL().LJIIIZ(jLongValue);
        }
    }

    public static final void onChanged$105(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LJII((ImageModel) obj);
    }

    public static final void onChanged$106(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        View viewFindViewById;
        TextView textView;
        C939680aYo c939680aYo = (C939680aYo) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[businessMicInfoObserver] ");
        sbLIZ.append(((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).hashCode());
        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup viewGroup = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
        if (viewGroup != null && (textView = (TextView) viewGroup.findViewById(R.id.p9_)) != null) {
            textView.setText(c939680aYo.LIZJ);
        }
        ViewGroup viewGroup2 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
        if (viewGroup2 != null && (viewFindViewById = viewGroup2.findViewById(R.id.pmy)) != null) {
            C12ES.LJIILL(0, viewFindViewById);
            if (LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt()) {
                View viewFindViewById2 = viewFindViewById.findViewById(R.id.js2);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setBackgroundResource(0);
                }
                View viewFindViewById3 = viewFindViewById.findViewById(R.id.js4);
                if (viewFindViewById3 != null) {
                    C439101nJ.LJI(viewFindViewById3);
                }
                View viewFindViewById4 = viewFindViewById.findViewById(R.id.js5);
                if (viewFindViewById4 != null) {
                    viewFindViewById4.setPaddingRelative(viewFindViewById4.getPaddingStart(), viewFindViewById4.getPaddingTop(), (int) C12ES.LIZJ(4.0f, viewFindViewById.getContext()), viewFindViewById4.getPaddingBottom());
                }
            } else {
                View viewFindViewById5 = viewFindViewById.findViewById(R.id.js2);
                if (viewFindViewById5 != null) {
                    viewFindViewById5.setBackgroundResource(R.drawable.dut);
                }
                View viewFindViewById6 = viewFindViewById.findViewById(R.id.js4);
                if (viewFindViewById6 != null) {
                    C12ES.LJIILL(0, viewFindViewById6);
                }
                LiveIconView liveIconView = (LiveIconView) viewFindViewById.findViewById(R.id.js4);
                if (liveIconView != null) {
                    liveIconView.setIconTintAttr(R.attr.c9i);
                }
                View viewFindViewById7 = viewFindViewById.findViewById(R.id.js5);
                if (viewFindViewById7 != null) {
                    viewFindViewById7.setPaddingRelative(viewFindViewById7.getPaddingStart(), viewFindViewById7.getPaddingTop(), (int) C12ES.LIZJ(6.0f, viewFindViewById.getContext()), viewFindViewById7.getPaddingBottom());
                }
            }
        }
        ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
        ViewGroup viewGroup3 = viewOnClickListenerC939670aYn.LLJ;
        if (viewGroup3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[businessMicInfoObserver] ");
            sbLIZ2.append(viewOnClickListenerC939670aYn.hashCode());
            sbLIZ2.append(" get parent");
            C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ2));
            ViewGroup viewGroup4 = viewOnClickListenerC939670aYn.LLJILJIL;
            if (viewGroup4 != null) {
                C930540aK4.LJJIL(-1, viewGroup4, viewGroup3);
            }
            AwS144S0400000_15 awS144S0400000_15 = new AwS144S0400000_15(viewGroup3, viewGroup4, viewOnClickListenerC939670aYn, c939680aYo, 8);
            if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
                if (viewGroup3.isLaidOut() && !viewGroup3.isLayoutRequested()) {
                    awS144S0400000_15.invoke();
                    return;
                } else {
                    viewGroup3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(awS144S0400000_15, 6));
                    return;
                }
            }
            C930540aK4.LJJJ(viewGroup3, new ARunnableS104S0100000_4((Object) awS144S0400000_15, 142));
        }
    }

    public static final void onChanged$107(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MutableLiveData<Integer> mutableLiveDataLJIIJJI;
        Integer value;
        DataChannel dataChannel;
        C939680aYo value2;
        Integer num = (Integer) obj;
        if (num != null) {
            num.intValue();
            AbstractC938650aX9 abstractC938650aX9 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJIJIL;
            if (abstractC938650aX9 != null && (mutableLiveDataLJIIJJI = abstractC938650aX9.LJIIJJI()) != null && (value = mutableLiveDataLJIIJJI.getValue()) != null && value.intValue() == 0) {
                C941290abP c941290abP = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJI;
                if (c941290abP != null && c941290abP.LIZLLL(num.intValue())) {
                    AbstractC938650aX9 abstractC938650aX92 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJIJIL;
                    Long lValueOf = null;
                    if (abstractC938650aX92 != null) {
                        dataChannel = abstractC938650aX92.LIZ;
                        MutableLiveData<C939680aYo> mutableLiveDataLJI = abstractC938650aX92.LJI();
                        if (mutableLiveDataLJI != null && (value2 = mutableLiveDataLJI.getValue()) != null) {
                            lValueOf = Long.valueOf(value2.LIZ);
                        }
                    } else {
                        dataChannel = null;
                    }
                    C933980aPc.LJIIJ(dataChannel, lValueOf);
                    return;
                }
                return;
            }
            ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
            C941290abP c941290abP2 = viewOnClickListenerC939670aYn.LLJI;
            if (c941290abP2 != null) {
                c941290abP2.LIZLLL = true;
            }
            C1324720kZq c1324720kZq = viewOnClickListenerC939670aYn.LLJILLL;
            if (c1324720kZq == null) {
                return;
            }
            C12ES.LJIILL(4, c1324720kZq);
        }
    }

    public static final void onChanged$108(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MutableLiveData<ImageModel> mutableLiveDataLJFF;
        View viewFindViewById;
        View viewFindViewById2;
        MutableLiveData<ImageModel> mutableLiveDataLJFF2;
        View viewFindViewById3;
        View viewFindViewById4;
        MutableLiveData<ImageModel> mutableLiveDataLJFF3;
        View viewFindViewById5;
        View viewFindViewById6;
        MutableLiveData<ImageModel> mutableLiveDataLJFF4;
        View viewFindViewById7;
        View viewFindViewById8;
        int iIntValue = ((Number) obj).intValue();
        ImageModel value = null;
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        ViewGroup viewGroup = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
                        if (viewGroup != null && (viewFindViewById8 = viewGroup.findViewById(R.id.pn3)) != null) {
                            C12ES.LJIILL(0, viewFindViewById8);
                        }
                        ViewGroup viewGroup2 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
                        if (viewGroup2 != null && (viewFindViewById7 = viewGroup2.findViewById(R.id.q3s)) != null) {
                            C12ES.LJIILL(0, viewFindViewById7);
                        }
                        ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                        C941290abP c941290abP = viewOnClickListenerC939670aYn.LLJI;
                        if (c941290abP != null) {
                            c941290abP.LIZLLL = true;
                        }
                        Integer numValueOf = Integer.valueOf(viewOnClickListenerC939670aYn.LLILLL);
                        int iIntValue2 = numValueOf.intValue();
                        if (iIntValue2 != 2 && iIntValue2 != 3) {
                            ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn2 = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                            numValueOf.intValue();
                            AbstractC938650aX9 abstractC938650aX9 = viewOnClickListenerC939670aYn2.LLJIJIL;
                            if (abstractC938650aX9 != null && (mutableLiveDataLJFF4 = abstractC938650aX9.LJFF()) != null) {
                                value = mutableLiveDataLJFF4.getValue();
                            }
                            viewOnClickListenerC939670aYn2.LJI(value);
                        }
                    }
                } else {
                    ViewGroup viewGroup3 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
                    if (viewGroup3 != null && (viewFindViewById6 = viewGroup3.findViewById(R.id.pn3)) != null) {
                        C439101nJ.LJI(viewFindViewById6);
                    }
                    ViewGroup viewGroup4 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
                    if (viewGroup4 != null && (viewFindViewById5 = viewGroup4.findViewById(R.id.q3s)) != null) {
                        C12ES.LJIILL(0, viewFindViewById5);
                    }
                    ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn3 = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                    C941290abP c941290abP2 = viewOnClickListenerC939670aYn3.LLJI;
                    if (c941290abP2 != null) {
                        c941290abP2.LIZLLL = true;
                    }
                    Integer numValueOf2 = Integer.valueOf(viewOnClickListenerC939670aYn3.LLILLL);
                    int iIntValue3 = numValueOf2.intValue();
                    if (iIntValue3 != 2 && iIntValue3 != 3) {
                        ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn4 = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                        numValueOf2.intValue();
                        AbstractC938650aX9 abstractC938650aX92 = viewOnClickListenerC939670aYn4.LLJIJIL;
                        if (abstractC938650aX92 != null && (mutableLiveDataLJFF3 = abstractC938650aX92.LJFF()) != null) {
                            value = mutableLiveDataLJFF3.getValue();
                        }
                        viewOnClickListenerC939670aYn4.LJI(value);
                    }
                }
            } else {
                ViewGroup viewGroup5 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
                if (viewGroup5 != null && (viewFindViewById4 = viewGroup5.findViewById(R.id.pn3)) != null) {
                    C12ES.LJIILL(0, viewFindViewById4);
                }
                ViewGroup viewGroup6 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
                if (viewGroup6 != null && (viewFindViewById3 = viewGroup6.findViewById(R.id.q3s)) != null) {
                    C439101nJ.LJI(viewFindViewById3);
                }
                ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn5 = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                C941290abP c941290abP3 = viewOnClickListenerC939670aYn5.LLJI;
                if (c941290abP3 != null) {
                    c941290abP3.LIZLLL = true;
                }
                C1324720kZq c1324720kZq = viewOnClickListenerC939670aYn5.LLJILLL;
                if (c1324720kZq != null) {
                    C12ES.LJIILL(4, c1324720kZq);
                }
                Integer numValueOf3 = Integer.valueOf(((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLILLL);
                int iIntValue4 = numValueOf3.intValue();
                if (iIntValue4 != 0 && iIntValue4 != 1) {
                    ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn6 = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                    numValueOf3.intValue();
                    AbstractC938650aX9 abstractC938650aX93 = viewOnClickListenerC939670aYn6.LLJIJIL;
                    if (abstractC938650aX93 != null && (mutableLiveDataLJFF2 = abstractC938650aX93.LJFF()) != null) {
                        value = mutableLiveDataLJFF2.getValue();
                    }
                    viewOnClickListenerC939670aYn6.LJII(value);
                }
            }
        } else {
            ViewGroup viewGroup7 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
            if (viewGroup7 != null && (viewFindViewById2 = viewGroup7.findViewById(R.id.pn3)) != null) {
                C439101nJ.LJI(viewFindViewById2);
            }
            ViewGroup viewGroup8 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILJIL;
            if (viewGroup8 != null && (viewFindViewById = viewGroup8.findViewById(R.id.q3s)) != null) {
                C439101nJ.LJI(viewFindViewById);
            }
            C1324720kZq c1324720kZq2 = ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLJILLL;
            if (c1324720kZq2 != null) {
                C12ES.LJIILL(0, c1324720kZq2);
            }
            Integer numValueOf4 = Integer.valueOf(((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLILLL);
            int iIntValue5 = numValueOf4.intValue();
            if (iIntValue5 != 0 && iIntValue5 != 1) {
                ViewOnClickListenerC939670aYn viewOnClickListenerC939670aYn7 = (ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0;
                numValueOf4.intValue();
                AbstractC938650aX9 abstractC938650aX94 = viewOnClickListenerC939670aYn7.LLJIJIL;
                if (abstractC938650aX94 != null && (mutableLiveDataLJFF = abstractC938650aX94.LJFF()) != null) {
                    value = mutableLiveDataLJFF.getValue();
                }
                viewOnClickListenerC939670aYn7.LJII(value);
            }
        }
        ((ViewOnClickListenerC939670aYn) aObserverS219S0100000_15.l0).LLILLL = iIntValue;
    }

    public static final void onChanged$109(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        CharSequence text;
        ViewGroup viewGroup;
        TextView textView;
        SimpleLiveTextView simpleLiveTextView;
        long jLongValue = ((Number) obj).longValue();
        ViewGroup viewGroup2 = ((C938660aXA) aObserverS219S0100000_15.l0).LLJILJIL;
        if (viewGroup2 != null && viewGroup2.findViewById(R.id.xv9) != null) {
            C938660aXA c938660aXA = (C938660aXA) aObserverS219S0100000_15.l0;
            c938660aXA.getClass();
            String upperCase = C1850730yGF.LJFF(jLongValue).toUpperCase(Locale.ROOT);
            ViewGroup viewGroup3 = c938660aXA.LLJILJIL;
            if (viewGroup3 != null && (simpleLiveTextView = (SimpleLiveTextView) viewGroup3.findViewById(R.id.xv9)) != null) {
                text = simpleLiveTextView.getText();
            } else {
                text = null;
            }
            if (!Intrinsics.LJFF(text, upperCase) && (viewGroup = c938660aXA.LLJILJIL) != null && (textView = (TextView) viewGroup.findViewById(R.id.xv9)) != null) {
                textView.setText(upperCase);
            }
        }
    }

    public static final void onChanged$11(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = (MultiLiveAnchorPanelSettings) obj;
        if (!Intrinsics.LJFF(((MultiLiveSettingDialog) aObserverS219S0100000_15.l0).LLILZ, multiLiveAnchorPanelSettings)) {
            MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) aObserverS219S0100000_15.l0;
            multiLiveSettingDialog.LLILZ = multiLiveAnchorPanelSettings;
            MultiLiveSettingDialog.JS(multiLiveSettingDialog, 12, false, 2);
        }
    }

    public static final void onChanged$110(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ViewGroup viewGroup;
        final C1324720kZq c1324720kZq;
        String str = (String) obj;
        if (str != null && (viewGroup = ((C938660aXA) aObserverS219S0100000_15.l0).LLJILJIL) != null && (c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.xva)) != null) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
            final C938660aXA c938660aXA = (C938660aXA) aObserverS219S0100000_15.l0;
            url.LJIIL = new C0IYA() { // from class: X.0aXD
                @Override // X.C0IYA
                public final void LJ(boolean z) {
                    if (!z) {
                        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                            c1324720kZq.setImageDrawable((Drawable) c938660aXA.LLJJIJI.getValue());
                        } else {
                            c1324720kZq.setBackgroundResource(R.drawable.emi);
                        }
                    }
                }
            };
            url.LJJI(c1324720kZq);
        }
    }

    public static final void onChanged$111(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C938660aXA c938660aXA = (C938660aXA) aObserverS219S0100000_15.l0;
        c938660aXA.getClass();
        C16FZ c16fz = null;
        if (!C930540aK4.LIZJ()) {
            AbstractC938650aX9 abstractC938650aX9 = c938660aXA.LLJIJIL;
            if (abstractC938650aX9 != null) {
                str = abstractC938650aX9.LIZIZ;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
                return;
            }
        }
        ViewGroup viewGroup = c938660aXA.LLJILJIL;
        if (viewGroup != null) {
            c16fz = (C16FZ) viewGroup.findViewById(R.id.nnp);
        }
        if (zBooleanValue) {
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 8);
            }
        } else {
            if (c16fz == null) {
                return;
            }
            C786410Ut5.LLLIZZ(c16fz, 0);
        }
    }

    public static final void onChanged$112(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C16FV c16fv;
        EnumC920860a4S enumC920860a4S = (EnumC920860a4S) obj;
        ViewGroup viewGroup = ((C938660aXA) aObserverS219S0100000_15.l0).LLJILJIL;
        if (viewGroup != null) {
            c16fv = (C16FV) viewGroup.findViewById(R.id.p57);
        } else {
            c16fv = null;
        }
        int i = C920870a4T.LIZ[enumC920860a4S.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (c16fv != null) {
                    C439101nJ.LJI(c16fv);
                    return;
                }
                return;
            } else {
                if (c16fv == null) {
                    return;
                }
                C12ES.LJIILL(0, c16fv);
                c16fv.setImageResource(R.drawable.ep7);
                return;
            }
        }
        if (c16fv == null) {
            return;
        }
        C12ES.LJIILL(0, c16fv);
        c16fv.setImageResource(R.drawable.ep6);
    }

    public static final void onChanged$113(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        View viewFindViewById;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ViewGroup viewGroup = ((C938660aXA) aObserverS219S0100000_15.l0).LLJILJIL;
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.xv8)) != null) {
            C500260Jjc.LJLJLJ(viewFindViewById, zBooleanValue);
        }
    }

    public static final void onChanged$114(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List list;
        boolean z;
        MatchManagementPanelSheet matchManagementPanelSheet = (MatchManagementPanelSheet) aObserverS219S0100000_15.l0;
        matchManagementPanelSheet.getClass();
        MutableLiveData mutableLiveDataUS = MatchManagementPanelSheet.uS();
        if (mutableLiveDataUS != null && (list = (List) mutableLiveDataUS.getValue()) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<C976800bWg> list2 = ((C976480bWA) it2.next()).LJFF;
                if (list2 != null) {
                    for (C976800bWg c976800bWg : (ArrayList) list2) {
                        long j = c976800bWg.LIZ;
                        long j2 = c976800bWg.LJ;
                        long j3 = c976800bWg.LJII;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("new arch matchWidget.findWindowById(uid) = null! userName = ");
                        sbLIZ.append(c976800bWg.LIZJ);
                        C20441214yg.LIZIZ("MatchManagementPanelSheet", C2188811AlT.LIZIZ(sbLIZ));
                        int i = 0;
                        if (j3 > 0 && C915980Zwa.LJFF().Nt()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            j3 = 0;
                        }
                        String strLIZ = C944330agJ.LIZ(j2 - j3);
                        if (z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZ);
                            sbLIZ2.append('+');
                            strLIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        C973830bRt c973830bRt = (C973830bRt) ((LinkedHashMap) matchManagementPanelSheet.LLLF).get(Long.valueOf(j));
                        if (c973830bRt != null) {
                            C16F5 c16f5 = c973830bRt.LLILZ;
                            if (c16f5 != null) {
                                c16f5.setText(strLIZ);
                            }
                            C1324720kZq c1324720kZq = c973830bRt.LLILZIL;
                            if (c1324720kZq != null) {
                                if (!z) {
                                    i = 8;
                                }
                                C786410Ut5.LLJJIII(c1324720kZq, i);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void onChanged$115(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TakeStageInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$116(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TakeStageInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$117(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TakeStageInviteeFragment takeStageInviteeFragment = (TakeStageInviteeFragment) aObserverS219S0100000_15.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C500260Jjc.LJIILIIL(takeStageInviteeFragment.LLJJ);
            C500260Jjc.LJIILIIL(takeStageInviteeFragment.LLJILLL);
            C500260Jjc.LLFFF(takeStageInviteeFragment.LLJJI);
        } else {
            C500260Jjc.LLFFF(takeStageInviteeFragment.LLJJ);
            C500260Jjc.LLFFF(takeStageInviteeFragment.LLJILLL);
            C500260Jjc.LJIILIIL(takeStageInviteeFragment.LLJJI);
        }
        C978980baC c978980baC = takeStageInviteeFragment.LLILZLL;
        if (c978980baC != null) {
            c978980baC.LJIIIIZZ = zBooleanValue;
        }
    }

    public static final void onChanged$118(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map map = (Map) obj;
        TakeStageInviteeFragment takeStageInviteeFragment = (TakeStageInviteeFragment) aObserverS219S0100000_15.l0;
        takeStageInviteeFragment.getClass();
        if (!map.isEmpty()) {
            for (C982910bgX c982910bgX : takeStageInviteeFragment.LLJIJIL) {
                Boolean bool = (Boolean) map.get(Long.valueOf(c982910bgX.LIZ));
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    c982910bgX.LJII = zBooleanValue;
                    c982910bgX.LJIIIIZZ = !zBooleanValue;
                }
            }
            takeStageInviteeFragment.LLJILJIL.notifyDataSetChanged();
        }
    }

    public static final void onChanged$119(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TakeStageInviteeFragment takeStageInviteeFragment = (TakeStageInviteeFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C16FS c16fs = takeStageInviteeFragment.LLJJ;
        if (c16fs != null) {
            c16fs.setText(C786410Ut5.j4(takeStageInviteeFragment.getString(2131841117), Arrays.copyOf(new Object[]{Integer.valueOf((int) jLongValue)}, 1)));
        }
        for (C982910bgX c982910bgX : takeStageInviteeFragment.LLJIJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jLongValue);
            sbLIZ.append('s');
            c982910bgX.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        takeStageInviteeFragment.LLJILJIL.notifyDataSetChanged();
    }

    public static final void onChanged$12(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MultiLiveSettingDialog.JS((MultiLiveSettingDialog) aObserverS219S0100000_15.l0, 12, false, 2);
    }

    public static final void onChanged$120(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        int i;
        EnumC947440alK enumC947440alK = (EnumC947440alK) obj;
        ((C947280al4) aObserverS219S0100000_15.l0).LLJJJJ = enumC947440alK;
        if (enumC947440alK == null) {
            i = -1;
        } else {
            i = C947270al3.LIZ[enumC947440alK.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LetsDanceMainSpotBizViewElement Game is in ");
                    sbLIZ.append(enumC947440alK);
                    sbLIZ.append(" phase");
                    C20441214yg.LJ("lzp-test", C2188811AlT.LIZIZ(sbLIZ));
                    ((C947280al4) aObserverS219S0100000_15.l0).LJIIJJI();
                    return;
                }
                C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement Game is in FINISH phase");
                ((C947280al4) aObserverS219S0100000_15.l0).LJIJ();
                ((C947280al4) aObserverS219S0100000_15.l0).LJIIL();
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LetsDanceMainSpotBizViewElement Game is in PLAYING phase, isOnline = ");
            sbLIZ2.append(C924790aAn.LIZLLL().LJFF());
            C20441214yg.LIZIZ("lzp-test", C2188811AlT.LIZIZ(sbLIZ2));
            ((C947280al4) aObserverS219S0100000_15.l0).LJIILIIL();
            if (!((C947280al4) aObserverS219S0100000_15.l0).getViewModel().LJIIJJI()) {
                ((C947280al4) aObserverS219S0100000_15.l0).getViewModel().LJFF();
            }
            ((C947280al4) aObserverS219S0100000_15.l0).LJIIJJI();
            return;
        }
        C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement Game is in PREPARING phase");
        ((C947280al4) aObserverS219S0100000_15.l0).LJIJJ();
        ((C947280al4) aObserverS219S0100000_15.l0).LJIIJJI();
    }

    public static final void onChanged$121(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        int i;
        EnumC942260acy enumC942260acy;
        C947590alZ c947590alZ = (C947590alZ) obj;
        EnumC942260acy enumC942260acy2 = null;
        if (c947590alZ != null && (enumC942260acy = c947590alZ.LIZJ) != null) {
            i = C947130akp.LIZ[enumC942260acy.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LetsDanceMainSpotBizViewElement PlayerStatus is ");
                if (c947590alZ != null) {
                    enumC942260acy2 = c947590alZ.LIZJ;
                }
                sbLIZ.append(enumC942260acy2);
                C20441214yg.LIZIZ("lzp-test", C2188811AlT.LIZIZ(sbLIZ));
                C16FS mainButton = ((C947280al4) aObserverS219S0100000_15.l0).getMainButton();
                if (mainButton != null) {
                    ((C947280al4) aObserverS219S0100000_15.l0).getClass();
                    C947280al4.LJIIIZ(mainButton);
                    return;
                }
                return;
            }
            C16FS mainButton2 = ((C947280al4) aObserverS219S0100000_15.l0).getMainButton();
            if (mainButton2 == null) {
                return;
            }
            ((C947280al4) aObserverS219S0100000_15.l0).getClass();
            C947280al4.LJIIIZ(mainButton2);
            return;
        }
        C16FS mainButton3 = ((C947280al4) aObserverS219S0100000_15.l0).getMainButton();
        if (mainButton3 == null) {
            return;
        }
        ((C947280al4) aObserverS219S0100000_15.l0).getClass();
        C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement applyReadyStyle");
        mainButton3.LJIIL();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.exp);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.exg, mainButton3.getContext());
        c384050F3z.LIZLLL = Integer.valueOf(C439101nJ.LIZ(1));
        mainButton3.setBackground(c384050F3z.LIZ(mainButton3.getContext()));
        mainButton3.setText(C20642515q3.LJI(2131854460));
    }

    public static final void onChanged$122(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        String str = (String) obj;
        C16F5 musicNameView = ((C947280al4) aObserverS219S0100000_15.l0).getMusicNameView();
        if (musicNameView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LetsDanceMainSpotBizViewElement Updating music name: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("lzp-test", C2188811AlT.LIZIZ(sbLIZ));
            if (str == null) {
                str = "";
            }
            musicNameView.setText(str);
        }
    }

    public static final void onChanged$123(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map map = (Map) obj;
        TakeStageInviterWaitingFragment takeStageInviterWaitingFragment = (TakeStageInviterWaitingFragment) aObserverS219S0100000_15.l0;
        takeStageInviterWaitingFragment.getClass();
        if (!map.isEmpty()) {
            for (C982910bgX c982910bgX : takeStageInviterWaitingFragment.LLILZLL) {
                Boolean bool = (Boolean) map.get(Long.valueOf(c982910bgX.LIZ));
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    c982910bgX.LJII = zBooleanValue;
                    c982910bgX.LJIIIIZZ = !zBooleanValue;
                }
            }
            takeStageInviterWaitingFragment.LLIZ.notifyDataSetChanged();
        }
    }

    public static final void onChanged$124(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TakeStageInviterSelectFragment) aObserverS219S0100000_15.l0).PR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$125(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TakeStageInviterWaitingFragment) aObserverS219S0100000_15.l0).PR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$126(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TakeStageInviterWaitingFragment takeStageInviterWaitingFragment = (TakeStageInviterWaitingFragment) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            Iterator<C982910bgX> it2 = takeStageInviterWaitingFragment.LLILZLL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIIZZ = false;
            }
            takeStageInviterWaitingFragment.LLIZ.notifyDataSetChanged();
            return;
        }
        takeStageInviterWaitingFragment.getClass();
    }

    public static final void onChanged$127(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TakeStageInviterWaitingFragment takeStageInviterWaitingFragment = (TakeStageInviterWaitingFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        for (C982910bgX c982910bgX : takeStageInviterWaitingFragment.LLILZLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jLongValue);
            sbLIZ.append('s');
            c982910bgX.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        takeStageInviterWaitingFragment.LLIZ.notifyDataSetChanged();
    }

    public static final void onChanged$128(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 1) {
                C16FS c16fs = ((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZ;
                if (c16fs != null) {
                    c16fs.setText(2131842485);
                }
                ((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZLL = 2;
            } else if (num != null) {
                if (num.intValue() == 2) {
                    C16FS c16fs2 = ((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZ;
                    if (c16fs2 != null) {
                        c16fs2.setText(2131842486);
                    }
                    ((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZLL = 1;
                } else if (num.intValue() == 3) {
                    C16FS c16fs3 = ((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZ;
                    if (c16fs3 != null) {
                        c16fs3.setText(2131842486);
                    }
                    ((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZLL = 0;
                }
            }
        }
        C943120aeM.LJFF(((AigcWallpaperAnchorGuideDialog) aObserverS219S0100000_15.l0).LLILZLL, "show", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$129(Y.AObserverS219S0100000_15 r11, java.lang.Object r12) {
        /*
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r4 = r11.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperManageDialog r4 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperManageDialog) r4
            java.lang.Object r8 = r12.getFirst()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r12.getSecond()
            java.util.List r7 = (java.util.List) r7
            X.0fBO r9 = r4.LLILLL
            r5 = 0
            if (r9 == 0) goto L85
            X.01il r6 = new X.01il
            r6.<init>()
            if (r8 == 0) goto L47
            int r0 = r8.size()
        L22:
            r12 = 1
            int r11 = r0 + 1
            r10 = 0
            if (r7 == 0) goto L4d
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r3.next()
            int r0 = r2 + 1
            if (r2 < 0) goto L49
            webcast.data.multi_guest_play.WallpaperContext r1 = (webcast.data.multi_guest_play.WallpaperContext) r1
            r1.LIZ = r12
            int r2 = r2 + r11
            r1.LIZIZ = r2
            r6.add(r1)
            r2 = r0
            goto L2d
        L47:
            r0 = 0
            goto L22
        L49:
            X.C1697810uHb.LJIJI()
            throw r10
        L4d:
            if (r8 == 0) goto L83
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r12) goto L61
            X.0ad4 r0 = new X.0ad4
            r0.<init>()
            r6.add(r0)
            if (r8 == 0) goto L83
        L61:
            java.util.Iterator r3 = r8.iterator()
            r2 = 0
        L66:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r3.next()
            int r0 = r2 + 1
            if (r2 < 0) goto L7f
            webcast.data.multi_guest_play.WallpaperContext r1 = (webcast.data.multi_guest_play.WallpaperContext) r1
            r1.LIZ = r5
            r1.LIZIZ = r0
            r6.add(r1)
            r2 = r0
            goto L66
        L7f:
            X.C1697810uHb.LJIJI()
            throw r10
        L83:
            r9.LL = r6
        L85:
            if (r8 == 0) goto Lae
            int r0 = r8.size()
        L8b:
            r4.LLJ = r0
            if (r7 == 0) goto Lac
            int r0 = r7.size()
        L93:
            r4.LLJI = r0
            X.0fBO r0 = r4.LLILLL
            if (r0 == 0) goto L9c
            r0.notifyDataSetChanged()
        L9c:
            boolean r0 = r4.LLIZLLLIL
            if (r0 == 0) goto Lab
            int r2 = r4.LLJ
            int r1 = r4.LLJI
            java.lang.String r0 = "show"
            X.C943120aeM.LJI(r2, r1, r0)
            r4.LLIZLLLIL = r5
        Lab:
            return
        Lac:
            r0 = 0
            goto L93
        Lae:
            r0 = 0
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS219S0100000_15.onChanged$129(Y.AObserverS219S0100000_15, java.lang.Object):void");
    }

    public static final void onChanged$13(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Boolean boolValueOf;
        RandomMatchFragment randomMatchFragment = (RandomMatchFragment) aObserverS219S0100000_15.l0;
        randomMatchFragment.LLLIILIL = randomMatchFragment.LLLIL;
        EnumC948930anj enumC948930anj = ((C948850anb) obj).LIZ;
        randomMatchFragment.LLLIL = enumC948930anj;
        int i = C948950anl.LIZ[enumC948930anj.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        RandomMatchFragment randomMatchFragment2 = (RandomMatchFragment) aObserverS219S0100000_15.l0;
                        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(randomMatchFragment2, 274);
                        if (randomMatchFragment2.LLLIL != randomMatchFragment2.LLLIILIL) {
                            awS559S0100000_15.invoke();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                RandomMatchFragment randomMatchFragment3 = (RandomMatchFragment) aObserverS219S0100000_15.l0;
                if (randomMatchFragment3.LLJZ != 3 && randomMatchFragment3.LLLIILIL != EnumC948930anj.MATCHING) {
                    C948850anb value = randomMatchFragment3.LLJZIJLIL.LLILLJJLI.getValue();
                    if (value != null) {
                        boolValueOf = Boolean.valueOf(value.LJI);
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        ((RandomMatchFragment) aObserverS219S0100000_15.l0).close(1);
                        return;
                    }
                }
                RandomMatchFragment randomMatchFragment4 = (RandomMatchFragment) aObserverS219S0100000_15.l0;
                AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(randomMatchFragment4, 273);
                if (randomMatchFragment4.LLLIL == randomMatchFragment4.LLLIILIL) {
                    return;
                }
                awS559S0100000_152.invoke();
                return;
            }
            RandomMatchFragment randomMatchFragment5 = (RandomMatchFragment) aObserverS219S0100000_15.l0;
            AwS559S0100000_15 awS559S0100000_153 = new AwS559S0100000_15(randomMatchFragment5, 271);
            AwS559S0100000_15 awS559S0100000_154 = new AwS559S0100000_15((RandomMatchFragment) aObserverS219S0100000_15.l0, 272);
            if (randomMatchFragment5.LLLIL == randomMatchFragment5.LLLIILIL) {
                awS559S0100000_154.invoke();
                return;
            } else {
                awS559S0100000_153.invoke();
                return;
            }
        }
        RandomMatchFragment randomMatchFragment6 = (RandomMatchFragment) aObserverS219S0100000_15.l0;
        AwS559S0100000_15 awS559S0100000_155 = new AwS559S0100000_15(randomMatchFragment6, 270);
        if (randomMatchFragment6.LLLIL == randomMatchFragment6.LLLIILIL) {
            return;
        }
        awS559S0100000_155.invoke();
    }

    public static final void onChanged$130(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean z;
        C948850anb c948850anb = (C948850anb) obj;
        if (c948850anb.LIZ == EnumC948930anj.MATCHING) {
            z = true;
        } else {
            z = false;
        }
        C948910anh c948910anh = (C948910anh) aObserverS219S0100000_15.l0;
        if (c948910anh.LLILZ != z) {
            c948910anh.LJFF(z);
        }
        C948910anh c948910anh2 = (C948910anh) aObserverS219S0100000_15.l0;
        c948910anh2.LLILZ = z;
        DataChannel dataChannel = c948910anh2.LL;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(TopLiveHangoutInteractTypeData.class), Boolean.TRUE) && HangoutRoomFeedEnableSetting.INSTANCE.isEnable() && c948850anb.LIZ == EnumC948930anj.SUCCESS) {
            ((C948910anh) aObserverS219S0100000_15.l0).LJII(c948850anb);
        }
    }

    public static final void onChanged$131(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((IndividualMatchInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$132(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((IndividualMatchInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$133(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        IndividualMatchInviteeFragment individualMatchInviteeFragment = (IndividualMatchInviteeFragment) aObserverS219S0100000_15.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C500260Jjc.LLFFF(individualMatchInviteeFragment.LLJILLL);
            C500260Jjc.LJIILIIL(individualMatchInviteeFragment.LLJILJIL);
            C500260Jjc.LJIILIIL(individualMatchInviteeFragment.LLJILJILJ);
        } else {
            C500260Jjc.LJIILIIL(individualMatchInviteeFragment.LLJILLL);
            C500260Jjc.LLFFF(individualMatchInviteeFragment.LLJILJIL);
            C500260Jjc.LLFFF(individualMatchInviteeFragment.LLJILJILJ);
        }
        C978980baC c978980baC = individualMatchInviteeFragment.LLILZLL;
        if (c978980baC != null) {
            c978980baC.LJIIIIZZ = zBooleanValue;
        }
    }

    public static final void onChanged$134(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List list;
        MutableLiveData mutableLiveData;
        Map map = (Map) obj;
        IndividualMatchInviteeFragment individualMatchInviteeFragment = (IndividualMatchInviteeFragment) aObserverS219S0100000_15.l0;
        C973100bQi c973100bQi = individualMatchInviteeFragment.LLJI;
        if (c973100bQi != null) {
            C976940bWu c976940bWu = individualMatchInviteeFragment.LLILZ;
            if (c976940bWu != null && (mutableLiveData = c976940bWu.LIZLLL) != null) {
                list = (List) mutableLiveData.getValue();
            } else {
                list = null;
            }
            c973100bQi.l0(map, C2097608Jq.LJ(), list, true, false);
        }
    }

    public static final void onChanged$135(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        IndividualMatchInviteeFragment individualMatchInviteeFragment = (IndividualMatchInviteeFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973100bQi c973100bQi = individualMatchInviteeFragment.LLJI;
        if (c973100bQi != null) {
            c973100bQi.setCountdown(jLongValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$136(Y.AObserverS219S0100000_15 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS219S0100000_15.onChanged$136(Y.AObserverS219S0100000_15, java.lang.Object):void");
    }

    public static final void onChanged$14(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        AbstractC948890anf abstractC948890anf;
        C948850anb c948850anb = (C948850anb) obj;
        ((RandomMatchGuestWidget) aObserverS219S0100000_15.l0).dataChannel.zW(RandomMatchDataChannel.class, c948850anb);
        EnumC948930anj enumC948930anj = c948850anb.LIZ;
        if (enumC948930anj == EnumC948930anj.FAIL && ((RandomMatchGuestWidget) aObserverS219S0100000_15.l0).LLILLJJLI == null) {
            C766270U4b.LIZLLL(2131854691);
            return;
        }
        if (enumC948930anj != EnumC948930anj.SUCCESS) {
            return;
        }
        RandomMatchGuestWidget randomMatchGuestWidget = (RandomMatchGuestWidget) aObserverS219S0100000_15.l0;
        if (randomMatchGuestWidget.LLILLJJLI != null) {
            return;
        }
        if (C500260Jjc.LJJJI((Boolean) randomMatchGuestWidget.dataChannel.gg0(TopLiveHangoutInteractTypeData.class)) && HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            return;
        }
        RandomMatchGuestWidget randomMatchGuestWidget2 = (RandomMatchGuestWidget) aObserverS219S0100000_15.l0;
        RandomMatchGuestViewModel randomMatchGuestViewModel = randomMatchGuestWidget2.LL;
        if (randomMatchGuestViewModel == null || (abstractC948890anf = randomMatchGuestViewModel.LLILZIL) == null) {
            abstractC948890anf = C945370ahz.LIZIZ;
        }
        randomMatchGuestWidget2.x1(3, abstractC948890anf, null, null);
    }

    public static final void onChanged$15(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = (MultiLiveAnchorPanelSettings) obj;
        MultiGuestModeratorSettingDialog multiGuestModeratorSettingDialog = (MultiGuestModeratorSettingDialog) aObserverS219S0100000_15.l0;
        if (multiLiveAnchorPanelSettings != null) {
            multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings, 0, 0, 0, 8388607);
        } else {
            multiLiveAnchorPanelSettingsLIZ = null;
        }
        multiGuestModeratorSettingDialog.LLILZ = multiLiveAnchorPanelSettingsLIZ;
        MultiGuestModeratorSettingDialog.UR((MultiGuestModeratorSettingDialog) aObserverS219S0100000_15.l0, false, 2);
    }

    public static final void onChanged$16(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MultiGuestModeratorSettingDialog.UR((MultiGuestModeratorSettingDialog) aObserverS219S0100000_15.l0, false, 2);
    }

    public static final void onChanged$17(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C936030aSv c936030aSv = (C936030aSv) obj;
        if (c936030aSv != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("send generating state:");
            sbLIZ.append(c936030aSv.LIZIZ);
            C20441214yg.LIZIZ("AvatarBusinessAbilityImpl", C2188811AlT.LIZIZ(sbLIZ));
            EnumC935940aSm enumC935940aSm = c936030aSv.LIZIZ;
            if (enumC935940aSm == EnumC935940aSm.STATE_SUCCESS) {
                C766270U4b.LIZLLL(2131852805);
            } else if (enumC935940aSm == EnumC935940aSm.STATE_FAILED) {
                C766270U4b.LIZLLL(2131852806);
            }
            ((AvatarBusinessAbilityImpl) aObserverS219S0100000_15.l0).LLILZLL.setValue(c936030aSv);
        }
    }

    public static final void onChanged$18(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((AigcWallpaperGuestEditFragment) aObserverS219S0100000_15.l0).UR(((Integer) obj).intValue());
    }

    public static final void onChanged$19(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = ((AigcWallpaperGuestEditFragment) aObserverS219S0100000_15.l0).LLJ;
        if (aigcWallpaperGuestViewModel != null && (mutableLiveData = aigcWallpaperGuestViewModel.LLJJJIL) != null && (value = mutableLiveData.getValue()) != null) {
            ((AigcWallpaperGuestEditFragment) aObserverS219S0100000_15.l0).UR(value.intValue());
        }
    }

    public static final void onChanged$2(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        String strLJIJI;
        String strLJIJJ;
        TeamMatchInviteeFragment teamMatchInviteeFragment = (TeamMatchInviteeFragment) aObserverS219S0100000_15.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C500260Jjc.LLFFF(teamMatchInviteeFragment.LLJJIJI);
            C500260Jjc.LJIILIIL(teamMatchInviteeFragment.LLJJI);
            C500260Jjc.LJIILIIL(teamMatchInviteeFragment.LLJJIII);
        } else {
            C500260Jjc.LJIILIIL(teamMatchInviteeFragment.LLJJIJI);
            C500260Jjc.LLFFF(teamMatchInviteeFragment.LLJJI);
            C500260Jjc.LLFFF(teamMatchInviteeFragment.LLJJIII);
        }
        if (C915980Zwa.LJFF().k31()) {
            strLJIJI = C497740JfY.LJIJI(2131846592);
        } else if (!zBooleanValue) {
            strLJIJI = teamMatchInviteeFragment.SR();
        } else {
            strLJIJI = C497740JfY.LJIJI(2131853313);
        }
        Spannable spannableLJIJI = C978520bZS.LJIJI(teamMatchInviteeFragment.LLJIJIL, strLJIJI);
        if (C915980Zwa.LJFF().BS0()) {
            strLJIJJ = C497740JfY.LJIJI(2131853028);
        } else if (C915980Zwa.LJFF().k31()) {
            strLJIJJ = C497740JfY.LJIJI(2131846598);
        } else if (TeamMatchInviteeFragment.WR()) {
            strLJIJJ = C497740JfY.LJIJI(2131853766);
        } else if (C978520bZS.LJIIL(teamMatchInviteeFragment.LLJI)) {
            strLJIJJ = C497740JfY.LJIJJ(2131853671, C978520bZS.LIZLLL(teamMatchInviteeFragment.LLJI));
        } else {
            strLJIJJ = null;
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = spannableLJIJI;
        c978980baC.LJJI = C978520bZS.LJIJ(teamMatchInviteeFragment.LLJIJIL, strLJIJJ);
        c978980baC.LJIILIIL = false;
        c978980baC.LIZJ = teamMatchInviteeFragment.RR();
        c978980baC.LJIIIIZZ = true;
        c978980baC.LIZIZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(teamMatchInviteeFragment, 49);
        c978980baC.LJIIJJI = new AwS559S0100000_15(teamMatchInviteeFragment, 50);
        c978980baC.LIZIZ();
        teamMatchInviteeFragment.LLILZLL = c978980baC;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        teamMatchInviteeFragment.LLILZLL = c978980baC;
        InterfaceC963450bB9 interfaceC963450bB9 = teamMatchInviteeFragment.LL;
        if (interfaceC963450bB9 != null) {
            interfaceC963450bB9.Vh(c978980baC);
        }
        teamMatchInviteeFragment.UR(zBooleanValue);
        C978980baC c978980baC2 = teamMatchInviteeFragment.LLILZLL;
        if (c978980baC2 != null) {
            c978980baC2.LJIIIIZZ = zBooleanValue;
        }
    }

    public static final void onChanged$20(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C01ZA c01za;
        C01ZA c01za2 = (C01ZA) obj;
        DataChannel dataChannel = ((AnchorTextHeaderViewModel) aObserverS219S0100000_15.l0).LL;
        if (dataChannel != null) {
            if (c01za2 == null) {
                c01za = C972040bP0.LIZ;
            } else {
                c01za = c01za2;
            }
            dataChannel.zW(ApplyingTextHeaderFromServerSideChannel.class, c01za);
        }
        if (c01za2 != null) {
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
            multiCanvasUtils.getClass();
            C946850akN.LJI(MultiCanvasUtils.LJIIJJI(enumC952890au7), null, true, "personal", Long.valueOf(c01za2.LIZLLL), true, "header", Boolean.valueOf(((AnchorTextHeaderViewModel) aObserverS219S0100000_15.l0).wQ2().LIZLLL), String.valueOf(c01za2.LJFF), c01za2.LIZJ, c01za2.LJ);
            return;
        }
        DataChannel dataChannel2 = ((AnchorTextHeaderViewModel) aObserverS219S0100000_15.l0).LL;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.FQ2(TextHeaderEndEvent.class);
    }

    public static final void onChanged$21(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        IndividualMatchInviterFragment individualMatchInviterFragment = (IndividualMatchInviterFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973100bQi c973100bQi = individualMatchInviterFragment.LLIZLLLIL;
        if (c973100bQi != null) {
            c973100bQi.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$22(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((IndividualMatchInviterFragment) aObserverS219S0100000_15.l0).RR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$23(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        IndividualMatchInviterFragment individualMatchInviterFragment = (IndividualMatchInviterFragment) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C16FS c16fs = individualMatchInviterFragment.LLJI;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            C16FS c16fs2 = individualMatchInviterFragment.LLJI;
            if (c16fs2 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(individualMatchInviterFragment, 581));
                return;
            }
            return;
        }
        individualMatchInviterFragment.getClass();
    }

    public static final void onChanged$24(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((IndividualMatchInviterFragment) aObserverS219S0100000_15.l0).SR((Map) obj);
    }

    public static final void onChanged$25(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map map = (Map) obj;
        IndividualMatchInviterFragment individualMatchInviterFragment = (IndividualMatchInviterFragment) aObserverS219S0100000_15.l0;
        C973100bQi c973100bQi = individualMatchInviterFragment.LLIZLLLIL;
        if (c973100bQi != null) {
            C973100bQi.j0(c973100bQi, individualMatchInviterFragment.PR(), map);
        }
    }

    public static final void onChanged$26(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        IndividualMatchInviterFragment individualMatchInviterFragment = (IndividualMatchInviterFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973100bQi c973100bQi = individualMatchInviterFragment.LLIZLLLIL;
        if (c973100bQi != null) {
            c973100bQi.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$27(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((IndividualMatchInviterFragment) aObserverS219S0100000_15.l0).RR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$28(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        IndividualMatchInviterFragment individualMatchInviterFragment = (IndividualMatchInviterFragment) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C16FS c16fs = individualMatchInviterFragment.LLJI;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            C16FS c16fs2 = individualMatchInviterFragment.LLJI;
            if (c16fs2 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(individualMatchInviterFragment, 581));
                return;
            }
            return;
        }
        individualMatchInviterFragment.getClass();
    }

    public static final void onChanged$29(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((IndividualMatchInviterFragment) aObserverS219S0100000_15.l0).SR((Map) obj);
    }

    public static final void onChanged$3(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map map = (Map) obj;
        TeamMatchInviteeFragment teamMatchInviteeFragment = (TeamMatchInviteeFragment) aObserverS219S0100000_15.l0;
        C973070bQf c973070bQf = teamMatchInviteeFragment.LLJILLL;
        if (c973070bQf != null) {
            c973070bQf.n0(true, teamMatchInviteeFragment.LLJJIJIIJIL, teamMatchInviteeFragment.LLJJIJIL, map);
        }
    }

    public static final void onChanged$30(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map map = (Map) obj;
        IndividualMatchInviterFragment individualMatchInviterFragment = (IndividualMatchInviterFragment) aObserverS219S0100000_15.l0;
        C973100bQi c973100bQi = individualMatchInviterFragment.LLIZLLLIL;
        if (c973100bQi != null) {
            C973100bQi.j0(c973100bQi, individualMatchInviterFragment.PR(), map);
        }
    }

    public static final void onChanged$31(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        C986440bmE c986440bmE;
        long jLongValue;
        boolean z4;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData;
        DataChannel dataChannel;
        Long l;
        User owner;
        long jLongValue2;
        C977720bYA c977720bYA = (C977720bYA) obj;
        if (c977720bYA.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inviteSuccess = ");
            sbLIZ.append(c977720bYA);
            C20441214yg.LIZIZ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            C977580bXw c977580bXw = (C977580bXw) aObserverS219S0100000_15.l0;
            MultiInviteResponse multiInviteResponse = c977720bYA.LIZ;
            long id = 0;
            if (c977580bXw.LJFF) {
                if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
                    Long l2 = multiInviteResponse.battleId;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleInviteRequestSuccess: orphan battle detected, battleId=");
                    sbLIZ2.append(jLongValue2);
                    C20441214yg.LJIIL("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
                    C974540bT2.LIZ.LJJLL(jLongValue2);
                    if (jLongValue2 != 0) {
                        c977580bXw.LIZJ(jLongValue2);
                    }
                    C766270U4b.LIZLLL(2131853338);
                    Function2<? super Boolean, ? super Boolean, Unit> function2 = c977580bXw.LJIIJJI;
                    Boolean bool = Boolean.TRUE;
                    function2.invoke(bool, bool);
                }
            } else {
                C986440bmE c986440bmE2 = c977580bXw.LJIILL;
                if (c986440bmE2 != null) {
                    c986440bmE2.LIZJ();
                }
                c977580bXw.LJIILL = null;
                DataChannel dataChannel2 = c977580bXw.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.FALSE, null, null, 6));
                }
                Long l3 = multiInviteResponse.battleId;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = 0;
                }
                C977590bXx c977590bXx = c977580bXw.LJ;
                if (c977590bXx != null) {
                    c977590bXx.LJIILL.setValue(Boolean.FALSE);
                    c977590bXx.LJIL = false;
                    c977590bXx.LJIILIIL.setValue(Boolean.TRUE);
                    Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c977590bXx.LIZ);
                    if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                        id = owner.getId();
                    }
                    long jLIZ = C978480bZO.LIZ(true);
                    if (c977590bXx.LJIJI == jLongValue && (dataChannel = c977590bXx.LIZ) != null && (l = (Long) dataChannel.gg0(BattleInvitingTimeLeftChannel.class)) != null) {
                        jLIZ = l.longValue();
                    }
                    c977590bXx.LJIJI = jLongValue;
                    c977590bXx.LJIIIIZZ(id, true);
                    c977590bXx.LJFF(c977590bXx.LIZ, jLIZ, new AwS69S0100100_15(c977590bXx, jLongValue, 7));
                }
                C977590bXx c977590bXx2 = c977580bXw.LJ;
                if (c977590bXx2 != null && (mutableLiveData = c977590bXx2.LJIIJJI) != null) {
                    mutableLiveData.setValue(multiInviteResponse.leagueInfoMap);
                }
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                if (!multiInviteResponse.leagueInfoMap.isEmpty()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("update league info ");
                    sbLIZ3.append(multiInviteResponse.leagueInfoMap);
                    C20441214yg.LJIIIZ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
                    for (C954460awe c954460awe : listLLILZLL) {
                        c954460awe.LJJIII = multiInviteResponse.leagueInfoMap.get(Long.valueOf(c954460awe.LJ));
                    }
                }
                if (multiInviteResponse.meanwhileInviteScene == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C915980Zwa.LJII().LJJJJLL(multiInviteResponse.leagueInfoMap);
                if (!z4 && multiInviteResponse.battleTeamUser != null) {
                    InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq = c977580bXw.LJIIJ;
                    Long lValueOf = Long.valueOf(jLongValue);
                    EnumC919170a1j enumC919170a1j = c977580bXw.LJIIIIZZ;
                    List<TeamUser> list = multiInviteResponse.battleTeamUser;
                    if (list != null) {
                        interfaceC1631620sYq.invoke(lValueOf, enumC919170a1j, list);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        Throwable th = c977720bYA.LIZIZ;
        if (th != null) {
            boolean z5 = th instanceof C977850bYN;
            if (z5) {
                ((C977580bXw) aObserverS219S0100000_15.l0).LIZJ(((AbstractC977830bYL) th).getBattleId());
            }
            C977580bXw c977580bXw2 = (C977580bXw) aObserverS219S0100000_15.l0;
            if (!c977580bXw2.LJFF) {
                C986440bmE c986440bmE3 = c977580bXw2.LJIILL;
                if (c986440bmE3 != null) {
                    c986440bmE3.LIZLLL(th);
                }
                boolean z6 = th instanceof C501470JlZ;
                if (z6 && ((C501520Jle) th).getErrorCode() == 4029011 && (c986440bmE = c977580bXw2.LJIILL) != null && c986440bmE.LJ()) {
                    C977590bXx c977590bXx3 = c977580bXw2.LJ;
                    if (c977590bXx3 != null) {
                        c977590bXx3.LJIL = false;
                    }
                } else {
                    c977580bXw2.LJIILL = null;
                    C977590bXx c977590bXx4 = c977580bXw2.LJ;
                    if (c977590bXx4 != null) {
                        c977590bXx4.LJIILL.setValue(Boolean.FALSE);
                        c977590bXx4.LJIL = false;
                    }
                    if (z6) {
                        C501470JlZ c501470JlZ = (C501470JlZ) th;
                        if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                            C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                        } else {
                            switch (c501470JlZ.getErrorCode()) {
                                case 4004047:
                                case 4029016:
                                    C766270U4b.LIZLLL(2131853282);
                                    break;
                                case 4029012:
                                    C766270U4b.LIZLLL(2131853281);
                                    break;
                                case 4029013:
                                    C766270U4b.LIZLLL(2131853343);
                                    break;
                                case 4029014:
                                    C766270U4b.LIZLLL(2131853278);
                                    break;
                                case 4029019:
                                    C766270U4b.LIZLLL(2131853342);
                                    break;
                            }
                        }
                        if (c501470JlZ.getErrorCode() == 4004253) {
                            InterfaceC957770b1z interfaceC957770b1z = c977580bXw2.LIZIZ;
                            if (interfaceC957770b1z != null) {
                                interfaceC957770b1z.dismiss();
                            }
                            z2 = false;
                        }
                        z3 = z2;
                        c977580bXw2.LJIIJJI.invoke(Boolean.valueOf(z2), Boolean.valueOf(z3));
                    } else {
                        if (th instanceof C977870bYP) {
                            C766270U4b.LIZLLL(2131843062);
                        } else if (z5) {
                            C766270U4b.LIZLLL(2131852422);
                        } else {
                            C766270U4b.LIZLLL(2131852422);
                        }
                        z2 = true;
                        z3 = false;
                        c977580bXw2.LJIIJJI.invoke(Boolean.valueOf(z2), Boolean.valueOf(z3));
                    }
                    z2 = true;
                    z3 = z2;
                    c977580bXw2.LJIIJJI.invoke(Boolean.valueOf(z2), Boolean.valueOf(z3));
                }
            }
        }
        if (c977720bYA.LIZJ != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cancel success = ");
            sbLIZ4.append(c977720bYA.LIZJ);
            C20441214yg.LIZIZ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ4));
            C977580bXw c977580bXw3 = (C977580bXw) aObserverS219S0100000_15.l0;
            EnumC976510bWD enumC976510bWD = c977720bYA.LIZJ;
            C986440bmE c986440bmE4 = c977580bXw3.LJIILL;
            if (c986440bmE4 != null) {
                c986440bmE4.LIZIZ();
            }
            if (!c977580bXw3.LJFF) {
                DataChannel dataChannel3 = c977580bXw3.LIZLLL;
                if (dataChannel3 != null) {
                    dataChannel3.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
                }
                C977590bXx c977590bXx5 = c977580bXw3.LJ;
                if (c977590bXx5 != null) {
                    c977590bXx5.LJIILL.setValue(Boolean.FALSE);
                }
                c977580bXw3.LJIIL.invoke(enumC976510bWD, Boolean.FALSE);
            }
        }
        if (c977720bYA.LIZLLL != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("cancel failed = ");
            sbLIZ5.append(c977720bYA.LIZLLL);
            C20441214yg.LIZIZ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ5));
            C977580bXw c977580bXw4 = (C977580bXw) aObserverS219S0100000_15.l0;
            Throwable th2 = c977720bYA.LIZLLL;
            C986440bmE c986440bmE5 = c977580bXw4.LJIILL;
            if (c986440bmE5 != null) {
                c986440bmE5.LIZIZ();
            }
            if (!c977580bXw4.LJFF) {
                C977590bXx c977590bXx6 = c977580bXw4.LJ;
                if (c977590bXx6 != null) {
                    c977590bXx6.LJIILL.setValue(Boolean.FALSE);
                }
                if (th2 instanceof C501470JlZ) {
                    C501470JlZ c501470JlZ2 = (C501470JlZ) th2;
                    if (!TextUtils.isEmpty(c501470JlZ2.getPrompt())) {
                        C766270U4b.LJIIJJI(c501470JlZ2.getPrompt());
                    } else if (c501470JlZ2.getErrorCode() == 4004048) {
                        C766270U4b.LIZLLL(2131842762);
                    } else {
                        C766270U4b.LIZLLL(2131852422);
                    }
                    if (c501470JlZ2.getErrorCode() == 4004048) {
                        z = true;
                    }
                    c977580bXw4.LJIILIIL.invoke(Boolean.valueOf(z));
                }
                C766270U4b.LIZLLL(2131852422);
                z = false;
                c977580bXw4.LJIILIIL.invoke(Boolean.valueOf(z));
            }
        }
    }

    public static final void onChanged$32(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) throws Throwable {
        C20441214yg.LIZIZ("LiveMatchScoreBarComponent", "show updateBattleScore");
        C15DF c15df = ((C985780blA) aObserverS219S0100000_15.l0).LLILLL;
        if (c15df != null) {
            c15df.LJJIJIIJIL();
        }
    }

    public static final void onChanged$33(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) throws Throwable {
        C15DF c15df = ((C985780blA) aObserverS219S0100000_15.l0).LLILLL;
        if (c15df != null) {
            c15df.LJJIJIIJIL();
        }
    }

    public static final void onChanged$34(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TeamMatchInviterFragment teamMatchInviterFragment = (TeamMatchInviterFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973070bQf c973070bQf = teamMatchInviterFragment.LLJ;
        if (c973070bQf != null) {
            c973070bQf.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$35(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).UR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$36(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).PR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$37(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).bS((Map) obj);
    }

    public static final void onChanged$38(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).aS((Map) obj);
    }

    public static final void onChanged$39(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TeamMatchInviterFragment teamMatchInviterFragment = (TeamMatchInviterFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973070bQf c973070bQf = teamMatchInviterFragment.LLJ;
        if (c973070bQf != null) {
            c973070bQf.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$4(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TeamMatchInviteeFragment teamMatchInviteeFragment = (TeamMatchInviteeFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973070bQf c973070bQf = teamMatchInviteeFragment.LLJILLL;
        if (c973070bQf != null) {
            c973070bQf.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$40(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).UR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$41(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).PR(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$42(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).bS((Map) obj);
    }

    public static final void onChanged$43(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamMatchInviterFragment) aObserverS219S0100000_15.l0).aS((Map) obj);
    }

    public static final void onChanged$44(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        ViewParent parent;
        String strLJIJI;
        C936030aSv c936030aSv = (C936030aSv) obj;
        if (c936030aSv != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startCreateAvatar state:");
            sbLIZ.append(c936030aSv);
            C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", C2188811AlT.LIZIZ(sbLIZ));
            ((MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0).LLJJJJ = c936030aSv;
            int i = C936040aSw.LIZ[c936030aSv.LIZIZ.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C20515815Po c20515815Po = ((MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0).LLIZLLLIL;
                        if (c20515815Po != null) {
                            c20515815Po.setProgress(c936030aSv.LIZJ);
                        }
                        C16F5 c16f5 = ((MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0).LLJ;
                        if (c16f5 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(c936030aSv.LIZJ);
                            sbLIZ2.append('%');
                            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                if (c936030aSv.LIZ.LIZ()) {
                    MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0;
                    View view = multiGuestCreateAvatarFragment.LLILZIL;
                    if (view != null) {
                        C12ES.LJIILL(0, view);
                    }
                    View view2 = multiGuestCreateAvatarFragment.LLILZLL;
                    if (view2 != null) {
                        C12ES.LJIILL(0, view2);
                    }
                    C20515815Po c20515815Po2 = multiGuestCreateAvatarFragment.LLIZLLLIL;
                    if (c20515815Po2 != null) {
                        C439101nJ.LJI(c20515815Po2);
                    }
                    C16F5 c16f52 = multiGuestCreateAvatarFragment.LLJ;
                    if (c16f52 != null) {
                        C439101nJ.LJI(c16f52);
                    }
                    C16F5 c16f53 = multiGuestCreateAvatarFragment.LLJI;
                    if (c16f53 != null) {
                        C12ES.LJIILL(0, c16f53);
                        c16f53.setText(C497740JfY.LJIJI(2131852821));
                    }
                    LiveIconView liveIconView = multiGuestCreateAvatarFragment.LLIZ;
                    if (liveIconView == null) {
                        return;
                    }
                    C12ES.LJIILL(0, liveIconView);
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.cpl, liveIconView.getContext()));
                    return;
                }
                MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment2 = (MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0;
                Avatar avatar = c936030aSv.LIZLLL;
                if (avatar == null || avatar.status != 3) {
                    z = false;
                }
                View view3 = multiGuestCreateAvatarFragment2.LLILZIL;
                if (view3 != null) {
                    C12ES.LJIILL(0, view3);
                }
                View view4 = multiGuestCreateAvatarFragment2.LLILZLL;
                if (view4 != null) {
                    C12ES.LJIILL(0, view4);
                }
                C16FS c16fs = multiGuestCreateAvatarFragment2.LL;
                if (c16fs != null) {
                    C12ES.LJIILL(4, c16fs);
                }
                C16FS c16fs2 = multiGuestCreateAvatarFragment2.LLILLJJLI;
                if (c16fs2 != null) {
                    C12ES.LJIILL(0, c16fs2);
                }
                C20515815Po c20515815Po3 = multiGuestCreateAvatarFragment2.LLIZLLLIL;
                if (c20515815Po3 != null) {
                    C439101nJ.LJI(c20515815Po3);
                }
                C16F5 c16f54 = multiGuestCreateAvatarFragment2.LLJ;
                if (c16f54 != null) {
                    C439101nJ.LJI(c16f54);
                }
                C16F5 c16f55 = multiGuestCreateAvatarFragment2.LLJI;
                if (c16f55 != null) {
                    C12ES.LJIILL(0, c16f55);
                    if (z) {
                        strLJIJI = C497740JfY.LJIJI(2131852820);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131852821);
                    }
                    c16f55.setText(strLJIJI);
                }
                LiveIconView liveIconView2 = multiGuestCreateAvatarFragment2.LLIZ;
                if (liveIconView2 == null) {
                    return;
                }
                C12ES.LJIILL(0, liveIconView2);
                liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.dn7, liveIconView2.getContext()));
                return;
            }
            MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment3 = (MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0;
            Avatar avatar2 = c936030aSv.LIZLLL;
            View view5 = multiGuestCreateAvatarFragment3.LLILZIL;
            if (view5 != null) {
                C439101nJ.LJI(view5);
            }
            C19MB c19mb = new C19MB();
            View view6 = multiGuestCreateAvatarFragment3.LLJIJIL;
            if (view6 != null && (parent = view6.getParent()) != null && (parent instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                c19mb.LJII(constraintLayout);
                c19mb.LJFF(view6.getId());
                c19mb.LJIIIIZZ(view6.getId(), 6, 0, 6);
                c19mb.LJIIIIZZ(view6.getId(), 7, 0, 7);
                c19mb.LJIIIIZZ(view6.getId(), 3, R.id.bkq, 3);
                c19mb.LJIIIIZZ(view6.getId(), 4, R.id.bkq, 4);
                c19mb.LIZIZ(constraintLayout);
            }
            if (avatar2 != null && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null) {
                C930480aJy.LIZ.getClass();
                C758340Tou c758340TouLJI = C930480aJy.LJI(multiGuestDataHolderLIZJ, false, false, 1);
                C936050aSx c936050aSx = new C936050aSx(avatar2);
                EnumC773090UUh.PREVIEW.getValue();
                Object objCreateVirtualAvatarView = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createVirtualAvatarView(multiGuestCreateAvatarFragment3.getContext(), c758340TouLJI, multiGuestCreateAvatarFragment3.dataChannel, c936050aSx);
                if (objCreateVirtualAvatarView != null && (objCreateVirtualAvatarView instanceof View)) {
                    View view7 = (View) objCreateVirtualAvatarView;
                    view7.setId(R.id.bky);
                    C1319900kS4 c1319900kS4 = multiGuestCreateAvatarFragment3.LLILLL;
                    if (c1319900kS4 != null) {
                        c1319900kS4.addView(view7, new C19ME(-1, -1));
                    }
                    C19MB c19mb2 = new C19MB();
                    c19mb2.LJII(multiGuestCreateAvatarFragment3.LLILLL);
                    c19mb2.LJIIIIZZ(R.id.bky, 3, 0, 3);
                    c19mb2.LJIIIIZZ(R.id.bky, 6, 0, 6);
                    c19mb2.LIZIZ(multiGuestCreateAvatarFragment3.LLILLL);
                }
            }
            if (C930540aK4.LJ()) {
                C16FS c16fs3 = ((MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0).LL;
                if (c16fs3 == null) {
                    return;
                }
                c16fs3.setText(C497740JfY.LJIJI(2131852813));
                return;
            }
            C16FS c16fs4 = ((MultiGuestCreateAvatarFragment) aObserverS219S0100000_15.l0).LL;
            if (c16fs4 == null) {
                return;
            }
            c16fs4.setText(C497740JfY.LJIJI(2131852823));
        }
    }

    public static final void onChanged$45(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean z;
        List<MultiGuestRecommendRoomInfo> list = (List) obj;
        if (list != null) {
            MultiGuestLinkMicMatchFragmentA multiGuestLinkMicMatchFragmentA = (MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0;
            multiGuestLinkMicMatchFragmentA.roomList = list;
            multiGuestLinkMicMatchFragmentA.currentIndex = 0;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = multiGuestLinkMicMatchFragmentA.viewModel;
            if ((multiGuestLinkMicMatchViewModel == null || multiGuestLinkMicMatchViewModel.LLILZLL == null) && !LiveMultiGuestGoLiveEntranceSetting.INSTANCE.hasEntrance()) {
                ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).kS();
            } else {
                MultiGuestLinkMicMatchFragmentA multiGuestLinkMicMatchFragmentA2 = (MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0;
                MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = multiGuestLinkMicMatchFragmentA2.viewModel;
                if (multiGuestLinkMicMatchViewModel2 != null && multiGuestLinkMicMatchViewModel2.LLILZLL != null) {
                    z = true;
                } else {
                    z = false;
                }
                multiGuestLinkMicMatchFragmentA2.iS(false, z);
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).stateView;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LIZLLL();
            }
            C16FS c16fs = ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
        }
    }

    public static final void onChanged$46(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).stateView;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJFF();
            }
            C16FS c16fs = ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
        }
    }

    public static final void onChanged$47(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List<Long> list = (List) obj;
        C16FS c16fs = ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        MultiGuestLinkMicMatchFragmentA multiGuestLinkMicMatchFragmentA = (MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0;
        if (multiGuestLinkMicMatchFragmentA.jumpType == 0) {
            multiGuestLinkMicMatchFragmentA.ZR(list);
        } else {
            multiGuestLinkMicMatchFragmentA.aS(list);
        }
    }

    public static final void onChanged$48(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854192));
            C942580adU.LJIIJ(C497740JfY.LJIJI(2131854192));
        }
        C16FS c16fs = ((MultiGuestLinkMicMatchFragmentA) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
    }

    public static final void onChanged$49(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List<MultiGuestRecommendRoomInfo> list = (List) obj;
        if (list != null) {
            MultiGuestLinkMicMatchFragmentAuto multiGuestLinkMicMatchFragmentAuto = (MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0;
            multiGuestLinkMicMatchFragmentAuto.roomList = list;
            boolean z = false;
            multiGuestLinkMicMatchFragmentAuto.currentIndex = 0;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = multiGuestLinkMicMatchFragmentAuto.viewModel;
            LiveGuideCard liveGuideCard = null;
            if ((multiGuestLinkMicMatchViewModel == null || multiGuestLinkMicMatchViewModel.LLILZLL == null) && !LiveMultiGuestGoLiveEntranceSetting.INSTANCE.hasEntrance()) {
                ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).kS();
            } else {
                MultiGuestLinkMicMatchFragmentAuto multiGuestLinkMicMatchFragmentAuto2 = (MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0;
                MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = multiGuestLinkMicMatchFragmentAuto2.viewModel;
                if (multiGuestLinkMicMatchViewModel2 != null) {
                    liveGuideCard = multiGuestLinkMicMatchViewModel2.LLILZLL;
                }
                if (liveGuideCard != null) {
                    z = true;
                }
                multiGuestLinkMicMatchFragmentAuto2.iS(true, z);
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).stateView;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LIZLLL();
            }
            C16FS c16fs = ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$5(Y.AObserverS219S0100000_15 r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS219S0100000_15.onChanged$5(Y.AObserverS219S0100000_15, java.lang.Object):void");
    }

    public static final void onChanged$50(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).stateView;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJFF();
            }
            C16FS c16fs = ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
        }
    }

    public static final void onChanged$51(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List<Long> list = (List) obj;
        MultiGuestLinkMicMatchFragmentAuto multiGuestLinkMicMatchFragmentAuto = (MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0;
        if (multiGuestLinkMicMatchFragmentAuto.jumpType == 0) {
            multiGuestLinkMicMatchFragmentAuto.ZR(list);
        } else {
            multiGuestLinkMicMatchFragmentAuto.aS(list);
        }
        C16FS c16fs = ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
    }

    public static final void onChanged$52(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854192));
            C942580adU.LJIIJ(C497740JfY.LJIJI(2131854192));
        }
        C16FS c16fs = ((MultiGuestLinkMicMatchFragmentAuto) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
    }

    public static final void onChanged$53(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean z;
        List<MultiGuestRecommendRoomInfo> list = (List) obj;
        if (list != null) {
            MultiGuestLinkMicMatchFragmentB multiGuestLinkMicMatchFragmentB = (MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0;
            multiGuestLinkMicMatchFragmentB.roomList = list;
            multiGuestLinkMicMatchFragmentB.currentIndex = 0;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = multiGuestLinkMicMatchFragmentB.viewModel;
            if ((multiGuestLinkMicMatchViewModel == null || multiGuestLinkMicMatchViewModel.LLILZLL == null) && !LiveMultiGuestGoLiveEntranceSetting.INSTANCE.hasEntrance()) {
                ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).kS();
            } else {
                MultiGuestLinkMicMatchFragmentB multiGuestLinkMicMatchFragmentB2 = (MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0;
                MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = multiGuestLinkMicMatchFragmentB2.viewModel;
                if (multiGuestLinkMicMatchViewModel2 != null && multiGuestLinkMicMatchViewModel2.LLILZLL != null) {
                    z = true;
                } else {
                    z = false;
                }
                multiGuestLinkMicMatchFragmentB2.iS(false, z);
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).stateView;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LIZLLL();
            }
            C16FS c16fs = ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
        }
    }

    public static final void onChanged$54(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).stateView;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJFF();
            }
            C16FS c16fs = ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
        }
    }

    public static final void onChanged$55(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List<Long> list = (List) obj;
        C16FS c16fs = ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        MultiGuestLinkMicMatchFragmentB multiGuestLinkMicMatchFragmentB = (MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0;
        if (multiGuestLinkMicMatchFragmentB.jumpType == 0) {
            multiGuestLinkMicMatchFragmentB.ZR(list);
        } else {
            multiGuestLinkMicMatchFragmentB.aS(list);
        }
    }

    public static final void onChanged$56(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854192));
            C942580adU.LJIIJ(C497740JfY.LJIJI(2131854192));
        }
        C16FS c16fs = ((MultiGuestLinkMicMatchFragmentB) aObserverS219S0100000_15.l0).btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
    }

    public static final void onChanged$57(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((CatchBeansInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$58(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((CatchBeansInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$59(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        CatchBeansInviteeFragment catchBeansInviteeFragment = (CatchBeansInviteeFragment) aObserverS219S0100000_15.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C500260Jjc.LJIILIIL(catchBeansInviteeFragment.LLJIJIL);
            C500260Jjc.LJIILIIL(catchBeansInviteeFragment.LLJI);
            C500260Jjc.LLFFF(catchBeansInviteeFragment.LLJILJIL);
        } else {
            C500260Jjc.LLFFF(catchBeansInviteeFragment.LLJIJIL);
            C500260Jjc.LLFFF(catchBeansInviteeFragment.LLJI);
            C500260Jjc.LJIILIIL(catchBeansInviteeFragment.LLJILJIL);
        }
        C978980baC c978980baC = catchBeansInviteeFragment.LLILZIL;
        if (c978980baC != null) {
            c978980baC.LJIIIIZZ = zBooleanValue;
        }
    }

    public static final void onChanged$6(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamPairInviteeCohostRoomFragment) aObserverS219S0100000_15.l0).zS();
    }

    public static final void onChanged$60(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List list;
        MutableLiveData mutableLiveData;
        Map map = (Map) obj;
        CatchBeansInviteeFragment catchBeansInviteeFragment = (CatchBeansInviteeFragment) aObserverS219S0100000_15.l0;
        C985250bkJ c985250bkJ = catchBeansInviteeFragment.LLJ;
        if (c985250bkJ != null) {
            C981800bek c981800bek = catchBeansInviteeFragment.LLILZ;
            if (c981800bek != null && (mutableLiveData = c981800bek.LIZLLL) != null) {
                list = (List) mutableLiveData.getValue();
            } else {
                list = null;
            }
            c985250bkJ.e0(false, list, map);
        }
    }

    public static final void onChanged$61(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        CatchBeansInviteeFragment catchBeansInviteeFragment = (CatchBeansInviteeFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C16FS c16fs = catchBeansInviteeFragment.LLJIJIL;
        if (c16fs != null) {
            c16fs.setText(catchBeansInviteeFragment.getString(2131851553, Long.valueOf(jLongValue)));
        }
        C985250bkJ c985250bkJ = catchBeansInviteeFragment.LLJ;
        if (c985250bkJ != null) {
            for (C985260bkK c985260bkK : c985250bkJ.LL) {
                if (c985260bkK != null) {
                    c985260bkK.setCountdown(jLongValue);
                }
            }
        }
    }

    public static final void onChanged$62(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((MatchOptionViewModel) aObserverS219S0100000_15.l0).yQ2();
    }

    public static final void onChanged$63(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C976770bWd c976770bWd = (C976770bWd) obj;
        if (c976770bWd.LIZ != null) {
            ((C976110bVZ) aObserverS219S0100000_15.l0).LJIILJJIL();
            LinkDialog linkDialog = ((C976110bVZ) aObserverS219S0100000_15.l0).LIZJ;
            if (linkDialog != null) {
                linkDialog.dismiss();
            }
        }
        Throwable th = c976770bWd.LIZIZ;
        if (th != null) {
            ((C976110bVZ) aObserverS219S0100000_15.l0).LIZJ(th);
        }
        EnumC976390bW1 enumC976390bW1 = c976770bWd.LIZJ;
        if (enumC976390bW1 != null) {
            C976110bVZ c976110bVZ = (C976110bVZ) aObserverS219S0100000_15.l0;
            if (!c976110bVZ.LJFF) {
                C976120bVa c976120bVa = c976110bVZ.LJ;
                if (c976120bVa != null) {
                    c976120bVa.LJIILLIIL.setValue(Boolean.TRUE);
                }
                c976110bVZ.LJIIL.invoke(enumC976390bW1);
            }
        }
        EnumC976390bW1 enumC976390bW12 = c976770bWd.LIZLLL;
        if (enumC976390bW12 != null) {
            C976110bVZ c976110bVZ2 = (C976110bVZ) aObserverS219S0100000_15.l0;
            if (!c976110bVZ2.LJFF) {
                C976120bVa c976120bVa2 = c976110bVZ2.LJ;
                if (c976120bVa2 != null) {
                    c976120bVa2.LJIILLIIL.setValue(Boolean.TRUE);
                }
                c976110bVZ2.LJIILIIL.invoke(enumC976390bW12);
            }
        }
    }

    public static final void onChanged$64(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C976770bWd c976770bWd = (C976770bWd) obj;
        if (c976770bWd.LIZ != null) {
            ((C976110bVZ) aObserverS219S0100000_15.l0).LJIILJJIL();
        }
        Throwable th = c976770bWd.LIZIZ;
        if (th != null) {
            ((C976110bVZ) aObserverS219S0100000_15.l0).LIZJ(th);
        }
        EnumC976390bW1 enumC976390bW1 = c976770bWd.LIZJ;
        if (enumC976390bW1 != null) {
            C976110bVZ c976110bVZ = (C976110bVZ) aObserverS219S0100000_15.l0;
            if (!c976110bVZ.LJFF) {
                C976120bVa c976120bVa = c976110bVZ.LJ;
                if (c976120bVa != null) {
                    c976120bVa.LJIILLIIL.setValue(Boolean.TRUE);
                }
                c976110bVZ.LJIIL.invoke(enumC976390bW1);
            }
        }
        EnumC976390bW1 enumC976390bW12 = c976770bWd.LIZLLL;
        if (enumC976390bW12 != null) {
            C976110bVZ c976110bVZ2 = (C976110bVZ) aObserverS219S0100000_15.l0;
            if (!c976110bVZ2.LJFF) {
                C976120bVa c976120bVa2 = c976110bVZ2.LJ;
                if (c976120bVa2 != null) {
                    c976120bVa2.LJIILLIIL.setValue(Boolean.TRUE);
                }
                c976110bVZ2.LJIILIIL.invoke(enumC976390bW12);
            }
        }
    }

    public static final void onChanged$65(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Pair pair = (Pair) obj;
        ((LetsDanceBaseWidget) aObserverS219S0100000_15.l0).A1((EnumC947440alK) pair.getFirst(), (EnumC947440alK) pair.getSecond());
    }

    public static final void onChanged$66(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Long l = (Long) obj;
        C985250bkJ c985250bkJ = ((CatchBeansInviterFragment) aObserverS219S0100000_15.l0).LLILZIL;
        if (c985250bkJ != null) {
            long jLongValue = l.longValue();
            for (C985260bkK c985260bkK : c985250bkJ.LL) {
                if (c985260bkK != null) {
                    c985260bkK.setCountdown(jLongValue);
                }
            }
        }
    }

    public static final void onChanged$67(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        CatchBeansInviterFragment catchBeansInviterFragment = (CatchBeansInviterFragment) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C16FS c16fs = catchBeansInviterFragment.LLILZLL;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = catchBeansInviterFragment.LLILZLL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs3 = catchBeansInviterFragment.LLILZLL;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = catchBeansInviterFragment.LLILZLL;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    public static final void onChanged$68(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        CatchBeansInviterFragment catchBeansInviterFragment = (CatchBeansInviterFragment) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C985250bkJ c985250bkJ = catchBeansInviterFragment.LLILZIL;
            if (c985250bkJ != null) {
                c985250bkJ.setCountdownVisibility(true);
            }
            C16FS c16fs = catchBeansInviterFragment.LLILZLL;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            C16FS c16fs2 = catchBeansInviterFragment.LLILZLL;
            if (c16fs2 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(catchBeansInviterFragment, 868));
                return;
            }
            return;
        }
        catchBeansInviterFragment.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$69(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean zBooleanValue;
        List list;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        Boolean bool;
        Map map = (Map) obj;
        CatchBeansInviterFragment catchBeansInviterFragment = (CatchBeansInviterFragment) aObserverS219S0100000_15.l0;
        C981850bep c981850bep = catchBeansInviterFragment.LLILZ;
        if (c981850bep != null && (mutableLiveData2 = c981850bep.LJIIJ) != null && (bool = (Boolean) mutableLiveData2.getValue()) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C985250bkJ c985250bkJ = catchBeansInviterFragment.LLILZIL;
        if (c985250bkJ != null) {
            C981850bep c981850bep2 = catchBeansInviterFragment.LLILZ;
            if (c981850bep2 != null && (mutableLiveData = c981850bep2.LIZLLL) != null) {
                list = (List) mutableLiveData.getValue();
            } else {
                list = null;
            }
            c985250bkJ.e0(!zBooleanValue, list, map);
        }
    }

    public static final void onChanged$7(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamPairInviteeCohostRoomFragment) aObserverS219S0100000_15.l0).zS();
    }

    public static final void onChanged$70(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TwoMatchInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$71(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TwoMatchInviteeFragment) aObserverS219S0100000_15.l0).RR();
    }

    public static final void onChanged$72(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TwoMatchInviteeFragment twoMatchInviteeFragment = (TwoMatchInviteeFragment) aObserverS219S0100000_15.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C978980baC c978980baC = twoMatchInviteeFragment.LLILZLL;
        if (c978980baC != null) {
            c978980baC.LJIIIIZZ = zBooleanValue;
        }
    }

    public static final void onChanged$73(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        List list;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData;
        MutableLiveData mutableLiveData2;
        Map map = (Map) obj;
        TwoMatchInviteeFragment twoMatchInviteeFragment = (TwoMatchInviteeFragment) aObserverS219S0100000_15.l0;
        C973100bQi c973100bQi = twoMatchInviteeFragment.LLJILJILJ;
        if (c973100bQi != null) {
            C976120bVa c976120bVa = twoMatchInviteeFragment.LLILZ;
            Map<Long, GiftGalleryBadgeInfo> value = null;
            if (c976120bVa != null && (mutableLiveData2 = c976120bVa.LIZJ) != null) {
                list = (List) mutableLiveData2.getValue();
            } else {
                list = null;
            }
            C976120bVa c976120bVa2 = twoMatchInviteeFragment.LLILZ;
            if (c976120bVa2 != null && (mutableLiveData = c976120bVa2.LJIIJJI) != null) {
                value = mutableLiveData.getValue();
            }
            c973100bQi.l0(map, value, list, true, false);
        }
    }

    public static final void onChanged$74(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TwoMatchInviteeFragment twoMatchInviteeFragment = (TwoMatchInviteeFragment) aObserverS219S0100000_15.l0;
        long jLongValue = ((Long) obj).longValue();
        C973100bQi c973100bQi = twoMatchInviteeFragment.LLJILJILJ;
        if (c973100bQi != null) {
            c973100bQi.setCountdown(jLongValue);
        }
    }

    public static final void onChanged$75(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        boolean z = true;
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        CombinedMatchInviterFragment combinedMatchInviterFragment = (CombinedMatchInviterFragment) aObserverS219S0100000_15.l0;
        if (!((Boolean) obj).booleanValue() || size >= 2) {
            z = false;
        }
        combinedMatchInviterFragment.LLJJIJI = z;
    }

    public static final void onChanged$76(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) throws JSONException {
        Long lValueOf;
        Object obj2;
        C978110bYn c978110bYn = (C978110bYn) obj;
        if (((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivePlaybookInfoChange, id=");
            if (c978110bYn != null) {
                lValueOf = Long.valueOf(c978110bYn.LIZ);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            if (c978110bYn != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", c978110bYn.LIZIZ);
                jSONObject2.put("cover_image_url", c978110bYn.LIZJ);
                obj2 = jSONObject2;
            } else {
                obj2 = JSONObject.NULL;
            }
            C978090bYl.LIZLLL("live.match.updateActivePlaybookInfo", jSONObject.put("active_playbook_info", obj2));
        }
    }

    public static final void onChanged$77(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        EnumC977690bY7 enumC977690bY7 = (EnumC977690bY7) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uiInviteButtonStatus, newStatus: ");
        sbLIZ.append(enumC977690bY7);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL != null) {
            C978090bYl.LIZLLL("live.match.inviterPanelUpdateUI", new JSONObject().put("invite_status", enumC977690bY7.ordinal()));
        }
    }

    public static final void onChanged$78(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C978120bYo c978120bYo = (C978120bYo) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uiDisableState, newState: ");
        sbLIZ.append(c978120bYo);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL != null) {
            C978090bYl.LIZLLL("live.match.inviterPanelUpdateUI", new JSONObject().put("disable_team_pair", c978120bYo.LIZ).put("disable_all", c978120bYo.LIZIZ));
        }
    }

    public static final void onChanged$79(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map map = (Map) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostAcceptStatuses, newStatuses: ");
        sbLIZ.append(map);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onHostAcceptStatusChange, hostAcceptStatuses: ");
            sbLIZ2.append(map);
            C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", C2188811AlT.LIZIZ(sbLIZ2));
            C978090bYl.LIZLLL("live.match.inviterPanelUpdateUI", new JSONObject().put("accepted_uids", C978090bYl.LIZ(map)));
        }
    }

    public static final void onChanged$8(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((TeamPairInviteeCohostRoomFragment) aObserverS219S0100000_15.l0).wS(((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146 A[PHI: r1
      0x0146: PHI (r1v14 java.lang.Integer) = (r1v13 java.lang.Integer), (r1v16 java.lang.Integer) binds: [B:47:0x0143, B:37:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$80(Y.AObserverS219S0100000_15 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS219S0100000_15.onChanged$80(Y.AObserverS219S0100000_15, java.lang.Object):void");
    }

    public static final void onChanged$81(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) throws JSONException {
        Map map = (Map) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leagueInfoMap, newMap: ");
        sbLIZ.append(map);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put(String.valueOf(((Number) entry.getKey()).longValue()), C978090bYl.LIZIZ((GiftGalleryBadgeInfo) entry.getValue()));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBadgeInfoChange, badgeInfo: ");
            sbLIZ2.append(jSONObject);
            C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", C2188811AlT.LIZIZ(sbLIZ2));
            C978090bYl.LIZLLL("live.match.inviterPanelUpdateUI", new JSONObject().put("badge_info", jSONObject));
        }
    }

    public static final void onChanged$82(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C977740bYC c977740bYC = (C977740bYC) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panelTitle, newTitle: ");
        sbLIZ.append(c977740bYC);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        C978090bYl c978090bYl = ((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL;
        if (c978090bYl != null) {
            C428750GrZ c428750GrZ = c978090bYl.LLILZ;
            if (c428750GrZ != null) {
                c428750GrZ.setTitle(c977740bYC.LIZ);
            }
            C428750GrZ c428750GrZ2 = c978090bYl.LLILZ;
            if (c428750GrZ2 != null) {
                c428750GrZ2.setTitlePosition(c977740bYC.LIZIZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$83(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) throws JSONException {
        EnumC977690bY7 enumC977690bY7;
        int iOrdinal;
        MediatorLiveData mediatorLiveData;
        Long l = (Long) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inviteCountdown, newCountdown: ");
        sbLIZ.append(l);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZIL != null) {
            long jLongValue = l.longValue();
            C977630bY1 c977630bY1 = ((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).LLILZ;
            if (c977630bY1 != null && (mediatorLiveData = c977630bY1.LJIJJ) != null) {
                enumC977690bY7 = (EnumC977690bY7) mediatorLiveData.getValue();
            } else {
                enumC977690bY7 = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInviteCountdownChange, countdown: ");
            sbLIZ2.append(jLongValue);
            sbLIZ2.append(", state: ");
            sbLIZ2.append(enumC977690bY7);
            C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", C2188811AlT.LIZIZ(sbLIZ2));
            JSONObject jSONObjectPut = new JSONObject().put("countdown_end_time", String.valueOf((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + jLongValue));
            if (enumC977690bY7 != null) {
                iOrdinal = enumC977690bY7.ordinal();
            } else {
                iOrdinal = 0;
            }
            C978090bYl.LIZLLL("live.match.inviterPanelUpdateUI", jSONObjectPut.put("invite_status", iOrdinal));
        }
    }

    public static final void onChanged$84(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list;
        C954460awe c954460awePrevious;
        C754570Tip c754570Tip;
        Boolean bool = (Boolean) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("teamPairCancelDialogShow, newShow: ");
        sbLIZ.append(bool);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (bool.booleanValue()) {
            CombinedMatchInviterFragment combinedMatchInviterFragment = (CombinedMatchInviterFragment) aObserverS219S0100000_15.l0;
            combinedMatchInviterFragment.getClass();
            C013C c013c = new C013C();
            Context context = combinedMatchInviterFragment.getContext();
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                C985403tE.LIZ(c1397580mTM, new AwS381S0200000_15(c013c, combinedMatchInviterFragment, 127));
                c1397580mTM.LJI(C497740JfY.LJIJI(2131856747));
                Object[] objArr = new Object[1];
                C977630bY1 c977630bY1 = combinedMatchInviterFragment.LLILZ;
                String str = null;
                if (c977630bY1 != null && (mutableLiveData = c977630bY1.LJFF) != null && (value = mutableLiveData.getValue()) != null && (list = value.get(Boolean.TRUE)) != null) {
                    ListIterator<C954460awe> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c954460awePrevious = listIterator.previous();
                            if (c954460awePrevious.LJ != C950220apo.LJFF()) {
                                break;
                            }
                        } else {
                            c954460awePrevious = null;
                            break;
                        }
                    }
                    C954460awe c954460awe = c954460awePrevious;
                    if (c954460awe != null && (c754570Tip = c954460awe.LJIJJ) != null) {
                        str = c754570Tip.LIZIZ;
                    }
                }
                objArr[0] = str;
                c1397580mTM.LIZIZ(C497740JfY.LJIJJ(2131856744, objArr));
                c1397580mTM.LJIIIIZZ = true;
                c1397580mTM.LJII = false;
                c1397580mTM.LIZLLL(new AwS381S0200000_15(c013c, combinedMatchInviterFragment, 128));
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                combinedMatchInviterFragment.LLJILJILJ = c1397510mTF;
                c1397510mTF.LIZLLL();
                C973660bRc.LIZ.LJJLIIIJJIZ();
            }
        }
    }

    public static final void onChanged$85(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Boolean bool = (Boolean) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchInviteCancelDialogShow, newShow: ");
        sbLIZ.append(bool);
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (bool.booleanValue()) {
            ((CombinedMatchInviterFragment) aObserverS219S0100000_15.l0).PR();
        }
    }

    public static final void onChanged$86(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C977820bYK c977820bYK = (C977820bYK) obj;
        C1117360fBO c1117360fBO = ((TwoMatchInviterFragmentV2) aObserverS219S0100000_15.l0).LLJ;
        c1117360fBO.LL = c977820bYK.LIZ;
        int i = c977820bYK.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1117360fBO.notifyItemRangeRemoved(c977820bYK.LIZJ, c977820bYK.LIZLLL);
                    }
                } else {
                    c1117360fBO.notifyItemRangeInserted(c977820bYK.LIZJ, c977820bYK.LIZLLL);
                }
            } else {
                c1117360fBO.notifyItemChanged(c977820bYK.LIZJ);
            }
        } else {
            c1117360fBO.notifyDataSetChanged();
        }
        DataChannel dataChannel = ((TwoMatchInviterFragmentV2) aObserverS219S0100000_15.l0).LLJJ;
        if (dataChannel != null) {
            dataChannel.FQ2(PlaybookBizDataChanged.class);
        }
    }

    public static final void onChanged$87(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == -1) {
                TwoMatchInviterFragmentV2 twoMatchInviterFragmentV2 = (TwoMatchInviterFragmentV2) aObserverS219S0100000_15.l0;
                C0R9K.LIZ(twoMatchInviterFragmentV2.LLIZLLLIL, new ARunnableS115S0100000_15(twoMatchInviterFragmentV2, 179));
                return;
            } else if (num.intValue() == 0) {
                return;
            }
        }
        TwoMatchInviterFragmentV2 twoMatchInviterFragmentV22 = (TwoMatchInviterFragmentV2) aObserverS219S0100000_15.l0;
        twoMatchInviterFragmentV22.LL.uC(twoMatchInviterFragmentV22.LLILZIL, num.intValue());
        ((TwoMatchInviterFragmentV2) aObserverS219S0100000_15.l0).LLILZIL = num.intValue();
    }

    public static final void onChanged$88(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
            if (c979520bb4 != null) {
                c979520bb4.LIZIZ = 3;
            }
        } else {
            C979520bb4 c979520bb42 = c979480bb0.LJIILIIL;
            if (c979520bb42 != null) {
                c979520bb42.LIZIZ = 4;
            }
        }
        C979490bb1 c979490bb1 = c979480bb0.LJIIL;
        if (c979490bb1 != null) {
            c979490bb1.R5();
        }
    }

    public static final void onChanged$89(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Boolean bool = (Boolean) obj;
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        if (bool.booleanValue()) {
            C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
            if (c979520bb4 != null) {
                c979520bb4.LIZIZ = 5;
            }
            C979490bb1 c979490bb1 = c979480bb0.LJIIL;
            if (c979490bb1 != null) {
                c979490bb1.R5();
            }
        } else {
            c979480bb0.getClass();
        }
        ((C979480bb0) aObserverS219S0100000_15.l0).LJ.invoke(bool);
    }

    public static final void onChanged$9(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Set setKeySet;
        Map<Long, LeagueScoreInfo> map;
        Map map2 = (Map) obj;
        if (map2 != null && (setKeySet = map2.keySet()) != null) {
            TeamPairInviteeCohostRoomFragment teamPairInviteeCohostRoomFragment = (TeamPairInviteeCohostRoomFragment) aObserverS219S0100000_15.l0;
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                Boolean bool = (Boolean) map2.get(Long.valueOf(jLongValue));
                if (bool != null) {
                    teamPairInviteeCohostRoomFragment.LLLFZ.put(Long.valueOf(jLongValue), Boolean.valueOf(bool.booleanValue()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hostAcceptStatuses acceptStatuses.value: ");
                sbLIZ.append(teamPairInviteeCohostRoomFragment.LLLFZ);
                sbLIZ.append('}');
                C20441214yg.LIZIZ("TeamPairInviteeSingRoomFragment", C2188811AlT.LIZIZ(sbLIZ));
                C973070bQf c973070bQf = teamPairInviteeCohostRoomFragment.LLJLLL;
                if (c973070bQf != null) {
                    List<BattleUserInfoWrapper> list = teamPairInviteeCohostRoomFragment.LLLFF;
                    List<BattleUserInfoWrapper> list2 = teamPairInviteeCohostRoomFragment.LLLFFI;
                    Map<Long, Boolean> map3 = teamPairInviteeCohostRoomFragment.LLLFZ;
                    LinkMicBattleMessage linkMicBattleMessage = teamPairInviteeCohostRoomFragment.LLLF;
                    Map<Long, GiftGalleryBadgeInfo> map4 = null;
                    if (linkMicBattleMessage != null) {
                        map4 = linkMicBattleMessage.leagueInfoMap;
                        map = linkMicBattleMessage.leagueScoreInfoMap;
                    } else {
                        map = null;
                    }
                    c973070bQf.l0(list, list2, map4, map, map3);
                }
            }
        }
    }

    public static final void onChanged$90(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map<Long, Boolean> map = (Map) obj;
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
        if (c979520bb4 != null) {
            c979520bb4.LIZJ = map;
        }
        C979490bb1 c979490bb1 = c979480bb0.LJIIL;
        if (c979490bb1 != null) {
            c979490bb1.S5();
        }
        ((C979480bb0) aObserverS219S0100000_15.l0).LJIIIZ(map);
    }

    public static final void onChanged$91(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map<Long, GiftGalleryBadgeInfo> map = (Map) obj;
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
        if (c979520bb4 != null) {
            c979520bb4.LIZLLL = map;
        }
        C979490bb1 c979490bb1 = c979480bb0.LJIIL;
        if (c979490bb1 != null) {
            c979490bb1.S5();
        }
    }

    public static final void onChanged$92(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((C979480bb0) aObserverS219S0100000_15.l0).LJIIL(((Long) obj).longValue());
    }

    public static final void onChanged$93(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
            if (c979520bb4 != null) {
                c979520bb4.LIZIZ = 3;
            }
        } else {
            C979520bb4 c979520bb42 = c979480bb0.LJIILIIL;
            if (c979520bb42 != null) {
                c979520bb42.LIZIZ = 4;
            }
        }
        C979490bb1 c979490bb1 = c979480bb0.LJIIL;
        if (c979490bb1 != null) {
            c979490bb1.R5();
        }
    }

    public static final void onChanged$94(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Boolean bool = (Boolean) obj;
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        if (bool.booleanValue()) {
            C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
            if (c979520bb4 != null) {
                c979520bb4.LIZIZ = 5;
            }
            C979490bb1 c979490bb1 = c979480bb0.LJIIL;
            if (c979490bb1 != null) {
                c979490bb1.R5();
            }
        } else {
            c979480bb0.getClass();
        }
        ((C979480bb0) aObserverS219S0100000_15.l0).LJ.invoke(bool);
    }

    public static final void onChanged$95(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map<Long, Boolean> map = (Map) obj;
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
        if (c979520bb4 != null) {
            c979520bb4.LIZJ = map;
        }
        C979490bb1 c979490bb1 = c979480bb0.LJIIL;
        if (c979490bb1 != null) {
            c979490bb1.S5();
        }
        ((C979480bb0) aObserverS219S0100000_15.l0).LJIIIZ(map);
    }

    public static final void onChanged$96(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        Map<Long, GiftGalleryBadgeInfo> map = (Map) obj;
        C979480bb0 c979480bb0 = (C979480bb0) aObserverS219S0100000_15.l0;
        C979520bb4 c979520bb4 = c979480bb0.LJIILIIL;
        if (c979520bb4 != null) {
            c979520bb4.LIZLLL = map;
        }
        C979490bb1 c979490bb1 = c979480bb0.LJIIL;
        if (c979490bb1 != null) {
            c979490bb1.S5();
        }
    }

    public static final void onChanged$97(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        ((C979480bb0) aObserverS219S0100000_15.l0).LJIIL(((Long) obj).longValue());
    }

    public static final void onChanged$98(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TwoMatchInviterFragment twoMatchInviterFragment = (TwoMatchInviterFragment) aObserverS219S0100000_15.l0;
        if (((Boolean) obj).booleanValue()) {
            C16FS c16fs = twoMatchInviterFragment.LLJILJIL;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = twoMatchInviterFragment.LLJILJIL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs3 = twoMatchInviterFragment.LLJILJIL;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = twoMatchInviterFragment.LLJILJIL;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    public static final void onChanged$99(AObserverS219S0100000_15 aObserverS219S0100000_15, Object obj) {
        TwoMatchInviterFragment twoMatchInviterFragment = (TwoMatchInviterFragment) aObserverS219S0100000_15.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        twoMatchInviterFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInviteRequestReady ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("TwoMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            C16FS c16fs = twoMatchInviterFragment.LLJILJIL;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            twoMatchInviterFragment.ZR();
            twoMatchInviterFragment.VR();
        }
    }
}
