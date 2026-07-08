package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.assem.arch.threadpool.AssemMainHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.086i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20630086i {
    public static final AssemMainHandler LIZ;
    public static final C095L LIZIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.095L] */
    static {
        final AssemMainHandler assemMainHandler = new AssemMainHandler(Looper.getMainLooper());
        LIZ = assemMainHandler;
        LIZIZ = new C11RO(assemMainHandler) { // from class: X.095L
            public final Handler LIZIZ;
            public final boolean LIZJ = false;

            @Override // X.C11RO
            public final C11RN LIZ() {
                final Handler handler = this.LIZIZ;
                final boolean z = this.LIZJ;
                return new C11RN(handler, z) { // from class: X.095M
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
                        if (this.LLILLL) {
                            return C11JT.INSTANCE;
                        }
                        C1701890uOB.LIZ(runnable, "run is null");
                        boolean zLIZ = C20630086i.LIZ();
                        Handler handler2 = this.LL;
                        C095K c095k = new C095K(handler2, runnable, zLIZ);
                        if (zLIZ) {
                            c095k.run();
                            return c095k;
                        }
                        Message messageObtain = Message.obtain(handler2, c095k);
                        messageObtain.obj = this;
                        if (this.LLILLJJLI) {
                            messageObtain.setAsynchronous(true);
                        }
                        C786410Ut5.LJLJLJ(this.LL, messageObtain, timeUnit.toMillis(j));
                        if (this.LLILLL) {
                            this.LL.removeCallbacks(c095k);
                            return C11JT.INSTANCE;
                        }
                        return c095k;
                    }
                };
            }

            {
                this.LIZIZ = assemMainHandler;
            }

            @Override // X.C11RO
            public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
                C1701890uOB.LIZ(runnable, "run is null");
                boolean zLIZ = C20630086i.LIZ();
                Handler handler = this.LIZIZ;
                C095K c095k = new C095K(handler, runnable, zLIZ);
                if (zLIZ) {
                    c095k.run();
                    return c095k;
                }
                C786410Ut5.LJLIIL(timeUnit.toMillis(j), handler, c095k);
                return c095k;
            }
        };
    }

    public static final boolean LIZ() {
        return C786410Ut5.u3() == Looper.getMainLooper().getThread();
    }
}
