package X;

import Y.AfS184S0100000_15;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC974680bTG implements InterfaceC465240IMg {
    public InterfaceC969600bL4 LL;
    public C11JF LLILLL;
    public C1699720uKg LLILZIL;
    public C974790bTR LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public LinkMicBattleArmiesMessage LLJIJIL;
    public LinkMicBattleArmiesMessage LLJILJIL;
    public boolean LLJILJILJ;
    public final C11NJ LLILLJJLI = new C11NJ();
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());

    public abstract void LIZJ(BattleInfoResponse battleInfoResponse);

    public abstract void LIZLLL(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract boolean LJI(BattleInfoResponse battleInfoResponse, int i);

    public abstract void LJII(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJIIJ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract void LJIIJJI();

    public abstract void LJIIL(LinkMicBattleItemCard linkMicBattleItemCard);

    public abstract void LJIILIIL(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJIILJJIL();

    public abstract void LJIILLIIL(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage);

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
    }

    public static long LJ() {
        long jMax;
        BattleSetting battleSetting = C973900bS0.LIZ.LIZLLL;
        if (battleSetting == null) {
            jMax = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            long jLIZ = MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled() ? C974520bT0.LIZ() : C158B.LIZIZ();
            if (jLIZ <= 0) {
                jLIZ = System.currentTimeMillis();
            }
            jMax = ((long) battleSetting.duration) - (Math.max(0L, jLIZ - battleSetting.startTimeMs) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", "getBattleRemainSecond, remainSecond  = " + jMax);
        return jMax;
    }

    public final void LIZ() {
        InterfaceC969670bLB interfaceC969670bLBLIZIZ;
        InterfaceC962060b8u interfaceC962060b8uLIZJ;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ2;
        InterfaceC962060b8u interfaceC962060b8uLIZJ2;
        C958950b3t c958950b3tLIZLLL;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ3;
        InterfaceC962060b8u interfaceC962060b8uLIZJ3;
        C958950b3t c958950b3tLIZLLL2;
        if (this.LL == null) {
            return;
        }
        C974460bSu c974460bSu = C973900bS0.LIZ;
        long jLJFF = 0;
        if (c974460bSu.LIZ() > 0 && !this.LLJILJILJ) {
            this.LLJILJILJ = true;
            this.LLJ--;
            InterfaceC969600bL4 interfaceC969600bL4 = this.LL;
            long j = (interfaceC969600bL4 == null || (interfaceC969670bLBLIZIZ3 = interfaceC969600bL4.LIZIZ()) == null || (interfaceC962060b8uLIZJ3 = interfaceC969670bLBLIZIZ3.LIZJ()) == null || (c958950b3tLIZLLL2 = interfaceC962060b8uLIZJ3.LIZLLL()) == null) ? 0L : c958950b3tLIZLLL2.LIZJ;
            InterfaceC969600bL4 interfaceC969600bL42 = this.LL;
            long j2 = (interfaceC969600bL42 == null || (interfaceC969670bLBLIZIZ2 = interfaceC969600bL42.LIZIZ()) == null || (interfaceC962060b8uLIZJ2 = interfaceC969670bLBLIZIZ2.LIZJ()) == null || (c958950b3tLIZLLL = interfaceC962060b8uLIZJ2.LIZLLL()) == null) ? 0L : c958950b3tLIZLLL.LIZIZ;
            InterfaceC969600bL4 interfaceC969600bL43 = this.LL;
            if (interfaceC969600bL43 != null && (interfaceC969670bLBLIZIZ = interfaceC969600bL43.LIZIZ()) != null && (interfaceC962060b8uLIZJ = interfaceC969670bLBLIZIZ.LIZJ()) != null) {
                jLJFF = interfaceC962060b8uLIZJ.LJFF();
            }
            long jLIZ = c974460bSu.LIZ();
            C480460Ism.LIZ().getClass();
            this.LLILLJJLI.LIZ(((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).getInfo(j, jLJFF, jLIZ, j2, EnumC970440bMQ.BATTLE_INFO_SCENE_TASK.getType()).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 160), new AfS184S0100000_15(this, 161)));
        }
    }

    public final DataChannel LJFF() {
        InterfaceC969670bLB interfaceC969670bLBLIZIZ;
        InterfaceC962060b8u interfaceC962060b8uLIZJ;
        InterfaceC969600bL4 interfaceC969600bL4 = this.LL;
        if (interfaceC969600bL4 == null || (interfaceC969670bLBLIZIZ = interfaceC969600bL4.LIZIZ()) == null || (interfaceC962060b8uLIZJ = interfaceC969670bLBLIZIZ.LIZJ()) == null) {
            return null;
        }
        return interfaceC962060b8uLIZJ.getDataChannel();
    }

    public final void LJIIIIZZ() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        LJIIJJI();
        C973900bS0.LIZ.getClass();
        C974790bTR c974790bTR = this.LLILZLL;
        if (c974790bTR != null) {
            c974790bTR.LIZ.LIZ();
        }
        C1699720uKg c1699720uKg = this.LLILZIL;
        if (c1699720uKg != null) {
            c1699720uKg.LIZ();
        }
        C973900bS0.LIZ("battle_end");
        this.LLILZ.removeCallbacksAndMessages(null);
    }

    public final void LJIIIZ() {
        InterfaceC969670bLB interfaceC969670bLBLIZIZ;
        C20478615Bg c20478615BgLIZLLL;
        C974460bSu c974460bSu = C973900bS0.LIZ;
        if (c974460bSu.LJI(EnumC964170bCJ.PUNISH_START, false)) {
            InterfaceC969600bL4 interfaceC969600bL4 = this.LL;
            if (interfaceC969600bL4 != null && (interfaceC969670bLBLIZIZ = interfaceC969600bL4.LIZIZ()) != null && (c20478615BgLIZLLL = interfaceC969670bLBLIZIZ.LIZLLL()) != null) {
                c20478615BgLIZLLL.LJFF("moveToPunish");
            }
            System.currentTimeMillis();
            long value = c974460bSu.LJII;
            if (value <= 0) {
                value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startPunishCountDown, timeSecond = ");
            sbLIZ.append(value);
            C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", C2188811AlT.LIZIZ(sbLIZ));
            if (value > 0) {
                LiveInteractBattlePunishDurationSetting liveInteractBattlePunishDurationSetting = LiveInteractBattlePunishDurationSetting.INSTANCE;
                if (value >= liveInteractBattlePunishDurationSetting.getValue()) {
                    value = liveInteractBattlePunishDurationSetting.getValue() - 1;
                }
                DataChannel dataChannelLJFF = LJFF();
                if (dataChannelLJFF != null) {
                    dataChannelLJFF.zW(BattlePunishTimeLeftChannel.class, Long.valueOf(value));
                }
                if (this.LLILZIL == null) {
                    this.LLILZIL = new C1699720uKg();
                }
                C1699720uKg c1699720uKg = this.LLILZIL;
                if (c1699720uKg != null) {
                    c1699720uKg.LIZ = new InterfaceC1699740uKi() { // from class: X.0bTM
                        @Override // X.InterfaceC1699740uKi
                        public final void LIZLLL() {
                            C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", "startPunishCountDown, finish");
                            DataChannel dataChannelLJFF2 = this.LIZ.LJFF();
                            if (dataChannelLJFF2 != null) {
                                dataChannelLJFF2.zW(BattlePunishTimeLeftChannel.class, 0L);
                            }
                            this.LIZ.LJIIIIZZ();
                        }

                        @Override // X.InterfaceC1699740uKi
                        public final void LJJI(long j) {
                            DataChannel dataChannelLJFF2 = this.LIZ.LJFF();
                            if (dataChannelLJFF2 != null) {
                                dataChannelLJFF2.zW(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
                            }
                        }
                    };
                    c1699720uKg.LIZIZ(value, 1000L);
                }
            }
        }
    }

    public final void LJIILL() {
        InterfaceC969670bLB interfaceC969670bLBLIZIZ;
        InterfaceC962060b8u interfaceC962060b8uLIZJ;
        DataChannel dataChannel;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ2;
        C969660bLA c969660bLALIZ;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ3;
        C15FA c15faLIZIZ;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ4;
        C20478615Bg c20478615BgLIZLLL;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ5;
        C962050b8t c962050b8t = new C962050b8t();
        InterfaceC969600bL4 interfaceC969600bL4 = this.LL;
        c962050b8t.LJIILL((interfaceC969600bL4 == null || (interfaceC969670bLBLIZIZ5 = interfaceC969600bL4.LIZIZ()) == null) ? null : interfaceC969670bLBLIZIZ5.LIZJ());
        c962050b8t.LJIILJJIL("match_widget_unload");
        LJIIIIZZ();
        InterfaceC969600bL4 interfaceC969600bL42 = this.LL;
        if (interfaceC969600bL42 != null && (interfaceC969670bLBLIZIZ4 = interfaceC969600bL42.LIZIZ()) != null && (c20478615BgLIZLLL = interfaceC969670bLBLIZIZ4.LIZLLL()) != null) {
            C20441214yg.LIZIZ("MatchFeedHealthDelegate", "onDestroy");
            DataChannel dataChannel2 = c20478615BgLIZLLL.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(c20478615BgLIZLLL);
            }
            c20478615BgLIZLLL.LIZ = null;
        }
        InterfaceC969600bL4 interfaceC969600bL43 = this.LL;
        if (interfaceC969600bL43 != null && (interfaceC969670bLBLIZIZ3 = interfaceC969600bL43.LIZIZ()) != null && (c15faLIZIZ = interfaceC969670bLBLIZIZ3.LIZIZ()) != null) {
            c15faLIZIZ.LIZIZ();
        }
        InterfaceC969600bL4 interfaceC969600bL44 = this.LL;
        if (interfaceC969600bL44 != null && (interfaceC969670bLBLIZIZ2 = interfaceC969600bL44.LIZIZ()) != null && (c969660bLALIZ = interfaceC969670bLBLIZIZ2.LIZ()) != null) {
            c969660bLALIZ.LIZ();
        }
        InterfaceC969600bL4 interfaceC969600bL45 = this.LL;
        if (interfaceC969600bL45 != null && (interfaceC969670bLBLIZIZ = interfaceC969600bL45.LIZIZ()) != null && (interfaceC962060b8uLIZJ = interfaceC969670bLBLIZIZ.LIZJ()) != null && (dataChannel = interfaceC962060b8uLIZJ.getDataChannel()) != null) {
            dataChannel.zQ2(this);
        }
        this.LLILZ.removeCallbacksAndMessages(null);
        this.LLILLJJLI.LJ();
        this.LL = null;
    }

    public static boolean LIZIZ(AbstractC974680bTG abstractC974680bTG, long j) {
        boolean z;
        abstractC974680bTG.getClass();
        if (j == C973900bS0.LIZ.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkBattleId, ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final void LJIIZILJ(long j, long j2, long j3) {
        Boolean boolValueOf;
        C11JF c11jf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleCountDown, timeSecond = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", C2188811AlT.LIZIZ(sbLIZ));
        long j4 = j3 + j2;
        long j5 = j + j4;
        if (j5 <= 0) {
            return;
        }
        C11JF c11jf2 = this.LLILLL;
        if (c11jf2 != null) {
            boolValueOf = Boolean.valueOf(c11jf2.isDisposed());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (c11jf = this.LLILLL) != null) {
            c11jf.dispose();
        }
        final C974800bTS c974800bTS = new C974800bTS(j5, j4);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BattleCountDown, realTimeSecond = ");
        sbLIZ2.append(j5);
        sbLIZ2.append(" addExtraTime = ");
        sbLIZ2.append(j2);
        sbLIZ2.append(" totalExtraTime = ");
        sbLIZ2.append(j4);
        sbLIZ2.append(" lastExtra = ");
        sbLIZ2.append(j3);
        C20441214yg.LIZIZ("MatchFeedViewDelegateAbs", C2188811AlT.LIZIZ(sbLIZ2));
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            if (this.LLILZLL == null) {
                this.LLILZLL = new C974790bTR();
            }
            this.LLJIJIL = null;
            C974790bTR c974790bTR = this.LLILZLL;
            if (c974790bTR != null) {
                InterfaceC1699740uKi interfaceC1699740uKi = new InterfaceC1699740uKi() { // from class: X.0bTP
                    @Override // X.InterfaceC1699740uKi
                    public final void LIZLLL() {
                        AbstractC974680bTG abstractC974680bTG = this.LIZ;
                        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = abstractC974680bTG.LLJIJIL;
                        if (linkMicBattleArmiesMessage == null || Intrinsics.LJFF(linkMicBattleArmiesMessage, abstractC974680bTG.LLJILJIL)) {
                            return;
                        }
                        abstractC974680bTG.LJIIJ(linkMicBattleArmiesMessage);
                    }

                    @Override // X.InterfaceC1699740uKi
                    public final void LJJI(long j6) {
                        AbstractC974680bTG abstractC974680bTG = this.LIZ;
                        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = abstractC974680bTG.LLJIJIL;
                        if (linkMicBattleArmiesMessage != null && !Intrinsics.LJFF(linkMicBattleArmiesMessage, abstractC974680bTG.LLJILJIL)) {
                            abstractC974680bTG.LJIIJ(linkMicBattleArmiesMessage);
                        }
                    }
                };
                c974790bTR.LIZ.LIZ();
                C1699720uKg c1699720uKg = c974790bTR.LIZ;
                c1699720uKg.LIZ = interfaceC1699740uKi;
                c1699720uKg.LIZIZ(j5, C20483515Dd.LIZ.LIZ());
            }
        }
        if (LiveInteractBattleDurationSetting.INSTANCE.getValue() == j && j2 == 0) {
            DataChannel dataChannelLJFF = LJFF();
            if (dataChannelLJFF != null) {
                dataChannelLJFF.zW(BattleTimeLeftChannel.class, new C974800bTS(j - 1, 0L));
            }
        } else {
            DataChannel dataChannelLJFF2 = LJFF();
            if (dataChannelLJFF2 != null) {
                dataChannelLJFF2.zW(BattleTimeLeftChannel.class, c974800bTS);
            }
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1699720uKg();
        }
        C1699720uKg c1699720uKg2 = this.LLILZIL;
        if (c1699720uKg2 != null) {
            c1699720uKg2.LIZ = new InterfaceC1699740uKi() { // from class: X.0bTK
                @Override // X.InterfaceC1699740uKi
                public final void LIZLLL() {
                    C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", "BattleCountDown, finish");
                    DataChannel dataChannelLJFF3 = this.LIZ.LJFF();
                    if (dataChannelLJFF3 != null) {
                        dataChannelLJFF3.zW(BattleTimeLeftChannel.class, C974800bTS.LIZ(c974800bTS, 0L));
                    }
                    C11O8 c11o8LJJJLZIJ = C11NZ.LJLJJLL(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ());
                    AbstractC974680bTG abstractC974680bTG = this.LIZ;
                    InterfaceC420801kM interfaceC420801kMLJJLL = c11o8LJJJLZIJ.LJJLL(new AfS184S0100000_15(abstractC974680bTG, 162), new AfS184S0100000_15(abstractC974680bTG, 163));
                    AbstractC974680bTG abstractC974680bTG2 = this.LIZ;
                    abstractC974680bTG2.LLILLL = (C11JF) interfaceC420801kMLJJLL;
                    abstractC974680bTG2.LLILLJJLI.LIZ(interfaceC420801kMLJJLL);
                }

                @Override // X.InterfaceC1699740uKi
                public final void LJJI(long j6) {
                    DataChannel dataChannelLJFF3 = this.LIZ.LJFF();
                    if (dataChannelLJFF3 != null) {
                        dataChannelLJFF3.zW(BattleTimeLeftChannel.class, C974800bTS.LIZ(c974800bTS, j6));
                    }
                }
            };
            c1699720uKg2.LIZIZ(j5, 1000L);
        }
    }
}
