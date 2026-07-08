package X;

import Y.ARunnableS113S0100000_13;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;

/* JADX INFO: renamed from: X.0VZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799960VZq extends AbstractC800120Va6 implements Handler.Callback {
    public final LegoHandler LL = new LegoHandler(this);
    public boolean LLILLJJLI;

    @Override // X.AbstractC800120Va6, X.InterfaceC800100Va4
    public final void LJFF() {
        this.LL.LJFF(1200, 60000L);
    }

    @Override // X.InterfaceC800100Va4
    public final void LIZ(final InterfaceC800080Va2 interfaceC800080Va2) {
        C799570VYd.LJ(C0CO3.P0).execute(new Runnable() { // from class: X.0VZr
            public final void LIZ() {
                C0CO3 c0co3Type = ((InterfaceC800130Va7) interfaceC800080Va2).type();
                C799900VZk.LIZ.getClass();
                C799910VZl c799910VZl = C799900VZk.LIZJ;
                c799910VZl.LIZ(c0co3Type, (InterfaceC800130Va7) interfaceC800080Va2);
                C799960VZq c799960VZq = this;
                if (c799960VZq.LLILLJJLI && !c799960VZq.LL.hasMessages(1204) && c799910VZl.LIZIZ(C0CO3.IDLE)) {
                    this.LL.LJFF(1204, C799900VZk.LJFF().LJIILLIIL());
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ReqIdleTrigger@81ad.commit$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ReqIdleTrigger@81ad.commit$1");
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        InterfaceC800130Va7 interfaceC800130Va7LIZJ;
        this.LLILLJJLI = true;
        C799900VZk.LIZ.getClass();
        C799910VZl c799910VZl = C799900VZk.LIZJ;
        if (c799910VZl.LIZIZ(C0CO3.BOOT_FINISH)) {
            this.LL.LJFF(1204, C799900VZk.LJFF().LJIILLIIL());
        } else {
            C0CO3 c0co3 = C0CO3.IDLE;
            if (c799910VZl.LIZIZ(c0co3) && (interfaceC800130Va7LIZJ = c799910VZl.LIZJ(c0co3)) != null) {
                C799570VYd.LJ(c0co3).execute(new ARunnableS113S0100000_13(interfaceC800130Va7LIZJ, 29));
            }
            if (c799910VZl.LIZIZ(c0co3)) {
                this.LL.LJFF(1204, C799900VZk.LJFF().LJIILLIIL());
                return true;
            }
        }
        return true;
    }
}
