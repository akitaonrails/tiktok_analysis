package X;

import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;

/* JADX INFO: renamed from: X.0zOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class RunnableC1894440zOk implements Runnable {
    public final /* synthetic */ SpecActServiceImpl LL;

    public RunnableC1894440zOk(SpecActServiceImpl specActServiceImpl) {
        this.LL = specActServiceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SpecActServiceImpl@4099.initAction$1");
        try {
            SpecActServiceImpl specActServiceImpl = this.LL;
            if (!specActServiceImpl.LIZJ) {
                C01U6.LIZIZ(new C1894430zOj(specActServiceImpl));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecActServiceImpl@4099.initAction$1");
    }
}
