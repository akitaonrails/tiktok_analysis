package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14Jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20246314Jx extends C20246114Jv {
    public C20244914Jj LJIILIIL;
    public C20244914Jj LJIILJJIL;
    public C20244914Jj LJIILL;

    @Override // X.C14K1, X.C20245614Jq
    public void LJIJJ(C20244914Jj c20244914Jj) {
    }

    @Override // X.C20245614Jq
    public C20244914Jj LJIIIIZZ() {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = C20244914Jj.LIZJ(this.LIZJ.getMandatorySystemGestureInsets());
        }
        return this.LJIILJJIL;
    }

    @Override // X.C20245614Jq
    public C20244914Jj LJIIJ() {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = C20244914Jj.LIZJ(this.LIZJ.getSystemGestureInsets());
        }
        return this.LJIILIIL;
    }

    @Override // X.C20245614Jq
    public C20244914Jj LJIIL() {
        if (this.LJIILL == null) {
            this.LJIILL = C20244914Jj.LIZJ(this.LIZJ.getTappableElementInsets());
        }
        return this.LJIILL;
    }

    public C20246314Jx(C20246014Ju c20246014Ju, C20246314Jx c20246314Jx) {
        super(c20246014Ju, c20246314Jx);
    }

    public C20246314Jx(C20246014Ju c20246014Ju, WindowInsets windowInsets) {
        super(c20246014Ju, windowInsets);
    }

    @Override // X.C20245514Jp, X.C20245614Jq
    public C20246014Ju LJIILIIL(int i, int i2, int i3, int i4) {
        return C20246014Ju.LJIIJJI(null, this.LIZJ.inset(i, i2, i3, i4));
    }
}
