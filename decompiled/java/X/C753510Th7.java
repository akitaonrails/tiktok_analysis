package X;

/* JADX INFO: renamed from: X.0Th7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753510Th7 implements InterfaceC782260UmO {
    public AnonymousClass0956 LIZ;
    public boolean LIZIZ = true;
    public final /* synthetic */ C753520Th8 LIZJ;

    @Override // X.InterfaceC782260UmO
    public final void start() {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZ = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C753500Th6(this, this.LIZJ, null), 2);
    }

    @Override // X.InterfaceC782260UmO
    public final void stop() {
        AnonymousClass0956 anonymousClass0956 = this.LIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ = false;
        this.LIZJ.LIZ = null;
    }

    public C753510Th7(C753520Th8 c753520Th8) {
        this.LIZJ = c753520Th8;
    }
}
