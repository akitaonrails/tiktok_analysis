package X;

import Y.ARunnableS134S0100000_34;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1B7J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7J extends C1B7G {
    public static C1B7H LJIIJJI;
    public final boolean LJIIJ;

    public C1B7J() {
        LJIIJJI = new C1B7H();
        this.LJIIJ = C2199751B7l.LJFF.LJIIIIZZ("remove_pause_in_call_isdownloading", 0) > 0;
    }

    @Override // X.C1B7G
    public final RunnableC2199651B7b LJI(int i) {
        ExecutorService executorServiceLJI;
        C1B7H c1b7h = LJIIJJI;
        if (c1b7h == null) {
            return null;
        }
        c1b7h.LIZIZ();
        RunnableC2199651B7b runnableC2199651B7b = (RunnableC2199651B7b) ((ConcurrentHashMap) c1b7h.LIZ).remove(Integer.valueOf(i));
        if (runnableC2199651B7b != null) {
            C1B7U c1b7u = C1B7U.RUN_STATUS_CANCELED;
            runnableC2199651B7b.LLJI = c1b7u;
            if (runnableC2199651B7b.LLJLLIL != null) {
                runnableC2199651B7b.LLJLLIL.LJFF();
            }
            if (runnableC2199651B7b.LLILZIL != null) {
                C2199741B7k c2199741B7k = runnableC2199651B7b.LLILZIL;
                if (!c2199741B7k.LJIIIIZZ) {
                    c2199741B7k.LJIIIIZZ = true;
                    c2199741B7k.LJJIIJZLJL = true;
                    if (c2199741B7k.LIZJ != null && (executorServiceLJI = C2199681B7e.LJI()) != null) {
                        executorServiceLJI.execute(new ARunnableS134S0100000_34(c2199741B7k, 53));
                    }
                }
            }
            if (runnableC2199651B7b.LLJLLIL == null && runnableC2199651B7b.LLILZIL == null) {
                runnableC2199651B7b.LJIILIIL();
                runnableC2199651B7b.LLJI = c1b7u;
                runnableC2199651B7b.LJIL();
            }
            C1B7H.LIZJ(runnableC2199651B7b);
        }
        return runnableC2199651B7b;
    }

    @Override // X.C1B7G
    public final void LJII(int i) {
        ExecutorService executorServiceLJI;
        C1B7H c1b7h = LJIIJJI;
        if (c1b7h == null) {
            return;
        }
        c1b7h.LIZIZ();
        RunnableC2199651B7b runnableC2199651B7b = (RunnableC2199651B7b) ((ConcurrentHashMap) c1b7h.LIZ).remove(Integer.valueOf(i));
        if (runnableC2199651B7b != null) {
            C1B7U c1b7u = C1B7U.RUN_STATUS_PAUSE;
            runnableC2199651B7b.LLJI = c1b7u;
            if (runnableC2199651B7b.LLJLLIL != null) {
                runnableC2199651B7b.LLJLLIL.LJJIIZ();
            }
            if (runnableC2199651B7b.LLILZIL != null) {
                C2199741B7k c2199741B7k = runnableC2199651B7b.LLILZIL;
                if (!c2199741B7k.LJII) {
                    c2199741B7k.LJII = true;
                    c2199741B7k.LJJIIJZLJL = true;
                    if (c2199741B7k.LIZJ != null && (executorServiceLJI = C2199681B7e.LJI()) != null) {
                        executorServiceLJI.execute(new ARunnableS134S0100000_34(c2199741B7k, 53));
                    }
                }
            }
            if (runnableC2199651B7b.LLJLLIL == null && runnableC2199651B7b.LLILZIL == null) {
                runnableC2199651B7b.LJIILIIL();
                runnableC2199651B7b.LLJI = c1b7u;
                runnableC2199651B7b.LJIL();
            }
            C1B7H.LIZJ(runnableC2199651B7b);
        }
    }

    @Override // X.C1B7G
    public final boolean LJIILJJIL(int i) {
        DownloadInfo downloadInfoLJIIIZ;
        C1B7H c1b7h = LJIIJJI;
        if (c1b7h == null) {
            return false;
        }
        RunnableC2199651B7b runnableC2199651B7b = (RunnableC2199651B7b) ((ConcurrentHashMap) c1b7h.LIZ).get(Integer.valueOf(i));
        if (runnableC2199651B7b == null || !runnableC2199651B7b.LLJ.get() || (downloadInfoLJIIIZ = LJIIIZ(i)) == null) {
            return false;
        }
        if (C207234167k.LIZ(downloadInfoLJIIIZ.getStatus())) {
            return true;
        }
        if (!this.LJIIJ) {
            LJII(i);
        }
        return false;
    }
}
