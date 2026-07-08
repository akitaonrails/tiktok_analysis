package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.loader.content.ModernAsyncTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.13sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20147813sS<D> extends C20147913sT<D> {
    public final Executor LJIIIIZZ;
    public volatile AbstractC20147813sS<D>.a LJIIIZ;
    public volatile AbstractC20147813sS<D>.a LJIIJ;

    /* JADX INFO: renamed from: X.13sS$a */
    public final class a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        public final CountDownLatch LLJ = new CountDownLatch(1);

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AbstractC20147813sS.this.LJIIIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final Object LIZ(Void[] voidArr) {
            try {
                return AbstractC20147813sS.this.LJIIJ();
            } catch (C741250T5v e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLILZ.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void LIZIZ(D d) {
            try {
                AbstractC20147813sS abstractC20147813sS = AbstractC20147813sS.this;
                abstractC20147813sS.LJIIJJI(d);
                if (abstractC20147813sS.LJIIJ == this) {
                    if (abstractC20147813sS.LJII) {
                        abstractC20147813sS.LJ();
                    }
                    SystemClock.uptimeMillis();
                    abstractC20147813sS.LJIIJ = null;
                    abstractC20147813sS.LJIIIZ();
                }
                this.LLJ.countDown();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJ.countDown();
                throw th;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void LIZJ(D d) {
            try {
                AbstractC20147813sS abstractC20147813sS = AbstractC20147813sS.this;
                if (abstractC20147813sS.LJIIIZ != this) {
                    abstractC20147813sS.LJIIJJI(d);
                    if (abstractC20147813sS.LJIIJ == this) {
                        if (abstractC20147813sS.LJII) {
                            abstractC20147813sS.LJ();
                        }
                        SystemClock.uptimeMillis();
                        abstractC20147813sS.LJIIJ = null;
                        abstractC20147813sS.LJIIIZ();
                    }
                } else if (abstractC20147813sS.LJ) {
                    abstractC20147813sS.LJIIJJI(d);
                } else {
                    abstractC20147813sS.LJII = false;
                    SystemClock.uptimeMillis();
                    abstractC20147813sS.LJIIIZ = null;
                    abstractC20147813sS.LIZIZ(d);
                }
                this.LLJ.countDown();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJ.countDown();
                throw th;
            }
        }
    }

    public void LJIIIIZZ() {
    }

    public abstract D LJIIJ();

    public void LJIIJJI(D d) {
    }

    public final void LJIIIZ() {
        if (this.LJIIJ != null || this.LJIIIZ == null) {
            return;
        }
        this.LJIIIZ.getClass();
        AbstractC20147813sS<D>.a aVar = this.LJIIIZ;
        Executor executor = this.LJIIIIZZ;
        if (aVar.LLILLL == EnumC20147613sQ.PENDING) {
            aVar.LLILLL = EnumC20147613sQ.RUNNING;
            aVar.LL.LL = null;
            executor.execute(aVar.LLILLJJLI);
        } else {
            int i = C20147713sR.LIZ[aVar.LLILLL.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC20147813sS(Context context) {
        super(context);
        PThreadPoolExecutor pThreadPoolExecutor = ModernAsyncTask.LLILZLL;
        this.LJIIIIZZ = pThreadPoolExecutor;
    }

    @Override // X.C20147913sT
    public void LIZJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.LIZ);
        printWriter.print(" mListener=");
        printWriter.println(this.LIZIZ);
        if (this.LIZLLL || this.LJI || this.LJII) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.LIZLLL);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.LJI);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.LJII);
        }
        if (this.LJ || this.LJFF) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.LJ);
            printWriter.print(" mReset=");
            printWriter.println(this.LJFF);
        }
        if (this.LJIIIZ != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.LJIIIZ);
            printWriter.print(" waiting=");
            this.LJIIIZ.getClass();
            printWriter.println(false);
        }
        if (this.LJIIJ != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.LJIIJ);
            printWriter.print(" waiting=");
            this.LJIIJ.getClass();
            printWriter.println(false);
        }
    }
}
