package X;

/* JADX INFO: renamed from: X.0oid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class RunnableC1483930oid implements Runnable {
    public final InterfaceC1479620obg LL;
    public final /* synthetic */ C1483920oic LLILLJJLI;

    public final void LIZ() {
        Runnable runnable;
        C1483920oic c1483920oic = this.LLILLJJLI;
        InterfaceC1483990oij interfaceC1483990oij = c1483920oic.LIZIZ;
        if (interfaceC1483990oij != null) {
            c1483920oic.LIZ.setSurface(interfaceC1483990oij.getSurface());
        }
        this.LLILLJJLI.LIZ.LJJJJJL(C1479540obY.LIZ(this.LL, null));
        InterfaceC1479620obg interfaceC1479620obg = this.LL;
        if (interfaceC1479620obg.LIZLLL() != null && (runnable = interfaceC1479620obg.LIZLLL().LJJIFFI) != null) {
            runnable.run();
        }
        if (this.LLILLJJLI.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayCommand: setSurface:");
            sbLIZ.append(this.LLILLJJLI.LIZIZ.getSurface());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PlayWithSurfaceTask$PlayCommand@34f3.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayWithSurfaceTask$PlayCommand@34f3.run");
    }

    public RunnableC1483930oid(C1483920oic c1483920oic, InterfaceC1479620obg interfaceC1479620obg) {
        this.LLILLJJLI = c1483920oic;
        this.LL = interfaceC1479620obg;
    }
}
