package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ew3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107850ew3 implements InterfaceC1141530foN, InterfaceC1102150emr, InterfaceC512840K9i, InterfaceC1102160ems {
    public static InterfaceC1107950ewD LLILLJJLI;
    public static C1107460evQ LLILLL;
    public static EnumC1107860ew4 LLIZ;
    public static C1107880ew6 LLJI;
    public static boolean LLJIJIL;
    public static InterfaceC1082050eGR LLJILLL;
    public static final C1107850ew3 LL = new C1107850ew3();
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public static final Map<EnumC1107860ew4, InterfaceC1107910ew9> LLILZIL = new LinkedHashMap();
    public static final Map<InterfaceC1107910ew9, Map<String, Object>> LLILZLL = new LinkedHashMap();
    public static long LLIZLLLIL = -1;
    public static long LLJ = -1;
    public static final Map<Class<? extends Channel<Boolean>>, EnumC1107860ew4> LLJILJIL = C2097608Jq.LJIIIIZZ(new Pair(FrameL2SlotVisibilityChannel.class, EnumC1107860ew4.FRAME_SLOT), new Pair(CustomPollCardVisibility.class, EnumC1107860ew4.CUSTOM_POLL), new Pair(LiveEventCardVisibility.class, EnumC1107860ew4.LIVE_EVENT), new Pair(CustomizedPerksCardVisibilityChannel.class, EnumC1107860ew4.SUB_PERKS), new Pair(SubGoalCardVisibilityChannel.class, EnumC1107860ew4.SUB_GOAL), new Pair(PartnershipPromoteGameCardShowBooleanChannel.class, EnumC1107860ew4.GAME_PARTNERSHIP), new Pair(LiveGoalPinCardVisibilityChannel.class, EnumC1107860ew4.LIVE_GOAL));
    public static final List<Class<? extends Channel<Boolean>>> LLJILJILJ = C1697810uHb.LJIIJJI(HighPrioritySlotVisibilityChannel.class, HighPriorityTooltipVisibilityChannel.class);

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        return C1697810uHb.LJIIJJI(C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ);
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 11;
    }

    public final void LIZ() {
        C1107460evQ c1107460evQ = LLILLL;
        if (c1107460evQ != null) {
            Iterator it2 = ((LinkedHashMap) LLILZIL).values().iterator();
            while (it2.hasNext()) {
                ((InterfaceC1107910ew9) it2.next()).LIZIZ(c1107460evQ, null);
            }
        }
        LLILLJJLI = null;
        LLILLL = null;
        LLIZ = null;
        ((LinkedHashMap) LLILZIL).clear();
        ((LinkedHashMap) LLILZLL).clear();
        LLILZ.removeCallbacksAndMessages(null);
        C1548820qPI.LJIIIIZZ("event_area_js_event_live_card_action", this);
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.PUSH_CARD;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return LLJI;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    public static long LIZJ(C1107970ewF c1107970ewF) {
        DataChannel dataChannel;
        long j = c1107970ewF.LIZ;
        if (j == -1) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1107460evQ c1107460evQ = LLILLL;
            if (c1107460evQ != null) {
                dataChannel = c1107460evQ.LIZJ;
            } else {
                dataChannel = null;
            }
            c1102070emj.getClass();
            return C1102070emj.LIZLLL(dataChannel);
        }
        if (j != -2) {
            return j;
        }
        return C963140bAe.LIZIZ();
    }

    public static void LJ(EnumC1107860ew4 enumC1107860ew4) {
        DataChannel dataChannel;
        String strLIZ;
        String str;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        LiveMode liveModeLIZJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_push_card_click");
        C1107460evQ c1107460evQ = LLILLL;
        Boolean boolValueOf = null;
        if (c1107460evQ != null) {
            dataChannel = c1107460evQ.LIZJ;
        } else {
            dataChannel = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel);
        C1107460evQ c1107460evQ2 = LLILLL;
        if (c1107460evQ2 != null && (dataChannel3 = c1107460evQ2.LIZJ) != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel3)) != null) {
            strLIZ = C354201Zc.LIZ(liveModeLIZJ);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(enumC1107860ew4.getIdentify(), "card_id");
        c474500IjALIZ.LJJII(enumC1107860ew4.getSource().name().toLowerCase(Locale.US), "creator");
        C1107460evQ c1107460evQ3 = LLILLL;
        if (c1107460evQ3 != null && (dataChannel2 = c1107460evQ3.LIZJ) != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "anchor";
        } else {
            str = "viewer";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(EnumC1107860ew4 enumC1107860ew4) {
        DataChannel dataChannel;
        String strLIZ;
        String str;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        LiveMode liveModeLIZJ;
        LLIZLLLIL = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_push_card_show");
        C1107460evQ c1107460evQ = LLILLL;
        Boolean boolValueOf = null;
        if (c1107460evQ != null) {
            dataChannel = c1107460evQ.LIZJ;
        } else {
            dataChannel = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel);
        C1107460evQ c1107460evQ2 = LLILLL;
        if (c1107460evQ2 != null && (dataChannel3 = c1107460evQ2.LIZJ) != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel3)) != null) {
            strLIZ = C354201Zc.LIZ(liveModeLIZJ);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(enumC1107860ew4.getIdentify(), "card_id");
        c474500IjALIZ.LJJII(enumC1107860ew4.getSource().name().toLowerCase(Locale.US), "creator");
        C1107460evQ c1107460evQ3 = LLILLL;
        if (c1107460evQ3 != null && (dataChannel2 = c1107460evQ3.LIZJ) != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "anchor";
        } else {
            str = "viewer";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        DataChannel dataChannel;
        InterfaceC1107950ewD interfaceC1107950ewD;
        if (LLJIJIL) {
            LLJIJIL = false;
            InterfaceC1107950ewD interfaceC1107950ewD2 = LLILLJJLI;
            if (interfaceC1107950ewD2 != null) {
                interfaceC1107950ewD2.LLLIIIIL(true);
            }
            if (LLIZ != null && (interfaceC1107950ewD = LLILLJJLI) != null) {
                interfaceC1107950ewD.a0();
            }
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1107460evQ c1107460evQ = LLILLL;
        if (c1107460evQ != null) {
            dataChannel = c1107460evQ.LIZJ;
        } else {
            dataChannel = null;
        }
        c1102070emj.LJIIJ(dataChannel, this, LLJI, null);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "event_area_js_event_live_card_action")) {
            C1107980ewG c1107980ewG = EnumC1107860ew4.Companion;
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String strLJFF = null;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "");
            }
            c1107980ewG.getClass();
            if (strLJFF != null) {
                try {
                    EnumC1107860ew4 enumC1107860ew4ValueOf = EnumC1107860ew4.valueOf(strLJFF.toUpperCase(Locale.US));
                    if (enumC1107860ew4ValueOf != null) {
                        C1107850ew3 c1107850ew3 = LL;
                        LJ(enumC1107860ew4ValueOf);
                        C1107460evQ c1107460evQ = LLILLL;
                        if (c1107460evQ != null) {
                            C1102070emj.LJIILJJIL(C1102070emj.LIZ, c1107460evQ.LIZJ, c1107850ew3, LLJI, C0KAJ.MANUALLY_ROUTE, null, null, 112);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static View LIZIZ(EnumC1107860ew4 enumC1107860ew4, InterfaceC1108000ewI interfaceC1108000ewI) {
        final Context context;
        C1107460evQ c1107460evQ = LLILLL;
        if (c1107460evQ != null && (context = c1107460evQ.LIZ) != null) {
            int i = C1107890ew7.LIZIZ[enumC1107860ew4.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    InterfaceC1107960ewE interfaceC1107960ewE = (InterfaceC1107960ewE) interfaceC1108000ewI;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, interfaceC1107960ewE.LJ(), null, true, new AwS596S0100000_17(interfaceC1107960ewE, 720));
                    if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, new ARunnableS117S0100000_17(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, 310));
                    }
                    return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                }
                throw new C1954807lC();
            }
            final ACListenerS152S0100000_17 aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(enumC1107860ew4, 196);
            FrameLayout frameLayout = new FrameLayout(context, aCListenerS152S0100000_17) { // from class: X.0cGz
                public final View.OnClickListener LL;

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    Integer numValueOf;
                    View.OnClickListener onClickListener;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 1 && (onClickListener = this.LL) != null) {
                        onClickListener.onClick(this);
                        return false;
                    }
                    return false;
                }

                {
                    this.LL = aCListenerS152S0100000_17;
                }
            };
            frameLayout.addView(((InterfaceC771240UNe) interfaceC1108000ewI).LIZLLL(context), -1, -1);
            return frameLayout;
        }
        return null;
    }

    public static void LJFF(EnumC1107860ew4 enumC1107860ew4, EnumC1108010ewJ enumC1108010ewJ) {
        DataChannel dataChannel;
        String strLIZ;
        String str;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        LiveMode liveModeLIZJ;
        LLJ = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_push_card_show_duration");
        C1107460evQ c1107460evQ = LLILLL;
        Boolean boolValueOf = null;
        if (c1107460evQ != null) {
            dataChannel = c1107460evQ.LIZJ;
        } else {
            dataChannel = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel);
        C1107460evQ c1107460evQ2 = LLILLL;
        if (c1107460evQ2 != null && (dataChannel3 = c1107460evQ2.LIZJ) != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel3)) != null) {
            strLIZ = C354201Zc.LIZ(liveModeLIZJ);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(enumC1107860ew4.getIdentify(), "card_id");
        c474500IjALIZ.LJJII(enumC1107860ew4.getSource().name().toLowerCase(Locale.US), "creator");
        C1107460evQ c1107460evQ3 = LLILLL;
        if (c1107460evQ3 != null && (dataChannel2 = c1107460evQ3.LIZJ) != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "anchor";
        } else {
            str = "viewer";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf((LLJ - LLIZLLLIL) / 1000), "duration");
        c474500IjALIZ.LJJII(enumC1108010ewJ.toString(), "reason");
        c474500IjALIZ.LIZ();
        LLIZLLLIL = -1L;
        LLJ = -1L;
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    public static boolean LIZLLL(EnumC1107860ew4 enumC1107860ew4, EnumC1108010ewJ enumC1108010ewJ, Map map) {
        InterfaceC1107910ew9 interfaceC1107910ew9;
        C1107460evQ c1107460evQ;
        C0KAJ c0kaj;
        EnumC1107860ew4 enumC1107860ew42 = LLIZ;
        if (enumC1107860ew42 == null || enumC1107860ew42 != enumC1107860ew4 || 1 == 0 || (interfaceC1107910ew9 = (InterfaceC1107910ew9) ((LinkedHashMap) LLILZIL).get(enumC1107860ew4)) == null || (c1107460evQ = LLILLL) == null) {
            return false;
        }
        LLILZ.removeCallbacksAndMessages(null);
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = c1107460evQ.LIZJ;
        C1107850ew3 c1107850ew3 = LL;
        C1107880ew6 c1107880ew6 = LLJI;
        int i = C1107890ew7.LIZ[enumC1108010ewJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                c0kaj = C0KAJ.AUTO_TERMINATE;
            } else {
                c0kaj = C0KAJ.AUTO_TIMEOUT;
            }
        } else {
            c0kaj = C0KAJ.MANUALLY_CLOSE;
        }
        C1102070emj.LJIILJJIL(c1102070emj, dataChannel, c1107850ew3, c1107880ew6, c0kaj, null, null, 112);
        InterfaceC1107950ewD interfaceC1107950ewD = LLILLJJLI;
        if (interfaceC1107950ewD != null) {
            interfaceC1107950ewD.u0();
        }
        interfaceC1107910ew9.LIZ(enumC1108010ewJ, map);
        c1107460evQ.LIZJ.zW(LivePinCardVisibilityChannel.class, new C1088240eQQ(enumC1107860ew4, false));
        LJFF(enumC1107860ew4, enumC1108010ewJ);
        LLIZ = null;
        return true;
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        InterfaceC1107950ewD interfaceC1107950ewD;
        if (!Intrinsics.LJFF(c1102130emp.LIZ(), C1107810evz.LJJIIJZLJL.LIZ) && !LLJIJIL) {
            LLJIJIL = true;
            InterfaceC1107950ewD interfaceC1107950ewD2 = LLILLJJLI;
            if (interfaceC1107950ewD2 != null) {
                interfaceC1107950ewD2.LLLIIIIL(false);
            }
            if (LLIZ != null && (interfaceC1107950ewD = LLILLJJLI) != null) {
                interfaceC1107950ewD.j0();
            }
        }
    }
}
