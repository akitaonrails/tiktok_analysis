package X;

import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0p9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500780p9o<T> implements C0X9S<T>, InterfaceC843230X6b {
    public final Executor LL;
    public final C0X9S<T> LLILLJJLI;

    @Override // X.C0X9S
    public final void cancel() {
        this.LLILLJJLI.cancel();
    }

    @Override // X.C0X9S
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final C0X9S<T> m55clone() {
        return new C1500780p9o(this.LL, this.LLILLJJLI.m55clone());
    }

    @Override // X.InterfaceC843230X6b
    public final void doCollect() {
        C0X9S<T> c0x9s = this.LLILLJJLI;
        if (c0x9s instanceof InterfaceC843230X6b) {
            ((InterfaceC843230X6b) c0x9s).doCollect();
        }
    }

    @Override // X.C0X9S
    public final C0X52 execute() {
        return this.LLILLJJLI.execute();
    }

    @Override // X.C0X9S
    public final boolean isCanceled() {
        return this.LLILLJJLI.isCanceled();
    }

    @Override // X.C0X9S
    public final boolean isExecuted() {
        return this.LLILLJJLI.isExecuted();
    }

    @Override // X.C0X9S
    public final Request request() {
        return this.LLILLJJLI.request();
    }

    @Override // X.C0X9S
    public final void enqueue(InterfaceC594300NSq<T> interfaceC594300NSq) {
        C2396109aB.LIZ(interfaceC594300NSq, "callback == null");
        this.LLILLJJLI.enqueue(new C1500800p9q(this, interfaceC594300NSq));
    }

    public C1500780p9o(Executor executor, C0X9S<T> c0x9s) {
        this.LL = executor;
        this.LLILLJJLI = c0x9s;
    }
}
