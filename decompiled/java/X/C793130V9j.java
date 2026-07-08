package X;

/* JADX INFO: renamed from: X.0V9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793130V9j extends AbstractC793120V9i {
    public final C793110V9h LIZIZ;
    public volatile boolean LIZJ;

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZLLL() {
        super.LIZLLL();
        C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC793220V9s
    public final EnumC793190V9p LIZIZ() {
        return EnumC793190V9p.COOL_DOWN;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0V9h] */
    public C793130V9j(final C793100V9g c793100V9g) {
        final long j;
        super(c793100V9g);
        if (this.LIZJ) {
            j = 1200000;
        } else {
            j = 120000;
        }
        this.LIZIZ = new AbstractRunnableC792500V6y(j) { // from class: X.0V9h
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NormalCoolDownState@3f9e.<init>$1");
                try {
                    C793130V9j c793130V9j = this.LLILZIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cool down task run, is back?: ");
                    sbLIZ.append(this.LLILZIL.LIZJ);
                    c793130V9j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C793100V9g c793100V9g2 = c793100V9g;
                    synchronized (c793100V9g2) {
                        c793100V9g2.LIZ(c793100V9g2.LJIIJJI);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NormalCoolDownState@3f9e.<init>$1");
            }
        };
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZJ(boolean z) {
        super.LIZJ(z);
        this.LIZJ = z;
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZ(C0V9K c0v9k, boolean z) {
        super.LIZ(c0v9k, z);
        C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZJ(this.LIZIZ);
    }
}
