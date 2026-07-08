package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2163908dp {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock(false);

    public static Object LIZ(Function0 function0) {
        ReentrantReadWriteLock.WriteLock writeLock = LIZ.writeLock();
        writeLock.lock();
        try {
            Object objInvoke = function0.invoke();
            writeLock.unlock();
            return objInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            writeLock.unlock();
            throw th;
        }
    }
}
