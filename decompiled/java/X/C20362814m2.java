package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14m2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20362814m2 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20362614m0 LL;
    public final /* synthetic */ C1868250yiV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20362814m2(C20362614m0 c20362614m0, C1868250yiV c1868250yiV) {
        super(1);
        this.LL = c20362614m0;
        this.LLILLJJLI = c1868250yiV;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        DataChannel dataChannel = this.LL.LL;
        if (dataChannel != null) {
            C20366014mY.LIZ(dataChannel, this.LLILLJJLI.LIZIZ, "live_center_item_view");
        }
        C20379114of value = this.LL.LLILLJJLI.LLILZ.getValue();
        if (value != null) {
            String strLIZ = C20362914m3.LIZ(this.LLILLJJLI.LIZ);
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C20362614m0 c20362614m0 = this.LL;
            DataChannel dataChannel2 = c20362614m0.LL;
            int i = this.LLILLJJLI.LIZIZ;
            Playbook playbook = value.LIZ;
            C978360bZC.LJIILJJIL(dataChannel2, "click", strLIZ, i, playbook.playbookId, c20362614m0.LLILLJJLI.zQ2(playbook), "normal", value.LIZ, null, false, 1536);
        }
        return Unit.LIZ;
    }
}
