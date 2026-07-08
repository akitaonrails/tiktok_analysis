package X;

/* JADX INFO: renamed from: X.09k8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2457809k8 implements Runnable {
    public final /* synthetic */ AbstractC2457909k9 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C2457009k0 LLILZ;

    public RunnableC2457809k8(C2457009k0 c2457009k0, AbstractC2457909k9 abstractC2457909k9, int i, int i2) {
        this.LLILZ = c2457009k0;
        this.LL = abstractC2457909k9;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzw@218e.run");
        try {
            C2457009k0 c2457009k0 = this.LLILZ;
            AbstractC2457909k9 abstractC2457909k9 = this.LL;
            c2457009k0.LJ(new C2458109kB(abstractC2457909k9.LJI(), this.LLILLJJLI, this.LLILLL, abstractC2457909k9.LIZ(), abstractC2457909k9.LJIIIIZZ(), abstractC2457909k9.LJIIJ(), abstractC2457909k9.LJIIIZ(), abstractC2457909k9.LJFF(), abstractC2457909k9.LJIIJJI()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzw@218e.run");
    }
}
