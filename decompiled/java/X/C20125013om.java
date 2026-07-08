package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.13om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20125013om {
    public final void finalize() throws Throwable {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = C20125113on.LIZJ;
            if (j > 0) {
                long j2 = jElapsedRealtime - j;
                if (j2 < C20125113on.LJ) {
                    C20125113on.LJ = j2;
                }
                if (j2 > C20125113on.LJFF) {
                    C20125113on.LJFF = j2;
                }
            }
            C20125113on.LIZJ = jElapsedRealtime;
            C20125113on.LIZLLL++;
            C20125113on.LIZIZ().getClass();
            Iterator it2 = ((CopyOnWriteArrayList) C20125113on.LIZIZ).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC20124913ol) it2.next()).LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            new WeakReference(new C20125013om());
            C20125113on c20125113on = C20125113on.LIZ;
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public C20125013om() {
    }

    public C20125013om(int i) {
    }
}
