package X;

/* JADX INFO: renamed from: X.18YQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YQ implements C18YT<Enum<Object>> {
    public final /* synthetic */ C18YT<Enum<Object>> LIZ;
    public final /* synthetic */ C18YP<C18YK, C18YK, Enum<Object>, C1562980qm8<Object>> LIZIZ;

    @Override // X.C18YT
    public final void LIZ(Enum<Object> r2) {
        this.LIZ.LIZ(r2);
    }

    @Override // X.C18YT
    public final void LIZIZ(Enum<Object> r2) {
        this.LIZ.LIZIZ(r2);
    }

    @Override // X.C18YT
    public final void LIZJ() {
        ((C18YT) this.LIZIZ.LIZJ.getValue()).LIZJ();
        this.LIZIZ.LJIIJJI = false;
    }

    @Override // X.C18YT
    public final void onShow() {
        this.LIZIZ.LJIIJJI = true;
        ((C18YT) this.LIZIZ.LIZJ.getValue()).onShow();
    }

    public C18YQ(C18YP<C18YK, C18YK, Enum<Object>, C1562980qm8<Object>> c18yp) {
        this.LIZIZ = c18yp;
        this.LIZ = (C18YT) c18yp.LIZJ.getValue();
    }
}
