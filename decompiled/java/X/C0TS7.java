package X;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: renamed from: X.0TS7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TS7 implements Runnable {
    public final /* synthetic */ C843920X8s LL;

    public C0TS7(C843920X8s c843920X8s) {
        this.LL = c843920X8s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        String strLLLLLIL;
        C1C7U.LIZ("CommerceAttributionHandler@65e.updateCacheAdid$1");
        try {
            C843920X8s c843920X8s = this.LL;
            AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C497740JfY.LJII());
            if (infoLIZIZ == null || (strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58h5DQstV5Lij8K96FyWO7RJsi8Bars1sZ4uw=", null))) == null) {
                strLLLLLIL = "";
            }
            c843920X8s.LIZLLL = strLLLLLIL;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceAttributionHandler@65e.updateCacheAdid$1");
    }
}
