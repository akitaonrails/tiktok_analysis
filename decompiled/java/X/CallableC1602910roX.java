package X;

import Y.AObjectS57S0000000_4;
import Y.AObjectS62S0000000_9;
import Y.AObjectS66S0000000_13;
import Y.AObjectS73S0000000_23;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0roX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class CallableC1602910roX implements Callable<Object> {
    public final /* synthetic */ FullFeedFragmentPanel LL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.startFpsMonitor$1");
        if (this.LL.LLILLL()) {
            C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.startFpsMonitor$1");
            return null;
        }
        final InterfaceC1602960roc interfaceC1602960rocLIZ = C585110MxB.LIZ(this.LL.LLLLIIIILLL.getEventType());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rest_");
        sbLIZ.append(this.LL.LLLLIIIILLL.getEventType());
        final InterfaceC1602960roc interfaceC1602960rocLIZ2 = C585110MxB.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        FullFeedFragmentPanel fullFeedFragmentPanel = this.LL;
        if (fullFeedFragmentPanel.LLJJIJI != null) {
            HandlerHook.viewPost(fullFeedFragmentPanel.LLJJIJI, new Runnable() { // from class: X.0roY
                public final void LIZ() {
                    if (this.LLILLL.LL.LLILLL()) {
                        return;
                    }
                    FullFeedFragmentPanel fullFeedFragmentPanel2 = this.LLILLL.LL;
                    if (fullFeedFragmentPanel2.LLJJIJI != null) {
                        InterfaceC1602960roc interfaceC1602960roc = interfaceC1602960rocLIZ2;
                        interfaceC1602960roc.LJIIJ(fullFeedFragmentPanel2.E);
                        interfaceC1602960roc.LJII(this.LLILLL.LL.LLJJIJI);
                        InterfaceC1602960roc interfaceC1602960roc2 = interfaceC1602960rocLIZ;
                        interfaceC1602960roc2.LJIIJ(this.LLILLL.LL.E);
                        interfaceC1602960roc2.LJFF(this.LLILLL.LL.LLJJIJI);
                        InterfaceC1602960roc interfaceC1602960roc3 = interfaceC1602960rocLIZ;
                        interfaceC1602960roc3.LIZLLL(this.LLILLL.LL.F);
                        interfaceC1602960roc3.LJ(this.LLILLL.LL.LLJJIJI, new AObjectS62S0000000_9(24), new AObjectS62S0000000_9(25), new AObjectS62S0000000_9(26));
                        interfaceC1602960rocLIZ.LJ(this.LLILLL.LL.LLJJIJI, new AObjectS73S0000000_23(14), new AObjectS66S0000000_13(5), new AObjectS57S0000000_4(3));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FullFeedFragmentPanel@9b2e.startFpsMonitor$1$call$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.startFpsMonitor$1$call$1");
                }
            });
        }
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.startFpsMonitor$1");
        return null;
    }

    public CallableC1602910roX(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.LL = fullFeedFragmentPanel;
    }
}
