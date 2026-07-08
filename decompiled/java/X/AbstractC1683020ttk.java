package X;

/* JADX INFO: renamed from: X.0ttk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1683020ttk implements InterfaceC1680330tpP {
    public final C1683030ttl LL;

    public abstract void LIZIZ(C0NW2 c0nw2, InterfaceC497601wk interfaceC497601wk);

    public abstract void LJI(C0NW2 c0nw2);

    public AbstractC1683020ttk(C05P0 c05p0, boolean z) {
        this.LL = new C1683030ttl(c05p0, z);
    }

    public final void LIZJ(float f, long j, InterfaceC1675870tiD interfaceC1675870tiD) {
        float fLJJJJLL;
        C1683030ttl c1683030ttl = this.LL;
        c1683030ttl.getClass();
        if (Float.isNaN(f)) {
            fLJJJJLL = C1683580tue.LIZ(interfaceC1675870tiD, c1683030ttl.LIZ, interfaceC1675870tiD.LIZIZ());
        } else {
            fLJJJJLL = interfaceC1675870tiD.LJJJJLL(f);
        }
        float fFloatValue = c1683030ttl.LIZJ.LIZLLL().floatValue();
        if (fFloatValue > 0.0f) {
            long jLIZJ = C1685910tyP.LIZJ(fFloatValue, j);
            if (c1683030ttl.LIZ) {
                float fLIZLLL = C1680770tq7.LIZLLL(interfaceC1675870tiD.LIZIZ());
                float fLIZIZ = C1680770tq7.LIZIZ(interfaceC1675870tiD.LIZIZ());
                C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD.LJLJI();
                long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                c1695230uDRLJLJI.LIZ().save();
                c1695230uDRLJLJI.LIZ.LIZJ(0.0f, 0.0f, fLIZLLL, fLIZIZ, 1);
                C1675860tiC.LIZLLL(interfaceC1675870tiD, jLIZJ, fLJJJJLL, 0L, 0.0f, null, 124);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ);
                return;
            }
            C1675860tiC.LIZLLL(interfaceC1675870tiD, jLIZJ, fLJJJJLL, 0L, 0.0f, null, 124);
        }
    }
}
