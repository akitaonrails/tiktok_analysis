package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: X.18yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21461818yu {
    public static final C21462018yw LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            LIZ = new C21462018yw() { // from class: X.18yv
                @Override // X.C21461618ys
                public final float LIZIZ(View view) {
                    return view.getTransitionAlpha();
                }

                @Override // X.C21462018yw, X.C21371818kO
                public final void LIZ(int i, View view) {
                    view.setTransitionVisibility(i);
                }

                @Override // X.C21461618ys
                public final void LIZJ(View view, float f) {
                    view.setTransitionAlpha(f);
                }

                @Override // X.C21461718yt
                public final void LIZLLL(View view, Matrix matrix) {
                    view.transformMatrixToGlobal(matrix);
                }

                @Override // X.C21461718yt
                public final void LJ(View view, Matrix matrix) {
                    view.transformMatrixToLocal(matrix);
                }

                @Override // X.C21462118yx
                public final void LJFF(View view, int i, int i2, int i3, int i4) {
                    view.setLeftTopRightBottom(i, i2, i3, i4);
                }
            };
        } else {
            LIZ = new C21462018yw();
        }
        new C19LL(Float.class, 12);
        new C19LL(Rect.class, 13);
    }
}
