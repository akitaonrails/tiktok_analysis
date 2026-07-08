package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDelayPunishCountdownChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleFilteredPunishQueueEmptyChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRawRankNoticeReceivedChannel;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdk.model.message.RankNoticeMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem$showLeagueScoreUpdate$1", f = "MatchCountDownAssem.kt", l = {}, m = "invokeSuspend")
public final class C20486215Ee extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MatchCountDownAssem LL;
    public final /* synthetic */ RankNoticeMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20486215Ee(MatchCountDownAssem matchCountDownAssem, RankNoticeMessage rankNoticeMessage, InterfaceC1364105Vn<? super C20486215Ee> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = matchCountDownAssem;
        this.LLILLJJLI = rankNoticeMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20486215Ee(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC20486315Ef enumC20486315Ef;
        long jLJJZ;
        DataChannel dataChannel;
        C1C7U.LIZ("MatchCountDownAssem@1efb.showLeagueScoreUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        if (!MatchCountDownAssem.op()) {
            C20441214yg.LIZIZ("MatchCountDownAssem", "showLeagueScoreUpdate skipped, not league countdown scene");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownAssem@1efb.showLeagueScoreUpdate$1");
            return unit;
        }
        MatchCountDownAssem matchCountDownAssem = this.LL;
        matchCountDownAssem.LLJL = true;
        DataChannel dataChannel2 = matchCountDownAssem.LLLFZ;
        if (dataChannel2 != null) {
            dataChannel2.zW(BattleRawRankNoticeReceivedChannel.class, true);
        }
        List<Text> listLIZIZ = C0113001f.LIZIZ(this.LLILLJJLI);
        DataChannel dataChannel3 = this.LL.LLLFZ;
        if (dataChannel3 != null) {
            dataChannel3.zW(BattleFilteredPunishQueueEmptyChannel.class, Boolean.valueOf(((ArrayList) listLIZIZ).isEmpty()));
        }
        MatchCountDownAssem matchCountDownAssem2 = this.LL;
        if (matchCountDownAssem2.LLJLL) {
            matchCountDownAssem2.ep("discard-after-punish-countdown", true, ((ArrayList) listLIZIZ).isEmpty());
            C20441214yg.LIZIZ("MatchCountDownAssem", "showLeagueScoreUpdate skipped, punish countdown already active");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownAssem@1efb.showLeagueScoreUpdate$1");
            return unit2;
        }
        if (matchCountDownAssem2.LLJJLIIIJLLLLLLLZ) {
            matchCountDownAssem2.ep("discard-late-message", false, ((ArrayList) listLIZIZ).isEmpty());
            C20441214yg.LIZIZ("MatchCountDownAssem", "showLeagueScoreUpdate skipped, display cycle active");
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownAssem@1efb.showLeagueScoreUpdate$1");
            return unit3;
        }
        matchCountDownAssem2.LLJJLIIIJLLLLLLLZ = true;
        ArrayList arrayList = (ArrayList) listLIZIZ;
        int size = arrayList.size();
        matchCountDownAssem2.LLJLLIL++;
        matchCountDownAssem2.LLJLLL = null;
        if (size == 0) {
            enumC20486315Ef = EnumC20486315Ef.LLILLL;
        } else {
            enumC20486315Ef = EnumC20486315Ef.LLILLJJLI;
        }
        matchCountDownAssem2.LLJZ = enumC20486315Ef;
        matchCountDownAssem2.LLJZIJLIL = size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start punish notice cycle, cycleId=");
        sbLIZ.append(matchCountDownAssem2.LLJLLIL);
        sbLIZ.append(", queueSize=");
        sbLIZ.append(size);
        C20441214yg.LJIIIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.isEmpty()) {
            this.LL.So();
            MatchCountDownAssem matchCountDownAssem3 = this.LL;
            matchCountDownAssem3.LLJLILLLLZIIL = true;
            matchCountDownAssem3.LLJLL = true;
            matchCountDownAssem3.LLJZ = EnumC20486315Ef.LLILZIL;
            matchCountDownAssem3.LLJLLL = C2286608xc.LJFF(matchCountDownAssem3.LLJLLIL);
            DataChannel dataChannel4 = this.LL.LLLFZ;
            if (dataChannel4 != null) {
                dataChannel4.zW(BattleDelayPunishCountdownChannel.class, false);
            }
            this.LL.hp(true);
            this.LL.ep("enter-punish-countdown-directly", true, true);
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJZ = interfaceC973730bRjYf2.LJJZ();
            } else {
                jLJJZ = 0;
            }
            if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) >= 0 && jLJJZ > 0 && (dataChannel = this.LL.LLLFZ) != null) {
                dataChannel.zW(BattlePunishTimeLeftChannel.class, C2286608xc.LJFF(jLJJZ));
            }
            this.LL.Vo(EnumC20486415Eg.LL);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownAssem@1efb.showLeagueScoreUpdate$1");
            return unit4;
        }
        MatchCountDownAssem matchCountDownAssem4 = this.LL;
        matchCountDownAssem4.LLJLILLLLZIIL = false;
        matchCountDownAssem4.LLJLL = false;
        DataChannel dataChannel5 = matchCountDownAssem4.LLLFZ;
        if (dataChannel5 != null) {
            dataChannel5.zW(BattleDelayPunishCountdownChannel.class, true);
        }
        this.LL.hp(false);
        MatchCountDownAssem matchCountDownAssem5 = this.LL;
        AnonymousClass0956 anonymousClass0956 = matchCountDownAssem5.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(matchCountDownAssem5);
        C1DFH c1dfh = C0PEM.LIZ;
        matchCountDownAssem5.LLJJL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C20486115Ed(listLIZIZ, matchCountDownAssem5, null), 2);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("MatchCountDownAssem@1efb.showLeagueScoreUpdate$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
