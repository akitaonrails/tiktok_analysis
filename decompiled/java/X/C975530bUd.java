package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975530bUd implements InterfaceC977420bXg, InterfaceC1141530foN {
    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
    }

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        C1548820qPI.LJIIIIZZ("match_effect_auto_trigger_turn_off", this);
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        if (LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable()) {
            C1548820qPI.LIZLLL("match_effect_auto_trigger_turn_off", this);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL;
        MatchSettingsInfo matchSettingsInfoLJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent:");
        sbLIZ.append(c262100zr.LIZ);
        C20441214yg.LIZIZ("LiveMatchBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c262100zr.LIZ, "match_effect_auto_trigger_turn_off") && (interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL()) != null && (matchSettingsInfoLJJ = interfaceC975810bV5LIZLLL.LJJ()) != null) {
            matchSettingsInfoLJJ.enableAutoIceShowdown = false;
        }
    }
}
