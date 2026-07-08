package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS153S0200000_17;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.liveinteract.api.CompetitionLayoutChangeEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.MarketingCapsuleVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideShowTimes;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GiftGuideLynxPopupEnableSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0fLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123440fLC implements InterfaceC1102150emr, InterfaceC512840K9i, InterfaceC1102160ems {
    public static final /* synthetic */ int LLLIIIL = 0;
    public final LinkedList<Function0<Unit>> LL = new LinkedList<>();
    public Function1<? super AbstractC1123700fLc, Unit> LLILLJJLI;
    public Function0<Rect> LLILLL;
    public Function0<? extends View> LLILZ;
    public Function0<Boolean> LLILZIL;
    public final C054G LLILZLL;
    public final C11NJ LLIZ;
    public LifecycleOwner LLIZLLLIL;
    public DataChannel LLJ;
    public final C1123680fLa LLJI;
    public boolean LLJIJIL;
    public final HashSet<Long> LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public final C01GW LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public GiftGuideMessage LLJJJJ;
    public Map<String, String> LLJJJJJIL;
    public GiftGuideMessage LLJJJJLIIL;
    public final BPEAHandler LLJJL;
    public final BPEAHandler LLJJLIIIJLLLLLLLZ;
    public Room LLJL;
    public C1123610fLT LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public long LLJLLL;
    public boolean LLJZ;
    public final ARunnableS117S0100000_17 LLJZIJLIL;
    public boolean LLL;
    public C1121440fHy LLLF;
    public final Set<Long> LLLFF;
    public boolean LLLFFI;
    public final List<Class<? extends Channel<Boolean>>> LLLFZ;
    public final Map<Class<? extends Channel<Boolean>>, C1107810evz> LLLI;
    public final List<Class<? extends Channel<Boolean>>> LLLII;
    public final List<Class<? extends Channel<Boolean>>> LLLIIII;
    public final List<String> LLLIIIIL;

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 7;
    }

    public C1123440fLC() {
        C1151890g55 c1151890g55 = new C1151890g55(CoroutineExceptionHandler.LJJLIL, 2);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZLL = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c1151890g55));
        this.LLIZ = new C11NJ();
        this.LLJI = new C1123680fLa();
        this.LLJILJIL = new HashSet<>();
        this.LLJJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(46));
        this.LLJJJJJIL = C2097608Jq.LJ();
        this.LLJJL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJLIIIJLLLLLLLZ = new BPEAHandler(Looper.getMainLooper());
        this.LLJZIJLIL = new ARunnableS117S0100000_17(this, 91);
        this.LLLFF = new LinkedHashSet();
        List<Class<? extends Channel<Boolean>>> listLJIILJJIL = C1697810uHb.LJIILJJIL(FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, PollVisibleChannel.class, FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, SubGoalCardVisibilityChannel.class, CustomPollCardVisibility.class, PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class, PartnershipPromoteGameCardShowBooleanChannel.class, RemindFollowDialogVisibilityChannel.class, FullScreenSurveyShowing.class, LockScreenChannel.class, WarningInfoVisibilityEvent.class, LiveGoalPinCardVisibilityChannel.class, CustomizedPerksCardVisibilityChannel.class, MarketingCapsuleVisibilityChannel.class);
        LiveConflictAvoidInputAnimOpt liveConflictAvoidInputAnimOpt = LiveConflictAvoidInputAnimOpt.INSTANCE;
        if (!liveConflictAvoidInputAnimOpt.enable()) {
            ListProtector.add(listLJIILJJIL, 0, KeyboardStatusChannel.class);
        }
        this.LLLFZ = listLJIILJJIL;
        C1107810evz c1107810evz = C1107810evz.LJJIIJZLJL;
        C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz3 = C1107810evz.LIZLLL;
        C1107810evz c1107810evz4 = C1107810evz.LJJ;
        this.LLLI = C2097608Jq.LJIIIIZZ(new Pair(KeyboardStatusChannel.class, c1107810evz), new Pair(FastGiftVisibleChannel.class, c1107810evz2), new Pair(MultiGuestVisibleChannel.class, c1107810evz2), new Pair(PollVisibleChannel.class, c1107810evz3), new Pair(FrameL2SlotVisibilityChannel.class, c1107810evz4), new Pair(FrameL3SlotVisibilityChannel.class, c1107810evz4), new Pair(SubGoalCardVisibilityChannel.class, c1107810evz4), new Pair(CustomPollCardVisibility.class, c1107810evz4), new Pair(PublicScreenNormalPollStateVisibilityChannel.class, C1107810evz.LJ), new Pair(PublicScreenGiftPollStateVisibilityChannel.class, C1107810evz.LJFF), new Pair(PartnershipPromoteGameCardShowBooleanChannel.class, c1107810evz4), new Pair(RemindFollowDialogVisibilityChannel.class, c1107810evz3), new Pair(FullScreenSurveyShowing.class, C1107810evz.LJII), new Pair(LockScreenChannel.class, C1107810evz.LJI), new Pair(WarningInfoVisibilityEvent.class, C1107810evz.LJJIII), new Pair(LiveGoalPinCardVisibilityChannel.class, C1107810evz.LJIL), new Pair(CustomizedPerksCardVisibilityChannel.class, c1107810evz4), new Pair(MarketingCapsuleVisibilityChannel.class, C1107810evz.LJJJI), new Pair(HighPrioritySlotVisibilityChannel.class, C1107810evz.LJJIJL), new Pair(HighPriorityTooltipVisibilityChannel.class, C1107810evz.LJJIJLIJ), new Pair(LiveExploreDrawerShowChannel.class, C1107810evz.LJIIIZ), new Pair(ToolBarShareVisibleChannel.class, c1107810evz3), new Pair(UserProfileShowingChannel.class, c1107810evz3));
        this.LLLII = C1697810uHb.LJIIJJI(HighPrioritySlotVisibilityChannel.class, HighPriorityTooltipVisibilityChannel.class);
        List<Class<? extends Channel<Boolean>>> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(LiveExploreDrawerShowChannel.class, ToolBarShareVisibleChannel.class, UserProfileShowingChannel.class);
        if (liveConflictAvoidInputAnimOpt.enable()) {
            ListProtector.add(listLJIILJJIL2, 0, KeyboardStatusChannel.class);
        }
        this.LLLIIII = listLJIILJJIL2;
        List<String> listLJIILJJIL3 = C1697810uHb.LJIILJJIL("EXPLORE_DRAWER", "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", C1107810evz.LJJIL.LIZ, C1107810evz.LJJJJ.LIZ, C1107810evz.LJJJJJ.LIZ);
        if (liveConflictAvoidInputAnimOpt.enable()) {
            ListProtector.add(listLJIILJJIL3, 0, c1107810evz.LIZ);
        }
        this.LLLIIIIL = listLJIILJJIL3;
    }

    public final long LJ() {
        Function0 function0;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null || (function0 = (Function0) dataChannel.gg0(WatchDurationChannel.class)) == null) {
            return 0L;
        }
        return ((Number) function0.invoke()).longValue();
    }

    public final void LJFF() {
        boolean z;
        C1123610fLT c1123610fLT;
        String str;
        C1088240eQQ c1088240eQQ;
        C788880Ux4 c788880Ux4;
        C1081600eFi c1081600eFi;
        EnumC918970a1P enumC918970a1P;
        EnumC918970a1P enumC918970a1P2;
        String str2;
        Integer num;
        C0II9 c0ii9;
        List<String> listSingletonList;
        Map map;
        C1102080emk c1102080emk;
        Iterator<Class<? extends Channel<Boolean>>> it2 = this.LLLII.iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                Class<? extends Channel<Boolean>> next = it2.next();
                DataChannel dataChannel = this.LLJ;
                if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(next), Boolean.TRUE)) {
                    String simpleName = next.getSimpleName();
                    C1107810evz c1107810evz = this.LLLI.get(next);
                    c1123610fLT = new C1123610fLT(simpleName, c1107810evz != null ? c1107810evz.LIZ : null, true, true, 34);
                }
            } else {
                Iterator<Class<? extends Channel<Boolean>>> it3 = this.LLLFZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Class<? extends Channel<Boolean>> next2 = it3.next();
                        DataChannel dataChannel2 = this.LLJ;
                        if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(next2), Boolean.TRUE)) {
                            String simpleName2 = next2.getSimpleName();
                            C1107810evz c1107810evz2 = this.LLLI.get(next2);
                            c1123610fLT = new C1123610fLT(simpleName2, c1107810evz2 != null ? c1107810evz2.LIZ : null, true, false, 18);
                        }
                    } else {
                        Iterator<Class<? extends Channel<Boolean>>> it4 = this.LLLIIII.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Class<? extends Channel<Boolean>> next3 = it4.next();
                                DataChannel dataChannel3 = this.LLJ;
                                if (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(next3), Boolean.TRUE)) {
                                    String simpleName3 = next3.getSimpleName();
                                    C1107810evz c1107810evz3 = this.LLLI.get(next3);
                                    c1123610fLT = new C1123610fLT(simpleName3, c1107810evz3 != null ? c1107810evz3.LIZ : null, false, false, 50);
                                }
                            } else {
                                DataChannel dataChannel4 = this.LLJ;
                                if (dataChannel4 == null || (c0ii9 = (C0II9) dataChannel4.gg0(SubOnlyLiveAudienceStatusChannel.class)) == null || !C494680Jac.LJII(c0ii9)) {
                                    DataChannel dataChannel5 = this.LLJ;
                                    if (dataChannel5 == null || (num = (Integer) dataChannel5.gg0(GameLinkGuestNumChannel.class)) == null || num.intValue() <= 0) {
                                        DataChannel dataChannel6 = this.LLJ;
                                        if (dataChannel6 == null || (c1081600eFi = (C1081600eFi) dataChannel6.gg0(MultiLiveRTCLayoutChannel.class)) == null || (((enumC918970a1P = c1081600eFi.LIZ) != (enumC918970a1P2 = EnumC918970a1P.FLOATING) || c1081600eFi.LIZIZ <= 0) && enumC918970a1P != EnumC918970a1P.FLOATING_FIX)) {
                                            DataChannel dataChannel7 = this.LLJ;
                                            if (dataChannel7 == null || (c788880Ux4 = (C788880Ux4) dataChannel7.gg0(CompetitionLayoutChangeEvent.class)) == null || !c788880Ux4.LIZ) {
                                                DataChannel dataChannel8 = this.LLJ;
                                                if (dataChannel8 != null && (c1088240eQQ = (C1088240eQQ) dataChannel8.gg0(LivePinCardVisibilityChannel.class)) != null && c1088240eQQ.LIZIZ) {
                                                    c1123610fLT = new C1123610fLT(c1088240eQQ.LIZ.getIdentify(), C1107810evz.LJIJJLI.LIZ, true, false, 18);
                                                } else if (C473050Igp.LIZIZ().LIZJ()) {
                                                    if (C473050Igp.LIZIZ().LIZJ) {
                                                        str = C1107810evz.LJJIIJZLJL.LIZ;
                                                    } else {
                                                        C1107810evz c1107810evz4 = C1107810evz.LIZIZ;
                                                        str = "LIVE_DIALOG";
                                                    }
                                                    c1123610fLT = new C1123610fLT("dialog", str, false, false, 50);
                                                } else if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(SparkOpenChannel.class), Boolean.TRUE)) {
                                                    C1107810evz c1107810evz5 = C1107810evz.LIZIZ;
                                                    c1123610fLT = new C1123610fLT("spark", "LIVE_NON_INPUT_BOTTOM_SHEET", false, false, 50);
                                                } else {
                                                    c1123610fLT = null;
                                                }
                                            } else {
                                                c1123610fLT = new C1123610fLT("CompetitionLayoutChangeEvent", C1107810evz.LJJJ.LIZ, true, false, 50);
                                            }
                                        } else {
                                            if (enumC918970a1P != enumC918970a1P2 || c1081600eFi.LIZIZ <= 0) {
                                                C1107810evz c1107810evz6 = C1107810evz.LIZIZ;
                                                str2 = "MULTI_FLOATING_FIX";
                                            } else {
                                                C1107810evz c1107810evz7 = C1107810evz.LIZIZ;
                                                str2 = "MULTI_FLOATING";
                                            }
                                            c1123610fLT = new C1123610fLT("MultiLiveRTCLayoutChannel", str2, true, false, 50);
                                        }
                                    } else {
                                        C1107810evz c1107810evz8 = C1107810evz.LIZIZ;
                                        c1123610fLT = new C1123610fLT("GameLinkGuestNumChannel", "GAME_GUEST_MIC", true, false, 50);
                                    }
                                } else {
                                    C1107810evz c1107810evz9 = C1107810evz.LIZIZ;
                                    c1123610fLT = new C1123610fLT("SubOnlyLiveAudienceStatusChannel", "SUB_ONLY_ACCESS", true, false, 50);
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleGuideMessage: avoidReason: ");
        sbLIZ.append(c1123610fLT != null ? c1123610fLT.LIZ : null);
        sbLIZ.append(", hard avoid: ");
        sbLIZ.append(c1123610fLT != null ? Boolean.valueOf(c1123610fLT.LIZLLL) : null);
        C20441214yg.LIZIZ("GiftGuide", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLL) {
            C20441214yg.LIZIZ("GiftGuide", "handleGuideMessage isShowing");
        } else {
            C20441214yg.LIZIZ("GiftGuide", "handleGuideMessage not isShowing");
        }
        if (c1123610fLT == null) {
            LJIIIZ();
            C1102070emj.LIZ.LJIIJ(this.LLJ, this, this.LLLF, null);
            return;
        }
        LJIILJJIL(c1123610fLT);
        String str3 = c1123610fLT.LIZJ;
        if (str3 == null || (listSingletonList = Collections.singletonList(str3)) == null) {
            listSingletonList = Collections.singletonList(c1123610fLT.LIZ);
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel9 = this.LLJ;
        C1121440fHy c1121440fHy = this.LLLF;
        c1102070emj.getClass();
        if (dataChannel9 != null && c1121440fHy != null && listSingletonList != null && (map = (Map) ((LinkedHashMap) C1102070emj.LIZIZ).get(dataChannel9)) != null && (c1102080emk = (C1102080emk) map.get(c1121440fHy.getId())) != null) {
            z = !Intrinsics.LJFF(c1102080emk.LJJIFFI(), C13LP.LJLLJ(listSingletonList));
        }
        c1102070emj.LJIJ(this.LLJ, this, this.LLLF, listSingletonList, z, null, c1123610fLT.LIZJ, null);
    }

    public final void LJI() {
        Function0<Unit> function0Pop;
        LinkedList<Function0<Unit>> linkedList = this.LL;
        if (!(!linkedList.isEmpty()) || (function0Pop = linkedList.pop()) == null) {
            return;
        }
        function0Pop.invoke();
    }

    public final boolean LJIIIIZZ() {
        return this.LLJILJILJ > 0 && this.LLJILLL < LiveRechargeGiftGuideShowTimes.INSTANCE.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        if (r1 == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123440fLC.LJIIIZ():void");
    }

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz3 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz4 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz5 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz6 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz7 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz8 = C1107810evz.LIZIZ;
        return C1697810uHb.LJIIJJI(C1107810evz.LJJ.LIZ, "NORMAL_POLL_STATE", "GIFT_POLL_STATE", "SUB_ONLY_ACCESS", "GAME_GUEST_MIC", "MULTI_FLOATING", "MULTI_FLOATING_FIX", "LIVE_FULL_SCREEN_SURVEY", C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ, C1107810evz.LJJJ.LIZ);
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    public final void LJIJJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDown remain(");
        sbLIZ.append(this.LLJLL);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("GiftGuide", C2188811AlT.LIZIZ(sbLIZ));
        if (GiftGuideLynxPopupEnableSetting.INSTANCE.enable() && InterfaceC1094160eZy.N1.LIZIZ().booleanValue()) {
            this.LLJLL = 1200000L;
        }
        if (this.LLJZ) {
            return;
        }
        C786410Ut5.LJLIIL(1000L, this.LLJJL, this.LLJZIJLIL);
        this.LLJZ = true;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.SIDE_CARD;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    public static String LIZJ(List list) {
        String strLJJLIIIJ;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ", ", e3.e, e3.f, 0, null, AFwS254S0000000_17.get$arr$(67), 24)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static EnumC1120860fH2 LIZLLL(String str) {
        for (EnumC1120860fH2 enumC1120860fH2 : EnumC1120860fH2.values()) {
            if (Intrinsics.LJFF(enumC1120860fH2.getKey(), str)) {
                return enumC1120860fH2;
            }
        }
        if (Intrinsics.LJFF(str, EnumC1123470fLF.GIFT_GUIDE_ENIGMA_LAUNCH_BUBBLE.getValue())) {
            return EnumC1120860fH2.ENIGMA_PRIVILEGE_GUIDE;
        }
        if (Intrinsics.LJFF(str, EnumC1123470fLF.GIFT_GUIDE_ENIGMA_EXPIRING_BUBBLE.getValue())) {
            return EnumC1120860fH2.ENIGMA_EXPIRING;
        }
        if (!Intrinsics.LJFF(str, EnumC1123470fLF.GIFT_GUIDE_ENIGMA_EXPIRED_BUBBLE.getValue())) {
            return null;
        }
        return EnumC1120860fH2.ENIGMA_EXPIRED;
    }

    public static void LJIIJ(C1123440fLC c1123440fLC) {
        c1123440fLC.getClass();
        C20441214yg.LIZIZ("GiftGuide", "onAvoidChange");
        c1123440fLC.LLJJIJIIJIL = c1123440fLC.LLL;
        if (c1123440fLC.LLJJJJ != null) {
            c1123440fLC.LJFF();
        }
    }

    public final void LJIIJJI(GiftGuideMessage giftGuideMessage) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Long lValueOf;
        Room room;
        Room room2;
        String value;
        boolean z;
        C1132880faQ c1132880faQLIZ;
        String string;
        User owner;
        DataChannel dataChannel = this.LLJ;
        final LifecycleOwner lifecycleOwner = this.LLIZLLLIL;
        final C11NJ c11nj = this.LLIZ;
        boolean zLJIIIIZZ = LJIIIIZZ();
        boolean zBooleanValue = ((Boolean) this.LLJJ.getValue()).booleanValue();
        final AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 178);
        final AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(this, 179);
        Map<String, String> map = this.LLJJJJJIL;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(giftGuideMessage.giftId);
        if (giftFindGiftById != null) {
            if (dataChannel != null) {
                room2 = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room2 = null;
            }
            if (zLJIIIIZZ) {
                value = EnumC1123470fLF.GIFT_GUIDE_POPUP_RECHARGE.getValue();
            } else {
                value = giftGuideMessage.guideType;
            }
            if (Intrinsics.LJFF(giftGuideMessage.guideType, EnumC1123470fLF.GIFT_GUIDE_POPUP_UG_TASK_SHOW.getValue()) || Intrinsics.LJFF(giftGuideMessage.guideType, EnumC1123470fLF.GIFT_GUIDE_POPUP_UG_TASK_GIFT.getValue())) {
                C1131530fYF.LIZJ();
            }
            C1130020fVo c1130020fVo = InterfaceC1131100fXY.LIZ;
            long j = giftGuideMessage.giftId;
            int i2 = giftFindGiftById.type;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            C1126150fPZ c1126150fPZ = new C1126150fPZ(EnumC1129230fUX.GIFT_GUIDE, EnumC1125400fOM.ANCHOR);
            c1130020fVo.getClass();
            C1128870fTx c1128870fTxLIZ = C1130020fVo.LIZ(j, i2, 1, !z, room2, 0, c1126150fPZ);
            boolean z2 = true;
            if (giftFindGiftById.type == 1) {
                z2 = false;
            }
            c1128870fTxLIZ.LJJJJL = z2;
            c1128870fTxLIZ.LJIIJ = "click";
            c1128870fTxLIZ.LJJJJLI = giftFindGiftById.isBroadcastGift;
            c1128870fTxLIZ.LJIJ = giftFindGiftById.diamondCount;
            c1128870fTxLIZ.LJIJI = CardStruct.IStatusCode.DEFAULT;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                c1132880faQLIZ = C1123290fKx.LIZ(owner);
            } else {
                c1132880faQLIZ = null;
            }
            c1128870fTxLIZ.LJLJL = c1132880faQLIZ;
            c1128870fTxLIZ.LJLJJI = value;
            c1128870fTxLIZ.LJJII = C158B.LIZ();
            c1128870fTxLIZ.LJJJIL = giftGuideMessage.hasSent;
            c1128870fTxLIZ.LJJLIIIJLJLI = giftGuideMessage.guideType;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<T> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        linkedHashMap.put(entry.getKey(), value2);
                    }
                }
                c1128870fTxLIZ.LJJLIIIJJI = new C1125300fOC("", linkedHashMap);
                c1128870fTxLIZ.LJLIIL = new LinkedHashMap(map);
                if (map.containsKey("notification_type")) {
                    String str = map.get("notification_type");
                    if (str != null) {
                        string = str.toString();
                    } else {
                        string = null;
                    }
                    c1128870fTxLIZ.LJJLIIIJLJLI = string;
                }
                String str2 = c1128870fTxLIZ.LJJLIIIJLJLI;
                if (str2 == null) {
                    str2 = "";
                }
                C1123590fLR.LIZLLL = new Pair<>(str2, map);
            }
            if (zBooleanValue) {
                c1128870fTxLIZ.LJLI = new InterfaceC1125350fOH() { // from class: X.0fLL
                    @Override // X.InterfaceC1125350fOH
                    public final void LIZ(Throwable th) {
                        LifecycleOwner lifecycleOwner2;
                        if (((th instanceof C1123810fLn) || ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 40001)) && (lifecycleOwner2 = lifecycleOwner) != null) {
                            C11NJ c11nj2 = c11nj;
                            c11nj2.LIZ(C784440Upu.LIZ().LIZJ(lifecycleOwner2, C1124340fMe.class).LIZJ(new AfS153S0200000_17(c11nj2, awS561S0100000_17, 23)));
                        }
                    }

                    @Override // X.InterfaceC1125350fOH
                    public final void LIZIZ(SendGiftResult sendGiftResult) {
                        awS561S0100000_172.invoke();
                    }
                };
            }
            if (C1123380fL6.LIZIZ()) {
                C1123380fL6.LIZJ(404, false);
            }
            C1131140fXc.LIZLLL(dataChannel, c1128870fTxLIZ);
        }
        DataChannel dataChannel2 = this.LLJ;
        long j2 = giftGuideMessage.giftId;
        Gift giftFindGiftById2 = GiftManager.inst().findGiftById(giftGuideMessage.giftId);
        if (giftFindGiftById2 != null) {
            i = giftFindGiftById2.diamondCount;
        } else {
            i = 0;
        }
        boolean z3 = giftGuideMessage.hasSent;
        Object obj10 = giftGuideMessage.guideType;
        Integer numValueOf = Integer.valueOf(this.LLJJIJIL);
        String strLJFF = this.LLJJJ;
        String str3 = giftGuideMessage.triggerName;
        String str4 = giftGuideMessage.guideType;
        C1123450fLD.LJIIL(dataChannel2, j2, z3, numValueOf, strLJFF, str3, str4, null, this.LLJJIII, LIZJ(giftGuideMessage.tags), this.LLJJJJJIL);
        C1144350fsv c1144350fsv = new C1144350fsv(null, i, j2, null, null, null, 248);
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange().getClass();
        boolean zLIZLLL = C1150850g3P.LIZLLL(null, c1144350fsv, null);
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange().getClass();
        boolean zLJ = C1150850g3P.LJ(null, c1144350fsv, null);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById3 = GiftManager.inst().findGiftById(j2);
        if (giftFindGiftById3 != null) {
            C1135800ff8.LJ(giftFindGiftById3, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById3);
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_send_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C155200ic.LIZ(dataChannel2));
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        w.LIZ.getClass();
        if (!C2093608Ic.LJ(w.LJIIJJI())) {
            c474500IjALIZ.LJJII(w.LJIIJJI(), "enter_url_source");
        }
        if (w.LJIIJ() != 0) {
            c474500IjALIZ.LJJII(String.valueOf(w.LJIIJ()), "enter_gift_id");
        }
        for (Map.Entry<String, String> entry2 : ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ho0().entrySet()) {
            c474500IjALIZ.LJJII(entry2.getValue(), entry2.getKey());
        }
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
        C1128460fTI.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LJJII(Long.valueOf(j2), "gift_id");
        c474500IjALIZ.LJJII("", "page_position");
        c474500IjALIZ.LJJII(str4, "notification_type");
        c474500IjALIZ.LJJII(C1123590fLR.LIZIZ, "notification_request_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "has_gift_sent_before");
        c474500IjALIZ.LJJII(obj10, "gift_enter_from");
        C1AI0.LIZJ(c474500IjALIZ, true, j2, null, 4);
        C1AI0.LIZ(c474500IjALIZ, giftFindGiftById3, j2);
        Object obj11 = "1";
        if (zLIZLLL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_anchor_exchange");
        if (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIL() && zLIZLLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_auto_anchor");
        if (zLJ) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_ug_exchange");
        if (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJ() && zLJ) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj4, "is_auto_ug");
        if (C924810aAp.LJ().LJJII > 0) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj5, "is_guest_connection");
        if (C1128450fTH.LJIJJLI()) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj6, "is_match_item");
        if (C1128450fTH.LJJIFFI()) {
            obj7 = "1";
        } else {
            obj7 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj7, "is_match_item_user");
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        if (C1133940fc8.LJIIJJI()) {
            obj8 = "1";
        } else {
            obj8 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj8, "is_first_recharge");
        if (C1131560fYI.LIZIZ() > 0) {
            obj9 = "1";
        } else {
            obj9 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj9, "has_coin");
        if (!C1131560fYI.LIZ()) {
            obj11 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj11, "can_exchange");
        c474500IjALIZ.LJJII(null, "trigger_keyword");
        if (Intrinsics.LJFF(C1128450fTH.LIZLLL(), "manual_pk")) {
            if (C1128450fTH.LJIL()) {
                c474500IjALIZ.LJJII("pk_phase", "match_status");
            } else {
                c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.PUNISH, "match_status");
            }
            c474500IjALIZ.LJJIIZI(C1128450fTH.LJIIL());
            c474500IjALIZ.LJJII(Long.valueOf(C1128450fTH.LIZJ()), "pk_id");
        }
        c474500IjALIZ.LJJII(C1123450fLD.LJ, "fan_club_status");
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "to_user_id");
        c474500IjALIZ.LJJII("anchor", "to_user_type");
        C1128450fTH.LIZ(c474500IjALIZ, lValueOf);
        C1128760fTm c1128760fTm2 = C1128760fTm.LJIIJ;
        C1128460fTI.LIZ(c474500IjALIZ, null);
        if (strLJFF == null) {
            strLJFF = C1128450fTH.LJFF();
        }
        c474500IjALIZ.LJJII(strLJFF, "send_gift_scene");
        c474500IjALIZ.LJJII(Integer.valueOf(C2640010k.LIZIZ() ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "gift_price");
        c474500IjALIZ.LJJII(numValueOf, "gifter_level");
        c474500IjALIZ.LJJII(0, "from_fans_task_page");
        c474500IjALIZ.LJJII("{}", "recommend_info");
        C1128460fTI.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        this.LLJJIJIIJIL = false;
    }

    public final void LJIILJJIL(C1123610fLT c1123610fLT) {
        String str;
        if (c1123610fLT.LJ) {
            LIZ(EnumC1123510fLJ.OTHER, c1123610fLT.LIZ, true, false);
        } else if (this.LLL) {
            if (c1123610fLT.LIZLLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleGuideMessage isShowing end, hard avoid(");
                sbLIZ.append(c1123610fLT.LIZ);
                C20441214yg.LIZIZ("GiftGuide", C2188811AlT.LIZIZ(sbLIZ));
                LIZ(EnumC1123510fLJ.OTHER, c1123610fLT.LIZ, false, c1123610fLT.LJFF);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleGuideMessage isShowing soft avoid(");
                sbLIZ2.append(c1123610fLT.LIZ);
                C20441214yg.LIZIZ("GiftGuide", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLJJL.removeCallbacks(this.LLJZIJLIL);
                this.LLJZ = false;
            }
            GiftGuideMessage giftGuideMessage = this.LLJJJJ;
            if (giftGuideMessage != null) {
                String str2 = giftGuideMessage.triggerName;
                if (!Intrinsics.LJFF(c1123610fLT.LIZ, "KeyboardStatusChannel") && !Intrinsics.LJFF(c1123610fLT.LIZ, C1107810evz.LJJIIJZLJL.LIZ)) {
                    str = "biz";
                } else {
                    str = "device";
                }
                C1123450fLD.LJII(LJ(), str2, str);
            }
        } else {
            C20441214yg.LIZIZ("GiftGuide", "handleGuideMessage not isShowing avoid");
        }
        LJIIZILJ(c1123610fLT);
    }

    public final void LJIILLIIL(Map<String, ? extends Object> map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            linkedHashMap.put(key, string);
        }
        this.LLJJJJJIL = linkedHashMap;
    }

    public final void LJIIZILJ(C1123610fLT c1123610fLT) {
        boolean z;
        this.LLJLIL = c1123610fLT;
        if (c1123610fLT != null) {
            z = true;
        } else {
            z = false;
        }
        C1123520fLK.LIZ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(long r6) {
        /*
            r5 = this;
            boolean r0 = r5.LLL
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "show(withDelay:"
            r1.append(r0)
            X.0fLT r0 = r5.LLJLIL
            if (r0 == 0) goto L89
            r0 = 1
        L13:
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = "GiftGuide"
            X.C20441214yg.LIZIZ(r2, r0)
            Y.ARunnableS20S0100100_17 r3 = new Y.ARunnableS20S0100100_17
            r0 = 2
            r3.<init>(r6, r5, r0)
            X.0fLT r0 = r5.LLJLIL
            if (r0 == 0) goto L8b
            java.lang.String r1 = r0.LIZ
            java.lang.Class<com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel> r0 = com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.String r0 = r0.LJI()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r4 = 0
            if (r0 != 0) goto L5d
            X.0fLT r0 = r5.LLJLIL
            if (r0 == 0) goto L5b
            java.lang.Object r1 = r0.LIZIZ
        L47:
            X.0ew4 r0 = X.EnumC1107860ew4.GAME_PARTNERSHIP
            if (r1 == r0) goto L5d
            java.lang.String r0 = "show 1s delay"
            X.C20441214yg.LIZIZ(r2, r0)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r5.LLJJLIIIJLLLLLLLZ
            r0 = 1000(0x3e8, double:4.94E-321)
            X.C786410Ut5.LJLIIL(r0, r2, r3)
        L57:
            r5.LJIIZILJ(r4)
            return
        L5b:
            r1 = r4
            goto L47
        L5d:
            com.bytedance.android.livesdk.model.message.GiftGuideMessage r0 = r5.LLJJJJ
            if (r0 == 0) goto L83
            java.lang.String r1 = r0.guideType
            X.0fLF r0 = X.EnumC1123470fLF.GIFT_GUIDE_POPUP_GAMING_CHEER_MOMENT
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L83
            java.lang.String r0 = "show guide with 30s delay"
            X.C20441214yg.LIZIZ(r2, r0)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = r5.LLJJLIIIJLLLLLLLZ
            Y.ARunnableS117S0100000_17 r2 = new Y.ARunnableS117S0100000_17
            r0 = 92
            r2.<init>(r5, r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            goto L57
        L83:
            java.lang.String r0 = "Do not reshow gaming moment guide as it is time-sensitive"
            X.C20441214yg.LIZIZ(r2, r0)
            goto L57
        L89:
            r0 = 0
            goto L13
        L8b:
            java.lang.String r0 = "show now"
            X.C20441214yg.LIZIZ(r2, r0)
            r3.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123440fLC.LJIJ(long):void");
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) throws JSONException {
        LJIIIZ();
        this.LLJJIJIIJIL = false;
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) throws JSONException {
        LLFFF(i);
    }

    public final void LJII(EnumC1123510fLJ enumC1123510fLJ, boolean z, boolean z2) {
        if (!this.LLL) {
            return;
        }
        if (this.LLJJI > 0) {
            this.LLJJIII += SystemClock.elapsedRealtime() - this.LLJJI;
        }
        this.LLL = false;
        C20441214yg.LIZIZ("GiftGuide", "hide()");
        Function1<? super AbstractC1123700fLc, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(new C1123640fLW(enumC1123510fLJ, z, z2));
        }
    }

    public final void LJIILIIL(Context context, GiftGuideMessage giftGuideMessage, String str) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str);
        C1123450fLD.LJIIL(this.LLJ, giftGuideMessage.giftId, giftGuideMessage.hasSent, Integer.valueOf(this.LLJJIJIL), this.LLJJJ, giftGuideMessage.triggerName, giftGuideMessage.guideType, null, this.LLJJIII, LIZJ(giftGuideMessage.tags), this.LLJJJJJIL);
        this.LLJJIJIIJIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(final com.bytedance.android.livesdk.model.message.GiftGuideMessage r20, java.lang.Long r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123440fLC.LJIILL(com.bytedance.android.livesdk.model.message.GiftGuideMessage, java.lang.Long, boolean):void");
    }

    public final void LIZ(EnumC1123510fLJ enumC1123510fLJ, String str, boolean z, boolean z2) {
        Long lValueOf;
        long j;
        String str2;
        boolean z3;
        List<String> list;
        GiftGuideMessage giftGuideMessage;
        if (!this.LLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end(");
        sbLIZ.append(enumC1123510fLJ.getDesc$livegift_impl_release());
        sbLIZ.append(')');
        C20441214yg.LIZIZ("GiftGuide", C2188811AlT.LIZIZ(sbLIZ));
        GiftGuideMessage giftGuideMessage2 = this.LLJJJJ;
        Room room = this.LLJL;
        String str3 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        this.LLJJJJLIIL = this.LLJJJJ;
        if (this.LLJJIJI && giftGuideMessage2 != null && lValueOf != null && !this.LLJJIJIIJIL && enumC1123510fLJ != EnumC1123510fLJ.CLICK_BACKGROUND) {
            C054G c054g = this.LLILZLL;
            long jLongValue = lValueOf.longValue();
            int i = C1123550fLN.LIZ[enumC1123510fLJ.ordinal()];
            int i2 = 3;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
            }
            C23250099c.LIZLLL(c054g, C0PEM.LIZJ, null, new C324901Nv(jLongValue, giftGuideMessage2, i2, null), 2);
        }
        long j2 = 0;
        if (!this.LLJJIJIIJIL) {
            this.LLJLL = 0L;
            this.LLJLLIL = 0L;
        }
        this.LLJJL.removeCallbacks(this.LLJZIJLIL);
        this.LLJZ = false;
        LJII(enumC1123510fLJ, !this.LLJJIJIIJIL, z2);
        GiftGuideMessage giftGuideMessage3 = this.LLJJJJ;
        if (giftGuideMessage3 != null) {
            j = giftGuideMessage3.giftId;
        } else {
            j = 0;
        }
        C1123450fLD.LJIIJJI(j, enumC1123510fLJ, SystemClock.elapsedRealtime() - this.LLJJI, this.LLJLILLLLZIIL, null);
        if (this.LLJJIJIIJIL && !z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_guide_popup_hide");
            c474500IjALIZ.LJJII(C1123590fLR.LIZJ, "notification_type");
            c474500IjALIZ.LJJII(str, "hide_reason");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            return;
        }
        DataChannel dataChannel = this.LLJ;
        GiftGuideMessage giftGuideMessage4 = this.LLJJJJ;
        if (giftGuideMessage4 != null) {
            str2 = giftGuideMessage4.guideType;
            j2 = giftGuideMessage4.giftId;
            z3 = giftGuideMessage4.hasSent;
        } else {
            str2 = null;
            z3 = false;
        }
        long j3 = this.LLJJIII;
        Integer numValueOf = Integer.valueOf(this.LLJJIJIL);
        String str4 = this.LLJJJ;
        GiftGuideMessage giftGuideMessage5 = this.LLJJJJ;
        if (giftGuideMessage5 != null) {
            str3 = giftGuideMessage5.triggerName;
            list = giftGuideMessage5.tags;
        } else {
            list = null;
        }
        C1123450fLD.LJFF(dataChannel, str2, j2, enumC1123510fLJ, z3, j3, numValueOf, str4, str3, LIZJ(list), this.LLJJJJJIL, this.LLJJIJIIJIL);
        this.LLJJJJ = null;
        C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.LLJ, this, this.LLLF, C0KAJ.AUTO_TERMINATE, null, null, 112);
        if (!LiveNotifyMessageFrequencySetting.INSTANCE.enable() || (giftGuideMessage = this.LLJJJJ) == null) {
            return;
        }
        this.LLLFF.remove(Long.valueOf(giftGuideMessage.getMessageId()));
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        C1102210emx c1102210emx;
        C1102200emw c1102200emw;
        Object obj;
        List<String> listLIZIZ = c1102130emp.LIZIZ();
        if (((ArrayList) listLIZIZ).isEmpty()) {
            return;
        }
        List<C1102210emx> list = c1102130emp.LIZ;
        if (list != null) {
            c1102210emx = (C1102210emx) C13LP.LJJJLL(list);
        } else {
            c1102210emx = null;
        }
        List<C1102200emw> list2 = c1102130emp.LIZIZ;
        if (list2 != null) {
            c1102200emw = (C1102200emw) C13LP.LJJJLL(list2);
        } else {
            c1102200emw = null;
        }
        if (c1102210emx != null) {
            obj = c1102210emx.LIZIZ;
            String str = c1102210emx.LIZ;
            if (str == null) {
            }
            this.LLJJIJIIJIL = this.LLL;
            this.LLJJLIIIJLLLLLLLZ.removeCallbacksAndMessages(null);
            LJIILJJIL(new C1123610fLT(str, obj, C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, null, 62), !this.LLLIIIIL.containsAll(listLIZIZ), z, false));
        }
        obj = null;
        if (c1102200emw == null || (str = c1102200emw.LIZ) == null) {
            return;
        }
        this.LLJJIJIIJIL = this.LLL;
        this.LLJJLIIIJLLLLLLLZ.removeCallbacksAndMessages(null);
        LJIILJJIL(new C1123610fLT(str, obj, C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, null, 62), !this.LLLIIIIL.containsAll(listLIZIZ), z, false));
    }

    public final void LJIJI(EnumC1123500fLI enumC1123500fLI, long j, String str, boolean z, long j2, String str2, String str3) {
        List<Long> list;
        String reason = str3;
        GiftGuideMessage giftGuideMessage = this.LLJJJJ;
        String strLJJLIIIJ = null;
        if (giftGuideMessage != null) {
            list = giftGuideMessage.giftIds;
        } else {
            list = null;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("fail_type", Integer.valueOf(enumC1123500fLI.getType()));
        if (reason == null) {
            reason = enumC1123500fLI.getReason();
        }
        pairArr[1] = new Pair("reason", reason);
        pairArr[2] = new Pair("gift_id", Long.valueOf(j));
        pairArr[3] = new Pair("guide_type", str);
        pairArr[4] = new Pair("is_recharge", Boolean.valueOf(z));
        pairArr[5] = new Pair("trigger_rule", str2);
        JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIIIZZ(pairArr));
        JSONObject jSONObject2 = new JSONObject(C2097908Jt.LIZJ(new Pair("interval_from_enter_room", Long.valueOf(j2))));
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("notification_request_id", C1123590fLR.LIZIZ);
        C1129310fUf.LIZ.getClass();
        pairArr2[1] = new Pair("gift_list_log_id", C1129310fUf.LIZJ);
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, " ", null, null, 0, null, null, 62);
        }
        pairArr2[2] = new Pair("gift_ids", strLJJLIIIJ);
        JSONObject jSONObject3 = new JSONObject(C2097608Jq.LJIIIIZZ(pairArr2));
        C1CC2.LIZJ("gift_guide_show_fail", jSONObject, jSONObject2, jSONObject3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_guide_show_fail");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        if (enumC1123500fLI != EnumC1123500fLI.MULTI_DISPLAY_CONTROL) {
            this.LLJIJIL = false;
        }
        LJI();
    }
}
