package X;

/* JADX INFO: renamed from: X.125T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C125T implements Runnable {
    public final /* synthetic */ C125U LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TextStickerMoveHandler$AutoDismissRunable@2f64.run");
        try {
            C125U c125u = this.LL;
            c125u.LJIIIIZZ = false;
            C125R c125r = c125u.LJIILL;
            if (c125r != null) {
                c125r.invalidate();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextStickerMoveHandler$AutoDismissRunable@2f64.run");
    }

    public C125T(C125U c125u) {
        this.LL = c125u;
    }
}
