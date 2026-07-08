package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: X.19Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21551419Vw {
    public static boolean LIZJ(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZ(View view, final C19W0 c19w0) {
        final C21551719Vz c21551719Vz = new C21551719Vz(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.19Vx
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                c19w0.LIZ(view2, c20246014Ju, new C21551719Vz(c21551719Vz));
                return c20246014Ju;
            }
        });
        if (view.isAttachedToWindow()) {
            C20097313kJ.LIZJ(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.19W1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    C20097313kJ.LIZJ(view2);
                }
            });
        }
    }

    public static float LIZIZ(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode LIZLLL(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
