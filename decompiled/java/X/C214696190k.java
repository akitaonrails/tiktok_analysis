package X;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.190k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214696190k {
    public static final C199632139a LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            LIZ = new C199632139a() { // from class: X.18yy
                @Override // X.C214698190m, X.InterfaceC214697190l
                public final float LIZLLL(View view) {
                    return view.getTransitionAlpha();
                }

                @Override // X.C214698190m, X.InterfaceC214697190l
                public final void LIZ(View view, float f) {
                    view.setTransitionAlpha(f);
                }

                @Override // X.C214698190m, X.InterfaceC214697190l
                public final void LIZIZ(ViewGroup viewGroup, boolean z) {
                    viewGroup.suppressLayout(z);
                }

                @Override // X.C214698190m, X.InterfaceC214697190l
                public final void LJ(View view, Matrix matrix) {
                    view.transformMatrixToGlobal(matrix);
                }

                @Override // X.C214698190m, X.InterfaceC214697190l
                public final void LJFF(View view, Matrix matrix) {
                    view.setAnimationMatrix(matrix);
                }

                @Override // X.C199632139a, X.InterfaceC214697190l
                public final void LIZJ(View view, int i, int i2, int i3, int i4) {
                    view.setLeftTopRightBottom(i, i2, i3, i4);
                }
            };
        } else {
            LIZ = new C199632139a();
        }
    }

    public static void LIZ(ViewGroup viewGroup, boolean z) {
        LIZ.LIZIZ(viewGroup, z);
    }

    public static void LIZIZ(View view, Matrix matrix) {
        LIZ.LJ(view, matrix);
    }
}
