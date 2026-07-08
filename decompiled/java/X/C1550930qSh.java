package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550930qSh {
    public final ReentrantLock LIZ;
    public final Condition LIZIZ;
    public Pair<String, Boolean> LIZJ;
    public boolean LIZLLL;

    public final Pair<String, Boolean> LIZIZ() {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        while (!this.LIZLLL) {
            try {
                this.LIZIZ.await();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        Pair<String, Boolean> pair = this.LIZJ;
        reentrantLock.unlock();
        return pair;
    }

    public C1550930qSh() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
    }

    public final C0VSJ LIZ(UpdatePackage updatePackage) {
        Pair<String, Boolean> pairLIZIZ = LIZIZ();
        if (pairLIZIZ != null) {
            String first = pairLIZIZ.getFirst();
            if (first != null && first.length() != 0) {
                return new C0VSJ(first);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("local zstd decompress failed, goto full-type download, channel : ");
            sbLIZ.append(updatePackage.getChannel());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1553130qWF.LIZ("gecko-debug-tag-MergeDir", strLIZIZ);
            throw new C1550950qSj(strLIZIZ, new Throwable(strLIZIZ));
        }
        return null;
    }

    public final void LIZJ(Pair<String, Boolean> pair) {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            this.LIZJ = pair;
            this.LIZLLL = true;
            this.LIZIZ.signalAll();
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
