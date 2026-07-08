package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;

/* JADX INFO: renamed from: X.0VZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZ9 extends AbstractC799790VYz implements Handler.Callback {
    public final LegoHandler LL = new LegoHandler(this);
    public boolean LLILLJJLI;

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
        this.LLILLJJLI = true;
        LIZLLL();
    }

    public final void LIZLLL() {
        if (!this.LLILLJJLI || this.LL.hasMessages(1210)) {
            return;
        }
        C799900VZk.LIZ.getClass();
        C799900VZk.LIZIZ.LJFF(EnumC799870VZh.FIRST_WINDOW_FOCUS);
        this.LL.LJ(1210);
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
        LIZLLL();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.LLILLJJLI) {
            C799900VZk.LIZ.getClass();
            final C0CCZ c0cczLIZJ = C799900VZk.LIZIZ.LIZJ(EnumC799870VZh.FIRST_WINDOW_FOCUS);
            if (c0cczLIZJ != null) {
                C799570VYd.LJFF(c0cczLIZJ.serialExecute()).execute(new Runnable() { // from class: X.0VZA
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FirstWindowFocusTrigger@8af7.handleWorkAppBackground$1");
                        try {
                            C799900VZk.LIZ.getClass();
                            C799900VZk.LIZIZ.LJ(c0cczLIZJ);
                            this.LIZLLL();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FirstWindowFocusTrigger@8af7.handleWorkAppBackground$1");
                    }
                });
                return true;
            }
            return true;
        }
        return true;
    }
}
