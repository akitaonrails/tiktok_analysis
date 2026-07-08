package com.bytedance.android.live.liveinteract.multiguestv3.main.ability;

import X.AbstractC1143290frD;
import X.AbstractC19484711Kz;
import X.AbstractC928510aGn;
import X.C01EI;
import X.C01EL;
import X.C01EY;
import X.C01FQ;
import X.C01IB;
import X.C01N8;
import X.C01ZE;
import X.C01ZR;
import X.C0U4R;
import X.C1143300frE;
import X.C1161920gLG;
import X.C11QI;
import X.C13BV;
import X.C13LP;
import X.C1516000pYM;
import X.C19487111Lx;
import X.C19748512Ol;
import X.C19EG;
import X.C1AZW;
import X.C20441214yg;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C320901Mh;
import X.C356501Zz;
import X.C465520INi;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C755510TkL;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C924220a9s;
import X.C924810aAp;
import X.C930480aJy;
import X.C930940aKi;
import X.C932490aND;
import X.C941600abu;
import X.C941640aby;
import X.C941670ac1;
import X.C941690ac3;
import X.C941700ac4;
import X.C941730ac7;
import X.C941820acG;
import X.C948450amx;
import X.EnumC941710ac5;
import X.InterfaceC302601Fg;
import X.InterfaceC917640ZzG;
import X.InterfaceC926960aEI;
import X.InterfaceC927690aFT;
import X.InterfaceC938530aWx;
import X.InterfaceC941720ac6;
import X.InterfaceC941860acK;
import X.InterfaceC941870acL;
import X.InterfaceC941900acO;
import X.InterfaceC948500an2;
import Y.AcS19S1400000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.sei.SeiFanTicketExtra;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.util.MultiGuestFanTicketFetchDelayTimeSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2.PlayRecordConfigSettingV2;
import com.bytedance.android.livesdk.ability.PlayStateMapChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlayOptConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlaybookNonMultiGuestConfigSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "LINK_MIC_ABILITY_MANAGER")
public final class LinkMicAbilityManager implements InterfaceC926960aEI {
    public static final C941700ac4 LJIIIZ = new C941700ac4();
    public final DataChannel LIZ;
    public final ConcurrentHashMap<String, InterfaceC941870acL> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C01EL> LIZJ = new ConcurrentHashMap<>();
    public Map<String, Integer> LIZLLL = new HashMap();
    public final CopyOnWriteArraySet<InterfaceC941900acO> LJ = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, C941690ac3> LJFF = new ConcurrentHashMap<>();
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public Map<String, C01EL> LJII = new LinkedHashMap();
    public final C941670ac1 LJIIIIZZ = new C941670ac1();

    public static String LJJ() {
        return LinkMicPlaybookNonMultiGuestConfigSetting.INSTANCE.isCodeTechSwitchForAndroidEnable() ? ((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).IY() : "multi_guest";
    }

    @Override // X.InterfaceC926960aEI
    public final void LJII() {
        C941670ac1 c941670ac1 = this.LJIIIIZZ;
        C941600abu c941600abu = c941670ac1.LL;
        if (c941600abu != null) {
            c941600abu.LIZ.LIZIZ();
        }
        c941670ac1.LL = null;
    }

    @Override // X.InterfaceC941720ac6
    public final C941600abu LJIILJJIL() {
        C941670ac1 c941670ac1 = this.LJIIIIZZ;
        c941670ac1.getClass();
        if (Intrinsics.LJFF("fan_ticket_component", "fan_ticket_component")) {
            return c941670ac1.LL;
        }
        return null;
    }

    @Override // X.InterfaceC941720ac6
    public final List<String> LJIILLIIL() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, InterfaceC941870acL> entry : this.LIZIZ.entrySet()) {
            if (entry.getValue().isRunning()) {
                entry.getValue().isRunning();
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC941720ac6
    public final Pair<Integer, Long> LJIJ() {
        boolean zLJIIZILJ = LJIIZILJ("count_down_for_all");
        boolean zLJIIZILJ2 = LJIIZILJ("live_show");
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        return zLJIIZILJ ? new Pair<>(1, Long.valueOf(LIZLLL("count_down_for_all"))) : interfaceC938530aWxLIZ != null && interfaceC938530aWxLIZ.LJIIJ() ? new Pair<>(12, Long.valueOf(LIZLLL("guest_showdown"))) : zLJIIZILJ2 ? new Pair<>(3, Long.valueOf(LIZLLL("live_show"))) : new Pair<>(0, 0L);
    }

    @Override // X.InterfaceC926960aEI
    public final void onCreate() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission2;
        DataChannel dataChannel;
        PlayRecordConfigSettingV2 playRecordConfigSettingV2 = PlayRecordConfigSettingV2.INSTANCE;
        if (playRecordConfigSettingV2.enable()) {
            C1AZW c1azw = C1AZW.LIZ;
            String strLIZ = C01EI.LIZ(58, "LinkMicAbilityManager");
            c1azw.getClass();
            C1AZW.LIZ(strLIZ, "onCreate", null, null);
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.CQ2(AigcWallpaperStatus.class, this, new C5183020f(this, 26));
                dataChannel2.CQ2(DrawGuessStartGameEvent.class, this, new AwS594S0100000_15(this, 143));
                dataChannel2.CQ2(DrawGuessExitGameEvent.class, this, new AwS594S0100000_15(this, 144));
                dataChannel2.CQ2(PlayStateMapChannel.class, this, new C5183020f(this, 27));
            }
            if (C500260Jjc.LJIJI(this.LIZ) && C932490aND.LIZ(false) && (dataChannel = this.LIZ) != null) {
                dataChannel.CQ2(DrawGuessRoundStartEvent.class, this, new AwS594S0100000_15(this, 145));
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            long j = (room == null || (multiLiveUserSettings2 = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission2 = multiLiveUserApplySettings2.multiLiveUserApplyPermission) == null) ? 0L : multiLiveUserApplyPermission2.applierSortGiftScoreThreshold;
            if (j > 0) {
                LJIL(C01EL.START, "gift_threshold_link");
            } else {
                LJIL(C01EL.END, "gift_threshold_link");
            }
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            long j2 = (room2 == null || (multiLiveUserSettings = room2.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) ? 0L : multiLiveUserApplyPermission.applierSortSetting;
            String strLIZ2 = C01EI.LIZ(77, "LinkMicAbilityManager");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("giftPriority ");
            sbLIZ.append(j2);
            sbLIZ.append(" , giftScoreThreshold ");
            sbLIZ.append(j);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ(strLIZ2, strLIZIZ, null, null);
            if (j2 > 0) {
                LJIL(C01EL.START, "gift_priority_link");
            } else {
                LJIL(C01EL.END, "gift_priority_link");
            }
            if (playRecordConfigSettingV2.firstCheckGift()) {
                C924810aAp c924810aApLJ = C924810aAp.LJ();
                if (c924810aApLJ != null && (multiLiveAnchorPanelSettings2 = c924810aApLJ.LJJIII) != null) {
                    multiLiveAnchorPanelSettings2.applierSortGiftScoreThreshold = j;
                }
                C924810aAp c924810aApLJ2 = C924810aAp.LJ();
                if (c924810aApLJ2 != null && (multiLiveAnchorPanelSettings = c924810aApLJ2.LJJIII) != null) {
                    multiLiveAnchorPanelSettings.applierSortSetting = (int) j2;
                }
            }
            LIZ(this.LJIIIIZZ);
        }
    }

    @Override // X.InterfaceC926960aEI
    public final void onDestroy() {
        DataChannel dataChannel;
        C1AZW c1azw = C1AZW.LIZ;
        String strLIZ = C01EI.LIZ(93, "LinkMicAbilityManager");
        c1azw.getClass();
        C1AZW.LIZ(strLIZ, "onDestroy", null, null);
        for (C941690ac3 c941690ac3 : new ArrayList(this.LJFF.values())) {
            c941690ac3.getClass();
            c941690ac3.LIZ(EnumC941710ac5.FORCE_DESTROY);
        }
        this.LJI.removeCallbacksAndMessages(null);
        if (PlayRecordConfigSettingV2.INSTANCE.enable() && (dataChannel = this.LIZ) != null) {
            dataChannel.zQ2(this);
        }
        LJIIJJI(this.LJIIIIZZ);
        if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isDetailOOMFixV2Enable()) {
            this.LIZIZ.clear();
        }
    }

    public LinkMicAbilityManager(final DataChannel dataChannel) {
        this.LIZ = dataChannel;
        LIZIZ(new InterfaceC941870acL(dataChannel) { // from class: X.0acB
            public final DataChannel LL;

            @Override // X.InterfaceC941870acL
            public final String LLLIZZ() {
                return "draw_guess";
            }

            @Override // X.InterfaceC941870acL
            public final void end() {
                C20441214yg.LIZIZ("DrawGuessAbilityProxy", "ILinkMicAbility#end");
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(DrawGuessEndEvent.class, "linkMicAbility");
                }
            }

            @Override // X.InterfaceC941870acL
            public final boolean isRunning() {
                return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LL);
            }

            {
                this.LL = dataChannel;
            }
        });
        LIZIZ(new InterfaceC941870acL() { // from class: X.0aSO
            @Override // X.InterfaceC941870acL
            public final String LLLIZZ() {
                return "enlarge_grid";
            }

            @Override // X.InterfaceC941870acL
            public final void end() {
            }

            @Override // X.InterfaceC941870acL
            public final boolean isRunning() {
                InterfaceC927510aFB interfaceC927510aFB;
                Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
                Boolean boolValueOf = null;
                if ((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null) {
                    boolValueOf = Boolean.valueOf(interfaceC927510aFB.LJIIIIZZ());
                }
                return C500260Jjc.LJJJI(boolValueOf);
            }
        });
        LIZIZ(new InterfaceC941870acL() { // from class: X.0acN
            @Override // X.InterfaceC941870acL
            public final String LLLIZZ() {
                return "expand_both";
            }

            @Override // X.InterfaceC941870acL
            public final void end() {
            }

            @Override // X.InterfaceC941870acL
            public final boolean isRunning() {
                return false;
            }
        });
        LIZIZ(new InterfaceC941870acL() { // from class: X.0aDq
            @Override // X.InterfaceC941870acL
            public final String LLLIZZ() {
                return "gift_priority_link";
            }

            @Override // X.InterfaceC941870acL
            public final void end() {
            }

            @Override // X.InterfaceC941870acL
            public final boolean isRunning() {
                Number numberValueOf;
                MultiLiveUserSettings multiLiveUserSettings;
                MultiLiveUserApplySettings multiLiveUserApplySettings;
                MultiLiveUserApplyPermission multiLiveUserApplyPermission;
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
                C924810aAp c924810aApLJ = C924810aAp.LJ();
                if (c924810aApLJ == null || (multiLiveAnchorPanelSettings = c924810aApLJ.LJJIII) == null) {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    numberValueOf = (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) ? 0 : Long.valueOf(multiLiveUserApplyPermission.applierSortSetting);
                } else {
                    numberValueOf = Integer.valueOf(multiLiveAnchorPanelSettings.applierSortSetting);
                }
                return numberValueOf.intValue() > 0;
            }
        });
        LIZIZ(new InterfaceC941870acL() { // from class: X.0aDr
            @Override // X.InterfaceC941870acL
            public final String LLLIZZ() {
                return "gift_threshold_link";
            }

            @Override // X.InterfaceC941870acL
            public final void end() {
            }

            @Override // X.InterfaceC941870acL
            public final boolean isRunning() {
                MultiLiveUserSettings multiLiveUserSettings;
                MultiLiveUserApplySettings multiLiveUserApplySettings;
                MultiLiveUserApplyPermission multiLiveUserApplyPermission;
                long j;
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
                C924810aAp c924810aApLJ = C924810aAp.LJ();
                if (c924810aApLJ == null || (multiLiveAnchorPanelSettings = c924810aApLJ.LJJIII) == null) {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) {
                        return false;
                    }
                    j = multiLiveUserApplyPermission.applierSortGiftScoreThreshold;
                } else {
                    j = multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
                }
                return j > 0;
            }
        });
        LIZIZ(new InterfaceC941870acL(dataChannel) { // from class: X.0aVi
            public final DataChannel LL;

            @Override // X.InterfaceC941870acL
            public final String LLLIZZ() {
                return "notice_board";
            }

            @Override // X.InterfaceC941870acL
            public final void end() {
            }

            @Override // X.InterfaceC941870acL
            public final boolean isRunning() {
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    return Intrinsics.LJFF(dataChannel2.gg0(C956760b0M.class), Boolean.TRUE);
                }
                return false;
            }

            {
                this.LL = dataChannel;
            }
        });
    }

    @Override // X.InterfaceC941720ac6
    public final void LIZ(InterfaceC941900acO interfaceC941900acO) {
        if (!PlayRecordConfigSettingV2.INSTANCE.enable()) {
            return;
        }
        this.LJ.add(interfaceC941900acO);
    }

    @Override // X.InterfaceC926960aEI
    public final void LIZIZ(InterfaceC941870acL interfaceC941870acL) {
        this.LIZIZ.put(interfaceC941870acL.LLLIZZ(), interfaceC941870acL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerAbility: ");
        sbLIZ.append(interfaceC941870acL.LLLIZZ());
        sbLIZ.append(", all abilities: ");
        sbLIZ.append(this.LIZIZ.keySet());
        C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC941720ac6
    public final long LIZLLL(String str) {
        InterfaceC938530aWx interfaceC938530aWxLIZ;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        Long lLJII;
        InterfaceC927690aFT interfaceC927690aFTLIZ;
        Long playId;
        C01ZR c01zrLIZIZ;
        switch (str.hashCode()) {
            case -984969275:
                if (str.equals("top_guests") && (c01zrLIZIZ = C356501Zz.LIZIZ()) != null) {
                    return c01zrLIZIZ.getPlayId();
                }
                return 0L;
            case -983286850:
                if (!str.equals("count_down_for_all") || (interfaceC927690aFTLIZ = C924220a9s.LIZ()) == null || (playId = interfaceC927690aFTLIZ.getPlayId()) == null) {
                    return 0L;
                }
                return playId.longValue();
            case 1008965232:
                if (!str.equals("live_show") || (interfaceC302601FgLIZ = C01FQ.LIZ()) == null || (lLJII = interfaceC302601FgLIZ.LJII()) == null) {
                    return 0L;
                }
                return lLJII.longValue();
            case 1886539686:
                if (!str.equals("guest_showdown") || (interfaceC938530aWxLIZ = C01IB.LIZ()) == null) {
                    return 0L;
                }
                return interfaceC938530aWxLIZ.getPlayId();
            default:
                return 0L;
        }
    }

    @Override // X.InterfaceC926960aEI
    public final void LJ(LifecycleOwner lifecycleOwner) {
        C941670ac1 c941670ac1 = this.LJIIIIZZ;
        DataChannel dataChannel = this.LIZ;
        c941670ac1.getClass();
        if (C01ZE.LIZ()) {
            c941670ac1.LL = new C941600abu(lifecycleOwner, dataChannel);
        }
    }

    @Override // X.InterfaceC926960aEI
    public final void LJFF(RecyclableWidgetManager recyclableWidgetManager) {
        Set<Widget> set;
        if (recyclableWidgetManager != null && (set = recyclableWidgetManager.widgets) != null) {
            for (LifecycleOwner lifecycleOwner : set) {
                if (lifecycleOwner instanceof InterfaceC941870acL) {
                    LIZIZ((InterfaceC941870acL) lifecycleOwner);
                }
            }
        }
    }

    @Override // X.InterfaceC941720ac6
    public final List<String> LJI(String str) {
        Boolean boolValueOf;
        List<String> mutexAbilities = LinkMicAbilityMutexMaterialOptSetting.INSTANCE.getMutexAbilities(str);
        if (mutexAbilities == null) {
            mutexAbilities = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : mutexAbilities) {
            InterfaceC941870acL interfaceC941870acL = this.LIZIZ.get(str2);
            if (interfaceC941870acL != null) {
                boolValueOf = Boolean.valueOf(interfaceC941870acL.isRunning());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC926960aEI
    public final void LJIIIIZZ(InterfaceC941870acL interfaceC941870acL) {
        if (this.LIZIZ.keySet().contains(interfaceC941870acL.LLLIZZ())) {
            this.LIZIZ.remove(interfaceC941870acL.LLLIZZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unRegisterAbility: ");
            sbLIZ.append(interfaceC941870acL.LLLIZZ());
            sbLIZ.append(", all abilities: ");
            sbLIZ.append(this.LIZIZ.keySet());
            C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC926960aEI
    public final void LJIIIZ(RecyclableWidgetManager recyclableWidgetManager) {
        Set<Widget> set;
        if (recyclableWidgetManager != null && (set = recyclableWidgetManager.widgets) != null) {
            for (LifecycleOwner lifecycleOwner : set) {
                if (lifecycleOwner instanceof InterfaceC941870acL) {
                    LJIIIIZZ((InterfaceC941870acL) lifecycleOwner);
                }
            }
        }
    }

    @Override // X.InterfaceC941720ac6
    public final boolean LJIIJ(String str) {
        InterfaceC941870acL interfaceC941870acL = this.LIZIZ.get(str);
        if (interfaceC941870acL != null) {
            return interfaceC941870acL.isRunning();
        }
        return false;
    }

    @Override // X.InterfaceC941720ac6
    public final void LJIIJJI(InterfaceC941900acO interfaceC941900acO) {
        if (!PlayRecordConfigSettingV2.INSTANCE.enable()) {
            return;
        }
        this.LJ.remove(interfaceC941900acO);
    }

    @Override // X.InterfaceC941720ac6
    public final void LJIIL(Map<String, Integer> map) {
        this.LIZLLL = map;
    }

    @Override // X.InterfaceC941720ac6
    public final boolean LJIIZILJ(String str) {
        if (this.LIZJ.get(str) == C01EL.START) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC926960aEI
    public final boolean LJIJI(String str) {
        if (!PlayRecordConfigSetting.INSTANCE.validate()) {
            return true;
        }
        return this.LIZIZ.keySet().contains(str);
    }

    @Override // X.InterfaceC941720ac6
    public final List<String> LJIJJ(String str) {
        List<String> mutexScene = LinkMicAbilityMutexMaterialOptSetting.INSTANCE.getMutexScene(str);
        if (mutexScene == null) {
            return C13BV.INSTANCE;
        }
        return mutexScene;
    }

    @Override // X.InterfaceC926960aEI
    public final void LJIJJLI(SeiAppData seiAppData) {
        DataChannel dataChannel;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List<LinkListUser> listLJJIII;
        long id;
        Map<String, String> map;
        int iIntValue;
        Integer num;
        C941600abu c941600abu = this.LJIIIIZZ.LL;
        if (c941600abu != null) {
            C941640aby c941640aby = c941600abu.LIZ.LJ;
            if (seiAppData != null) {
                c941640aby.getClass();
                Map<String, Map<String, String>> map2 = seiAppData.businessExtraInfo;
                if (map2 != null && (map = map2.get("fan_ticket")) != null) {
                    try {
                        SeiFanTicketExtra seiFanTicketExtra = (SeiFanTicketExtra) C19748512Ol.LIZIZ.LJII(C1516000pYM.LIZJ(map), SeiFanTicketExtra.class);
                        if (seiFanTicketExtra != null && (num = seiFanTicketExtra.scoreType) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        if (c941640aby.LLILLJJLI.LJI != iIntValue) {
                            c941640aby.LLILLJJLI.LJI = iIntValue;
                            c941640aby.LIZIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parseSEI Json error: ");
                        sbLIZ.append(th.getMessage());
                        C320901Mh.LIZ("SeiDataSource", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            if (!c941640aby.LLIZLLLIL && (dataChannel = c941640aby.LL) != null && Intrinsics.LJFF(dataChannel.gg0(C755510TkL.class), Boolean.TRUE)) {
                c941640aby.LLIZLLLIL = true;
                if (c941640aby.LLILLJJLI.LJI == 2) {
                    C320901Mh.LIZ("SeiDataSource", "parseSEI and has not received coins SEI, SCENE == PLAY");
                    long value = MultiGuestFanTicketFetchDelayTimeSetting.INSTANCE.getValue();
                    if (value > 0) {
                        c941640aby.LLIZ = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(value, TimeUnit.SECONDS).LJIIIZ(new AfS184S0100000_15(c941640aby, 214))).LJIILL().LJIIZILJ();
                        return;
                    }
                    return;
                }
                C320901Mh.LIZ("SeiDataSource", "parseSEI and has not received coins SEI, SCENE == FAM_TICKET");
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent = new FanTicketRoomNoticeContent();
                ArrayList arrayList = new ArrayList();
                InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                    for (LinkListUser linkListUser : listLJJIII) {
                        UserFanTicket userFanTicket = new UserFanTicket();
                        User user = linkListUser.user;
                        if (user != null) {
                            id = user.getId();
                        } else {
                            id = 0;
                        }
                        userFanTicket.userId = id;
                        userFanTicket.LIZ = linkListUser.linkMicId;
                        userFanTicket.fanTicket = linkListUser.fanTicket;
                        arrayList.add(userFanTicket);
                    }
                }
                fanTicketRoomNoticeContent.scoreType = c941640aby.LLILLJJLI.LJI;
                fanTicketRoomNoticeContent.userFanTicket = arrayList;
                c941640aby.LIZJ(fanTicketRoomNoticeContent, false, true, "SeiDataSource-updateFanTicketDataByUserManager");
            }
        }
    }

    @Override // X.InterfaceC926960aEI
    public final void LJIILL(String str, InterfaceC941870acL interfaceC941870acL) {
        if (!Intrinsics.LJFF(this.LIZIZ.get(str), interfaceC941870acL)) {
            this.LIZIZ.put(str, interfaceC941870acL);
        }
    }

    @Override // X.InterfaceC941720ac6
    public final void LJIL(C01EL c01el, String str) {
        boolean z;
        if (!PlayRecordConfigSettingV2.INSTANCE.enable()) {
            return;
        }
        this.LIZJ.put(str, c01el);
        List<String> listLJIILLIIL = LJIILLIIL();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIILLIIL) {
            if (LinkMicAbilitySupportReportListSetting.INSTANCE.getSupportAbilityList().contains(obj)) {
                arrayList.add(obj);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C465520INi.LIZ.Jw(Collections.singletonList("gameplay_scene"));
        } else {
            C465520INi.LIZ.Dm0(C2097908Jt.LIZJ(new Pair("gameplay_scene", strLJJLIIIJ)));
        }
        Iterator<InterfaceC941900acO> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(c01el, str);
        }
    }

    @Override // X.InterfaceC941720ac6
    public final boolean LIZJ(String str, Function0 function0, Function1 function1) {
        return LJJIFFI(str, function0, function1, false);
    }

    @Override // X.InterfaceC941720ac6
    public final boolean LJIILIIL(String str, AwS559S0100000_15 awS559S0100000_15, AwS126S0400000_31 awS126S0400000_31) {
        return LJJIFFI(str, awS559S0100000_15, awS126S0400000_31, true);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0ac8] */
    public static final void LJJII(final LinkMicAbilityManager linkMicAbilityManager, final String str, final Function1<? super EnumC941710ac5, Unit> function1, final Function0<Unit> function0) {
        List<String> list;
        ArrayList arrayList;
        List<String> listLJI;
        if (!linkMicAbilityManager.LJFF.containsKey(str)) {
            ?? r0 = new InterfaceC941860acK() { // from class: X.0ac8
                @Override // X.InterfaceC941860acK
                public final InterfaceC941870acL LIZ(String str2) {
                    return this.LIZ.LIZIZ.get(str2);
                }

                @Override // X.InterfaceC941860acK
                public final void LIZIZ(EnumC941710ac5 enumC941710ac5) {
                    List<String> list2;
                    C941690ac3 c941690ac3 = this.LIZ.LJFF.get(str);
                    this.LIZ.LJFF.remove(str);
                    LinkMicAbilityManager linkMicAbilityManager2 = this.LIZ;
                    String str2 = str;
                    Function1<EnumC941710ac5, Unit> function12 = function1;
                    Function0<Unit> function02 = function0;
                    if (c941690ac3 != null) {
                        list2 = c941690ac3.LLILZIL;
                    } else {
                        list2 = null;
                    }
                    linkMicAbilityManager2.getClass();
                    LinkMicAbilityManager.LJJI(str2, function12, function02, enumC941710ac5, list2);
                }
            };
            BPEAHandler bPEAHandler = linkMicAbilityManager.LJI;
            C941690ac3 c941690ac3 = new C941690ac3(str, r0, bPEAHandler);
            linkMicAbilityManager.LJFF.put(str, c941690ac3);
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            String strLIZ = C01EI.LIZ(40, "MutexTask");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startMutexHandle, ");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("targetAbilityName=");
            sbLIZ2.append(str);
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI(strLIZ, strLIZIZ);
            if (C941820acG.LIZ(str)) {
                c941690ac3.LIZ(EnumC941710ac5.SUCCESS);
                return;
            }
            LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null && (listLJI = interfaceC941720ac6LIZIZ.LJI(str)) != null) {
                arrayList = new ArrayList(listLJI);
            } else {
                arrayList = new ArrayList();
            }
            c941690ac3.LLILZ = arrayList;
            c941690ac3.LLILZIL = new ArrayList(arrayList);
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ2 != null) {
                interfaceC941720ac6LIZIZ2.LIZ(c941690ac3);
            }
            C786410Ut5.LJLIIL(LinkMicPlayOptConfigSetting.INSTANCE.mutexFinishDelayTime(), bPEAHandler, c941690ac3.LLIZ);
            for (String str2 : c941690ac3.LLILZ) {
                C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                String strLIZ2 = C01EI.LIZ(52, "MutexTask");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("endMutexAbility, ability=");
                sbLIZ3.append(str2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c1143300frELJIIJJI2.getClass();
                AbstractC1143290frD.LJI(strLIZ2, strLIZIZ2);
                InterfaceC941870acL interfaceC941870acLLIZ = c941690ac3.LLILLJJLI.LIZ(str2);
                if (interfaceC941870acLLIZ != null) {
                    interfaceC941870acLLIZ.end();
                }
            }
            return;
        }
        EnumC941710ac5 enumC941710ac5 = EnumC941710ac5.EXIST_MUTEX_TASK;
        C941690ac3 c941690ac32 = linkMicAbilityManager.LJFF.get(str);
        if (c941690ac32 != null) {
            list = c941690ac32.LLILZIL;
        } else {
            list = null;
        }
        LJJI(str, function1, function0, enumC941710ac5, list);
    }

    public final boolean LJJIFFI(String str, Function0 function0, Function1 function1, boolean z) {
        String strLJIJJ;
        String strLJIJJ2;
        Boolean boolValueOf;
        C19EG c19egLIZ = null;
        String strLLLIZZ = null;
        if (LJIJJ(str).contains(LJJ())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mutexStartUseDialogExit, targetAbility: ");
            sbLIZ.append(str);
            sbLIZ.append(", mutexScene: ");
            sbLIZ.append(LJJ());
            C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ));
            Integer num = this.LIZLLL.get(LJJ());
            if (num != null) {
                C766270U4b.LIZLLL(num.intValue());
            }
            LJJI(str, function1, function0, EnumC941710ac5.SCENE_MUTEX, null);
            return false;
        }
        List<String> listLJI = LJI(str);
        ArrayList arrayList = (ArrayList) listLJI;
        if (arrayList.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mutexStartUseDialogExit, targetAbility: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", noMutexRunningAbility");
            C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ2));
            function0.invoke();
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("mutexStartUseDialogExit, targetAbility: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", mutexAbilityList: ");
        sbLIZ3.append(listLJI);
        C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ3));
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        c930480aJy.getClass();
        if (!C930480aJy.LJIJJ(lValueOf)) {
            HashSet<String> hashSet = C941730ac7.LIZIZ;
            if (!hashSet.contains(str) || !hashSet.containsAll(listLJI)) {
                LJJI(str, function1, function0, EnumC941710ac5.DOWNGRADE_TO_TOAST, new ArrayList(listLJI));
                List<String> mutexAbilities = LinkMicAbilityMutexMaterialOptSetting.INSTANCE.getMutexAbilities(str);
                if (mutexAbilities == null) {
                    mutexAbilities = C13BV.INSTANCE;
                }
                for (String str2 : mutexAbilities) {
                    InterfaceC941870acL interfaceC941870acL = this.LIZIZ.get(str2);
                    if (interfaceC941870acL != null) {
                        boolValueOf = Boolean.valueOf(interfaceC941870acL.isRunning());
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        try {
                            C0U4R c0u4r = new C0U4R();
                            c0u4r.LIZIZ = C497740JfY.LJIJJ(2131854477, C941730ac7.LIZ.get(str));
                            c0u4r.LJFF = true;
                            c0u4r.LJII = this.LIZ;
                            C766270U4b.LJIIJ(c0u4r);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("toastMutexAbility crash: throwable: ");
                            sbLIZ4.append(th);
                            C20441214yg.LJ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("mutexStartUseToastBlock, targetAbility: ");
                        sbLIZ5.append(str);
                        sbLIZ5.append(", mutexAbility: ");
                        InterfaceC941870acL interfaceC941870acL2 = this.LIZIZ.get(str2);
                        if (interfaceC941870acL2 != null) {
                            strLLLIZZ = interfaceC941870acL2.LLLIZZ();
                        }
                        sbLIZ5.append(strLLLIZZ);
                        C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ5));
                        return false;
                    }
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("mutexStartUseToastBlock, targetAbility: ");
                sbLIZ6.append(str);
                sbLIZ6.append(", noMutexAbility");
                C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ6));
                return false;
            }
        }
        if (z) {
            LJJII(this, str, function1, function0);
            return false;
        }
        C01EY.LIZ("show", str, listLJI);
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII != null) {
            c19egLIZ = C500260Jjc.LIZ(contextLJII);
        }
        C782110Um9 c782110Um9 = new C782110Um9(c19egLIZ);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    strLJIJJ = C497740JfY.LJIIL(2131755916, arrayList.size() - 1, C941730ac7.LIZ.get(ListProtector.get(listLJI, 0)), Integer.valueOf(arrayList.size() - 1));
                } else {
                    HashMap<String, String> map = C941730ac7.LIZ;
                    strLJIJJ = C497740JfY.LJIJJ(2131854205, map.get(ListProtector.get(listLJI, 0)), map.get(ListProtector.get(listLJI, 1)), map.get(ListProtector.get(listLJI, 2)));
                }
            } else {
                HashMap<String, String> map2 = C941730ac7.LIZ;
                strLJIJJ = C497740JfY.LJIJJ(2131854204, map2.get(ListProtector.get(listLJI, 0)), map2.get(ListProtector.get(listLJI, 1)));
            }
        } else {
            strLJIJJ = C497740JfY.LJIJJ(2131854203, C941730ac7.LIZ.get(ListProtector.get(listLJI, 0)));
        }
        c782110Um9.LIZJ = strLJIJJ;
        int size2 = arrayList.size();
        if (size2 != 1) {
            if (size2 != 2) {
                if (size2 != 3) {
                    strLJIJJ2 = C497740JfY.LJIIL(2131755915, arrayList.size() - 1, C941730ac7.LIZ.get(ListProtector.get(listLJI, 0)), Integer.valueOf(arrayList.size() - 1));
                } else {
                    HashMap<String, String> map3 = C941730ac7.LIZ;
                    strLJIJJ2 = C497740JfY.LJIJJ(2131854199, map3.get(ListProtector.get(listLJI, 0)), map3.get(ListProtector.get(listLJI, 1)), map3.get(ListProtector.get(listLJI, 2)));
                }
            } else {
                HashMap<String, String> map4 = C941730ac7.LIZ;
                strLJIJJ2 = C497740JfY.LJIJJ(2131854198, map4.get(ListProtector.get(listLJI, 0)), map4.get(ListProtector.get(listLJI, 1)));
            }
        } else {
            strLJIJJ2 = C497740JfY.LJIJJ(2131854197, C941730ac7.LIZ.get(ListProtector.get(listLJI, 0)));
        }
        String strLJIJJ3 = C497740JfY.LJIJJ(2131854200, C941730ac7.LIZ.get(str));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLJIJJ2);
        sbLIZ7.append(strLJIJJ3);
        c782110Um9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ7));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILIIL(2131854201, new AcS19S1400000_15(listLJI, str, this, function1, function0, 0));
        c782110Um9.LJIIJ(2131854202, new AcS19S1400000_15(listLJI, str, this, function1, function0, 1));
        C786410Ut5.E4(c782110Um9.LIZ());
        return false;
    }

    public static void LJJI(String str, Function1 function1, Function0 function0, EnumC941710ac5 enumC941710ac5, List list) {
        String strLJJLIIIJ;
        String strLIZ = C01EI.LIZ(0, "LinkMicAbilityManager");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMutexResult, ability=");
        sbLIZ.append(str);
        sbLIZ.append(", mutexFinishReason=");
        sbLIZ.append(enumC941710ac5.getReasonName());
        sbLIZ.append(", mutexAbilityList=");
        sbLIZ.append(list);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        String reasonName = enumC941710ac5.getReasonName();
        int reasonCode = enumC941710ac5.getReasonCode();
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        C01N8.LIZ(reasonCode, "play_mutex_handle", str, 0L, "", reasonName, strLJJLIIIJ);
        if (enumC941710ac5 == EnumC941710ac5.TIME_OUT || enumC941710ac5 == EnumC941710ac5.HAS_NEW_MUTEX) {
            C766270U4b.LIZLLL(2131851936);
        }
        if (enumC941710ac5 == EnumC941710ac5.SUCCESS) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (function1 == null) {
                return;
            }
            function1.invoke(enumC941710ac5);
        }
    }
}
