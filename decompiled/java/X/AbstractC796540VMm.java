package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0VMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC796540VMm {
    public boolean mAllowMainThreadQueries;
    public C796590VMr mAutoCloser;
    public List<C0VK6> mCallbacks;
    public volatile C0VLF mDatabase;
    public InterfaceC796190VLd mOpenHelper;
    public Executor mQueryExecutor;
    public Executor mTransactionExecutor;
    public boolean mWriteAheadLoggingEnabled;
    public final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    public final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    public final C796620VMu mInvalidationTracker = createInvalidationTracker();
    public final Map<Class<?>, Object> mTypeConverters = new HashMap();
    public Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> mAutoMigrationSpecs = new HashMap();

    public abstract void clearAllTables();

    public abstract C796620VMu createInvalidationTracker();

    public abstract InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk);

    private void internalEndTransaction() {
        this.mOpenHelper.LJLJJI().LJJIIZI();
        if (inTransaction()) {
            return;
        }
        C796620VMu c796620VMu = this.mInvalidationTracker;
        if (c796620VMu.LJ.compareAndSet(false, true)) {
            c796620VMu.LIZLLL.mQueryExecutor.execute(c796620VMu.LJIIJJI);
        }
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public boolean inTransaction() {
        return this.mOpenHelper.LJLJJI().LJJIJIIJI();
    }

    public boolean isOpen() {
        C796590VMr c796590VMr = this.mAutoCloser;
        if (c796590VMr != null) {
            c796590VMr.getClass();
            return true;
        }
        C0VLF c0vlf = this.mDatabase;
        return c0vlf != null && c0vlf.isOpen();
    }

    public void setTransactionSuccessful() {
        this.mOpenHelper.LJLJJI().LJJIIZ();
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        this.mInvalidationTracker.LJII(c0vlfLJLJJI);
        if (c0vlfLJLJJI.LLIIJLIL()) {
            c0vlfLJLJJI.LJJII();
        } else {
            c0vlfLJLJJI.LJIIIIZZ();
        }
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                C796620VMu.LJI();
                this.mOpenHelper.close();
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                writeLock.unlock();
                throw th;
            }
        }
    }

    public Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return Collections.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    public void endTransaction() {
        internalEndTransaction();
    }

    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public C796620VMu getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public InterfaceC796190VLd getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    private /* synthetic */ Object lambda$beginTransaction$0(C0VLF c0vlf) {
        internalBeginTransaction();
        return null;
    }

    private /* synthetic */ Object lambda$endTransaction$1(C0VLF c0vlf) {
        internalEndTransaction();
        return null;
    }

    public InterfaceC796340VLs compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.LJLJJI().LJIIJJI(str);
    }

    public List<AbstractC796510VMj> getAutoMigrations(Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> map) {
        return Collections.emptyList();
    }

    public <T> T getTypeConverter(Class<T> cls) {
        return (T) this.mTypeConverters.get(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
    
        r5.set(r2);
        r9.mTypeConverters.put(r3, com.bytedance.mt.protector.impl.collections.ListProtector.get(r10.LJFF, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r4.set(r2);
        r9.mAutoMigrationSpecs.put(r3, (X.InterfaceC2275591E5d) com.bytedance.mt.protector.impl.collections.ListProtector.get(r10.LJI, r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(X.C796520VMk r10) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC796540VMm.init(X.0VMk):void");
    }

    public void internalInitInvalidationTracker(C0VLF c0vlf) {
        C796620VMu c796620VMu = this.mInvalidationTracker;
        synchronized (c796620VMu) {
            try {
                if (c796620VMu.LJFF) {
                    return;
                }
                c0vlf.LJIILJJIL("PRAGMA temp_store = MEMORY;");
                c0vlf.LJIILJJIL("PRAGMA recursive_triggers='ON';");
                c0vlf.LJIILJJIL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                c796620VMu.LJII(c0vlf);
                c796620VMu.LJI = c0vlf.LJIIJJI("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                c796620VMu.LJFF = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public Cursor query(C0VOJ c0voj) {
        return query(c0voj, (CancellationSignal) null);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V vCall = callable.call();
                setTransactionSuccessful();
                endTransaction();
                return vCall;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            endTransaction();
            throw th;
        }
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
            endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T unwrapOpenHelper(Class<T> cls, InterfaceC796190VLd interfaceC796190VLd) {
        if (cls.isInstance(interfaceC796190VLd)) {
            return interfaceC796190VLd;
        }
        if (interfaceC796190VLd instanceof InterfaceC796580VMq) {
            return (T) unwrapOpenHelper(cls, ((InterfaceC796580VMq) interfaceC796190VLd).getDelegate());
        }
        return null;
    }

    public Cursor query(C0VOJ c0voj, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return this.mOpenHelper.LJLJJI().LJLJJL(c0voj, cancellationSignal);
        }
        return this.mOpenHelper.LJLJJI().LJLLLL(c0voj);
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.LJLJJI().LJLLLL(new C0VN1(str, objArr));
    }
}
