package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Gpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427690Gpr {
    public static final float LIZIZ(Context context) {
        Float fLJFF = C1308910kAL.LJFF(R.attr.a36, context);
        if (fLJFF != null) {
            return fLJFF.floatValue();
        }
        return 0.2f;
    }

    public static void LJII(View view) {
        view.setOnTouchListener(new C0EEN(0.99f, null));
    }

    public static void LJIIIIZZ(View view) {
        view.setOnTouchListener(new C0EEN(0.95f, null));
    }

    public static void LJIIIZ(View view) {
        view.setOnTouchListener(new C0EEN(0.9f, null));
    }

    public static void LIZLLL(View view, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o_, view.getContext());
        if (numLIZJ != null) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LIZ(0.0f, C2441009hQ.LJIIJ(numLIZJ.intValue(), i), view.getContext()));
            stateListDrawable.addState(new int[0], new ColorDrawable(i));
            view.setBackground(stateListDrawable);
        }
    }

    public static final void LJ(View view, float f) {
        LIZJ(f, R.attr.o_, view);
    }

    public static final void LJFF(View view, float f) {
        LIZJ(f, R.attr.oa, view);
    }

    public static final void LJI(View view, final Function2<? super View, ? super MotionEvent, Boolean> function2) {
        final float fLIZIZ = LIZIZ(view.getContext());
        view.setOnTouchListener(new View.OnTouchListener(fLIZIZ, function2) { // from class: X.06PN
            public final float LL;
            public final Function2<View, MotionEvent, Boolean> LLILLJJLI;

            {
                this.LL = fLIZIZ;
                this.LLILLJJLI = function2;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        view2.animate().alpha(1.0f).setDuration(0L).start();
                    }
                } else {
                    view2.animate().alpha(this.LL).setDuration(0L).start();
                }
                Function2<View, MotionEvent, Boolean> function22 = this.LLILLJJLI;
                if (function22 != null && function22.invoke(view2, motionEvent).booleanValue()) {
                    return true;
                }
                return false;
            }
        });
    }

    public static final Drawable LIZ(float f, int i, Context context) {
        if (f > 0.0f) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(i);
            c384050F3z.LIZJ = Float.valueOf(f);
            return c384050F3z.LIZ(context);
        }
        return new ColorDrawable(i);
    }

    public static final void LIZJ(float f, int i, View view) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(i, view.getContext());
        if (numLIZJ != null) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LIZ(f, numLIZJ.intValue(), view.getContext()));
            stateListDrawable.addState(new int[0], new ColorDrawable(0));
            view.setForeground(stateListDrawable);
        }
    }
}
