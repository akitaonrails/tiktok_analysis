package X;

import Y.ARunnableS49S0300000_16;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0c9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000990c9h {
    public ARunnableS49S0300000_16 LIZ;
    public C1001010c9j LIZIZ;
    public final C822660WOy LIZJ = new C822660WOy(1);
    public boolean LIZLLL;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Oh8, X.0c9j] */
    public final void LIZ(View view, Runnable runnable, boolean z) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        if (C0J0T.LIZJ(view) && !C2214201BlK.LJIIJJI && C08AJ.LIZ(view.getContext()) != 2) {
            this.LIZJ.remove(this.LIZ);
            runnable.run();
            C1001010c9j c1001010c9j = this.LIZIZ;
            if (c1001010c9j != null) {
                c1001010c9j.dispose();
                return;
            }
            return;
        }
        if (z) {
            this.LIZLLL = false;
            ARunnableS49S0300000_16 aRunnableS49S0300000_16 = this.LIZ;
            if (aRunnableS49S0300000_16 != null) {
                this.LIZJ.remove(aRunnableS49S0300000_16);
            }
            this.LIZ = new ARunnableS49S0300000_16(this, view, runnable, 1);
        }
        if (this.LIZLLL) {
            return;
        }
        if (this.LIZIZ == null) {
            ?? r1 = new C11N2<Boolean>() { // from class: X.0c9j
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(Object obj) {
                    boolean z2;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    C1000990c9h c1000990c9h = this.LLILLJJLI;
                    if (zBooleanValue) {
                        z2 = true;
                    } else {
                        ARunnableS49S0300000_16 aRunnableS49S0300000_162 = c1000990c9h.LIZ;
                        if (aRunnableS49S0300000_162 != null && c1000990c9h.LIZLLL) {
                            c1000990c9h.LIZJ.remove(aRunnableS49S0300000_162);
                            c1000990c9h.LIZJ.schedule(aRunnableS49S0300000_162, 100L, TimeUnit.MILLISECONDS);
                        }
                        z2 = false;
                    }
                    c1000990c9h.LIZLLL = z2;
                }
            };
            this.LIZIZ = r1;
            C2214201BlK.LIZLLL().LIZIZ(r1);
        }
        ARunnableS49S0300000_16 aRunnableS49S0300000_162 = this.LIZ;
        if (aRunnableS49S0300000_162 != null) {
            this.LIZJ.remove(aRunnableS49S0300000_162);
            this.LIZJ.schedule(aRunnableS49S0300000_162, 100L, TimeUnit.MILLISECONDS);
        }
    }
}
