package X;

/* JADX INFO: renamed from: X.0YIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YIQ extends C0YIM {
    @Override // X.C0YIM
    public String LJII() {
        return "ParallelRequestManager";
    }

    @Override // X.C0YIM
    public String LJIIIIZZ() {
        return "IM-REQUEST-QUEUE-P";
    }

    public C0YIQ(C0YEM c0yem) {
        super(c0yem);
    }

    @Override // X.C0YIM
    public final void LJIIJ(C0YIN c0yin) {
        if (this.LLILZ.contains(c0yin)) {
            LJIILLIIL(c0yin);
        }
    }

    @Override // X.C0YIM
    public final void LJIIJJI(C0YIN c0yin) {
        if (!this.LLILZ.contains(c0yin)) {
            this.LLILZ.add(c0yin);
        }
        LJIILLIIL(c0yin);
    }

    @Override // X.C0YIM
    public final void LJIIL(C0YIN c0yin) {
        super.LJIIL(c0yin);
        if (this.LLILZ.contains(c0yin)) {
            LJIIZILJ(103, c0yin);
            LJIIZILJ(105, c0yin);
            this.LLILZ.remove(c0yin);
        }
    }
}
