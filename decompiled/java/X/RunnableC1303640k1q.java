package X;

/* JADX INFO: renamed from: X.0k1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1303640k1q implements Runnable {
    public final /* synthetic */ InterfaceC1303630k1p LL;
    public final /* synthetic */ String LLILLJJLI;

    public RunnableC1303640k1q(InterfaceC1303630k1p interfaceC1303630k1p, String str) {
        this.LL = interfaceC1303630k1p;
        this.LLILLJJLI = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("XResourceTemplateProvider@4698.callFailed$1$1");
        try {
            this.LL.onFailed(this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XResourceTemplateProvider@4698.callFailed$1$1");
    }
}
