package X;

/* JADX INFO: renamed from: X.1BCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201121BCs<T> {
    public InterfaceC1006670cIr<T> LIZ;
    public long LIZIZ;
    public long LIZJ;
    public C1057250dcR LIZLLL;
    public C1702170uOd LJ;
    public int LJFF = EnumC202076145a.Low.getPriority();

    public final void LIZ(T t, T t2) {
        if (this.LIZJ == 0) {
            InterfaceC1006670cIr<T> interfaceC1006670cIr = this.LIZ;
            if (interfaceC1006670cIr != null) {
                interfaceC1006670cIr.LJIIJ(t, t2);
            }
            this.LIZJ = System.currentTimeMillis();
            return;
        }
        if (System.currentTimeMillis() - this.LIZJ >= this.LIZIZ) {
            InterfaceC1006670cIr<T> interfaceC1006670cIr2 = this.LIZ;
            if (interfaceC1006670cIr2 != null) {
                interfaceC1006670cIr2.LJIIJ(t, t2);
            }
            this.LIZJ = System.currentTimeMillis();
        }
    }
}
