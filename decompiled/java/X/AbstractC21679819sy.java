package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21679819sy {
    public final RecyclerView.LayoutManager LIZ;
    public int LIZIZ = Integer.MIN_VALUE;
    public final Rect LIZJ = new Rect();

    public abstract int LIZIZ(View view);

    public abstract int LIZJ(View view);

    public abstract int LIZLLL(View view);

    public abstract int LJ(View view);

    public abstract int LJFF();

    public abstract int LJI();

    public abstract int LJII();

    public abstract int LJIIIIZZ();

    public abstract int LJIIIZ();

    public abstract int LJIIJ();

    public abstract int LJIIJJI();

    public abstract int LJIILIIL(View view);

    public abstract int LJIILJJIL(View view);

    public abstract void LJIILL(int i);

    public final int LJIIL() {
        if (Integer.MIN_VALUE == this.LIZIZ) {
            return 0;
        }
        return LJIIJJI() - this.LIZIZ;
    }

    public AbstractC21679819sy(RecyclerView.LayoutManager layoutManager) {
        this.LIZ = layoutManager;
    }

    public static AbstractC21679819sy LIZ(int i, RecyclerView.LayoutManager layoutManager) {
        if (i != 0) {
            if (i == 1) {
                return new C21679719sx(layoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C21679619sw(layoutManager);
    }
}
