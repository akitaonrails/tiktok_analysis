package X;

/* JADX INFO: renamed from: X.0bDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC964990bDd implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    public RunnableC964990bDd(String str, Throwable th) {
        this.LL = str;
        this.LLILLJJLI = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        String strLIZIZ;
        C1C7U.LIZ("LinkMicSdkLogger@42d2.e$2");
        try {
            if (this.LL.length() != 0) {
                String strLIZJ = C969080bKE.LIZJ(this.LL);
                Throwable th = this.LLILLJJLI;
                if (th == null || (strLIZIZ = C13SZ.LIZIZ(th)) == null) {
                    strLIZIZ = "";
                }
                C1AZW.LJFF(strLIZJ, strLIZIZ, null, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LinkMicSdkLogger@42d2.e$2");
    }
}
