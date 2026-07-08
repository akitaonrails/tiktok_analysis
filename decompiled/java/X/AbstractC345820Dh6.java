package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0Dh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC345820Dh6<T> extends CountDownLatch implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public T LL;
    public Throwable LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public volatile boolean LLILZ;

    public AbstractC345820Dh6() {
        super(1);
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZ = true;
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    public final T LIZ() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                dispose();
                throw C11QG.LIZIZ(e);
            }
        }
        Throwable th = this.LLILLJJLI;
        if (th == null) {
            return this.LL;
        }
        throw C11QG.LIZIZ(th);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        countDown();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLL = interfaceC420801kM;
        if (this.LLILZ) {
            interfaceC420801kM.dispose();
        }
    }
}
