package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS1S0100200_17;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.NormalGiftDisplayForVideoEvent;
import com.bytedance.android.live.gift.ShowGiftChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.InRoomGiftTrayCountEvent;
import com.bytedance.android.livesdk.ShowGiftGeneralTrayMessageEvent;
import com.bytedance.android.livesdk.ShowGiftVideoEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveIsBackgroundData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.GameStopBackgroundAnimationSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftUseNewGiftTrayV3;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftHammerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.MsgStair;
import com.bytedance.android.livesdk.livesetting.gift.TrayComboConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.FlyMicGiftPhase2ConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ffM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135940ffM implements InterfaceC1137430fhl {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public ViewGroup LJII;
    public C1135930ffL LJIIIIZZ;
    public C1135810ff9 LJIIIZ;
    public C1136990fh3 LJIIJ;
    public C1138090fip LJIIJJI;
    public DataChannel LJIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public C1104160eq6 LJIJI;
    public C1135810ff9 LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public EnumC1136300ffw LJFF = EnumC1136300ffw.IDLE;
    public final MutableLiveData<EnumC1136300ffw> LJI = new MutableLiveData<>();
    public final C11NJ LJIILIIL = new C11NJ();
    public C1267904xh LJIILLIIL = new C1267904xh(false);
    public final long LJIIZILJ = 200;
    public final long LJIJ = 2000;
    public final ARunnableS117S0100000_17 LJJIFFI = new ARunnableS117S0100000_17(this, 306);
    public final ARunnableS117S0100000_17 LJJII = new ARunnableS117S0100000_17(this, 305);

    public final void LJIJI() {
        this.LJIIL = null;
        C1138090fip c1138090fip = this.LJIIJJI;
        if (c1138090fip != null) {
            c1138090fip.LIZJ("dispose");
            c1138090fip.LIZIZ(new C1137560fhy(c1138090fip));
            c1138090fip.LIZ();
            c1138090fip.LJFF = null;
        }
        C1136990fh3 c1136990fh3 = this.LJIIJ;
        if (c1136990fh3 != null) {
            c1136990fh3.LJIILJJIL();
        }
        this.LJIILIIL.LJ();
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isEnable()) {
            this.LJIIIZ = null;
            this.LJIJJ = null;
        }
    }

    @Override // X.InterfaceC1137430fhl
    public final void LIZJ() {
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            if (this.LJIILL) {
                LJIILIIL();
                this.LJIILL = false;
                if (C1132700fa8.LJIIIZ(c1135810ff9)) {
                    IInteractService iInteractService = C1128450fTH.LIZ;
                    C1128450fTH.LIZ.ji1(c1135810ff9.LIZLLL());
                    return;
                }
                return;
            }
            C1135850ffD c1135850ffD = c1135810ff9.LJJJJIZL;
            if (c1135850ffD != null) {
                c1135850ffD.LJI("trayExited");
            }
        }
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAsyncReportEvent()) {
            C1135810ff9 c1135810ff92 = this.LJIIIZ;
            long jLIZ = C158B.LIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<Integer, String> map = C1138350fjF.LIZ;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01LX(0L, new ARunnableS1S0100200_17(jLIZ, jCurrentTimeMillis, c1135810ff92, 6), null), 2);
        } else {
            C1135790ff7.LJFF(this.LJIIIZ, C158B.LIZ(), System.currentTimeMillis());
        }
        this.LIZJ = false;
        int i = this.LIZ;
        if (i == 1) {
            C1133910fc5.LJI("LiveGiftTrayDisplayController", "onExitEnd, mVideoPlayLock=1");
            LJJ(0);
            LJIJJ();
        } else if (i > 1) {
            LJJ(1);
        } else {
            C1133910fc5.LJI("LiveGiftTrayDisplayController", "onExitEnd");
            LJIJJ();
        }
    }

    @Override // X.InterfaceC1137430fhl
    public final void LIZLLL() {
        C1133910fc5.LJI("LiveGiftTrayDisplayController", "onEnterStart");
    }

    public final boolean LJFF() {
        boolean z;
        C1135930ffL c1135930ffL;
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            C1135930ffL c1135930ffL2 = this.LJIIIIZZ;
            C1135810ff9 c1135810ff9LIZIZ = c1135930ffL2 != null ? c1135930ffL2.LIZIZ(this) : null;
            if (c1135810ff9LIZIZ == null) {
                C1135930ffL c1135930ffL3 = this.LJIIIIZZ;
                if (c1135930ffL3 != null) {
                    c1135810ff9LIZIZ = c1135930ffL3.LIZJ(this);
                    z = false;
                    if (c1135810ff9LIZIZ != null) {
                    }
                }
            } else {
                z = true;
            }
            if (!c1135810ff9.LJIIL.contains(c1135810ff9LIZIZ)) {
                int i = c1135810ff9.LJIIIZ;
                int i2 = c1135810ff9.LJIIJ;
                if (i - i2 > 0) {
                    c1135810ff9.LJIIJJI = i2;
                    c1135810ff9.LJIIL.add(c1135810ff9LIZIZ);
                    GiftMessage giftMessage = c1135810ff9LIZIZ.LIZ;
                    GiftMessage giftMessage2 = c1135810ff9.LIZ;
                    if (z && giftMessage != null && giftMessage2 != null) {
                        C1135790ff7.LJ(giftMessage2, giftMessage, c1135810ff9.LJIIJJI, c1135810ff9.LJIIIZ, c1135810ff9.LJJJLIIL);
                    }
                    this.LJIILL = !z;
                    C1135040fdu.LIZ.getClass();
                    C1135810ff9 c1135810ff9LIZ = C1135040fdu.LIZ(c1135810ff9);
                    Iterator it2 = c1135810ff9LIZ.LJJJJ.iterator();
                    while (it2.hasNext()) {
                        ((C1136650fgV) it2.next()).LIZJ = true;
                    }
                    this.LJJIFFI.run();
                    c1135810ff9.LIZIZ(LJIJJLI(c1135810ff9));
                    if (!this.LJIILL && (c1135930ffL = this.LJIIIIZZ) != null) {
                        c1135930ffL.LJ(c1135810ff9LIZ);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJII() {
        C1133910fc5.LJI("LiveGiftTrayDisplayController", "comboTray");
        C1104160eq6 c1104160eq6 = this.LJIJI;
        if (c1104160eq6 != null) {
            c1104160eq6.LIZ();
        }
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            C1104160eq6 c1104160eq62 = this.LJIJI;
            int iLIZIZ = c1104160eq62 != null ? c1104160eq62.LIZIZ() : 0;
            C1104160eq6 c1104160eq63 = this.LJIJI;
            C1135790ff7.LJIIJJI(c1135810ff9, true, iLIZIZ, c1104160eq63 != null ? c1104160eq63.LIZJ() : 0, this.LJIIL, c1135810ff9.LJJJJI, C158B.LIZ(), System.currentTimeMillis());
            c1135810ff9.LJJJJI = true;
            C1137530fhv c1137530fhv = new C1137530fhv(c1135810ff9, EnumC1137330fhb.COMBO);
            C1137530fhv c1137530fhvLJIIJJI = LJIIJJI(c1137530fhv);
            if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
                C1138090fip c1138090fip = this.LJIIJJI;
                if (c1138090fip != null) {
                    c1138090fip.onEvent(new C1136670fgX(c1135810ff9));
                }
            } else {
                C1136990fh3 c1136990fh3 = this.LJIIJ;
                if (c1136990fh3 != null) {
                    c1136990fh3.LJIIIZ(c1137530fhv, null);
                }
            }
            C784440Upu.LIZ().LIZIZ(new C1137600fi2(c1137530fhvLJIIJJI, this.LJIILJJIL));
            c1135810ff9.LJJJJIZL.LJI("trayLastComboStart");
        }
    }

    public final void LJIIJ() {
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            c1135810ff9.LIZIZ(LJIJJLI(c1135810ff9));
        }
        C1134980fdo.LIZ.LIZ++;
        LJII();
    }

    public final void LJIIL() {
        if (this.LJIL) {
            return;
        }
        C1136990fh3 c1136990fh3 = this.LJIIJ;
        if (c1136990fh3 != null) {
            c1136990fh3.LJIIJ(this.LJIIL, this.LJJ);
        }
        C1136990fh3 c1136990fh32 = this.LJIIJ;
        if (c1136990fh32 != null) {
            c1136990fh32.setViewGroup(this.LJII);
        }
        this.LJIL = true;
    }

    public final String LJIILL() {
        String str;
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        return (c1135810ff9 == null || (str = c1135810ff9.LIZLLL) == null) ? "" : str;
    }

    public final void LJIIZILJ() {
        GiftMessage giftMessage;
        C1135850ffD c1135850ffD;
        GiftMessage giftMessage2;
        Boolean bool;
        DataChannel dataChannel = this.LJIIL;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) ? false : bool.booleanValue();
        boolean zW02 = ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).w02();
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        InterfaceC1139410fkx interfaceC1139410fkxLJII = null;
        boolean z = (c1135810ff9 != null ? c1135810ff9.LJIJ : null) == C0TF7.NONE;
        if ((c1135810ff9 == null || (giftMessage2 = c1135810ff9.LIZ) == null || !giftMessage2.LL || c1135810ff9.LIZJ) && !((zBooleanValue || zW02) && z)) {
            if (c1135810ff9 != null) {
                c1135810ff9.LJJIJL = true;
                if (c1135810ff9.LIZ != null) {
                    if (LJJI(c1135810ff9)) {
                        LJIILIIL();
                        return;
                    } else {
                        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS117S0100000_17(this, 307));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!LJJI(c1135810ff9)) {
            LJJ(this.LIZ - 1);
            this.LIZJ = false;
        }
        C1135810ff9 c1135810ff92 = this.LJIIIZ;
        if (c1135810ff92 != null && (giftMessage = c1135810ff92.LIZ) != null) {
            DataChannel dataChannel2 = this.LJIIL;
            if (dataChannel2 != null) {
                dataChannel2.zW(ShowGiftChannel.class, Boolean.TRUE);
            }
            DataChannel dataChannel3 = this.LJIIL;
            if (dataChannel3 != null) {
                dataChannel3.LC0(ShowGiftVideoEvent.class, giftMessage);
            }
            C1135810ff9 c1135810ff93 = this.LJIIIZ;
            if (c1135810ff93 != null && (c1135850ffD = c1135810ff93.LJJJJIZL) != null) {
                C1136330ffz c1136330ffzLIZIZ = c1135850ffD.LIZIZ();
                long j = c1136330ffzLIZIZ.LIZ;
                if (j > 0) {
                    c1135850ffD.LIZJ.put("sendTs", Long.valueOf(j));
                }
                long j2 = c1136330ffzLIZIZ.LIZIZ;
                if (j2 > 0) {
                    c1135850ffD.LIZJ.put("receiveTs", Long.valueOf(j2));
                }
                long j3 = c1136330ffzLIZIZ.LIZJ;
                if (j3 > 0) {
                    c1135850ffD.LIZJ.put("dequeueTs", Long.valueOf(j3));
                }
                c1135850ffD.LIZJ.put("sendReceivedDuration", Long.valueOf(c1136330ffzLIZIZ.LIZLLL));
                c1135850ffD.LIZJ.put("createReceivedDuration", Long.valueOf(c1136330ffzLIZIZ.LJ));
                c1135850ffD.LIZJ.put("sendEnqueueDuration", Long.valueOf(c1136330ffzLIZIZ.LJFF));
                c1135850ffD.LIZJ.put("receivedEnqueueDuration", Long.valueOf(c1136330ffzLIZIZ.LJI));
                c1135850ffD.LIZJ.put("enqueueDequeueDuration", Long.valueOf(c1136330ffzLIZIZ.LJII));
            }
        }
        C1135810ff9 c1135810ff94 = this.LJIIIZ;
        if (c1135810ff94 != null) {
            C1135930ffL c1135930ffL = this.LJIIIIZZ;
            if (c1135930ffL != null) {
                if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnable()) {
                    InterfaceC1136220ffo interfaceC1136220ffo = c1135930ffL.LIZIZ;
                    if (interfaceC1136220ffo != null) {
                        interfaceC1139410fkxLJII = interfaceC1136220ffo.LJII();
                        if (interfaceC1139410fkxLJII == null) {
                            interfaceC1139410fkxLJII = new InterfaceC1139410fkx() { // from class: X.0fkw
                                @Override // X.InterfaceC1139410fkx
                                public final void LIZ(AwS383S0200000_17 awS383S0200000_17) {
                                }

                                @Override // X.InterfaceC1139410fkx
                                public final void LIZIZ(C2246681Cwc c2246681Cwc) {
                                }
                            };
                        }
                    } else {
                        C1135910ffJ c1135910ffJ = c1135930ffL.LIZ;
                        if (c1135910ffJ == null || (interfaceC1139410fkxLJII = c1135910ffJ.LJIIIIZZ) == null) {
                            interfaceC1139410fkxLJII = new InterfaceC1139410fkx() { // from class: X.0fkw
                                @Override // X.InterfaceC1139410fkx
                                public final void LIZ(AwS383S0200000_17 awS383S0200000_17) {
                                }

                                @Override // X.InterfaceC1139410fkx
                                public final void LIZIZ(C2246681Cwc c2246681Cwc) {
                                }
                            };
                        }
                    }
                } else {
                    interfaceC1139410fkxLJII = new InterfaceC1139410fkx() { // from class: X.0fkw
                        @Override // X.InterfaceC1139410fkx
                        public final void LIZ(AwS383S0200000_17 awS383S0200000_17) {
                        }

                        @Override // X.InterfaceC1139410fkx
                        public final void LIZIZ(C2246681Cwc c2246681Cwc) {
                        }
                    };
                }
            }
            c1135810ff94.LJLI = interfaceC1139410fkxLJII;
            DataChannel dataChannel4 = this.LJIIL;
            if (dataChannel4 != null) {
                dataChannel4.LC0(ShowGiftGeneralTrayMessageEvent.class, c1135810ff94);
            }
        }
    }

    public final void LJIJJ() {
        boolean z = this.LIZJ;
        if (z || this.LIZIZ) {
            C1AF0.LJI(new C09JO(), "play_end_receive_twice", C2097608Jq.LJIIJ(new Pair("trayDisplayOngoing", String.valueOf(z)), new Pair("videoPlayOngoing", String.valueOf(this.LIZIZ))));
        }
        this.LJIIIZ = null;
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isEnable()) {
            this.LJIJJ = null;
        }
        LJIL(EnumC1136300ffw.IDLE);
        DataChannel dataChannel = this.LJIIL;
        if (dataChannel != null) {
            C1135930ffL c1135930ffL = this.LJIIIIZZ;
            dataChannel.LC0(InRoomGiftTrayCountEvent.class, Integer.valueOf(c1135930ffL != null ? c1135930ffL.LJIIJ() : 0));
        }
        C1135930ffL c1135930ffL2 = this.LJIIIIZZ;
        if (c1135930ffL2 != null) {
            c1135930ffL2.LIZ();
        }
    }

    public final void LJIILIIL() {
        boolean zLJI = MethodIDManager.LJI(71929);
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            this.LJJI = false;
            if (!this.LJIILL) {
                LJIL(EnumC1136300ffw.JUMPING);
            }
            C1137530fhv c1137530fhv = new C1137530fhv(c1135810ff9, EnumC1137330fhb.ENTER);
            C1137530fhv c1137530fhvLJIIJJI = LJIIJJI(c1137530fhv);
            if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
                C1138090fip c1138090fip = this.LJIIJJI;
                if (c1138090fip != null) {
                    c1138090fip.onEvent(new C1136680fgY(c1135810ff9));
                }
            } else {
                C1136990fh3 c1136990fh3 = this.LJIIJ;
                if (c1136990fh3 != null) {
                    c1136990fh3.LJIIIZ(c1137530fhv, null);
                }
            }
            DataChannel dataChannel = this.LJIIL;
            if (dataChannel != null) {
                C1135930ffL c1135930ffL = this.LJIIIIZZ;
                dataChannel.LC0(InRoomGiftTrayCountEvent.class, Integer.valueOf(c1135930ffL != null ? c1135930ffL.LJIIJ() : 0));
            }
            C784440Upu.LIZ().LIZIZ(new C1137600fi2(c1137530fhvLJIIJJI, this.LJIILJJIL));
            c1135810ff9.LJJJJIZL.LJI("trayEnterStart");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJIFFI() {
        C1136320ffy c1136320ffy;
        C1135930ffL c1135930ffL;
        C1135810ff9 c1135810ff9LJII;
        C1135810ff9 c1135810ff9LJII2;
        LJIIL();
        if (!LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
            EnumC1136300ffw enumC1136300ffw = this.LJFF;
            if (enumC1136300ffw == EnumC1136300ffw.IDLE) {
                C1135930ffL c1135930ffL2 = this.LJIIIIZZ;
                if (c1135930ffL2 == null || (c1135810ff9LJII2 = c1135930ffL2.LJII(new C1136320ffy(null, "STATUS.IDLE"))) == null) {
                    return;
                }
                LJIIIIZZ(c1135810ff9LJII2);
                return;
            }
            if (enumC1136300ffw != EnumC1136300ffw.WAITING || (c1135930ffL = this.LJIIIIZZ) == null || (c1135810ff9LJII = c1135930ffL.LJII(new C1136320ffy(this.LJIIIZ, "STATUS.WAITING"))) == null) {
                return;
            }
            LJIIIZ(c1135810ff9LJII);
            return;
        }
        if (this.LIZLLL) {
            this.LJ = true;
            return;
        }
        int i = C1136720fgc.LIZ[this.LJFF.ordinal()];
        if (i == 1) {
            c1136320ffy = new C1136320ffy(null, "STATUS.IDLE");
        } else if (i != 2) {
            return;
        } else {
            c1136320ffy = new C1136320ffy(this.LJIIIZ, "STATUS.WAITING");
        }
        C1135930ffL c1135930ffL3 = this.LJIIIIZZ;
        if (c1135930ffL3 != null) {
            EnumC1136300ffw enumC1136300ffw2 = this.LJFF;
            this.LIZLLL = true;
            this.LJ = false;
            c1135930ffL3.LJIIIIZZ(c1136320ffy, new AwS383S0200000_17(this, enumC1136300ffw2, 129));
        }
    }

    public static boolean LJI(C1135810ff9 c1135810ff9) {
        Long lValueOf;
        InterfaceC769410UGd interfaceC769410UGdM70;
        boolean z;
        boolean z2;
        User owner;
        if (c1135810ff9 != null && C1132700fa8.LJIIIZ(c1135810ff9)) {
            return false;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf2 = null;
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        if (c1135810ff9 != null) {
            lValueOf2 = Long.valueOf(c1135810ff9.LIZLLL());
        }
        boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
        IInteractService iInteractService = C1128450fTH.LIZ;
        if ((!iInteractService.ib2() && !iInteractService.k81()) || ((interfaceC769410UGdM70 = C1140740fn6.LIZIZ().M70()) != null && interfaceC769410UGdM70.getPanelLayoutType() == 7)) {
            z = false;
        } else {
            z = true;
        }
        if (zLJFF && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !zLJFF;
        if (iInteractService.Kz()) {
            if (z2 || z3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C1137530fhv LJIIJJI(C1137530fhv c1137530fhv) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1135810ff9 c1135810ff9 = c1137530fhv.LIZ;
        C1135810ff9 c1135810ff92 = new C1135810ff9(c1135810ff9.LIZ);
        C1137530fhv c1137530fhv2 = new C1137530fhv(c1135810ff92, c1137530fhv.LIZIZ);
        C089E c089e = new C089E(C1135810ff9.class.getDeclaredFields());
        while (c089e.hasNext()) {
            Field field = (Field) c089e.next();
            field.setAccessible(true);
            field.set(c1135810ff92, field.get(c1135810ff9));
        }
        HashSet<C1136900fgu> hashSet = c1135810ff9.LJJIFFI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hashSet, 10));
        Iterator<C1136900fgu> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1136900fgu.LIZ(it2.next(), 0, 15));
        }
        c1135810ff92.LJJIFFI = C13LP.LLIFFJFJJ(arrayList);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("duration : ");
        sbLIZ.append(jElapsedRealtime2 - jElapsedRealtime);
        C1133910fc5.LJI("LiveGiftTrayDisplayController", C2188811AlT.LIZIZ(sbLIZ));
        return c1137530fhv2;
    }

    public static boolean LJJI(C1135810ff9 c1135810ff9) {
        if (c1135810ff9 == null) {
            return true;
        }
        if (!c1135810ff9.LIZJ && C1133680fbi.LJ(c1135810ff9.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1137430fhl
    public final void LIZ(C1135810ff9 c1135810ff9) throws JSONException {
        Long lValueOf;
        long jLIZIZ;
        InterfaceC1136220ffo interfaceC1136220ffo;
        C1135850ffD c1135850ffD;
        GiftMessage giftMessage;
        List<GiftMessage.SponsorshipInfo> list;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComboEnd ");
        C1135810ff9 c1135810ff9LJII = null;
        if (c1135810ff9 != null && (giftMessage = c1135810ff9.LIZ) != null && (list = giftMessage.sponsorshipInfo) != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) != null) {
            lValueOf = Long.valueOf(sponsorshipInfo.sponsorId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C1133910fc5.LJI("LiveGiftTrayDisplayController", C2188811AlT.LIZIZ(sbLIZ));
        C1135810ff9 c1135810ff92 = this.LJIIIZ;
        if (c1135810ff92 != null && (c1135850ffD = c1135810ff92.LJJJJIZL) != null) {
            c1135850ffD.LJI("trayLastComboEnd");
        }
        if (c1135810ff9 != null && c1135810ff9.LJIIJ > 1 && (LJI(c1135810ff9) || C1132700fa8.LJIIIZ(c1135810ff9))) {
            LJIJ(c1135810ff9);
        }
        C1135810ff9 c1135810ff93 = this.LJIIIZ;
        if (c1135810ff93 != null && c1135810ff93.LJIIIZ - c1135810ff93.LJIIJ > 0) {
            if (LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
                C1135810ff9 c1135810ff94 = this.LJIIIZ;
                if (c1135810ff94 != null && !c1135810ff94.LJJJLIIL) {
                    C1133690fbj.LIZ.getClass();
                    if (!C1133690fbj.LJ(c1135810ff94)) {
                        C1135930ffL c1135930ffL = this.LJIIIIZZ;
                        if (c1135930ffL != null && (interfaceC1136220ffo = c1135930ffL.LIZIZ) != null) {
                            jLIZIZ = interfaceC1136220ffo.LIZIZ();
                        } else {
                            jLIZIZ = 0;
                        }
                        if (jLIZIZ != this.LJIJJLI) {
                            this.LJIJJLI = jLIZIZ;
                            AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 707);
                            C1135810ff9 c1135810ff95 = this.LJIIIZ;
                            if (c1135810ff95 == null) {
                                awS596S0100000_17.invoke(Boolean.FALSE);
                                return;
                            }
                            C1135930ffL c1135930ffL2 = this.LJIIIIZZ;
                            if (c1135930ffL2 != null) {
                                AwS226S0300000_17 awS226S0300000_17 = new AwS226S0300000_17(this, c1135810ff95, awS596S0100000_17, 21);
                                C1135810ff9 c1135810ff96 = this.LJIIIZ;
                                if (c1135810ff96 == null) {
                                    awS226S0300000_17.invoke(null);
                                    return;
                                }
                                if (!c1135930ffL2.LJFF()) {
                                    awS226S0300000_17.invoke(c1135930ffL2.LIZIZ(this));
                                    return;
                                }
                                ArrayList<C1135940ffM> arrayList = c1135930ffL2.LIZJ;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<C1135940ffM> it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    C1135810ff9 c1135810ff97 = it2.next().LJIIIZ;
                                    if (c1135810ff97 != null) {
                                        arrayList2.add(c1135810ff97);
                                    }
                                }
                                InterfaceC1136220ffo interfaceC1136220ffo2 = c1135930ffL2.LIZIZ;
                                if (interfaceC1136220ffo2 != null) {
                                    interfaceC1136220ffo2.LJIIL(arrayList2, new AwS226S0300000_17(c1135930ffL2, this, awS226S0300000_17, 22), c1135810ff96.LJJJLIIL);
                                    return;
                                } else {
                                    awS226S0300000_17.invoke(null);
                                    return;
                                }
                            }
                            awS596S0100000_17.invoke(Boolean.FALSE);
                            return;
                        }
                    }
                }
                LJIIJ();
                return;
            }
            if (LJFF()) {
                return;
            }
            LJIIJ();
            return;
        }
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue()) {
            C1135930ffL c1135930ffL3 = this.LJIIIIZZ;
            if (c1135930ffL3 != null) {
                c1135930ffL3.LJIIIIZZ(new C1136320ffy(this.LJIIIZ, "onComboEnd"), new AwS383S0200000_17(this, c1135810ff9, 127));
                return;
            } else {
                LJIILLIIL(null, c1135810ff9);
                return;
            }
        }
        C1135930ffL c1135930ffL4 = this.LJIIIIZZ;
        if (c1135930ffL4 != null) {
            c1135810ff9LJII = c1135930ffL4.LJII(new C1136320ffy(this.LJIIIZ, "onComboEnd"));
        }
        LJIILLIIL(c1135810ff9LJII, c1135810ff9);
    }

    @Override // X.InterfaceC1137430fhl
    public final void LIZIZ(C1135810ff9 c1135810ff9) {
        C1133910fc5.LJI("LiveGiftTrayDisplayController", "onFirstGiftEnd");
        LJIILJJIL(c1135810ff9);
    }

    @Override // X.InterfaceC1137430fhl
    public final void LJ(final C1135810ff9 c1135810ff9) {
        C1136990fh3 c1136990fh3;
        final int iLIZIZ;
        final int iLIZJ;
        User.EnigmaInfo enigmaInfo;
        C1133910fc5.LJI("LiveGiftTrayDisplayController", "onEnterEnd");
        if (LJI(c1135810ff9)) {
            LJIJ(c1135810ff9);
        } else if (c1135810ff9 != null && c1135810ff9.LJII == 3 && c1135810ff9.LJIIJ == 1 && (c1136990fh3 = this.LJIIJ) != null) {
            c1136990fh3.getView();
            HandlerHook.viewPostDelay(c1136990fh3, this.LJJII, this.LJIIZILJ);
        }
        C1104160eq6 c1104160eq6 = this.LJIJI;
        if (c1104160eq6 != null) {
            c1104160eq6.LIZ();
        }
        if (c1135810ff9 != null) {
            c1135810ff9.LJJJJIZL.LJI("trayShow");
            C1104160eq6 c1104160eq62 = this.LJIJI;
            if (c1104160eq62 != null) {
                iLIZIZ = c1104160eq62.LIZIZ();
            } else {
                iLIZIZ = 0;
            }
            C1104160eq6 c1104160eq63 = this.LJIJI;
            if (c1104160eq63 != null) {
                iLIZJ = c1104160eq63.LIZJ();
            } else {
                iLIZJ = 0;
            }
            final DataChannel dataChannel = this.LJIIL;
            final boolean z = c1135810ff9.LJJJJI;
            long id = 0;
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAsyncReportEvent()) {
                final long jLIZ = C158B.LIZ();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                Map<Integer, String> map = C1138350fjF.LIZ;
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01LX(0L, new Runnable() { // from class: X.0fgf
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveGiftTrayMonitor@9148.onTrayEnterEnd$1");
                        try {
                            C1135790ff7.LJIIJJI(c1135810ff9, false, iLIZIZ, iLIZJ, dataChannel, z, jLIZ, jCurrentTimeMillis);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveGiftTrayMonitor@9148.onTrayEnterEnd$1");
                    }
                }, null), 2);
            } else {
                C1135790ff7.LJIIJJI(c1135810ff9, false, iLIZIZ, iLIZJ, dataChannel, z, C158B.LIZ(), System.currentTimeMillis());
            }
            c1135810ff9.LJJJJI = true;
            User user = c1135810ff9.LJJJJZI;
            if (user != null && (enigmaInfo = user.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn) {
                IInteractService iInteractService = C1128450fTH.LIZ;
                if (user != null) {
                    id = user.getId();
                }
                C1128450fTH.LIZ.Pq2(id, false);
            }
            if (C1135870ffF.LJIILJJIL(Integer.valueOf(c1135810ff9.LJI))) {
                C1136460fgC.LJIJ(C1136460fgC.LIZ, c1135810ff9.LJIIZILJ, null, C158B.LIZ(), 2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    public final void LJIIIIZZ(C1135810ff9 c1135810ff9) {
        boolean z;
        GiftMessage giftMessage;
        ?? arrayList;
        GiftRandomEffectInfo giftRandomEffectInfo;
        List<Long> list;
        List<GiftColorInfo> list2;
        List<GiftColorInfo> list3;
        Gift.CrossScreenEffectInfo crossScreenEffectInfo;
        Room room;
        boolean z2;
        GiftMessage giftMessage2;
        long skipGiftMsgDelayInMs;
        c1135810ff9.LJJIJIL = this.LJIILJJIL;
        this.LJIIIZ = c1135810ff9;
        c1135810ff9.LJJJJIZL.LJI("trayMsgAssign");
        GiftReceiveFlowFluencyOptSetting giftReceiveFlowFluencyOptSetting = GiftReceiveFlowFluencyOptSetting.INSTANCE;
        if (giftReceiveFlowFluencyOptSetting.getSkipGiftMsgInBackground() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            GiftMessage giftMessage3 = c1135810ff9.LIZ;
            if (!C1135800ff8.LJJII() && !C1135800ff8.LJJIII() && !C1135800ff8.LJJIIZ(giftMessage3)) {
                LJIL(EnumC1136300ffw.JUMPING);
                C1131800fYg.LIZ.getClass();
                if (C1131800fYg.LIZIZ()) {
                    skipGiftMsgDelayInMs = giftReceiveFlowFluencyOptSetting.getSkipGiftMsgDelayInMs() / ((long) 2);
                } else {
                    skipGiftMsgDelayInMs = giftReceiveFlowFluencyOptSetting.getSkipGiftMsgDelayInMs();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("consumeMessageInIdleState skip msg when app in background, message=");
                sbLIZ.append(c1135810ff9);
                C1133910fc5.LJI("LiveGiftTrayDisplayController", C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJLIIL(skipGiftMsgDelayInMs, C473410IhP.LIZ(), new ARunnableS117S0100000_17(this, 304));
                return;
            }
        }
        if (C176600m4.LIZIZ((Boolean) DataChannelGlobal.LLILZ.gg0(GameLiveIsBackgroundData.class)) && GameStopBackgroundAnimationSetting.INSTANCE.getValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Game is Background! don't consume message, message=");
            sbLIZ2.append(c1135810ff9);
            C1133910fc5.LJI("LiveGiftTrayDisplayController", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        C1135810ff9 c1135810ff92 = this.LJIIIZ;
        c1133690fbj.getClass();
        if (C1133690fbj.LJFF(c1135810ff92) && C1133680fbi.LIZLLL(c1135810ff9.LIZ) && !c1135810ff9.LJJI) {
            LJIL(EnumC1136300ffw.JUMPING);
            if (C468250IXv.LIZ(this.LJIIL)) {
                C1135790ff7.LJIIIIZZ(this.LJIIIZ, EnumC1133520fbS.PAID_ROOM_BLOCK, EnumC1136250ffr.SHOW);
            } else {
                C1133910fc5.LJI("LiveGiftTrayDisplayController", "playForVideoGift");
                LJJ(this.LIZ + 2);
                this.LIZIZ = true;
                this.LIZJ = true;
                DataChannel dataChannel = this.LJIIL;
                if (dataChannel != null) {
                    dataChannel.LC0(NormalGiftDisplayForVideoEvent.class, Boolean.FALSE);
                }
                C1135810ff9 c1135810ff93 = this.LJIIIZ;
                if (c1135810ff93 != null && c1135810ff93.LJII == 4) {
                    z = true;
                } else {
                    z = false;
                }
                User owner = null;
                if (z) {
                    C1133910fc5.LJI("LiveGiftTrayDisplayController", "flymic, MP4 play");
                    C1135810ff9 c1135810ff94 = this.LJIIIZ;
                    if (c1135810ff94 != null && (giftMessage2 = c1135810ff94.LIZ) != null && giftMessage2.flyingMicResourcesV2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    FlyMicGiftPhase2ConfigSetting flyMicGiftPhase2ConfigSetting = FlyMicGiftPhase2ConfigSetting.INSTANCE;
                    boolean zIsInExperiment = flyMicGiftPhase2ConfigSetting.getValue().isInExperiment();
                    boolean shouldUseNewStrat = flyMicGiftPhase2ConfigSetting.getValue().getShouldUseNewStrat();
                    if (z2 && zIsInExperiment && shouldUseNewStrat) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("flymic, Started render of fly mic resources ");
                        sbLIZ3.append(System.currentTimeMillis());
                        C1133910fc5.LJI("LiveGiftTrayDisplayController", C2188811AlT.LIZIZ(sbLIZ3));
                        C1136990fh3 c1136990fh3 = this.LJIIJ;
                        if (c1136990fh3 != null) {
                            c1136990fh3.getView();
                            HandlerHook.viewPost(c1136990fh3, this.LJJII);
                        }
                    } else {
                        C1136990fh3 c1136990fh32 = this.LJIIJ;
                        if (c1136990fh32 != null) {
                            c1136990fh32.getView();
                            HandlerHook.viewPostDelay(c1136990fh32, this.LJJII, this.LJIJ);
                        }
                    }
                }
                C1135810ff9 c1135810ff95 = this.LJIIIZ;
                if (c1135810ff95 != null && (giftMessage = c1135810ff95.LIZ) != null) {
                    C1135280feI c1135280feILIZJ = c1135810ff95.LJJLIIJ;
                    if (c1135280feILIZJ == null) {
                        DataChannel dataChannel2 = this.LJIIL;
                        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                            owner = room.getOwner();
                        }
                        c1135280feILIZJ = C1135260feG.LIZJ(giftMessage, owner);
                    }
                    if (c1135280feILIZJ == null) {
                        arrayList = C13BV.INSTANCE;
                    } else if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
                        Set setLIZLLL = C1136430fg9.LIZLLL(giftMessage, c1135280feILIZJ);
                        arrayList = new ArrayList();
                        for (Object obj : setLIZLLL) {
                            long jLongValue = ((Number) obj).longValue();
                            if (jLongValue > 0 && C1138640fji.LIZLLL(jLongValue) == null) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                        long j = c1135280feILIZJ.LJFF;
                        if (j > 0 && C1138640fji.LIZLLL(j) == null) {
                            arrayList.add(Long.valueOf(c1135280feILIZJ.LJFF));
                        }
                        Gift gift = giftMessage.mGift;
                        if (gift != null && (crossScreenEffectInfo = gift.crossScreenEffectInfo) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(crossScreenEffectInfo.singleActionEffectIds.keySet());
                            arrayList2.addAll(crossScreenEffectInfo.actionEffectIds.keySet());
                            arrayList2.addAll(crossScreenEffectInfo.reactionEffectIds.keySet());
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : arrayList2) {
                                if (C1138640fji.LIZLLL(((Number) obj2).longValue()) == null) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList.addAll(arrayList3);
                        }
                        Gift gift2 = giftMessage.mGift;
                        if (gift2 != null && (list2 = gift2.colorInfos) != null && (!list2.isEmpty())) {
                            Gift gift3 = giftMessage.mGift;
                            if (gift3 != null && (list3 = gift3.colorInfos) != null) {
                                for (GiftColorInfo giftColorInfo : list3) {
                                    Long l = giftColorInfo.colorEffectId;
                                    if (l != null && C1138640fji.LIZLLL(l.longValue()) == null) {
                                        arrayList.add(giftColorInfo.colorEffectId);
                                    }
                                }
                            }
                        } else {
                            Gift gift4 = giftMessage.mGift;
                            if (gift4 != null && gift4.isRandomGift && (giftRandomEffectInfo = gift4.randomEffectInfo) != null && (list = giftRandomEffectInfo.effectIds) != null && (!list.isEmpty())) {
                                Iterator<Long> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    long jLongValue2 = it2.next().longValue();
                                    if (C1138640fji.LIZLLL(jLongValue2) == null) {
                                        arrayList.add(Long.valueOf(jLongValue2));
                                    }
                                }
                            }
                        }
                        Iterator<Long> it3 = C1136040ffW.LIZIZ(giftMessage).iterator();
                        while (it3.hasNext()) {
                            long jLongValue3 = it3.next().longValue();
                            if (C1138640fji.LIZLLL(jLongValue3) == null) {
                                arrayList.add(Long.valueOf(jLongValue3));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C1133450fbL.LIZ(new ArrayList((Collection) arrayList), new AwS561S0100000_17(this, 655), new AwS561S0100000_17(this, 656));
                    } else {
                        LJIIZILJ();
                    }
                }
            }
        }
        if (LJJI(c1135810ff9)) {
            LJIILIIL();
        }
    }

    public final void LJIIIZ(C1135810ff9 c1135810ff9) {
        c1135810ff9.LJJIJIL = this.LJIILJJIL;
        C1136990fh3 c1136990fh3 = this.LJIIJ;
        if (c1136990fh3 != null) {
            c1136990fh3.getView();
            HandlerHook.viewRemoveCallbacks(c1136990fh3, this.LJJIFFI);
        }
        LJIL(EnumC1136300ffw.JUMPING);
        EnumC743790TFp enumC743790TFp = c1135810ff9.LJIIIIZZ;
        if (enumC743790TFp != EnumC743790TFp.VIDEO_ONLY && enumC743790TFp != EnumC743790TFp.TRAY_ONLY) {
            C1134980fdo.LIZ.LIZ++;
        }
        C1135810ff9 c1135810ff92 = this.LJIIIZ;
        if (c1135810ff92 != null) {
            c1135810ff92.LJ(c1135810ff9);
        }
        C1135810ff9 c1135810ff93 = this.LJIIIZ;
        if (c1135810ff93 != null && LiveGiftHammerSetting.INSTANCE.isEnabled()) {
            c1135810ff93.LJJII.addAll(c1135810ff9.LJJII);
        }
        C1135810ff9 c1135810ff94 = this.LJIIIZ;
        if (c1135810ff94 != null) {
            C1133690fbj.LIZ.getClass();
            C1133690fbj.LJIIIIZZ(c1135810ff94, c1135810ff9);
        }
        C1135810ff9 c1135810ff95 = this.LJIIIZ;
        if (c1135810ff95 != null) {
            c1135810ff95.LJIIIZ = c1135810ff9.LJIIIZ;
            c1135810ff95.LIZ(c1135810ff9.LJJJJ);
        }
        C1135810ff9 c1135810ff96 = this.LJIIIZ;
        if (c1135810ff96 != null) {
            c1135810ff96.LIZIZ(LJIJJLI(c1135810ff96));
        }
        LJII();
    }

    public final void LJIILJJIL(C1135810ff9 c1135810ff9) {
        int i;
        C1133910fc5.LJI("LiveGiftTrayDisplayController", "exitTray");
        if (c1135810ff9 != null) {
            i = c1135810ff9.LJJJLZIJ;
        } else {
            i = 0;
        }
        long jLJFF = C1135990ffR.LJFF(i, c1135810ff9);
        if (jLJFF == 0) {
            this.LJJIFFI.run();
        } else {
            C1136990fh3 c1136990fh3 = this.LJIIJ;
            if (c1136990fh3 != null) {
                c1136990fh3.getView();
                HandlerHook.viewPostDelay(c1136990fh3, this.LJJIFFI, jLJFF);
            }
        }
        C1135930ffL c1135930ffL = this.LJIIIIZZ;
        if (c1135930ffL != null) {
            C1135950ffN c1135950ffN = c1135930ffL.LJIIJJI;
            c1135950ffN.LJI++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onExitTray latest(");
            sbLIZ.append(c1135950ffN.LJI);
            sbLIZ.append(')');
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bb A[PHI: r17 r29
      0x01bb: PHI (r17v2 int) = (r17v1 int), (r17v4 int) binds: [B:105:0x01b7, B:47:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r29v1 com.bytedance.android.live.base.model.ImageModel) = (r29v0 com.bytedance.android.live.base.model.ImageModel), (r29v4 com.bytedance.android.live.base.model.ImageModel) binds: [B:105:0x01b7, B:47:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.C1135810ff9 r36) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135940ffM.LJIJ(X.0ff9):void");
    }

    public final AbstractC1137620fi4 LJIJJLI(C1135810ff9 c1135810ff9) {
        int i;
        List<MsgStair> list;
        Object obj;
        if (this.LJIILLIIL.LIZ && LiveExtendedScreenGiftOptimizeSetting.INSTANCE.jumpGiftTrayCombo()) {
            return C1137630fi5.LIZ;
        }
        if (C1135980ffQ.LJIIJ()) {
            boolean z = c1135810ff9.LJJJLIIL;
            if (z) {
                i = c1135810ff9.LJIILJJIL;
            } else {
                i = c1135810ff9.LJIILIIL;
            }
            boolean z2 = c1135810ff9.LJJJLL;
            if (!C1135980ffQ.LJIIJ()) {
                return new C1137610fi3(1);
            }
            TrayComboConfig trayComboConfig = C1135980ffQ.LIZJ(z, z2)._trayComboConfig;
            String str = trayComboConfig._comboType;
            if (u.LJIJI(str, "jump", true)) {
                return C1137630fi5.LIZ;
            }
            if (u.LJIJI(str, "dynamic", true)) {
                if (z) {
                    list = C1135980ffQ.LIZLLL()._selfQueueStairs;
                } else {
                    list = C1135980ffQ.LIZLLL()._otherQueueStairs;
                }
                int iLIZ = C1135980ffQ.LIZ(i, list);
                List<Integer> list2 = trayComboConfig._jumpInterval;
                if (iLIZ >= 0 && iLIZ < list2.size()) {
                    obj = ListProtector.get(list2, iLIZ);
                } else {
                    obj = -2;
                }
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue > 0) {
                    return new C1137610fi3(iIntValue);
                }
                if (iIntValue == -1) {
                    return C1137630fi5.LIZ;
                }
                return new C1137610fi3(1);
            }
            return new C1137610fi3(1);
        }
        return new C1137610fi3(1);
    }

    public final void LJIL(EnumC1136300ffw enumC1136300ffw) {
        this.LJFF = enumC1136300ffw;
        this.LJI.setValue(enumC1136300ffw);
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            c1135810ff9.LJJJJJ = this.LIZ;
            c1135810ff9.LJJJJJL = this.LJFF.toString();
        }
    }

    public final void LJJ(int i) {
        this.LIZ = i;
        C1135810ff9 c1135810ff9 = this.LJIIIZ;
        if (c1135810ff9 != null) {
            c1135810ff9.LJJJJJ = i;
            c1135810ff9.LJJJJJL = this.LJFF.toString();
        }
    }

    public final void LJIILLIIL(C1135810ff9 c1135810ff9, C1135810ff9 c1135810ff92) {
        C1135850ffD c1135850ffD;
        if (c1135810ff9 != null) {
            C1135810ff9 c1135810ff93 = this.LJIIIZ;
            if (c1135810ff93 != null) {
                c1135810ff93.LJ(c1135810ff9);
            }
            C1135810ff9 c1135810ff94 = this.LJIIIZ;
            if (c1135810ff94 != null && LiveGiftHammerSetting.INSTANCE.isEnabled()) {
                c1135810ff94.LJJII.addAll(c1135810ff9.LJJII);
            }
            C1135810ff9 c1135810ff95 = this.LJIIIZ;
            if (c1135810ff95 != null) {
                C1133690fbj.LIZ.getClass();
                C1133690fbj.LJIIIIZZ(c1135810ff95, c1135810ff9);
            }
            C1135810ff9 c1135810ff96 = this.LJIIIZ;
            if (c1135810ff96 != null) {
                c1135810ff96.LJIIIZ = c1135810ff9.LJIIIZ;
                c1135810ff96.LIZ(c1135810ff9.LJJJJ);
            }
            if (!LiveGiftReceivingRefactorSetting.INSTANCE.isOptComboEnd() && LJFF()) {
                return;
            }
            EnumC743790TFp enumC743790TFp = c1135810ff9.LJIIIIZZ;
            if (enumC743790TFp != EnumC743790TFp.VIDEO_ONLY && enumC743790TFp != EnumC743790TFp.TRAY_ONLY) {
                C1134980fdo.LIZ.LIZ++;
            }
            C1135810ff9 c1135810ff97 = this.LJIIIZ;
            if (c1135810ff97 != null) {
                c1135810ff97.LIZIZ(LJIJJLI(c1135810ff97));
            }
            LJII();
            return;
        }
        LJIL(EnumC1136300ffw.WAITING);
        C1135810ff9 c1135810ff98 = this.LJIIIZ;
        if (c1135810ff98 != null && (c1135850ffD = c1135810ff98.LJJJJIZL) != null) {
            c1135850ffD.LJI("trayLastEnterWaiting");
        }
        LJIILJJIL(c1135810ff92);
    }
}
