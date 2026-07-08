package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701830uO5 {
    public static final BPEAHandler LIZ;
    public static final C1701820uO4 LIZIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0uO4] */
    static {
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        LIZ = bPEAHandler;
        LIZIZ = new C11RO(bPEAHandler) { // from class: X.0uO4
            public final Handler LIZIZ;
            public final boolean LIZJ = false;

            @Override // X.C11RO
            public final C11RN LIZ() {
                return new C11RN(this.LIZIZ, this.LIZJ) { // from class: X.0uO3
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
                        boolean z;
                        if (this.LLILLL) {
                            return C11JT.INSTANCE;
                        }
                        C1701890uOB.LIZ(runnable, "run is null");
                        BPEAHandler bPEAHandler2 = C1701830uO5.LIZ;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Handler handler = this.LL;
                        RunnableC1701800uO2 runnableC1701800uO2 = new RunnableC1701800uO2(handler, runnable, z);
                        if (z) {
                            runnableC1701800uO2.run();
                            return runnableC1701800uO2;
                        }
                        Message messageObtain = Message.obtain(handler, runnableC1701800uO2);
                        messageObtain.obj = this;
                        if (this.LLILLJJLI) {
                            messageObtain.setAsynchronous(true);
                        }
                        C786410Ut5.LJLJLJ(this.LL, messageObtain, timeUnit.toMillis(j));
                        if (this.LLILLL) {
                            this.LL.removeCallbacks(runnableC1701800uO2);
                            return C11JT.INSTANCE;
                        }
                        return runnableC1701800uO2;
                    }
                };
            }

            {
                this.LIZIZ = bPEAHandler;
            }

            @Override // X.C11RO
            public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
                boolean z;
                C1701890uOB.LIZ(runnable, "run is null");
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                Handler handler = this.LIZIZ;
                RunnableC1701800uO2 runnableC1701800uO2 = new RunnableC1701800uO2(handler, runnable, z);
                if (z) {
                    runnableC1701800uO2.run();
                    return runnableC1701800uO2;
                }
                C786410Ut5.LJLIIL(timeUnit.toMillis(j), handler, runnableC1701800uO2);
                return runnableC1701800uO2;
            }
        };
    }
}
