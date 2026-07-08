package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import androidx.work.ListenableWorker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VHK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHK implements Runnable {
    public static final /* synthetic */ int LLIZ = 0;
    public final C134N<Void> LL = new C134N<>();
    public final Context LLILLJJLI;
    public final C0VIG LLILLL;
    public final ListenableWorker LLILZ;
    public final C0VHD LLILZIL;
    public final InterfaceC787600Uv0 LLILZLL;

    static {
        C0VI8.LIZIZ("WorkForegroundRunnable");
    }

    public final void LIZ() {
        if (!this.LLILLL.LJIILLIIL || C0VZ5.LIZ()) {
            this.LL.LJIIIZ(null);
            return;
        }
        C134N c134n = new C134N();
        ((C0VG9) this.LLILZLL).LIZJ.execute(new ARunnableS82S0200000_13(this, c134n, 76));
        c134n.LJIIJJI(new ARunnableS82S0200000_13(this, c134n, 77), ((C0VG9) this.LLILZLL).LIZJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C0VHK(Context context, C0VIG c0vig, ListenableWorker listenableWorker, C0VHD c0vhd, InterfaceC787600Uv0 interfaceC787600Uv0) {
        this.LLILLJJLI = context;
        this.LLILLL = c0vig;
        this.LLILZ = listenableWorker;
        this.LLILZIL = c0vhd;
        this.LLILZLL = interfaceC787600Uv0;
    }
}
