package X;

import Y.ARunnableS112S0100000_12;
import Y.AcS110S1100000_12;
import android.app.Activity;
import android.os.HandlerThread;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780930UkF {
    public final DataChannel LIZ;
    public C780940UkG LIZIZ;

    public final void LIZ() {
        BPEAHandler bPEAHandler;
        C780940UkG c780940UkG = this.LIZIZ;
        if (c780940UkG != null) {
            C780970UkJ c780970UkJ = c780940UkG.LJ;
            if (c780970UkJ != null) {
                C476250Ilz.LIZ.getClass();
                C09QK.LIZ(c780970UkJ);
            }
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = c780940UkG.LIZLLL;
            if (aRunnableS112S0100000_12 != null && (bPEAHandler = c780940UkG.LIZJ) != null) {
                bPEAHandler.removeCallbacks(aRunnableS112S0100000_12);
            }
            C780960UkI c780960UkI = c780940UkG.LJIIIIZZ;
            if (c780960UkI != null) {
                ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Bs0().LJII(c780960UkI);
            }
            BPEAHandler bPEAHandler2 = c780940UkG.LIZJ;
            if (bPEAHandler2 != null) {
                bPEAHandler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = c780940UkG.LIZIZ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            c780940UkG.LJFF.LIZ.clear();
            c780940UkG.LJI.LIZ.clear();
            c780940UkG.LJII.LIZ.clear();
            c780940UkG.LIZLLL = null;
            c780940UkG.LJ = null;
            c780940UkG.LJIIIIZZ = null;
            c780940UkG.LIZIZ = null;
            c780940UkG.LIZJ = null;
        }
    }

    public C780930UkF(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZJ(String str) {
        boolean z;
        String strLJIJI;
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
            z = false;
        } else {
            z = true;
        }
        boolean zO1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1();
        if (z) {
            strLJIJI = C497740JfY.LJIJI(2131855731);
        } else if (zO1) {
            strLJIJI = C497740JfY.LJIJI(2131855733);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131855732);
        }
        Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
        if (topActivity == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(topActivity);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131855735);
        c782110Um9.LJIIIZ(strLJIJI);
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131855734), new AcS110S1100000_12(this, str, 5));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131855730), new AcS110S1100000_12(this, str, 6));
        C786410Ut5.E4(c782110Um9.LIZ());
        LIZIZ("show", str);
    }

    public static void LIZIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_restart_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str2, "panel_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }
}
