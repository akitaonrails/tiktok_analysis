package X;

/* JADX INFO: renamed from: X.15td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class RunnableC20664715td implements Runnable {
    public boolean LL;
    public final /* synthetic */ C20664615tc LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("InnerPushLayout$CloseRunnable@ac06.run");
        try {
            if (!this.LL) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C20664615tc c20664615tc = this.LLILLJJLI;
                if (jCurrentTimeMillis >= c20664615tc.LLILZIL && !c20664615tc.LLILZ) {
                    InterfaceC20665015tg interfaceC20665015tg = c20664615tc.LLIZLLLIL;
                    if (interfaceC20665015tg != null) {
                        interfaceC20665015tg.LJIJI(null, false);
                    }
                    this.LLILLJJLI.setMessage(null);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InnerPushLayout$CloseRunnable@ac06.run");
    }

    public RunnableC20664715td(C20664615tc c20664615tc) {
        this.LLILLJJLI = c20664615tc;
    }
}
