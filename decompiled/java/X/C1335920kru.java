package X;

import Y.ARunnableS20S0100100_17;
import Y.ARunnableS86S0200000_17;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335920kru extends C1320270kSf {
    public static ExecutorService LIZLLL;
    public int LIZIZ;
    public final C830490Whz LIZ = new C830490Whz();
    public long LIZJ = -1;

    public static void LJIIL() {
        if (LIZLLL == null) {
            synchronized (C1335920kru.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = C786410Ut5.e4(1, new ThreadFactoryC1339280kxK(1));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZLLL(String str) {
        this.LIZ.remove(str);
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZIZ(String str, String str2, Map<String, String> map) {
        List list = (List) this.LIZ.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
        List list = (List) this.LIZ.remove(str);
        if (list != null && list.contains("NetworkFetchProducer")) {
            Uri uri = c1325710kbR.LIZIZ;
            long j = -1;
            if (this.LIZJ > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZJ;
                this.LIZJ = -1L;
                j = jElapsedRealtime;
            }
            LJIIL();
            LIZLLL.submit(new ARunnableS20S0100100_17(j, uri, 13));
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        this.LIZ.put(str, new LinkedList());
        if (this.LIZJ == -1) {
            this.LIZJ = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        this.LIZ.remove(str);
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        if (i == 0) {
            LJIIL();
            LIZLLL.submit(new ARunnableS86S0200000_17(th, c1325710kbR, 71));
        }
    }
}
