package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.test;

import X.AbstractC20356314kz;
import X.C01EI;
import X.C01FQ;
import X.C1AZW;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C2188811AlT;
import X.C259800zU;
import X.C500260Jjc;
import X.C766270U4b;
import X.C937280aUw;
import X.C946060aj6;
import X.InterfaceC20354714kj;
import X.InterfaceC302601Fg;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.model.LiveShowConfig;
import com.bytedance.android.livesdk.model.LiveShowEntryClickEvent;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes16.dex */
public final class TestNewLiveShowEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("test_liveshow_new_version", 1, 39600000, 0, null, null, 32760);

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        if (C01FQ.LIZ() != null) {
            return true;
        }
        return false;
    }

    public final boolean LJJLIIIJ(Object obj) {
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        LiveShowConfig liveShowConfig = (LiveShowConfig) C937280aUw.LIZJ(LiveShowConfig.class, c20424814w2.LJII, new LiveShowConfig());
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Duration: ");
        sbLIZ.append((int) (liveShowConfig.durationPerGuest / ((long) 60)));
        sbLIZ.append(" Mins");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Interval: ");
        sbLIZ2.append(liveShowConfig.transitionDurationOfConfig);
        sbLIZ2.append('s');
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        arrayList.add("Info: [This is a mock new version feature for test]");
        return new C20361314ln("new Live Show", "new Live Show", R.attr.e11, R.attr.e11, arrayList, null, i, null, false, null, 3968);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        ShowConfig showConfig = null;
        if (LJJLIIIJ(null)) {
            C1AZW.LJIILL(C01EI.LIZ(245, this.LLJJJJJIL.LIZ), "toastOnGoing", null, null);
            C766270U4b.LIZLLL(2131854098);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 340));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            if (!LJJLIIIJ(null)) {
                LiveShowConfig liveShowConfig = (LiveShowConfig) C937280aUw.LIZJ(LiveShowConfig.class, c20361214lm.LJI, new LiveShowConfig());
                showConfig = new ShowConfig();
                showConfig.durationPerGuest = liveShowConfig.durationPerGuest;
                showConfig.allowOpenMicFreely = liveShowConfig.allowOpenMicFreely;
                showConfig.transitionDurationOfConfig = liveShowConfig.transitionDurationOfConfig;
            }
            dataChannel.LC0(LiveShowEntryClickEvent.class, new C946060aj6(showConfig, str3, new AwS293S0300000_15(this, (TestNewLiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 11), null, new AwS559S0100000_15(this, 341), new AwS224S0300000_15(this, (TestNewLiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 28), new AwS224S0300000_15(this, (TestNewLiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 29), new AwS224S0300000_15(this, (TestNewLiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 30), false, null, null, null, 15896));
        }
    }
}
