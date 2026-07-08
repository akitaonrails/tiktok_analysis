package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701780uO0 extends C11RO {
    public final Handler LIZIZ;
    public final boolean LIZJ = false;

    @Override // X.C11RO
    public final C11RN LIZ() {
        final Handler handler = this.LIZIZ;
        final boolean z = this.LIZJ;
        return new C11RN(handler, z) { // from class: X.0uNz
            public final Handler LL;
            public final boolean LLILLJJLI;
            public volatile boolean LLILLL;

            @Override // X.InterfaceC420801kM
            public final void dispose() {
                this.LLILLL = true;
                this.LL.removeCallbacksAndMessages(this);
            }

            @Override // X.InterfaceC420801kM
            public final boolean isDisposed() {
                return this.LLILLL;
            }

            {
                this.LL = handler;
                this.LLILLJJLI = z;
            }

            @Override // X.C11RN
            public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
                if (runnable != null) {
                    if (timeUnit != null) {
                        if (this.LLILLL) {
                            return C11JT.INSTANCE;
                        }
                        Handler handler2 = this.LL;
                        RunnableC1701790uO1 runnableC1701790uO1 = new RunnableC1701790uO1(handler2, runnable);
                        Message messageObtain = Message.obtain(handler2, runnableC1701790uO1);
                        messageObtain.obj = this;
                        if (this.LLILLJJLI) {
                            messageObtain.setAsynchronous(true);
                        }
                        C786410Ut5.LJLJLJ(this.LL, messageObtain, timeUnit.toMillis(j));
                        if (this.LLILLL) {
                            this.LL.removeCallbacks(runnableC1701790uO1);
                            return C11JT.INSTANCE;
                        }
                        return runnableC1701790uO1;
                    }
                    throw new NullPointerException("unit == null");
                }
                throw new NullPointerException("run == null");
            }
        };
    }

    public C1701780uO0(BPEAHandler bPEAHandler) {
        this.LIZIZ = bPEAHandler;
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                Handler handler = this.LIZIZ;
                RunnableC1701790uO1 runnableC1701790uO1 = new RunnableC1701790uO1(handler, runnable);
                Message messageObtain = Message.obtain(handler, runnableC1701790uO1);
                if (this.LIZJ) {
                    messageObtain.setAsynchronous(true);
                }
                C786410Ut5.LJLJLJ(this.LIZIZ, messageObtain, timeUnit.toMillis(j));
                return runnableC1701790uO1;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
