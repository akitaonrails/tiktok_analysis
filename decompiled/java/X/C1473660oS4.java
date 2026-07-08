package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.WeakHandler;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0oS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473660oS4 extends AbstractC1473630oS1 {
    public final C1473610oRz LJFF;

    @Override // X.InterfaceC1491100ouC
    public final void LJIIL(FrameLayout frameLayout) {
    }

    @Override // X.InterfaceC1491100ouC
    public final void initialize() {
        this.LIZIZ = this.LJFF;
    }

    public C1473660oS4(Context context) {
        super(context);
        this.LJFF = new C1473610oRz(context);
    }

    @Override // X.InterfaceC1491100ouC
    public final void LIZJ(C1491120ouE c1491120ouE) {
        c1491120ouE.LIZ(3, null, 0, "requestPortraitFullScreen not supported");
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJFF(C1491120ouE c1491120ouE) {
        if (!this.LJFF.LIZIZ()) {
            if (c1491120ouE != null) {
                c1491120ouE.LIZ(7, null, -1, "player is not prepared");
            }
        } else {
            this.LJFF.LJ();
            if (c1491120ouE != null) {
                c1491120ouE.LIZ(0, null, 0, null);
            }
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJI(C1491120ouE c1491120ouE) {
        c1491120ouE.LIZ(3, null, 0, "exitFullScreen not supported");
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJII(InterfaceC1473700oS8 interfaceC1473700oS8) {
        C1473610oRz c1473610oRz = this.LJFF;
        if (!c1473610oRz.LIZ()) {
            LynxLog.i("AudioMediaView", "Failed to trigger prepare due to not properly initialized");
        } else if (c1473610oRz.LLIZLLLIL) {
            LynxLog.i("AudioMediaView", "Failed to trigger prepare due to already called");
        } else {
            c1473610oRz.LLILLJJLI.LJIILJJIL(false);
            LynxLog.i("AudioMediaView", "Did trigger VideoController prepare in AudioMediaView");
            if (!c1473610oRz.LLIZLLLIL) {
                c1473610oRz.LLIZLLLIL = true;
            }
        }
        if (interfaceC1473700oS8 != null) {
            interfaceC1473700oS8.LIZ(0, null, 0, null);
        }
        LynxLog.i("TTVideoEngineAudioPlayable", "Trigger prepare in MediaPlayable instance");
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIILJJIL(C1491120ouE c1491120ouE) {
        c1491120ouE.LIZ(3, null, 0, "enterFullScreen not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0323  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.lynx.react.bridge.ReadableMap] */
    /* JADX WARN: Type inference failed for: r2v35 */
    @Override // X.InterfaceC1491100ouC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.util.Map<java.lang.String, ? extends java.lang.Object> r29) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473660oS4.LJIILL(java.util.Map):void");
    }

    @Override // X.InterfaceC1491100ouC
    public final void LIZIZ(long j, boolean z, C1491120ouE c1491120ouE) {
        if (!this.LJFF.LIZIZ()) {
            c1491120ouE.LIZ(7, null, -1, "player is not prepared");
            return;
        }
        C1473610oRz c1473610oRz = this.LJFF;
        int i = (int) j;
        if (c1473610oRz.LIZ()) {
            C1471190oO5 c1471190oO5 = c1473610oRz.LLILLJJLI;
            if (c1471190oO5.LL != null) {
                WeakHandler weakHandler = c1471190oO5.LLJJIJIL;
                if (weakHandler != null) {
                    weakHandler.removeMessages(201);
                }
                c1471190oO5.LLJIJIL = i;
                c1471190oO5.LL.LJIJJLI(i, c1471190oO5.LLJJIJI);
            }
        }
        if (z) {
            this.LJFF.LJ();
        } else {
            this.LJFF.LIZJ();
        }
        c1491120ouE.LIZ(0, null, 0, null);
    }
}
