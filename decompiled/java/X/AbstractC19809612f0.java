package X;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.measurement.zzcz;

/* JADX INFO: renamed from: X.12f0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19809612f0 {
    public static volatile zzcz LIZLLL;
    public final InterfaceC19811312fH LIZ;
    public final RunnableC19809812f2 LIZIZ;
    public volatile long LIZJ;

    public abstract void LIZJ();

    public final void LIZ() {
        this.LIZJ = 0L;
        LIZLLL().removeCallbacks(this.LIZIZ);
    }

    public final Handler LIZLLL() {
        zzcz zzczVar;
        if (LIZLLL != null) {
            return LIZLLL;
        }
        synchronized (AbstractC19809612f0.class) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = new zzcz(this.LIZ.zza().getMainLooper());
                }
                zzczVar = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zzczVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12f2] */
    public AbstractC19809612f0(final InterfaceC19811312fH interfaceC19811312fH) {
        C0W3J.LJIIIIZZ(interfaceC19811312fH);
        this.LIZ = interfaceC19811312fH;
        this.LIZIZ = new Runnable(this) { // from class: X.12f2
            public final /* synthetic */ AbstractC19809612f0 LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzau@3835.run");
                try {
                    interfaceC19811312fH.LIZLLL();
                    if (C19812512fT.LIZ()) {
                        interfaceC19811312fH.LJIIL().LJIILL(this);
                    } else {
                        boolean z = this.LLILLJJLI.LIZJ != 0;
                        this.LLILLJJLI.LIZJ = 0L;
                        if (z) {
                            this.LLILLJJLI.LIZJ();
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzau@3835.run");
            }

            {
                this.LLILLJJLI = this;
            }
        };
    }

    public final void LIZIZ(long j) {
        LIZ();
        if (j >= 0) {
            this.LIZJ = this.LIZ.LIZ().currentTimeMillis();
            if (!C786410Ut5.LJLIIL(j, LIZLLL(), this.LIZIZ)) {
                this.LIZ.LJIILJJIL().LJFF.LIZ(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }
}
