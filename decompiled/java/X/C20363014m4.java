package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363014m4 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20366414mc LL;
    public final /* synthetic */ C20361214lm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20363014m4(C20366414mc c20366414mc, C20361214lm c20361214lm) {
        super(1);
        this.LL = c20366414mc;
        this.LLILLJJLI = c20361214lm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        DataChannel dataChannel = this.LL.LL;
        if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
            playbookAnchorServiceV2LIZIZ.LJJJJJ(this.LLILLJJLI, this.LL.itemView.getContext());
        }
        C20379114of value = this.LL.LLILLJJLI.LLILZ.getValue();
        if (value != null) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C20366414mc c20366414mc = this.LL;
            DataChannel dataChannel2 = c20366414mc.LL;
            C20361214lm c20361214lm = this.LLILLJJLI;
            String str = c20361214lm.LIZ;
            c20366414mc.LLILLJJLI.getClass();
            int iEQ2 = BasePlaybookViewModel.EQ2(c20361214lm, value) + 1;
            Playbook playbook = value.LIZ;
            C978360bZC.LJIILJJIL(dataChannel2, "apply", str, iEQ2, playbook.playbookId, true, "normal", playbook, this.LLILLJJLI.LIZLLL, false, 1536);
        }
        return Unit.LIZ;
    }
}
