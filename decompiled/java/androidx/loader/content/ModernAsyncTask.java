package androidx.loader.content;

import X.AbstractCallableC20147413sO;
import X.C20147213sM;
import X.C20147313sN;
import X.C20147513sP;
import X.EnumC20147613sQ;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.loader.content.ModernAsyncTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes31.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final PThreadPoolExecutor LLILZLL;
    public static InternalHandler LLIZ;
    public static volatile PThreadPoolExecutor LLIZLLLIL;
    public final C20147313sN LL;
    public final C20147213sM LLILLJJLI;
    public volatile EnumC20147613sQ LLILLL = EnumC20147613sQ.PENDING;
    public final AtomicBoolean LLILZ = new AtomicBoolean();
    public final AtomicBoolean LLILZIL = new AtomicBoolean();

    public abstract Result LIZ(Params... paramsArr);

    public void LIZIZ(Result result) {
    }

    public void LIZJ(Result result) {
    }

    public static class InternalHandler extends Handler {
        public InternalHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C20147513sP c20147513sP = (C20147513sP) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    c20147513sP.LIZ.getClass();
                }
            } else {
                ModernAsyncTask modernAsyncTask = c20147513sP.LIZ;
                Object obj = c20147513sP.LIZIZ[0];
                if (modernAsyncTask.LLILZ.get()) {
                    modernAsyncTask.LIZIZ(obj);
                } else {
                    modernAsyncTask.LIZJ(obj);
                }
                modernAsyncTask.LLILLL = EnumC20147613sQ.FINISHED;
            }
        }
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.086D
            public final AtomicInteger LL = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ModernAsyncTask #");
                sbLIZ.append(this.LL.getAndIncrement());
                return new Thread(runnable, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactory);
        LLILZLL = pThreadPoolExecutor;
        LLIZLLLIL = pThreadPoolExecutor;
    }

    public ModernAsyncTask() {
        AbstractCallableC20147413sO<Params, Result> abstractCallableC20147413sO = new AbstractCallableC20147413sO<Params, Result>() { // from class: X.13sN
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Callable
            public final Result call() {
                this.LLILLJJLI.LLILZIL.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) this.LLILLJJLI.LIZ(this.LL);
                    Binder.flushPendingCommands();
                    this.LLILLJJLI.LIZLLL(result);
                    return result;
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLJJLI.LLILZ.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        this.LLILLJJLI.LIZLLL(result);
                        throw th2;
                    }
                }
            }
        };
        this.LL = abstractCallableC20147413sO;
        this.LLILLJJLI = new FutureTask<Result>(abstractCallableC20147413sO) { // from class: X.13sM
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                try {
                    Result result = get();
                    ModernAsyncTask modernAsyncTask = this.LL;
                    if (modernAsyncTask.LLILZIL.get()) {
                        return;
                    }
                    modernAsyncTask.LIZLLL(result);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    ModernAsyncTask modernAsyncTask2 = this.LL;
                    if (modernAsyncTask2.LLILZIL.get()) {
                        return;
                    }
                    modernAsyncTask2.LIZLLL(null);
                } catch (ExecutionException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    public final void LIZLLL(Object obj) {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (LLIZ == null) {
                    LLIZ = new InternalHandler();
                }
                internalHandler = LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        internalHandler.obtainMessage(1, new C20147513sP(this, obj)).sendToTarget();
    }
}
