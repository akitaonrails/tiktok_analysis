package X;

import android.os.SystemClock;
import com.bytedance.android.live.EchoModeChannel;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768620UDc implements InterfaceC761860Tua, InterfaceC779560Ui2 {
    public static final C768620UDc LIZ = new C768620UDc();
    public static final String LIZIZ = C768620UDc.class.getSimpleName();
    public static Long LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static DataChannel LJFF;
    public static final RunnableC768640UDe LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;

    @Override // X.InterfaceC761860Tua
    public final void LIZ() {
        LJIILIIL(null);
    }

    @Override // X.InterfaceC779560Ui2
    public final void LIZJ() {
    }

    @Override // X.InterfaceC779560Ui2
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC779560Ui2
    public final void LJIIIZ() {
    }

    static {
        boolean zLIZ;
        if (LIZLLL) {
            LiveAudioDevicesDetector.LIZ.getClass();
            zLIZ = LiveAudioDevicesDetector.LJFF;
        } else {
            zLIZ = C779660UiC.LIZ.LIZ();
        }
        LJ = zLIZ;
        LJI = RunnableC768640UDe.LL;
    }

    public static boolean LJIIJJI() {
        Boolean bool;
        DataChannel dataChannel = LJFF;
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(EchoModeChannel.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC761860Tua
    public final boolean LJI() {
        Integer numLIZIZ = InterfaceC766480U4w.LJIIZILJ.LIZIZ();
        return numLIZIZ != null && numLIZIZ.intValue() == EnumC768630UDd.ON.ordinal();
    }

    @Override // X.InterfaceC761860Tua
    public final boolean LJ() {
        return LJIIJJI();
    }

    @Override // X.InterfaceC761860Tua
    public final void LIZIZ(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_earphone_monitor_switch");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC761860Tua
    public final void LIZLLL(DataChannel dataChannel) {
        LJIILIIL(dataChannel);
    }

    @Override // X.InterfaceC779560Ui2
    public final void LJFF(boolean z) {
        LJ = z;
        LJIIL(false);
    }

    public final void LJIIL(boolean z) {
        if (LJ && !C779680UiE.LIZIZ() && LJI()) {
            LJII(true, false, z);
        } else {
            LJII(false, false, z);
        }
    }

    public final void LJIILIIL(DataChannel dataChannel) {
        boolean zLIZ;
        LJFF = dataChannel;
        if (!LIZLLL) {
            C779660UiC.LIZ.LIZLLL(this);
        }
        LJII = false;
        LJIIIIZZ = false;
        if (LIZLLL) {
            LiveAudioDevicesDetector.LIZ.getClass();
            zLIZ = LiveAudioDevicesDetector.LJFF;
        } else {
            zLIZ = C779660UiC.LIZ.LIZ();
        }
        LJ = zLIZ;
        if (dataChannel != null) {
            C786410Ut5.LJL(C783270Uo1.LIZJ(), new Runnable() { // from class: X.0UDf
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ2;
                    C1273890jFr c1273890jFrLJIIJJI;
                    AbstractC765580U1k abstractC765580U1kLJII;
                    C1C7U.LIZ("EchoHelper@e6cb.dataChannel$1");
                    try {
                        C768620UDc.LIZ.getClass();
                        DataChannel dataChannel2 = C768620UDc.LJFF;
                        if (!C781520UlC.LJFF(dataChannel2 != null ? (Room) dataChannel2.gg0(RoomChannel.class) : null) && (c1273890jFrLJIIJJI = C776270Ucj.LIZ.LJIIJJI(false, null, false)) != null && (abstractC765580U1kLJII = c1273890jFrLJIIJJI.LJII()) != null) {
                            abstractC765580U1kLJII.initEarMonitor();
                        }
                    } finally {
                        if (!zLIZ2) {
                        }
                    }
                    C1C7U.LIZIZ("EchoHelper@e6cb.dataChannel$1");
                }
            });
            C786410Ut5.LJLIIL(300L, C473410IhP.LIZ(), LJI);
            C20441214yg.LIZIZ(LIZIZ, "Initializing.");
            return;
        }
        C473410IhP.LIZ().removeCallbacks(LJI);
    }

    public static final void LJIIJ(AbstractC765580U1k abstractC765580U1k, boolean z) {
        C768620UDc c768620UDc = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Real set echo mode, isHardwareEchoSupported: ");
        sbLIZ.append(LJIIIIZZ);
        sbLIZ.append(", hasSelectedSoundEffect: ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c768620UDc.getClass();
        C20441214yg.LIZIZ(LIZIZ, strLIZIZ);
        if (LJIIIIZZ) {
            abstractC765580U1k.LLJILLL(true);
            abstractC765580U1k.LLJJIJI(false);
        } else {
            abstractC765580U1k.LLJJIJI(true);
            abstractC765580U1k.LLJILLL(false);
        }
    }

    @Override // X.InterfaceC761860Tua
    public final void LJII(boolean z, boolean z2, boolean z3) {
        AbstractC765580U1k abstractC765580U1kLJII;
        AbstractC768410UCh abstractC768410UChLLJJJ;
        EnumC768630UDd enumC768630UDd;
        boolean z4;
        if (LJIIJJI() != z || z3) {
            if (z) {
                if (C779680UiE.LIZIZ()) {
                    C766270U4b.LIZLLL(2131842835);
                    return;
                }
                if (!LJII) {
                    return;
                }
                if (LIZLLL) {
                    LiveAudioDevicesDetector.LIZ.getClass();
                    z4 = LiveAudioDevicesDetector.LJFF;
                } else {
                    z4 = LJ;
                }
                if (!z4) {
                    if (!z2) {
                        return;
                    }
                    C766270U4b.LIZLLL(2131852988);
                    return;
                }
            }
            InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
            if (interfaceC769940UIe == null || (abstractC765580U1kLJII = interfaceC769940UIe.LJII()) == null) {
                return;
            }
            LIZ.getClass();
            DataChannel dataChannel = LJFF;
            if (dataChannel != null) {
                dataChannel.zW(EchoModeChannel.class, Boolean.valueOf(z));
            }
            if (z) {
                C768460UCm.LJIIIIZZ();
                LJIIJ(abstractC765580U1kLJII, C761830TuX.LIZJ());
                InterfaceC761840TuY interfaceC761840TuYLJIIIIZZ = C768460UCm.LJIIIIZZ();
                AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(abstractC765580U1kLJII, 930);
                interfaceC761840TuYLJIIIIZZ.getClass();
                C761830TuX.LJIIIZ = awS591S0100000_12;
                LIZJ = Long.valueOf(SystemClock.uptimeMillis());
            } else {
                C768460UCm.LJIIIIZZ().getClass();
                C761830TuX.LJIIIZ = null;
                abstractC765580U1kLJII.LLJILLL(false);
                abstractC765580U1kLJII.LLJJIJI(false);
                C768460UCm.LJIIIIZZ().getClass();
                if (!C761830TuX.LJIIJ && (abstractC768410UChLLJJJ = abstractC765580U1kLJII.LLJJJ()) != null) {
                    abstractC768410UChLLJJJ.enablePlayerMode(false, false);
                }
                DataChannel dataChannel2 = LJFF;
                Long l = LIZJ;
                if (l != null) {
                    long jLongValue = l.longValue();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_earphone_monitor_use_time");
                    c474500IjALIZ.LJIJJLI(dataChannel2);
                    c474500IjALIZ.LJJII(Long.valueOf((SystemClock.uptimeMillis() - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "use_time");
                    c474500IjALIZ.LIZ();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("change echo state, echo state: ");
            sbLIZ.append(LJIIJJI());
            C20441214yg.LIZIZ(LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
            if (!z2) {
                return;
            }
            C20337914i1<Integer> c20337914i1 = InterfaceC766480U4w.LJIIZILJ;
            if (z) {
                enumC768630UDd = EnumC768630UDd.ON;
            } else {
                enumC768630UDd = EnumC768630UDd.OFF;
            }
            c20337914i1.LJFF(Integer.valueOf(enumC768630UDd.ordinal()));
        }
    }
}
