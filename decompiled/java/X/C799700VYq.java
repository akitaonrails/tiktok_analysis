package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;

/* JADX INFO: renamed from: X.0VYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799700VYq extends AbstractC799790VYz implements Handler.Callback {
    public final LegoHandler LL = new LegoHandler(this);

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJI() {
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
        C799900VZk.LIZ.getClass();
        if (C799900VZk.LIZIZ.LIZ(EnumC799870VZh.SPARSE) && !this.LL.hasMessages(1202)) {
            this.LL.LJ(1202);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C799900VZk.LIZ.getClass();
        C799880VZi c799880VZi = C799900VZk.LIZIZ;
        EnumC799870VZh enumC799870VZh = EnumC799870VZh.SPARSE;
        final C0CCZ c0cczLIZJ = c799880VZi.LIZJ(enumC799870VZh);
        if (c0cczLIZJ != null) {
            C799570VYd.LJFF(c0cczLIZJ.serialExecute()).execute(new Runnable() { // from class: X.0VYh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SparseTrigger@4eb.handleWorkSparse$1");
                    try {
                        C799900VZk.LIZ.getClass();
                        C799900VZk.LIZIZ.LJ(c0cczLIZJ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SparseTrigger@4eb.handleWorkSparse$1");
                }
            });
        }
        if (c799880VZi.LIZ(enumC799870VZh)) {
            this.LL.LJFF(1202, 50L);
            return true;
        }
        return true;
    }
}
