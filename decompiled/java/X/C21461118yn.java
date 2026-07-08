package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: X.18yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21461118yn {
    public static final C21461218yo LIZ;
    public static final C19LL LIZIZ;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            LIZ = new C21461218yo() { // from class: X.18yq
                @Override // X.C21460918yl
                public final float LIZIZ(View view) {
                    return view.getTransitionAlpha();
                }

                @Override // X.C21461218yo, X.C21371918kP
                public final void LIZ(int i, View view) {
                    view.setTransitionVisibility(i);
                }

                @Override // X.C21460918yl
                public final void LIZJ(View view, float f) {
                    view.setTransitionAlpha(f);
                }

                @Override // X.C21461318yp
                public final void LIZLLL(View view, Matrix matrix) {
                    view.transformMatrixToGlobal(matrix);
                }

                @Override // X.C21461318yp
                public final void LJ(View view, Matrix matrix) {
                    view.transformMatrixToLocal(matrix);
                }

                @Override // X.C21461518yr
                public final void LJFF(View view, int i, int i2, int i3, int i4) {
                    view.setLeftTopRightBottom(i, i2, i3, i4);
                }
            };
        } else {
            LIZ = new C21461218yo();
        }
        LIZIZ = new C19LL(Float.class, 16);
        new C19LL(Rect.class, 17);
    }

    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        LIZ.LJFF(view, i, i2, i3, i4);
    }
}
