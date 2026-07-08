package X;

import Y.AfS143S0200000_7;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.NewAnchorIncentiveBannerData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.competition.model.MemberRankInfo;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestDistributeStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountDownPlayTimerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownIdleSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewNotLOPNewCreatorWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.grouplive.assem.mvpseat.GroupLiveMvpSeatAssem;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveStatus;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelViewModel;
import com.bytedance.android.livesdk.grouplive.widget.GroupLiveAudienceWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.livesetting.grouplive.GroupLiveConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.GroupLiveMemberMatchOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.AnnouncementEvent;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import com.bytedance.android.livesdk.model.message.MemberInfo;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.model.GetAwemeDetailByIDResponse;
import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist.FYPPageStateImp;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.CountdownForAllUser;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownUser;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.ShowContent;
import webcast.im.PlaybookMessage;

/* JADX INFO: renamed from: X.020W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020W extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            case 87:
                return invoke$87(this, obj);
            case 88:
                return invoke$88(this, obj);
            case 89:
                return invoke$89(this, obj);
            case 90:
                return invoke$90(this, obj);
            case 91:
                return invoke$91(this, obj);
            case 92:
                return invoke$92(this, obj);
            case 93:
                return invoke$93(this, obj);
            case 94:
                return invoke$94(this, obj);
            case 95:
                return invoke$95(this, obj);
            case 96:
                return invoke$96(this, obj);
            case 97:
                return invoke$97(this, obj);
            case 98:
                return invoke$98(this, obj);
            case 99:
                return invoke$99(this, obj);
            case 100:
                return invoke$100(this, obj);
            case 101:
                return invoke$101(this, obj);
            case 102:
                return invoke$102(this, obj);
            case 103:
                return invoke$103(this, obj);
            case 104:
                return invoke$104(this, obj);
            case 105:
                return invoke$105(this, obj);
            case 106:
                return invoke$106(this, obj);
            case 107:
                return invoke$107(this, obj);
            case 108:
                return invoke$108(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020W c020w, Object obj) {
        ((C01IS) c020w.l0).LIZIZ = (CountdownForAllContent) c020w.l1;
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020W c020w, Object obj) {
        int i;
        BaseSheetFragment baseSheetFragment = (BaseSheetFragment) obj;
        if ((baseSheetFragment instanceof CountDownForAllV2ScoreDialog) && ((CountDownForAllV2ScoreDialog) baseSheetFragment).LLLILZ == EnumC312001Iw.OTHER) {
            i = 2;
        } else {
            i = 1;
        }
        InterfaceC311801Iu interfaceC311801Iu = (InterfaceC311801Iu) c020w.l0;
        if (interfaceC311801Iu != null) {
            interfaceC311801Iu.LIZ(i);
        }
        ((BaseCountDownForAllV2Widget) c020w.l1).LLILLJJLI = null;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$100(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$101(C020W c020w, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        TuxTextView tuxTextView = (TuxTextView) c020w.l0;
        if (tuxTextView != null) {
            ((FYPPageStateImp) c020w.l1).getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C814420VxA.LIZIZ(fFloatValue * 100));
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$102(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Function2) c020w.l0).invoke(Integer.valueOf(iIntValue), ListProtector.get((List) c020w.l1, iIntValue));
    }

    public static /* bridge */ /* synthetic */ Object invoke$103(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Function2) c020w.l0).invoke(Integer.valueOf(iIntValue), ListProtector.get((List) c020w.l1, iIntValue));
    }

    public static /* bridge */ /* synthetic */ Object invoke$104(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$105(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$106(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Function1 function1 = (Function1) c020w.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue - ((C118300cf) c020w.l1).element));
        }
        ((C118300cf) c020w.l1).element = iIntValue;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$107(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$108(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$12(C020W c020w, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Function0 function0 = (Function0) c020w.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function1 function1 = (Function1) c020w.l1;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Function2) c020w.l0).invoke(Integer.valueOf(iIntValue), ListProtector.get((List) c020w.l1, iIntValue));
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$16(C020W c020w, Object obj) {
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) c020w.l0;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C01KU((Bitmap) obj, (Function1) c020w.l1, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$17(C020W c020w, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            TuxTextView tuxTextView = (TuxTextView) c020w.l0;
            HandlerHook.viewPostDelay(tuxTextView, new RunnableC514501zT(tuxTextView, (ProfileInfoNicknameProtocol) c020w.l1, 14), 500L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(C020W c020w, Object obj) {
        Map<String, ? extends Object> map;
        Map<String, String> map2 = (Map) obj;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII((Context) c020w.l0, map2);
        C1207520hWo c1207520hWo = (C1207520hWo) c020w.l1;
        if (c1207520hWo != null && (map = c1207520hWo.LIZJ) != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(C020W c020w, Object obj) {
        Map<String, ? extends Object> map;
        Map<String, String> map2 = (Map) obj;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII((Context) c020w.l0, map2);
        C1207520hWo c1207520hWo = (C1207520hWo) c020w.l1;
        if (c1207520hWo != null && (map = c1207520hWo.LIZJ) != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020W c020w, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        BaseCountdownViewModel baseCountdownViewModel = (BaseCountdownViewModel) c020w.l0;
        C299601Ec c299601Ec = (C299601Ec) c020w.l1;
        DataChannel dataChannel = baseCountdownViewModel.LL;
        if (dataChannel != null) {
            dataChannel.LC0(CountDownPlayTimerEvent.class, new C422901kh(c299601Ec.LIZJ, jLongValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(C020W c020w, Object obj) {
        Function1 function1 = (Function1) c020w.l0;
        Function2 function2 = (Function2) c020w.l1;
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            Integer num = (Integer) function1.invoke(Long.valueOf(jLongValue));
            if (num != null) {
                function2.invoke(Integer.valueOf(num.intValue()), Long.valueOf(jLongValue));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(C020W c020w, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((Function0) c020w.l0).invoke();
        } else {
            ((Function0) c020w.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C390701fV c390701fV = (C390701fV) c020w.l0;
        boolean z = false;
        if (!c390701fV.LJFF && c390701fV.LIZIZ.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
            C390701fV c390701fV2 = (C390701fV) c020w.l0;
            String str = ((C390801fW) c020w.l1).LIZJ;
            c390701fV2.getClass();
            if (!Intrinsics.LJFF(str, "first") ? !Intrinsics.LJFF(str, "last") || iIntValue == c390701fV2.LIZ - 1 : iIntValue == 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$23(C020W c020w, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        Function2<Boolean, Boolean, Unit> function2 = ((C390801fW) c020w.l0).LIZLLL;
        ((C390701fV) c020w.l1).getClass();
        boolean z2 = true;
        if (iIntValue == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (iIntValue != ((C390701fV) c020w.l1).LIZ - 1) {
            z2 = false;
        }
        function2.invoke(boolValueOf, Boolean.valueOf(z2));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(C020W c020w, Object obj) {
        Map map = (Map) obj;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != 0) {
            iLocationBaseServiceForMT.LJJIII((Activity) c020w.l0, map);
        }
        Map map2 = (Map) c020w.l1;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(C020W c020w, Object obj) {
        String str;
        UserState next;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C490701vd c490701vd = (C490701vd) obj;
        C490701vd c490701vd2 = (C490701vd) c020w.l0;
        long j = c490701vd2.LL;
        C489801vU c489801vU = c490701vd2.LLILLJJLI;
        List<UserState> list = c490701vd.LLILLL;
        RtcUserInfo rtcUserInfoG0 = ((C490301vZ) c020w.l1).LL.G0();
        if (rtcUserInfoG0 != null) {
            str = rtcUserInfoG0.linkMicId;
        } else {
            str = null;
        }
        List<UserState> list2 = ((C490701vd) c020w.l0).LLILLL;
        ArrayList arrayList = new ArrayList();
        ArrayList<UserState> arrayList2 = new ArrayList();
        for (UserState userState : list) {
            String str2 = userState.linkMicId;
            if (str2 != null && str2.length() != 0) {
                arrayList2.add(userState);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (UserState userStateLIZ : arrayList2) {
            Iterator<UserState> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    UserState userState2 = next;
                    if (Intrinsics.LJFF(userState2.linkMicId, userStateLIZ.linkMicId) || Intrinsics.LJFF(userState2.user, userStateLIZ.user)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            UserState userState3 = next;
            if (userState3 == null) {
                userState3 = userStateLIZ;
            }
            arrayList.add(userState3.linkMicId);
            if (Intrinsics.LJFF(userStateLIZ.linkMicId, str)) {
                if (userStateLIZ.audioMuted == 0 && userState3.audioMuted != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (userStateLIZ.videoMuted == 0 && userState3.videoMuted != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3) {
                    if (z4) {
                        userStateLIZ = UserState.LIZ(userStateLIZ, 0, userState3.audioMuted, userState3.videoMuted, 0, 0, 0, 0L, 1951);
                    } else {
                        userStateLIZ = UserState.LIZ(userStateLIZ, 0, userState3.audioMuted, 0, 0, 0, 0, 0L, 2015);
                    }
                } else if (z4) {
                    userStateLIZ = UserState.LIZ(userStateLIZ, 0, 0, userState3.videoMuted, 0, 0, 0, 0L, 1983);
                }
            } else {
                if (userState3.audioMuted == 0 && userStateLIZ.audioMuted != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (userState3.videoMuted == 0 && userStateLIZ.videoMuted != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (z2) {
                        userStateLIZ = UserState.LIZ(userState3, 0, userStateLIZ.audioMuted, userStateLIZ.videoMuted, 0, 0, 0, 0L, 1951);
                    } else {
                        userStateLIZ = UserState.LIZ(userState3, 0, userStateLIZ.audioMuted, 0, 0, 0, 0, 0L, 2015);
                    }
                } else if (z2) {
                    userStateLIZ = UserState.LIZ(userState3, 0, 0, userStateLIZ.videoMuted, 0, 0, 0, 0L, 1983);
                } else {
                    userStateLIZ = userState3;
                }
            }
            arrayList3.add(userStateLIZ);
        }
        ArrayList arrayList4 = new ArrayList();
        for (UserState userState4 : list2) {
            if (!arrayList.contains(userState4.linkMicId)) {
                arrayList4.add(userState4);
            }
        }
        List listLJLIL = C13LP.LJLIL(arrayList4, arrayList3);
        C490701vd c490701vd3 = (C490701vd) c020w.l0;
        return C490701vd.LIZ(c490701vd, j, c489801vU, listLJLIL, null, c490701vd3.LLILZIL, c490701vd3.LLILZLL, 8);
    }

    public static final Object invoke$26(C020W c020w, Object obj) {
        C1173560ge2 c1173560ge2 = (C1173560ge2) obj;
        Map map = (Map) c020w.l0;
        GetAwemeDetailByIDResponse getAwemeDetailByIDResponse = (GetAwemeDetailByIDResponse) c020w.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Aweme aweme : getAwemeDetailByIDResponse.getStories()) {
            String aid = aweme.getAid();
            if (aid != null && !linkedHashMap.containsKey(aid)) {
                linkedHashMap.put(aid, aweme);
            }
        }
        return C1173560ge2.LIZ(c1173560ge2, null, null, linkedHashMap, null, 0L, false, false, false, null, 891);
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$3(C020W c020w, Object obj) {
        if (((InterfaceC20236714Gf) c020w.l0).isActive()) {
            ((InterfaceC20236714Gf) c020w.l0).LJJIFFI(new C5183020f((AnchorTextHeaderViewModel) c020w.l1, 70), obj);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$31(X.C020W r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$31(X.020W, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$32(C020W c020w, Object obj) {
        ((C431101m1) c020w.l0).LJIIIIZZ((CountdownForAllUser) c020w.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$33(C020W c020w, Object obj) {
        ((C431101m1) c020w.l0).LJIIIIZZ((CountdownForAllUser) c020w.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$34(C020W c020w, Object obj) {
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.J9;
        Integer numLIZIZ = c20337914i1.LIZIZ();
        C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
        if (c01zrLIZIZ != null && c01zrLIZIZ.LIZLLL() && numLIZIZ.intValue() > 0) {
            c20337914i1.LJFF(Integer.valueOf(numLIZIZ.intValue() - 1));
            C782110Um9 c782110Um9 = new C782110Um9(((C16FS) c020w.l0).getContext());
            c782110Um9.LJIIZILJ(2131854743);
            c782110Um9.LJII(2131854742);
            c782110Um9.LJIILLIIL = true;
            c782110Um9.LJIILL = true;
            c782110Um9.LJIILIIL(2131854746, new C515201za((C01HJ) c020w.l1, 7));
            c782110Um9.LJIIJ(2131854745, new InterfaceC743640TFa() { // from class: X.01HQ
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.cancel();
                }
            });
            C500260Jjc.LJJLIIIJLLLLLLLZ(c782110Um9.LIZ());
        } else {
            ((C01HJ) c020w.l1).LJLIL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00da, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$35(X.C020W r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$35(X.020W, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(X.C020W r5, java.lang.Object r6) {
        /*
            java.lang.Object r0 = r5.l0
            webcast.im.LiveShowMessage r0 = (webcast.im.LiveShowMessage) r0
            int r1 = r0.showuserfinishreason
            r0 = 11
            r4 = 1
            r3 = 0
            if (r1 != r0) goto L41
            java.lang.String r0 = "end_guest_show"
            X.C01FD.LIZ(r0)
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r6
            java.lang.Object r0 = r5.l1
            X.01FC r0 = (X.C01FC) r0
            webcast.data.multi_guest_play.ShowContent r1 = r0.LIZJ
            if (r1 == 0) goto L3e
            java.lang.Object r0 = r5.l1
            X.01FC r0 = (X.C01FC) r0
            r0.getClass()
            webcast.data.multi_guest_play.ShowListUser r0 = X.C01FC.LJJIIJ(r1)
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.nickname
            if (r0 == 0) goto L3e
        L2f:
            r2[r4] = r0
            r0 = 2131853819(0x7f1181fb, float:1.9341296E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r2)
            X.C766270U4b.LJIIJJI(r0)
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            java.lang.String r0 = ""
            goto L2f
        L41:
            r0 = 12
            if (r1 != r0) goto L3b
            java.lang.String r0 = "end_live_show"
            X.C01FD.LIZ(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r0 = 2131853816(0x7f1181f8, float:1.934129E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            X.C766270U4b.LJIIJJI(r0)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$36(X.020W, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$37(X.C020W r10, java.lang.Object r11) {
        /*
            java.lang.Object r0 = r10.l0
            webcast.im.LiveShowMessage r0 = (webcast.im.LiveShowMessage) r0
            webcast.data.multi_guest_play.ShowContent r0 = r0.showContent
            if (r0 == 0) goto L75
            webcast.data.multi_guest_play.TransitionInfo r8 = r0.transitionInfo
        La:
            r3 = 1
            r9 = 0
            if (r8 == 0) goto L61
            long r1 = r8.transitionStartTime
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            long r1 = r8.transitionDurationOfCurrent
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            long r6 = X.C158B.LIZ()
            long r0 = r8.transitionStartTime
            long r6 = r6 - r0
            long r4 = r8.transitionDurationOfCurrent
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L61
            java.lang.String r0 = "end_guest_show"
            X.C01FD.LIZ(r0)
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r9] = r11
            java.lang.Object r0 = r10.l1
            X.01FC r0 = (X.C01FC) r0
            webcast.data.multi_guest_play.ShowContent r1 = r0.LIZJ
            if (r1 == 0) goto L5e
            java.lang.Object r0 = r10.l1
            X.01FC r0 = (X.C01FC) r0
            r0.getClass()
            webcast.data.multi_guest_play.ShowListUser r0 = X.C01FC.LJJIIJ(r1)
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.nickname
            if (r0 == 0) goto L5e
        L4f:
            r2[r3] = r0
            r0 = 2131853819(0x7f1181fb, float:1.9341296E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r2)
            X.C766270U4b.LJIIJJI(r0)
        L5b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5e:
            java.lang.String r0 = ""
            goto L4f
        L61:
            java.lang.String r0 = "skip_interval"
            X.C01FD.LIZ(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r9] = r11
            r0 = 2131853817(0x7f1181f9, float:1.9341292E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            X.C766270U4b.LJIIJJI(r0)
            goto L5b
        L75:
            r8 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$37(X.020W, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$38(X.C020W r12, java.lang.Object r13) {
        /*
            java.lang.String r0 = "show_again"
            X.C01FD.LIZ(r0)
            r0 = 2
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r0 = 0
            r10[r0] = r13
            java.lang.Object r0 = r12.l0
            X.01FC r0 = (X.C01FC) r0
            webcast.data.multi_guest_play.ShowContent r11 = r0.LIZJ
            java.lang.Object r0 = r12.l1
            webcast.data.multi_guest_play.ShowContent r0 = (webcast.data.multi_guest_play.ShowContent) r0
            r12 = 1
            r9 = 0
            if (r11 == 0) goto L72
            if (r0 == 0) goto L72
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r0.showingAndReadyList
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            r0 = r1
            webcast.data.multi_guest_play.ShowListUser r0 = (webcast.data.multi_guest_play.ShowListUser) r0
            int r0 = r0.status
            if (r0 != r12) goto L26
            r3.add(r1)
            goto L26
        L3b:
            java.util.Iterator r13 = r3.iterator()
        L3f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r8 = r13.next()
            r7 = r8
            webcast.data.multi_guest_play.ShowListUser r7 = (webcast.data.multi_guest_play.ShowListUser) r7
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r11.finishedList
            java.util.Iterator r6 = r0.iterator()
        L52:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r5 = r6.next()
            r0 = r5
            webcast.data.multi_guest_play.ShowListUser r0 = (webcast.data.multi_guest_play.ShowListUser) r0
            long r3 = r0.userId
            long r1 = r7.userId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            if (r5 == 0) goto L3f
            r9 = r8
        L6a:
            webcast.data.multi_guest_play.ShowListUser r9 = (webcast.data.multi_guest_play.ShowListUser) r9
            if (r9 == 0) goto L72
            java.lang.String r0 = r9.nickname
            if (r0 != 0) goto L74
        L72:
            java.lang.String r0 = ""
        L74:
            r10[r12] = r0
            r0 = 2131853815(0x7f1181f7, float:1.9341288E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r10)
            X.C766270U4b.LJIIJJI(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$38(X.020W, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$39(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$4(C020W c020w, Object obj) {
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 1) {
            C20743716Ff c20743716Ff = (C20743716Ff) c020w.l0;
            if (c20743716Ff != null) {
                c20743716Ff.setEnabled(true);
            }
            C20743716Ff c20743716Ff2 = (C20743716Ff) c020w.l0;
            if (c20743716Ff2 != null) {
                c20743716Ff2.setChecked(true);
            }
            ((BasePreviewSettingMainFragmentSheetInitializer) c020w.l1).LJJJJIZL(true);
        } else {
            C20743716Ff c20743716Ff3 = (C20743716Ff) c020w.l0;
            if (c20743716Ff3 != null) {
                c20743716Ff3.setEnabled(false);
            }
            C20743716Ff c20743716Ff4 = (C20743716Ff) c020w.l0;
            if (c20743716Ff4 != null) {
                c20743716Ff4.setChecked(false);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$40(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$41(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$42(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$43(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$44(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$45(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$46(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$47(C020W c020w, Object obj) {
        if (((AtomicBoolean) c020w.l0).compareAndSet(false, true)) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c020w.l1;
            C189200o6.m2constructorimpl(obj);
            interfaceC1364105Vn.resumeWith(obj);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$48(C020W c020w, Object obj) {
        List<GameTag> list;
        Long l;
        HashtagResponse hashtagResponse = (HashtagResponse) obj;
        C259800zU c259800zU = (C259800zU) c020w.l0;
        T t = 0;
        t = 0;
        t = 0;
        if (hashtagResponse != null && (list = hashtagResponse.gameTagList) != null) {
            Long l2 = (Long) c020w.l1;
            Iterator<GameTag> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                GameTag next = it2.next();
                GameTag gameTag = next;
                if (gameTag != null) {
                    l = gameTag.id;
                } else {
                    l = null;
                }
                if (Intrinsics.LJFF(l, l2)) {
                    t = next;
                    break;
                }
            }
        }
        c259800zU.element = t;
        return Unit.LIZ;
    }

    public static final Object invoke$49(C020W c020w, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((Function1) c020w.l0).invoke(Boolean.FALSE);
        } else {
            List list = (List) c020w.l1;
            List listSubList = list.subList(1, list.size());
            Function1 function1 = (Function1) c020w.l0;
            if (listSubList.isEmpty()) {
                function1.invoke(Boolean.TRUE);
            } else {
                ((Function1) ListProtector.get(listSubList, 0)).invoke(new C020W(function1, listSubList, 49));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Function2) c020w.l0).invoke(Integer.valueOf(iIntValue), ListProtector.get((List) c020w.l1, iIntValue));
    }

    public static final Object invoke$50(C020W c020w, Object obj) {
        ((Function1) c020w.l0).invoke(obj);
        Activity activityLIZ = C1388190mED.LIZ((Context) c020w.l1);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(C020W c020w, Object obj) {
        Activity activityLIZ = C1388190mED.LIZ((Context) c020w.l0);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131821721);
            c1389890mGx.LJIIJJI();
        }
        ((Function0) c020w.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$52(C020W c020w, Object obj) {
        Throwable th = (Throwable) obj;
        ((Function1) c020w.l0).invoke(th);
        if (th instanceof C0XIR) {
            if (((C23112093u) th).getErrorCode() == 3008055) {
                Activity activityLIZ = C1388190mED.LIZ((Context) c020w.l1);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131821722);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                Activity activityLIZ2 = C1388190mED.LIZ((Context) c020w.l1);
                if (activityLIZ2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                    c1389890mGx2.LJIIIZ(2131848597);
                    c1389890mGx2.LJIIJJI();
                }
            }
        } else {
            Activity activityLIZ3 = C1388190mED.LIZ((Context) c020w.l1);
            if (activityLIZ3 != null) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ3);
                c1389890mGx3.LJIIIZ(2131848597);
                c1389890mGx3.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(C020W c020w, Object obj) {
        Activity activityLIZ = C1388190mED.LIZ((Context) c020w.l0);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131821709);
            c1389890mGx.LJIIJJI();
        }
        ((Function0) c020w.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$54(C020W c020w, Object obj) {
        Object obj2 = ((Map) c020w.l0).get(Integer.valueOf(((Number) obj).intValue()));
        if (obj2 != null) {
            return ((Map) c020w.l1).get(obj2);
        }
        return null;
    }

    public static final Object invoke$55(C020W c020w, Object obj) {
        Playbook playbook;
        ActivePlaybook activePlaybook = (ActivePlaybook) obj;
        ((AbstractC20384214pU) c020w.l0).LJIILL = true;
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJII = ((PlaybookMessage) c020w.l1).bizReason;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null) {
            AbstractC20384214pU.LJJ((AbstractC20384214pU) c020w.l0, playbook, "IM", false, null, 12);
        }
        C176600m4.LIZJ(new C020Y((AbstractC20384214pU) c020w.l0, activePlaybook, 34));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$56(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$57(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$58(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Function2) c020w.l0).invoke(Integer.valueOf(iIntValue), ListProtector.get((List) c020w.l1, iIntValue));
    }

    public static final Object invoke$59(C020W c020w, Object obj) {
        if (Intrinsics.LJFF(obj, "privilege_center_entrance_horizontal_gift")) {
            C11NZ.LJLJJLL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS143S0200000_7(c020w.l0, (EmoteModel) c020w.l1, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 33));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020W c020w, Object obj) {
        String str;
        GiftPanelBanner giftPanelBanner = (GiftPanelBanner) c020w.l0;
        if (giftPanelBanner != null && (str = giftPanelBanner.schemaUrl) != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1125880fP8) c020w.l1).getContext(), UriProtector.parse(new C495520Jby(str).LIZLLL()));
        }
        String string = ((C1125880fP8) c020w.l1).LLILLJJLI.getText().toString();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_goal_gift_banner_click");
        c474500IjALIZ.LJIL();
        C2639010j.LIZ(c474500IjALIZ, string);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$60(C020W c020w, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Function2) c020w.l0).invoke(Integer.valueOf(iIntValue), ListProtector.get((List) c020w.l1, iIntValue));
    }

    public static /* bridge */ /* synthetic */ Object invoke$61(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$62(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$63(C020W c020w, Object obj) {
        Map<String, ? extends Object> map;
        Map<String, String> map2 = (Map) obj;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII((Activity) c020w.l0, map2);
        C1207520hWo c1207520hWo = (C1207520hWo) c020w.l1;
        if (c1207520hWo != null && (map = c1207520hWo.LIZJ) != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(C020W c020w, Object obj) {
        Map<String, ? extends Object> map;
        Map<String, String> map2 = (Map) obj;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII((Context) c020w.l0, map2);
        C1207520hWo c1207520hWo = (C1207520hWo) c020w.l1;
        if (c1207520hWo != null && (map = c1207520hWo.LIZJ) != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(C020W c020w, Object obj) {
        Map<String, ? extends Object> map;
        Map<String, String> map2 = (Map) obj;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII((Context) c020w.l0, map2);
        C1207520hWo c1207520hWo = (C1207520hWo) c020w.l1;
        if (c1207520hWo != null && (map = c1207520hWo.LIZJ) != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$66(X.C020W r6, java.lang.Object r7) {
        /*
            com.bytedance.android.livesdk.model.message.RankUpdate r7 = (com.bytedance.android.livesdk.model.message.RankUpdate) r7
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdk.model.message.RankUpdateMessage r0 = (com.bytedance.android.livesdk.model.message.RankUpdateMessage) r0
            com.bytedance.android.livesdk.model.message.RankUpdateMessage$ValidRanks r1 = r0.validRanks
            r2 = 1
            r5 = 0
            if (r1 == 0) goto L41
            boolean r0 = r1.isEffect
            if (r0 != r2) goto L41
            java.lang.Object r0 = r6.l1
            X.0y3Y r0 = (X.C1842860y3Y) r0
            int r4 = r7.rankType
            if (r1 == 0) goto L3f
            java.util.List<java.lang.Integer> r3 = r1.rankTypes
        L1a:
            r0.getClass()
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = X.C235000vU.LIZ(r4, r5)
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJJIJIIJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3a
            if (r3 == 0) goto L39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L3a
        L39:
            r2 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3f:
            r3 = 0
            goto L1a
        L41:
            java.lang.Object r0 = r6.l1
            X.0y3Y r0 = (X.C1842860y3Y) r0
            int r1 = r7.rankType
            r0.getClass()
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = X.C235000vU.LIZ(r1, r5)
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJJIJIIJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L39
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$66(X.020W, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$67(C020W c020w, Object obj) {
        ((C433001mK) c020w.l0).LIZ((User) c020w.l1, "followFailed");
        return Unit.LIZ;
    }

    public static final Object invoke$68(C020W c020w, Object obj) {
        PlaybookContent playbookContent;
        Playbook playbook;
        if (((Boolean) obj).booleanValue()) {
            BasePlaybookEditorViewModel basePlaybookEditorViewModel = (BasePlaybookEditorViewModel) c020w.l0;
            String value = basePlaybookEditorViewModel.LLILLL.LIZJ.getValue();
            String strLIZJ = basePlaybookEditorViewModel.LLILZ.LIZJ();
            C20379114of value2 = basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
            if (value2 != null && (playbook = value2.LIZ) != null) {
                playbookContent = playbook.content;
            } else {
                playbookContent = null;
            }
            C403501hZ.LIZ(new C020E(value, playbookContent, strLIZJ, 2));
        } else {
            C403501hZ.LIZ(AnonymousClass0206.get$arr$(419));
        }
        ((Function0) c020w.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$69(C020W c020w, Object obj) {
        String str;
        ((PreviewNotLOPNewCreatorWidget) c020w.l0).G1("livesdk_banner_click", ((NewAnchorIncentiveBannerData) c020w.l1).metricsMap);
        PreviewNotLOPNewCreatorWidget previewNotLOPNewCreatorWidget = (PreviewNotLOPNewCreatorWidget) c020w.l0;
        NewAnchorIncentiveBannerData newAnchorIncentiveBannerData = (NewAnchorIncentiveBannerData) c020w.l1;
        try {
            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
            Context context = previewNotLOPNewCreatorWidget.context;
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(newAnchorIncentiveBannerData.url).buildUpon().appendQueryParameter("enter_from", "live_take_page").appendQueryParameter("live_type", "video_live");
            if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C189200o6.m2constructorimpl(Boolean.valueOf(iActionHandlerService.handle(context, builderAppendQueryParameter.appendQueryParameter("enable_code_cache", str).build().toString())));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(C020W c020w, Object obj) {
        AnonymousClass0194 anonymousClass0194;
        long j;
        long j2;
        long jLongValue;
        String string;
        long jLongValue2;
        long jLongValue3;
        long j3;
        Room room;
        String string2;
        Room room2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        GroupLiveMvpSeatAssem groupLiveMvpSeatAssem = (GroupLiveMvpSeatAssem) c020w.l0;
        AnonymousClass0194 anonymousClass01942 = groupLiveMvpSeatAssem.LLJIJIL;
        if (anonymousClass01942 != null && (anonymousClass0194 = groupLiveMvpSeatAssem.LLJILJIL) != null) {
            if (zBooleanValue) {
                j = anonymousClass01942.LJ;
                j2 = anonymousClass01942.LIZ;
            } else {
                j = anonymousClass0194.LJ;
                j2 = anonymousClass0194.LIZ;
            }
            Context context = (Context) c020w.l1;
            DataChannel dataChannel = groupLiveMvpSeatAssem.LLJ;
            Long lValueOf = Long.valueOf(j);
            Long lValueOf2 = Long.valueOf(j2);
            Long lValueOf3 = Long.valueOf(anonymousClass01942.LIZ);
            Long lValueOf4 = Long.valueOf(anonymousClass0194.LIZ);
            HashMap map = new HashMap();
            long jLongValue4 = 0;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            map.put("competition_id", String.valueOf(jLongValue));
            String str = CardStruct.IStatusCode.DEFAULT;
            if (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (string = Long.valueOf(room2.getOwnerUserId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("anchor_id", string);
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (string2 = Long.valueOf(room.getId()).toString()) != null) {
                str = string2;
            }
            map.put("room_id", str);
            if (lValueOf3 != null) {
                jLongValue2 = lValueOf3.longValue();
            } else {
                jLongValue2 = 0;
            }
            map.put("red_team_member_id", String.valueOf(jLongValue2));
            if (lValueOf4 != null) {
                jLongValue3 = lValueOf4.longValue();
            } else {
                jLongValue3 = 0;
            }
            map.put("blue_team_member_id", String.valueOf(jLongValue3));
            if (lValueOf2 != null) {
                jLongValue4 = lValueOf2.longValue();
            }
            map.put("default_member_id", String.valueOf(jLongValue4));
            C2841018d.LIZ(context, GroupLiveMemberMatchOptimizationSetting.INSTANCE.getContributorsPageLink(), map);
            AnonymousClass0193 anonymousClass0193 = ((GroupLiveMvpSeatAssem) c020w.l0).LLJJIII;
            if (anonymousClass0193 != null) {
                if (zBooleanValue) {
                    j3 = anonymousClass01942.LIZ;
                } else {
                    j3 = anonymousClass0194.LIZ;
                }
                anonymousClass0193.LJFF = String.valueOf(j3);
            }
            AnonymousClass0193 anonymousClass01932 = ((GroupLiveMvpSeatAssem) c020w.l0).LLJJIII;
            if (anonymousClass01932 != null) {
                AnonymousClass0192.LIZ(anonymousClass01932, "contributer_list");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(C020W c020w, Object obj) {
        ((PreviewNotLOPNewCreatorWidget) c020w.l0).hide();
        ((PreviewNotLOPNewCreatorWidget) c020w.l0).G1("livesdk_banner_close", ((NewAnchorIncentiveBannerData) c020w.l1).metricsMap);
        C0UKZ.LLIILZL.LIZIZ().put(Long.valueOf(((NewAnchorIncentiveBannerData) c020w.l1).subType), Boolean.FALSE);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$71(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$72(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$73(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$74(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$75(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$76(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$77(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$78(C020W c020w, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((AbstractC738140SxQ) c020w.l0), null, null, new C440901nb((MessageListHasRenderedProvider) obj, (AbstractC738140SxQ) c020w.l0, (Function1) c020w.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$79(C020W c020w, Object obj) {
        ((C431301m3) c020w.l0).LJIIIIZZ((GuestShowdownUser) c020w.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(C020W c020w, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((Fragment) c020w.l0, new C5183020f((GroupLiveAudienceWidget) c020w.l1, 119));
        assembler.QQ2((Fragment) c020w.l0, AFwS229S0000000_2.get$arr$(59));
        if (GroupLiveMemberMatchOptimizationSetting.INSTANCE.isEnable()) {
            assembler.QQ2((Fragment) c020w.l0, AFwS229S0000000_2.get$arr$(60));
        }
        assembler.QQ2((Fragment) c020w.l0, AFwS229S0000000_2.get$arr$(61));
        assembler.QQ2((Fragment) c020w.l0, AFwS229S0000000_2.get$arr$(62));
        return Unit.LIZ;
    }

    public static final Object invoke$80(C020W c020w, Object obj) {
        ((C431301m3) c020w.l0).LJIIIIZZ((GuestShowdownUser) c020w.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$81(X.C020W r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.invoke$81(X.020W, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$82(C020W c020w, Object obj) {
        C953610avH c953610avH = (C953610avH) c020w.l0;
        C953600avG c953600avG = (C953600avG) c020w.l1;
        c953610avH.getClass();
        C500260Jjc.LJJLIIIJILLIZJL(new C020G(c953600avG, c953610avH, (String) obj, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$83(C020W c020w, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            ((C953610avH) c020w.l0).LJIJI(EnumC487701v9.REMOVE_BY_USER);
        }
        Function1 function1 = (Function1) c020w.l1;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$84(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$85(C020W c020w, Object obj) {
        C341401Ue c341401Ue = ((GuestShowdownIdleSettingsDialog) c020w.l0).LLLII;
        if (c341401Ue != null) {
            final GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
            guestShowdownConfig.duration = ((long) c341401Ue.LJIILIIL) * 60;
            guestShowdownConfig.loserNum = c341401Ue.LJIIZILJ;
            View view = (View) c020w.l1;
            final GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog = (GuestShowdownIdleSettingsDialog) c020w.l0;
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.J9;
            Integer numLIZIZ = c20337914i1.LIZIZ();
            C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
            if (c01zrLIZIZ != null && c01zrLIZIZ.LIZLLL() && numLIZIZ.intValue() > 0) {
                c20337914i1.LJFF(Integer.valueOf(numLIZIZ.intValue() - 1));
                C782110Um9 c782110Um9 = new C782110Um9(view.getContext());
                c782110Um9.LJIIZILJ(2131854747);
                c782110Um9.LJII(2131854744);
                c782110Um9.LJIILLIIL = true;
                c782110Um9.LJIILL = true;
                c782110Um9.LJIILIIL(2131854746, new InterfaceC743640TFa() { // from class: X.01UW
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        guestShowdownIdleSettingsDialog.uS(guestShowdownConfig);
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIIJ(2131854745, new InterfaceC743640TFa() { // from class: X.01UY
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.cancel();
                    }
                });
                C500260Jjc.LJJLIIIJLLLLLLLZ(c782110Um9.LIZ());
            } else {
                guestShowdownIdleSettingsDialog.uS(guestShowdownConfig);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$86(C020W c020w, Object obj) {
        int i;
        Object second;
        String string;
        String str = (String) ListProtector.get(((MatchResult) obj).LIZ(), 1);
        if (str.length() > 0) {
            i = CastIntegerProtector.parseInt(str) - 1;
        } else {
            C118300cf c118300cf = (C118300cf) c020w.l0;
            i = c118300cf.element;
            c118300cf.element = i + 1;
        }
        Pair pair = (Pair) C13LQ.LJJIIZ(i, (Pair[]) c020w.l1);
        if (pair == null || (second = pair.getSecond()) == null || (string = second.toString()) == null) {
            return "";
        }
        return string;
    }

    public static final Object invoke$87(C020W c020w, Object obj) {
        ((ContentResolver) c020w.l0).unregisterContentObserver((C384801eY) c020w.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$88(C020W c020w, Object obj) {
        Object obj2 = ((Map) c020w.l0).get(Integer.valueOf(((Number) obj).intValue()));
        if (obj2 != null) {
            return ((Map) c020w.l1).get(obj2);
        }
        return null;
    }

    public static final Object invoke$89(C020W c020w, Object obj) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        GetGuestSettingResponse.ResponseData responseData = (GetGuestSettingResponse.ResponseData) obj;
        if (responseData != null) {
            int i = responseData.flowDistribute;
            DataChannel dataChannel = (DataChannel) c020w.l0;
            if (dataChannel != null) {
                dataChannel.zW(MultiGuestDistributeStatus.class, Integer.valueOf(i));
            }
            if ((i == 0 || i == 1) && (lifecycleOwner = (LifecycleOwner) c020w.l1) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C313401Jk(responseData, null), 2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(C020W c020w, Object obj) {
        C291001Au c291001Au = new C291001Au((List) c020w.l0);
        C291001Au c291001Au2 = new C291001Au((Aweme) c020w.l1);
        obj.getClass();
        return new C232800v8(c291001Au, c291001Au2);
    }

    public static final Object invoke$90(C020W c020w, Object obj) {
        InterfaceC392301fl statusCallback;
        if (obj != null) {
            ((InterfaceC2329309At) c020w.l0).onSuccess(Boolean.FALSE);
            if (!(obj instanceof CancellationException) && (statusCallback = ((InterfaceC395901gL) c020w.l1).getStatusCallback()) != null) {
                statusCallback.LIZIZ();
            }
        } else {
            ((InterfaceC2329309At) c020w.l0).onSuccess(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$91(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$92(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static final Object invoke$93(C020W c020w, Object obj) {
        long j = ((AnonymousClass0190) obj).LL.LIZ;
        CompetitionRankListMessage competitionRankListMessage = (CompetitionRankListMessage) c020w.l0;
        if (j <= competitionRankListMessage.dataVersion) {
            ((GroupLiveRankingPanelViewModel) c020w.l1).setState(new C5183020f(competitionRankListMessage, 356));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$94(C020W c020w, Object obj) {
        MemberInfo memberInfoLIZ;
        AnnouncementEvent next;
        boolean z;
        C00JH c00jh;
        String str;
        boolean z2;
        ImageModel imageModel;
        AbstractC2863018z abstractC2863018z = ((AnonymousClass0190) obj).LL;
        long j = abstractC2863018z.LIZ;
        CompetitionRankListMessage competitionRankListMessage = (CompetitionRankListMessage) c020w.l0;
        if (j <= competitionRankListMessage.dataVersion) {
            Iterator<AnnouncementEvent> it2 = competitionRankListMessage.annonuncementEvents.iterator();
            while (true) {
                memberInfoLIZ = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.announcementType == 2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnnouncementEvent announcementEvent = next;
            if (announcementEvent == null || announcementEvent.end > C158B.LIZJ()) {
                if (abstractC2863018z.LIZIZ != ((CompetitionRankListMessage) c020w.l0).competitionId) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel = (GroupLiveRankingPanelViewModel) c020w.l1;
                    EnumC2851018n enumC2851018n = EnumC2851018n.INROOMRANKING;
                    DataChannel dataChannel = groupLiveRankingPanelViewModel.vQ2().LL;
                    if (dataChannel != null) {
                        dataChannel.zW(GroupLiveStatus.class, new C2850018m(enumC2851018n, null));
                    }
                    GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel2 = (GroupLiveRankingPanelViewModel) c020w.l1;
                    groupLiveRankingPanelViewModel2.getClass();
                    String strLJIJI = C497740JfY.LJIJI(2131852651);
                    if (strLJIJI == null) {
                        strLJIJI = "";
                    }
                    long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(groupLiveRankingPanelViewModel2.vQ2().LL);
                    ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Jf0(jLJJLIIIJ, C181500mr.LJ(jLJJLIIIJ, strLJIJI), true, null);
                }
                GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel3 = (GroupLiveRankingPanelViewModel) c020w.l1;
                CompetitionRankListMessage competitionRankListMessage2 = (CompetitionRankListMessage) c020w.l0;
                groupLiveRankingPanelViewModel3.getClass();
                List<MemberRankInfo> list = competitionRankListMessage2.memberRankInfo;
                ArrayList arrayList = new ArrayList();
                for (MemberRankInfo memberRankInfo : list) {
                    if (memberRankInfo.state == 2) {
                        arrayList.add(memberRankInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (MemberRankInfo memberRankInfo2 : list) {
                    if (memberRankInfo2.state == 1) {
                        arrayList2.add(memberRankInfo2);
                    }
                }
                List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
                int i = GroupLiveConfig.INSTANCE.getGetValue().rankingPanelConfig.maxVisibleMembers;
                DataChannel dataChannel2 = groupLiveRankingPanelViewModel3.vQ2().LL;
                if (dataChannel2 != null) {
                    c00jh = (C00JH) dataChannel2.gg0(GroupLiveMemberList.class);
                } else {
                    c00jh = null;
                }
                List<MemberRankInfo> listLL = C13LP.LL(listLJLIL, i);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                for (MemberRankInfo memberRankInfo3 : listLL) {
                    if (c00jh != null) {
                        memberInfoLIZ = c00jh.LIZ(memberRankInfo3.userId);
                    }
                    long j2 = memberRankInfo3.userId;
                    int i2 = (int) memberRankInfo3.rank;
                    if (memberInfoLIZ == null || (str = memberInfoLIZ.nickname) == null) {
                        str = "";
                    }
                    long j3 = memberRankInfo3.points;
                    if (memberRankInfo3.state == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    if (memberInfoLIZ != null) {
                        imageModel = memberInfoLIZ.avatar;
                    } else {
                        imageModel = null;
                    }
                    arrayList3.add(new C019L(j2, i2, str, j3, boolValueOf, imageModel));
                    memberInfoLIZ = null;
                }
                groupLiveRankingPanelViewModel3.setState(new C2860018w(competitionRankListMessage2, arrayList3, listLJLIL));
                if (announcementEvent != null) {
                    GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel4 = (GroupLiveRankingPanelViewModel) c020w.l1;
                    CompetitionRankListMessage competitionRankListMessage3 = (CompetitionRankListMessage) c020w.l0;
                    groupLiveRankingPanelViewModel4.getClass();
                    EnumC2851018n enumC2851018n2 = EnumC2851018n.NORMAL;
                    DataChannel dataChannel3 = groupLiveRankingPanelViewModel4.vQ2().LL;
                    if (dataChannel3 != null) {
                        dataChannel3.zW(GroupLiveStatus.class, new C2850018m(enumC2851018n2, null));
                    }
                    long jLIZJ = announcementEvent.end - C158B.LIZJ();
                    if (jLIZJ > 0) {
                        groupLiveRankingPanelViewModel4.runOnUIThread(new C020V(jLIZJ, groupLiveRankingPanelViewModel4, competitionRankListMessage3, 2));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$95(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$96(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$97(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$98(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    public static /* bridge */ /* synthetic */ Object invoke$99(C020W c020w, Object obj) {
        return ((Function1) c020w.l0).invoke(ListProtector.get((List) c020w.l1, ((Number) obj).intValue()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C020W(X.C01FC r3, webcast.im.LiveShowMessage r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 35 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.<init>(X.01FC, webcast.im.LiveShowMessage, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C020W(X.C390801fW r3, X.C390701fV r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 22 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020W.<init>(X.01fW, X.01fV, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(C118300cf c118300cf, C118300cf c118300cf2, Pair<String, ? extends Object>[] pairArr) {
        super(1);
        this.$t = pairArr;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(C259800zU c259800zU, C259800zU<GameTag> c259800zU2, Long l) {
        super(1);
        this.$t = l;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C01FC c01fc, ShowContent showContent, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01fc;
        this.l1 = showContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C01IS c01is, CountdownForAllContent countdownForAllContent, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01is;
        this.l1 = countdownForAllContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C310901Il c310901Il, BaseCountDownForAllV2Widget baseCountDownForAllV2Widget, int i) {
        super(1);
        this.$t = i;
        this.l0 = c310901Il;
        this.l1 = baseCountDownForAllV2Widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C431101m1 c431101m1, CountdownForAllUser countdownForAllUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = c431101m1;
        this.l1 = countdownForAllUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C431301m3 c431301m3, GuestShowdownUser guestShowdownUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = c431301m3;
        this.l1 = guestShowdownUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C490701vd c490701vd, C490301vZ c490301vZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c490701vd;
        this.l1 = c490301vZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(AbstractC738140SxQ abstractC738140SxQ, AwS101S0110000_14 awS101S0110000_14, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC738140SxQ;
        this.l1 = awS101S0110000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C953600avG c953600avG, C953610avH c953610avH, int i) {
        super(1);
        this.$t = i;
        this.l0 = c953610avH;
        this.l1 = c953600avG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(C953610avH c953610avH, C953610avH c953610avH2, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c953610avH;
        this.l1 = c953610avH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C1124290fMZ c1124290fMZ, PrivilegeCenterConfig privilegeCenterConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1124290fMZ;
        this.l1 = privilegeCenterConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C11KT c11kt, InterfaceC395901gL interfaceC395901gL, int i) {
        super(1);
        this.$t = i;
        this.l0 = c11kt;
        this.l1 = interfaceC395901gL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(AbstractC20384214pU abstractC20384214pU, PlaybookMessage playbookMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC20384214pU;
        this.l1 = playbookMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C16FS c16fs, C01HJ c01hj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c16fs;
        this.l1 = c01hj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C20743716Ff c20743716Ff, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20743716Ff;
        this.l1 = basePreviewSettingMainFragmentSheetInitializer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(C2252611DEt c2252611DEt, AnchorTextHeaderViewModel anchorTextHeaderViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = anchorTextHeaderViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Activity activity, C1207520hWo c1207520hWo, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c1207520hWo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Activity activity, Activity activity2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = activity;
        this.l1 = activity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(ContentResolver contentResolver, C384801eY c384801eY, int i) {
        super(1);
        this.$t = i;
        this.l0 = contentResolver;
        this.l1 = c384801eY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Context context, C1207520hWo c1207520hWo, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1207520hWo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Context context, Context context2, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Context context, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = function1;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Fragment fragment, GroupLiveAudienceWidget groupLiveAudienceWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = groupLiveAudienceWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(LifecycleOwner lifecycleOwner, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(User user, C433001mK c433001mK, int i) {
        super(1);
        this.$t = i;
        this.l0 = c433001mK;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(BaseCountdownViewModel baseCountdownViewModel, C299601Ec c299601Ec, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseCountdownViewModel;
        this.l1 = c299601Ec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog, C16FS c16fs, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownIdleSettingsDialog;
        this.l1 = c16fs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(BasePlaybookEditorViewModel basePlaybookEditorViewModel, BasePlaybookEditorViewModel basePlaybookEditorViewModel2, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = basePlaybookEditorViewModel;
        this.l1 = basePlaybookEditorViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(PreviewNotLOPNewCreatorWidget previewNotLOPNewCreatorWidget, NewAnchorIncentiveBannerData newAnchorIncentiveBannerData, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewNotLOPNewCreatorWidget;
        this.l1 = newAnchorIncentiveBannerData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(GroupLiveMvpSeatAssem groupLiveMvpSeatAssem, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = groupLiveMvpSeatAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(GiftPanelBanner giftPanelBanner, C1125880fP8 c1125880fP8, int i) {
        super(1);
        this.$t = i;
        this.l0 = giftPanelBanner;
        this.l1 = c1125880fP8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(CompetitionRankListMessage competitionRankListMessage, GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = competitionRankListMessage;
        this.l1 = groupLiveRankingPanelViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(RankUpdateMessage rankUpdateMessage, C1842860y3Y c1842860y3Y, int i) {
        super(1);
        this.$t = i;
        this.l0 = rankUpdateMessage;
        this.l1 = c1842860y3Y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(TuxTextView tuxTextView, FYPPageStateImp fYPPageStateImp, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = fYPPageStateImp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(TuxTextView tuxTextView, ProfileInfoNicknameProtocol profileInfoNicknameProtocol, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = profileInfoNicknameProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(List list, List<Aweme> list2, Aweme aweme) {
        super(1);
        this.$t = aweme;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Map map, Map<String, ? extends Aweme> map2, GetAwemeDetailByIDResponse getAwemeDetailByIDResponse) {
        super(1);
        this.$t = getAwemeDetailByIDResponse;
        this.l0 = map;
        this.l1 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Map map, Map<Integer, String> map2, Map<String, Integer> map3) {
        super(1);
        this.$t = map3;
        this.l0 = map;
        this.l1 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(AtomicBoolean atomicBoolean, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l0 = atomicBoolean;
        this.l1 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Function0 function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$t = function03;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Function0 function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Function1 function1, Function1<? super Integer, Unit> function12, C118300cf c118300cf) {
        super(1);
        this.$t = c118300cf;
        this.l0 = function1;
        this.l1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Function1 function1, InterfaceC497601wk interfaceC497601wk, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Function1 function1, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = function1;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020W(Function1 function1, Function1<? super Long, Integer> function12, Function2<? super Integer, ? super Long, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = function1;
        this.l1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020W(Function2 function2, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = function2;
        this.l1 = list;
    }
}
