package com.bytedance.android.live.publicscreen.impl;

import X.AbstractC1110520f0M;
import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.AbstractC498530Jgp;
import X.AbstractC521080Kc6;
import X.AnonymousClass0069;
import X.AnonymousClass0127;
import X.C001A;
import X.C01C5;
import X.C087600Uo;
import X.C0DT5;
import X.C0J0P;
import X.C0J3Y;
import X.C0UO0;
import X.C1089010eRf;
import X.C1090040eTK;
import X.C1092780eXk;
import X.C1092980eY4;
import X.C1095140ebY;
import X.C1105280eru;
import X.C1107810evz;
import X.C1109010exv;
import X.C1109020exw;
import X.C1109030exx;
import X.C1109070ey1;
import X.C1109240eyI;
import X.C1109270eyL;
import X.C1109280eyM;
import X.C1109290eyN;
import X.C1109300eyO;
import X.C1109380eyW;
import X.C1109560eyo;
import X.C1109600eys;
import X.C1109610eyt;
import X.C1109770ez9;
import X.C1110070ezd;
import X.C1110170ezn;
import X.C1110310f01;
import X.C1111930f2d;
import X.C1112330f3H;
import X.C1112740f3w;
import X.C1113350f4v;
import X.C1113360f4w;
import X.C1113380f4y;
import X.C1113410f51;
import X.C1113480f58;
import X.C1113690f5T;
import X.C1114400f6c;
import X.C1151720g4o;
import X.C1152540g68;
import X.C1161920gLG;
import X.C11JF;
import X.C11PQ;
import X.C13LQ;
import X.C1697810uHb;
import X.C16F9;
import X.C175200lq;
import X.C1932907hf;
import X.C19719512Dh;
import X.C20516015Pq;
import X.C20736316Cj;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2348809Ig;
import X.C238400w2;
import X.C472890IgZ;
import X.C473410IhP;
import X.C480460Ism;
import X.C485730J3b;
import X.C485760J3e;
import X.C485880J3q;
import X.C500260Jjc;
import X.C5183020f;
import X.C519870Ka9;
import X.C520890Kbn;
import X.C748880TZe;
import X.C755050Tjb;
import X.C776250Uch;
import X.C777030Udx;
import X.C779390Uhl;
import X.C779490Uhv;
import X.C784630UqD;
import X.C786410Ut5;
import X.C963140bAe;
import X.EnumC1108030ewL;
import X.EnumC485780J3g;
import X.InterfaceC1092860eXs;
import X.InterfaceC1097760efm;
import X.InterfaceC1107760evu;
import X.InterfaceC1109050exz;
import X.InterfaceC1109090ey3;
import X.InterfaceC1109140ey8;
import X.InterfaceC1109180eyC;
import X.InterfaceC1109210eyF;
import X.InterfaceC1109220eyG;
import X.InterfaceC1109310eyP;
import X.InterfaceC1109320eyQ;
import X.InterfaceC1109350eyT;
import X.InterfaceC1109750ez7;
import X.InterfaceC1112050f2p;
import X.InterfaceC1112060f2q;
import X.InterfaceC1112400f3O;
import X.InterfaceC1112730f3v;
import X.InterfaceC1210360hbO;
import X.InterfaceC1936307iD;
import X.InterfaceC420801kM;
import X.InterfaceC776970Udr;
import X.InterfaceC779500Uhw;
import Y.ARunnableS10S0310000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS15S0200100_17;
import Y.ARunnableS20S0100100_17;
import Y.ARunnableS50S0300000_17;
import Y.AfS5S0200100_17;
import Y.AfS6S0100100_17;
import android.content.Context;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveAddHotCommentMuteRuleEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget;
import com.bytedance.android.live.commentcombo.view.ExtendedCommentComboTrayWidget;
import com.bytedance.android.live.commentcombo.view.LandscapeCommentComboTrayWidget;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.pin.api.PinApi;
import com.bytedance.android.live.pin.widget.ExtendScreenCommentPinnedWidget;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextDeleteTopWidget;
import com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitWidget;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTranslateWidget;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import com.bytedance.android.live.publicscreen.impl.model.FoldMessageReleaseConfig;
import com.bytedance.android.live.publicscreen.impl.model.FoldMessageReleaseParam;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenTagFrequencySetting;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.GameDualDevicePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import com.bytedance.android.live.room.CommentComboTrayEvent;
import com.bytedance.android.live.setting.CompanionFrequencyControlConfig;
import com.bytedance.android.live.setting.FrequencyConfig;
import com.bytedance.android.live.setting.LiveExtendedScreenFreqControlOptimizeSetting;
import com.bytedance.android.live.setting.MessageType;
import com.bytedance.android.live.setting.MessageTypeConfig;
import com.bytedance.android.live.watchfocus.LandscapeWatchFocusTrayWidget;
import com.bytedance.android.live.watchfocus.WatchFocusTrayWidget;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CommentStatusChannel;
import com.bytedance.android.livesdk.dataChannel.DrawGuessStatusVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HistoryInfoChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAutoTranslateNotify;
import com.bytedance.android.livesdk.dataChannel.ProgrammedPinMsgVisibility;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.WatchFocusWidgetVisibility;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateModelAnchorSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateModelAudienceSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAvoidNotifySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import com.bytedance.android.livesdk.model.message.AISummaryMessage;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.PinInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.ServerDataV2Structure;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class PublicScreenService implements IPublicScreenService, InterfaceC1109320eyQ, InterfaceC1109350eyT {
    public final CopyOnWriteArrayList<InterfaceC1109090ey3> LL;
    public final List<InterfaceC1109090ey3> LLILLJJLI;
    public final LongSparseArray<List<C1111930f2d<? extends InterfaceC1112050f2p>>> LLILLL;
    public C1109290eyN LLILZ;
    public final LongSparseArray<Long> LLILZIL;
    public final LongSparseArray<Long> LLILZLL;
    public final LongSparseArray<BottomMessage> LLIZ;
    public final LongSparseArray<HistoryInfo> LLIZLLLIL;
    public C755050Tjb LLJ;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<InterfaceC1112400f3O>> LLJI;
    public C519870Ka9 LLJIJIL;
    public Integer LLJILJIL;
    public final Map<Class<? extends AbstractC1136060ffY>, InterfaceC1109180eyC<? extends AbstractC1136060ffY>> LLJILJILJ;
    public final Map<Class<? extends InterfaceC1112060f2q>, InterfaceC1109750ez7<? extends InterfaceC1112060f2q, ? extends C1109600eys<? extends InterfaceC1112060f2q>>> LLJILLL;
    public ARunnableS15S0200100_17 LLJJ;
    public final LongSparseArray<InterfaceC1109310eyP> LLJJI;

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Jl2() {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void VW1() {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void aJ2() {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void yu() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0eyN] */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1109290eyN Fo2() {
        if (this.LLILZ == null) {
            this.LLILZ = new Object() { // from class: X.0eyN
            };
        }
        return this.LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0f4v] */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1113350f4v LR() {
        return new C1113380f4y() { // from class: X.0f4v
            public static final String LJIJI;
            public static final String LJIJJ;
            public final HashMap<Long, PublicAreaMessageCommon.CreatorSuccessInfo.Topic> LJIIL = new HashMap<>();
            public int LJIILIIL;
            public final HashMap<String, Integer> LJIILJJIL;
            public final HashMap<String, Integer> LJIILL;
            public int LJIILLIIL;
            public int LJIIZILJ;
            public final FrequencyConfig LJIJ;

            static {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C001A c001a = C001A.SOCIAL;
                sbLIZ.append(c001a.wsMethod);
                sbLIZ.append('1');
                LJIJI = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c001a.wsMethod);
                sbLIZ2.append('3');
                LJIJJ = C2188811AlT.LIZIZ(sbLIZ2);
            }

            {
                MessageType messageType;
                MessageType messageType2;
                MessageType messageType3;
                MessageType messageType4;
                MessageType messageType5;
                MessageType messageType6;
                MessageType messageType7;
                MessageType messageType8;
                MessageType messageType9;
                MessageType messageType10;
                HashMap<String, Integer> map = new HashMap<>();
                this.LJIILJJIL = map;
                HashMap<String, Integer> map2 = new HashMap<>();
                this.LJIILL = map2;
                this.LJIILLIIL = 8;
                FrequencyConfig frequencyConfig = LiveExtendedScreenFreqControlOptimizeSetting.config;
                this.LJIJ = frequencyConfig;
                C001A c001a = C001A.GIFT;
                String str = c001a.wsMethod;
                MessageTypeConfig messageTypeConfig = frequencyConfig.messageTypeConfig;
                int i = 3;
                map.put(str, Integer.valueOf((messageTypeConfig == null || (messageType10 = messageTypeConfig.giftFreq) == null) ? 3 : messageType10.threshold));
                String str2 = LJIJI;
                MessageTypeConfig messageTypeConfig2 = frequencyConfig.messageTypeConfig;
                map.put(str2, Integer.valueOf((messageTypeConfig2 == null || (messageType9 = messageTypeConfig2.followFreq) == null) ? 3 : messageType9.threshold));
                String str3 = LJIJJ;
                MessageTypeConfig messageTypeConfig3 = frequencyConfig.messageTypeConfig;
                map.put(str3, Integer.valueOf((messageTypeConfig3 == null || (messageType8 = messageTypeConfig3.shareFreq) == null) ? 3 : messageType8.threshold));
                C001A c001a2 = C001A.CHAT;
                String str4 = c001a2.wsMethod;
                MessageTypeConfig messageTypeConfig4 = frequencyConfig.messageTypeConfig;
                map.put(str4, Integer.valueOf((messageTypeConfig4 == null || (messageType7 = messageTypeConfig4.commentFreq) == null) ? 3 : messageType7.threshold));
                MessageTypeConfig messageTypeConfig5 = frequencyConfig.messageTypeConfig;
                map.put("DEFAULT_MSG_TYPE", Integer.valueOf((messageTypeConfig5 == null || (messageType6 = messageTypeConfig5.othersFreq) == null) ? 3 : messageType6.threshold));
                String str5 = c001a.wsMethod;
                MessageTypeConfig messageTypeConfig6 = frequencyConfig.messageTypeConfig;
                map2.put(str5, Integer.valueOf((messageTypeConfig6 == null || (messageType5 = messageTypeConfig6.giftFreq) == null) ? 3 : messageType5.threshold));
                MessageTypeConfig messageTypeConfig7 = frequencyConfig.messageTypeConfig;
                map2.put(str2, Integer.valueOf((messageTypeConfig7 == null || (messageType4 = messageTypeConfig7.followFreq) == null) ? 3 : messageType4.threshold));
                MessageTypeConfig messageTypeConfig8 = frequencyConfig.messageTypeConfig;
                map2.put(str3, Integer.valueOf((messageTypeConfig8 == null || (messageType3 = messageTypeConfig8.shareFreq) == null) ? 3 : messageType3.threshold));
                String str6 = c001a2.wsMethod;
                MessageTypeConfig messageTypeConfig9 = frequencyConfig.messageTypeConfig;
                map2.put(str6, Integer.valueOf((messageTypeConfig9 == null || (messageType2 = messageTypeConfig9.commentFreq) == null) ? 3 : messageType2.threshold));
                MessageTypeConfig messageTypeConfig10 = frequencyConfig.messageTypeConfig;
                if (messageTypeConfig10 != null && (messageType = messageTypeConfig10.othersFreq) != null) {
                    i = messageType.threshold;
                }
                map2.put("DEFAULT_MSG_TYPE", Integer.valueOf(i));
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x01ae  */
            @Override // X.C1113380f4y, X.AbstractC1113400f50
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic LIZIZ(X.AbstractC1110800f0o<?> r11) {
                /*
                    Method dump skipped, instruction units count: 451
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1113350f4v.LIZIZ(X.0f0o):com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic");
            }
        };
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void NF0() {
        C1109010exv.LIZ.getClass();
        C1109020exw c1109020exwLIZJ = C1109010exv.LIZJ(0L);
        if (c1109020exwLIZJ != null) {
            C1109010exv.LJIIJ(c1109020exwLIZJ);
            C1109010exv.LJI(c1109020exwLIZJ, EnumC1108030ewL.CANCEL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0f4w] */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1113360f4w NY1() {
        return new C1113380f4y() { // from class: X.0f4w
            public int LJIIL;
            public int LJIILIIL;
            public int LJIILJJIL;
            public int LJIILL;
            public final HashMap<Long, PublicAreaMessageCommon.CreatorSuccessInfo.Topic> LJIILLIIL = new HashMap<>();
            public final HashMap<String, C1113370f4x> LJIIZILJ = new HashMap<>();
            public final FrequencyConfig LJIJ = LiveExtendedScreenFreqControlOptimizeSetting.config;

            public final PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl LJ() {
                PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl = new PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl();
                frequencyControl.frequencyControlKey = "default_client_px_px_type";
                CompanionFrequencyControlConfig companionFrequencyControlConfig = this.LJIJ.defaultFrequencyControlConfig;
                frequencyControl.windowSize = companionFrequencyControlConfig != null ? companionFrequencyControlConfig.windowSize : 4L;
                frequencyControl.limitInWindow = companionFrequencyControlConfig != null ? companionFrequencyControlConfig.limitInWindow : 1L;
                return frequencyControl;
            }

            /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
            @Override // X.C1113380f4y, X.AbstractC1113400f50
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic LIZIZ(X.AbstractC1110800f0o<?> r14) {
                /*
                    Method dump skipped, instruction units count: 439
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1113360f4w.LIZIZ(X.0f0o):com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic");
            }

            public final PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl LJFF(AbstractC1110790f0n abstractC1110790f0n) {
                PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControlLJ;
                PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
                PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110790f0n.LLIIII();
                if (publicAreaMessageCommonLLIIII == null || (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) == null || (frequencyControlLJ = creatorSuccessInfo.frequencyControl) == null) {
                    frequencyControlLJ = LJ();
                }
                if (TextUtils.isEmpty(frequencyControlLJ.frequencyControlKey)) {
                    return LJ();
                }
                return frequencyControlLJ;
            }

            public final void LJI(AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
                if (topic != null) {
                    AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) abstractC1110790f0n;
                    this.LJIILLIIL.put(Long.valueOf(abstractC1110800f0o.getMessageId()), topic);
                    abstractC1110800f0o.LJIIIZ.LIZ = true;
                    return;
                }
                this.LJIILLIIL.put(Long.valueOf(((AbstractC1110800f0o) abstractC1110790f0n).getMessageId()), null);
            }
        };
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1113380f4y NZ1() {
        return new C1113380f4y();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0f3w] */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1112740f3w TK1() {
        return new InterfaceC1112730f3v() { // from class: X.0f3w
            public int LIZ;
            public final C2091508Hh<Long, Unit> LIZIZ = new C2091508Hh<>(200);
            public final C2091508Hh<Long, Boolean> LIZJ = new C2091508Hh<>(200);
            public final boolean LIZLLL = LivePublicScreenTagFrequencySetting.INSTANCE.getValue();

            @Override // X.InterfaceC1112730f3v
            public final boolean LIZ(AbstractC1110800f0o<?> abstractC1110800f0o) {
                PublicAreaMessageCommon.OperationInfo operationInfo;
                PublicAreaMessageCommon.OperationState operationState;
                if (!this.LIZLLL) {
                    return true;
                }
                if (this.LIZJ.get(Long.valueOf(abstractC1110800f0o.getMessageId())) != null) {
                    return Intrinsics.LJFF(this.LIZJ.get(Long.valueOf(abstractC1110800f0o.getMessageId())), Boolean.TRUE);
                }
                int i = this.LIZ;
                if (i != 0) {
                    int i2 = i + 1;
                    this.LIZ = i2;
                    if (i2 == 8) {
                        this.LIZ = 0;
                    }
                    this.LIZJ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), Boolean.FALSE);
                    return false;
                }
                if (!abstractC1110800f0o.LLJJL()) {
                    return true;
                }
                boolean z = abstractC1110800f0o.LJIL instanceof MemberMessage;
                C161200ja c161200ja = C161200ja.LIZ;
                PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
                if (publicAreaMessageCommonLLIIII != null) {
                    operationInfo = publicAreaMessageCommonLLIIII.operationInfo;
                } else {
                    operationInfo = null;
                }
                Boolean bool = Boolean.TRUE;
                c161200ja.getClass();
                if (operationInfo == null || (operationState = operationInfo.initialState) == null || (Intrinsics.LJFF(operationState.scene, "wave") && !Intrinsics.LJFF(bool, bool))) {
                    return false;
                }
                if (this.LIZIZ.keySet().contains(Long.valueOf(abstractC1110800f0o.LLIIJI()))) {
                    this.LIZJ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), Boolean.FALSE);
                    return false;
                }
                this.LIZ++;
                this.LIZIZ.put(Long.valueOf(abstractC1110800f0o.LLIIJI()), Unit.LIZ);
                this.LIZJ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), bool);
                return true;
            }
        };
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Integer TL1() {
        C1095140ebY c1095140ebYUw0;
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService == null || (c1095140ebYUw0 = iFansClubService.uw0()) == null) {
            return null;
        }
        return Integer.valueOf(c1095140ebYUw0.LJ);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void V70() {
        Set<Long> set = C087600Uo.LIZ;
        C087600Uo.LIZ.clear();
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C0DT5 Xo() {
        return new C0DT5();
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Long er1() {
        C1095140ebY c1095140ebYUw0;
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService == null || (c1095140ebYUw0 = iFansClubService.uw0()) == null) {
            return null;
        }
        return Long.valueOf(c1095140ebYUw0.LIZ);
    }

    public final void onInit() {
        ConcurrentHashSet<Integer> concurrentHashSet = C1105280eru.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(C1110070ezd.class.getName(), C1110070ezd.class), new Pair(C16F9.class.getName(), C16F9.class));
        Integer numValueOf = Integer.valueOf(R.layout.h3j);
        C1105280eru.LIZIZ(mapLJIIIIZZ, C13LQ.LJLIIL(new Integer[]{Integer.valueOf(R.layout.hk1), Integer.valueOf(R.layout.hk0), Integer.valueOf(R.layout.hk6), Integer.valueOf(R.layout.hk5), Integer.valueOf(R.layout.hy1), Integer.valueOf(R.layout.gzy), numValueOf, Integer.valueOf(R.layout.huy), Integer.valueOf(R.layout.hk7), numValueOf, Integer.valueOf(R.layout.hk4), Integer.valueOf(R.layout.h2e), Integer.valueOf(R.layout.hk2), Integer.valueOf(R.layout.hk3)}));
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1113410f51 s71() {
        return new C1113410f51();
    }

    public PublicScreenService() {
        CopyOnWriteArrayList<InterfaceC1109090ey3> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LL = copyOnWriteArrayList;
        this.LLILLJJLI = Collections.unmodifiableList(copyOnWriteArrayList);
        this.LLILLL = new LongSparseArray<>();
        this.LLILZIL = new LongSparseArray<>();
        this.LLILZLL = new LongSparseArray<>();
        this.LLIZ = new LongSparseArray<>();
        this.LLIZLLLIL = new LongSparseArray<>();
        this.LLJI = new ConcurrentHashMap<>();
        this.LLJILJILJ = new ConcurrentHashMap();
        this.LLJILLL = new ConcurrentHashMap();
        this.LLJJI = new LongSparseArray<>();
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Cr1() {
        return CaptionTextDeleteTopWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final List<InterfaceC1109090ey3> IS0() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> IU0() {
        return GameDualDevicePublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends IPublicScreenContextWidget> M60() {
        return ExtendScreenCommentPinnedWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C755050Tjb Ya() {
        return this.LLJ;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> aF() {
        return CommentComboTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> c32() {
        return WatchFocusTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> l12() {
        return LandscapeWatchFocusTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> nw1() {
        return LandscapeCommentComboTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> v80() {
        return ExtendedCommentComboTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends IPublicScreenHolderWidget> wL() {
        return ExtendedPublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Ac2(Room room) {
        Long lValueOf;
        IMessageManager iMessageManager;
        if (room != null) {
            InterfaceC1109310eyP interfaceC1109310eyP = this.LLJJI.get(room.getId());
            if (interfaceC1109310eyP != null) {
                interfaceC1109310eyP.destroy();
                this.LLJJI.remove(room.getId());
            }
            ARunnableS15S0200100_17 aRunnableS15S0200100_17 = this.LLJJ;
            if (aRunnableS15S0200100_17 != null) {
                C473410IhP.LJ(aRunnableS15S0200100_17);
            }
            this.LLIZLLLIL.remove(room.getId());
            C1109010exv c1109010exv = C1109010exv.LIZ;
            long id = room.getId();
            c1109010exv.getClass();
            LongSparseArray<DataChannel> longSparseArray = C1109010exv.LIZIZ;
            DataChannel dataChannel = longSparseArray.get(id);
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(C1109010exv.LJIIIIZZ.get(id));
            }
            C1109010exv.LJIIIIZZ.remove(id);
            longSparseArray.get(id);
            longSparseArray.remove(id);
            C1109010exv.LIZJ.remove(id);
            C1109010exv.LJI.remove(id);
        }
        Room room2 = C1090040eTK.LLJI;
        if (room2 != null) {
            Long lValueOf2 = Long.valueOf(room2.getId());
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            if (!Intrinsics.LJFF(lValueOf2, lValueOf)) {
                return;
            }
        }
        C1090040eTK.LLILZIL = null;
        C1090040eTK.LLILZLL = false;
        C1090040eTK.LLIZ = -1L;
        C1090040eTK.LLIZLLLIL = -1L;
        C1090040eTK.LLJ = -1L;
        C11JF c11jf = C1090040eTK.LLJILJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1090040eTK.LLJJ = null;
        C1090040eTK.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Ey0(CaptionInfo captionInfo) {
        if (captionInfo != null && captionInfo.showType == 2) {
            return CaptionSplitWidget.class;
        }
        return CaptionTranslateWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void KN1(String str) {
        C11PQ<Integer> c11pq = C784630UqD.LLLLJI;
        C784630UqD.LLLLL.onNext(str);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void KR(DataChannel dataChannel) {
        FragmentManager fragmentManager;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).HG1(userLJIJJLI.getId(), userLJIJJLI).NR(fragmentManager);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final float Nz1(Context context) {
        return context.getResources().getDimension(R.dimen.avo);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
        InterfaceC1109180eyC interfaceC1109180eyC;
        if (abstractC1136060ffY == null) {
            return null;
        }
        AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0oLJ = C175200lq.LJ(abstractC1136060ffY);
        if (abstractC1110800f0oLJ != null) {
            return abstractC1110800f0oLJ;
        }
        Object obj = ((ConcurrentHashMap) this.LLJILJILJ).get(abstractC1136060ffY.getClass());
        if (!(obj instanceof InterfaceC1109180eyC) || (interfaceC1109180eyC = (InterfaceC1109180eyC) obj) == null) {
            return null;
        }
        return interfaceC1109180eyC.Oo(abstractC1136060ffY);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final long Rd2(long j) {
        Long l = this.LLILZIL.get(j);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final List<InterfaceC1112400f3O> Z51(int i) {
        CopyOnWriteArrayList<InterfaceC1112400f3O> copyOnWriteArrayList = this.LLJI.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null) {
            return Collections.unmodifiableList(copyOnWriteArrayList);
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Z71(final DataChannel dataChannel) {
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
            InterfaceC1092860eXs interfaceC1092860eXs = new InterfaceC1092860eXs() { // from class: X.0eXo
                @Override // X.InterfaceC1092860eXs
                public final void LIZ() {
                }

                @Override // X.InterfaceC1092860eXs
                public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                }

                @Override // X.InterfaceC1092860eXs
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1092860eXs
                public final void LIZLLL(String str, C477840IoY c477840IoY) {
                }

                @Override // X.InterfaceC1092860eXs
                public final void LJ(C1092890eXv c1092890eXv) {
                    Integer num;
                    C0J0M c0j0m = c1092890eXv.LIZIZ;
                    Object obj = null;
                    if (c0j0m != null) {
                        obj = c0j0m.LIZIZ;
                    }
                    if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                        DataChannelGlobal.LLILZ.JQ2(C1148050fyt.class, Integer.valueOf(num.intValue()));
                    }
                }
            };
            C1092980eY4 c1092980eY4 = new C1092980eY4();
            c1092980eY4.LIZ = C0J0P.ROOM;
            c1092980eY4.LIZ(new C1092780eXk(new C1932907hf()));
            iLiveDecisionService.fR1(interfaceC1092860eXs, c1092980eY4.LIZIZ(), null, "public_screen_line_margin");
        }
        ILiveDecisionService iLiveDecisionService2 = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        InterfaceC1092860eXs interfaceC1092860eXs2 = new InterfaceC1092860eXs() { // from class: X.0eXn
            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str, C477840IoY c477840IoY) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                Object obj;
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                FoldMessageReleaseConfig foldMessageReleaseConfig = null;
                if (c0j0m != null) {
                    obj = c0j0m.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof FoldMessageReleaseConfig) {
                    foldMessageReleaseConfig = (FoldMessageReleaseConfig) obj;
                }
                List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LIZ.LLILLL.get(C500260Jjc.LJJLIIIJ(dataChannel));
                if (list != null) {
                    for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                        c1111930f2d.LLLZLL = foldMessageReleaseConfig;
                        if (foldMessageReleaseConfig == null) {
                            c1111930f2d.LLJLIL.clear();
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (FoldMessageReleaseParam foldMessageReleaseParam : foldMessageReleaseConfig.msgParams) {
                                if (Intrinsics.LJFF(foldMessageReleaseParam.msgType, C001A.SOCIAL.wsMethod)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(foldMessageReleaseParam.msgType);
                                    sbLIZ.append(foldMessageReleaseParam.action);
                                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), new Pair(Integer.valueOf(foldMessageReleaseParam.priority), Integer.valueOf(foldMessageReleaseParam.releaseCount)));
                                } else {
                                    linkedHashMap.put(foldMessageReleaseParam.msgType, new Pair(Integer.valueOf(foldMessageReleaseParam.priority), Integer.valueOf(foldMessageReleaseParam.releaseCount)));
                                }
                            }
                            c1111930f2d.LLJLIL = linkedHashMap;
                        }
                    }
                }
            }
        };
        C1092980eY4 c1092980eY42 = new C1092980eY4();
        C0J0P c0j0p = C0J0P.ROOM;
        c1092980eY42.LIZ = c0j0p;
        c1092980eY42.LIZ(new C1092780eXk(new InterfaceC1936307iD<FoldMessageReleaseConfig>() { // from class: X.0eT5
            public final InterfaceC1089790eSv LIZ = null;

            @Override // X.InterfaceC1936307iD
            public final FoldMessageReleaseConfig parse(String str) {
                try {
                    if (!C2093608Ic.LJ(str)) {
                        return (FoldMessageReleaseConfig) C19748512Ol.LIZIZ.LJII(str, FoldMessageReleaseConfig.class);
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    InterfaceC1089790eSv interfaceC1089790eSv = this.LIZ;
                    if (interfaceC1089790eSv != null) {
                        th.toString();
                        interfaceC1089790eSv.LIZIZ();
                        return null;
                    }
                    return null;
                }
            }
        }));
        iLiveDecisionService2.fR1(interfaceC1092860eXs2, c1092980eY42.LIZIZ(), null, "fold_release_config_decision");
        ILiveDecisionService iLiveDecisionService3 = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        InterfaceC1092860eXs interfaceC1092860eXs3 = new InterfaceC1092860eXs() { // from class: X.0eXp
            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str, C477840IoY c477840IoY) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                Object obj = null;
                if (c0j0m != null) {
                    obj = c0j0m.LIZIZ;
                }
                if ((obj instanceof String) && obj != null) {
                    List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LIZ.LLILLL.get(C500260Jjc.LJJLIIIJ(dataChannel));
                    if (list != null) {
                        Iterator<C1111930f2d<? extends InterfaceC1112050f2p>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().LLLZLZ = Intrinsics.LJFF(obj, "1");
                        }
                    }
                }
            }
        };
        C1092980eY4 c1092980eY43 = new C1092980eY4();
        c1092980eY43.LIZ = c0j0p;
        c1092980eY43.LIZ(new C1092780eXk(new C1089010eRf()));
        iLiveDecisionService3.fR1(interfaceC1092860eXs3, c1092980eY43.LIZIZ(), null, "remove_fold_message_with_new_comment_2");
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Zi0(long j) {
        this.LLILZIL.remove(j);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final float bY(Context context) {
        return context.getResources().getDimension(R.dimen.avn);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void gC(long j) {
        this.LLILZLL.remove(j);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final AnonymousClass0127 ia0(DataChannel dataChannel) {
        return new AnonymousClass0127(dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C779390Uhl jC1(DataChannel dataChannel) {
        return new C779390Uhl(dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final BottomMessage jK0(long j) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                if (!c1111930f2d.LIZ()) {
                    return c1111930f2d.LLIZ;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void jc0(InterfaceC1109090ey3 interfaceC1109090ey3) {
        this.LL.add(interfaceC1109090ey3);
        interfaceC1109090ey3.LIZLLL(this);
        interfaceC1109090ey3.LJI(this);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1109600eys<? extends InterfaceC1112060f2q> kX1(AbstractC1136060ffY abstractC1136060ffY) {
        InterfaceC1112060f2q interfaceC1112060f2qOo;
        InterfaceC1109750ez7 interfaceC1109750ez7;
        if (abstractC1136060ffY == null || (interfaceC1112060f2qOo = Oo(abstractC1136060ffY)) == null) {
            return null;
        }
        Object obj = ((ConcurrentHashMap) this.LLJILLL).get(interfaceC1112060f2qOo.getClass());
        if (!(obj instanceof InterfaceC1109750ez7) || (interfaceC1109750ez7 = (InterfaceC1109750ez7) obj) == null) {
            return null;
        }
        return interfaceC1109750ez7.LIZ(interfaceC1112060f2qOo);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Long lM(long j) {
        return this.LLILZLL.get(j);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void q51(long j) {
        this.LLILZLL.put(j, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final boolean qD(Room room) {
        if (room == null) {
            return false;
        }
        C1109030exx c1109030exx = C1109030exx.LIZ;
        C1109010exv.LIZ.getClass();
        if (C1109010exv.LIZLLL(room)) {
            return true;
        }
        Iterator it2 = ((ArrayList) C1109030exx.LIZJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1109140ey8) it2.next()).LIZ(room)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void qu2(InterfaceC1112060f2q interfaceC1112060f2q) {
        OT0(0L, interfaceC1112060f2q);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final int rT0(Context context) {
        Integer numValueOf = this.LLJILJIL;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.c9_, context));
            this.LLJILJIL = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void rf2(int i) {
        C784630UqD.LLLLJI.onNext(Integer.valueOf(i));
        InterfaceC779500Uhw.LJLLI.getClass();
        C779490Uhv.LIZIZ.onNext(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void wc1(AbstractC1136060ffY abstractC1136060ffY) {
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        C1109010exv.LIZ.getClass();
        C1109020exw c1109020exw = new C1109020exw(0L);
        c1109020exw.LIZJ = true;
        c1109020exw.LIZIZ = UserService.getInstance().user().LJIJJLI();
        c1109020exw.LJFF = abstractC1136060ffY;
        C1109010exv.LJFF.put(0L, c1109020exw);
        C1109010exv.LJIILIIL(c1109020exw);
        AbstractC1136060ffY abstractC1136060ffY2 = c1109020exw.LJFF;
        if (abstractC1136060ffY2 != null && (commonMessageData2 = abstractC1136060ffY2.baseMessage) != null) {
            commonMessageData2.messageId = abstractC1136060ffY.getMessageId();
        }
        PinMessage pinMessage = new PinMessage();
        pinMessage.action = 1;
        c1109020exw.LJI = pinMessage;
        c1109020exw.LIZJ = false;
        c1109020exw.LIZLLL = false;
        C1109020exw c1109020exwLIZJ = C1109010exv.LIZJ(0L);
        if (c1109020exwLIZJ != null) {
            C1109010exv.LJI(c1109020exwLIZJ, EnumC1108030ewL.REPLACE);
        }
        C1109010exv.LIZLLL.put(0L, c1109020exw);
        c1109020exw.LIZIZ = UserService.getInstance().user().LJIJJLI();
        c1109020exw.LJ = true;
        AbstractC1136060ffY abstractC1136060ffY3 = c1109020exw.LJFF;
        if (abstractC1136060ffY3 != null && (commonMessageData = abstractC1136060ffY3.baseMessage) != null) {
            commonMessageData.messageId = 0L;
        }
        c1109020exw.LJII = 60000L;
        C1109010exv.LJII(c1109020exw);
        C1109010exv.LIZIZ(0L, 60000L, c1109020exw);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends IPublicScreenHolderWidget> yO(boolean z) {
        if (z) {
            return PortraitPublicScreenWidget.class;
        }
        return LandscapePublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Fe1(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        String str = capsuleMessage.schema;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c1109770ez9.LIZ, capsuleMessage.schema);
        }
    }

    @Override // X.InterfaceC1109350eyT
    public final void LIZ(Class cls, C1109380eyW c1109380eyW) {
        ((ConcurrentHashMap) this.LLJILLL).put(cls, c1109380eyW);
    }

    @Override // X.InterfaceC1109320eyQ
    public final <MESSAGE extends AbstractC1136060ffY> void LIZIZ(Class<MESSAGE> cls, InterfaceC1109180eyC<MESSAGE> interfaceC1109180eyC) {
        ((ConcurrentHashMap) this.LLJILJILJ).put(cls, interfaceC1109180eyC);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void LLLF(Room room, DataChannel dataChannel) {
        long id;
        Long lValueOf;
        Long lValueOf2;
        IMessageManager iMessageManager;
        C1109030exx c1109030exx = C1109030exx.LIZ;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        C1109030exx.LIZLLL.remove(id);
        this.LLJ = null;
        C1090040eTK c1090040eTK = C1090040eTK.LL;
        Room room2 = C1090040eTK.LLJI;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
            C1090040eTK.LLJI = null;
            C1090040eTK.LLILZ = 0;
            DataChannel dataChannel2 = C1090040eTK.LLJIJIL;
            if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(c1090040eTK);
            }
            C1090040eTK.LLJIJIL = null;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void OT0(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        final C238400w2 c238400w2 = new C238400w2();
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            final int i = 0;
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    c1111930f2d.LJLILLLLZI(new InterfaceC1109220eyG() { // from class: X.0ey6
                        public final /* synthetic */ InterfaceC1109220eyG LIZLLL = null;

                        @Override // X.InterfaceC1109220eyG
                        public final void LIZ(long j2) {
                            InterfaceC1109220eyG interfaceC1109220eyG;
                            c238400w2.element = j2;
                            if (i == this.LLILLL.size() - 1 && (interfaceC1109220eyG = this.LIZLLL) != null) {
                                interfaceC1109220eyG.LIZ(c238400w2.element);
                            }
                        }
                    }, interfaceC1112060f2q, false);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Qq1(boolean z, boolean z2) {
        if (z) {
            C485880J3q.LIZ.getClass();
            C485880J3q.LJ(R.layout.d7n, 2, 0);
        }
        if (z2) {
            C0J3Y c0j3y = C0J3Y.LIZ;
            C485730J3b c485730J3bLIZ = C485760J3e.LIZ("ttlive_public_screen_item_common_layer_opt");
            EnumC485780J3g enumC485780J3g = EnumC485780J3g.FIRST_FRAME;
            c0j3y.LJIILL(R.layout.hk6, null, 6, c485730J3bLIZ, enumC485780J3g, true);
            c0j3y.LJIILL(R.layout.hk1, null, 8, C485760J3e.LIZ("ttlive_public_screen_item_chat_layer_opt"), enumC485780J3g, true);
            return;
        }
        C0J3Y c0j3y2 = C0J3Y.LIZ;
        C485730J3b c485730J3bLIZ2 = C485760J3e.LIZ("ttlive_public_screen_item_common_land_layer_opt");
        EnumC485780J3g enumC485780J3g2 = EnumC485780J3g.FIRST_FRAME;
        c0j3y2.LJIILL(R.layout.hk5, null, 6, c485730J3bLIZ2, enumC485780J3g2, true);
        c0j3y2.LJIILL(R.layout.hk0, null, 8, C485760J3e.LIZ("ttlive_public_screen_item_chat_land_layer_opt"), enumC485780J3g2, true);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void RZ0(long j, AbstractC1110520f0M abstractC1110520f0M) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            Iterator<C1111930f2d<? extends InterfaceC1112050f2p>> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LLIFFJFJJ(abstractC1110520f0M);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Tn2(long j, AbstractC1110800f0o abstractC1110800f0o) {
        OT0(j, abstractC1110800f0o);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void XK(long j, C1112330f3H c1112330f3H) {
        final C238400w2 c238400w2 = new C238400w2();
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                if (!c1111930f2d.LIZ()) {
                    arrayList.add(c1111930f2d);
                }
            }
            final int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    ((C1111930f2d) obj).LJLILLLLZI(new InterfaceC1109220eyG() { // from class: X.0ey7
                        public final /* synthetic */ InterfaceC1109220eyG LIZLLL = null;

                        @Override // X.InterfaceC1109220eyG
                        public final void LIZ(long j2) {
                            InterfaceC1109220eyG interfaceC1109220eyG;
                            c238400w2.element = j2;
                            if (i == this.LLILLL.size() - 1 && (interfaceC1109220eyG = this.LIZLLL) != null) {
                                interfaceC1109220eyG.LIZ(c238400w2.element);
                            }
                        }
                    }, c1112330f3H, false);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void aD2(long j, String str) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                c1111930f2d.getClass();
                if ("".equals(str) || (c1111930f2d.LLIZ != null && c1111930f2d.LLIZ.punishInfo != null && Objects.equals(c1111930f2d.LLIZ.punishInfo.punishId, str))) {
                    c1111930f2d.LLIZ = null;
                    c1111930f2d.LLILZIL = 0L;
                    ((InterfaceC1112050f2p) c1111930f2d.mView).eQ0();
                    c1111930f2d.LLJ = null;
                    c1111930f2d.LJLLJ(str);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void bQ1(int i, InterfaceC1112400f3O interfaceC1112400f3O) {
        CopyOnWriteArrayList<InterfaceC1112400f3O> copyOnWriteArrayList = this.LLJI.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LLJI.put(Integer.valueOf(i), copyOnWriteArrayList);
        }
        if (interfaceC1112400f3O != null && (!copyOnWriteArrayList.contains(interfaceC1112400f3O))) {
            copyOnWriteArrayList.add(interfaceC1112400f3O);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final InterfaceC1109310eyP bv2(DataChannel dataChannel, boolean z) {
        if (dataChannel != null) {
            InterfaceC1109310eyP interfaceC1109310eyP = this.LLJJI.get(C500260Jjc.LJJLIIIJ(dataChannel));
            InterfaceC1109310eyP interfaceC1109310eyP2 = interfaceC1109310eyP;
            if (interfaceC1109310eyP == null) {
                C1109300eyO c1109300eyO = new C1109300eyO(dataChannel, z);
                IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                c1109300eyO.LLILLJJLI = iMessageManager;
                AnonymousClass0069.LIZIZ(dataChannel, iMessageManager, c1109300eyO, new C5183020f(c1109300eyO, 184));
                List<InterfaceC1109090ey3> listIS0 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).IS0();
                if (!listIS0.isEmpty()) {
                    for (InterfaceC1109090ey3 interfaceC1109090ey3 : listIS0) {
                        if (interfaceC1109090ey3 != null) {
                            interfaceC1109090ey3.LJFF(c1109300eyO);
                        }
                    }
                }
                this.LLJJI.put(C500260Jjc.LJJLIIIJ(dataChannel), c1109300eyO);
                interfaceC1109310eyP2 = c1109300eyO;
            }
            return interfaceC1109310eyP2;
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void cL0(int i, InterfaceC1112400f3O interfaceC1112400f3O) {
        CopyOnWriteArrayList<InterfaceC1112400f3O> copyOnWriteArrayList = this.LLJI.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null && (!copyOnWriteArrayList.isEmpty())) {
            copyOnWriteArrayList.remove(interfaceC1112400f3O);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void eW(TextView textView, boolean z) {
        if (z) {
            textView.setShadowLayer(bY(textView.getContext()), 0.0f, Nz1(textView.getContext()), rT0(textView.getContext()));
        } else {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final boolean gh2(long j, long j2) {
        AbstractC1110800f0o abstractC1110800f0o;
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        InterfaceC1112060f2q interfaceC1112060f2qLJJLJ = null;
        if (list != null) {
            Iterator<C1111930f2d<? extends InterfaceC1112050f2p>> it2 = list.iterator();
            while (it2.hasNext()) {
                interfaceC1112060f2qLJJLJ = it2.next().LJJLJ(j2);
            }
        }
        if ((interfaceC1112060f2qLJJLJ instanceof AbstractC1110800f0o) && (abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2qLJJLJ) != null) {
            return ol2(abstractC1110800f0o.LLIIIILZ(), abstractC1110800f0o.LJIL);
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void gu1(Room room, DataChannel dataChannel) {
        Map<String, String> map;
        String str;
        ServerDataV2Structure serverDataV2Structure;
        String str2;
        Integer numLJIIJJI;
        int iIntValue = 0;
        if (room != null) {
            try {
                EpiphronDecision epiphronDecision = room.decisions;
                if (epiphronDecision != null && (map = epiphronDecision.dataV2) != null && (str = map.get("public_screen_height")) != null && str.length() > 0 && (serverDataV2Structure = (ServerDataV2Structure) C2348809Ig.LJII(ServerDataV2Structure.class, str)) != null && (str2 = serverDataV2Structure.value) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            C1152540g68.LIZLLL = iIntValue;
        } else {
            C1152540g68.LIZJ = iIntValue;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void hS(long j, long j2) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                if (j2 == 0) {
                    c1111930f2d.getClass();
                } else {
                    int iLJJZ = c1111930f2d.LJJZ(j2);
                    if (iLJJZ != -1) {
                        c1111930f2d.LJZ(iLJJZ);
                    } else {
                        c1111930f2d.LLLLLZ.LIZIZ(new ARunnableS20S0100100_17(j2, c1111930f2d, 4));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final boolean ol2(C1109770ez9 c1109770ez9, AbstractC1136060ffY abstractC1136060ffY) {
        C1109010exv.LIZ.getClass();
        final long j = c1109770ez9.LJIIZILJ;
        C1109030exx c1109030exx = C1109030exx.LIZ;
        InterfaceC1109140ey8 interfaceC1109140ey8LIZ = C1109030exx.LIZ(new InterfaceC1109210eyF(j) { // from class: X.0eyB
            @Override // X.InterfaceC1109210eyF
            public final boolean LIZ(InterfaceC1109140ey8 interfaceC1109140ey8) {
                return interfaceC1109140ey8.LJIILIIL();
            }
        });
        if (interfaceC1109140ey8LIZ != null) {
            interfaceC1109140ey8LIZ.LIZJ(c1109770ez9);
            return false;
        }
        C1109020exw c1109020exw = new C1109020exw(j);
        c1109020exw.LIZJ = true;
        c1109020exw.LIZIZ = UserService.getInstance().user().LJIJJLI();
        c1109020exw.LJFF = abstractC1136060ffY;
        C1109010exv.LJFF.put(j, c1109020exw);
        C786410Ut5.LJJZZIII(C1109010exv.LJIIIZ, new ARunnableS117S0100000_17(c1109020exw, 318));
        C480460Ism.LIZ().getClass();
        InterfaceC420801kM interfaceC420801kMLJJLL = ((PinApi) C480460Ism.LIZLLL(PinApi.class)).pin(j, abstractC1136060ffY.getMessageType().wsMethod, GsonProtectorUtils.toJson((Gson) C1109010exv.LJIIJ.getValue(), abstractC1136060ffY)).LJIILIIL(new C0UO0()).LJJLL(new AfS5S0200100_17(j, c1109020exw, c1109770ez9, 8), new AfS6S0100100_17(j, c1109020exw, 21));
        LongSparseArray<List<InterfaceC420801kM>> longSparseArray = C1109010exv.LJII;
        List<InterfaceC420801kM> arrayList = longSparseArray.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            longSparseArray.put(j, arrayList);
        }
        arrayList.add(interfaceC420801kMLJJLL);
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void tV1(long j, C1109560eyo c1109560eyo) {
        List<InterfaceC1109050exz> list = C1109030exx.LIZIZ.get(j);
        if (list != null) {
            Iterator<InterfaceC1109050exz> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().VX0(c1109560eyo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1109600eys<? extends InterfaceC1112060f2q> CD2(long j, final C1109240eyI c1109240eyI, boolean z) {
        boolean z2;
        InterfaceC1109140ey8 interfaceC1109140ey8LIZ;
        C1109280eyM c1109280eyM;
        C1109030exx c1109030exx = C1109030exx.LIZ;
        C1109010exv c1109010exv = C1109010exv.LIZ;
        EnumC1108030ewL enumC1108030ewL = EnumC1108030ewL.INTERRUPT;
        C1109270eyL c1109270eyL = new C1109270eyL();
        c1109010exv.getClass();
        Pair pairLJIJI = C1109010exv.LJIJI(j, enumC1108030ewL, c1109270eyL);
        if (pairLJIJI.getFirst() == null && pairLJIJI.getSecond() == null) {
            z2 = false;
        } else {
            z2 = true;
            DataChannel dataChannel = C1109030exx.LIZLLL.get(j);
            if (dataChannel != null && (interfaceC1109140ey8LIZ = C1109030exx.LIZ(new InterfaceC1109210eyF() { // from class: X.0ey9
                @Override // X.InterfaceC1109210eyF
                public final boolean LIZ(InterfaceC1109140ey8 interfaceC1109140ey8) {
                    int iLIZLLL = interfaceC1109140ey8.LIZLLL();
                    c1109240eyI.getClass();
                    if (iLIZLLL == 1) {
                        return true;
                    }
                    return false;
                }
            })) != null) {
                interfaceC1109140ey8LIZ.LIZIZ(dataChannel, (C1109020exw) pairLJIJI.getFirst(), (C1109020exw) pairLJIJI.getSecond());
            }
        }
        C1109600eys c1109600eysKX1 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).kX1(c1109240eyI.LIZ);
        if (c1109600eysKX1 != null) {
            if (!z && !z2) {
                c1109280eyM = 0;
            } else {
                c1109280eyM = new Object() { // from class: X.0eyM
                };
            }
            ((InterfaceC1112060f2q) c1109600eysKX1.LIZ()).LJJLIIIJJIZ().LIZ = false;
            ((InterfaceC1112060f2q) c1109600eysKX1.LIZ()).LJJLIIIJJIZ().LIZIZ = true;
            List<InterfaceC1109050exz> list = C1109030exx.LIZIZ.get(j);
            if (list != null) {
                Iterator<InterfaceC1109050exz> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().ub2(c1109600eysKX1, c1109280eyM);
                }
            }
        }
        return c1109600eysKX1;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void GA1(long j, C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, Object obj) {
        List<InterfaceC1109050exz> list = C1109030exx.LIZIZ.get(j);
        if (list != null) {
            Iterator<InterfaceC1109050exz> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().ON(c1109600eys, obj);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Gn1(long j, long j2, AbstractC1110520f0M abstractC1110520f0M) {
        ChatMessage chatMessage;
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                InterfaceC1112060f2q interfaceC1112060f2qLJJZZIII = c1111930f2d.LJJZZIII(j2);
                if (interfaceC1112060f2qLJJZZIII != null) {
                    interfaceC1112060f2qLJJZZIII.LJJLIIIJJIZ().LIZ = true;
                    if ((interfaceC1112060f2qLJJZZIII instanceof C1110310f01) && (chatMessage = (ChatMessage) ((AbstractC1110800f0o) interfaceC1112060f2qLJJZZIII).LJIL) != null) {
                        chatMessage.communityflaggedStatus = 2;
                    }
                    c1111930f2d.LLIFFJFJJ(interfaceC1112060f2qLJJZZIII);
                } else {
                    c1111930f2d.LJLILLLLZI(null, abstractC1110520f0M, true);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void NL0(long j, long j2, AbstractC1136060ffY abstractC1136060ffY) {
        InterfaceC1112060f2q interfaceC1112060f2qLJJLIIIJILLIZJL;
        int iLJJZ;
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                c1111930f2d.getClass();
                if (j2 != 0 && (interfaceC1112060f2qLJJLIIIJILLIZJL = c1111930f2d.LJJLIIIJILLIZJL(abstractC1136060ffY)) != null && (iLJJZ = c1111930f2d.LJJZ(j2)) != -1) {
                    c1111930f2d.LJZL(iLJJZ, interfaceC1112060f2qLJJLIIIJILLIZJL, null);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void UE2(long j, InterfaceC1112060f2q interfaceC1112060f2q, Object obj) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                c1111930f2d.LLLLLZ.LIZJ(new ARunnableS50S0300000_17(c1111930f2d, interfaceC1112060f2q, obj, 10));
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C1109070ey1 YM0(LifecycleOwner lifecycleOwner, Context context, ChatMessage chatMessage) {
        C1109070ey1 c1109070ey1 = new C1109070ey1(context, null, 0);
        C1110170ezn c1110170ezn = new C1110170ezn(chatMessage, lifecycleOwner);
        c1109070ey1.LLILLJJLI.setText(c1110170ezn.LLJLL());
        TextView textView = c1109070ey1.LL;
        CharSequence content = c1110170ezn.getContent();
        if (content != null) {
            C786410Ut5.LLIL(textView, 0);
            textView.setText(content);
        } else {
            C786410Ut5.LLIL(textView, 8);
        }
        Collection<AbstractC498530Jgp<? extends AbstractC521080Kc6>> collectionLLJLILLLLZIIL = c1110170ezn.LLJLILLLLZIIL();
        if (collectionLLJLILLLLZIIL.isEmpty()) {
            C786410Ut5.LLJZ(c1109070ey1.LLILLL, 8);
            return c1109070ey1;
        }
        c1109070ey1.LLILLL.setBadges(C19719512Dh.LIZIZ(collectionLLJLILLLLZIIL));
        C786410Ut5.LLJZ(c1109070ey1.LLILLL, 0);
        return c1109070ey1;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final InterfaceC1112060f2q aA1(int i, long j, long j2) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return ((C1111930f2d) ListProtector.get(list, i)).LJJZZIII(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bh0(long r14, com.bytedance.android.livesdkapi.message.LiveChatMessageSEI r16, com.bytedance.android.livesdkapi.message.LiveChatMsgSequenceSEI r17) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.PublicScreenService.bh0(long, com.bytedance.android.livesdkapi.message.LiveChatMessageSEI, com.bytedance.android.livesdkapi.message.LiveChatMsgSequenceSEI):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Tjb] */
    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void gu(final Room room, final DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        Boolean boolValueOf;
        String str;
        if (dataChannel == null || room == null) {
            return;
        }
        C1109030exx.LIZLLL.put(room.getId(), dataChannel);
        C1109010exv.LIZ.getClass();
        LongSparseArray<DataChannel> longSparseArray = C1109010exv.LIZIZ;
        if (longSparseArray.get(room.getId()) == null) {
            longSparseArray.put(room.getId(), dataChannel);
            if (!C1109010exv.LIZLLL(room)) {
                if (C500260Jjc.LJIIZILJ(dataChannel) || C01C5.LIZ(dataChannel)) {
                    PinInfo pinInfo = room.getPinInfo();
                    if (pinInfo != null) {
                        boolValueOf = Boolean.valueOf(pinInfo.pinEnabled);
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJIFFI(boolValueOf)) {
                        str = "no permission";
                    } else if (room.isScreenshot) {
                        str = "screen shot room";
                    } else {
                        str = "live voice room";
                    }
                    C472890IgZ.LIZIZ(1, room.getId(), str, false);
                }
                C1109010exv.LIZJ.put(room.getId(), 1);
            } else {
                C1109010exv.LIZJ.put(room.getId(), 0);
                if (LiveAvoidNotifySetting.INSTANCE.enablePinMessage()) {
                    ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).sf(dataChannel, C1697810uHb.LJIIJJI(C1107810evz.LJIIJJI, C1107810evz.LJIIL, C1107810evz.LJIILJJIL, C1107810evz.LJIILIIL, C1107810evz.LJIILL, C1107810evz.LJIIZILJ, C1107810evz.LJIJ, C1107810evz.LJ, C1107810evz.LJFF, C1107810evz.LJIJJLI, C1107810evz.LJJI), new InterfaceC1107760evu() { // from class: X.0ew2
                        @Override // X.InterfaceC1107760evu
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1107760evu
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1107760evu
                        public final void LIZIZ(C1107810evz c1107810evz, boolean z, C1107780evw c1107780evw) {
                            AbstractC1136060ffY abstractC1136060ffY;
                            boolean z2 = C1109010exv.LJIIL;
                            if (z2) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[AvoidNotify][PinMessage][onVisibleChanged] business is ");
                                sbLIZ.append(c1107810evz.LIZ);
                                sbLIZ.append(", visible = ");
                                sbLIZ.append(z);
                                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            C1107810evz c1107810evz2 = C1107810evz.LJIIJJI;
                            if (!Intrinsics.LJFF(c1107810evz, c1107810evz2) && !Intrinsics.LJFF(c1107810evz, C1107810evz.LJIILJJIL) && !Intrinsics.LJFF(c1107810evz, C1107810evz.LJIILL)) {
                                C1109010exv.LIZ.getClass();
                                Integer num = (Integer) ((Map) C1109010exv.LJIIJJI.getValue()).get(c1107810evz);
                                if (num == null) {
                                    if (!z2) {
                                        return;
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("business ");
                                    sbLIZ2.append(c1107810evz.LIZ);
                                    sbLIZ2.append(" is invalid");
                                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                                if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJI)) {
                                    if (z) {
                                        C1109010exv.LJIILJJIL(num.intValue(), room.getId());
                                        return;
                                    } else {
                                        C1109010exv.LJIILL(room.getId(), num.intValue(), EnumC1108030ewL.INTERRUPT);
                                        return;
                                    }
                                }
                                if (z) {
                                    if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIZILJ)) {
                                        C1109020exw c1109020exwLIZJ = C1109010exv.LIZJ(room.getId());
                                        if (c1109020exwLIZJ != null) {
                                            abstractC1136060ffY = c1109020exwLIZJ.LJFF;
                                        } else {
                                            abstractC1136060ffY = null;
                                        }
                                        if (abstractC1136060ffY instanceof AISummaryMessage) {
                                            return;
                                        }
                                    }
                                    C1109010exv.LJIILL(room.getId(), num.intValue(), EnumC1108030ewL.INTERRUPT);
                                    return;
                                }
                                C1109010exv.LJIILJJIL(num.intValue(), room.getId());
                                return;
                            }
                            InterfaceC1097760efm interfaceC1097760efm = (InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
                            DataChannel dataChannel2 = dataChannel;
                            C1107810evz c1107810evz3 = C1107810evz.LJIILL;
                            boolean z3 = interfaceC1097760efm.LIZLLL(dataChannel2, C1697810uHb.LJIIJJI(c1107810evz2, c1107810evz3)).LIZ;
                            boolean z4 = interfaceC1097760efm.LIZLLL(dataChannel, C1697810uHb.LJIIJJI(C1107810evz.LJIILJJIL, c1107810evz3)).LIZ;
                            int i = 8;
                            if (!z3 && !z4) {
                                C1109010exv c1109010exv = C1109010exv.LIZ;
                                long id = room.getId();
                                c1109010exv.getClass();
                                C1109010exv.LJIILJJIL(8, id);
                                C1109010exv.LJIILJJIL(16, room.getId());
                                return;
                            }
                            C1109010exv c1109010exv2 = C1109010exv.LIZ;
                            long id2 = room.getId();
                            if (!z3) {
                                i = 16;
                            }
                            EnumC1108030ewL enumC1108030ewL = EnumC1108030ewL.INTERRUPT;
                            c1109010exv2.getClass();
                            C1109010exv.LJIILL(id2, i, enumC1108030ewL);
                        }
                    }, "PinMessage", null, true);
                } else {
                    dataChannel.EQ2(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(room, 732));
                    dataChannel.EQ2(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(room, 733));
                    dataChannel.EQ2(lifecycleOwner, DrawGuessStatusVisibilityChannel.class, new AwS596S0100000_17(room, 734));
                    dataChannel.EQ2(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, new AwS596S0100000_17(room, 735));
                    dataChannel.EQ2(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, new AwS596S0100000_17(room, 736));
                    dataChannel.EQ2(lifecycleOwner, FrameL2SlotVisibilityChannel.class, new AwS596S0100000_17(room, 737));
                    dataChannel.EQ2(lifecycleOwner, FrameSlotVisibilityChannel.class, new AwS596S0100000_17(room, 738));
                    dataChannel.EQ2(lifecycleOwner, PartnershipPromoteGameCardShowChannel.class, new AwS596S0100000_17(room, 739));
                    dataChannel.EQ2(lifecycleOwner, CommentStatusChannel.class, new AwS596S0100000_17(room, 740));
                    dataChannel.EQ2(lifecycleOwner, LivePinCardVisibilityChannel.class, new AwS596S0100000_17(room, 731));
                }
                dataChannel.EQ2(lifecycleOwner, RoomUserChannel.class, new AwS596S0100000_17(room, 729));
                dataChannel.EQ2(lifecycleOwner, AdminPermissionUpdateChannel.class, new AwS596S0100000_17(room, 730));
            }
            C1151720g4o c1151720g4o = new C1151720g4o(room, 29);
            C1109010exv.LJIIIIZZ.put(room.getId(), c1151720g4o);
            IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.PIN_MESSAGE.getIntType(), c1151720g4o);
                iMessageManager.addMessageListener(C001A.NEW_PIN_MESSAGE.getIntType(), c1151720g4o);
            }
        }
        this.LLJ = new InterfaceC1210360hbO(dataChannel) { // from class: X.0Tjb
            public final DataChannel LIZ;
            public final boolean LIZIZ;

            @Override // X.InterfaceC1210360hbO
            public final int LIZ() {
                return InterfaceC1106030et7.G5.LIZIZ().booleanValue() ? 2131843715 : 2131844578;
            }

            @Override // X.InterfaceC1210360hbO
            public final boolean LIZIZ() {
                return C755070Tjd.LIZ(C500260Jjc.LJIIZILJ(this.LIZ));
            }

            @Override // X.InterfaceC1210360hbO
            public final void LIZJ() {
                DataChannel dataChannel2;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_translation_click");
                c474500IjALIZ.LJIJJLI(this.LIZ);
                c474500IjALIZ.LJJIIZI(LJ());
                c474500IjALIZ.LIZ();
                C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.G5;
                c20337914i1.LJFF(Boolean.valueOf(!c20337914i1.LIZIZ().booleanValue()));
                InterfaceC1106030et7.I5.LJFF(Boolean.TRUE);
                InterfaceC1106030et7.H5.LJFF(Boolean.FALSE);
                if (!this.LIZIZ) {
                    C766270U4b.LIZLLL(c20337914i1.LIZIZ().booleanValue() ? 2131844577 : 2131844573);
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_translation_update");
                c474500IjALIZ2.LJIJJLI(this.LIZ);
                Map mapLJ = LJ();
                HashMap map = (HashMap) mapLJ;
                map.put("from_status", !c20337914i1.LIZIZ().booleanValue() ? "on" : "off");
                map.put("to_status", c20337914i1.LIZIZ().booleanValue() ? "on" : "off");
                c474500IjALIZ2.LJJIIZI(mapLJ);
                c474500IjALIZ2.LIZ();
                if (c20337914i1.LIZIZ().booleanValue()) {
                    C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_translation_open_show");
                    c474500IjALIZ3.LJIJJLI(this.LIZ);
                    Map mapLJ2 = LJ();
                    HashMap map2 = (HashMap) mapLJ2;
                    map2.remove("from_status");
                    map2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                    c474500IjALIZ3.LJJIIZI(mapLJ2);
                    c474500IjALIZ3.LIZ();
                }
                if (!this.LIZIZ || (dataChannel2 = this.LIZ) == null) {
                    return;
                }
                dataChannel2.FQ2(LiveAutoTranslateNotify.class);
            }

            @Override // X.InterfaceC1210360hbO
            public final boolean LIZLLL() {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_translation_show");
                c474500IjALIZ.LJIJJLI(this.LIZ);
                c474500IjALIZ.LJJIIZI(LJ());
                c474500IjALIZ.LIZ();
                return InterfaceC1106030et7.G5.LIZIZ().booleanValue();
            }

            public final Map LJ() {
                Room room2;
                User owner;
                Room room3;
                HashMap map = new HashMap();
                DataChannel dataChannel2 = this.LIZ;
                long id = 0;
                map.put("room_id", String.valueOf((dataChannel2 == null || (room3 = (Room) dataChannel2.gg0(RoomChannel.class)) == null) ? 0L : room3.getId()));
                DataChannel dataChannel3 = this.LIZ;
                if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null && (owner = room2.getOwner()) != null) {
                    id = owner.getId();
                }
                map.put("anchor_id", String.valueOf(id));
                map.put("type", "global_default_on");
                map.put("from_status", InterfaceC1106030et7.G5.LIZIZ().booleanValue() ? "on" : "off");
                map.put("position", "panel");
                return map;
            }

            {
                int value;
                this.LIZ = dataChannel;
                if (C500260Jjc.LJIIZILJ(dataChannel)) {
                    value = LiveAutoTranslateModelAnchorSetting.INSTANCE.getValue();
                } else {
                    value = LiveAutoTranslateModelAudienceSetting.INSTANCE.getValue();
                }
                this.LIZIZ = value > 1;
            }
        };
        C1090040eTK c1090040eTK = C1090040eTK.LL;
        C1090040eTK.LLJIJIL = dataChannel;
        C1090040eTK.LLJI = room;
        IMessageManager iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.COMMENT_TRAY_MESSAGE.getIntType(), c1090040eTK);
        }
        DataChannel dataChannel2 = C1090040eTK.LLJIJIL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(lifecycleOwner, CommentComboTrayEvent.class, AFwS254S0000000_17.get$arr$(449));
            dataChannel2.BQ2(lifecycleOwner, CommentPinWidgetVisibility.class, AFwS254S0000000_17.get$arr$(450));
            dataChannel2.BQ2(lifecycleOwner, DrawGuessStatusVisibilityChannel.class, AFwS254S0000000_17.get$arr$(451));
            dataChannel2.BQ2(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, AFwS254S0000000_17.get$arr$(452));
            dataChannel2.BQ2(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, AFwS254S0000000_17.get$arr$(453));
            dataChannel2.BQ2(lifecycleOwner, WatchFocusWidgetVisibility.class, AFwS254S0000000_17.get$arr$(454));
            dataChannel2.BQ2(lifecycleOwner, ProgrammedPinMsgVisibility.class, AFwS254S0000000_17.get$arr$(455));
            dataChannel2.BQ2(lifecycleOwner, LiveAddHotCommentMuteRuleEvent.class, AFwS254S0000000_17.get$arr$(456));
        }
        DataChannelGlobal.LLILZ.CQ2(HistoryInfoChannel.class, lifecycleOwner, new AwS596S0100000_17(this, 292));
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void ke0(long j, long j2, C1113480f58 c1113480f58) {
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                InterfaceC1112060f2q interfaceC1112060f2qLJJZZIII = c1111930f2d.LJJZZIII(j2);
                if (interfaceC1112060f2qLJJZZIII != null) {
                    c1111930f2d.LLLLLZ.LIZJ(new ARunnableS50S0300000_17(c1111930f2d, interfaceC1112060f2qLJJZZIII, c1113480f58, 10));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void sy(long j, C1109600eys<? extends InterfaceC1112060f2q> c1109600eys, boolean z) {
        C1109270eyL c1109270eyL;
        if (c1109600eys == null) {
            return;
        }
        if (c1109600eys instanceof C1109610eyt) {
            PinMessage pinMessage = ((C1109610eyt) c1109600eys).LJIIIZ.LJI;
            if (pinMessage != null) {
                C1109010exv.LIZ.getClass();
                C1109010exv.LJIJ(j, pinMessage);
                return;
            }
            return;
        }
        C1109030exx c1109030exx = C1109030exx.LIZ;
        c1109600eys.LJFF = true;
        if (z) {
            c1109270eyL = new C1109270eyL();
        } else {
            c1109270eyL = null;
        }
        List<InterfaceC1109050exz> list = C1109030exx.LIZIZ.get(j);
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1109050exz> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().Be2(c1109600eys, c1109270eyL);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Jf0(long j, AbstractC1136060ffY abstractC1136060ffY, boolean z, final C1114400f6c c1114400f6c) {
        final C238400w2 c238400w2 = new C238400w2();
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            final int i = 0;
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d2 = c1111930f2d;
                    c1111930f2d2.LLLLLZ.LIZIZ(new ARunnableS10S0310000_17(abstractC1136060ffY, new InterfaceC1109220eyG() { // from class: X.0ey5
                        @Override // X.InterfaceC1109220eyG
                        public final void LIZ(long j2) {
                            InterfaceC1109220eyG interfaceC1109220eyG;
                            c238400w2.element = j2;
                            if (i == this.LLILLL.size() - 1 && (interfaceC1109220eyG = c1114400f6c) != null) {
                                interfaceC1109220eyG.LIZ(c238400w2.element);
                            }
                        }
                    }, c1111930f2d2, z, 2));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        if (c1114400f6c != null) {
            c1114400f6c.LIZ(c238400w2.element);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C784630UqD zL(Context context, InterfaceC776970Udr interfaceC776970Udr, C777030Udx c777030Udx, DataChannel dataChannel) {
        return new C784630UqD(context, interfaceC776970Udr, c777030Udx, dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final ChatMessage v41(long j, String str, User user, C520890Kbn c520890Kbn, Long l) {
        return C087600Uo.LIZ(j, str, user, 0, c520890Kbn, false, true, l, "star_comment");
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void X30(C1109770ez9 c1109770ez9, EmoteModel emoteModel, long j, long j2, long j3, int i) {
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new C519870Ka9();
        }
        C519870Ka9 c519870Ka9 = this.LLJIJIL;
        if (c519870Ka9 != null) {
            c519870Ka9.LIZ(c1109770ez9, emoteModel, j, j2, j3, i);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final GiftHistoryWidgetHelper f50(LifecycleOwner lifecycleOwner, DataChannel dataChannel, TextView textView, C20516015Pq c20516015Pq, boolean z, C1113690f5T c1113690f5T) {
        return new GiftHistoryWidgetHelper(lifecycleOwner, dataChannel, textView, c20516015Pq, z, c1113690f5T);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final ChatMessage jw2(long j, String str, User user, int i, C520890Kbn c520890Kbn, boolean z) {
        return C087600Uo.LIZ(j, str, user, i, c520890Kbn, true, z, null, null);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void T60(long j, Text text, long j2, PunishEventInfo punishEventInfo, int i, int i2, String str, Integer num) {
        int iIntValue;
        BottomMessage bottomMessage = new BottomMessage();
        long j3 = -System.currentTimeMillis();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = j3;
        boolean z = true;
        commonMessageData.showMsg = true;
        commonMessageData.createTime = C963140bAe.LIZIZ();
        commonMessageData.displayText = text;
        bottomMessage.baseMessage = commonMessageData;
        bottomMessage.content = "";
        bottomMessage.duration = j2;
        bottomMessage.showType = 1;
        bottomMessage.textType = 0;
        bottomMessage.bizType = i;
        bottomMessage.punishInfo = punishEventInfo;
        bottomMessage.style = i2;
        bottomMessage.detailUrl = str;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        bottomMessage.floatIconType = iIntValue;
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = this.LLILLL.get(j);
        if (list != null) {
            for (C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d : list) {
                if (!c1111930f2d.LIZ()) {
                    c1111930f2d.LJLI(bottomMessage);
                    z = false;
                }
            }
            if (z) {
                this.LLIZ.put(j, bottomMessage);
                return;
            }
            return;
        }
        this.LLIZ.put(j, bottomMessage);
    }
}
