package X;

import android.os.Handler;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0V1A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1A extends a {
    public static volatile C0V1A LLILZIL;
    public volatile BPEAHandler LL;
    public final Object LLILLJJLI;
    public volatile boolean LLILLL;
    public final LinkedList<Runnable> LLILZ;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public C0V1A() {
        super("TeaThread");
        this.LLILLJJLI = new Object();
        this.LLILLL = false;
        this.LLILZ = new LinkedList<>();
    }

    public static C0V1A LIZJ() {
        if (LLILZIL == null) {
            synchronized (C0V1A.class) {
                try {
                    if (LLILZIL == null) {
                        LLILZIL = new C0V1A();
                        LLILZIL.start();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILZIL;
    }

    public final Handler LIZLLL() {
        if (this.LL == null) {
            synchronized (this) {
                try {
                    if (this.LL == null) {
                        this.LL = new BPEAHandler(getLooper());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LL;
    }

    public final void bpea_origin_onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.LLILLJJLI) {
            try {
                this.LLILLL = true;
                ArrayList<Runnable> arrayList = new ArrayList(this.LLILZ);
                this.LLILZ.clear();
                if (!arrayList.isEmpty()) {
                    for (Runnable runnable : arrayList) {
                        if (runnable != null) {
                            C786410Ut5.LJJZZIII(LIZLLL(), runnable);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        if (this.LLILLL) {
            C786410Ut5.LJLIIL(0L, LIZLLL(), runnable);
            return;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LLILLL) {
                    C786410Ut5.LJLIIL(0L, LIZLLL(), runnable);
                } else {
                    if (this.LLILZ.size() > 1000) {
                        this.LLILZ.poll();
                    }
                    this.LLILZ.add(runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void removeCallbacks(Runnable runnable) {
        LIZLLL().removeCallbacks(runnable);
    }
}
