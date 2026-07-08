package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14K1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14K1 extends C20245514Jp {
    public C20244914Jj LJIIL;

    @Override // X.C20245614Jq
    public C20246014Ju LIZIZ() {
        return C20246014Ju.LJIIJJI(null, this.LIZJ.consumeStableInsets());
    }

    @Override // X.C20245614Jq
    public C20246014Ju LIZJ() {
        return C20246014Ju.LJIIJJI(null, this.LIZJ.consumeSystemWindowInsets());
    }

    @Override // X.C20245614Jq
    public final C20244914Jj LJIIIZ() {
        if (this.LJIIL == null) {
            this.LJIIL = C20244914Jj.LIZIZ(this.LIZJ.getStableInsetLeft(), this.LIZJ.getStableInsetTop(), this.LIZJ.getStableInsetRight(), this.LIZJ.getStableInsetBottom());
        }
        return this.LJIIL;
    }

    @Override // X.C20245614Jq
    public boolean LJIILJJIL() {
        return this.LIZJ.isConsumed();
    }

    @Override // X.C20245614Jq
    public void LJIJJ(C20244914Jj c20244914Jj) {
        this.LJIIL = c20244914Jj;
    }

    public C14K1(C20246014Ju c20246014Ju, C14K1 c14k1) {
        super(c20246014Ju, c14k1);
        this.LJIIL = c14k1.LJIIL;
    }

    public C14K1(C20246014Ju c20246014Ju, WindowInsets windowInsets) {
        super(c20246014Ju, windowInsets);
    }
}
