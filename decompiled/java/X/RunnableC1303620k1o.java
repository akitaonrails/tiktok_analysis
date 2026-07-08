package X;

/* JADX INFO: renamed from: X.0k1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1303620k1o implements Runnable {
    public final /* synthetic */ InterfaceC1303630k1p LL;
    public final /* synthetic */ byte[] LLILLJJLI;

    public RunnableC1303620k1o(InterfaceC1303630k1p interfaceC1303630k1p, byte[] bArr) {
        this.LL = interfaceC1303630k1p;
        this.LLILLJJLI = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("XResourceTemplateProvider@4698.callSuccess$1$1");
        try {
            this.LL.LIZ(this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XResourceTemplateProvider@4698.callSuccess$1$1");
    }
}
