package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363114m5 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20363214m6 LL;
    public final /* synthetic */ C20361214lm LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20363114m5(C20363214m6 c20363214m6, C20361214lm c20361214lm, int i) {
        super(1);
        this.LL = c20363214m6;
        this.LLILLJJLI = c20361214lm;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        DataChannel dataChannel = this.LL.LLILLL;
        if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
            playbookAnchorServiceV2LIZIZ.LJJJJJ(this.LLILLJJLI, this.LL.LLJI.getContext());
        }
        C20379114of value = this.LL.LLILLJJLI.LLILZ.getValue();
        if (value != null) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            DataChannel dataChannel2 = this.LL.LLILLL;
            C20361214lm c20361214lm = this.LLILLJJLI;
            String str = c20361214lm.LIZ;
            int i = this.LLILLL + 1;
            Playbook playbook = value.LIZ;
            C978360bZC.LJIILJJIL(dataChannel2, "apply", str, i, playbook.playbookId, true, "normal", playbook, c20361214lm.LIZLLL, false, 1536);
        }
        return Unit.LIZ;
    }
}
