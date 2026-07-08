package X;

import Y.ATListenerS6S0200001_1;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0l1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341780l1M {
    public static final C1341780l1M LIZ = new C1341780l1M();

    public final void LIZ(View view, EnumC1341650l19 enumC1341650l19) {
        LIZIZ(this, view, enumC1341650l19, 0.0f, null, 12);
    }

    public static void LIZIZ(C1341780l1M c1341780l1M, View view, EnumC1341650l19 enumC1341650l19, float f, final AwS635S0100000_21 awS635S0100000_21, int i) {
        final float fFloatValue;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            awS635S0100000_21 = null;
        }
        c1341780l1M.getClass();
        if (view != null) {
            C259800zU c259800zU = new C259800zU();
            switch (C1341100l0G.LIZ[enumC1341650l19.ordinal()]) {
                case 1:
                    view.setOnTouchListener(new ATListenerS6S0200001_1(c259800zU, awS635S0100000_21, f, 1));
                    return;
                case 2:
                    if (f <= 0.0f) {
                        f = C0HD5.LIZIZ(view, Float.valueOf(36.0f));
                    }
                    C427690Gpr.LJFF(view, f);
                    return;
                case 3:
                case 4:
                    C427690Gpr.LJI(view, awS635S0100000_21);
                    return;
                case 5:
                    Float fLJFF = C1308910kAL.LJFF(R.attr.a36, view.getContext());
                    if (fLJFF != null) {
                        fFloatValue = fLJFF.floatValue();
                    } else {
                        fFloatValue = 0.2f;
                    }
                    view.setOnTouchListener(new View.OnTouchListener(fFloatValue, awS635S0100000_21) { // from class: X.06Yn
                        public final float LL;
                        public final Function2<View, MotionEvent, Boolean> LLILLJJLI;
                        public float LLILLL = 1.0f;

                        {
                            this.LL = fFloatValue;
                            this.LLILLJJLI = awS635S0100000_21;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action == 1 || action == 3) {
                                    view2.animate().alpha(this.LLILLL).setDuration(0L).start();
                                }
                            } else {
                                this.LLILLL = view2.getAlpha();
                                view2.animate().alpha(this.LL).setDuration(0L).start();
                            }
                            Function2<View, MotionEvent, Boolean> function2 = this.LLILLJJLI;
                            if (function2 != null) {
                                return function2.invoke(view2, motionEvent).booleanValue();
                            }
                            return false;
                        }
                    });
                    return;
                case 6:
                case 7:
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
                    if (numLIZJ != null) {
                        int iIntValue = numLIZJ.intValue();
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZ = Integer.valueOf(iIntValue);
                        c384050F3z.LIZJ = Float.valueOf(f);
                        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, c384050F3z.LIZ(view.getContext()));
                        stateListDrawable.addState(new int[0], new ColorDrawable(0));
                        view.setForeground(stateListDrawable);
                        return;
                    }
                    return;
                case 8:
                    view.setOnTouchListener(null);
                    return;
                default:
                    throw new C1954807lC();
            }
        }
    }
}
