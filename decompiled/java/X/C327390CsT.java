package X;

import java.util.List;

/* JADX INFO: renamed from: X.0CsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327390CsT extends C332390D1h {
    public final C332370D1f LJIIIZ;
    public final C054G LJIIJ;
    public final String LJIIJJI;

    @Override // X.C332390D1h, X.InterfaceC1329405Ie
    public final String LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.C332390D1h
    public final C332370D1f LIZJ() {
        return this.LJIIIZ;
    }

    public C327390CsT(C332370D1f c332370D1f) {
        super(c332370D1f);
        this.LJIIIZ = c332370D1f;
        this.LJIIJ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LJIIJJI = "media_video";
    }

    @Override // X.C332390D1h, X.InterfaceC1329405Ie
    public final void LIZ(List<? extends InterfaceC1329505If> list) {
        C23250099c.LIZLLL(this.LJIIJ, null, null, new C327380CsS(list, this, null), 3);
    }
}
