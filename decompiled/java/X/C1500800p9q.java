package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.retrofit2.RequestBuilder;
import java.io.IOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0p9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500800p9q<T> implements C09SW<T> {
    public final /* synthetic */ InterfaceC594300NSq LL;
    public final /* synthetic */ C1500780p9o LLILLJJLI;

    @Override // X.C09SW
    public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
        InterfaceC594300NSq interfaceC594300NSq = this.LL;
        if (interfaceC594300NSq instanceof C09SW) {
            ((C09SW) interfaceC594300NSq).onAsyncPreRequest(requestBuilder);
        }
    }

    public C1500800p9q(C1500780p9o c1500780p9o, InterfaceC594300NSq interfaceC594300NSq) {
        this.LLILLJJLI = c1500780p9o;
        this.LL = interfaceC594300NSq;
    }

    @Override // X.C09SW
    public final void onAsyncResponse(C0X9S<T> c0x9s, C0X52<T> c0x52) {
        InterfaceC594300NSq interfaceC594300NSq = this.LL;
        if (interfaceC594300NSq instanceof C09SW) {
            ((C09SW) interfaceC594300NSq).onAsyncResponse(c0x9s, c0x52);
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<T> c0x9s, Throwable th) {
        this.LLILLJJLI.LL.execute(new ARunnableS92S0200000_23(th, this, 15));
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<T> c0x9s, final C0X52<T> c0x52) {
        this.LLILLJJLI.LL.execute(new Runnable() { // from class: X.0p9p
            public final void LIZ() {
                if (this.LLILLJJLI.LLILLJJLI.LLILLJJLI.isCanceled()) {
                    C1500800p9q c1500800p9q = this.LLILLJJLI;
                    c1500800p9q.LL.onFailure(c1500800p9q.LLILLJJLI, new IOException("Canceled"));
                } else {
                    C1500800p9q c1500800p9q2 = this.LLILLJJLI;
                    c1500800p9q2.LL.onResponse(c1500800p9q2.LLILLJJLI, c0x52);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExecutorCallAdapterFactory$ExecutorCallbackCall@d965.enqueue$1$onResponse$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExecutorCallAdapterFactory$ExecutorCallbackCall@d965.enqueue$1$onResponse$1");
            }
        });
    }
}
