package X;

import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.13qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20138713qz implements InterfaceC20139113r3 {
    public final Context LIZ;
    public final C19968913Bf LIZIZ;
    public final C20139213r4 LIZJ;
    public final Object LIZLLL;
    public Handler LJ;
    public Executor LJFF;
    public PThreadPoolExecutor LJI;
    public AbstractC20139013r2 LJII;

    public final void LIZIZ() {
        synchronized (this.LIZLLL) {
            try {
                this.LJII = null;
                Handler handler = this.LJ;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.LJ = null;
                PThreadPoolExecutor pThreadPoolExecutor = this.LJI;
                if (pThreadPoolExecutor != null) {
                    pThreadPoolExecutor.shutdown();
                }
                this.LJFF = null;
                this.LJI = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZLLL) {
            try {
                if (this.LJII == null) {
                    return;
                }
                if (this.LJFF == null) {
                    PThreadPoolExecutor pThreadPoolExecutorLIZ = C0WP7.LIZ("emojiCompat");
                    this.LJI = pThreadPoolExecutorLIZ;
                    this.LJFF = pThreadPoolExecutorLIZ;
                }
                this.LJFF.execute(new ARunnableS130S0100000_30(this, 3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C20139813rA LIZLLL() {
        try {
            C20139213r4 c20139213r4 = this.LIZJ;
            Context context = this.LIZ;
            C19968913Bf c19968913Bf = this.LIZIZ;
            c20139213r4.getClass();
            C20025013Wu c20025013WuLIZ = C20024813Ws.LIZ(context, c19968913Bf);
            if (c20025013WuLIZ.LIZ == 0) {
                C20139813rA[] c20139813rAArr = c20025013WuLIZ.LIZIZ;
                if (c20139813rAArr == null || c20139813rAArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c20139813rAArr[0];
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchFonts failed (");
            sbLIZ.append(c20025013WuLIZ.LIZ);
            sbLIZ.append(")");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // X.InterfaceC20139113r3
    public final void LIZ(AbstractC20139013r2 abstractC20139013r2) {
        synchronized (this.LIZLLL) {
            try {
                this.LJII = abstractC20139013r2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZJ();
    }

    public C20138713qz(Context context, C19968913Bf c19968913Bf) {
        C20139213r4 c20139213r4 = C20138813r0.LIZLLL;
        this.LIZLLL = new Object();
        C08IF.LIZLLL(context, "Context cannot be null");
        this.LIZ = C786410Ut5.N3(context);
        this.LIZIZ = c19968913Bf;
        this.LIZJ = c20139213r4;
    }
}
