package X;

import Y.ARunnableS82S0200000_13;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;

/* JADX INFO: renamed from: X.0VZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZ8 extends AbstractC799790VYz implements Handler.Callback {
    public boolean LL;
    public final LegoHandler LLILLJJLI = new LegoHandler(this);

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
        this.LL = true;
        this.LLILLJJLI.LJ(1206);
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJI() {
        this.LL = false;
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
        C799900VZk.LIZ.getClass();
        if (C799900VZk.LIZIZ.LIZ(EnumC799870VZh.APP_BACKGROUND) && this.LL) {
            this.LLILLJJLI.LJ(1206);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.LL) {
            C799900VZk.LIZ.getClass();
            C0CCZ c0cczLIZJ = C799900VZk.LIZIZ.LIZJ(EnumC799870VZh.APP_BACKGROUND);
            if (c0cczLIZJ != null) {
                C799570VYd.LJFF(c0cczLIZJ.serialExecute()).execute(new ARunnableS82S0200000_13(this, c0cczLIZJ, 12));
                return true;
            }
            return true;
        }
        return true;
    }
}
