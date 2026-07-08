package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245814Js extends C20245914Jt {
    public final WindowInsets.Builder LIZJ;

    public C20245814Js() {
        this.LIZJ = new WindowInsets.Builder();
    }

    @Override // X.C20245914Jt
    public C20246014Ju LIZIZ() {
        LIZ();
        C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(null, this.LIZJ.build());
        c20246014JuLJIIJJI.LIZ.LJIIZILJ(this.LIZIZ);
        return c20246014JuLJIIJJI;
    }

    public C20245814Js(C20246014Ju c20246014Ju) {
        WindowInsets.Builder builder;
        super(c20246014Ju);
        WindowInsets windowInsetsLJIIJ = c20246014Ju.LJIIJ();
        if (windowInsetsLJIIJ != null) {
            builder = new WindowInsets.Builder(windowInsetsLJIIJ);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.LIZJ = builder;
    }

    @Override // X.C20245914Jt
    public void LIZLLL(C20244914Jj c20244914Jj) {
        this.LIZJ.setMandatorySystemGestureInsets(c20244914Jj.LIZLLL());
    }

    @Override // X.C20245914Jt
    public void LJ(C20244914Jj c20244914Jj) {
        this.LIZJ.setStableInsets(c20244914Jj.LIZLLL());
    }

    @Override // X.C20245914Jt
    public void LJFF(C20244914Jj c20244914Jj) {
        this.LIZJ.setSystemGestureInsets(c20244914Jj.LIZLLL());
    }

    @Override // X.C20245914Jt
    public void LJI(C20244914Jj c20244914Jj) {
        this.LIZJ.setSystemWindowInsets(c20244914Jj.LIZLLL());
    }

    @Override // X.C20245914Jt
    public void LJII(C20244914Jj c20244914Jj) {
        this.LIZJ.setTappableElementInsets(c20244914Jj.LIZLLL());
    }
}
