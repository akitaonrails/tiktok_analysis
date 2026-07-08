package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385910FBd {
    public final View LIZ;
    public final View LIZIZ;
    public final Scene LIZJ;
    public final ValueAnimator LIZLLL = ValueAnimator.ofFloat(0.0f, 1.0f);
    public int LJ;

    public final int LIZ() {
        int navBarHeight;
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        C372830EjZ c372830EjZ;
        View viewFindViewById;
        Scene scene = this.LIZJ;
        int measuredHeight = (scene == null || (viewFindViewById = scene.findViewById(R.id.exu)) == null) ? 0 : viewFindViewById.getMeasuredHeight();
        Scene scene2 = this.LIZJ;
        if (!(scene2 instanceof C372480Ej0) || (c372480Ej0 = (C372480Ej0) scene2) == null || (c0ege = c372480Ej0.LLLILZ) == null || (c372830EjZ = c0ege.LJIIJ) == null) {
            int i = C372830EjZ.LLJJJJ;
            navBarHeight = C372830EjZ.LLJJJJ;
        } else {
            navBarHeight = c372830EjZ.getNavBarHeight();
        }
        return measuredHeight + navBarHeight;
    }

    public final int LIZIZ() {
        int navBarHeight;
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        C372830EjZ c372830EjZ;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        Scene scene = this.LIZJ;
        int measuredHeight = 0;
        int measuredHeight2 = (scene == null || (viewFindViewById3 = scene.findViewById(R.id.exu)) == null) ? 0 : viewFindViewById3.getMeasuredHeight();
        Scene scene2 = this.LIZJ;
        int measuredHeight3 = (scene2 == null || (viewFindViewById2 = scene2.findViewById(R.id.xoc)) == null) ? 0 : viewFindViewById2.getMeasuredHeight();
        Scene scene3 = this.LIZJ;
        if (scene3 != null && (viewFindViewById = scene3.findViewById(R.id.ioy)) != null) {
            measuredHeight = viewFindViewById.getMeasuredHeight();
        }
        Scene scene4 = this.LIZJ;
        if (!(scene4 instanceof C372480Ej0) || (c372480Ej0 = (C372480Ej0) scene4) == null || (c0ege = c372480Ej0.LLLILZ) == null || (c372830EjZ = c0ege.LJIIJ) == null) {
            int i = C372830EjZ.LLJJJJ;
            navBarHeight = C372830EjZ.LLJJJJ;
        } else {
            navBarHeight = c372830EjZ.getNavBarHeight();
        }
        return ((measuredHeight2 + navBarHeight) - measuredHeight3) - measuredHeight;
    }

    public C385910FBd(View view, View view2, Scene scene) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = scene;
    }
}
