package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.room.ChangeOrientationButtonShowData;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.chatroom.helper.AudienceLivePlayTaskManager;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.PromoteCardDisplayTimeChannel;
import com.bytedance.android.livesdk.dataChannel.PromoteCardShowingStartTimeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.feed.LivePreviewNonPlayEventLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiFormatErrIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkGuestCountForEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkGuestViewStartOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLinkedGuestCntOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostAudienceWatchEventReportMigrate;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicEnableWatchCohostReport;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.livesetting.other.AppLogFlushOptSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AutoReportSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBackgroundDurationCalibrate;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveVariantCardDisplayCalibrationSetting;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdk.sei.VoiceChatSeiRegion;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveSession;
import com.bytedance.android.livesdkapi.depend.model.live.LiveChain;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import qo2.w;
import webcast.api.feed.AwemeCommerceStructV2;
import webcast.api.feed.PseudoAdData;
import webcast.data.LinkmicGuestUser;
import webcast.data.MultiGuestLinkmicInfo;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: renamed from: X.0IVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467650IVn implements InterfaceC467750IVx {
    public volatile boolean LIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final BPEAHandler LJFF;
    public Room LJI;
    public String LJII;
    public boolean LJIIIZ;
    public final C467680IVq LJIIJ;
    public final C467660IVo LJIIJJI;
    public final BPEAHandler LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final long LJIILLIIL;
    public final String LJIIZILJ;
    public final EnterRoomConfig LJIJ;
    public boolean LJJ;
    public boolean LJJI;
    public String LJJJJI;
    public final String LJJJJIZL;
    public final String LJJJJJ;
    public long LJJJJJL;
    public String LJJJJL;
    public String LJJJJLI;
    public DataChannel LJJJJLL;
    public String LJJJLL;
    public String LJJJLZIJ;
    public long LJJJZ;
    public final boolean LJJLI;
    public long LJJLIIIIJ;
    public long LJJLIIIJ;
    public long LJJLIIIJILLIZJL;
    public long LJJLIIIJJI;
    public long LJJLIIIJJIZ;
    public long LJJLIIIJL;
    public long LJJLIIIJLJLI;
    public long LJJLIIIJLLLLLLLZ;
    public long LJJLIIJ;
    public long LJJLIL;
    public long LJJLJ;
    public C467670IVp LJJLJLI;
    public final C0IFT LJJLL;
    public final C0IFU LJJZ;
    public boolean LJJZZI;
    public volatile boolean LIZIZ = true;
    public final ARunnableS107S0100000_7 LJ = new ARunnableS107S0100000_7(this, 193);
    public long LJIIIIZZ = -1;
    public final ARunnableS107S0100000_7 LJIIL = new ARunnableS107S0100000_7(this, 190);
    public long LJIJI = 0;
    public volatile boolean LJIJJ = false;
    public boolean LJIJJLI = false;
    public boolean LJIL = false;
    public long LJJIFFI = -1;
    public long LJJII = -1;
    public long LJJIII = -1;
    public long LJJIIJ = -1;
    public long LJJIIJZLJL = 0;
    public long LJJIIZ = -1;
    public long LJJIIZI = -1;
    public long LJJIJ = -1;
    public boolean LJJIJIIJI = false;
    public long LJJIJIIJIL = -1;
    public long LJJIJIL = -1;
    public long LJJIJL = 0;
    public long LJJIJLIJ = 0;
    public long LJJIL = 0;
    public boolean LJJIZ = false;
    public long LJJJ = -1;
    public long LJJJI = 0;
    public long LJJJIL = 0;
    public String LJJJJ = "click";
    public long LJJJJZ = -1;
    public boolean LJJJJZI = false;
    public boolean LJJJLIIL = false;
    public final ArrayList<C0IJA> LJJL = new ArrayList<>();

    public static String LJIIIIZZ() {
        return ((Long) DataChannelGlobal.LLILZ.gg0(C951600as2.class)).longValue() == EnumC1118970fDz.RANK_SWITCH_STATUS_OFF.getValue() ? "close" : "open";
    }

    public static void LJIIZILJ() {
        if (C1161920gLG.LIZJ(IWalletService.class) == null || ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange() == null) {
            return;
        }
        ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJI();
    }

    public static void LJJI() {
        HashMap map = new HashMap();
        map.put("backstage_type", InterfaceC1106030et7.c5.LIZIZ().booleanValue() ? "mini_window" : InterfaceC1106030et7.e5.LIZIZ().booleanValue() ? "voice_only" : "none");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pip_exchange_status");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL() {
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).MY(this.LJIJI);
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fp0(this.LJIJI);
        this.LJJLIIIIJ = 0L;
        this.LJJLIIIJ = 0L;
        this.LJJLIIIJILLIZJL = 0L;
        this.LJJLIIIJJI = 0L;
        this.LJJLIIIJJIZ = 0L;
        this.LJJLIIIJL = 0L;
        this.LJJLIIIJLJLI = 0L;
        this.LJJLIIIJLLLLLLLZ = 0L;
        this.LJJLIIJ = 0L;
        this.LJJLIL = 0L;
    }

    public final long LJII() {
        DataChannel dataChannel = this.LJJJJLL;
        LiveVariantCardDisplayCalibrationSetting liveVariantCardDisplayCalibrationSetting = LiveVariantCardDisplayCalibrationSetting.INSTANCE;
        long jElapsedRealtime = 0;
        if (!liveVariantCardDisplayCalibrationSetting.enable() || dataChannel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPromoteCardDisplayTime: skip, calibrationEnabled=");
            sbLIZ.append(liveVariantCardDisplayCalibrationSetting.enable());
            sbLIZ.append(" dataChannel=");
            sbLIZ.append(dataChannel != null);
            C20441214yg.LIZIZ("LiveRoomLogger", C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
        Long l = (Long) dataChannel.gg0(PromoteCardDisplayTimeChannel.class);
        long jLongValue = (l == null || l.longValue() <= 0) ? 0L : l.longValue() + 0;
        Long l2 = (Long) dataChannel.gg0(PromoteCardShowingStartTimeChannel.class);
        if (l2 != null && l2.longValue() > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l2.longValue();
            jLongValue += jElapsedRealtime;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getPromoteCardDisplayTime: accumulatedTime=");
        sbLIZ2.append(l);
        sbLIZ2.append(" showingStartTime=");
        sbLIZ2.append(l2);
        sbLIZ2.append(" currentShowingDuration=");
        sbLIZ2.append(jElapsedRealtime);
        sbLIZ2.append(" totalDisplayTime=");
        sbLIZ2.append(jLongValue);
        C20441214yg.LIZIZ("LiveRoomLogger", C2188811AlT.LIZIZ(sbLIZ2));
        return jLongValue;
    }

    public final void LJIJ() {
        C0IJA c0ija = null;
        C0IJA c0ija2 = null;
        C0IJA c0ija3 = null;
        for (C0IJA c0ija4 : this.LJJL) {
            int iOrdinal = c0ija4.LIZ.ordinal();
            if (iOrdinal == 1) {
                c0ija3 = c0ija4;
            } else if (iOrdinal == 2) {
                c0ija2 = null;
                c0ija = c0ija4;
            } else if (iOrdinal == 3) {
                c0ija3 = null;
                c0ija2 = c0ija4;
            }
        }
        if (c0ija == null || c0ija2 == null || c0ija3 == null) {
            return;
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_backstage_return_watch_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII(c0ija.LIZJ, "backstage_type");
        c474500IjALIZIZ.LJJII(Long.valueOf(c0ija3.LIZIZ - c0ija2.LIZIZ), "duration");
        c474500IjALIZIZ.LIZ();
    }

    public final void LJIJJ() {
        if (this.LJJIZ) {
            return;
        }
        this.LJJIZ = true;
        if (SlardarSampleSetting.INSTANCE.isReport("livesdk_live_stream_load_success", 0.0d)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_stream_load_success");
            c474500IjALIZ.LJIIJJI("live_view");
            c474500IjALIZ.LJIILL("core");
            c474500IjALIZ.LJIILJJIL("live_detail");
            c474500IjALIZ.LJIILIIL("live");
            if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LJJII(), "video_id");
                c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                c474500IjALIZ.LJJIJL();
                return;
            }
            C497860Jfk c497860JfkLJIIJJI = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LJIIJJI();
            InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
            if (interfaceC474510IjB != null) {
                interfaceC474510IjB.LJIILJJIL(c497860JfkLJIIJJI);
            }
            c474500IjALIZ.LJIJJLI(this.LJJJJLL);
            c474500IjALIZ.LIZ();
        }
    }

    public final long LJFF() {
        return (SystemClock.elapsedRealtime() - this.LJJIFFI) - this.LJJJI;
    }

    public final void LJJIJ() {
        LIZLLL();
        this.LJJJJL = null;
        this.LJIJ.mLogData.loadDuration = 0L;
        this.LJIJJ = false;
        this.LJIJJLI = false;
        this.LJJ = false;
        this.LJJI = false;
        this.LJJIFFI = -1L;
        this.LJJII = -1L;
        this.LJJIII = -1L;
        this.LJJLJ = -1L;
        this.LJJIIJ = -1L;
        this.LJJIIZI = -1L;
        this.LJJIJ = -1L;
        this.LJJIIZ = -1L;
        this.LJJIJIIJIL = -1L;
        this.LJJIJIL = -1L;
        this.LJJIJIIJI = false;
        this.LJJIJL = 0L;
        this.LJJIJLIJ = 0L;
        this.LJJIL = 0L;
        this.LJJIZ = false;
        this.LJJJ = -1L;
        this.LJJJI = 0L;
        this.LJJJIL = 0L;
        this.LJJIIJZLJL = 0L;
        this.LJJJJ = null;
        this.LJJJJI = null;
        this.LJJJLIIL = false;
        this.LJJJJZI = false;
        this.LJIL = false;
        this.LJJJJLL = null;
        C467680IVq c467680IVq = this.LJIIJ;
        if (c467680IVq != null) {
            c467680IVq.LIZ = null;
        }
        this.LIZJ = false;
        this.LIZLLL = false;
        BPEAHandler bPEAHandler = this.LJIILIIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LJJL.clear();
    }

    public static String LJ(Room room) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        String str;
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (str = multiLiveUserApplySettings.aiSummary) != null) {
            return str;
        }
        return "";
    }

    public static int LJI(Room room) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        MultiGuestLinkmicInfo multiGuestLinkmicInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo2;
        MultiGuestLinkmicInfo multiGuestLinkmicInfo2;
        CoHost coHost;
        Map<Long, LinkmicGuestUser> map;
        if (LiveSdkGuestCountForEnterRoomOptSetting.isEnable()) {
            if (room != null) {
                MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
                if (multiLiveUserSettings != null && (coHost = multiLiveUserSettings.coHost) != null && (map = coHost.linkedGuestUsers) != null && !map.isEmpty()) {
                    return room.multiLiveUserSettings.getCoHostGuestCountInCurrentRoom(room.getId());
                }
                if (room.getLinkMicInfo() != null && room.getLinkMicInfo().audienceIdList != null) {
                    return room.getLinkMicInfo().audienceIdList.size();
                }
                MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
                if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (roomMultiGuestLinkmicInfo2 = multiLiveUserApplySettings2.roomMultiGuestLinkmicInfo) != null && (multiGuestLinkmicInfo2 = roomMultiGuestLinkmicInfo2.multiGuestLinkmicInfo) != null) {
                    return multiGuestLinkmicInfo2.linkedUsers.size() - 1;
                }
            }
            return 0;
        }
        if (room != null) {
            if (room.getLinkMicInfo() != null && room.getLinkMicInfo().audienceIdList != null) {
                return room.getLinkMicInfo().audienceIdList.size();
            }
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 != null && (multiLiveUserApplySettings = multiLiveUserSettings3.multiLiveUserApplySettings) != null && (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) != null && (multiGuestLinkmicInfo = roomMultiGuestLinkmicInfo.multiGuestLinkmicInfo) != null) {
                return multiGuestLinkmicInfo.linkedUsers.size() - 1;
            }
        }
        return 0;
    }

    public static Map LJIIIZ(DataChannel dataChannel) {
        HashMap map = new HashMap();
        w.LIZ.getClass();
        map.put("video_id", w.LJJII());
        if (dataChannel != null) {
            String str = CardStruct.IStatusCode.DEFAULT;
            map.put("is_live_recall", CardStruct.IStatusCode.DEFAULT);
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                if (room.hasCommerceGoods) {
                    str = "1";
                }
                map.put("is_sale", str);
                map.put("orientation", String.valueOf(room.getOrientation()));
            }
        }
        return map;
    }

    public static void LJIIL(C467650IVn c467650IVn) {
        BPEAHandler bPEAHandler;
        C1C7U.LIZ("LiveRoomLogger@d0bd.logRoomForeground$1L");
        if (!c467650IVn.LJIJJ) {
            long jMax = Math.max(0L, c467650IVn.LJFF() - c467650IVn.LJII());
            if (jMax / 1000 >= 10 && !c467650IVn.LIZJ) {
                c467650IVn.LJJIIJZLJL("livesdk_watch_tensec");
                c467650IVn.LIZJ = true;
            } else if (jMax < 10000 && (bPEAHandler = c467650IVn.LJIILIIL) != null) {
                C786410Ut5.LJLIIL(10000 - jMax, bPEAHandler, new ARunnableS107S0100000_7(c467650IVn, 191));
            }
        }
        C1C7U.LIZIZ("LiveRoomLogger@d0bd.logRoomForeground$1L");
    }

    public static void LJIILIIL(C467650IVn c467650IVn) {
        BPEAHandler bPEAHandler;
        C1C7U.LIZ("LiveRoomLogger@d0bd.logRoomForeground$2L");
        if (!c467650IVn.LJIJJ) {
            long jMax = Math.max(0L, c467650IVn.LJFF() - c467650IVn.LJII());
            if (jMax / 1000 >= 30 && !c467650IVn.LIZLLL) {
                c467650IVn.LJJIIJZLJL("livesdk_watch_thirtysec");
                c467650IVn.LIZLLL = true;
            } else if (jMax < 30000 && (bPEAHandler = c467650IVn.LJIILIIL) != null) {
                C786410Ut5.LJLIIL(30000 - jMax, bPEAHandler, new ARunnableS107S0100000_7(c467650IVn, 192));
            }
        }
        C1C7U.LIZIZ("LiveRoomLogger@d0bd.logRoomForeground$2L");
    }

    public final void LIZJ(Map<String, String> map) {
        EnterRoomConfig.GuestUser guestUser;
        Map<String, String> map2;
        EnterRoomConfig.RoomsData roomsData = this.LJIJ.mRoomsData;
        if (roomsData != null && (map2 = roomsData.mgDistributionInfo) != null && !map2.isEmpty()) {
            ((HashMap) map).putAll(map2);
        }
        HashMap map3 = (HashMap) map;
        if (!map3.containsKey("mg_distribution_type") || !map3.containsKey("distribution_user_list")) {
            EnterRoomConfig.RoomsData roomsData2 = this.LJIJ.mRoomsData;
            if (roomsData2 != null && (guestUser = roomsData2.guestUser) != null) {
                long j = guestUser.uid;
                if (j > 0 && j != this.LJJJJJL) {
                    map3.put("mg_distribution_type", "guest");
                    map3.put("distribution_user_list", String.valueOf(guestUser.uid));
                    return;
                }
            }
            map3.put("mg_distribution_type", "anchor");
            map3.put("distribution_user_list", String.valueOf(this.LJJJJJL));
        }
    }

    public final void LJIIJJI(Room room) {
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        AudienceLivePlayTaskManager audienceLivePlayTaskManagerLIZIZ = AudienceLivePlayTaskManager.LIZIZ();
        audienceLivePlayTaskManagerLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopRoomDuration duration: ");
        sbLIZ.append(audienceLivePlayTaskManagerLIZIZ.LIZ());
        C20441214yg.LJIIIZ("AudienceLivePlayTaskManager", C2188811AlT.LIZIZ(sbLIZ));
        audienceLivePlayTaskManagerLIZIZ.LIZIZ = false;
        audienceLivePlayTaskManagerLIZIZ.LIZLLL = 0L;
        audienceLivePlayTaskManagerLIZIZ.LIZJ = -1L;
        ((HashMap) audienceLivePlayTaskManagerLIZIZ.LJ).clear();
        ((CopyOnWriteArrayList) audienceLivePlayTaskManagerLIZIZ.LIZ).clear();
        audienceLivePlayTaskManagerLIZIZ.LJFF.removeCallbacksAndMessages(null);
        C1878360yyo.LIZJ(room, this.LJJJJLL);
        C467670IVp c467670IVp = this.LJJLJLI;
        if (c467670IVp == null) {
            c467670IVp = new C467670IVp(this.LJIJ);
            this.LJJLJLI = c467670IVp;
        }
        c467670IVp.LIZIZ.removeCallbacks(c467670IVp.LIZJ);
        c467670IVp.LJ = false;
    }

    public final void LJIJI(HashMap<String, String> map) {
        EnterRoomConfig.RoomsData roomsData;
        boolean z;
        EnterRoomConfig enterRoomConfig = this.LJIJ;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            String str = roomsData.tabType;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            EnterRoomConfig.RoomsData roomsData2 = this.LJIJ.mRoomsData;
            String str2 = roomsData2.unreadExtra;
            String str3 = roomsData2.fromDrawerTab;
            String str4 = roomsData2.explorePosition;
            int i = roomsData2.roomPosition;
            if (LiveDrawerFollowSetting.INSTANCE.isFollowExp()) {
                if (str2 != null && a0.LJJIIZI(str2, "tiktok_message", false)) {
                    z = true;
                } else {
                    z = false;
                }
                String str5 = "foru";
                String str6 = "following";
                if (!z) {
                    if (Intrinsics.LJFF("following", str)) {
                        str6 = "foru";
                    } else {
                        str6 = str;
                    }
                }
                if ((!Intrinsics.LJFF("game", str) || str2 == null || !a0.LJJIIZI(str2, "vertical_game_no_more", false)) && ((!Intrinsics.LJFF("outdoor", str) && !Intrinsics.LJFF("fashion", str) && !Intrinsics.LJFF("mix_talent", str)) || str2 == null || !a0.LJJIIZI(str2, "vertical_base_no_more", false))) {
                    str5 = str6;
                }
                if (!TextUtils.isEmpty(str)) {
                    map.put("tab_type", str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    map.put("from_drawer_tab", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    map.put("explore_position", str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    map.put("drawer_live_type", str5);
                }
                if (i >= 0) {
                    map.put("room_position", String.valueOf(i));
                }
            }
        }
    }

    public final void LJIJJLI(boolean z) {
        long jElapsedRealtime;
        if (this.LJJI) {
            return;
        }
        if (SlardarSampleSetting.INSTANCE.isReport("livesdk_live_game_watch_duration", 0.0d)) {
            HashMap map = new HashMap();
            if (z) {
                jElapsedRealtime = 0;
            } else {
                jElapsedRealtime = (SystemClock.elapsedRealtime() - this.LJJIL) - this.LJJJI;
                if (jElapsedRealtime < 0) {
                    jElapsedRealtime = 0;
                }
            }
            map.put("watch_duration", String.valueOf(jElapsedRealtime));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_game_watch_duration");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIJJLI(this.LJJJJLL);
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJIJIIJI(Long.valueOf(this.LJIJI));
            c474500IjALIZ.LJI(Long.valueOf(this.LJJJJJL));
            c474500IjALIZ.LJ(this.LJJJJ);
            c474500IjALIZ.LIZ();
        }
        this.LJJIL = 0L;
        this.LJJI = true;
    }

    public final void LJIL(Map<String, String> map) {
        Map<String, String> map2 = this.LJIJ.mRoomsData.gameLiveExtra;
        if (map2 != null) {
            try {
                ((HashMap) map).putAll(map2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LiveRoomLog", "hashMap concurrentModificationException");
            }
            if (this.LJIJ.mRoomsData.gameLiveExtra.get("tag_name") != null) {
                ((HashMap) map).put("live_game_name", this.LJIJ.mRoomsData.gameLiveExtra.get("tag_name"));
            }
        }
        Map<String, String> map3 = this.LJIJ.mRoomsData.gamePartnershipExtra;
        if (map3 != null) {
            try {
                ((HashMap) map).putAll(map3);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJ("LiveRoomLog", "hashMap concurrentModificationException");
            }
        }
    }

    public final void LJJIIJ(boolean z) {
        if (this.LJJIIJ <= -1) {
            if (z) {
                this.LJJIIJ = this.LJJIFFI;
                this.LJJIIZ = this.LJJIII;
                return;
            }
            this.LJJIIJ = SystemClock.elapsedRealtime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LJJIIZ >= jCurrentTimeMillis) {
                return;
            }
            this.LJJIIZ = jCurrentTimeMillis;
        }
    }

    public final void LJJIIJZLJL(String str) {
        String str2;
        EnterRoomConfig.ECWrapData eCWrapData;
        HashMap<String, String> map;
        HashMap map2 = new HashMap();
        map2.put("growth_deepevent", String.valueOf(1));
        map2.put("request_page", C466640IRq.LIZJ().LIZLLL());
        if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
            map2.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
        }
        String str3 = this.LJIJ.mLogData.gdLabel;
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (!zIsEmpty && "click_push_live_cd_user".equals(str3)) {
            map2.put("is_subscribe", "1");
        } else {
            map2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C497740JfY.LJIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        map2.put("room_orientation", str2);
        if (this.LJIJ.mRoomsData.isBackPreRoom) {
            str4 = "1";
        }
        map2.put("is_return", str4);
        EnterRoomConfig enterRoomConfig = this.LJIJ;
        if (enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null && (map = eCWrapData.ecCommonExtraParam) != null) {
            map2.putAll(map);
        }
        long j = this.LJIJ.mLogData.cardRoomId;
        if (j > 0) {
            map2.put("card_room_id", String.valueOf(j));
        }
        EnterRoomConfig enterRoomConfig2 = this.LJIJ;
        if (enterRoomConfig2.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig2.mRoomsData.actionType)) {
            map2.put("from_room_id", String.valueOf(this.LJIJ.mLogData.fromRoomId));
        }
        if (Boolean.TRUE.equals(DataChannelGlobal.LLILZ.gg0(C931100aKy.class))) {
            map2.put("is_end_live_from_card", "1");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        map2.putAll(C467820IWe.LIZ(true));
        if (!"-1".equals(this.LJIJ.mLogData.drawAction) || "draw".equals(this.LJIJ.mRoomsData.actionType)) {
            map2.put("draw_action", this.LJIJ.mLogData.drawAction);
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        Map mapLIZ = C475750IlB.LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map2);
        Map mapJA = null;
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, this.LJJJJLL, "user_live_duration"));
        c474500IjALIZ.LJIIJJI("live_view");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJ(this.LJJJJ);
        c474500IjALIZ.LJIL();
        if (iFansClubService != null) {
            mapJA = iFansClubService.JA(null, this.LJJJJLL, true);
        }
        c474500IjALIZ.LJJIIZI(mapJA);
        if ("watch_onemin".equals(str)) {
            c474500IjALIZ.LJJIIZI(mapLIZ);
            c474500IjALIZ.LJJIZ(this.LJJJJLL);
        }
        if (("livesdk_watch_thirtysec".equals(str) || "livesdk_watch_tensec".equals(str)) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
            return;
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.util.List<java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public final void LJJIIZ(C945320ahu c945320ahu) {
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        SeiAppData seiAppData2;
        int type;
        LiveSeiStruct liveSeiStruct2;
        SeiAppData seiAppData3;
        String str;
        long jLongValue;
        int size;
        LiveSeiStruct liveSeiStruct3;
        SeiAppData seiAppData4;
        List<SeiRegion> list;
        ?? arrayList;
        LiveSeiStruct liveSeiStruct4;
        SeiAppData seiAppData5;
        List<SeiRegion> list2;
        long jLongValue2;
        Long lLJIILIIL;
        LiveSeiStruct liveSeiStruct5;
        SeiAppData seiAppData6;
        LiveSeiStruct liveSeiStruct6;
        SeiAppData seiAppData7;
        LiveSeiStruct liveSeiStruct7;
        SeiAppData seiAppData8;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        LiveSeiStruct liveSeiStruct8;
        SeiAppData seiAppData9;
        SeiDsl seiDsl;
        String str2;
        Boolean boolValueOf3;
        LiveSeiStruct liveSeiStruct9;
        SeiAppData seiAppData10;
        int size2;
        String str3;
        LiveSeiStruct liveSeiStruct10;
        VoiceChatSeiAppData voiceChatSeiAppData;
        String str4;
        LiveSeiStruct liveSeiStruct11;
        VoiceChatSeiAppData voiceChatSeiAppData2;
        SeiDsl seiDsl2;
        String str5;
        LiveSeiStruct liveSeiStruct12;
        SeiAppData seiAppData11;
        int size3;
        String str6;
        C467680IVq c467680IVq = this.LJIIJ;
        Integer numValueOf = null;
        if (c467680IVq != null && !c467680IVq.LJ) {
            if (MultiGuestV3VideoSeiEndSetting.INSTANCE.enableVideoSeiEndLayout() && C969340bKe.LJI(c945320ahu)) {
                c467680IVq.LIZ(0, null);
            } else {
                if (c945320ahu != null) {
                    boolValueOf = Boolean.valueOf(c945320ahu.LIZ());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    if (LinkMicEnableWatchCohostReport.INSTANCE.enable()) {
                        if (c945320ahu != null && (liveSeiStruct12 = c945320ahu.LIZ) != null && (seiAppData11 = liveSeiStruct12.LIZ) != null) {
                            List<SeiRegion> list3 = seiAppData11.grids;
                            if (list3 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (SeiRegion seiRegion : list3) {
                                    SeiRegion seiRegion2 = seiRegion;
                                    if (C467680IVq.LIZIZ(seiRegion2) && Intrinsics.LJFF(seiRegion2.cid, seiAppData11.channelId)) {
                                        arrayList2.add(seiRegion);
                                    }
                                }
                                size3 = arrayList2.size();
                            } else {
                                size3 = 0;
                            }
                            int i = size3 - 1;
                            SeiDsl seiDsl3 = seiAppData11.dsl;
                            if (seiDsl3 != null) {
                                str6 = seiDsl3.layoutId;
                            } else {
                                str6 = null;
                            }
                            c467680IVq.LIZ(i, str6);
                        }
                    } else {
                        c467680IVq.LIZ(0, null);
                    }
                } else {
                    Room roomLIZ = C162100jj.LIZ(c467680IVq.LIZ);
                    if (roomLIZ != null) {
                        boolValueOf2 = Boolean.valueOf(C781520UlC.LJFF(roomLIZ));
                    } else {
                        boolValueOf2 = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf2)) {
                        if (c945320ahu != null && (liveSeiStruct11 = c945320ahu.LIZ) != null && (voiceChatSeiAppData2 = liveSeiStruct11.LIZIZ) != null && (seiDsl2 = voiceChatSeiAppData2.dsl) != null && (str5 = seiDsl2.layoutId) != null) {
                            c467680IVq.LJFF = str5;
                        }
                    } else if (c945320ahu != null && (liveSeiStruct8 = c945320ahu.LIZ) != null && (seiAppData9 = liveSeiStruct8.LIZ) != null && (seiDsl = seiAppData9.dsl) != null && (str2 = seiDsl.layoutId) != null) {
                        c467680IVq.LJFF = str2;
                    }
                    Room roomLIZ2 = C162100jj.LIZ(c467680IVq.LIZ);
                    if (roomLIZ2 != null) {
                        boolValueOf3 = Boolean.valueOf(C781520UlC.LJFF(roomLIZ2));
                    } else {
                        boolValueOf3 = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf3)) {
                        if (c945320ahu != null && (liveSeiStruct10 = c945320ahu.LIZ) != null && (voiceChatSeiAppData = liveSeiStruct10.LIZIZ) != null) {
                            List<VoiceChatSeiRegion> list4 = voiceChatSeiAppData.grids;
                            ArrayList arrayList3 = new ArrayList();
                            for (VoiceChatSeiRegion voiceChatSeiRegion : list4) {
                                if (voiceChatSeiRegion.linkMicId != null) {
                                    arrayList3.add(voiceChatSeiRegion);
                                }
                            }
                            int size4 = arrayList3.size() - 1;
                            SeiDsl seiDsl4 = voiceChatSeiAppData.dsl;
                            if (seiDsl4 != null) {
                                str4 = seiDsl4.layoutId;
                            } else {
                                str4 = null;
                            }
                            c467680IVq.LIZ(size4, str4);
                            if (!LiveSdkGuestViewStartOptSetting.isEnable()) {
                                c467680IVq.LIZJ = true;
                            }
                        }
                    } else if (c945320ahu != null && (liveSeiStruct9 = c945320ahu.LIZ) != null && (seiAppData10 = liveSeiStruct9.LIZ) != null) {
                        List<SeiRegion> list5 = seiAppData10.grids;
                        if (list5 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (SeiRegion seiRegion3 : list5) {
                                if (C467680IVq.LIZIZ(seiRegion3)) {
                                    arrayList4.add(seiRegion3);
                                }
                            }
                            size2 = arrayList4.size();
                        } else {
                            size2 = 0;
                        }
                        int i2 = size2 - 1;
                        SeiDsl seiDsl5 = seiAppData10.dsl;
                        if (seiDsl5 != null) {
                            str3 = seiDsl5.layoutId;
                        } else {
                            str3 = null;
                        }
                        c467680IVq.LIZ(i2, str3);
                        if (!LiveSdkGuestViewStartOptSetting.isEnable()) {
                            c467680IVq.LIZJ = true;
                        }
                    }
                }
            }
        }
        C467660IVo c467660IVo = this.LJIIJJI;
        if (c467660IVo != null) {
            DataChannel dataChannel = this.LJJJJLL;
            if (CoHostAudienceWatchEventReportMigrate.INSTANCE.isEnable() && c467660IVo.LIZ != null) {
                if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null && liveSeiStruct.LIZ != null) {
                    C19487111Lx c19487111Lx = c467660IVo.LJ;
                    if (c19487111Lx != null) {
                        c19487111Lx.dispose();
                    }
                    c467660IVo.LJ = null;
                    LiveSeiStruct liveSeiStruct13 = c945320ahu.LIZ;
                    if (liveSeiStruct13 != null && (seiAppData2 = liveSeiStruct13.LIZ) != null && seiAppData2.version == 2) {
                        SeiAppData seiAppData12 = liveSeiStruct13.LIZ;
                        if (seiAppData12 != null) {
                            type = seiAppData12.linkerArchType;
                        } else {
                            type = EnumC467700IVs.UNKNOWN.getType();
                        }
                        EnumC467700IVs enumC467700IVs = EnumC467700IVs.CROSS_ROOM_ARCH;
                        if (type != enumC467700IVs.getType()) {
                            enumC467700IVs = EnumC467700IVs.MULTI_ARCH;
                            if (type != enumC467700IVs.getType()) {
                                enumC467700IVs = EnumC467700IVs.OLD_ARCH;
                                if (type != enumC467700IVs.getType()) {
                                    enumC467700IVs = EnumC467700IVs.UNKNOWN;
                                }
                            }
                        }
                        int i3 = C467690IVr.LIZ[enumC467700IVs.ordinal()];
                        if (i3 == 1 ? (liveSeiStruct2 = c945320ahu.LIZ) == null || (seiAppData3 = liveSeiStruct2.LIZ) == null || (str = seiAppData3.groupChannelId) == null : i3 == 2 ? (liveSeiStruct5 = c945320ahu.LIZ) == null || (seiAppData6 = liveSeiStruct5.LIZ) == null || (str = seiAppData6.channelId) == null : i3 == 3 ? (liveSeiStruct6 = c945320ahu.LIZ) == null || (seiAppData7 = liveSeiStruct6.LIZ) == null || (str = seiAppData7.channelId) == null : (liveSeiStruct7 = c945320ahu.LIZ) == null || (seiAppData8 = liveSeiStruct7.LIZ) == null || (str = seiAppData8.channelId) == null) {
                            str = "";
                        }
                        if (str.length() != 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str);
                            if (lLJIILIIL2 != null) {
                                jLongValue = lLJIILIIL2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (jLongValue <= 0) {
                                if (c467660IVo.LIZLLL) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onSei_channelId_is_");
                                    sbLIZ.append(jLongValue);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c467660IVo.LIZ();
                                    return;
                                }
                                return;
                            }
                            if (c945320ahu.LIZ() && (liveSeiStruct3 = c945320ahu.LIZ) != null && (seiAppData4 = liveSeiStruct3.LIZ) != null && (list = seiAppData4.grids) != null) {
                                size = list.size();
                                if (size > 1) {
                                    c467660IVo.LIZIZ = jLongValue;
                                    if (c945320ahu.LIZ() && (liveSeiStruct4 = c945320ahu.LIZ) != null && (seiAppData5 = liveSeiStruct4.LIZ) != null && (list2 = seiAppData5.grids) != null) {
                                        arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                        for (SeiRegion seiRegion4 : list2) {
                                            if (!a0.LJJIIZI(seiRegion4.uidStr, "_", false) && (lLJIILIIL = C2095008Iq.LJIILIIL(seiRegion4.uidStr)) != null) {
                                                jLongValue2 = lLJIILIIL.longValue();
                                            } else {
                                                jLongValue2 = 0;
                                            }
                                            arrayList.add(Long.valueOf(jLongValue2));
                                        }
                                    } else {
                                        arrayList = C13BV.INSTANCE;
                                    }
                                    if (c467660IVo.LIZJ.isEmpty() || ((Number) ListProtector.get(arrayList, 0)).longValue() > 0) {
                                        c467660IVo.LIZJ = arrayList;
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onSei_channelId_is_");
                                    sbLIZ2.append(c467660IVo.LIZIZ);
                                    sbLIZ2.append("_tempLinkedUidListSize_is_");
                                    sbLIZ2.append(arrayList.size());
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    c467660IVo.LIZIZ(dataChannel);
                                    return;
                                }
                            } else {
                                size = 0;
                            }
                            if (!c467660IVo.LIZLLL) {
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onSei_linkedUserSize_is_");
                            sbLIZ3.append(size);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            c467660IVo.LIZ();
                            return;
                        }
                        if (!c467660IVo.LIZLLL) {
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("onSei_channelIdStr_is_");
                        sbLIZ4.append(str);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        c467660IVo.LIZ();
                        return;
                    }
                    if (!c467660IVo.LIZLLL) {
                        return;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("onSei_version_is_");
                    LiveSeiStruct liveSeiStruct14 = c945320ahu.LIZ;
                    if (liveSeiStruct14 != null && (seiAppData = liveSeiStruct14.LIZ) != null) {
                        numValueOf = Integer.valueOf(seiAppData.version);
                    }
                    sbLIZ5.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    c467660IVo.LIZ();
                    return;
                }
                if (!c467660IVo.LIZLLL) {
                    return;
                }
                MultiGuestV3VideoSeiEndSetting multiGuestV3VideoSeiEndSetting = MultiGuestV3VideoSeiEndSetting.INSTANCE;
                if (multiGuestV3VideoSeiEndSetting.enableVideoSeiEndLayout() && C969340bKe.LJI(c945320ahu)) {
                    c467660IVo.LIZ();
                    return;
                }
                C19487111Lx c19487111Lx2 = c467660IVo.LJ;
                if ((c19487111Lx2 != null && !c19487111Lx2.isDisposed()) || !multiGuestV3VideoSeiEndSetting.enableNoParseSeiEndLayout()) {
                    return;
                }
                c467660IVo.LJ = (C19487111Lx) new C11IW(C11NZ.LJLJJLL(LinkMicSeiFormatErrIntervalSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).LJJIIJZLJL(new C521850KdL(c467660IVo, 7))).LJIILL().LJIIZILJ();
            }
        }
    }

    public final void LJJIJIIJIL(String str) {
        C468020IWy c468020IWy;
        C467990IWv c467990IWv;
        long jElapsedRealtime = this.LJJJI;
        if (this.LJIJJ && this.LJJJ > 0) {
            jElapsedRealtime += SystemClock.elapsedRealtime() - this.LJJJ;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LJJLJ;
        long j2 = (jCurrentTimeMillis - j) - jElapsedRealtime;
        if (j == 0) {
            j2 = 0;
        }
        long j3 = this.LJJIII;
        if (j3 <= 0) {
            j3 = this.LJJII;
        }
        long j4 = (jCurrentTimeMillis - j3) - jElapsedRealtime;
        long j5 = this.LJIJI;
        if (str != null && (c468020IWy = C0IX5.LIZJ.get(str)) != null && (c467990IWv = c468020IWy.LIZ) != null && c467990IWv.LIZ == j5) {
            C467990IWv c467990IWv2 = c468020IWy.LIZ;
            c467990IWv2.LJIILJJIL = j2;
            c467990IWv2.LJI = j4;
            c467990IWv2.LJIILL = jElapsedRealtime;
        }
    }

    public final void LJIIJ(Room room, String str) {
        String str2;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
        Object objPrevious;
        Map<? extends String, ? extends String> mapLIZ;
        String str9;
        String str10;
        String str11;
        String str12;
        int i2;
        long j;
        Map mapJA;
        int i3;
        C0IR5 c0ir5;
        Map<String, String> map;
        Object objValueOf;
        C467990IWv c467990IWv;
        C467990IWv c467990IWv2;
        int iLJI;
        String str13;
        Map<? extends String, ? extends String> map2;
        Map<? extends String, ? extends String> map3;
        String str14;
        String str15;
        int i4;
        EnterRoomConfig.ECWrapData eCWrapData;
        Map<? extends String, ? extends String> map4;
        LJIIJJI(room);
        boolean zLJI = MethodIDManager.LJI(138009);
        if (AppLogFlushOptSetting.INSTANCE.isReportOpt()) {
            if (this.LJIIIIZZ == -1 || this.LJIIIZ || room == null || this.LJIJ == null) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        } else if (this.LJJIFFI == -1 || this.LJJ || room == null || this.LJIJ == null) {
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
            return;
        }
        if (this.LJIJJ && this.LJJJ > 0) {
            this.LJJJI += SystemClock.elapsedRealtime() - this.LJJJ;
            this.LJIJJ = false;
            this.LJJJ = -1L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJJIFFI;
        long j2 = this.LJJJI;
        long jLongValue = jElapsedRealtime - j2;
        long j3 = this.LJJLJ;
        long j4 = (jCurrentTimeMillis - j3) - j2;
        long j5 = this.LJJIII;
        if (j5 <= 0) {
            j5 = this.LJJII;
        }
        long j6 = (jCurrentTimeMillis - j5) - j2;
        long jMax = (jCurrentTimeMillis - Math.max(j5, j3)) - this.LJJJI;
        if (LiveVariantCardDisplayCalibrationSetting.INSTANCE.enable() && this.LJJJJLL != null) {
            Long lValueOf = Long.valueOf(LJII());
            if (lValueOf.longValue() > 0) {
                jMax = Math.max(0L, jMax - lValueOf.longValue());
            }
        }
        if (C470480Icg.LIZ()) {
            Long lValueOf2 = 0L;
            Iterator it2 = ((ArrayList) LivePlayFragment.w2).iterator();
            while (it2.hasNext()) {
                lValueOf2 = Long.valueOf(lValueOf2.longValue() + ((Long) it2.next()).longValue());
            }
            jMax += lValueOf2.longValue();
            jLongValue += lValueOf2.longValue();
        }
        HashMap<String, String> map5 = new HashMap<>();
        long j7 = this.LJIJ.mLogData.fromPortalId;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
            map5.put("connection_type", "manual_pk");
            map5.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
        }
        map5.put("request_page", C466640IRq.LIZJ().LIZLLL());
        if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
            map5.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
        }
        String str16 = this.LJIJ.mLogData.gdLabel;
        map5.put("gd_label", str16);
        map5.put("action_type", this.LJIJ.mRoomsData.actionType);
        if (!TextUtils.isEmpty(str16) && "click_push_live_cd_user".equals(str16)) {
            map5.put("is_subscribe", "1");
        } else {
            map5.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        long jRd2 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Rd2(this.LJIJI);
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Zi0(this.LJIJI);
        if (this.LJIJ.mRoomsData.isBackPreRoom) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_return", str2);
        if (this.LJIJ.mRoomsData.isBackPreRoom) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_back_from", str3);
        if (!TextUtils.isEmpty(this.LJIJ.mLogData.liveReason)) {
            map5.put("live_reason", this.LJIJ.mLogData.liveReason);
        }
        if (room.getOwner() != null && room.getOwner().getAuthenticationInfo() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_anchor_official", str4);
        if (room.getSquareCoverImg() != null && !C0IKQ.LIZ(room.getSquareCoverImg().getUrls())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str5 = "screen_shot";
        } else {
            str5 = "user_upload";
        }
        map5.put("cover_type", str5);
        if (room.getStreamUrl() != null) {
            if (!TextUtils.isEmpty(room.getStreamUrl().streamLanguage)) {
                map5.put("is_translated_stream", "1");
            } else {
                map5.put("is_translated_stream", CardStruct.IStatusCode.DEFAULT);
            }
        }
        ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).WE0("", true, null).LJIIL().LIZ(room, "livesdk_live_duration", map5);
        C0IUA.LIZIZ(null, map5);
        C0IUA.LIZJ(map5);
        EnterRoomConfig enterRoomConfig = this.LJIJ;
        if (enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null && (map4 = eCWrapData.ecCommonExtraParam) != null) {
            map5.putAll(map4);
        }
        if (this.LJJLI) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_commerce_inner_flow", str6);
        long j8 = this.LJIJ.mLogData.cardRoomId;
        if (j8 > 0) {
            map5.put("card_room_id", String.valueOf(j8));
        }
        EnterRoomConfig enterRoomConfig2 = this.LJIJ;
        if (enterRoomConfig2.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig2.mRoomsData.actionType)) {
            map5.put("from_room_id", String.valueOf(this.LJIJ.mLogData.fromRoomId));
        }
        if (!"-1".equals(this.LJIJ.mLogData.drawAction) || "draw".equals(this.LJIJ.mRoomsData.actionType)) {
            map5.put("draw_action", this.LJIJ.mLogData.drawAction);
        }
        if (this.LJIJ.mRoomsData.isFromBubble > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIJ.mRoomsData.isFromBubble);
            sbLIZ.append("");
            map5.put("is_from_bubble", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJIJ.mRoomsData.isFromCache > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LJIJ.mRoomsData.isFromCache);
            sbLIZ2.append("");
            map5.put("is_from_cache", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (room.getBcToggleInfo() != null && (room.getBcToggleInfo().status == 1 || room.getBcToggleInfo().status == 2)) {
            i = 1;
        } else {
            i = 0;
        }
        map5.put("is_paid_partnership", String.valueOf(i));
        if (this.LJIJ.mLogData.isPreLiveAccessRecall) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_revoked_end", str7);
        map5.put("enter_from_merge", this.LJIJ.mRoomsData.enterFromMerge);
        map5.put("enter_method", this.LJIJ.mRoomsData.enterMethod);
        String str17 = this.LJIJ.mLogData.guestRequestId;
        if (str17 != null) {
            map5.put("guest_request_id", str17);
        }
        User owner = room.getOwner();
        if (owner != null) {
            if (!owner.isAnchorHasSubQualification()) {
                map5.put("is_subscription", "-1");
            } else if (owner.isSubscribed()) {
                map5.put("is_subscription", "1");
            } else {
                map5.put("is_subscription", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (room.getCommerceStruct() != null) {
            try {
                JSONObject jSONObject = new JSONObject(room.getCommerceStruct().getOecInitDataString());
                String strOptString = jSONObject.optString("pop_product_id");
                if (strOptString.isEmpty()) {
                    String strOptString2 = jSONObject.optString("pop_product");
                    if (!strOptString2.isEmpty()) {
                        strOptString = new JSONObject(strOptString2).optString("product_id");
                    }
                }
                if (!strOptString.isEmpty()) {
                    map5.put("current_product_id", strOptString);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int i5 = this.LJIJ.mRoomsData.anchorRelationType;
        if (i5 == 1 || i5 == 2) {
            map5.put("window_tag_type", CardStruct.IStatusCode.DEFAULT);
        }
        int i6 = this.LJIJ.mRoomsData.anchorRelationType;
        if (i6 == 1) {
            str8 = "subscription";
        } else if (i6 == 2) {
            str8 = "live_event";
        } else {
            str8 = "follow";
        }
        map5.put("window_tag", str8);
        DataChannel dataChannel = this.LJJJJLL;
        if (dataChannel != null) {
            C0IMR c0imr = (C0IMR) dataChannel.gg0(VideoOrientationChangeChannel.class);
            if (c0imr != null) {
                boolean zLIZ = c0imr.LIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("");
                sbLIZ3.append(zLIZ ? 1 : 0);
                map5.put("is_horizontal_room", C2188811AlT.LIZIZ(sbLIZ3));
            }
            Boolean bool = (Boolean) this.LJJJJLL.gg0(ChangeOrientationButtonShowData.class);
            if (bool != null && bool.booleanValue()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("");
            sbLIZ4.append(i4);
            map5.put("show_orientation_widget", C2188811AlT.LIZIZ(sbLIZ4));
        }
        List listLIZLLL = C467820IWe.LIZLLL();
        ListIterator listIterator = listLIZLLL.listIterator(listLIZLLL.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                objPrevious = listIterator.previous();
                if (!Intrinsics.LJFF(((C0IVX) objPrevious).LIZIZ, String.valueOf(room.getId()))) {
                    break;
                }
            } else {
                objPrevious = null;
                break;
            }
        }
        C0IVX c0ivx = (C0IVX) objPrevious;
        if (c0ivx == null) {
            mapLIZ = C2097608Jq.LJ();
        } else if (c0ivx.LIZ.length() == 0) {
            if (c0ivx.LIZIZ.length() > 0) {
                mapLIZ = C2097908Jt.LIZJ(new Pair("drawer_from_room_id", c0ivx.LIZIZ));
            } else {
                mapLIZ = C2097608Jq.LJ();
            }
        } else {
            mapLIZ = c0ivx.LIZ();
        }
        map5.putAll(mapLIZ);
        if (TextUtils.equals(this.LJIJ.mRoomsData.enterRoomScene, "inner_draw")) {
            str9 = "draw";
        } else {
            str9 = "click";
        }
        map5.put("user_action_type", str9);
        if (!TextUtils.isEmpty(this.LJIJ.mLogData.enterRoomViaPreviewGuide)) {
            map5.put("if_guidence", this.LJIJ.mLogData.enterRoomViaPreviewGuide);
        }
        if (!TextUtils.isEmpty(this.LJIJ.mLogData.liveSortBy)) {
            map5.put("sort_status", this.LJIJ.mLogData.liveSortBy);
            map5.put("followlist_order", String.valueOf(this.LJIJ.mLogData.followListOrder));
        }
        LJIL(map5);
        LJIJI(map5);
        Map<String, String> map6 = this.LJIJ.mLogData.logMap;
        if (map6 != null) {
            map5.put("game_tab_show_type", map6.get("game_tab_show_type"));
            map5.put("game_tab_name", this.LJIJ.mLogData.logMap.get("game_tab_name"));
            map5.put("game_tab_rank", this.LJIJ.mLogData.logMap.get("game_tab_rank"));
            map5.put("game_label", this.LJIJ.mLogData.logMap.get("game_label"));
            map5.put("has_new_game_label", this.LJIJ.mLogData.logMap.get("has_new_game_label"));
            map5.put("has_drops_label", this.LJIJ.mLogData.logMap.get("has_drops_label"));
        }
        Map<? extends String, ? extends String> map7 = this.LJIJ.mLogData.previewPositionParams;
        if (map7 != null) {
            map5.putAll(map7);
        }
        if (this.LJJJJLL != null) {
            map5.putAll(room.getMultiStreamLogParams());
        }
        map5.putAll(C475750IlB.LIZ());
        GroupLiveSession groupLiveSession = room.groupLiveSession;
        if (groupLiveSession != null && groupLiveSession.isGroupLiveSession) {
            str10 = "1";
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_group_live", str10);
        Boolean bool2 = Boolean.TRUE;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (bool2.equals(dataChannelGlobal.gg0(C1148140fz2.class))) {
            str11 = "1";
        } else {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_group_live_icy", str11);
        if (bool2.equals(dataChannelGlobal.gg0(C930770aKR.class))) {
            str12 = "1";
        } else {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        map5.put("is_history_group_live_icy", str12);
        Boolean bool3 = Boolean.FALSE;
        dataChannelGlobal.JQ2(C1148140fz2.class, bool3);
        dataChannelGlobal.JQ2(C930770aKR.class, bool3);
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            map5.put("is_from_guest_distribute", String.valueOf(C0IXN.LIZ()));
        }
        map5.put("link_duration", String.valueOf(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJIJI(jMax)));
        map5.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        EnterRoomConfig.RoomsData roomsData = this.LJIJ.mRoomsData;
        C0IWT.LIZ(map5, new ShareFromInfo(roomsData.shareFromUserId, roomsData.shareLiveTraceId));
        EnterRoomConfig.RoomsData roomsData2 = this.LJIJ.mRoomsData;
        if (roomsData2 != null && (str14 = roomsData2.mgCoverType) != null) {
            map5.put("mg_cover_type", str14);
            if (this.LJIJ.mRoomsData.shareIntent == null) {
                str15 = "click_cover";
            } else {
                str15 = "click_empty_spot";
            }
            map5.put("click_mg_cover_type", str15);
        }
        EnterRoomConfig.RoomsData roomsData3 = this.LJIJ.mRoomsData;
        if (roomsData3 != null && (map3 = roomsData3.mgAISummaryExtra) != null) {
            map5.putAll(map3);
        }
        EnterRoomConfig.RoomsData roomsData4 = this.LJIJ.mRoomsData;
        if (roomsData4 != null && (map2 = roomsData4.mgCardLabelInfo) != null) {
            map5.putAll(map2);
        }
        if (bool2.equals(dataChannelGlobal.gg0(C931100aKy.class))) {
            map5.put("is_end_live_from_card", "1");
        }
        LIZJ(map5);
        EnterRoomConfig.LogData logData = this.LJIJ.mLogData;
        if (logData != null && !TextUtils.isEmpty(logData.enterMgReason)) {
            map5.put("enter_mg_reason", this.LJIJ.mLogData.enterMgReason);
        }
        EnterRoomConfig.LogData logData2 = this.LJIJ.mLogData;
        if (logData2 != null) {
            long j9 = logData2.latencyEnterRoomInterval;
            if (j9 > 0) {
                map5.put("latency_enter_room_interval", String.valueOf(j9));
            }
        }
        if (LiveSdkGuestCountForEnterRoomOptSetting.isEnable()) {
            if (MultiGuestLinkedGuestCntOptSetting.isEnable() && C1161920gLG.LIZJ(IInteractService.class) != null) {
                iLJI = Math.max(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII(), LJI(room));
            } else {
                iLJI = LJI(room);
            }
            if (iLJI > 0) {
                str13 = "1";
            } else {
                str13 = CardStruct.IStatusCode.DEFAULT;
            }
            map5.put("is_guest_connection", str13);
        } else if (room.getLinkMicInfo() != null && room.getLinkMicInfo().audienceIdList != null) {
            if (room.getLinkMicInfo().audienceIdList.size() > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            map5.put("is_guest_connection", String.valueOf(i2));
        } else {
            map5.put("is_guest_connection", CardStruct.IStatusCode.DEFAULT);
        }
        LiveChain liveChain = room.liveChainInfo;
        if (liveChain != null && liveChain.hasCoStreamers) {
            map5.put("is_casters_room", "1");
        }
        map5.put("distribution_type", C473420IhQ.LIZ(Integer.valueOf((int) room.visibleScopeType)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_duration");
        c474500IjALIZ.LJJIIZI(map5);
        c474500IjALIZ.LJJII(String.valueOf(j7), "portal_id");
        c474500IjALIZ.LJJII(this.LJJJJL, "live_play_session_id");
        c474500IjALIZ.LJJII(Long.valueOf(j4), "stream_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j6), "stay_duration");
        if (this.LJJLJ > 0) {
            j = j4;
        } else {
            j = 0;
        }
        long j10 = this.LJIJI;
        C0IX5 c0ix5 = C0IX5.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("updateStreamDuration roomId:");
        sbLIZ5.append(j10);
        sbLIZ5.append(" sessionId:");
        sbLIZ5.append(str);
        sbLIZ5.append(" streamDuration:");
        sbLIZ5.append(j);
        sbLIZ5.append('.');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        c0ix5.getClass();
        C0IX5.LJIIJJI(strLIZIZ);
        if (str != null && str.length() != 0) {
            C468020IWy c468020IWy = C0IX5.LIZJ.get(str);
            if (c468020IWy != null && (c467990IWv2 = c468020IWy.LIZ) != null && c467990IWv2.LIZ == j10) {
                C467990IWv c467990IWv3 = c468020IWy.LIZ;
                c467990IWv3.LJIILJJIL = j;
                c467990IWv3.LJI = j6;
                c467990IWv3.LJIILLIIL = true;
                if (c467990IWv3.LJIIZILJ) {
                    C0IX5.LJIJI(str);
                }
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("the roomId(");
                if (c468020IWy != null && (c467990IWv = c468020IWy.LIZ) != null) {
                    objValueOf = Long.valueOf(c467990IWv.LIZ);
                } else {
                    objValueOf = null;
                }
                sbLIZ6.append(objValueOf);
                sbLIZ6.append(") is not same as ");
                sbLIZ6.append(j10);
                sbLIZ6.append(" when updateDurationForCommonContext");
                C0IX5.LJIIL(C2188811AlT.LIZIZ(sbLIZ6));
            }
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("updateDurationForCommonContext but sessionId is invalid for ");
            sbLIZ7.append(j10);
            C0IX5.LJIIL(C2188811AlT.LIZIZ(sbLIZ7));
        }
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIIJ), "duration_server_heat_level_1");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJ), "duration_server_heat_level_2");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJILLIZJL), "duration_server_heat_level_3");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJJI), "duration_server_heat_level_4");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJJIZ), "duration_server_heat_level_5");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJL), "duration_client_heat_level_1");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJLJLI), "duration_client_heat_level_2");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIIJLLLLLLLZ), "duration_client_heat_level_3");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIIJ), "duration_client_heat_level_4");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJJLIL), "duration_client_heat_level_5");
        LIZLLL();
        if ("portal".equals(this.LJJJJJ)) {
            c474500IjALIZ.LJJII(1, "is_portal_user");
        } else {
            c474500IjALIZ.LJJII(0, "is_portal_user");
        }
        DataChannel dataChannel2 = this.LJJJJLL;
        if (dataChannel2 != null && dataChannel2.gg0(C1087000eOQ.class) != null) {
            c474500IjALIZ.LJIJJLI(this.LJJJJLL);
        } else {
            c474500IjALIZ.LJIL();
        }
        DataChannel dataChannel3 = this.LJJJJLL;
        if (dataChannel3 != null && (c0ir5 = (C0IR5) dataChannel3.gg0(C1087000eOQ.class)) != null && (map = c0ir5.LJIIL) != null) {
            c474500IjALIZ.LJJIIZI(map);
        }
        if ("follow_widget".equals(this.LJIJ.mRoomsData.enterFromMerge)) {
            c474500IjALIZ.LJJII(this.LJIJ.mRoomsData.widgetType, "widget_type");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LJIJ.mRoomsData.anchorPosition), "anchor_position");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        EnterRoomConfig.LogData logData3 = this.LJIJ.mLogData;
        if (logData3 != null) {
            c474500IjALIZ.LJJII(logData3.guestRequestId, "guest_request_id");
        }
        Map<String, String> map8 = this.LJIJ.mLogData.smbLiveRoomLogMap;
        if (map8 != null) {
            c474500IjALIZ.LJJIIZI(map8);
        }
        c474500IjALIZ.LJJII(Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIIZ().LJIIIZ()), "channel_id");
        if (AutoReportSwitcherSetting.INSTANCE.isEnable()) {
            LJJIIZI(c474500IjALIZ, this.LJJJJL, room);
        }
        if (LiveBackgroundDurationCalibrate.enable()) {
            c474500IjALIZ.LJJII(Integer.valueOf(this.LJIJJ ? 1 : 0), "is_in_background");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LJIJJLI ? 1 : 0), "has_entered_background");
            c474500IjALIZ.LJJII(Long.valueOf(this.LJJJIL), "negative_background_duration");
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, this.LJJJJLL, "user_live_duration"));
        c474500IjALIZ.LJJII(String.valueOf(jMax), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(jRd2), "hot_duration");
        c474500IjALIZ.LJIIJJI("live_view");
        c474500IjALIZ.LJIILJJIL("live_detail");
        if (iFansClubService != null) {
            mapJA = iFansClubService.JA(null, this.LJJJJLL, true);
        } else {
            mapJA = null;
        }
        c474500IjALIZ.LJJIIZI(mapJA);
        C463160IEg c463160IEg = C463160IEg.LIZ;
        long jMax2 = Math.max(0L, this.LJJJI);
        synchronized (c463160IEg) {
            C463160IEg.LIZJ += jMax2;
        }
        if (this.LJJJLIIL && this.LJJJJZI) {
            c463160IEg.LIZIZ(Math.max(0L, j4));
            c474500IjALIZ.LIZ();
            C467680IVq c467680IVq = this.LJIIJ;
            if (c467680IVq != null && (i3 = c467680IVq.LIZIZ) > 0) {
                c467680IVq.LIZLLL(i3, null, c467680IVq.LJFF);
            }
            C467660IVo c467660IVo = this.LJIIJJI;
            if (c467660IVo != null && CoHostAudienceWatchEventReportMigrate.INSTANCE.isEnable()) {
                c467660IVo.LIZ();
                c467660IVo.LIZ = null;
            }
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_duration_old");
        c474500IjALIZ2.LJJIIZI(map5);
        c474500IjALIZ2.LJJII(Long.valueOf(j6), "stay_duration");
        c474500IjALIZ2.LJJII(this.LJJJJL, "live_play_session_id");
        c474500IjALIZ2.LJJII(String.valueOf(jLongValue), "duration");
        c474500IjALIZ2.LIZ();
        C467660IVo c467660IVo2 = this.LJIIJJI;
        if (c467660IVo2 != null && CoHostAudienceWatchEventReportMigrate.INSTANCE.isEnable()) {
            c467660IVo2.LIZ();
            c467660IVo2.LIZ = null;
        }
        if (C0IXW.LJ(this.LJIJ)) {
            HashMap map9 = new HashMap();
            map9.put("room_id", String.valueOf(this.LJIJI));
            map9.put("anchor_id", String.valueOf(this.LJJJJJL));
            map9.put("duration", Long.valueOf(jMax));
            C0IXW c0ixw = C0IXW.LIZ;
            C0IXW.LIZ("live_ad", "live_duration", null, map9);
        }
        LJIIZILJ();
        if (AppLogFlushOptSetting.INSTANCE.isReportOpt()) {
            this.LJIIIZ = true;
        } else {
            this.LJJ = true;
        }
        if (this.LJJJJZ != -1) {
            Map mapLJIIIZ = LJIIIZ(this.LJJJJLL);
            HashMap map10 = (HashMap) mapLJIIIZ;
            map10.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJJJJZ));
            map10.put("trigger", "close");
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_video_over", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
            c474500IjALIZIZ.LJJIIZI(mapLJIIIZ);
            c474500IjALIZIZ.LJIJJLI(this.LJJJJLL);
            c474500IjALIZIZ.LJ(this.LJJJJ);
            c474500IjALIZIZ.LIZ();
            this.LJJJJZ = -1L;
        }
        C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("livesdk_user_left_rankings_status", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ2.LJIL();
        c474500IjALIZIZ2.LJJII(LJIIIIZZ(), "ranking_status");
        c474500IjALIZIZ2.LIZ();
        LJJIII(jCurrentTimeMillis, map5, j7);
        this.LJJL.add(new C0IJA(C0IJ9.END, SystemClock.elapsedRealtime()));
        LJIJ();
        LJJI();
        C018Q.LIZJ(this.LJIJI, jMax);
        C483390IxV c483390IxV = C483390IxV.LIZ;
        C483390IxV.LJIIIIZZ(jMax);
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3 A[PHI: r10
      0x01b3: PHI (r10v1 float) = (r10v0 float), (r10v3 float) binds: [B:62:0x01af, B:32:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(com.bytedance.android.livesdkapi.depend.model.live.Room r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467650IVn.LJJ(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    public final void LJJIFFI(Room room, String str) {
        BPEAHandler bPEAHandler = this.LJFF;
        if (bPEAHandler != null) {
            this.LJI = room;
            if (this.LJIIIZ) {
                LJIIJJI(room);
                return;
            }
            this.LJIIIIZZ = this.LJJIFFI;
            this.LJIIIZ = this.LJJ;
            this.LJII = str;
            C786410Ut5.LJJZZIII(bPEAHandler, this.LJIIL);
            return;
        }
        LJIIJ(room, str);
    }

    public final void LJJIJIIJI(long j, C0IWV c0iwv) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFirstFrameTimestamp: ");
        sbLIZ.append(j);
        sbLIZ.append(", curTS: ");
        sbLIZ.append(this.LJJLJ);
        sbLIZ.append(", roomId: ");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", source: ");
        sbLIZ.append(c0iwv);
        C20441214yg.LIZIZ("LiveRoomLogger", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJLJ > 0) {
            return;
        }
        if (LiveBackgroundDurationCalibrate.enable() && this.LJIJJ) {
            this.LJJJIL += (SystemClock.elapsedRealtime() - this.LJJJ) - (System.currentTimeMillis() - j);
            this.LJJJ = SystemClock.elapsedRealtime() - (System.currentTimeMillis() - j);
        }
        this.LJJLJ = j;
        DataChannel dataChannel = this.LJJJJLL;
        if (dataChannel != null) {
            dataChannel.SX0(C750060TbY.class, Long.valueOf(j));
        }
    }

    public static void LJIILLIIL(DataChannel dataChannel, int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_one_account_toast");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "situation");
        c474500IjALIZ.LJJII(str, "last_account_status");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIZI(C474500IjA c474500IjA, String str, Room room) {
        C467720IVu c467720IVu;
        Object obj;
        String lowerCase;
        if (room != null && room.isGameLiveStreamType() && str != null && !C2093608Ic.LJ(str)) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) dataChannelGlobal.gg0(C1148220fzA.class);
            if (linkedHashMap != null && (c467720IVu = (C467720IVu) linkedHashMap.get(str)) != null) {
                String strLIZIZ = C0IN9.LIZIZ();
                c474500IjA.LJJII(str, "session_id");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
                sbLIZ.append("");
                c474500IjA.LJJII(C2188811AlT.LIZIZ(sbLIZ), "user_id");
                c474500IjA.LJJII(c467720IVu.LIZ, "initial_definition");
                c474500IjA.LJJII(Integer.valueOf(c467720IVu.LIZJ), "origin_width");
                c474500IjA.LJJII(Integer.valueOf(c467720IVu.LIZLLL), "origin_height");
                c474500IjA.LJJII(Integer.valueOf(c467720IVu.LJ), "is_origin_horizontal");
                c474500IjA.LJJII(strLIZIZ, "definition_list");
                Object obj2 = "1";
                if (c467720IVu.LIZIZ) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjA.LJJII(obj, "is_cache_last_definition");
                if (strLIZIZ == null || (lowerCase = strLIZIZ.toLowerCase(Locale.ROOT)) == null || !a0.LJJIIZI(lowerCase, "auto", false)) {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjA.LJJII(obj2, "is_auto_in_definition");
                linkedHashMap.remove(str);
                dataChannelGlobal.JQ2(C1148220fzA.class, linkedHashMap);
            }
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[PHI: r4
      0x00e7: PHI (r4v8 long) = (r4v7 long), (r4v9 long) binds: [B:65:0x00df, B:67:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r17, java.lang.String r18, X.C0IIQ r19) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467650IVn.LJJII(int, java.lang.String, X.0IIQ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(long r9, java.util.HashMap<java.lang.String, java.lang.String> r11, long r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467650IVn.LJJIII(long, java.util.HashMap, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0afb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.lang.String r29, com.bytedance.android.livesdkapi.depend.model.live.Room r30, com.bytedance.ies.sdk.datachannel.DataChannel r31, long r32) {
        /*
            Method dump skipped, instruction units count: 2869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467650IVn.LJIILJJIL(java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, long):void");
    }

    public final void LJIILL(boolean z, boolean z2, String str, Room room, DataChannel dataChannel, long j, String str2) {
        C463180IEi c463180IEi;
        AwemeCommerceStructV2 awemeCommerceStructV2;
        PseudoAdData pseudoAdData;
        if (z) {
            this.LJJJJZI = z;
            C467670IVp c467670IVp = this.LJJLJLI;
            if (c467670IVp == null) {
                c467670IVp = new C467670IVp(this.LJIJ);
                this.LJJLJLI = c467670IVp;
            }
            if (!c467670IVp.LJ) {
                c467670IVp.LJ = true;
                EnterRoomConfig enterRoomConfig = c467670IVp.LIZ;
                if (enterRoomConfig != null && enterRoomConfig.sendLiveShowEventOnSetup() && (awemeCommerceStructV2 = enterRoomConfig.commerceInfo) != null && Intrinsics.LJFF(awemeCommerceStructV2.isPseudoAd, Boolean.TRUE) && (pseudoAdData = awemeCommerceStructV2.pseudoAdData) != null) {
                    c467670IVp.LIZ("show", pseudoAdData);
                    C786410Ut5.LJLIIL(((Number) c467670IVp.LIZLLL.getValue()).longValue(), c467670IVp.LIZIZ, c467670IVp.LIZJ);
                }
            }
        }
        if (z2) {
            this.LJJJLIIL = z2;
        }
        if (this.LJJJLIIL && this.LJJJJZI) {
            LJIILJJIL(str, room, dataChannel, j);
            if (!LivePreviewNonPlayEventLogSetting.INSTANCE.isDisable() && TextUtils.equals("click", str)) {
                C464220IIi.LIZ.getClass();
                if (str2 != null && (c463180IEi = C464220IIi.LIZIZ.get(str2)) != null) {
                    c463180IEi.LIZIZ = true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0IFT] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0IFU] */
    public C467650IVn(Context context, String str, String str2, long j, String str3, String str4, EnterRoomConfig enterRoomConfig, String str5, String str6) {
        BPEAHandler bPEAHandler;
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        this.LJJLI = C0IFC.LIZ().LIZIZ();
        this.LJJLL = new C0IKN() { // from class: X.0IFT
            @Override // X.C0IKN
            public final void LIZ() {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
            }
        };
        this.LJJZ = new C0IKN() { // from class: X.0IFU
            @Override // X.C0IKN
            public final void LIZ() {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
            }
        };
        this.LJJZZI = false;
        TextUtils.equals(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel(), "local_test");
        this.LJIILIIL = new BPEAHandler(C786410Ut5.W2(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostHandlerThread()));
        if (AppLogFlushOptSetting.INSTANCE.isReportOpt()) {
            bPEAHandler = new BPEAHandler(C783270Uo1.LIZ());
        } else {
            bPEAHandler = null;
        }
        this.LJFF = bPEAHandler;
        new WeakReference(context);
        this.LJIILJJIL = str;
        this.LJIILL = str2;
        this.LJIILLIIL = j;
        this.LJIIZILJ = str3;
        this.LJJJJI = str4;
        this.LJIJ = enterRoomConfig;
        this.LJJJJIZL = str5;
        this.LJJJJJ = str6;
        this.LJIIJ = new C467680IVq(this.LJJJJLL);
        this.LJIIJJI = new C467660IVo();
        if (!LiveEnterRoomClickPerfOptSetting.optLiveRoomAdLoggerLazy()) {
            this.LJJLJLI = new C467670IVp(enterRoomConfig);
        }
    }
}
