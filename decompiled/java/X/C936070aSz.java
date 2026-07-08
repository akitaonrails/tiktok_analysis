package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0aSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936070aSz {
    public static final int LIZ = C439101nJ.LIZ(16);
    public static final int LIZIZ = C439101nJ.LIZ(24);

    public static final void LIZ(View view, View view2, C1103220eoa c1103220eoa, View view3, View view4) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        int id;
        int id2;
        int id3;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C19ME) {
            C19ME c19me = (C19ME) layoutParams;
            c19me.dimensionRatio = null;
            ((ViewGroup.MarginLayoutParams) c19me).width = (int) C497740JfY.LIZIZ(200.0f);
            C786410Ut5.W5(view, layoutParams);
        }
        if (view2 != null) {
            layoutParams2 = view2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        int id4 = -1;
        if (layoutParams2 instanceof C19ME) {
            C19ME c19me2 = (C19ME) layoutParams2;
            c19me2.bottomToBottom = -1;
            c19me2.topToTop = -1;
            if (view != null) {
                id3 = view.getId();
            } else {
                id3 = -1;
            }
            c19me2.bottomToBottom = id3;
            C786410Ut5.W5(view2, layoutParams2);
        }
        if (c1103220eoa != null) {
            layoutParams3 = c1103220eoa.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 instanceof C19ME) {
            C19ME c19me3 = (C19ME) layoutParams3;
            c19me3.bottomToBottom = -1;
            c19me3.topToTop = -1;
            if (view2 != null) {
                id2 = view2.getId();
            } else {
                id2 = -1;
            }
            c19me3.bottomToBottom = id2;
            C786410Ut5.W5(c1103220eoa, layoutParams3);
        }
        if (view3 != null && (view3.getLayoutParams() instanceof C19ME)) {
            C19ME c19me4 = (C19ME) view3.getLayoutParams();
            c19me4.bottomToBottom = -1;
            if (view != null) {
                id = view.getId();
            } else {
                id = -1;
            }
            c19me4.topToTop = id;
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = ((ViewGroup.MarginLayoutParams) c19me4).bottomMargin;
            C786410Ut5.W5(view3, c19me4);
        }
        if (view4 != null) {
            layoutParams4 = view4.getLayoutParams();
        }
        if (layoutParams4 instanceof C19ME) {
            C19ME c19me5 = (C19ME) layoutParams4;
            c19me5.bottomToBottom = -1;
            c19me5.topToTop = -1;
            if (view != null) {
                id4 = view.getId();
            }
            c19me5.bottomToBottom = id4;
            C786410Ut5.W5(view4, layoutParams4);
        }
    }

    public static final void LIZIZ(View view, ConstraintLayout constraintLayout, View view2, View view3, View view4, View view5) {
        int iMin;
        if (view2 != null && view3 != null && view5 != null && view4 != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            int i = (C500260Jjc.LJJJJIZL(view2) ? 1 : 0) + (C500260Jjc.LJJJJIZL(view3) ? 1 : 0) + (C500260Jjc.LJJJJIZL(view5) ? 1 : 0) + (C500260Jjc.LJJJJIZL(view4) ? 1 : 0);
            int width = view2.getWidth() * i;
            int i2 = LIZ;
            int i3 = width + (i2 * 2);
            if (i <= 1) {
                iMin = 0;
            } else {
                iMin = Math.min(Math.max(0, (view.getWidth() - i3) / (i - 1)), LIZIZ);
            }
            c19mb.LJIIIZ(view2.getId(), 6, view.getId(), 6, i2);
            c19mb.LJIIIZ(view3.getId(), 6, view2.getId(), 7, iMin);
            c19mb.LJI(view3.getId(), 7);
            c19mb.LJIIIZ(view4.getId(), 6, view3.getId(), 7, iMin);
            c19mb.LJI(view4.getId(), 7);
            c19mb.LJIIIZ(view5.getId(), 6, view4.getId(), 7, iMin);
            c19mb.LJI(view5.getId(), 7);
            c19mb.LIZIZ(constraintLayout);
        }
    }
}
