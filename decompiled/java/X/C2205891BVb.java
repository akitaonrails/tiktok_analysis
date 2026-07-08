package X;

/* JADX INFO: renamed from: X.1BVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2205891BVb extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public final C2205971BVj LLIZ = new C2205971BVj(this);
    public final C1BVY LLIZLLLIL = new C1BVY(this);
    public C1BVZ LLJ = new C1BVZ() { // from class: X.1BVa
        public final C844210X9v LIZ = new C844210X9v();
        public final C1542400qEw LIZIZ = new C1542400qEw();

        @Override // X.C1BVZ
        public final C1542400qEw LIZ() {
            return this.LIZIZ;
        }

        @Override // X.C1BVZ
        public final C844210X9v LIZIZ() {
            return this.LIZ;
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "CustomClientExtension";
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), LJI());
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), LJFF());
    }

    public C1BVY LJFF() {
        return this.LLIZLLLIL;
    }

    public C2205971BVj LJI() {
        return this.LLIZ;
    }
}
