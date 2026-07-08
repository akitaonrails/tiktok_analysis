package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementFragment;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementPanelContract$AbsView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPlaybooksGuidanceSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS112S0400000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979560bb8 extends AbstractC979790bbV {
    public final DataChannel LLILLL;
    public final C979030baH LLILZ;
    public AwS559S0100000_15 LLILZIL;

    @Override // X.InterfaceC1844530y6F
    public final void Qp() {
    }

    @Override // X.InterfaceC204589153r
    public final void LJI() {
        C979030baH c979030baH = this.LLILZ;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1072);
        AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(441);
        C410901il c410901il = this.LLILLJJLI;
        c979030baH.getClass();
        C01GW c01gw = C973470bRJ.LIZ;
        C973470bRJ.LIZ(C915980Zwa.LJII().getChannelId(), new AwS112S0400000_15(aFwS203S0000000_15, c979030baH, c410901il, awS559S0100000_15, 0), new AwS594S0100000_15(aFwS203S0000000_15, 56), true);
    }

    @Override // X.AbstractC979790bbV
    public final void LJIIIZ() {
        ActivePlaybook activePlaybookLIZIZ;
        if (LiveMatchPlaybooksGuidanceSetting.INSTANCE.isEnabled()) {
            AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 1080);
            PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(this.LLILLL);
            if (playbookAnchorServiceV2LIZIZ != null && (activePlaybookLIZIZ = playbookAnchorServiceV2LIZIZ.LIZIZ()) != null) {
                Playbook playbook = activePlaybookLIZIZ.playbook;
                if (activePlaybookLIZIZ.playStatus == 1 && playbook != null) {
                    this.LLILZIL = null;
                    awS594S0100000_15.invoke(playbook);
                    return;
                }
            }
            this.LLILZIL = new AwS559S0100000_15(awS594S0100000_15, 1071);
            C786410Ut5.LJLIIL(800L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(this, 193));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void onCreate() {
        C979030baH.LIZLLL(this.LLILZ, 2);
        this.LLILLJJLI.clear();
        this.LLILZ.LIZJ(this.LLILLJJLI);
        LJIIIZ();
        MatchManagementPanelContract$AbsView matchManagementPanelContract$AbsView = (MatchManagementPanelContract$AbsView) this.LL;
        if (matchManagementPanelContract$AbsView != null) {
            matchManagementPanelContract$AbsView.PR();
        }
    }

    public C979560bb8(MatchManagementFragment matchManagementFragment, DataChannel dataChannel) {
        super(matchManagementFragment);
        this.LLILLL = dataChannel;
        this.LLILZ = new C979030baH();
    }
}
