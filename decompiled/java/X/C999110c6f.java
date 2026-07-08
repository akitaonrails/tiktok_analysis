package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0c6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999110c6f {
    public final RecyclerView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final Rect LJFF;

    public final void LIZ() {
        this.LIZLLL = 0;
        this.LJ = this.LIZ.computeVerticalScrollOffset() == 0;
    }

    public C999110c6f(RecyclerView recyclerView) {
        boolean z;
        this.LIZ = recyclerView;
        int iLJIIIIZZ = C12ES.LJIIIIZZ(recyclerView.getContext());
        this.LIZIZ = iLJIIIIZZ;
        this.LIZJ = (int) (iLJIIIIZZ * 0.5f);
        if (recyclerView.computeVerticalScrollOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        this.LJFF = new Rect();
    }
}
