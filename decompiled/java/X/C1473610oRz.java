package X;

import android.content.Context;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0oRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473610oRz extends C1473600oRy implements InterfaceC1471240oOA {
    public volatile boolean LLIZLLLIL;

    @Override // X.InterfaceC1471240oOA
    public final void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC1471240oOA
    public final void q3() {
    }

    @Override // X.InterfaceC1471240oOA
    public final void t3() {
    }

    @Override // X.InterfaceC1471240oOA
    public final void r3() {
        InterfaceC1473620oS0 interfaceC1473620oS0 = this.LLILZIL;
        if (interfaceC1473620oS0 != null) {
            interfaceC1473620oS0.r3();
        }
    }

    public final void LJ() {
        if (LIZ()) {
            C1471190oO5 c1471190oO5 = this.LLILLJJLI;
            if (c1471190oO5.LLJILJILJ) {
                if (!c1471190oO5.LIZLLL() || this.LLILLJJLI.LLJJIII) {
                    this.LLILLJJLI.LJIIJ();
                    LynxLog.i("AudioMediaView", "Did trigger VideoController play in AudioMediaView");
                    if (this.LLIZLLLIL) {
                        return;
                    }
                    this.LLIZLLLIL = true;
                }
            }
        }
    }

    public C1473610oRz(Context context) {
        super(context);
    }

    @Override // X.InterfaceC1471240oOA
    public final void s3(Runnable runnable) {
        runnable.run();
    }

    @Override // X.C1473600oRy
    public final void LIZLLL(C1471230oO9 c1471230oO9, InterfaceC1471260oOC interfaceC1471260oOC) {
        super.LIZLLL(c1471230oO9, interfaceC1471260oOC);
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5 != null) {
            c1471190oO5.LLJI = this;
        }
    }
}
