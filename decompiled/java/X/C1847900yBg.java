package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0yBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847900yBg {
    public final List<List<C0VP2>> LIZ = new ArrayList();
    public final ReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    public final void LIZ(List<C0VP2> list) {
        ((ReentrantReadWriteLock) this.LIZIZ).writeLock().lock();
        try {
            ((ArrayList) this.LIZ).add(list);
            ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
            throw th;
        }
    }

    public final void LIZIZ(C0VP2 c0vp2) {
        ((ReentrantReadWriteLock) this.LIZIZ).writeLock().lock();
        try {
            List list = (List) C13LP.LJJLIIIJL(this.LIZ);
            if (list != null) {
                list.add(c0vp2);
            }
            ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
            throw th;
        }
    }
}
