package Y;

import X.C20441214yg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C915980Zwa;
import X.C950220apo;
import X.C955450ayF;
import X.C955590ayT;
import X.C956170azP;
import X.InterfaceC955990az7;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS42S0210000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0138 A[PHI: r9
      0x0138: PHI (r9v6 com.bytedance.android.live.base.model.user.User) = (r9v0 com.bytedance.android.live.base.model.user.User), (r9v7 com.bytedance.android.live.base.model.user.User) binds: [B:31:0x0066, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(Y.ACListenerS42S0210000_15 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS42S0210000_15.onClick$0(Y.ACListenerS42S0210000_15, android.view.View):void");
    }

    public static final void onClick$1(ACListenerS42S0210000_15 aCListenerS42S0210000_15, View view) {
        C20441214yg.LIZIZ("MultiHostLinkViewDelegate", "IMask clicked");
        DataChannel dataChannel = ((InterfaceC955990az7) aCListenerS42S0210000_15.l0).getDataChannel();
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841162));
            return;
        }
        if (aCListenerS42S0210000_15.z2) {
            C766270U4b.LIZLLL(2131851856);
            return;
        }
        if (!C915980Zwa.LJFF().mz1() && !C956170azP.LIZ(((InterfaceC955990az7) aCListenerS42S0210000_15.l0).getDataChannel())) {
            if (C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZIZ().JV1(false).isInProcess()))) {
                if (C915980Zwa.LIZ().kg2()) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851530));
                    return;
                } else {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851643));
                    return;
                }
            }
            if (C950220apo.LJIJ(C915980Zwa.LJII().LLILZLL(true).size(), 0)) {
                C766270U4b.LIZLLL(2131841237);
                return;
            }
            if (C950220apo.LJFF() == ((C955590ayT) aCListenerS42S0210000_15.l1).LJ.getOwnerUserId()) {
                C766270U4b.LIZLLL(2131855538);
                return;
            }
            C955450ayF c955450ayF = C955450ayF.LIZ;
            C955590ayT c955590ayT = (C955590ayT) aCListenerS42S0210000_15.l1;
            c955450ayF.getClass();
            if (!C955450ayF.LJFF(c955590ayT)) {
                return;
            }
            C766270U4b.LIZLLL(2131855539);
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842776));
    }

    public ACListenerS42S0210000_15(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.z2 = z;
        this.l1 = obj;
    }
}
