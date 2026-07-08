package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VZF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZF extends AbstractC799790VYz implements Handler.Callback {
    public final LegoHandler LL = new LegoHandler(this);

    public final void LIZLLL() {
        C799900VZk.LIZ.getClass();
        C799880VZi c799880VZi = C799900VZk.LIZIZ;
        EnumC799870VZh enumC799870VZh = EnumC799870VZh.IDLE;
        c799880VZi.LJFF(enumC799870VZh);
        C0CCZ c0cczLIZJ = c799880VZi.LIZJ(enumC799870VZh);
        if (c0cczLIZJ == null) {
            return;
        }
        ExecutorService executorServiceLIZLLL = C799570VYd.LIZLLL(c0cczLIZJ, true);
        int i = C799570VYd.LJIILJJIL;
        C799570VYd.LJIILJJIL = i + 1;
        executorServiceLIZLLL.execute(new C0VZG(c0cczLIZJ, this, i));
    }

    public C0VZF() {
        C786410Ut5.f3(new C854660Xfs(this, 1), Looper.myQueue());
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        LIZLLL();
        return true;
    }
}
