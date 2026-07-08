package X;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0pBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501740pBM<T> implements InterfaceC1501750pBN<T> {
    public final Executor LL;
    public final InterfaceC1501750pBN<T> LLILLJJLI;

    @Override // X.InterfaceC1501750pBN
    public final void cancel() {
        this.LLILLJJLI.cancel();
    }

    @Override // X.InterfaceC1501750pBN
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1501750pBN<T> m56clone() {
        return new C1501740pBM(this.LL, this.LLILLJJLI.m56clone());
    }

    @Override // X.InterfaceC1501750pBN
    public final C1500770p9n<T> execute() {
        return this.LLILLJJLI.execute();
    }

    @Override // X.InterfaceC1501750pBN
    public final boolean isCanceled() {
        return this.LLILLJJLI.isCanceled();
    }

    @Override // X.InterfaceC1501750pBN
    public final Request request() {
        return this.LLILLJJLI.request();
    }

    @Override // X.InterfaceC1501750pBN
    public final void LLIIIJ(InterfaceC1500240p8w<T> interfaceC1500240p8w) {
        this.LLILLJJLI.LLIIIJ(new C1501760pBO(this, interfaceC1500240p8w));
    }

    public C1501740pBM(Executor executor, InterfaceC1501750pBN<T> interfaceC1501750pBN) {
        this.LL = executor;
        this.LLILLJJLI = interfaceC1501750pBN;
    }
}
