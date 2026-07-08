package X;

/* JADX INFO: renamed from: X.0ECU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0ECU extends C360050E9r {
    public final C0EU6 LLIZLLLIL;

    public final void LJII() {
        this.LLIZLLLIL.LIZIZ(System.currentTimeMillis() - this.LLIZ);
    }

    @Override // X.C360050E9r
    public final C0EU6 LIZJ() {
        return this.LLIZLLLIL;
    }

    public C0ECU(C0E48 c0e48, String str) {
        super(c0e48, str);
        C0EU6 c0eu6 = new C0EU6(str, false);
        c0eu6.LJII = c0e48;
        this.LLIZLLLIL = c0eu6;
    }
}
