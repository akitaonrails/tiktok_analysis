package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20364114mF extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20366414mc LL;
    public final /* synthetic */ C20361214lm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20364114mF(C20366414mc c20366414mc, C20361214lm c20361214lm) {
        super(1);
        this.LL = c20366414mc;
        this.LLILLJJLI = c20361214lm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        Playbook playbook;
        DataChannel dataChannel = this.LL.LL;
        if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
            ActivePlaybook value = this.LL.LLILLJJLI.LLILLJJLI.getValue();
            if (value != null) {
                playbook = value.playbook;
            } else {
                playbook = null;
            }
            C20382814pG c20382814pG = new C20382814pG(0L, 0L, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1);
            c20382814pG.LJJIJ = true;
            playbookAnchorServiceV2LIZIZ.LJJJJLL(playbook, c20382814pG, this.LLILLJJLI, new C07S1());
        }
        C20379114of value2 = this.LL.LLILLJJLI.LLILZ.getValue();
        if (value2 != null) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C20366414mc c20366414mc = this.LL;
            DataChannel dataChannel2 = c20366414mc.LL;
            C20361214lm c20361214lm = this.LLILLJJLI;
            String str = c20361214lm.LIZ;
            c20366414mc.LLILLJJLI.getClass();
            int iEQ2 = 1 + BasePlaybookViewModel.EQ2(c20361214lm, value2);
            Playbook playbook2 = value2.LIZ;
            C978360bZC.LJIILJJIL(dataChannel2, "click", str, iEQ2, playbook2.playbookId, this.LL.LLILLJJLI.zQ2(playbook2), "normal", value2.LIZ, this.LLILLJJLI.LIZLLL, false, 1536);
        }
        return Unit.LIZ;
    }
}
