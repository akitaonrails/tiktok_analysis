package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.19Rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21539119Rd {
    public static C21540919Rv LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return new C21539519Rh();
            }
            return new C21539219Re();
        }
        return new C21539519Rh();
    }

    public static void LIZJ(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C21538919Rb) {
            LIZLLL(view, (C21538919Rb) background);
        }
    }

    public static void LIZIZ(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C21538919Rb) {
            ((C21538919Rb) background).LJIIJ(f);
        }
    }

    public static void LIZLLL(View view, C21538919Rb c21538919Rb) {
        C19Q8 c19q8 = c21538919Rb.LL.LIZIZ;
        if (c19q8 != null && c19q8.LIZ) {
            float fLJIIIIZZ = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                fLJIIIIZZ += C14K9.LJIIIIZZ((View) parent);
            }
            C21539019Rc c21539019Rc = c21538919Rb.LL;
            if (c21539019Rc.LJIIL != fLJIIIIZZ) {
                c21539019Rc.LJIIL = fLJIIIIZZ;
                c21538919Rb.LJIJI();
            }
        }
    }
}
