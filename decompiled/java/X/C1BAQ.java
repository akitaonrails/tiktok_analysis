package X;

import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.1BAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAQ implements C1BAW {
    public final /* synthetic */ C092O LIZ;
    public final /* synthetic */ Runnable LIZIZ;
    public final /* synthetic */ C1BAP LIZJ;
    public final /* synthetic */ int LIZLLL;

    public final void LIZ(Throwable th) {
        if (th instanceof TimeoutException) {
            this.LIZJ.LJJJLL(28, C2200541BAm.LJJIIZ, C1BAX.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
        } else {
            this.LIZJ.LJJJLL(28, C2200541BAm.LJJIIZ, C1BAX.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
        }
        this.LIZIZ.run();
    }

    public C1BAQ(C1BAP c1bap, int i, C092O c092o, Runnable runnable) {
        this.LIZLLL = i;
        this.LIZ = c092o;
        this.LIZIZ = runnable;
        Objects.requireNonNull(c1bap);
        this.LIZJ = c1bap;
    }
}
