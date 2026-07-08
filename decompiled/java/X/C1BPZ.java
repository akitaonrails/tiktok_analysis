package X;

import com.google.gson.n;

/* JADX INFO: renamed from: X.1BPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C1BPZ implements Runnable {
    public final /* synthetic */ C1BP6 LL;

    public /* synthetic */ C1BPZ(C1BP6 c1bp6) {
        this.LL = c1bp6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1BP6 c1bp6 = this.LL;
        c1bp6.getClass();
        C1C7U.LIZ("PiaBridge@7fb5.close$1L");
        if (c1bp6.LIZLLL) {
            C1C7U.LIZIZ("PiaBridge@7fb5.close$1L");
            return;
        }
        c1bp6.LIZLLL = true;
        C1BPD<n> c1bpd = c1bp6.LJ;
        c1bpd.LIZLLL = true;
        c1bpd.LIZIZ();
        c1bpd.LIZ.set(null);
        C1BQC c1bqc = c1bp6.LJFF;
        if (c1bqc != null) {
            c1bqc.close();
        }
        C1C7U.LIZIZ("PiaBridge@7fb5.close$1L");
    }
}
