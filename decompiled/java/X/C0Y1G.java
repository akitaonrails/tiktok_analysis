package X;

/* JADX INFO: renamed from: X.0Y1G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1G implements Runnable {
    public final /* synthetic */ C0YIN LL;
    public final /* synthetic */ AbstractC867440Y1e LLILLJJLI;

    public final void LIZ() {
        C0YIN c0yin = this.LL;
        if (c0yin.LLILZ != null) {
            if (c0yin.LJIIJJI() && this.LLILLJJLI.LJIIIIZZ(this.LL)) {
                ((C0Y1H) this.LL.LLILZ).LIZ.onSuccess(null);
            } else {
                ((C0Y1H) this.LL.LLILZ).LIZ.LIZIZ(null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("IMBaseHandler@a01d.handleMsg$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMBaseHandler@a01d.handleMsg$1");
    }

    public C0Y1G(AbstractC867440Y1e abstractC867440Y1e, C0YIN c0yin) {
        this.LLILLJJLI = abstractC867440Y1e;
        this.LL = c0yin;
    }
}
