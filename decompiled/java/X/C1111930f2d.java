package X;

import X.InterfaceC1112050f2p;
import Y.AComparatorS36S0000000_17;
import Y.AComparatorS515S0100000_17;
import Y.AObjectS115S0000000_12;
import Y.AObjectS12S0600000_12;
import Y.AObjectS1S0900000_12;
import Y.AObjectS288S0200000_12;
import Y.AObjectS355S0100000_12;
import Y.AObjectS360S0100000_17;
import Y.ARunnableS10S0310000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS50S0300000_17;
import Y.ARunnableS86S0200000_17;
import Y.AfS136S0000000_13;
import Y.AfS153S0200000_17;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.commonactionpanel.ISheetPanelService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.ShowReplyDialogEvent;
import com.bytedance.android.live.publicscreen.impl.PublicScreenDowngradeChannel;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.live.publicscreen.impl.model.FoldMessageReleaseConfig;
import com.bytedance.android.live.publicscreen.impl.setting.LiveCommentOffKeepPublicScreenSetting;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenBufferUnloadSetting;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.CommentStatusChannel;
import com.bytedance.android.livesdk.dataChannel.FastScrollPredict;
import com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfMemberMessageShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveQuickReturnOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAnchorPublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateStateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleDisposeTimingOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveForcePublicScreenIntervalSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageItemsSampleRateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveProgressiveReleaseHistoryMsgCnt;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAiSummaryOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenBackupMessageBufferSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenBackupMessageExpiredTime;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenBackupMessageSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenChatHolderCacheConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenContextNullOnDetachSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageDefaultPrioritySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSeiAlignBufferSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenSeiMsgSequenceSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenViewMetricsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.LiveChatMessageSEI;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1111930f2d<T extends InterfaceC1112050f2p> extends AbstractC1112030f2n<T> implements OnIMMessageListener, InterfaceC1109340eyS, InterfaceC1112820f44, InterfaceC1112920f4E {
    public static final LivePublicScreenConfig LLZZZIL = LivePublicScreenConfigSetting.getValue();
    public static final LivePublicScreenConfig LLZZZZ = LiveAnchorPublicScreenConfigSetting.getValue();
    public static final boolean a = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    public static final int b = LivePublicScreenMessageSeiAlignBufferSizeSetting.count();
    public static final long c = LiveBeingAtConfigSetting.getValue().messageConsumeInterval;
    public static final long d = LiveBeingAtConfigSetting.getValue().messageLifeDuration;
    public volatile BottomMessage LLIZ;
    public volatile C1096670ee1 LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJJIJIIJIL;
    public int LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final Queue<InterfaceC1112060f2q> LLJJJJLIIL;
    public final Queue<InterfaceC1112060f2q> LLJJL;
    public final Queue<InterfaceC1112060f2q> LLJJLIIIJLLLLLLLZ;
    public final C1112580f3g<InterfaceC1112060f2q> LLJL;
    public Map<String, Pair<Integer, Integer>> LLJLIL;
    public final C1112580f3g<C1112670f3p> LLJLILLLLZIIL;
    public C1111990f2j<InterfaceC1112060f2q> LLJLL;
    public final List<InterfaceC1112060f2q> LLJLLIL;
    public final C1112000f2k LLJLLL;
    public final C1112210f35 LLJZ;
    public final List<InterfaceC1112730f3v> LLJZIJLIL;
    public final Queue<InterfaceC1112060f2q> LLL;
    public final LimitedSizeHashMap<Long, Object> LLLF;
    public final List<InterfaceC1112320f3G> LLLFF;
    public final List<InterfaceC1112060f2q> LLLFFI;
    public final AComparatorS515S0100000_17 LLLFZ;
    public boolean LLLI;
    public final List<InterfaceC1112320f3G> LLLII;
    public boolean LLLIIII;
    public C11RK LLLIIIIL;
    public final C1085940eMi LLLIIIL;
    public boolean LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public C1109430eyb LLLILZ;
    public final boolean LLLILZJ;
    public volatile long LLLILZLLLI;
    public Map<Class<? extends InterfaceC1112060f2q>, InterfaceC1112300f3E<? extends InterfaceC1112720f3u>> LLLIZZ;
    public Map<Class<? extends AbstractC1136060ffY>, InterfaceC1110780f0m<? extends AbstractC1136060ffY>> LLLJ;
    public C1088640eR4 LLLJIL;
    public C1109770ez9 LLLJL;
    public final String LLLL;
    public final BPEAHandler LLLLII;
    public C1112830f45 LLLLIIIILLL;
    public C1112280f3C LLLLIIL;
    public final List<InterfaceC1112320f3G> LLLLIILL;
    public InterfaceC1112060f2q LLLLIILLL;
    public InterfaceC1112320f3G LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public Room LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public C1110240ezu LLLLLLJ;
    public C1110240ezu LLLLLLL;
    public float LLLLLLLLL;
    public float LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public long LLLLLLZ;
    public volatile boolean LLLLLLZZ;
    public final C1112120f2w LLLLLZ;
    public long LLLLLZIL;
    public int LLLLLZL;
    public final boolean LLLLZ;
    public boolean LLLLZI;
    public final boolean LLLLZIL;
    public int LLLLZLL;
    public final LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig LLLLZLLIL;
    public boolean LLLLZLLLI;
    public TextFormat LLLZ;
    public TextFormat LLLZI;
    public boolean LLLZIIL;
    public final boolean LLLZIL;
    public RecycleSource LLLZL;
    public FoldMessageReleaseConfig LLLZLL;
    public boolean LLLZLZ;
    public int LLLZZ;
    public Boolean LLLZZIL;
    public final C1111960f2g LLZ;
    public InterfaceC1109310eyP LLZIL;
    public final C1112260f3A LLZILL;
    public int LLZL;
    public final ARunnableS117S0100000_17 LLZLI;
    public final ARunnableS117S0100000_17 LLZLL;
    public final ARunnableS117S0100000_17 LLZLLIL;
    public boolean LLZLLLL;
    public final ARunnableS117S0100000_17 LLZZ;
    public final ARunnableS117S0100000_17 LLZZJLIL;
    public boolean LLZZLLIL;
    public final long LLILZ = LiveForcePublicScreenIntervalSetting.getValue();
    public volatile long LLILZIL = 0;
    public volatile CharSequence LLILZLL = "";
    public volatile ConcurrentLinkedDeque<BottomMessage> LLIZLLLIL = new ConcurrentLinkedDeque<>();
    public int LLJILJILJ = 0;
    public int LLJILLL = 200;
    public int LLJJ = 200;
    public final C1112290f3D LLJJI = new InterfaceC482090IvP() { // from class: X.0f3D
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            int iIntValue = ((Integer) c0is4.LIZ).intValue();
            C1111930f2d c1111930f2d = this.LIZ;
            int i = c1111930f2d.LLJJ;
            if (iIntValue > 0) {
                i /= iIntValue;
            }
            if (c1111930f2d.LLJILLL != i) {
                c1111930f2d.LLJILLL = i;
            }
        }
    };
    public final C1086590eNl LLJJIII = new InterfaceC482090IvP() { // from class: X.0eNl
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(PublicScreenDowngradeChannel.class, c0is4.LIZ);
            }
        }
    };
    public final C1087360eP0 LLJJIJI = new InterfaceC482090IvP() { // from class: X.0eP0
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            boolean z;
            C1109770ez9 c1109770ez9 = this.LIZ.LLLJL;
            if (((Integer) c0is4.LIZ).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            c1109770ez9.LJFF = z;
        }
    };
    public final ArrayList<String> LLJJIJIL = new ArrayList<>(b);
    public final C760300Ts4<T> LLJJJ = new C760300Ts4<>();

    @Override // X.InterfaceC1110630f0X, X.InterfaceC1109340eyS
    public boolean LIZ() {
        return this instanceof C1112080f2s;
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJJIJIIJIL() {
        for (int i = 0; i < this.LLJLL.LJFF(); i++) {
            InterfaceC1112060f2q interfaceC1112060f2qLIZJ = this.LLJLL.LIZJ(i);
            if (interfaceC1112060f2qLIZJ.LJJIIZI()) {
                C234700vR c234700vRLJLJJLL = interfaceC1112060f2qLIZJ.LJLJJLL();
                if (c234700vRLJLJJLL == null || c234700vRLJLJJLL.LIZ || !interfaceC1112060f2qLIZJ.LLIL()) {
                    return;
                }
                c234700vRLJLJJLL.LIZ = true;
                this.LLLLLZ.LIZJ(new ARunnableS50S0300000_17(this, interfaceC1112060f2qLIZJ, new Object() { // from class: X.0f17
                }, 10));
                return;
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "public_screen";
    }

    @Override // X.InterfaceC1110630f0X
    public final C11NZ<List<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> LJI() {
        if (!this.LLLIIII) {
            return null;
        }
        C11RK c11rk = this.LLLIIIIL;
        if (c11rk != null) {
            c11rk.onComplete();
        } else {
            C786410Ut5.LJLIIL(LSPassThroughRecordSizeConfig.DEFAULT, this.LLLLII, this.LLZZJLIL);
        }
        C11RK c11rk2 = new C11RK();
        this.LLLIIIIL = c11rk2;
        return c11rk2;
    }

    @Override // X.InterfaceC1110630f0X
    public final int LJJ() {
        return ((PriorityQueue) this.LLJJJJLIIL).size();
    }

    @Override // X.InterfaceC1110630f0X
    public final int LJJIIJ() {
        return this.LLJL.size();
    }

    @Override // X.AbstractC1112030f2n
    public void LJJJJLL() {
        C1113050f4R c1113050f4R = new C1113050f4R();
        this.LLILLL = c1113050f4R;
        this.LL.LIZ(c1113050f4R);
        this.LL.LIZ(new C1113060f4S());
        if (LivePublicScreenMessageSyncSetting.getValue().seiEnableHost && !LIZ()) {
            this.LL.LIZ(new AbstractC1096380edY() { // from class: X.0f4P
                public final long LIZIZ = LivePublicScreenMessageSyncSetting.getValue().seiFrequency;
                public long LIZJ;
                public int LIZLLL;
                public final int LJ;
                public final int LJFF;
                public final int LJI;
                public AbstractC1273900jFs LJII;

                {
                    LivePublicScreenSeiMsgSequenceSetting livePublicScreenSeiMsgSequenceSetting = LivePublicScreenSeiMsgSequenceSetting.INSTANCE;
                    this.LJ = livePublicScreenSeiMsgSequenceSetting.getReportMsgIdInterval();
                    this.LJFF = livePublicScreenSeiMsgSequenceSetting.getReportMsgSeqInterval();
                    this.LJI = livePublicScreenSeiMsgSequenceSetting.msgCount();
                }

                @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
                public final void LJIILJJIL(AbstractC1136060ffY abstractC1136060ffY) {
                    AbstractC1273900jFs liveCore;
                    if (LJJJJIZL().LJI && !abstractC1136060ffY.isHistoryMessage && !abstractC1136060ffY.isLocalInsertMsg && SystemClock.elapsedRealtime() - this.LIZJ >= this.LIZIZ && (abstractC1136060ffY instanceof ChatMessage)) {
                        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
                        if (interfaceC769940UIe != null) {
                            liveCore = interfaceC769940UIe.getLiveCore();
                        } else {
                            liveCore = null;
                        }
                        LiveChatMessageSEI liveChatMessageSEI = new LiveChatMessageSEI();
                        liveChatMessageSEI.messageId = String.valueOf(abstractC1136060ffY.baseMessage.messageId);
                        if (liveCore != null) {
                            liveCore.LJJIZ("live_chat_message_delay", false, true, "1610665995", 1, new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, liveChatMessageSEI)));
                        }
                        this.LIZJ = SystemClock.elapsedRealtime();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
                @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJII(long r11, java.util.List r13) {
                    /*
                        Method dump skipped, instruction units count: 232
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1113030f4P.LJII(long, java.util.List):void");
                }
            });
        }
        if (LivePublicScreenViewMetricsSetting.getValue()) {
            C1112010f2l c1112010f2l = this.LL;
            AbstractC1110770f0l abstractC1110770f0l = new AbstractC1110770f0l() { // from class: X.0f3R
                public final Map<String, C1112450f3T> LIZIZ = new LinkedHashMap();

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112540f3c
                public final void onUnload() {
                    if (!this.LIZIZ.isEmpty()) {
                        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_public_screen_view_metrics")) {
                            Iterator it2 = ((LinkedHashMap) this.LIZIZ).entrySet().iterator();
                            while (it2.hasNext()) {
                                C1CC2.LJFF("ttlive_public_screen_view_metrics", new JSONObject(), null, ((C1112450f3T) ((Map.Entry) it2.next()).getValue()).LJIIZILJ);
                            }
                        }
                        ((LinkedHashMap) this.LIZIZ).clear();
                    }
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LIZ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    C1112450f3T c1112450f3TLJJJJIZL = LJJJJIZL(abstractC1111810f2R.LJIIJ());
                    if (c1112450f3TLJJJJIZL.LJ > 0) {
                        long jUptimeMillis = c1112450f3TLJJJJIZL.LJFF + (SystemClock.uptimeMillis() - c1112450f3TLJJJJIZL.LJ);
                        c1112450f3TLJJJJIZL.LJFF = jUptimeMillis;
                        c1112450f3TLJJJJIZL.LIZ++;
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("create_view_total_duration", jUptimeMillis);
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("create_view_count", c1112450f3TLJJJJIZL.LIZ);
                        c1112450f3TLJJJJIZL.LJ = 0L;
                    }
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJIIL(AbstractC1111020f1A<? extends InterfaceC1112060f2q> abstractC1111020f1A) {
                    abstractC1111020f1A.LLILLL = SystemClock.uptimeMillis();
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJIJI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    C1112450f3T c1112450f3TLJJJJIZL = LJJJJIZL(abstractC1111810f2R.LJIIJ());
                    if (c1112450f3TLJJJJIZL.LJIIIIZZ > 0) {
                        long jUptimeMillis = c1112450f3TLJJJJIZL.LJIIIZ + (SystemClock.uptimeMillis() - c1112450f3TLJJJJIZL.LJIIIIZZ);
                        c1112450f3TLJJJJIZL.LJIIIZ = jUptimeMillis;
                        c1112450f3TLJJJJIZL.LIZJ++;
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("layout_total_duration", jUptimeMillis);
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("layout_count", c1112450f3TLJJJJIZL.LIZJ);
                        c1112450f3TLJJJJIZL.LJIIIIZZ = 0L;
                    }
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    LJJJJIZL(abstractC1111810f2R.LJIIJ()).LJIIJ = SystemClock.uptimeMillis();
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJIFFI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    C1112450f3T c1112450f3TLJJJJIZL = LJJJJIZL(abstractC1111810f2R.LJIIJ());
                    if (c1112450f3TLJJJJIZL.LJI > 0) {
                        long jUptimeMillis = c1112450f3TLJJJJIZL.LJII + (SystemClock.uptimeMillis() - c1112450f3TLJJJJIZL.LJI);
                        c1112450f3TLJJJJIZL.LJII = jUptimeMillis;
                        c1112450f3TLJJJJIZL.LIZIZ++;
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("measure_total_duration", jUptimeMillis);
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("measure_count", c1112450f3TLJJJJIZL.LIZIZ);
                        c1112450f3TLJJJJIZL.LJI = 0L;
                    }
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJII(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    LJJJJIZL(abstractC1111810f2R.LJIIJ()).LJIIIIZZ = SystemClock.uptimeMillis();
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJIJ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    LJJJJIZL(abstractC1111810f2R.LJIIJ()).LJ = SystemClock.uptimeMillis();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJIJIIJIL(RecyclerView recyclerView) throws JSONException {
                    InterfaceC1111830f2T interfaceC1111830f2T;
                    AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> viewBinder;
                    if (LivePublicScreenChatHolderCacheConfigSetting.enableLog()) {
                        int childCount = recyclerView.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = recyclerView.getChildAt(i);
                            if ((childAt instanceof InterfaceC1111830f2T) && (interfaceC1111830f2T = (InterfaceC1111830f2T) childAt) != null && (viewBinder = interfaceC1111830f2T.getViewBinder()) != null) {
                                C1112450f3T c1112450f3TLJJJJIZL = LJJJJIZL(viewBinder.LJIIJ());
                                int i2 = c1112450f3TLJJJJIZL.LJIILL + 1;
                                c1112450f3TLJJJJIZL.LJIILL = i2;
                                c1112450f3TLJJJJIZL.LJIIZILJ.put("holder_count_in_screen", i2);
                                if (viewBinder instanceof C1111580f24) {
                                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                                    c1112450f3TLJJJJIZL.LJIILJJIL = LivePublicScreenChatHolderCacheConfigSetting.getCacheSize();
                                    c1112450f3TLJJJJIZL.LJIILLIIL = recyclerView.getRecycledViewPool().getRecycledViewCount(childViewHolder.getItemViewType());
                                    c1112450f3TLJJJJIZL.LJIIZILJ.put("holder_cache_size", c1112450f3TLJJJJIZL.LJIILJJIL);
                                    c1112450f3TLJJJJIZL.LJIIZILJ.put("holder_not_used_cache", c1112450f3TLJJJJIZL.LJIILLIIL);
                                }
                            }
                        }
                    }
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJIZ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    LJJJJIZL(abstractC1111810f2R.LJIIJ()).LJI = SystemClock.uptimeMillis();
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJJJIL(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    C1112450f3T c1112450f3TLJJJJIZL = LJJJJIZL(abstractC1111810f2R.LJIIJ());
                    if (c1112450f3TLJJJJIZL.LJIIJ > 0) {
                        long jUptimeMillis = c1112450f3TLJJJJIZL.LJIIJJI + (SystemClock.uptimeMillis() - c1112450f3TLJJJJIZL.LJIIJ);
                        c1112450f3TLJJJJIZL.LJIIJJI = jUptimeMillis;
                        c1112450f3TLJJJJIZL.LIZLLL++;
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("draw_total_duration", jUptimeMillis);
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("draw_count", c1112450f3TLJJJJIZL.LIZLLL);
                        c1112450f3TLJJJJIZL.LJIIJ = 0L;
                    }
                }

                public final C1112450f3T LJJJJIZL(String str) throws JSONException {
                    Object obj;
                    C1112450f3T c1112450f3T = (C1112450f3T) ((LinkedHashMap) this.LIZIZ).get(str);
                    if (c1112450f3T == null) {
                        c1112450f3T = new C1112450f3T(0);
                        c1112450f3T.LJIIZILJ.put("item_name", str);
                        JSONObject jSONObject = c1112450f3T.LJIIZILJ;
                        C1109770ez9 c1109770ez9 = this.LIZ;
                        C1109770ez9 c1109770ez92 = null;
                        if (c1109770ez9 == null) {
                            c1109770ez9 = null;
                        }
                        String str2 = "1";
                        if (c1109770ez9.LJJ) {
                            obj = "1";
                        } else {
                            obj = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("is_extended_comment_filed", obj);
                        JSONObject jSONObject2 = c1112450f3T.LJIIZILJ;
                        C1109770ez9 c1109770ez93 = this.LIZ;
                        if (c1109770ez93 != null) {
                            c1109770ez92 = c1109770ez93;
                        }
                        if (!c1109770ez92.LJI) {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject2.put("is_anchor", str2);
                        this.LIZIZ.put(str, c1112450f3T);
                    }
                    return c1112450f3T;
                }

                @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
                public final void LJI(AbstractC1111020f1A<? extends InterfaceC1112060f2q> abstractC1111020f1A, AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) throws JSONException {
                    if (LivePublicScreenChatHolderCacheConfigSetting.enableLog() && abstractC1111020f1A.LLILLL > 0) {
                        C1112450f3T c1112450f3TLJJJJIZL = LJJJJIZL(abstractC1111810f2R.LJIIJ());
                        c1112450f3TLJJJJIZL.LJIILIIL++;
                        long jUptimeMillis = c1112450f3TLJJJJIZL.LJIIL + (SystemClock.uptimeMillis() - abstractC1111020f1A.LLILLL);
                        c1112450f3TLJJJJIZL.LJIIL = jUptimeMillis;
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("holder_cached_duration", jUptimeMillis);
                        c1112450f3TLJJJJIZL.LJIIZILJ.put("holder_reused_count", c1112450f3TLJJJJIZL.LJIILIIL);
                        abstractC1111020f1A.LLILLL = 0L;
                    }
                }
            };
            ((ArrayList) c1112010f2l.LJFF).add(abstractC1110770f0l);
            ((ArrayList) c1112010f2l.LJI).add(abstractC1110770f0l);
        }
        C1112010f2l c1112010f2l2 = this.LL;
        C1112420f3Q c1112420f3Q = this.LLILLL.LLFII;
        ((ArrayList) c1112010f2l2.LJFF).add(c1112420f3Q);
        ((ArrayList) c1112010f2l2.LJI).add(c1112420f3Q);
        double value = LiveMessageItemsSampleRateSetting.getValue();
        if (value > 0.0d) {
            this.LL.LIZ(new C1113040f4Q(value));
        }
        this.LL.LIZ(new AbstractC1096380edY() { // from class: X.0f30
            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJFF() {
                C474820Ijg c474820Ijg;
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (c474820Ijg = (C474820Ijg) dataChannel.gg0(C1112640f3m.class)) == null) {
                    return;
                }
                c474820Ijg.LIZIZ = ((C1111930f2d) this).LLJLL.LJ();
                this.dataChannel.SX0(C1112640f3m.class, c474820Ijg);
            }
        });
        this.LL.LIZ(new AbstractC1096380edY() { // from class: X.0edX
            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void Cr() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LIZIZ() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
            public final void LIZJ(C1109770ez9 c1109770ez9) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJ(InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJFF() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIIIIZZ(InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIIIZ(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
            public final void LJIIJJI(View view, boolean z) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIILIIL() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIILL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIILLIIL(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i abstractC1111980f2i, boolean z, User user) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIIZILJ(InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIJ(int i) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIJJLI() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIL(int i) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJI() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIII() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIIJ(AbstractC1136060ffY abstractC1136060ffY) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIIJZLJL() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIIZ() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIIZI() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIJIIJI(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i<AbstractC1136060ffY> abstractC1111980f2i, long j, boolean z, User user) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIJIL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIJL() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIJLIJ(InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJIL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJJ(List<? extends InterfaceC1112060f2q> list, C1112880f4A c1112880f4A) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJJI(int i) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJJJ(int i) {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJJJJI() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
            public final void onPause() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
            public final void onResume() {
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
            public final void onUnload() {
            }

            public static boolean LJJJJJ() {
                String string;
                Long l;
                String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
                if (map == null || (string = map.get("anchor_id")) == null) {
                    C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
                    string = (c0ir5 == null || (l = c0ir5.LIZLLL) == null) ? "" : l.toString();
                }
                return Intrinsics.LJFF(strValueOf, string);
            }

            @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
            public final void LJIILJJIL(AbstractC1136060ffY abstractC1136060ffY) {
                long j;
                Object objValueOf;
                String str;
                long id;
                User owner;
                if (abstractC1136060ffY instanceof RoomMessage) {
                    RoomMessage roomMessage = (RoomMessage) abstractC1136060ffY;
                    long id2 = 0;
                    if (TextUtils.equals(roomMessage.scene, "user_fans_upgrade") || TextUtils.equals(roomMessage.scene, "user_join_fans")) {
                        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
                        if (c1095140ebYUw0 != null) {
                            j = c1095140ebYUw0.LIZ;
                        } else {
                            j = 0;
                        }
                        try {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_level_up_msg");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(Long.valueOf(j), "level");
                            Boolean bool = Boolean.TRUE;
                            c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, bool) ? 1 : 0), "is_self_see");
                            c474500IjALIZ.LIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (TextUtils.equals(roomMessage.scene, "team_challenge")) {
                        try {
                            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                            C1095140ebY c1095140ebYUw02 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
                            long jIb1 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Ib1();
                            String str2 = abstractC1136060ffY.baseMessage.displayText.key;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Object objValueOf2 = CardStruct.IStatusCode.DEFAULT;
                            if (c1095140ebYUw02 == null) {
                                objValueOf = CardStruct.IStatusCode.DEFAULT;
                            } else {
                                objValueOf = Long.valueOf(c1095140ebYUw02.LIZ);
                            }
                            linkedHashMap.put("fans_club_level", objValueOf.toString());
                            if (c1095140ebYUw02 != null) {
                                objValueOf2 = Integer.valueOf(c1095140ebYUw02.LJ);
                            }
                            linkedHashMap.put("fans_club_relation_status", objValueOf2.toString());
                            linkedHashMap.put("scores_to_next_level", String.valueOf(jIb1));
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_fans_club_team_mission_completed_msg");
                            c474500IjALIZ2.LJIL();
                            c474500IjALIZ2.LJJII(new Gson().LJIILL(linkedHashMap), "fans_club_relation_info");
                            if (Intrinsics.LJFF(Boolean.valueOf(LJJJJJ()), Boolean.TRUE)) {
                                str = "anchor";
                            } else {
                                str = "user";
                            }
                            c474500IjALIZ2.LJJII(str, "user_type");
                            if (room != null && (owner = room.getOwner()) != null) {
                                id = owner.getId();
                            } else {
                                id = 0;
                            }
                            c474500IjALIZ2.LJJII(Long.valueOf(id), "anchor_id");
                            if (room != null) {
                                id2 = room.getId();
                            }
                            c474500IjALIZ2.LJJII(Long.valueOf(id2), "room_id");
                            c474500IjALIZ2.LJJII(str2, "msg_text");
                            c474500IjALIZ2.LIZ();
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            }
        });
    }

    public void LJJJLIIL() {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            AnonymousClass0069.LIZIZ(this.dataChannel, iMessageManager, this, new AObjectS360S0100000_17((C1111930f2d) this, 120));
        }
    }

    public void LJJLIIIJJIZ() {
        T t = this.mView;
        if (t == 0 || ((InterfaceC1112050f2p) t).ex1() == null || ((InterfaceC1112050f2p) this.mView).ex1().getActivity() == null) {
            return;
        }
        this.LLILLJJLI = (PinMessageViewModel) ViewModelProviders.of(((InterfaceC1112050f2p) this.mView).ex1()).get(PinMessageViewModel.class);
    }

    public final InterfaceC1112320f3G LJJLIL() {
        if (((ArrayList) this.LLLFF).size() <= 0) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        InterfaceC1112320f3G interfaceC1112320f3G = null;
        while (i < ((ArrayList) this.LLLFF).size()) {
            interfaceC1112320f3G = (InterfaceC1112320f3G) ListProtector.get(this.LLLFF, i);
            if (interfaceC1112320f3G != null) {
                if (jElapsedRealtime - interfaceC1112320f3G.getCreateTime() <= d && !interfaceC1112320f3G.LJJJIL().LIZ) {
                    break;
                }
                ((LinkedList) this.LLLII).remove(interfaceC1112320f3G);
                interfaceC1112320f3G.LJJJIL().LIZ = true;
                ListProtector.remove(this.LLLFF, i);
                i--;
                interfaceC1112320f3G = null;
            }
            i++;
        }
        return interfaceC1112320f3G;
    }

    public final int LJJLL() {
        InterfaceC1112320f3G interfaceC1112320f3G = this.LLLLIL;
        if (interfaceC1112320f3G != null) {
            return this.LLJLL.LJI(interfaceC1112320f3G);
        }
        return -1;
    }

    public final boolean LJLIIIL() {
        return this.LLJLLL.LIZIZ() && !this.LLLI;
    }

    public void LJLIIL() {
        Room room;
        C1109770ez9 c1109770ez9 = this.LLLJL;
        if (c1109770ez9.LJI && (room = c1109770ez9.LJII) != null && room.getStreamType() == LiveMode.SCREEN_RECORD) {
            this.LLLIIII = true;
        }
    }

    public final boolean LJLJJI() {
        if (this.LLLJL.LJI) {
            this.LLLLLJLJLL = InterfaceC1106030et7.J5.LIZIZ().booleanValue();
        } else {
            this.LLLLLJLJLL = InterfaceC1106030et7.G5.LIZIZ().booleanValue();
        }
        if (this.LLLJL.LJI) {
            this.LLLLLL = InterfaceC1106030et7.L5.LIZIZ().booleanValue();
        } else {
            this.LLLLLL = InterfaceC1106030et7.I5.LIZIZ().booleanValue();
        }
        if (!this.LLLLLLIL) {
            return false;
        }
        if (this.LLLLLJLJLL) {
            return true;
        }
        return !this.LLLLLL && this.LLLZIL;
    }

    public boolean LJLJJL() {
        C1109770ez9 c1109770ez9 = this.LLLJL;
        return c1109770ez9 != null && c1109770ez9.LJFF() && this.LLLJL.LJI;
    }

    public final boolean LJLJJLL() {
        Room room = this.LLLJL.LJII;
        if (room != null) {
            return room.getRoomAuthStatus() == null || this.LLLJL.LJII.getRoomAuthStatus().isMessageEnable();
        }
        return false;
    }

    public final void LJLJL() {
        if (this.LLLLLIL) {
            boolean z = this.LLLLLLZ > 0 && SystemClock.elapsedRealtime() - this.LLLLLLZ > ((long) this.LLJIJIL);
            if (this.LLLLJ || !z) {
                return;
            }
            if (this.LLLLLILLIL) {
                this.LLLLLZ.LIZIZ.removeCallbacks(this.LLZLI);
            } else {
                this.LLLLLLZZ = true;
            }
            this.LLLLLZ.LIZIZ(this.LLZLI);
        }
    }

    public final void LJLLILLLL() {
        int iLJ = this.LLJLL.LJ();
        while (true) {
            if (((PriorityQueue) this.LLL).size() <= 0) {
                break;
            }
            InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) ((PriorityQueue) this.LLL).poll();
            if (interfaceC1112060f2q != null) {
                C20441214yg.LJ("IPublicScreenModel", String.valueOf(interfaceC1112060f2q.LJLILLLLZI()));
                C1111990f2j<InterfaceC1112060f2q> c1111990f2j = this.LLJLL;
                ListProtector.add(c1111990f2j.LIZIZ, 0, interfaceC1112060f2q);
                if (c1111990f2j.LJI && !c1111990f2j.LIZ(interfaceC1112060f2q)) {
                    c1111990f2j.LIZJ.add(0, interfaceC1112060f2q);
                }
            }
        }
        int iLJ2 = this.LLJLL.LJ() - iLJ;
        if (iLJ2 > 0) {
            C1112010f2l c1112010f2l = this.LL;
            if (!c1112010f2l.LJII) {
                Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1112020f2m) it2.next()).LJIL(iLJ2);
                }
            }
            ((InterfaceC1112050f2p) this.mView).cr1(0, iLJ2, true);
        }
        Iterator it3 = ((ArrayList) this.LL.LJ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC1112020f2m) it3.next()).LJJIII();
        }
        ((InterfaceC1112050f2p) this.mView).UD1(iLJ2 > 0);
        C786410Ut5.LJLIIL(50L, this.LLLLII, new ARunnableS117S0100000_17((C1111930f2d) this, 187));
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public void detachView() {
        IDebugService iDebugService;
        Map<CapsuleMessage, C245300x9> mapRemove;
        C1112360f3K c1112360f3K = C1112360f3K.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1112360f3K.getClass();
        if (dataChannel != null) {
            if (LiveCapsuleDisposeTimingOptimizeSetting.INSTANCE.getValue() && (mapRemove = C1112360f3K.LIZIZ.remove(dataChannel)) != null) {
                Iterator<Map.Entry<CapsuleMessage, C245300x9>> it2 = mapRemove.entrySet().iterator();
                while (it2.hasNext()) {
                    C1102070emj.LJIILJJIL(C1102070emj.LIZ, dataChannel, C1112250f39.LL, it2.next().getValue(), C0KAJ.AUTO_TERMINATE, null, null, 112);
                }
            }
            C1112360f3K.LIZJ.remove(dataChannel);
        }
        C1136820fgm.LJFF(this.dataChannel, this.LLLL);
        super.detachView();
        this.LLZLLLL = false;
        this.LLZL = 0;
        this.LLLILZLLLI = 0L;
        this.LLLLII.removeCallbacksAndMessages(null);
        this.LLLLLZ.LIZ.removeCallbacks(this.LLZZ);
        C1112120f2w c1112120f2w = this.LLLLLZ;
        c1112120f2w.LIZ.removeCallbacksAndMessages(null);
        c1112120f2w.LIZIZ.removeCallbacksAndMessages(null);
        this.LLLLLZ.LIZIZ(new ARunnableS117S0100000_17((C1111930f2d) this, 179));
        Iterator<InterfaceC1112060f2q> it3 = this.LLJLL.LIZLLL.iterator();
        while (it3.hasNext()) {
            it3.next().dispose();
        }
        if (LivePublicScreenBufferUnloadSetting.INSTANCE.getValue()) {
            Iterator it4 = ((PriorityQueue) this.LLJJJJLIIL).iterator();
            while (it4.hasNext()) {
                ((InterfaceC1112060f2q) it4.next()).dispose();
            }
            Iterator it5 = ((PriorityQueue) this.LLJJL).iterator();
            while (it5.hasNext()) {
                ((InterfaceC1112060f2q) it5.next()).dispose();
            }
            Iterator it6 = ((ArrayDeque) this.LLJJLIIIJLLLLLLLZ).iterator();
            while (it6.hasNext()) {
                ((InterfaceC1112060f2q) it6.next()).dispose();
            }
            Iterator<InterfaceC1112060f2q> it7 = this.LLJL.iterator();
            while (it7.hasNext()) {
                it7.next().dispose();
            }
        }
        ((HashMap) this.LLLILZ.LIZ).clear();
        Map<Class<? extends InterfaceC1112060f2q>, InterfaceC1112300f3E<? extends InterfaceC1112720f3u>> map = this.LLLIZZ;
        if (map != null) {
            ((HashMap) map).clear();
        }
        Map<Class<? extends AbstractC1136060ffY>, InterfaceC1110780f0m<? extends AbstractC1136060ffY>> map2 = this.LLLJ;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
        ((PublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).LLILLL.remove(this.LLLJL.LJIIZILJ);
        this.LLLLLZ.LIZIZ(new ARunnableS117S0100000_17((C1111930f2d) this, 184));
        C1112010f2l c1112010f2l = this.LL;
        if (!c1112010f2l.LJII) {
            Iterator it8 = ((ArrayList) c1112010f2l.LJI).iterator();
            while (it8.hasNext()) {
                ((InterfaceC1112540f3c) it8.next()).onUnload();
            }
        }
        C1088640eR4 c1088640eR4 = this.LLLJIL;
        if (c1088640eR4 != null) {
            Iterator it9 = ((HashMap) c1088640eR4.LIZ).entrySet().iterator();
            while (it9.hasNext()) {
                ((InterfaceC1112560f3e) ((Map.Entry) it9.next()).getValue()).release();
            }
            ((HashMap) c1088640eR4.LIZ).clear();
        }
        C1110240ezu c1110240ezu = this.LLLLLLJ;
        if (c1110240ezu != null) {
            C1112940f4G<T> c1112940f4G = c1110240ezu.LJIIIIZZ;
            if (c1112940f4G != 0) {
                c1112940f4G.dispose();
            }
            C11NJ c11nj = c1110240ezu.LJIIJJI;
            if (c11nj != null && !c11nj.LLILLJJLI) {
                c11nj.LJ();
            }
            c1110240ezu.LJIIJJI = null;
        }
        InterfaceC1109310eyP interfaceC1109310eyP = this.LLZIL;
        if (interfaceC1109310eyP != null) {
            interfaceC1109310eyP.LIZIZ();
        }
        C1109770ez9 c1109770ez9 = this.LLLJL;
        if (c1109770ez9 != null) {
            c1109770ez9.LJIIIZ = null;
        }
        C1112830f45 c1112830f45 = this.LLLLIIIILLL;
        if (c1112830f45 != null && C1111280f1a.LIZ() && (iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class)) != null) {
            iDebugService.yX1(null);
            c1112830f45.LIZ = null;
        }
        C1111970f2h.LIZ.clear();
        ((ArrayList) C1111970f2h.LIZIZ).clear();
        ((LinkedHashMap) C1111970f2h.LIZJ).clear();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C1148230fzB.class, null);
        dataChannelGlobal.zQ2(this);
        LiveInnerDowngradeAdaptExp liveInnerDowngradeAdaptExp = LiveInnerDowngradeAdaptExp.INSTANCE;
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenRefreshInterval()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.PUBLIC_SCREEN_REFRESH_INTERVAL);
        }
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenFirstMsgInterval()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.PUBLIC_SCREEN_FIRST_MSG_INTERVAL);
        }
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenMessageLimit()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.PUBLIC_SCREEN_MESSAGE_LIMIT);
        }
        if (liveInnerDowngradeAdaptExp.getExpValue().getAdaptEmojiMessageDowngrade() && !this.LLLJL.LJI) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.LIVE_PUBLIC_SCREEN_MESSAGE_DOWNGRADE);
        }
        if (liveInnerDowngradeAdaptExp.getExpValue().getAdaptBadgeDowngrade() && !this.LLLJL.LJI) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.LIVE_BADGE_DOWNGRADE);
        }
        if (LivePublicScreenContextNullOnDetachSetting.getValue()) {
            this.LLLJL = null;
        }
    }

    @Override // X.InterfaceC1110630f0X
    public final List<InterfaceC1112320f3G> LJIL() {
        return this.LLLII;
    }

    public int LJJZZI() {
        return this.LLJILLL;
    }

    public EnumC1112150f2z LJLZ() {
        return EnumC1112150f2z.Main;
    }

    @Override // X.InterfaceC1110630f0X
    public final C1111990f2j<? extends InterfaceC1112060f2q> getDataSource() {
        return this.LLJLL;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0f3D] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0eNl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0eP0] */
    public C1111930f2d(boolean z) {
        AComparatorS36S0000000_17 aComparatorS36S0000000_17 = new AComparatorS36S0000000_17(17);
        AComparatorS36S0000000_17 aComparatorS36S0000000_172 = new AComparatorS36S0000000_17(19);
        AComparatorS36S0000000_17 aComparatorS36S0000000_173 = new AComparatorS36S0000000_17(21);
        int publicScreenBackupMaxCount = LivePublicScreenBackupMessageSetting.getPublicScreenBackupMaxCount();
        this.LLJJJJ = publicScreenBackupMaxCount;
        this.LLJJJJJIL = LivePublicScreenBackupMessageExpiredTime.getValue();
        this.LLJJJJLIIL = new PriorityQueue(100, aComparatorS36S0000000_17);
        this.LLJJL = new PriorityQueue(Math.max(publicScreenBackupMaxCount, 1), aComparatorS36S0000000_17);
        this.LLJJLIIIJLLLLLLLZ = new ArrayDeque(100);
        this.LLJL = new C1112580f3g<>(8, aComparatorS36S0000000_172);
        this.LLJLIL = new HashMap();
        this.LLJLILLLLZIIL = new C1112580f3g<>(8, aComparatorS36S0000000_173);
        this.LLJLL = new C1111990f2j<>(this.LLJILLL);
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = new C1112000f2k();
        this.LLJZ = new C1112210f35();
        this.LLJZIJLIL = new ArrayList();
        this.LLL = new PriorityQueue(11, new AComparatorS36S0000000_17(18));
        this.LLLF = new LimitedSizeHashMap<>(512);
        this.LLLFF = new ArrayList();
        this.LLLFFI = new ArrayList();
        this.LLLFZ = new AComparatorS515S0100000_17(this, 1);
        this.LLLI = false;
        this.LLLII = new LinkedList();
        this.LLLIIII = false;
        this.LLLIIIL = new C1085940eMi();
        this.LLLILZJ = LiveCommentOffKeepPublicScreenSetting.INSTANCE.isEnabled();
        this.LLLILZLLLI = 0L;
        this.LLLL = C1136820fgm.LIZJ(this, "public_screen");
        BPEAHandler bPEAHandler = new BPEAHandler();
        this.LLLLII = bPEAHandler;
        this.LLLLIILL = new LinkedList();
        this.LLLLJ = true;
        this.LLLLLIL = false;
        this.LLLLLILLIL = false;
        this.LLLLLJIL = null;
        this.LLLLLJLJLL = false;
        this.LLLLLL = false;
        this.LLLLLLIL = false;
        this.LLLLLLLLL = 1.0f;
        this.LLLLLLLLLL = 1.0f;
        this.LLLLLLLZIL = false;
        this.LLLLLLZ = 0L;
        this.LLLLLLZZ = false;
        this.LLLLLZ = new C1112120f2w(bPEAHandler, bPEAHandler);
        this.LLLLLZIL = 0L;
        this.LLLLZ = LiveStrategyParamsSwitchSetting.getValue().f36switch;
        this.LLLLZI = false;
        this.LLLLZIL = LivePublicScreenAiSummaryOptSetting.enable();
        this.LLLLZLL = LiveProgressiveReleaseHistoryMsgCnt.getValue();
        this.LLLLZLLIL = LiveSelfMemberMessageShowConfigSetting.getValue();
        this.LLLLZLLLI = false;
        this.LLLZ = null;
        this.LLLZI = null;
        this.LLLZIIL = false;
        this.LLLZIL = LiveAutoTranslateStateSetting.getValue();
        this.LLLZL = null;
        this.LLLZLZ = false;
        this.LLLZZ = 0;
        this.LLLZZIL = Boolean.FALSE;
        this.LLZILL = new C1112260f3A(this);
        this.LLZLI = new ARunnableS117S0100000_17((C1111930f2d) this, 181);
        this.LLZLL = new ARunnableS117S0100000_17((C1111930f2d) this, 182);
        this.LLZLLIL = new ARunnableS117S0100000_17((C1111930f2d) this, 183);
        this.LLZLLLL = false;
        this.LLZZ = new ARunnableS117S0100000_17((C1111930f2d) this, 178);
        this.LLZZJLIL = new ARunnableS117S0100000_17((C1111930f2d) this, 180);
        this.LLZZLLIL = false;
        this.LLZ = new C1111960f2g(z, a);
    }

    public static void LJJLIIIIJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        if ((interfaceC1112060f2q instanceof AbstractC1110800f0o) && ((AbstractC1110790f0n) interfaceC1112060f2q).LJIILIIL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Public Screen Context is not initialized, model is ");
            sbLIZ.append(interfaceC1112060f2q);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static LivePublicScreenConfig LJJLJLI(boolean z) {
        if (z) {
            return LLZZZZ;
        }
        return LLZZZIL;
    }

    @Override // X.InterfaceC1109340eyS
    public final void LIZLLL(int i) {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(i, (OnIMMessageListener) this);
        }
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJ(List<InterfaceC1112320f3G> list) {
        if (!C1111450f1r.LIZ) {
            boolean z = false;
            for (Object obj : (ArrayList) list) {
                ((LinkedList) this.LLLII).remove(obj);
                if (((ArrayList) this.LLLFF).size() > 0 && ((ArrayList) this.LLLFF).contains(obj)) {
                    ((ArrayList) this.LLLFF).remove(obj);
                    if (obj == this.LLLLIL) {
                        z = true;
                    }
                }
            }
            if (z) {
                this.LLLLII.removeCallbacks(this.LLZLLIL);
                InterfaceC1112320f3G interfaceC1112320f3GLJJLIL = LJJLIL();
                if (interfaceC1112320f3GLJJLIL != null) {
                    uH1(interfaceC1112320f3GLJJLIL, true);
                    C786410Ut5.LJLIIL(c, this.LLLLII, this.LLZLLIL);
                    return;
                }
                this.LLLLIL = null;
                T t = this.mView;
                if (t == 0) {
                    return;
                }
                ((InterfaceC1112050f2p) t).Sk0();
                return;
            }
            if (((ArrayList) this.LLLFF).size() != 0) {
                return;
            }
            this.LLLLIL = null;
            T t2 = this.mView;
            if (t2 == 0) {
                return;
            }
            ((InterfaceC1112050f2p) t2).Sk0();
        }
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJIILIIL(ChatMessage chatMessage) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_eye_icon_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.dataChannel), "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(chatMessage.getMessageId()), "msg_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
        ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).sT((FragmentManager) this.dataChannel.gg0(C748880TZe.class), chatMessage.getMessageId(), this.LLLLLZL);
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJIILJJIL(InterfaceC1112320f3G interfaceC1112320f3G) {
        interfaceC1112320f3G.LJJJIL().LIZ = true;
    }

    @Override // X.InterfaceC1110630f0X
    public final InterfaceC1110780f0m<? extends AbstractC1136060ffY> LJIILL(AbstractC1136060ffY abstractC1136060ffY) {
        Map<Class<? extends AbstractC1136060ffY>, InterfaceC1110780f0m<? extends AbstractC1136060ffY>> map = this.LLLJ;
        if (map == null) {
            return null;
        }
        return (InterfaceC1110780f0m) ((HashMap) map).get(abstractC1136060ffY.getClass());
    }

    @Override // X.InterfaceC1109340eyS
    public final void LJIIZILJ(int i) {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addStickyMessageListener(i, (OnIMMessageListener) this);
        }
    }

    @Override // X.InterfaceC1110630f0X
    public final AbstractC1111980f2i<? extends AbstractC1136060ffY> LJJIZ(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY == null) {
            return null;
        }
        C1112280f3C c1112280f3C = this.LLLLIIL;
        Class<?> cls = abstractC1136060ffY.getClass();
        c1112280f3C.getClass();
        AbstractC1111980f2i<? extends AbstractC1136060ffY> abstractC1111980f2i = (AbstractC1111980f2i) ((HashMap) C1112280f3C.LIZIZ).get(cls);
        if (abstractC1111980f2i == null) {
            return C1112550f3d.LIZJ;
        }
        return abstractC1111980f2i;
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJJJI(InterfaceC1112060f2q interfaceC1112060f2q) {
        this.LLLLLZ.LIZJ(new ARunnableS50S0300000_17(this, interfaceC1112060f2q, new Object() { // from class: X.0f16
        }, 10));
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJJJJJL(MotionEvent motionEvent) {
        T t = this.mView;
        if (t != 0) {
            ((InterfaceC1112050f2p) t).LLJZ(motionEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARN: Type inference failed for: r4v106, types: [X.0f36] */
    @Override // X.AbstractC1112030f2n
    /* JADX INFO: renamed from: LJJJJLI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachView(T r28) {
        /*
            Method dump skipped, instruction units count: 2669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111930f2d.attachView(X.0f2p):void");
    }

    public final void LJJJJZI(InterfaceC1112060f2q interfaceC1112060f2q) {
        AbstractC1110800f0o<?> c1110170ezn;
        if (this.LLLIIII && (interfaceC1112060f2q instanceof AbstractC1110800f0o)) {
            if (interfaceC1112060f2q instanceof C180400mg) {
                final LikeMessage likeMessage = (LikeMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
                c1110170ezn = new C180400mg(likeMessage) { // from class: X.00uH
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final BadgeStruct LJJIJIIJI(User user) {
                        return null;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final int LJIIL() {
                        return C497740JfY.LJFF(R.color.a3d);
                    }
                };
            } else if (interfaceC1112060f2q instanceof C239500wD) {
                final SocialMessage socialMessage = (SocialMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
                c1110170ezn = new C239500wD(socialMessage) { // from class: X.00uL
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final BadgeStruct LJJIJIIJI(User user) {
                        return null;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final int LJIIL() {
                        return C497740JfY.LJFF(R.color.a3d);
                    }
                };
            } else if (interfaceC1112060f2q instanceof C234500vP) {
                final MemberMessage memberMessage = (MemberMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
                c1110170ezn = new C234500vP(memberMessage) { // from class: X.00vQ
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final BadgeStruct LJJIJIIJI(User user) {
                        return null;
                    }

                    @Override // X.C234500vP, X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return ((MemberMessage) this.LJIL).action == 1 ? (LLLFFI() || ((MemberMessage) this.LJIL).isTopUser) ? C175200lq.LJFF(((MemberMessage) this.LJIL).user, LLJLLIL(), LJIIL(), LJLLLL(), this) : LLIZLLLIL() : super.LLFF();
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final int LJIIL() {
                        return C497740JfY.LJFF(R.color.a3d);
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final int LJLLLL() {
                        return C20736316Cj.LIZIZ(R.attr.c9j, LLIIIILZ().LIZ);
                    }
                };
            } else if (interfaceC1112060f2q instanceof C1111000f18) {
                c1110170ezn = new C1111770f2N((GiftMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL);
            } else if (interfaceC1112060f2q instanceof C1110310f01) {
                c1110170ezn = new C1110170ezn((ChatMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL);
            } else {
                this.LLLIIIL.LIZ((AbstractC1110800f0o) interfaceC1112060f2q);
                return;
            }
            c1110170ezn.LJII(this.LLLJL);
            this.LLLIIIL.LIZ(c1110170ezn);
        }
    }

    public final boolean LJJJLZIJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (LJLJJI() && this.LLLLLLJ.LJI(interfaceC1112060f2q, this.LLZILL, interfaceC1112060f2q.LJLZ())) {
            return true;
        }
        return false;
    }

    public final void LJJLI(boolean z) {
        if (this.mView != 0 && !this.LLLZLZ) {
            if (this.LLLZZIL.booleanValue()) {
                if (!z) {
                    ((InterfaceC1112050f2p) this.mView).Oq0(true);
                    if (this.LLLLIILLL != null) {
                        ((InterfaceC1112050f2p) this.mView).DH2();
                    }
                    C1112120f2w c1112120f2w = this.LLLLLZ;
                    c1112120f2w.LIZ.removeCallbacks(this.LLZZ);
                    C1112120f2w c1112120f2w2 = this.LLLLLZ;
                    C786410Ut5.LJLIIL(4000L, c1112120f2w2.LIZ, this.LLZZ);
                    return;
                }
            } else if (!z) {
                return;
            }
            ((InterfaceC1112050f2p) this.mView).Oq0(false);
            if (this.LLLLIILLL == null) {
                return;
            }
            ((InterfaceC1112050f2p) this.mView).Oc2();
        }
    }

    public final void LJJLIIIJ(List<InterfaceC1112060f2q> list) {
        if (this.mView == 0) {
            return;
        }
        this.LL.LIZJ++;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1112060f2q interfaceC1112060f2q : list) {
            boolean zIsEmpty = ((ArrayList) this.LLJZIJLIL).isEmpty();
            for (InterfaceC1112730f3v interfaceC1112730f3v : (ArrayList) this.LLJZIJLIL) {
                if ((interfaceC1112060f2q instanceof AbstractC1110800f0o) && interfaceC1112730f3v.LIZ((AbstractC1110800f0o) interfaceC1112060f2q)) {
                    zIsEmpty = true;
                }
            }
            if (zIsEmpty) {
                arrayList.add(interfaceC1112060f2q);
                LJJLIIIJLJLI(interfaceC1112060f2q);
                interfaceC1112060f2q.LJJJJI().LIZJ = SystemClock.uptimeMillis();
                this.LL.LJI(interfaceC1112060f2q);
            }
        }
        LLFII(arrayList);
    }

    public final InterfaceC1112060f2q LJJLIIIJILLIZJL(AbstractC1136060ffY abstractC1136060ffY) {
        C1112010f2l c1112010f2l = this.LL;
        if (!c1112010f2l.LJII) {
            Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1112020f2m) it2.next()).LJIJJLI();
            }
        }
        return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(abstractC1136060ffY);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f1  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1112060f2q LJJLIIIJJI(X.AbstractC1136060ffY r17) {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111930f2d.LJJLIIIJJI(X.0ffY):X.0f2q");
    }

    public final void LJJLIIIJL(final List<InterfaceC1112060f2q> list) {
        if (this.mView == 0) {
            return;
        }
        final List<InterfaceC1112060f2q> listLIZLLL = this.LLJLL.LIZLLL();
        ((InterfaceC1112050f2p) this.mView).rm1(C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0f3X
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return listLIZLLL.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return list.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                if (ListProtector.get(list, i) == ListProtector.get(listLIZLLL, i2)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                if (ListProtector.get(list, i) == ListProtector.get(listLIZLLL, i2)) {
                    return true;
                }
                return false;
            }
        }, true), listLIZLLL);
    }

    public final void LJJLIIIJLJLI(InterfaceC1112060f2q interfaceC1112060f2q) {
        String str;
        if (this.LLLIIL && this.LLLJL != null) {
            this.LLLIIL = false;
            if ((interfaceC1112060f2q instanceof C239700wF) && !((AbstractC1110800f0o) interfaceC1112060f2q).LJIL.isLocalInsertMsg) {
                InterfaceC1112060f2q interfaceC1112060f2qOo = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(C181500mr.LJ(this.LLLJL.LJIIZILJ, C497740JfY.LJIJI(2131844579)));
                if (interfaceC1112060f2qOo instanceof InterfaceC1109650eyx) {
                    ((InterfaceC1109650eyx) interfaceC1112060f2qOo).LJII(this.LLLJL);
                }
                LLFFF(interfaceC1112060f2qOo, true);
                Calendar calendar = Calendar.getInstance();
                C1305440k4k c1305440k4kLIZIZ = C1305440k4k.LIZIZ(((InterfaceC919320a1y) this.mView).getContext());
                c1305440k4kLIZIZ.LJII(Integer.valueOf(this.LLLIILIL + 1), "live.mt.text_message.guidance_total_display_count");
                c1305440k4kLIZIZ.LJII(Integer.valueOf(calendar.get(1)), "live.mt.text_message.guidance_last_display_year");
                c1305440k4kLIZIZ.LJII(Integer.valueOf(calendar.get(6)), "live.mt.text_message.guidance_last_display_day");
                c1305440k4kLIZIZ.LJII(Integer.valueOf(this.LLLIL + 1), "live.mt.text_message.guidance_daily_display_count");
                c1305440k4kLIZIZ.LIZ();
                if (this.LLLJL.LJIJJLI) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_translate_guide");
                    c474500IjALIZ.LJIJJLI(this.dataChannel);
                    if (this.LLLJL.LJI) {
                        str = "anchor";
                    } else {
                        str = "user";
                    }
                    c474500IjALIZ.LJJII(str, "user_type");
                    c474500IjALIZ.LIZ();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ(X.AbstractC1110800f0o<? extends X.AbstractC1136060ffY> r10) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111930f2d.LJJLIIJ(X.0f0o):void");
    }

    public final InterfaceC1112060f2q LJJLJ(long j) {
        if (j == 0) {
            return null;
        }
        for (int i = 0; i < this.LLJLL.LJFF(); i++) {
            if (this.LLJLL.LIZJ(i).getToken() == j) {
                return this.LLJLL.LIZJ(i);
            }
        }
        for (InterfaceC1112060f2q interfaceC1112060f2q : (PriorityQueue) this.LLJJJJLIIL) {
            if (interfaceC1112060f2q.getToken() == j) {
                return interfaceC1112060f2q;
            }
        }
        for (InterfaceC1112060f2q interfaceC1112060f2q2 : (ArrayDeque) this.LLJJLIIIJLLLLLLLZ) {
            if (interfaceC1112060f2q2.getToken() == j) {
                return interfaceC1112060f2q2;
            }
        }
        return null;
    }

    public final int LJJZ(long j) {
        if (j == 0) {
            return -1;
        }
        for (int i = 0; i < this.LLJLL.LJFF(); i++) {
            if (this.LLJLL.LIZJ(i).getToken() == j) {
                return i;
            }
        }
        return -1;
    }

    public final InterfaceC1112060f2q LJJZZIII(long j) {
        if (j == 0) {
            return null;
        }
        for (int i = 0; i < this.LLJLL.LJFF(); i++) {
            InterfaceC1112060f2q interfaceC1112060f2qLIZJ = this.LLJLL.LIZJ(i);
            if (this.LLJLL.LIZJ(i).getToken() == j) {
                return interfaceC1112060f2qLIZJ;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0ee1] */
    public final void LJLI(BottomMessage bottomMessage) {
        CommonMessageData commonMessageData;
        boolean z;
        boolean z2;
        PunishEventInfo punishEventInfo;
        int i;
        if (bottomMessage != null && (commonMessageData = bottomMessage.baseMessage) != null && commonMessageData.displayText != null) {
            if (this.LLIZ != null && this.LLILZIL > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((i = bottomMessage.bizType) == 1 || i == 2)) {
                C1091120eV4.LIZ(bottomMessage, "attributeSetting");
                return;
            }
            if (this.LLIZ != null && this.LLILZIL > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && bottomMessage.bizType == 5 && this.LLIZ.bizType != 1 && this.LLIZ.bizType != 2) {
                C1091120eV4.LIZ(bottomMessage, "attributeSetting");
                return;
            }
            long j = this.LLLJL.LJIL;
            if (this.LLIZ != null && this.LLILZIL > 0 && this.LLIZ.bizType == 6 && bottomMessage.bizType == 6 && this.LLIZ.violationUserId == j) {
                long j2 = bottomMessage.violationUserId;
                if (j2 != j && j2 > 0) {
                    C1091120eV4.LIZ(bottomMessage, "attributeSetting");
                    return;
                }
            }
            if (bottomMessage.bizType == 5) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_ags_popup_message_warning");
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
            }
            long j3 = bottomMessage.duration;
            if (j3 < 0) {
                j3 = Long.MAX_VALUE;
            }
            this.LLILZIL = j3;
            bottomMessage.LL = bottomMessage.duration;
            bottomMessage.duration = this.LLILZIL;
            this.LLILZLL = C1133830fbx.LJIILIIL(bottomMessage.baseMessage.displayText, "");
            this.LLIZ = bottomMessage;
            this.LLJ = new InterfaceC1102120emo(this.LLIZ) { // from class: X.0ee1
                public final BottomMessage LIZ;
                public final long LIZIZ;

                @Override // X.InterfaceC1102120emo
                public final String LIZIZ() {
                    return null;
                }

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
                    return false;
                }

                @Override // X.InterfaceC1102120emo
                public final void LJI() {
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIIIZZ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final C1099880ejC LJIIIZ() {
                    return null;
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
                    return false;
                }

                @Override // X.InterfaceC1102120emo
                public final View LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final Map<String, String> getExtras() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final String LJJJ() {
                    return String.valueOf(this.LIZ.getMessageId());
                }

                @Override // X.InterfaceC1102120emo
                public final String getBusinessName() {
                    return String.valueOf(this.LIZ.bizType);
                }

                @Override // X.InterfaceC1102120emo
                public final String getId() {
                    return String.valueOf(this.LIZ.getMessageId());
                }

                @Override // X.InterfaceC1102120emo
                public final EnumC245600xC LIZLLL() {
                    return C245700xD.LIZ(this);
                }

                @Override // X.InterfaceC1102120emo
                public final int getComponentType() {
                    LJII();
                    return 0;
                }

                @Override // X.InterfaceC1102120emo
                public final InterfaceC1102150emr LJII() {
                    return C1099280eiE.LL;
                }

                @Override // X.InterfaceC1102120emo
                public final long LJIIJ() {
                    return this.LIZIZ;
                }

                {
                    long jLIZIZ;
                    this.LIZ = bottomMessage;
                    CommonMessageData commonMessageData2 = bottomMessage.baseMessage;
                    if (commonMessageData2 != null) {
                        jLIZIZ = commonMessageData2.createTime;
                    } else {
                        jLIZIZ = C963140bAe.LIZIZ();
                    }
                    this.LIZIZ = jLIZIZ;
                }
            };
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = this.dataChannel;
            C1099280eiE c1099280eiE = C1099280eiE.LL;
            C1096670ee1 c1096670ee1 = this.LLJ;
            c1102070emj.getClass();
            C1102070emj.LJJIII(dataChannel, c1099280eiE, c1096670ee1);
            this.LLLLLZ.LIZJ(new ARunnableS117S0100000_17((C1111930f2d) this, 185));
            ConcurrentLinkedDeque<BottomMessage> concurrentLinkedDeque = this.LLIZLLLIL;
            if (bottomMessage.LL < 0 && (punishEventInfo = bottomMessage.punishInfo) != null && C497000JeM.LIZ(punishEventInfo.punishReason) && !concurrentLinkedDeque.contains(bottomMessage)) {
                concurrentLinkedDeque.offer(bottomMessage);
            }
        }
    }

    public final boolean LJLJI(InterfaceC1112060f2q interfaceC1112060f2q) {
        InterfaceC1112060f2q interfaceC1112060f2qPollLast;
        C1112580f3g<InterfaceC1112060f2q> c1112580f3g = this.LLJL;
        int index = c1112580f3g.getIndex(interfaceC1112060f2q);
        if (index >= 0) {
            if (c1112580f3g.isFull()) {
                interfaceC1112060f2qPollLast = c1112580f3g.pollLast();
            } else {
                interfaceC1112060f2qPollLast = null;
            }
            c1112580f3g.insertAt(interfaceC1112060f2q, index);
            if (interfaceC1112060f2qPollLast != null) {
                this.LL.LJIIJ(interfaceC1112060f2qPollLast, true);
            }
            return true;
        }
        return false;
    }

    public final void LJLJLJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        interfaceC1112060f2q.LJJJJI().LIZ = true;
        interfaceC1112060f2q.LJJJJI().LIZIZ = SystemClock.uptimeMillis();
        this.LL.LIZLLL(interfaceC1112060f2q);
    }

    public final boolean LJLJLLL(boolean z) {
        try {
            Object objGg0 = this.dataChannel.gg0(C0TZM.class);
            if (objGg0 != null) {
                if (!((Boolean) objGg0).booleanValue()) {
                    return false;
                }
            }
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public final void LJLL(List<InterfaceC1112060f2q> list) {
        InterfaceC1112060f2q interfaceC1112060f2q = this.LLLLIILLL;
        if (interfaceC1112060f2q != null) {
            if (!this.LLJLL.LIZ(interfaceC1112060f2q)) {
                ((InterfaceC1112050f2p) this.mView).w10(this.LLLLIILLL);
                ((InterfaceC1112050f2p) this.mView).Oc2();
            } else {
                ((InterfaceC1112050f2p) this.mView).DH2();
            }
        }
        LJJLIIIJL(list);
        ((InterfaceC1112050f2p) this.mView).WI0();
    }

    public final void LJLLI(C1113010f4N c1113010f4N) {
        if (this.mView == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC1136060ffY abstractC1136060ffY : c1113010f4N.LIZ) {
            if (!this.LLLF.containsKey(Long.valueOf(abstractC1136060ffY.getMessageId()))) {
                InterfaceC1112060f2q interfaceC1112060f2qLJJLIIIJJI = LJJLIIIJJI(abstractC1136060ffY);
                if (interfaceC1112060f2qLJJLIIIJJI != null) {
                    Iterator it2 = ((ArrayList) this.LL.LJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1112020f2m) it2.next()).LJJIJL();
                    }
                }
                if (LJLJJI() && interfaceC1112060f2qLJJLIIIJJI != null && this.LLLLLLL.LIZ(interfaceC1112060f2qLJJLIIIJJI)) {
                    arrayList.add(interfaceC1112060f2qLJJLIIIJJI);
                } else {
                    ((PriorityQueue) this.LLL).offer(interfaceC1112060f2qLJJLIIIJJI);
                }
            }
        }
        if (arrayList.size() > 0) {
            C19476611Hw c19476611HwLJFF = this.LLLLLLL.LJFF(arrayList);
            if (c19476611HwLJFF != null) {
                ((C0J1N) c19476611HwLJFF.LIZJ(C11RD.LJ((LifecycleOwner) this.mView))).LIZ(new AfS153S0200000_17(arrayList, this, 18), new AfS153S0200000_17(arrayList, this, 19));
                return;
            }
            return;
        }
        LJLLILLLL();
    }

    public final void LJLLJ(String str) {
        String str2;
        PunishEventInfo punishEventInfo;
        ConcurrentLinkedDeque<BottomMessage> concurrentLinkedDeque = this.LLIZLLLIL;
        AObjectS360S0100000_17 aObjectS360S0100000_17 = new AObjectS360S0100000_17((C1111930f2d) this, 112);
        if (!concurrentLinkedDeque.isEmpty()) {
            Iterator<BottomMessage> it2 = concurrentLinkedDeque.iterator();
            while (true) {
                str2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                BottomMessage next = it2.next();
                if (next != null) {
                    PunishEventInfo punishEventInfo2 = next.punishInfo;
                    if (punishEventInfo2 != null) {
                        str2 = punishEventInfo2.punishId;
                    }
                    if (TextUtils.equals(str, str2)) {
                        it2.remove();
                    }
                }
            }
            BottomMessage bottomMessagePeekLast = concurrentLinkedDeque.peekLast();
            if (bottomMessagePeekLast != null && bottomMessagePeekLast.LL < 0 && (punishEventInfo = bottomMessagePeekLast.punishInfo) != null && C497000JeM.LIZ(punishEventInfo.punishReason)) {
                PunishEventInfo punishEventInfo3 = bottomMessagePeekLast.punishInfo;
                if (punishEventInfo3 != null) {
                    str2 = punishEventInfo3.punishId;
                }
                if (!TextUtils.equals(str, str2)) {
                    aObjectS360S0100000_17.invoke(bottomMessagePeekLast);
                }
            }
        }
    }

    public final void LJLLLL(long j) {
        float f;
        DataChannel dataChannel;
        if (!this.LLLLLLZZ) {
            this.LLLLLLZ = SystemClock.elapsedRealtime();
            C1112120f2w c1112120f2w = this.LLLLLZ;
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = this.LLZLI;
            long j2 = this.LLILZ;
            if (j2 <= 0) {
                float f2 = j;
                if (!this.LLLLLLLZIL && (dataChannel = this.dataChannel) != null) {
                    C0IR7 c0ir7 = (C0IR7) dataChannel.gg0(FastScrollPredict.class);
                    if (c0ir7 != null && c0ir7.LIZ) {
                        f = 1.0f;
                    } else {
                        f = this.LLLLLLLLLL;
                    }
                } else {
                    f = this.LLLLLLLLL;
                }
                j2 = (long) (f2 * f);
            }
            c1112120f2w.LIZ(j2, aRunnableS117S0100000_17);
            return;
        }
        this.LLLLLLZZ = false;
    }

    public final InterfaceC1112720f3u LJLLLLLL(InterfaceC1112060f2q interfaceC1112060f2q) {
        InterfaceC1112720f3u interfaceC1112720f3uLJIIIIZZ = null;
        if (interfaceC1112060f2q == null) {
            return null;
        }
        Map<Class<? extends InterfaceC1112060f2q>, InterfaceC1112300f3E<? extends InterfaceC1112720f3u>> map = this.LLLIZZ;
        if (map != null) {
            InterfaceC1112300f3E interfaceC1112300f3E = (InterfaceC1112300f3E) ((HashMap) map).get(interfaceC1112060f2q.getClass());
            if (interfaceC1112300f3E != null && (interfaceC1112060f2q instanceof InterfaceC1112720f3u)) {
                InterfaceC1112720f3u interfaceC1112720f3u = (InterfaceC1112720f3u) interfaceC1112060f2q;
                interfaceC1112300f3E.LIZ(interfaceC1112720f3u, this.LLLJL);
                interfaceC1112720f3uLJIIIIZZ = interfaceC1112720f3u.LJIIIIZZ();
                if (interfaceC1112720f3uLJIIIIZZ != null) {
                    interfaceC1112720f3uLJIIIIZZ.LJII(this.LLLJL);
                }
            }
        }
        return interfaceC1112720f3uLJIIIIZZ;
    }

    public final void LJZ(int i) {
        InterfaceC1112060f2q interfaceC1112060f2qLIZJ = this.LLJLL.LIZJ(i);
        interfaceC1112060f2qLIZJ.dispose();
        int iLJI = this.LLJLL.LJI(interfaceC1112060f2qLIZJ);
        this.LLJLL.LJII(interfaceC1112060f2qLIZJ);
        if (iLJI != -1) {
            ((InterfaceC1112050f2p) this.mView).Wd0(iLJI);
        }
    }

    public final void LL(boolean z) {
        this.LLLLLLLLL = 1.0f;
        C1109770ez9 c1109770ez9 = this.LLLJL;
        c1109770ez9.LJJIII = 1.0f;
        int i = LJJLJLI(c1109770ez9.LJI).consumeInterval;
        if (LJLJLLL(z)) {
            LLF(LivePreCreateNextRoomPlayer.ENABLE);
        } else {
            LLF(i);
        }
        int i2 = this.LLJIJIL;
        this.LLJILJILJ = i2;
        this.LLLJL.LJJIIZ = i2;
    }

    public final void LLF(int i) {
        this.LLJIJIL = i;
        C1109770ez9 c1109770ez9 = this.LLLJL;
        if (c1109770ez9 != null) {
            c1109770ez9.LJJIIJ = i;
        }
    }

    public final void LLFF(HistoryInfo historyInfo) {
        C1112000f2k c1112000f2k = this.LLJLLL;
        String commentCursor = historyInfo.getCommentCursor();
        boolean hasMore = historyInfo.getHasMore();
        c1112000f2k.LIZIZ = commentCursor;
        c1112000f2k.LIZJ = hasMore;
        if (!C500260Jjc.LJIIZILJ(this.dataChannel)) {
            ((InterfaceC1112050f2p) this.mView).hR(LJLIIIL());
        }
        this.LLZ.LIZIZ = historyInfo.getCount();
    }

    public void LLFII(final List<InterfaceC1112060f2q> list) {
        this.LLLLLZ.LIZJ(new Runnable() { // from class: X.0f2e
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.lang.Runnable
            public final void run() {
                int iLJFF;
                PublicAreaMessageCommon publicAreaMessageCommonLLIIII;
                int iLJFF2;
                C1111930f2d c1111930f2d = this.LL;
                List<InterfaceC1112060f2q> list2 = list;
                c1111930f2d.getClass();
                C1C7U.LIZ("PublicScreenPresenter@c5a7.showScrollModels$1L");
                if (list2.isEmpty() || c1111930f2d.mView == 0) {
                    C1C7U.LIZIZ("PublicScreenPresenter@c5a7.showScrollModels$1L");
                    return;
                }
                c1111930f2d.LJJLI(false);
                if (C1111930f2d.a) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C1111930f2d.LJJLIIIIJ((InterfaceC1112060f2q) it2.next());
                    }
                }
                ((LinkedList) c1111930f2d.LLLLIILL).clear();
                if (((InterfaceC1112050f2p) c1111930f2d.mView).LLLIIIL() == EnumC1087130eOd.NORMAL) {
                    int iLJ = c1111930f2d.LLJLL.LJ();
                    int iLJFF3 = c1111930f2d.LLJLL.LJFF() + list2.size();
                    if (iLJFF3 > c1111930f2d.LJJZZI()) {
                        c1111930f2d.LLLI = true;
                        ((InterfaceC1112050f2p) c1111930f2d.mView).hR(c1111930f2d.LJLIIIL());
                        int iLJJZZI = iLJFF3 - ((int) ((c1111930f2d.LJJZZI() / 200.0f) * 130.0f));
                        if (iLJJZZI <= c1111930f2d.LLJLL.LJFF()) {
                            iLJFF2 = iLJJZZI;
                        } else {
                            iLJFF2 = c1111930f2d.LLJLL.LJFF();
                            list2.subList(0, iLJJZZI - iLJFF2).clear();
                        }
                        ArrayList arrayList = new ArrayList(c1111930f2d.LLJLL.LIZIZ.subList(0, iLJFF2));
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < arrayList.size(); i++) {
                            InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) ListProtector.get(arrayList, i);
                            c1111930f2d.LLJLL.LJII(interfaceC1112060f2q);
                            interfaceC1112060f2q.dispose();
                            if (interfaceC1112060f2q instanceof InterfaceC1112320f3G) {
                                InterfaceC1112320f3G interfaceC1112320f3G = (InterfaceC1112320f3G) interfaceC1112060f2q;
                                if (interfaceC1112320f3G.LJJIJL() != null) {
                                    arrayList2.add(interfaceC1112320f3G);
                                }
                            }
                        }
                        c1111930f2d.LJ(arrayList2);
                        int iLJ2 = iLJ - c1111930f2d.LLJLL.LJ();
                        if (iLJ2 > 0) {
                            ((InterfaceC1112050f2p) c1111930f2d.mView).GU0(0, iLJ2);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("shoulddelete=");
                        sbLIZ.append(iLJJZZI);
                        sbLIZ.append("desiredCropCount=");
                        sbLIZ.append(iLJFF2);
                        sbLIZ.append("realCropCount=");
                        sbLIZ.append(iLJ2);
                        C20441214yg.LJIIIZ("cropmessage", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                if (C468250IXv.LIZ(c1111930f2d.dataChannel) && c1111930f2d.LLLLLLLZIL) {
                    int size = ((ArrayList) c1111930f2d.LLJLLIL).size();
                    ((ArrayList) c1111930f2d.LLJLLIL).addAll(list2);
                    int size2 = ((ArrayList) c1111930f2d.LLJLLIL).size() - size;
                    if (size2 > 0) {
                        ((InterfaceC1112050f2p) c1111930f2d.mView).Is2(size2);
                    }
                    C1C7U.LIZIZ("PublicScreenPresenter@c5a7.showScrollModels$1L");
                    return;
                }
                if (!c1111930f2d.LLJLL.LJI && r1.LJFF() - 8 >= 0) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        InterfaceC1112060f2q interfaceC1112060f2q2 = (InterfaceC1112060f2q) it3.next();
                        if ((interfaceC1112060f2q2 instanceof C1110310f01) && (publicAreaMessageCommonLLIIII = ((AbstractC1110790f0n) interfaceC1112060f2q2).LLIIII()) != null && publicAreaMessageCommonLLIIII.hideAboveScrollArea) {
                            arrayList3.add(interfaceC1112060f2q2);
                            it3.remove();
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        c1111930f2d.LLJLL.LIZIZ.addAll(iLJFF, arrayList3);
                        ((InterfaceC1112050f2p) c1111930f2d.mView).cr1(iLJFF, arrayList3.size(), true);
                    }
                }
                int iLJ3 = c1111930f2d.LLJLL.LJ();
                C1111990f2j<InterfaceC1112060f2q> c1111990f2j = c1111930f2d.LLJLL;
                boolean zAddAll = c1111990f2j.LIZIZ.addAll(list2);
                if (c1111990f2j.LJI) {
                    for (Object obj : list2) {
                        if (!c1111990f2j.LIZ((InterfaceC1112060f2q) obj)) {
                            zAddAll = c1111990f2j.LIZJ.add((T) obj) || zAddAll;
                        }
                    }
                }
                int iLJ4 = c1111930f2d.LLJLL.LJ() - iLJ3;
                if (iLJ4 > 0) {
                    ((InterfaceC1112050f2p) c1111930f2d.mView).cr1(iLJ3, iLJ4, false);
                }
                long messageId = 0;
                long createTime = 0;
                for (InterfaceC1112060f2q interfaceC1112060f2q3 : list2) {
                    if (interfaceC1112060f2q3.LJJJJIZL()) {
                        c1111930f2d.LLLLJ = false;
                    }
                    if ((interfaceC1112060f2q3 instanceof C1110310f01) && !interfaceC1112060f2q3.LJFF()) {
                        AbstractC1110520f0M abstractC1110520f0M = (AbstractC1110520f0M) interfaceC1112060f2q3;
                        if (!abstractC1110520f0M.LJIL.isLocalInsertMsg && abstractC1110520f0M.getCreateTime() > createTime) {
                            createTime = abstractC1110520f0M.getCreateTime();
                            messageId = interfaceC1112060f2q3.getMessageId();
                        }
                    }
                    C1109770ez9 c1109770ez9 = c1111930f2d.LLLJL;
                    if (c1109770ez9.LIZLLL && c1111930f2d.LLLLLLIL) {
                        if ((c1109770ez9.LJI ? InterfaceC1106030et7.K5.LIZIZ().booleanValue() : InterfaceC1106030et7.H5.LIZIZ().booleanValue()) && c1111930f2d.LLLLLLJ.LJIIIZ(interfaceC1112060f2q3)) {
                            if (c1111930f2d.LLLJL.LJI) {
                                InterfaceC1106030et7.K5.LJFF(Boolean.FALSE);
                            } else {
                                InterfaceC1106030et7.H5.LJFF(Boolean.FALSE);
                            }
                            RoomMessage roomMessage = new RoomMessage();
                            CommonMessageData commonMessageData = new CommonMessageData();
                            commonMessageData.roomId = c1111930f2d.LLLJL.LJIIZILJ;
                            commonMessageData.showMsg = true;
                            roomMessage.baseMessage = commonMessageData;
                            C240500wN c240500wN = new C240500wN(roomMessage);
                            c240500wN.LJII(c1111930f2d.LLLJL);
                            c1111930f2d.LL.LJII(c240500wN);
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Tn2(c1111930f2d.LLLJL.LJIIZILJ, c240500wN);
                        }
                    }
                    if ((!C1111450f1r.LIZ) && !interfaceC1112060f2q3.LJFF() && (interfaceC1112060f2q3 instanceof InterfaceC1112320f3G)) {
                        InterfaceC1112320f3G interfaceC1112320f3G2 = (InterfaceC1112320f3G) interfaceC1112060f2q3;
                        if (((InterfaceC1112050f2p) c1111930f2d.mView).LLLIIIL() == EnumC1087130eOd.FOCUS && interfaceC1112320f3G2.LJJIJL() != null) {
                            c1111930f2d.LJIILLIIL(interfaceC1112320f3G2, false);
                        }
                        if (((InterfaceC1112050f2p) c1111930f2d.mView).LLLIIIL() == EnumC1087130eOd.NORMAL && interfaceC1112320f3G2.LJJIJL() != null) {
                            ((LinkedList) c1111930f2d.LLLLIILL).add(interfaceC1112320f3G2);
                        }
                    }
                    if (interfaceC1112060f2q3 instanceof AbstractC1110800f0o) {
                        c1111930f2d.LJJLIIJ((AbstractC1110800f0o) interfaceC1112060f2q3);
                    }
                    interfaceC1112060f2q3.LJJJJJL(c1111930f2d.LLZL);
                }
                c1111930f2d.LL.LJIILLIIL(messageId, list2);
                C1C7U.LIZIZ("PublicScreenPresenter@c5a7.showScrollModels$1L");
            }
        });
    }

    public final void LLFZ(boolean z) {
        C1109770ez9 c1109770ez9;
        Room room;
        BaseResponse<Room, EnterRoomExtra> baseResponseLIZIZ;
        Room room2;
        if (this.mView == 0) {
            return;
        }
        if (LiveQuickReturnOptSetting.isEnabled() && (room = this.LLLLLJIL) != null && (baseResponseLIZIZ = C466200IPy.LIZIZ(room.getId(), false)) != null && (room2 = baseResponseLIZIZ.data) != null && room2.getRoomAuthStatus() != null) {
            baseResponseLIZIZ.data.getRoomAuthStatus().setEnableChat(z);
        }
        if (z && LJLJJLL()) {
            ((InterfaceC1112050f2p) this.mView).KB();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(CommentStatusChannel.class, Boolean.TRUE);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(CommentStatusChannel.class, Boolean.FALSE);
        }
        if (this.LLLILZJ && LJLJJLL()) {
            ((InterfaceC1112050f2p) this.mView).KB();
            if (this.mView != 0 && this.LLJLL.LJFF() != 0) {
                List<InterfaceC1112060f2q> arrayList = new ArrayList<>(this.LLJLL.LIZLLL());
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int iLJFF = this.LLJLL.LJFF() - 1; iLJFF >= 0; iLJFF--) {
                    InterfaceC1112060f2q interfaceC1112060f2qLIZJ = this.LLJLL.LIZJ(iLJFF);
                    if ((interfaceC1112060f2qLIZJ instanceof AbstractC1110520f0M) && !(interfaceC1112060f2qLIZJ instanceof C1110230ezt)) {
                        if (interfaceC1112060f2qLIZJ instanceof InterfaceC1112320f3G) {
                            InterfaceC1112320f3G interfaceC1112320f3G = (InterfaceC1112320f3G) interfaceC1112060f2qLIZJ;
                            if (interfaceC1112320f3G.LJJIJL() != null) {
                                arrayList2.add(interfaceC1112320f3G);
                            }
                        }
                        interfaceC1112060f2qLIZJ.dispose();
                        this.LLJLL.LJII(interfaceC1112060f2qLIZJ);
                        z2 = true;
                    }
                }
                LJ(arrayList2);
                if (z2) {
                    LJJLIIIJL(arrayList);
                }
            }
            if (this.LLLILZLLLI != 0 || (c1109770ez9 = this.LLLJL) == null || c1109770ez9.LJIIZILJ <= 0) {
                return;
            }
            this.LLLLLZ.LIZIZ(new ARunnableS86S0200000_17(this, C181500mr.LJ(this.LLLJL.LJIIZILJ, C497740JfY.LJIJI(2131842703)), 48));
            return;
        }
        ((InterfaceC1112050f2p) this.mView).BE2();
    }

    public final void LLI(Collection<InterfaceC1112060f2q> collection) {
        for (InterfaceC1112060f2q interfaceC1112060f2q : collection) {
            if (interfaceC1112060f2q instanceof InterfaceC1109650eyx) {
                ((InterfaceC1109650eyx) interfaceC1112060f2q).LIZJ(this.LLLJL);
            }
        }
    }

    public final int LLIFFJFJJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        T t;
        PinMessageViewModel pinMessageViewModel = this.LLILLJJLI;
        if (pinMessageViewModel != null && ((pinMessageViewModel.LLILZ != null || pinMessageViewModel.LLILZIL != null) && pinMessageViewModel.vQ2(interfaceC1112060f2q))) {
            this.LLILLJJLI.zQ2(interfaceC1112060f2q);
            return -1;
        }
        if (interfaceC1112060f2q != null && (t = this.mView) != 0 && this.LLLJL != null) {
            if (this.LLLLIILLL == interfaceC1112060f2q) {
                ((InterfaceC1112050f2p) t).qe1(interfaceC1112060f2q, null);
            } else {
                int iLJI = this.LLJLL.LJI(interfaceC1112060f2q);
                if (iLJI != -1) {
                    ((InterfaceC1112050f2p) this.mView).ei0(iLJI);
                }
                return iLJI;
            }
        }
        return -1;
    }

    public final void QA0(int i) {
        InterfaceC1112050f2p interfaceC1112050f2p;
        if (!this.LLLJL.LJI && (interfaceC1112050f2p = (InterfaceC1112050f2p) this.mView) != null) {
            interfaceC1112050f2p.QA0(i);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) iMessage;
        long j = abstractC1136060ffY.baseMessage.roomMessageHeatLevel;
        if (j > 0 && this.LLLLLZIL != j) {
            this.LLLLLZIL = j;
            DataChannelGlobal.LLILZ.JQ2(C1148230fzB.class, Long.valueOf(j));
            if (a) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Room message heat changed to ");
                sbLIZ.append(this.LLLLLZIL);
                AbstractC827810Wdf.LIZ("FoldReleaseBuffer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LLLLLZ.LIZIZ(new ARunnableS86S0200000_17(this, abstractC1136060ffY, 55));
    }

    public final void start(int i) {
        InterfaceC1112050f2p interfaceC1112050f2p;
        if (!this.LLLJL.LJI && (interfaceC1112050f2p = (InterfaceC1112050f2p) this.mView) != null) {
            interfaceC1112050f2p.start(i);
        }
    }

    public static long LJL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (interfaceC1112060f2q.LJLJJL() == 1 && interfaceC1112060f2q.LJJII() > 0) {
            return interfaceC1112060f2q.LJJII();
        }
        if (interfaceC1112060f2q.LJLJJL() == 2) {
            return j + interfaceC1112060f2q.LJLJLJ();
        }
        return j;
    }

    public static boolean LJZI(long j, Collection<InterfaceC1112060f2q> collection) {
        Iterator<InterfaceC1112060f2q> it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC1112060f2q next = it2.next();
            if (next.getToken() == j) {
                next.dispose();
                it2.remove();
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJIILLIIL(InterfaceC1112320f3G interfaceC1112320f3G, boolean z) {
        if (!C1111450f1r.LIZ) {
            if (((ArrayList) this.LLLFF).size() == 0) {
                ((ArrayList) this.LLLFF).add(interfaceC1112320f3G);
                uH1(interfaceC1112320f3G, true);
                C786410Ut5.LJLIIL(c, this.LLLLII, this.LLZLLIL);
                return;
            }
            if (((ArrayList) this.LLLFF).contains(interfaceC1112320f3G)) {
                return;
            }
            if (this.LLLLIL != null && this.LLJLL.LJI(interfaceC1112320f3G) < LJJLL()) {
                uH1(interfaceC1112320f3G, false);
            }
            ((ArrayList) this.LLLFF).add(interfaceC1112320f3G);
            if (!z) {
                return;
            }
            Collections.sort(this.LLLFF, this.LLLFZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [X.0TcS] */
    /* JADX WARN: Type inference failed for: r60v0, types: [X.0Ts6, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r7v19, types: [X.0TgN] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.01zF] */
    @Override // X.InterfaceC1110630f0X
    public final void LJJJJI(final AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, final C1111350f1h c1111350f1h) {
        DataChannel dataChannel;
        boolean z;
        boolean z2;
        Object obj;
        DataChannel dataChannel2;
        String strLJIJI;
        String str;
        String strLLJJJJ;
        C1112040f2o c1112040f2o;
        boolean z3;
        AbstractC755190Tjp abstractC755190Tjp;
        long j;
        String str2;
        C1111420f1o c1111420f1o;
        User.EnigmaInfo enigmaInfo;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Boolean boolValueOf;
        String string;
        String string2;
        User user;
        UserAttr userAttr;
        C1109020exw c1109020exw;
        long messageId;
        long j2;
        final C760300Ts4<T> c760300Ts4 = this.LLJJJ;
        final C1109770ez9 c1109770ez9 = this.LLLJL;
        final PinMessageViewModel pinMessageViewModel = this.LLILLJJLI;
        final DataChannel dataChannel3 = this.dataChannel;
        Room room = this.LLLLLJIL;
        final C513501zJ c513501zJ = new C513501zJ(this, 0);
        AObjectS355S0100000_12 aObjectS355S0100000_12 = new AObjectS355S0100000_12(this, 11);
        c760300Ts4.getClass();
        boolean zLIZ = C755070Tjd.LIZ(c1109770ez9.LJI);
        if (abstractC1110800f0o != 0) {
            if ((abstractC1110800f0o.getUser() != null || abstractC1110800f0o.LLJL()) && this.mView != 0 && c1109770ez9.LJII != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
                if (C468250IXv.LIZJ(dataChannel)) {
                    C468250IXv.LJ(c1109770ez9.LJIIIZ, "msg");
                    return;
                }
                final AObjectS115S0000000_12 aObjectS115S0000000_12 = new AObjectS115S0000000_12(5);
                final AObjectS115S0000000_12 aObjectS115S0000000_122 = new AObjectS115S0000000_12(6);
                ?? r60 = new Function0() { // from class: X.0Ts6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C760300Ts4 c760300Ts42 = c760300Ts4;
                        PinMessageViewModel pinMessageViewModel2 = pinMessageViewModel;
                        C1109770ez9 c1109770ez92 = c1109770ez9;
                        DataChannel dataChannel4 = dataChannel3;
                        C1111350f1h c1111350f1h2 = c1111350f1h;
                        AbstractC1110800f0o abstractC1110800f0o2 = abstractC1110800f0o;
                        Function1<AnchorLevelPermission, C0UFE> function1 = aObjectS115S0000000_12;
                        Function1<C474500IjA, C474500IjA> function12 = aObjectS115S0000000_122;
                        c760300Ts42.getClass();
                        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(dataChannel4, function1, new AObjectS12S0600000_12(c760300Ts42, pinMessageViewModel2, c1109770ez92, dataChannel4, c1111350f1h2, abstractC1110800f0o2, 1), function12, C497740JfY.LJIJI(2131843777), Boolean.TRUE);
                        return Unit.LIZ;
                    }
                };
                AObjectS288S0200000_12 aObjectS288S0200000_12 = new AObjectS288S0200000_12(c760300Ts4, dataChannel3, 0);
                AObjectS288S0200000_12 aObjectS288S0200000_122 = new AObjectS288S0200000_12(c760300Ts4, dataChannel3, 1);
                Function0 function0 = new Function0() { // from class: X.0Ts5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C760300Ts4 c760300Ts42 = c760300Ts4;
                        PinMessageViewModel pinMessageViewModel2 = pinMessageViewModel;
                        C1109770ez9 c1109770ez92 = c1109770ez9;
                        DataChannel dataChannel4 = dataChannel3;
                        C1111350f1h c1111350f1h2 = c1111350f1h;
                        AbstractC1110800f0o abstractC1110800f0o2 = abstractC1110800f0o;
                        c760300Ts42.getClass();
                        if (pinMessageViewModel2 != null && c1109770ez92 != null) {
                            C760300Ts4.LIZ(dataChannel4, c1109770ez92, pinMessageViewModel2, c1111350f1h2);
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).wc1(abstractC1110800f0o2.LJIL);
                        }
                        return Unit.LIZ;
                    }
                };
                c1111350f1h.LIZJ = abstractC1110800f0o.LLIIIL();
                C1109640eyw c1109640eyw = abstractC1110800f0o.LJIIZILJ;
                if (c1109640eyw.LIZIZ && (c1109020exw = c1109640eyw.LIZJ) != null) {
                    PinMessage pinMessage = c1109020exw.LJI;
                    if (pinMessage != null) {
                        messageId = pinMessage.getMessageId();
                    } else {
                        messageId = 0;
                    }
                    c1111350f1h.LIZLLL = messageId;
                    PinMessage pinMessage2 = c1109020exw.LJI;
                    if (pinMessage2 != null) {
                        j2 = pinMessage2.pinId;
                    } else {
                        j2 = 0;
                    }
                    c1111350f1h.LJ = j2;
                }
                DataChannel dataChannel4 = c1109770ez9.LJIIIZ;
                if (dataChannel4 != null && (user = (User) dataChannel4.gg0(RoomUserChannel.class)) != null && (userAttr = user.getUserAttr()) != null) {
                    z = userAttr.isAdmin;
                } else {
                    z = false;
                }
                String str3 = null;
                String strLLJLLL = "";
                if (abstractC1110800f0o.LJIIZILJ.LIZ && abstractC1110800f0o.LLILII()) {
                    C1109010exv c1109010exv = C1109010exv.LIZ;
                    final long j3 = c1109770ez9.LJIIZILJ;
                    c1109010exv.getClass();
                    C1109030exx c1109030exx = C1109030exx.LIZ;
                    if (C1109030exx.LIZ(new InterfaceC1109210eyF(j3) { // from class: X.0eyE
                        @Override // X.InterfaceC1109210eyF
                        public final boolean LIZ(InterfaceC1109140ey8 interfaceC1109140ey8) {
                            return interfaceC1109140ey8.LJIILIIL();
                        }
                    }) != null) {
                        C472890IgZ.LIZ(Long.valueOf(j3), "interceptor");
                    } else {
                        DataChannel dataChannel5 = C1109010exv.LIZIZ.get(j3);
                        LongSparseArray<Integer> longSparseArray = C1109010exv.LIZJ;
                        Integer num = longSparseArray.get(j3);
                        if (num != null && num.intValue() == 0) {
                            if (dataChannel5 != null) {
                                if (C500260Jjc.LJIIZILJ(dataChannel5) || ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hw0()) {
                                    if (c1109770ez9.LIZLLL) {
                                        z2 = true;
                                    }
                                }
                                boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel5));
                            }
                            boolValueOf = null;
                        } else if (dataChannel5 != null) {
                            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel5));
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf)) {
                            Integer num2 = longSparseArray.get(j3);
                            if (num2 == null || (string2 = num2.toString()) == null) {
                                string2 = "";
                            }
                            C472890IgZ.LIZ(Long.valueOf(j3), string2);
                        }
                        if (C500260Jjc.LJJJI(Boolean.valueOf(C01C5.LIZ(dataChannel5)))) {
                            if (!((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hw0()) {
                                C472890IgZ.LIZ(Long.valueOf(j3), "do not have permission");
                            }
                            Integer num3 = longSparseArray.get(j3);
                            if (num3 == null || (string = num3.toString()) == null) {
                                string = "";
                            }
                            C472890IgZ.LIZ(Long.valueOf(j3), string);
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z && ((room != null || (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null) && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.pin == 0)) {
                    C472890IgZ.LIZ(Long.valueOf(room.getId()), "anchorLevelPermission pin == 0");
                    z2 = false;
                }
                if (((Boolean) dataChannel3.gg0(IsLiveStudioMonitorChannel.class)).booleanValue()) {
                    z2 = false;
                }
                HashMap map = new HashMap();
                if (abstractC1110800f0o.LJIIZILJ.LIZIZ) {
                    map.put("reply_method", "pin");
                } else if (abstractC1110800f0o.LLIILZL()) {
                    map.put("reply_method", "anchor");
                } else {
                    map.put("reply_method", "viewer");
                }
                String str4 = "click_msg";
                if (c1111350f1h.LIZIZ.equals("click")) {
                    obj = "click_msg";
                } else {
                    obj = "long_press_msg";
                }
                map.put("reply_event_page", obj);
                int i = 2131844580;
                if (c1109770ez9.LIZLLL) {
                    FragmentManager fragmentManager = (FragmentManager) dataChannel3.gg0(C748880TZe.class);
                    C755070Tjd.LIZ(c1109770ez9.LJI);
                    if (fragmentManager != null) {
                        String strLJIJI2 = "";
                        if (abstractC1110800f0o instanceof InterfaceC759280TqQ) {
                            InterfaceC759280TqQ interfaceC759280TqQ = (InterfaceC759280TqQ) abstractC1110800f0o;
                            if (c1109770ez9.LJ) {
                                if (interfaceC759280TqQ.LJLLL()) {
                                    strLJIJI2 = C497740JfY.LJIJI(2131844580);
                                } else {
                                    strLJIJI2 = C497740JfY.LJIJI(2131844572);
                                }
                            }
                            Context context = c1109770ez9.LIZ;
                            User user2 = abstractC1110800f0o.getUser();
                            Room room2 = c1109770ez9.LJII;
                            boolean z4 = c1109770ez9.LJI;
                            boolean zLIZ2 = C01C5.LIZ(dataChannel3);
                            MESSAGE message = abstractC1110800f0o.LJIL;
                            InterfaceC2262081DgM interfaceC2262081DgM = (InterfaceC2262081DgM) dataChannel3.gg0(RoomUserChannel.class);
                            String str5 = (String) dataChannel3.gg0(C760110Trl.class);
                            Boolean boolValueOf2 = Boolean.valueOf(c1109770ez9.LJ);
                            if (strLJIJI2 == null) {
                                strLJIJI2 = "";
                            }
                            AObjectS1S0900000_12 aObjectS1S0900000_12 = new AObjectS1S0900000_12(c760300Ts4, interfaceC759280TqQ, abstractC1110800f0o, c1111350f1h, c1109770ez9, dataChannel3, pinMessageViewModel, this, aObjectS355S0100000_12, 1);
                            final int i2 = 2;
                            Function0 function02 = new Function0(abstractC1110800f0o, c513501zJ, i2) { // from class: X.01zF
                                public final int $t;
                                public Object l0;
                                public Object l1;

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (this.$t) {
                                        case 0:
                                            return invoke$0(this);
                                        case 1:
                                            return invoke$1(this);
                                        case 2:
                                            return invoke$2(this);
                                        default:
                                            return null;
                                    }
                                }

                                public static final Object invoke$0(C513101zF c513101zF) {
                                    AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) c513101zF.l0;
                                    Function2 function2 = (Function2) c513101zF.l1;
                                    MESSAGE message2 = abstractC1110800f0o2.LJIL;
                                    if (message2 instanceof ChatMessage) {
                                        function2.invoke(message2, abstractC1110800f0o2);
                                    }
                                    return Unit.LIZ;
                                }

                                public static final Object invoke$1(C513101zF c513101zF) {
                                    AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) c513101zF.l0;
                                    Function2 function2 = (Function2) c513101zF.l1;
                                    MESSAGE message2 = abstractC1110800f0o2.LJIL;
                                    if (message2 instanceof ChatMessage) {
                                        function2.invoke(message2, abstractC1110800f0o2);
                                    }
                                    return Unit.LIZ;
                                }

                                public static final Object invoke$2(C513101zF c513101zF) {
                                    AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) c513101zF.l0;
                                    Function2 function2 = (Function2) c513101zF.l1;
                                    MESSAGE message2 = abstractC1110800f0o2.LJIL;
                                    if (message2 instanceof ChatMessage) {
                                        function2.invoke(message2, abstractC1110800f0o2);
                                    }
                                    return Unit.LIZ;
                                }

                                {
                                    this.$t = i2;
                                    this.l0 = abstractC1110800f0o;
                                    this.l1 = c513501zJ;
                                }
                            };
                            boolean z5 = abstractC1110800f0o.LJIIZILJ.LIZIZ;
                            if (!c1111350f1h.LIZIZ.equals("click")) {
                                str4 = "long_press_msg";
                            }
                            c1112040f2o = new C1112040f2o(context, abstractC1110800f0o, user2, room2, z4, zLIZ2, message, interfaceC2262081DgM, c1111350f1h, str5, boolValueOf2, z2, strLJIJI2, map, aObjectS1S0900000_12, r60, aObjectS288S0200000_12, fragmentManager, function02, z5, dataChannel3, str4);
                        } else {
                            Context context2 = c1109770ez9.LIZ;
                            User user3 = abstractC1110800f0o.getUser();
                            Room room3 = c1109770ez9.LJII;
                            boolean z6 = c1109770ez9.LJI;
                            boolean zLIZ3 = C01C5.LIZ(dataChannel3);
                            MESSAGE message2 = abstractC1110800f0o.LJIL;
                            InterfaceC2262081DgM interfaceC2262081DgM2 = (InterfaceC2262081DgM) dataChannel3.gg0(RoomUserChannel.class);
                            String str6 = (String) dataChannel3.gg0(C760110Trl.class);
                            Boolean bool = Boolean.FALSE;
                            final int i3 = 0;
                            Function0 function03 = new Function0(abstractC1110800f0o, c513501zJ, i3) { // from class: X.01zF
                                public final int $t;
                                public Object l0;
                                public Object l1;

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (this.$t) {
                                        case 0:
                                            return invoke$0(this);
                                        case 1:
                                            return invoke$1(this);
                                        case 2:
                                            return invoke$2(this);
                                        default:
                                            return null;
                                    }
                                }

                                public static final Object invoke$0(C513101zF c513101zF) {
                                    AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) c513101zF.l0;
                                    Function2 function2 = (Function2) c513101zF.l1;
                                    MESSAGE message22 = abstractC1110800f0o2.LJIL;
                                    if (message22 instanceof ChatMessage) {
                                        function2.invoke(message22, abstractC1110800f0o2);
                                    }
                                    return Unit.LIZ;
                                }

                                public static final Object invoke$1(C513101zF c513101zF) {
                                    AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) c513101zF.l0;
                                    Function2 function2 = (Function2) c513101zF.l1;
                                    MESSAGE message22 = abstractC1110800f0o2.LJIL;
                                    if (message22 instanceof ChatMessage) {
                                        function2.invoke(message22, abstractC1110800f0o2);
                                    }
                                    return Unit.LIZ;
                                }

                                public static final Object invoke$2(C513101zF c513101zF) {
                                    AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) c513101zF.l0;
                                    Function2 function2 = (Function2) c513101zF.l1;
                                    MESSAGE message22 = abstractC1110800f0o2.LJIL;
                                    if (message22 instanceof ChatMessage) {
                                        function2.invoke(message22, abstractC1110800f0o2);
                                    }
                                    return Unit.LIZ;
                                }

                                {
                                    this.$t = i3;
                                    this.l0 = abstractC1110800f0o;
                                    this.l1 = c513501zJ;
                                }
                            };
                            boolean z7 = abstractC1110800f0o.LJIIZILJ.LIZIZ;
                            if (!c1111350f1h.LIZIZ.equals("click")) {
                                str4 = "long_press_msg";
                            }
                            c1112040f2o = new C1112040f2o(context2, abstractC1110800f0o, user3, room3, z6, zLIZ3, message2, interfaceC2262081DgM2, c1111350f1h, str6, bool, z2, "", map, null, r60, aObjectS288S0200000_12, fragmentManager, function03, z7, dataChannel3, str4);
                        }
                        User user4 = abstractC1110800f0o.getUser();
                        Room room4 = c1109770ez9.LJII;
                        ArrayList arrayList = new ArrayList();
                        dataChannel2 = dataChannel3;
                        arrayList.add(new Pair(new AbstractC755190Tjp() { // from class: X.0Tk5
                            {
                                C497740JfY.LJIJI(2131852222);
                                C755200Tjq c755200Tjq = C755360Tk6.LJII;
                                EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                                C497740JfY.LJIJI(2131852207);
                            }
                        }, new C752420TfM(new C752430TfN(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LIZIZ, c1112040f2o.LJIILIIL, c1112040f2o.LJIJJLI))));
                        arrayList.add(new Pair(new AbstractC755190Tjp() { // from class: X.0Tk8
                            {
                                C497740JfY.LJIJI(2131852222);
                                C497740JfY.LJIJI(2131852209);
                                C755200Tjq c755200Tjq = C755360Tk6.LJI;
                                EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION0;
                            }
                        }, new C753020TgK(new C753010TgJ(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LIZIZ, c1112040f2o.LJIJJLI))));
                        arrayList.add(new Pair(new AbstractC755190Tjp() { // from class: X.0Tk9
                            {
                                C755200Tjq c755200Tjq = C755360Tk6.LIZ;
                                EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                            }
                        }, new C753270Tgj(new C753080TgQ(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LIZIZ, c1112040f2o.LJIILIIL, c1112040f2o.LJIJI, c1112040f2o.LJIJJLI))));
                        arrayList.add(new Pair(new C755400TkA(), new C755020TjY(new C755030TjZ(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LJIIL, c1112040f2o.LJIILJJIL, c1112040f2o.LJIIJ, c1112040f2o.LJIJJLI, c1112040f2o.LIZIZ))));
                        if (user4 != null && (enigmaInfo = user4.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn && (c1109770ez9.LJI || z)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            abstractC755190Tjp = new AbstractC755190Tjp() { // from class: X.0Tk7
                                {
                                    C497740JfY.LJIJI(2131843777);
                                    C755200Tjq c755200Tjq = C755360Tk6.LJIIIIZZ;
                                    EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                                }
                            };
                        } else {
                            abstractC755190Tjp = new AbstractC755190Tjp() { // from class: X.0Tk4
                                {
                                    C497740JfY.LJIJI(2131843777);
                                    C755200Tjq c755200Tjq = C755360Tk6.LIZ;
                                    EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                                }
                            };
                        }
                        arrayList.add(new Pair(abstractC755190Tjp, new C752980TgG(new C752990TgH(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LJIIJJI, c1112040f2o.LJIILL, c1112040f2o.LJIJJLI))));
                        arrayList.add(new Pair(new AbstractC755190Tjp() { // from class: X.0Tjx
                            {
                                C497740JfY.LJIJI(2131854911);
                                C755200Tjq c755200Tjq = C755360Tk6.LIZ;
                                C1697810uHb.LJIILJJIL(EnumC755280Tjy.ADMIN, EnumC755280Tjy.VIEWER);
                                EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                            }
                        }, new C755010TjX(new C753000TgI(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LIZIZ, c1112040f2o.LJIJJLI))));
                        arrayList.add(new Pair(new AbstractC755190Tjp() { // from class: X.0Tk2
                            {
                                C497740JfY.LJIJI(2131840712);
                                C755200Tjq c755200Tjq = C755360Tk6.LIZ;
                                EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                            }
                        }, new C753040TgM(new C753030TgL(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJ, c1112040f2o.LJIJJLI))));
                        if (c1109770ez9.LJI && user4 != null && room4 != null) {
                            C752910Tg9 c752910Tg9As2 = ((ISheetPanelService) C1161920gLG.LIZJ(ISheetPanelService.class)).as2(room4, user4, dataChannel3);
                            new C755240Tju();
                            arrayList.add(new Pair(new C755240Tju(), c752910Tg9As2));
                        }
                        ISheetPanelService iSheetPanelService = (ISheetPanelService) C1161920gLG.LIZJ(ISheetPanelService.class);
                        if (iSheetPanelService != 0) {
                            C755300Tk0 c755300Tk0 = new C755300Tk0();
                            final User user5 = c1112040f2o.LIZJ;
                            final boolean z8 = c1112040f2o.LJ;
                            final boolean z9 = c1112040f2o.LJFF;
                            final Room room5 = c1112040f2o.LIZLLL;
                            final Context context3 = c1112040f2o.LIZ;
                            final AbstractC1136060ffY abstractC1136060ffY = c1112040f2o.LJI;
                            final InterfaceC2262081DgM interfaceC2262081DgM3 = c1112040f2o.LJII;
                            final FragmentManager fragmentManager2 = c1112040f2o.LJIIZILJ;
                            final DataChannel dataChannel6 = c1112040f2o.LJIJJ;
                            final String str7 = c1112040f2o.LJIJJLI;
                            arrayList.add(new Pair(c755300Tk0, iSheetPanelService.qw2(new C750600TcQ(context3, fragmentManager2, interfaceC2262081DgM3, user5, abstractC1136060ffY, room5, dataChannel6, str7, z8, z9) { // from class: X.0TcS
                            })));
                            C755290Tjz c755290Tjz = new C755290Tjz();
                            User user6 = c1112040f2o.LIZJ;
                            boolean z10 = c1112040f2o.LJ;
                            boolean z11 = c1112040f2o.LJFF;
                            Room room6 = c1112040f2o.LIZLLL;
                            arrayList.add(new Pair(c755290Tjz, iSheetPanelService.uq0(new C750600TcQ(c1112040f2o.LIZ, c1112040f2o.LJIIZILJ, c1112040f2o.LJII, user6, c1112040f2o.LJI, room6, c1112040f2o.LJIJJ, c1112040f2o.LJIJJLI, z10, z11))));
                            C755310Tk1 c755310Tk1 = new C755310Tk1();
                            User user7 = c1112040f2o.LIZJ;
                            boolean z12 = c1112040f2o.LJ;
                            boolean z13 = c1112040f2o.LJFF;
                            Room room7 = c1112040f2o.LIZLLL;
                            Context context4 = c1112040f2o.LIZ;
                            AbstractC1136060ffY abstractC1136060ffY2 = c1112040f2o.LJI;
                            InterfaceC2262081DgM interfaceC2262081DgM4 = c1112040f2o.LJII;
                            FragmentManager fragmentManager3 = c1112040f2o.LJIIZILJ;
                            DataChannel dataChannel7 = c1112040f2o.LJIJJ;
                            AbstractC1110800f0o<?> abstractC1110800f0o2 = c1112040f2o.LIZIZ;
                            if (abstractC1110800f0o2 != null && (c1111420f1o = abstractC1110800f0o2.LJIJ) != null) {
                                j = c1111420f1o.LIZ;
                            } else {
                                j = 0;
                            }
                            if (abstractC1110800f0o2 instanceof AbstractC1110520f0M) {
                                strLLJLLL = ((AbstractC1110520f0M) abstractC1110800f0o2).LLJLLL();
                            }
                            C1111350f1h c1111350f1h2 = c1112040f2o.LJIIIIZZ;
                            if (c1111350f1h2 != null) {
                                str2 = c1111350f1h2.LIZ;
                            } else {
                                str2 = null;
                            }
                            String str8 = c1112040f2o.LJIIIZ;
                            if (c1111350f1h2 != null) {
                                str3 = c1111350f1h2.LIZJ;
                            }
                            arrayList.add(new Pair(c755310Tk1, iSheetPanelService.uG2(new C752350TfF(user7, z12, z13, room7, context4, abstractC1136060ffY2, interfaceC2262081DgM4, fragmentManager3, dataChannel7, j, strLLJLLL, str2, str8, str3, c1112040f2o.LJIJJLI, c1112040f2o.LJIILLIIL))));
                        }
                        arrayList.add(new Pair(new C755260Tjw(), new C750640TcU(new C750650TcV(c1112040f2o.LIZJ, c1112040f2o.LJ, c1112040f2o.LJFF, c1112040f2o.LIZLLL, c1112040f2o.LIZ, c1112040f2o.LJI, c1112040f2o.LJII, c1112040f2o.LJIIZILJ, c1112040f2o.LJIJJ, c1112040f2o.LJIJJLI, false))));
                        ((ISheetPanelService) C1161920gLG.LIZJ(ISheetPanelService.class)).vB2(fragmentManager, arrayList, new InterfaceC1090170eTX() { // from class: X.0TgN
                            @Override // X.InterfaceC1090170eTX
                            public final void LIZ(long j4) {
                            }
                        }, abstractC1110800f0o.getUser(), room, aObjectS288S0200000_122);
                    } else {
                        dataChannel2 = dataChannel3;
                    }
                } else {
                    boolean z14 = true;
                    dataChannel2 = dataChannel3;
                    int i4 = 2131844572;
                    if (C500260Jjc.LJJJIL(dataChannel3)) {
                        Context context5 = c1109770ez9.LIZ;
                        User user8 = abstractC1110800f0o.getUser();
                        Room room8 = c1109770ez9.LJII;
                        MESSAGE message3 = abstractC1110800f0o.LJIL;
                        InterfaceC2262081DgM interfaceC2262081DgM5 = (InterfaceC2262081DgM) dataChannel2.gg0(RoomUserChannel.class);
                        String str9 = (String) dataChannel2.gg0(C760110Trl.class);
                        boolean z15 = abstractC1110800f0o.LJIIZILJ.LIZ;
                        FragmentManager fragmentManager4 = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                        boolean z16 = abstractC1110800f0o.LJIIZILJ.LIZIZ;
                        if (!c1111350f1h.LIZIZ.equals("click")) {
                            str4 = "long_press_msg";
                        }
                        ViewOnClickListenerC755040Tja viewOnClickListenerC755040Tja = new ViewOnClickListenerC755040Tja(context5, abstractC1110800f0o, user8, room8, true, false, message3, interfaceC2262081DgM5, c1111350f1h, str9, false, false, z15, "", map, null, function0, aObjectS288S0200000_12, fragmentManager4, null, z16, dataChannel2, str4, aObjectS288S0200000_122);
                        viewOnClickListenerC755040Tja.show();
                        C785410UrT.LIZIZ(viewOnClickListenerC755040Tja);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(viewOnClickListenerC755040Tja);
                        C816490W1f.LIZ(viewOnClickListenerC755040Tja);
                    } else if (abstractC1110800f0o instanceof InterfaceC759280TqQ) {
                        InterfaceC759280TqQ interfaceC759280TqQ2 = (InterfaceC759280TqQ) abstractC1110800f0o;
                        if (!c1109770ez9.LJ) {
                            strLJIJI = "";
                        } else if (interfaceC759280TqQ2.LJLLL()) {
                            if (zLIZ) {
                                i = 2131842954;
                            }
                            strLJIJI = C497740JfY.LJIJI(i);
                        } else {
                            if (zLIZ) {
                                i4 = 2131842952;
                            }
                            strLJIJI = C497740JfY.LJIJI(i4);
                        }
                        Context context6 = c1109770ez9.LIZ;
                        User user9 = abstractC1110800f0o.getUser();
                        Room room9 = c1109770ez9.LJII;
                        boolean z17 = c1109770ez9.LJI;
                        boolean zLIZ4 = C01C5.LIZ(dataChannel2);
                        MESSAGE message4 = abstractC1110800f0o.LJIL;
                        InterfaceC2262081DgM interfaceC2262081DgM6 = (InterfaceC2262081DgM) dataChannel2.gg0(RoomUserChannel.class);
                        String str10 = (String) dataChannel2.gg0(C760110Trl.class);
                        boolean z18 = c1109770ez9.LJ;
                        if (!z18 || !zLIZ) {
                            z14 = false;
                        }
                        if (strLJIJI == null) {
                            strLJIJI = "";
                        }
                        AObjectS1S0900000_12 aObjectS1S0900000_122 = new AObjectS1S0900000_12(c760300Ts4, interfaceC759280TqQ2, abstractC1110800f0o, c1111350f1h, c1109770ez9, dataChannel2, pinMessageViewModel, this, aObjectS355S0100000_12, 0);
                        FragmentManager fragmentManager5 = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                        final int i5 = 1;
                        ?? r7 = new Function0(abstractC1110800f0o, c513501zJ, i5) { // from class: X.01zF
                            public final int $t;
                            public Object l0;
                            public Object l1;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (this.$t) {
                                    case 0:
                                        return invoke$0(this);
                                    case 1:
                                        return invoke$1(this);
                                    case 2:
                                        return invoke$2(this);
                                    default:
                                        return null;
                                }
                            }

                            public static final Object invoke$0(C513101zF c513101zF) {
                                AbstractC1110800f0o abstractC1110800f0o22 = (AbstractC1110800f0o) c513101zF.l0;
                                Function2 function2 = (Function2) c513101zF.l1;
                                MESSAGE message22 = abstractC1110800f0o22.LJIL;
                                if (message22 instanceof ChatMessage) {
                                    function2.invoke(message22, abstractC1110800f0o22);
                                }
                                return Unit.LIZ;
                            }

                            public static final Object invoke$1(C513101zF c513101zF) {
                                AbstractC1110800f0o abstractC1110800f0o22 = (AbstractC1110800f0o) c513101zF.l0;
                                Function2 function2 = (Function2) c513101zF.l1;
                                MESSAGE message22 = abstractC1110800f0o22.LJIL;
                                if (message22 instanceof ChatMessage) {
                                    function2.invoke(message22, abstractC1110800f0o22);
                                }
                                return Unit.LIZ;
                            }

                            public static final Object invoke$2(C513101zF c513101zF) {
                                AbstractC1110800f0o abstractC1110800f0o22 = (AbstractC1110800f0o) c513101zF.l0;
                                Function2 function2 = (Function2) c513101zF.l1;
                                MESSAGE message22 = abstractC1110800f0o22.LJIL;
                                if (message22 instanceof ChatMessage) {
                                    function2.invoke(message22, abstractC1110800f0o22);
                                }
                                return Unit.LIZ;
                            }

                            {
                                this.$t = i5;
                                this.l0 = abstractC1110800f0o;
                                this.l1 = c513501zJ;
                            }
                        };
                        boolean z19 = abstractC1110800f0o.LJIIZILJ.LIZIZ;
                        if (!c1111350f1h.LIZIZ.equals("click")) {
                            str4 = "long_press_msg";
                        }
                        ViewOnClickListenerC755040Tja viewOnClickListenerC755040Tja2 = new ViewOnClickListenerC755040Tja(context6, abstractC1110800f0o, user9, room9, z17, zLIZ4, message4, interfaceC2262081DgM6, c1111350f1h, str10, z14, z18, z2, strLJIJI, map, aObjectS1S0900000_122, r60, aObjectS288S0200000_12, fragmentManager5, r7, z19, dataChannel2, str4, aObjectS288S0200000_122);
                        viewOnClickListenerC755040Tja2.show();
                        C785410UrT.LIZIZ(viewOnClickListenerC755040Tja2);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(viewOnClickListenerC755040Tja2);
                        C816490W1f.LIZ(viewOnClickListenerC755040Tja2);
                        c1109770ez9 = c1109770ez9;
                    } else {
                        Context context7 = c1109770ez9.LIZ;
                        User user10 = abstractC1110800f0o.getUser();
                        Room room10 = c1109770ez9.LJII;
                        boolean z20 = c1109770ez9.LJI;
                        boolean zLIZ5 = C01C5.LIZ(dataChannel2);
                        MESSAGE message5 = abstractC1110800f0o.LJIL;
                        InterfaceC2262081DgM interfaceC2262081DgM7 = (InterfaceC2262081DgM) dataChannel2.gg0(RoomUserChannel.class);
                        String str11 = (String) dataChannel2.gg0(C760110Trl.class);
                        FragmentManager fragmentManager6 = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                        boolean z21 = abstractC1110800f0o.LJIIZILJ.LIZIZ;
                        if (!c1111350f1h.LIZIZ.equals("click")) {
                            str4 = "long_press_msg";
                        }
                        ViewOnClickListenerC755040Tja viewOnClickListenerC755040Tja3 = new ViewOnClickListenerC755040Tja(context7, abstractC1110800f0o, user10, room10, z20, zLIZ5, message5, interfaceC2262081DgM7, c1111350f1h, str11, false, false, z2, "", map, null, r60, aObjectS288S0200000_12, fragmentManager6, null, z21, dataChannel2, str4, aObjectS288S0200000_122);
                        viewOnClickListenerC755040Tja3.show();
                        C785410UrT.LIZIZ(viewOnClickListenerC755040Tja3);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(viewOnClickListenerC755040Tja3);
                        C816490W1f.LIZ(viewOnClickListenerC755040Tja3);
                    }
                }
                HashMap map2 = new HashMap();
                if (abstractC1110800f0o.LLIILII() && "click".equals(c1111350f1h.LIZIZ)) {
                    if (abstractC1110800f0o instanceof C1110310f01) {
                        strLLJJJJ = "comment";
                    } else if (abstractC1110800f0o instanceof C1111000f18) {
                        strLLJJJJ = "gift";
                    } else {
                        strLLJJJJ = abstractC1110800f0o.LLJJJJ();
                    }
                    map2.put("message_type", strLLJJJJ);
                    str = "livesdk_message_click";
                } else {
                    map2.put("click_type", c1111350f1h.LIZIZ);
                    map2.put("click_position", c1111350f1h.LJFF);
                    Activity activityLJIJ = C520010KaN.LJIJ(c1109770ez9.LIZ, false);
                    if (activityLJIJ != null) {
                        map2.put("room_orientation", C500260Jjc.LJZL(Integer.valueOf(activityLJIJ.getRequestedOrientation())));
                    }
                    str = "livesdk_long_press_comment";
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
                c474500IjALIZ.LJJII(abstractC1110800f0o.LLJJJ(), "admin_type");
                c474500IjALIZ.LJJII(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId()), "message_id");
                c474500IjALIZ.LJJII(Long.valueOf(abstractC1110800f0o.LJIJ.LIZ), "message_release_id");
                c474500IjALIZ.LJJII(Long.valueOf(abstractC1110800f0o.LLIIJI()), "to_user_id");
                c474500IjALIZ.LJJII(abstractC1110800f0o.LLJJJ(), "user_type");
                c474500IjALIZ.LJJIIZI(map2);
                if (c1109770ez9.LJJ) {
                    c474500IjALIZ.LJJII("live_extended_comment_filed", "event_page");
                } else if (!((Boolean) dataChannel2.gg0(C753280Tgk.class)).booleanValue()) {
                    c474500IjALIZ.LJJII("au_u16_live_comment_privacy_panel", "event_page");
                }
                c474500IjALIZ.LIZ();
                dataChannel2.FQ2(ShowReplyDialogEvent.class);
                MESSAGE message6 = abstractC1110800f0o.LJIL;
                if (message6 == 0) {
                    return;
                }
                HashMap map3 = new HashMap();
                map3.put("longClickedMessage", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, IdMessage.from(message6)));
                C1143300frE.LJIIJJI().LIZIZ("ttlive_text_message_long_clicked", map3);
            }
        }
    }

    public final boolean LJJJZ(AbstractC1136060ffY abstractC1136060ffY, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (interfaceC1112060f2q == null && (interfaceC1112060f2q = LJJLIIIJJI(abstractC1136060ffY)) == null) {
            return false;
        }
        if (LJJJLZIJ(interfaceC1112060f2q)) {
            return true;
        }
        ((PriorityQueue) this.LLJJL).add(interfaceC1112060f2q);
        LJLJLJ(interfaceC1112060f2q);
        this.LL.LIZIZ(interfaceC1112060f2q, ((PriorityQueue) this.LLJJL).size());
        if (interfaceC1112060f2q.LJJJJLI()) {
            LJLJL();
        }
        return true;
    }

    public final boolean LJJL(AbstractC1136060ffY abstractC1136060ffY, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (interfaceC1112060f2q == null && (interfaceC1112060f2q = LJJLIIIJJI(abstractC1136060ffY)) == null) {
            return false;
        }
        if (LJJJLZIJ(interfaceC1112060f2q)) {
            return true;
        }
        if (!this.LLZ.LJFF(interfaceC1112060f2q)) {
            ((PriorityQueue) this.LLJJJJLIIL).add(interfaceC1112060f2q);
            LJLJLJ(interfaceC1112060f2q);
            this.LL.LJ(interfaceC1112060f2q, ((PriorityQueue) this.LLJJJJLIIL).size());
            if (interfaceC1112060f2q.LJJJJLI()) {
                LJLJL();
            }
            return true;
        }
        LJLJLJ(interfaceC1112060f2q);
        this.LL.LJ(interfaceC1112060f2q, this.LLZ.LIZ());
        return true;
    }

    public final void LJJLIIIJLLLLLLLZ(float f, int i) {
        this.LLLLLLLLL = f;
        this.LLLJL.LJJIII = f;
        LLF(i);
        int i2 = this.LLJIJIL;
        this.LLJILJILJ = i2;
        this.LLLJL.LJJIIZ = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x078f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJLIL(X.AbstractC1136060ffY r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111930f2d.LJLIL(X.0ffY, boolean):long");
    }

    public final void LJLLL(long j, Runnable runnable) {
        C1112120f2w c1112120f2w = this.LLLLLZ;
        long j2 = this.LLILZ;
        if (j2 > 0) {
            j = j2;
        }
        c1112120f2w.LIZ(j, runnable);
    }

    public final void LLFFF(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        if ((z && LJJJLZIJ(interfaceC1112060f2q)) || interfaceC1112060f2q == null) {
            return;
        }
        if (interfaceC1112060f2q.LJLIIL().LIZ) {
            if (!C468250IXv.LIZ(this.dataChannel)) {
                this.LLLLLZ.LIZJ(new ARunnableS86S0200000_17(this, interfaceC1112060f2q, 59));
                return;
            }
            return;
        }
        if (!this.LLLLJI && interfaceC1112060f2q.LJJJJLI()) {
            this.LLLLJI = true;
        }
        InterfaceC1112720f3u interfaceC1112720f3uLJLLLLLL = LJLLLLLL(interfaceC1112060f2q);
        ArrayList arrayList = new ArrayList();
        if (interfaceC1112720f3uLJLLLLLL == null) {
            arrayList.add(interfaceC1112060f2q);
            LJJLIIIJ(arrayList);
        } else {
            arrayList.add(interfaceC1112060f2q);
            arrayList.add(interfaceC1112720f3uLJLLLLLL);
            LJJLIIIJ(arrayList);
        }
    }

    public final void uH1(InterfaceC1112320f3G interfaceC1112320f3G, boolean z) {
        this.LLLLIL = interfaceC1112320f3G;
        T t = this.mView;
        if (t != 0) {
            ((InterfaceC1112050f2p) t).uH1(interfaceC1112320f3G, z);
        }
    }

    @Override // X.InterfaceC1110630f0X
    public final void LJIIJ(int i, long j, long j2) {
        C1109770ez9 c1109770ez9 = this.LLLJL;
        if (c1109770ez9 != null && c1109770ez9.LJI) {
            C480460Ism.LIZ().getClass();
            ((PublicScreenApi) C480460Ism.LIZLLL(PublicScreenApi.class)).wave(this.LLLJL.LJIIZILJ, j, j2, i).LJIILIIL(new C0UO0()).LJJLL(new AfS136S0000000_13(6), new AfS136S0000000_13(7));
        }
    }

    public final void LJLILLLLZI(InterfaceC1109220eyG interfaceC1109220eyG, InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
            ((InterfaceC1109650eyx) interfaceC1112060f2q).LJII(this.LLLJL);
            AbstractC1136060ffY abstractC1136060ffY = ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
            InterfaceC1111800f2Q<? extends IMessage> interfaceC1111800f2Q = (InterfaceC1111800f2Q) ((HashMap) this.LLLILZ.LIZ).get(abstractC1136060ffY.getClass());
            if (interfaceC1111800f2Q != null && interfaceC1111800f2Q.LIZ(abstractC1136060ffY, this.LLLJL)) {
                this.LL.LJIIL(interfaceC1111800f2Q, abstractC1136060ffY);
                if (interfaceC1109220eyG != null) {
                    interfaceC1109220eyG.LIZ(0L);
                    return;
                }
                return;
            }
        }
        this.LL.LJII(interfaceC1112060f2q);
        this.LLLLLZ.LIZIZ(new ARunnableS10S0310000_17(interfaceC1112060f2q, interfaceC1109220eyG, this, z, 1));
    }

    public final void LJZL(int i, InterfaceC1112060f2q interfaceC1112060f2q, C1110300f00 c1110300f00) {
        int iIndexOf;
        if (i >= 0 && i < this.LLJLL.LJFF() && interfaceC1112060f2q != null && this.mView != 0 && this.LLLJL != null) {
            if (!this.LLJLL.LIZIZ.contains(interfaceC1112060f2q) && (interfaceC1112060f2q instanceof InterfaceC1109650eyx)) {
                ((InterfaceC1109650eyx) interfaceC1112060f2q).LJII(this.LLLJL);
            }
            InterfaceC1112060f2q interfaceC1112060f2qLIZJ = this.LLJLL.LIZJ(i);
            interfaceC1112060f2qLIZJ.dispose();
            int iLJI = this.LLJLL.LJI(interfaceC1112060f2qLIZJ);
            C1111990f2j<InterfaceC1112060f2q> c1111990f2j = this.LLJLL;
            Object obj = ListProtector.get(c1111990f2j.LIZIZ, i);
            ListProtector.set(c1111990f2j.LIZIZ, i, interfaceC1112060f2q);
            if (c1111990f2j.LJI && (iIndexOf = c1111990f2j.LIZJ.indexOf(obj)) != -1) {
                c1111990f2j.LIZJ.set(iIndexOf, interfaceC1112060f2q);
            }
            if (iLJI != -1) {
                ((InterfaceC1112050f2p) this.mView).s11(iLJI, c1110300f00);
            }
        }
    }

    public final long LLD(boolean z, InterfaceC1112060f2q interfaceC1112060f2q, boolean z2) {
        long defaultPriorityForAudience;
        interfaceC1112060f2q.LJJIJIL();
        if (interfaceC1112060f2q.getPriority() == 0) {
            if (this.LLLJL.LJI) {
                defaultPriorityForAudience = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAnchor();
            } else {
                defaultPriorityForAudience = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAudience();
            }
            interfaceC1112060f2q.LJJJLZIJ(defaultPriorityForAudience);
        }
        if (!interfaceC1112060f2q.instant() && !z) {
            if (!this.LLLLLIL && this.LLLJL.LJI && !this.LLLLJ && interfaceC1112060f2q.LJJJJLI() && !this.LLLLL && !this.LLLLJI) {
                LLFFF(interfaceC1112060f2q, z2);
                ((InterfaceC1112050f2p) this.mView).PF1(!this.LLLLLLLZIL);
            } else if (interfaceC1112060f2q.LLIL() && interfaceC1112060f2q.LJJJJZI()) {
                if (((ArrayDeque) this.LLJJLIIIJLLLLLLLZ).size() < 100) {
                    ((ArrayDeque) this.LLJJLIIIJLLLLLLLZ).add(interfaceC1112060f2q);
                    interfaceC1112060f2q.LJJJJI().LIZ = true;
                    interfaceC1112060f2q.LJJJJI().LIZIZ = SystemClock.uptimeMillis();
                    this.LL.LIZLLL(interfaceC1112060f2q);
                    this.LL.LJFF(interfaceC1112060f2q);
                    if (interfaceC1112060f2q.LJJJJLI()) {
                        LJLJL();
                    }
                } else {
                    interfaceC1112060f2q.dispose();
                    this.LL.LJIIJ(interfaceC1112060f2q, false);
                    C1112010f2l c1112010f2l = this.LL;
                    if (!c1112010f2l.LJII) {
                        Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1112020f2m) it2.next()).LJJIIZI();
                        }
                    }
                }
            } else if (interfaceC1112060f2q.LJJLJ()) {
                if (this.LLJL.size() < this.LLJJIJIIJIL) {
                    this.LLJL.add(interfaceC1112060f2q);
                } else if (!LJLJI(interfaceC1112060f2q)) {
                    interfaceC1112060f2q.dispose();
                    this.LL.LJIIJ(interfaceC1112060f2q, true);
                }
                interfaceC1112060f2q.LJLIIL().LIZ = true;
                interfaceC1112060f2q.LJJJJI().LIZ = true;
                interfaceC1112060f2q.LJJJJI().LIZIZ = SystemClock.uptimeMillis();
                this.LL.LIZLLL(interfaceC1112060f2q);
                this.LL.LIZJ(interfaceC1112060f2q, this.LLJL.size());
            } else if (interfaceC1112060f2q.LJJJJJ()) {
                if (((PriorityQueue) this.LLJJL).size() < LivePublicScreenBackupMessageBufferSizeSetting.getPublicScreenBackupBufferSize()) {
                    ((PriorityQueue) this.LLJJL).add(interfaceC1112060f2q);
                    LJLJLJ(interfaceC1112060f2q);
                    this.LL.LIZIZ(interfaceC1112060f2q, ((PriorityQueue) this.LLJJL).size());
                    if (interfaceC1112060f2q.LJJJJLI()) {
                        LJLJL();
                    }
                } else {
                    InterfaceC1112060f2q interfaceC1112060f2q2 = (InterfaceC1112060f2q) ((PriorityQueue) this.LLJJL).peek();
                    if (interfaceC1112060f2q2 != null && interfaceC1112060f2q.getPriority() >= interfaceC1112060f2q2.getPriority()) {
                        ((PriorityQueue) this.LLJJL).poll();
                        ((PriorityQueue) this.LLJJL).add(interfaceC1112060f2q);
                        LJLJLJ(interfaceC1112060f2q);
                        this.LL.LIZIZ(interfaceC1112060f2q, ((PriorityQueue) this.LLJJL).size());
                        if (interfaceC1112060f2q.LJJJJLI()) {
                            LJLJL();
                        }
                    } else {
                        interfaceC1112060f2q2 = interfaceC1112060f2q;
                    }
                    interfaceC1112060f2q2.dispose();
                    this.LL.LJIIJ(interfaceC1112060f2q2, false);
                    this.LL.LJIIIIZZ(interfaceC1112060f2q2);
                }
            } else if (this.LLZ.LJFF(interfaceC1112060f2q)) {
                LJLJLJ(interfaceC1112060f2q);
                this.LL.LJ(interfaceC1112060f2q, this.LLZ.LIZ());
            } else if (((PriorityQueue) this.LLJJJJLIIL).size() < this.LLJJJIL) {
                ((PriorityQueue) this.LLJJJJLIIL).add(interfaceC1112060f2q);
                LJLJLJ(interfaceC1112060f2q);
                this.LL.LJ(interfaceC1112060f2q, ((PriorityQueue) this.LLJJJJLIIL).size());
                if (interfaceC1112060f2q.LJJJJLI()) {
                    LJLJL();
                }
            } else {
                InterfaceC1112060f2q interfaceC1112060f2q3 = (InterfaceC1112060f2q) ((PriorityQueue) this.LLJJJJLIIL).peek();
                if (interfaceC1112060f2q3 != null && interfaceC1112060f2q.getPriority() >= interfaceC1112060f2q3.getPriority()) {
                    ((PriorityQueue) this.LLJJJJLIIL).poll();
                    ((PriorityQueue) this.LLJJJJLIIL).add(interfaceC1112060f2q);
                    LJLJLJ(interfaceC1112060f2q);
                    this.LL.LJ(interfaceC1112060f2q, ((PriorityQueue) this.LLJJJJLIIL).size());
                    if (interfaceC1112060f2q.LJJJJLI()) {
                        LJLJL();
                    }
                } else {
                    interfaceC1112060f2q3 = interfaceC1112060f2q;
                }
                interfaceC1112060f2q3.dispose();
                this.LL.LJIIJ(interfaceC1112060f2q3, false);
                this.LL.LJIIJJI(interfaceC1112060f2q3);
            }
        } else {
            if (interfaceC1112060f2q.LJJLJ()) {
                interfaceC1112060f2q.LJLIIL().LIZ = true;
            }
            LLFFF(interfaceC1112060f2q, z2);
            ((InterfaceC1112050f2p) this.mView).PF1(!this.LLLLLLLZIL);
            if (interfaceC1112060f2q instanceof C1110280ezy) {
                this.LLLLLZ.LIZJ(new ARunnableS117S0100000_17((C1111930f2d) this, 186));
            }
        }
        if (z2) {
            LJJJJZI(interfaceC1112060f2q);
        }
        return interfaceC1112060f2q.getToken();
    }
}
