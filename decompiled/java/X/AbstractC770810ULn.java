package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0ULn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC770810ULn implements InterfaceC21138617ns {
    public volatile boolean LIZ;
    public final LinkedList<InterfaceC770820ULo> LIZIZ = new LinkedList<>();

    @Override // X.InterfaceC21138617ns
    public final void invalidate() {
        this.LIZ = true;
        synchronized (this.LIZIZ) {
            try {
                Iterator<InterfaceC770820ULo> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().onInvalidate();
                }
                this.LIZIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC21138617ns
    public final void LIZLLL(C0T98 c0t98) {
        if (this.LIZ) {
            c0t98.onInvalidate();
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                this.LIZIZ.add(c0t98);
                if (this.LIZ) {
                    Iterator<InterfaceC770820ULo> it2 = this.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onInvalidate();
                    }
                    this.LIZIZ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
