package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;

/* JADX INFO: renamed from: X.0VZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799950VZp extends AbstractC800120Va6 implements Handler.Callback {
    public final LegoHandler LL = new LegoHandler(this);
    public boolean LLILLJJLI;

    @Override // X.AbstractC800120Va6, X.InterfaceC800100Va4
    public final void LJFF() {
        this.LLILLJJLI = true;
        LegoHandler legoHandler = this.LL;
        C799900VZk.LIZ.getClass();
        legoHandler.LJFF(1203, C799900VZk.LJFF().LJI());
    }

    @Override // X.InterfaceC800100Va4
    public final void LIZ(final InterfaceC800080Va2 interfaceC800080Va2) {
        C799570VYd.LJ(C0CO3.P0).execute(new Runnable() { // from class: X.0VZo
            public final void LIZ() {
                C0CO3 c0co3Type = ((InterfaceC800130Va7) interfaceC800080Va2).type();
                C799900VZk.LIZ.getClass();
                C799910VZl c799910VZl = C799900VZk.LIZJ;
                c799910VZl.LIZ(c0co3Type, (InterfaceC800130Va7) interfaceC800080Va2);
                C799950VZp c799950VZp = this;
                if (c799950VZp.LLILLJJLI && !c799950VZp.LL.hasMessages(1203) && c799910VZl.LIZIZ(C0CO3.BOOT_FINISH)) {
                    this.LL.LJFF(1203, C799900VZk.LJFF().LJI());
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ReqBootFinishTrigger@cd76.commit$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ReqBootFinishTrigger@cd76.commit$1");
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        final InterfaceC800130Va7 interfaceC800130Va7LIZJ;
        C799900VZk.LIZ.getClass();
        C799910VZl c799910VZl = C799900VZk.LIZJ;
        C0CO3 c0co3 = C0CO3.BOOT_FINISH;
        if (c799910VZl.LIZIZ(c0co3) && (interfaceC800130Va7LIZJ = c799910VZl.LIZJ(c0co3)) != null) {
            C799570VYd.LJ(c0co3).execute(new Runnable() { // from class: X.0VZt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ReqBootFinishTrigger@cd76.handleRequestBootFinish$1");
                    try {
                        C799900VZk.LIZ.getClass();
                        C799900VZk.LIZJ.LIZLLL(interfaceC800130Va7LIZJ, C0CP9.LIZIZ());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ReqBootFinishTrigger@cd76.handleRequestBootFinish$1");
                }
            });
        }
        if (c799910VZl.LIZIZ(c0co3)) {
            this.LL.LJFF(1203, C799900VZk.LJFF().LJI());
            return true;
        }
        return true;
    }
}
