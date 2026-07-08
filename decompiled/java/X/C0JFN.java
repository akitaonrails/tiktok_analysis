package X;

import Y.AcS494S0100000_7;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import Y.AfS5S2300000_7;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectGuessCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessHasLoggedRoundEndChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameRoundChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameSessionChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartNtpTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionStartTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEffectCommandChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessChangeWordEvent;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessEndResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAnchorSummaryDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAudienceSummaryDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessRoundSummaryDialog;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveDrawGuessMaxRoundCountSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS123S1200000_7;
import kotlin.jvm.internal.AwS136S0400000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS408S0200000_7;

/* JADX INFO: renamed from: X.0JFN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JFN {
    public static final C0JFN LIZ = new C0JFN();
    public static final Interpolator LIZIZ = C0GY9.LIZIZ(0.32f, 0.94f, 0.6f, 1.0f);

    public static String LIZLLL(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        if (i < 1000000) {
            return C786410Ut5.j4("%.1fk", Arrays.copyOf(new Object[]{Float.valueOf((i * 1.0f) / LSPassThroughRecordSizeConfig.DEFAULT)}, 1));
        }
        if (i < 1000000000) {
            return C786410Ut5.j4("%.1fm", Arrays.copyOf(new Object[]{Float.valueOf((i * 1.0f) / 1000000)}, 1));
        }
        return C786410Ut5.j4("%.1fb", Arrays.copyOf(new Object[]{Float.valueOf((i * 1.0f) / 1000000000)}, 1));
    }

    public static boolean LJFF(DataChannel dataChannel) {
        Boolean bool;
        Long lLJJI = LJJI(dataChannel);
        if (lLJJI == null || lLJJI.longValue() <= 0) {
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(DrawGuessIsCountingDownRoundStart.class);
            } else {
                bool = null;
            }
            if (!C500260Jjc.LJJJI(bool) && !C0JFQ.LIZIZ(dataChannel)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LJIIIIZZ(DataChannel dataChannel) {
        int value;
        int iIntValue;
        if (dataChannel == null || (value = LiveDrawGuessMaxRoundCountSetting.INSTANCE.getValue()) == 0) {
            return false;
        }
        Integer num = (Integer) dataChannel.gg0(DrawGuessRoundCountChannel.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue < value) {
            return false;
        }
        return true;
    }

    public static void LJIIL(DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            C0JFO.LIZLLL(dataChannel, "");
        } else {
            C0JFO.LJ(dataChannel, false);
        }
        if (dataChannel != null) {
            dataChannel.zW(DrawGuessFreelyStartChannel.class, Boolean.FALSE);
            dataChannel.zW(DrawGuessSessionIdChannel.class, 0L);
        }
    }

    public static void LJIIZILJ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        if (C500260Jjc.LJIJI(dataChannel) && C500260Jjc.LJJJI((Boolean) dataChannel.gg0(DrawGuessInGameRoundChannel.class))) {
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).OW(dataChannel, false);
        }
        dataChannel.zW(DrawGuessInGameRoundChannel.class, Boolean.FALSE);
        dataChannel.FQ2(DrawGuessRoundEndEvent.class);
    }

    public static Long LJIJJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long) dataChannel.gg0(DrawGuessRoundIdChannel.class);
        }
        return null;
    }

    public static void LJIJJLI(DataChannel dataChannel) {
        Integer num;
        int iLJFF = C497740JfY.LJFF(R.color.a54);
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(C749010TZr.class)) != null) {
            iLJFF = num.intValue();
        }
        int iRed = Color.red(iLJFF);
        int iGreen = Color.green(iLJFF);
        int iBlue = Color.blue(iLJFF);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"r\":");
        sbLIZ.append(iRed);
        sbLIZ.append(",\"g\":");
        sbLIZ.append(iGreen);
        sbLIZ.append(",\"b\":");
        sbLIZ.append(iBlue);
        sbLIZ.append('}');
        LJIL(dataChannel, LIZ(3, C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static void LJJ(DataChannel dataChannel) {
        Long lLJIJJ = LJIJJ(dataChannel);
        if (lLJIJJ != null) {
            LJIL(dataChannel, LIZ(4, String.valueOf(lLJIJJ.longValue())));
        }
    }

    public static Long LJJI(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long) dataChannel.gg0(DrawGuessSessionIdChannel.class);
        }
        return null;
    }

    public static Pair LIZ(int i, String str) {
        return new Pair(46, new C443120HZe(Integer.valueOf(i), 0, str));
    }

    public static boolean LJI(Fragment fragment, Function1 function1) {
        boolean z;
        if (C500260Jjc.LJLLJ(Boolean.valueOf(!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rl2(C924810aAp.LJ().LJIILJJIL)), new C5182020e(function1, (Function1<? super Throwable, Unit>) 642))) {
            return true;
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (!iInteractService.w9() && !iInteractService.N22()) {
            z = false;
        } else {
            z = true;
        }
        if (C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS408S0200000_7(fragment, (Fragment) function1, (Function1<? super Boolean, Unit>) 82)) || C500260Jjc.LJLLJ(Boolean.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).XP2()), new AwS408S0200000_7(fragment, (Fragment) function1, (Function1<? super Boolean, Unit>) 83))) {
            return true;
        }
        IInteractService iInteractService2 = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (C500260Jjc.LJLLJ(Boolean.valueOf(iInteractService2.k81()), new AwS251S0300000_7(iInteractService2, (IInteractService) function1, (Function1<? super Boolean, Unit>) fragment, (Fragment) 23))) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(DataChannel dataChannel, boolean z) {
        if (dataChannel != null) {
            dataChannel.zW(DrawGuessFreelyStartChannel.class, Boolean.TRUE);
            dataChannel.zW(DrawGuessSessionStartTimeChannel.class, Long.valueOf(SystemClock.uptimeMillis()));
        }
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_start");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0JFO.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII("freely", "type");
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_audience_pictionary_start");
        c474500IjALIZ2.LJIJJLI(dataChannel);
        C0JFO.LIZ(c474500IjALIZ2);
        c474500IjALIZ2.LJJII("freely", "type");
        c474500IjALIZ2.LJJII(String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "after_start");
        c474500IjALIZ2.LIZ();
    }

    public static void LJIILL(DataChannel dataChannel, List list) {
        Boolean bool;
        DialogFragment drawGuessAudienceSummaryDialog;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(PIPStatusData.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            if (dataChannel != null) {
                dataChannel.SX0(C749270TaH.class, list);
            }
        } else if (dataChannel != null) {
            dataChannel.SX0(C749270TaH.class, null);
            dataChannel.SX0(C749280TaI.class, list);
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            if (fragmentManager != null) {
                if (C500260Jjc.LJIIZILJ(dataChannel)) {
                    drawGuessAudienceSummaryDialog = new DrawGuessAnchorSummaryDialog();
                } else {
                    drawGuessAudienceSummaryDialog = new DrawGuessAudienceSummaryDialog();
                }
                drawGuessAudienceSummaryDialog.show(fragmentManager, "DrawGuessUtil");
            }
        }
    }

    public static void LJIL(DataChannel dataChannel, Pair pair) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDebugInfoManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendLiveEffectCommand, ");
        sbLIZ.append(pair);
        C774640Ua6.LIZ("DrawGuess", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel != null) {
            dataChannel.zW(LiveEffectCommandChannel.class, pair);
        }
    }

    public static void LJJII(BaseFragment baseFragment, Function1 function1) {
        DataChannel dataChannelLJ;
        if (baseFragment == null || !baseFragment.isViewValid() || (dataChannelLJ = C475510Ikn.LJ(baseFragment)) == null) {
            return;
        }
        AwS373S0200000_7 awS373S0200000_7 = new AwS373S0200000_7(baseFragment, (BaseFragment) function1, (Function1<? super Boolean, Unit>) 100);
        if (!LJI(baseFragment, awS373S0200000_7) && !LJ(baseFragment, dataChannelLJ, awS373S0200000_7) && !C500260Jjc.LJLLJ(Boolean.valueOf(C1086800eO6.LIZJ), new AwS251S0300000_7((Fragment) baseFragment, (Fragment) dataChannelLJ, (DataChannel) awS373S0200000_7, (Function1<? super Boolean, Unit>) 24)) && !LJII(baseFragment, dataChannelLJ, awS373S0200000_7)) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static void LJJIII(long j, DataChannel dataChannel) {
        Long lLJIJJ;
        if (dataChannel != null && (lLJIJJ = LJIJJ(dataChannel)) != null) {
            long jLongValue = lLJIJJ.longValue();
            HashMap map = (HashMap) dataChannel.gg0(DrawGuessCorrectGuessCountChannel.class);
            if (map == null) {
                map = new HashMap();
            }
            map.put(Long.valueOf(jLongValue), Long.valueOf(j));
            dataChannel.zW(DrawGuessCorrectGuessCountChannel.class, map);
        }
    }

    public static boolean LJ(Fragment fragment, DataChannel dataChannel, Function1 function1) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper().getClass();
        boolean z = true;
        if (!(!C0UA1.LIZ().qr(C0UD4.LIZIZ).isEmpty()) && !(!C0UA1.LIZ().qr("livebackground").isEmpty()) && !(!C0UA1.LIZ().qr("tiktok_live_boards").isEmpty())) {
            z = false;
        }
        return C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS251S0300000_7(fragment, (Fragment) dataChannel, (DataChannel) function1, (Function1<? super Boolean, Unit>) 21));
    }

    public static boolean LJII(Fragment fragment, DataChannel dataChannel, Function1 function1) {
        C1088240eQQ c1088240eQQ;
        boolean z = false;
        if (dataChannel != null && (c1088240eQQ = (C1088240eQQ) dataChannel.gg0(LivePinCardVisibilityChannel.class)) != null && c1088240eQQ.LIZ == EnumC1107860ew4.QUESTION && c1088240eQQ.LIZIZ) {
            z = true;
        }
        return C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS251S0300000_7(fragment, (Fragment) dataChannel, (DataChannel) function1, (Function1<? super Boolean, Unit>) 22));
    }

    public static final boolean LJIIIZ(Context context, DataChannel dataChannel, Function0<Unit> function0) {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        return C500260Jjc.LJLLJ(Boolean.valueOf(iInteractService.XP2()), new AwS136S0400000_7(dataChannel, (DataChannel) context, (Context) iInteractService, (IInteractService) function0, (Function0<Unit>) 9));
    }

    public static void LJIILJJIL(DataChannel dataChannel, String str, boolean z) {
        Long lLJJI;
        if (dataChannel != null && (lLJJI = LJJI(dataChannel)) != null) {
            if (lLJJI.longValue() == 0 && !z) {
                return;
            }
            if (C500260Jjc.LJIJI(dataChannel)) {
                C0JFQ.LIZLLL(dataChannel, false);
            } else {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
                C769040UEs.LIZLLL(dataChannel);
                C0JFO.LIZLLL(dataChannel, str);
            }
            dataChannel.zW(DrawGuessSessionIdChannel.class, 0L);
            dataChannel.zW(DrawGuessRoundIdChannel.class, 0L);
            dataChannel.zW(DrawGuessCurrentWordChannel.class, null);
            dataChannel.zW(DrawGuessRoundCountChannel.class, 0);
            Boolean bool = Boolean.FALSE;
            dataChannel.zW(DrawGuessInGameSessionChannel.class, bool);
            dataChannel.zW(DrawGuessInGameRoundChannel.class, bool);
            dataChannel.FQ2(DrawGuessExitGameEvent.class);
            dataChannel.zW(DrawGuessCorrectsRoundsChannel.class, null);
            dataChannel.zW(DrawGuessRoundStartTimeChannel.class, null);
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                dataChannel.zW(DrawGuessRoundStartNtpTimeChannel.class, null);
            }
            dataChannel.zW(DrawGuessCorrectGuessCountChannel.class, new HashMap());
            dataChannel.SX0(C748860TZc.class, bool);
            dataChannel.zW(DrawGuessHasLoggedRoundEndChannel.class, bool);
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            if (iBroadcastService != null) {
                iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.DRAW_GUESS, EnumC771230UNd.APPLY_FINISH, null);
            }
        }
    }

    public static void LJIILLIIL(long j, DataChannel dataChannel, String str) {
        HashMap map;
        if (dataChannel == null || (map = (HashMap) dataChannel.gg0(DrawGuessCorrectsRoundsChannel.class)) == null) {
            map = new HashMap();
        }
        map.put(Long.valueOf(j), str);
        if (dataChannel != null) {
            dataChannel.zW(DrawGuessCorrectsRoundsChannel.class, map);
        }
    }

    public static void LJIJI(Fragment fragment, DataChannel dataChannel, Long l) {
        if (l != null) {
            l.longValue();
            ((DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class)).getSummaryData(C500260Jjc.LJJLIIIJ(dataChannel), l.longValue()).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS176S0100000_7(dataChannel, 305), new C09JN() { // from class: X.0Ilp
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("DrawGuessUtil@bdeb.requestSummaryData$2");
                    C766270U4b.LIZLLL(2131854909);
                    C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestSummaryData$2");
                }
            });
        }
    }

    public static void LJIIJ(DataChannel dataChannel, String str, String str2, boolean z) {
        String str3;
        String str4;
        if (z) {
            str3 = "livesdk_draw_function_conflict_popup_show";
        } else {
            str3 = "livesdk_draw_function_conflict_toast_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIJJLI(dataChannel);
        Room roomLIZ = C162100jj.LIZ(dataChannel);
        if ((roomLIZ != null && roomLIZ.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Zf()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = "1";
        }
        c474500IjALIZ.LJJII(str4, "is_multi_guest_moderator");
        c474500IjALIZ.LJJII(str, "function_type");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(Fragment fragment, final int i, final String str, String str2, final Function0 function0) {
        final DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        if (dataChannelLJ == null) {
            function0.invoke();
            return;
        }
        Long lLJIJJ = LJIJJ(dataChannelLJ);
        if (lLJIJJ != null) {
            long jLongValue = lLJIJJ.longValue();
            Long l = (Long) dataChannelLJ.gg0(C749020TZs.class);
            if ((l == null || l.longValue() != jLongValue) && jLongValue != 0) {
                dataChannelLJ.SX0(C749020TZs.class, Long.valueOf(jLongValue));
                if (i != 4) {
                    dataChannelLJ.SX0(C748850TZb.class, Boolean.FALSE);
                }
                ((DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class)).endDrawGuessGameRound(C500260Jjc.LJJLIIIJ(dataChannelLJ), jLongValue, str2, i).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new C09JN() { // from class: X.0JFR
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("DrawGuessUtil@bdeb.endCurrentRound$2");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        if (i == 4) {
                            dataChannelLJ.FQ2(DrawGuessChangeWordEvent.class);
                        } else {
                            C0JFO.LJIIIZ(dataChannelLJ, Long.valueOf(((DrawGuessEndResponse) baseResponse.data).statistics.guessCorrectUv), str);
                            if (C0JFQ.LIZ(dataChannelLJ) && ((DrawGuessEndResponse) baseResponse.data).statistics.guessCorrectUv > 0) {
                                DrawGuessRoundSummaryDialog drawGuessRoundSummaryDialog = new DrawGuessRoundSummaryDialog();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("argument_is_auto_show", true);
                                drawGuessRoundSummaryDialog.setArguments(bundle);
                                FragmentManager fragmentManagerLJII = C500260Jjc.LJII(dataChannelLJ);
                                if (fragmentManagerLJII != null) {
                                    drawGuessRoundSummaryDialog.show(fragmentManagerLJII, "DrawGuessUtil");
                                }
                                C1C7U.LIZIZ("DrawGuessUtil@bdeb.endCurrentRound$2");
                            }
                            C0JFN c0jfn = C0JFN.LIZ;
                            DataChannel dataChannel = dataChannelLJ;
                            long j = ((DrawGuessEndResponse) baseResponse.data).statistics.guessCorrectUv;
                            c0jfn.getClass();
                            C0JFN.LJJIII(j, dataChannel);
                            C0JFN.LJIIZILJ(dataChannelLJ);
                        }
                        dataChannelLJ.SX0(C748850TZb.class, Boolean.TRUE);
                        function0.invoke();
                        C1C7U.LIZIZ("DrawGuessUtil@bdeb.endCurrentRound$2");
                    }
                }, new AfS143S0200000_7((Object) dataChannelLJ, (EmoteModel) function0, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 49));
                return;
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    public static void LJIJ(long j, long j2, DrawGuessWord drawGuessWord, DataChannel dataChannel, boolean z) {
        long jLongValue;
        boolean z2;
        Object obj;
        Long l;
        boolean z3;
        if (dataChannel == null) {
            return;
        }
        dataChannel.zW(DrawGuessHasLoggedRoundEndChannel.class, Boolean.FALSE);
        Long lLJJI = LJJI(dataChannel);
        if (lLJJI != null) {
            jLongValue = lLJJI.longValue();
        } else {
            jLongValue = 0;
        }
        int iIntValue = 0;
        if (jLongValue <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = Boolean.TRUE;
        dataChannel.zW(DrawGuessInGameSessionChannel.class, bool);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            if (z2) {
                dataChannel.FQ2(DrawGuessStartGameEvent.class);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_round_start");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0JFO.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(C0JFO.LIZ, "enter_from");
            c474500IjALIZ.LJJII(Long.valueOf(j2), "pictionary_session_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "pictionary_id");
            if (drawGuessWord.id <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "is_customized");
            c474500IjALIZ.LJJII(drawGuessWord.word, "word");
            c474500IjALIZ.LIZ();
        } else {
            String str = "1";
            if (z2 || z) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_audience_pictionary_start");
                c474500IjALIZ2.LJIJJLI(dataChannel);
                C0JFO.LIZ(c474500IjALIZ2);
                c474500IjALIZ2.LJJII("draw_and_guess", "type");
                c474500IjALIZ2.LJJII(Long.valueOf(j2), "pictionary_session_id");
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ2.LJJII(obj, "after_start");
                c474500IjALIZ2.LIZ();
            }
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_audience_pictionary_round_start");
            c474500IjALIZ3.LJIJJLI(dataChannel);
            C0JFO.LIZ(c474500IjALIZ3);
            c474500IjALIZ3.LJJII(Long.valueOf(j2), "pictionary_session_id");
            c474500IjALIZ3.LJJII(Long.valueOf(j), "pictionary_id");
            if (!z) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ3.LJJII(str, "after_start");
            c474500IjALIZ3.LIZ();
        }
        if (z2) {
            dataChannel.zW(DrawGuessSessionStartTimeChannel.class, Long.valueOf(SystemClock.uptimeMillis()));
            dataChannel.zW(DrawGuessSessionIdChannel.class, Long.valueOf(j2));
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && ((l = (Long) dataChannel.gg0(DrawGuessRoundIdChannel.class)) == null || j != l.longValue())) {
            HashMap map = (HashMap) dataChannel.gg0(DrawGuessRoundStartNtpTimeChannel.class);
            if (map == null) {
                map = new HashMap();
            }
            map.put(Long.valueOf(j), Long.valueOf(C158B.LIZ() / 1000));
            dataChannel.zW(DrawGuessRoundStartNtpTimeChannel.class, map);
        }
        dataChannel.zW(DrawGuessRoundIdChannel.class, Long.valueOf(j));
        dataChannel.zW(DrawGuessCurrentWordChannel.class, drawGuessWord);
        Integer num = (Integer) dataChannel.gg0(DrawGuessRoundCountChannel.class);
        if (num != null) {
            iIntValue = num.intValue();
        }
        dataChannel.zW(DrawGuessRoundCountChannel.class, Integer.valueOf(iIntValue + 1));
        HashMap map2 = (HashMap) dataChannel.gg0(DrawGuessRoundStartTimeChannel.class);
        if (map2 == null) {
            map2 = new HashMap();
        }
        map2.put(Long.valueOf(j), Long.valueOf(SystemClock.uptimeMillis()));
        dataChannel.zW(DrawGuessRoundStartTimeChannel.class, map2);
        dataChannel.FQ2(DrawGuessRoundStartEvent.class);
        dataChannel.zW(DrawGuessInGameRoundChannel.class, bool);
    }

    public static void LIZJ(Fragment fragment, DataChannel dataChannel, String str, String str2, String str3, Function0 function0) {
        Long l;
        long jLongValue;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(DrawGuessSessionIdChannel.class)) != null) {
            long jLongValue2 = l.longValue();
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDebugInfoManager();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exitDrawGuessGame, exitReason: ");
            sbLIZ.append(str2);
            sbLIZ.append(", endReason: ");
            sbLIZ.append(str3);
            C774640Ua6.LIZ("DrawGuess", C2188811AlT.LIZIZ(sbLIZ));
            DrawGuessApi drawGuessApi = (DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class);
            long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            Long lLJIJJ = LJIJJ(dataChannel);
            if (lLJIJJ != null) {
                jLongValue = lLJIJJ.longValue();
            } else {
                jLongValue = 0;
            }
            drawGuessApi.exitDrawGuessGame(jLJJLIIIJ, jLongValue2, jLongValue, str).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS5S2300000_7(function0, (Function0<Unit>) fragment, (Fragment) dataChannel, (DataChannel) str2, str3, (String) 2), new AfS176S0100000_7(function0, 304));
        }
    }

    public static void LJJIFFI(Context context, DataChannel dataChannel, int i, int i2, int i3, AwS123S1200000_7 awS123S1200000_7, AwS123S1200000_7 awS123S1200000_72) {
        LifecycleOwner lifecycleOwner;
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIZILJ(i);
        c782110Um9.LJII(i2);
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LLILZ;
        } else {
            lifecycleOwner = null;
        }
        c782110Um9.LIZIZ = lifecycleOwner;
        c782110Um9.LJIIJ(2131841371, new AcS494S0100000_7(awS123S1200000_7, 15));
        c782110Um9.LJIILIIL(i3, new AcS494S0100000_7(awS123S1200000_72, 14));
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
