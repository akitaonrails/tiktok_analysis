package X;

import Y.ARunnableS113S0100000_13;
import android.os.Handler;
import android.os.Looper;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0V18, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V18 extends a {
    public static volatile C0V18 LLILZIL;
    public List<Runnable> LL;
    public List<Runnable> LLILLJJLI;
    public BPEAHandler LLILLL;
    public BPEAHandler LLILZ;

    public C0V18() {
        super("Lynx_image");
        start();
    }

    public static C0V18 LIZIZ() {
        if (LLILZIL == null) {
            synchronized (C0V18.class) {
                try {
                    if (LLILZIL == null) {
                        LLILZIL = new C0V18();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILZIL;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            super.onLooperPrepared();
            C786410Ut5.LJJZZIII(new Handler(Looper.getMainLooper()), new ARunnableS113S0100000_13((Object) this, 78));
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
}
