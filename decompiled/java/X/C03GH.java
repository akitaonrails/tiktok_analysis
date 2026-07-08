package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03GH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, C03GJ c03gj) {
        if (view != null) {
            final C259800zU c259800zU = new C259800zU();
            int i = C03GI.LIZ[c03gj.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C427690Gpr.LJI(view, null);
                        return;
                    }
                    throw new C1954807lC();
                }
                C427690Gpr.LJFF(view, C418440Gaw.LIZIZ(28));
                return;
            }
            final float f = 0.0f;
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.03EP
                /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Drawable colorDrawable;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1 && action != 3) {
                            return false;
                        }
                        view2.setBackground(c259800zU.element);
                        return false;
                    }
                    c259800zU.element = view2.getBackground();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view2.getContext());
                    if (numLIZJ == null) {
                        return false;
                    }
                    float f2 = f;
                    int iIntValue = numLIZJ.intValue();
                    Context context = view2.getContext();
                    if (f2 > 0.0f) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZ = Integer.valueOf(iIntValue);
                        c384050F3z.LIZJ = Float.valueOf(f2);
                        colorDrawable = c384050F3z.LIZ(context);
                    } else {
                        colorDrawable = new ColorDrawable(iIntValue);
                    }
                    view2.setBackground(colorDrawable);
                    return false;
                }
            });
        }
    }
}
