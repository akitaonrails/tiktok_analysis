package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0CN1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CN1 implements InterfaceC1006670cIr<C1602200rnO> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Runnable LLILLJJLI;
    public final /* synthetic */ Long LLILLL;

    @Override // X.InterfaceC1006670cIr
    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
        if (c1602200rnO2.LIZJ()) {
            C786410Ut5.LJLIIL(this.LLILLL.longValue(), new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0CN2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StartupStateUtils@39b4.runAfterFirstFeedCompletedInner$1$onStateChange$1");
                    try {
                        C0CN1 c0cn1 = this.LL;
                        if (c0cn1.LL) {
                            C0CN5.LJIIIIZZ(c0cn1.LLILLJJLI);
                        } else {
                            c0cn1.LLILLJJLI.run();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StartupStateUtils@39b4.runAfterFirstFeedCompletedInner$1$onStateChange$1");
                }
            });
            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
        }
    }

    public C0CN1(Long l, Runnable runnable, boolean z) {
        this.LL = z;
        this.LLILLJJLI = runnable;
        this.LLILLL = l;
    }
}
