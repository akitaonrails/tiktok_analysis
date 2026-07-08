package X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14Jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20246214Jw extends C20246314Jx {
    public static final C20246014Ju LJIILLIIL = C20246014Ju.LJIIJJI(null, WindowInsets.CONSUMED);

    @Override // X.C20245514Jp, X.C20245614Jq
    public final void LIZLLL(View view) {
    }

    @Override // X.C20245514Jp, X.C20245614Jq
    public C20244914Jj LJI(int i) {
        return C20244914Jj.LIZJ(this.LIZJ.getInsets(C14KU.LIZ(i)));
    }

    @Override // X.C20245514Jp, X.C20245614Jq
    public C20244914Jj LJII(int i) {
        return C20244914Jj.LIZJ(this.LIZJ.getInsetsIgnoringVisibility(C14KU.LIZ(i)));
    }

    @Override // X.C20245514Jp, X.C20245614Jq
    public boolean LJIILLIIL(int i) {
        return this.LIZJ.isVisible(C14KU.LIZ(i));
    }

    public C20246214Jw(C20246014Ju c20246014Ju, C20246214Jw c20246214Jw) {
        super(c20246014Ju, c20246214Jw);
    }

    public C20246214Jw(C20246014Ju c20246014Ju, WindowInsets windowInsets) {
        super(c20246014Ju, windowInsets);
    }
}
