package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZ2 extends AbstractC799790VYz implements Handler.Callback {
    public final LegoHandler LL = new LegoHandler(this);
    public boolean LLILLJJLI;

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
        this.LLILLJJLI = true;
        LIZLLL();
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJI() {
        this.LLILLJJLI = false;
    }

    public final void LIZLLL() {
        if (!this.LLILLJJLI || this.LL.hasMessages(1201)) {
            return;
        }
        LegoHandler legoHandler = this.LL;
        C799900VZk.LIZ.getClass();
        legoHandler.LJFF(1201, C799900VZk.LJFF().LIZIZ());
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
            C799880VZi c799880VZi = C799900VZk.LIZIZ;
            EnumC799870VZh enumC799870VZh = EnumC799870VZh.BOOT_FINISH;
            c799880VZi.LJFF(enumC799870VZh);
            C0CCZ c0cczLIZJ = c799880VZi.LIZJ(enumC799870VZh);
            if (c0cczLIZJ != null) {
                ExecutorService executorServiceLIZLLL = C799570VYd.LIZLLL(c0cczLIZJ, true);
                int i = C799570VYd.LJIILJJIL;
                C799570VYd.LJIILJJIL = i + 1;
                executorServiceLIZLLL.execute(new C0VZ4(c0cczLIZJ, this, i));
            }
        }
        return true;
    }
}
