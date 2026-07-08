package X;

import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0VCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793990VCr {
    public final C0VD0 LIZ;
    public final RunnableC794000VCs LIZIZ = new Runnable() { // from class: X.0VCs
        public final void LIZ() {
            try {
                Iterator<InterfaceC794060VCy> it2 = this.LL.LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(System.currentTimeMillis());
                }
                this.LL.getClass();
                C0VD0 c0vd0 = this.LL.LIZ;
                c0vd0.LIZIZ(Message.obtain(c0vd0.LIZLLL, this), 30000L);
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("AsyncEventManager@b925.<field>$2");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("AsyncEventManager@b925.<field>$2");
        }
    };
    public final CopyOnWriteArraySet<InterfaceC794060VCy> LIZJ = new CopyOnWriteArraySet<>();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VCs] */
    public C793990VCr() {
        C0VD0 c0vd0 = new C0VD0();
        this.LIZ = c0vd0;
        c0vd0.LIZ.start();
    }

    public final void LIZ(InterfaceC794060VCy interfaceC794060VCy) {
        if (interfaceC794060VCy != null) {
            try {
                this.LIZJ.add(interfaceC794060VCy);
                this.LIZ.LIZ(this.LIZIZ);
                C0VD0 c0vd0 = this.LIZ;
                c0vd0.LIZIZ(Message.obtain(c0vd0.LIZLLL, this.LIZIZ), 30000L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        C0VD0 c0vd0 = this.LIZ;
        c0vd0.LIZIZ(Message.obtain(c0vd0.LIZLLL, runnable), 0L);
    }
}
