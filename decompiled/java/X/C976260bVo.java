package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLynxTwoMatchInviteePanelUrlSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;

/* JADX INFO: renamed from: X.0bVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976260bVo extends AbstractC970950bNF {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final LinkMicBattleMessage LLIZ;
    public final List<C954460awe> LLIZLLLIL;
    public final List<C954460awe> LLJ;
    public final InterfaceC1631620sYq<List<C954460awe>, List<C954460awe>, EnumC919170a1j, Unit> LLJI;
    public final Function0<Unit> LLJIJIL;
    public final Function1<Boolean, Unit> LLJILJIL;
    public final Function1<EnumC976390bW1, Unit> LLJILJILJ;
    public final Function1<EnumC976390bW1, Unit> LLJILLL;
    public final Function0<Unit> LLJJ;
    public AnonymousClass0956 LLJJI;
    public final String LLJJIII = LiveCoHostLynxTwoMatchInviteePanelUrlSetting.INSTANCE.getValue();

    @Override // X.AbstractC970950bNF
    public final List<String> LJLLLL() {
        return C1697810uHb.LJIIJJI("match_invitee_panel_on_ready", "match_invitee_accept_invitation", "match_invitee_reject_invitation");
    }

    @Override // X.AbstractC970950bNF
    public final String LJLLLLLL() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC970950bNF, X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        super.LJJZ(interfaceC1541990qEH);
        this.LLJJI = null;
    }

    @Override // X.AbstractC970950bNF
    public final void LJLZ(SparkContext sparkContext) {
        this.LLJJI = C01KE.LIZIZ(C817503Hh.LL, new C976270bVp(this, null));
    }

    @Override // X.AbstractC970950bNF, X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int i;
        EnumC976390bW1 enumC976390bW1;
        InterfaceC1871820yoG interfaceC1871820yoG;
        int i2;
        InterfaceC1871820yoG interfaceC1871820yoG2;
        InterfaceC1871820yoG interfaceC1871820yoG3;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        Integer numValueOf = null;
        int iAsInt = 0;
        zAsBoolean = false;
        boolean zAsBoolean = false;
        iAsInt = 0;
        if (iHashCode != -2051933380) {
            if (iHashCode != -791732485) {
                if (iHashCode == 250474035 && str.equals("match_invitee_accept_invitation")) {
                    LinkMicBattleMessage linkMicBattleMessage = this.LLIZ;
                    BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                    if (battleSetting != null) {
                        i2 = battleSetting.inviteType;
                    } else {
                        i2 = 0;
                    }
                    long j = linkMicBattleMessage.actionByUserId;
                    if (battleSetting != null) {
                        numValueOf = Integer.valueOf((int) battleSetting.sourceType);
                    }
                    C957550b1d.LIZ(this.LLIZ.leagueInfoMap, i2, j, numValueOf);
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null && (interfaceC1871820yoG3 = interfaceC1107590evd.get("success")) != null && interfaceC1871820yoG3.asBoolean()) {
                        this.LLJIJIL.invoke();
                        return;
                    }
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null && (interfaceC1871820yoG2 = interfaceC1107590evd2.get("isBattleInvalid")) != null) {
                        zAsBoolean = interfaceC1871820yoG2.asBoolean();
                    }
                    this.LLJILJIL.invoke(Boolean.valueOf(zAsBoolean));
                    return;
                }
                return;
            }
            if (!str.equals("match_invitee_panel_on_ready")) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveJsEvent: INIT_FE_TO_NATIVE_EVENT, onFallbackJob:");
            sbLIZ.append(this.LLJJI);
            C20441214yg.LJIIIZ("LynxPage", C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass0956 anonymousClass0956 = this.LLJJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJI.invoke(this.LLIZLLLIL, this.LLJ, EnumC919170a1j.MATCH_TYPE_1V1);
            return;
        }
        if (!str.equals("match_invitee_reject_invitation")) {
            return;
        }
        LinkMicBattleMessage linkMicBattleMessage2 = this.LLIZ;
        BattleSetting battleSetting2 = linkMicBattleMessage2.battleSetting;
        if (battleSetting2 != null) {
            i = battleSetting2.inviteType;
        } else {
            i = 0;
        }
        long j2 = linkMicBattleMessage2.actionByUserId;
        if (battleSetting2 != null) {
            numValueOf = Integer.valueOf((int) battleSetting2.sourceType);
        }
        C957550b1d.LIZIZ(this.LLIZ.leagueInfoMap, i, j2, numValueOf);
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null && (interfaceC1871820yoG = interfaceC1107590evd3.get("reason")) != null) {
            iAsInt = interfaceC1871820yoG.asInt();
        }
        Function1<EnumC976390bW1, Unit> function1 = this.LLJILJILJ;
        EnumC976390bW1.Companion.getClass();
        if (iAsInt == 0 || iAsInt != 1) {
            enumC976390bW1 = EnumC976390bW1.TIME_OUT;
        } else {
            enumC976390bW1 = EnumC976390bW1.DECLINE_BUTTON;
        }
        function1.invoke(enumC976390bW1);
    }

    public static void LJZI(int i, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("panel_type", "invite"), new Pair("sub_match_type", "1v1"), new Pair("match_connect_type", "quick_match"), new Pair("fallback_reason", String.valueOf(i)), new Pair("fallback_detail", str));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_match_panel_lynx_fallback");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportLynxFallback: reason=");
        sbLIZ.append(i);
        sbLIZ.append(", detail=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LynxPage", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed: url=");
        sbLIZ.append(str);
        sbLIZ.append(", error=");
        sbLIZ.append(c1542120qEU.LIZIZ);
        C20441214yg.LJ("LynxPage", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        String str2 = c1542120qEU.LIZIZ;
        if (str2 == null) {
            str2 = "unknown_error";
        }
        LJZI(1, str2);
        this.LLJJ.invoke();
        AbstractC970950bNF.LJZ(this, "match_invitee_dismiss_invitation_panel", true);
    }

    public C976260bVo(LinkMicBattleMessage linkMicBattleMessage, List list, List list2, AwS664S0100000_15 awS664S0100000_15, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153, C976470bW9 c976470bW9) {
        this.LLIZ = linkMicBattleMessage;
        this.LLIZLLLIL = list;
        this.LLJ = list2;
        this.LLJI = awS664S0100000_15;
        this.LLJIJIL = awS559S0100000_15;
        this.LLJILJIL = awS594S0100000_15;
        this.LLJILJILJ = awS594S0100000_152;
        this.LLJILLL = awS594S0100000_153;
        this.LLJJ = c976470bW9;
    }
}
