package X;

import com.bytedance.android.live.liveinteract.competition.game.event.GameScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageSettlementClockDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.MatchGameSeiInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982090bfD extends C982010bf5 implements InterfaceC983780bhw {
    @Override // X.InterfaceC983270bh7
    public final void LJJIIJZLJL(long j, long j2, long j3, int i, C982230bfR c982230bfR, C982370bff c982370bff) {
    }

    @Override // X.InterfaceC983270bh7
    public final void LJJIIZI(long j, String str, Function2<? super EnumC983140bgu, ? super Long, Unit> function2) {
    }

    @Override // X.InterfaceC983780bhw
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.C982010bf5, X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.C982010bf5, X.InterfaceC983920biA
    public final void LJIILL(C945320ahu c945320ahu) {
        MatchGameSeiInfo matchGameSeiInfo;
        int i;
        MatchGameSeiInfo matchGameSeiInfo2;
        String str;
        int i2;
        int i3;
        String str2 = null;
        int i4 = -10000;
        if (c945320ahu != null) {
            LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
            if (liveSeiStruct != null && (matchGameSeiInfo2 = liveSeiStruct.matchGameUpdateInfo) != null) {
                String str3 = matchGameSeiInfo2.linkMicId;
                C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJ());
                if (c954460aweLLILL != null) {
                    str = c954460aweLLILL.LJIIJJI;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str3, str)) {
                    i2 = (int) matchGameSeiInfo2.score;
                    i3 = -10000;
                } else {
                    i2 = -10000;
                    i3 = (int) matchGameSeiInfo2.score;
                }
                C982760bgI c982760bgI = new C982760bgI(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, i2, false, i3, false, null, matchGameSeiInfo2.createTime);
                DataChannel dataChannel = this.LIZLLL;
                if (dataChannel != null) {
                    dataChannel.zW(GameScoreUpdateChannel.class, c982760bgI);
                }
            }
            LiveSeiStruct liveSeiStruct2 = c945320ahu.LIZ;
            if (liveSeiStruct2 != null && (matchGameSeiInfo = liveSeiStruct2.matchGameFinalScore) != null) {
                String str4 = matchGameSeiInfo.linkMicId;
                C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(C950220apo.LJ());
                if (c954460aweLLILL2 != null) {
                    str2 = c954460aweLLILL2.LJIIJJI;
                }
                boolean zLJFF = Intrinsics.LJFF(str4, str2);
                if (zLJFF) {
                    i = (int) matchGameSeiInfo.score;
                } else {
                    i = -10000;
                    i4 = (int) matchGameSeiInfo.score;
                }
                C982760bgI c982760bgI2 = new C982760bgI(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, i, zLJFF, i4, !zLJFF, null, matchGameSeiInfo.createTime);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("score update from sei = isSelfFinalScore = ");
                sbLIZ.append(zLJFF);
                sbLIZ.append(" isRivalFinalSCore=  ");
                sbLIZ.append(!zLJFF);
                C20441214yg.LIZIZ("CatchBeansSettlementCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
                DataChannel dataChannel2 = this.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.zW(GameScoreUpdateChannel.class, c982760bgI2);
                }
            }
        }
    }

    public C982090bfD(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }

    @Override // X.C982010bf5, X.InterfaceC983130bgt
    public final void LJJIJL(C982460bfo c982460bfo, AbstractC982800bgM abstractC982800bgM, EnumC975850bV9 enumC975850bV9) {
        super.LJJIJL(c982460bfo, abstractC982800bgM, enumC975850bV9);
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.CQ2(GameScoreUpdateChannel.class, this, new AwS224S0300000_15(c013c, c013c2, this, 66));
        }
        EnumC962960bAM enumC962960bAM = LJJJJJ().LJIIIIZZ;
        EnumC982850bgR enumC982850bgR = EnumC982850bgR.SETTLEMENT;
        long jLJ = C950220apo.LJ();
        long audienceWaitingFinalScoreMaxDurationInSecs = LiveMatchBeansSettings.INSTANCE.getAudienceWaitingFinalScoreMaxDurationInSecs();
        long value = LJJJJJ().LJIIJ.LJII;
        if (value <= 0) {
            value = LiveCoHostTakeTheStageSettlementClockDurationSetting.INSTANCE.getValue();
        }
        C982320bfa.LIZ(enumC962960bAM, enumC982850bgR, jLJ, 0L, audienceWaitingFinalScoreMaxDurationInSecs + value, true, new AwS224S0300000_15(c013c, c013c2, this, 67), new AwS559S0100000_15(this, 1235));
    }
}
