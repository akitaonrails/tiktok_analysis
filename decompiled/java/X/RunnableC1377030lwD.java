package X;

/* JADX INFO: renamed from: X.0lwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class RunnableC1377030lwD implements Runnable {
    public boolean LL;
    public final /* synthetic */ ViewOnClickListenerC1377010lwB LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PrivateUploadSuccessPopView$CloseRunnable@8571.run");
        try {
            if (!this.LL) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ViewOnClickListenerC1377010lwB viewOnClickListenerC1377010lwB = this.LLILLJJLI;
                if (jCurrentTimeMillis >= viewOnClickListenerC1377010lwB.LLILZIL) {
                    viewOnClickListenerC1377010lwB.onDismiss();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivateUploadSuccessPopView$CloseRunnable@8571.run");
    }

    public RunnableC1377030lwD(ViewOnClickListenerC1377010lwB viewOnClickListenerC1377010lwB) {
        this.LLILLJJLI = viewOnClickListenerC1377010lwB;
    }
}
