package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Q5C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q5C implements C0Q5R {
    public final ViewGroup LIZ;
    public FrameLayout LIZIZ;
    public boolean LIZJ;
    public ViewGroup LIZLLL;
    public ViewGroup.LayoutParams LJFF;
    public View LJII;
    public C0Q5E LJIIIIZZ;
    public int LJ = -1;
    public final Rect LJI = new Rect();

    public C0Q5C(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.C0Q5R
    public final void LIZ(String str) {
        TextureView textureView;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        C0Q5E c0q5e;
        View view = this.LJII;
        if (!(view instanceof TextureView) || (textureView = (TextureView) view) == null || (viewGroup = this.LIZLLL) == null || (frameLayout = this.LIZIZ) == null || (c0q5e = this.LJIIIIZZ) == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(c0q5e.LJ, c0q5e.LJFF, c0q5e.LJI, c0q5e.LJII);
        textureView.setTransform(matrix);
        C786410Ut5.LJJJZ(textureView, frameLayout);
        C786410Ut5.V5(textureView, this.LJFF);
        int i = this.LJ;
        if (i >= 0 && i < viewGroup.getChildCount()) {
            viewGroup.addView(textureView, this.LJ);
        } else {
            viewGroup.addView(textureView);
        }
        C786410Ut5.LJJJLZIJ(frameLayout, this.LIZ);
        this.LIZIZ = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LIZLLL = null;
        this.LJFF = null;
        this.LJ = -1;
        this.LIZJ = false;
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search video exit fullscreen, restore original state. source:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
