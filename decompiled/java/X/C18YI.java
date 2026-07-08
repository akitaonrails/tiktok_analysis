package X;

/* JADX INFO: renamed from: X.18YI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YI implements C18YJ<C912900Zrc<?>, C18YK> {
    public final C912880Zra LIZ;
    public final C18YF<C18YK> LIZIZ;

    @Override // X.C18YJ
    public final C18YF<C18YK> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C18YJ
    public final C912880Zra LIZIZ() {
        return this.LIZ;
    }

    public C18YI(C18YH<C18YK> c18yh) {
        C912880Zra c912880Zra = c18yh.LIZIZ;
        if (c912880Zra == null) {
            synchronized (c18yh) {
                c912880Zra = c18yh.LIZIZ;
                if (c912880Zra == null) {
                    c912880Zra = new C912880Zra();
                    c18yh.LIZIZ = c912880Zra;
                }
            }
        }
        this.LIZ = c912880Zra;
        this.LIZIZ = c18yh.LIZ;
    }
}
