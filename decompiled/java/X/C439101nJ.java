package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: X.01nJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C439101nJ {
    public static final int LIZ(int i) {
        return (int) C497740JfY.LIZIZ(i);
    }

    public static final float LIZIZ(int i) {
        return i / C497740JfY.LIZIZ.density;
    }

    public static final int LIZJ(int i) {
        return C446980Hfs.LIZ(C786410Ut5.N3(C497740JfY.LJII()), i);
    }

    public static final void LJI(View view) {
        C12ES.LJIILL(8, view);
    }

    public static final void LIZLLL(int i, View view) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C377401dM(i, view, null), 2);
    }

    public static final void LJ(int i, ImageView imageView) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C377601dO(i, imageView, null), 2);
    }

    public static final void LJFF(TextView textView, int i) {
        if (textView != null) {
            textView.setTextColor(C497740JfY.LJFF(i));
        }
    }
}
