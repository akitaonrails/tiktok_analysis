package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageSelectedDurationChangeEvent;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationSelectionEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972460bPg implements InterfaceC978740bZo {
    public final boolean LIZ;
    public final DataChannel LIZIZ;
    public final CompetitionModeChooseContract$View LIZJ;
    public final C410901il LIZLLL;
    public final Function1<EnumC919170a1j, Unit> LJ;
    public final String LJFF;
    public final InterfaceC950030apV LJI;
    public final InterfaceC952240at4 LJII;
    public final IInteractService LJIIIIZZ;

    @Override // X.InterfaceC978740bZo
    public final void LIZ() {
        C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLIIII;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
    }

    @Override // X.InterfaceC978740bZo
    public final C978700bZk LIZIZ() {
        boolean zIsEnabled = LiveCoHostTakeTheStageDurationSelectionEnableSetting.INSTANCE.isEnabled();
        if (zIsEnabled) {
            C973930bS3.LJIIIIZZ("show");
            C972470bPh.LIZLLL();
        }
        long jLIZIZ = zIsEnabled ? C972470bPh.LIZIZ(true) : 0L;
        boolean z = zIsEnabled && C968660bJY.LIZ();
        C978700bZk c978700bZk = new C978700bZk(C497740JfY.LJIJI(2131851751), !zIsEnabled ? C497740JfY.LJIJI(2131854923) : z ? LJ(jLIZIZ) : C497740JfY.LJIJI(2131856849), "ttlive_icon_competition_choose_mode_take_stage_v2.png", C497740JfY.LJIJI(2131854924), EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE, zIsEnabled, z, jLIZIZ, new AwS559S0100000_15(this, 585), new AwS559S0100000_15(this, 586), 608);
        if (zIsEnabled) {
            DataChannelGlobal.LLILZ.BQ2(this.LIZJ, this.LIZJ, TakeStageSelectedDurationChangeEvent.class, new AwS381S0200000_15(c978700bZk, this, 76));
        }
        return c978700bZk;
    }

    @Override // X.InterfaceC978740bZo
    public final boolean LIZJ() {
        return InterfaceC960800b6s.LLLIIII.LIZIZ().intValue() < 3;
    }

    @Override // X.InterfaceC978740bZo
    public final boolean LIZLLL() {
        return !LiveCoHostTakeTheStageDurationSelectionEnableSetting.INSTANCE.isEnabled();
    }

    @Override // X.InterfaceC978740bZo
    public final boolean shouldShow() {
        return (this.LIZ || Intrinsics.LJFF(this.LJFF, "playbook_match")) ? false : true;
    }

    @Override // X.InterfaceC978740bZo
    public final EnumC919170a1j LJIIIZ() {
        return EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
    }

    public static String LJ(long j) {
        return C497740JfY.LJIJJ(2131856713, C497740JfY.LJIJJ(2131856850, C972470bPh.LIZJ(j)));
    }

    public C972460bPg(boolean z, DataChannel dataChannel, CompetitionModeChooseContract$View competitionModeChooseContract$View, C410901il c410901il, AwS594S0100000_15 awS594S0100000_15, String str, IMultiHostService iMultiHostService, InterfaceC952240at4 interfaceC952240at4, IInteractService iInteractService) {
        this.LIZ = z;
        this.LIZIZ = dataChannel;
        this.LIZJ = competitionModeChooseContract$View;
        this.LIZLLL = c410901il;
        this.LJ = awS594S0100000_15;
        this.LJFF = str;
        this.LJI = iMultiHostService;
        this.LJII = interfaceC952240at4;
        this.LJIIIIZZ = iInteractService;
    }
}
