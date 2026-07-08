package Y;

import X.C1308910kAL;
import X.C259800zU;
import X.C384050F3z;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class ATListenerS6S0200001_1 implements View.OnTouchListener {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            default:
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
    public static final boolean onTouch$0(ATListenerS6S0200001_1 aTListenerS6S0200001_1, View view, MotionEvent motionEvent) {
        Drawable colorDrawable;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.setBackground((Drawable) ((C259800zU) aTListenerS6S0200001_1.l0).element);
            }
        } else {
            ((C259800zU) aTListenerS6S0200001_1.l0).element = view.getBackground();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
            if (numLIZJ != null) {
                float f = aTListenerS6S0200001_1.f2;
                int iIntValue = numLIZJ.intValue();
                Context context = view.getContext();
                if (f > 0.0f) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    c384050F3z.LIZJ = Float.valueOf(f);
                    colorDrawable = c384050F3z.LIZ(context);
                } else {
                    colorDrawable = new ColorDrawable(iIntValue);
                }
                view.setBackground(colorDrawable);
            }
        }
        Function2 function2 = (Function2) aTListenerS6S0200001_1.l1;
        if (function2 != null) {
            return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
    public static final boolean onTouch$1(ATListenerS6S0200001_1 aTListenerS6S0200001_1, View view, MotionEvent motionEvent) {
        Drawable colorDrawable;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.setBackground((Drawable) ((C259800zU) aTListenerS6S0200001_1.l0).element);
            }
        } else {
            ((C259800zU) aTListenerS6S0200001_1.l0).element = view.getBackground();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
            if (numLIZJ != null) {
                float f = aTListenerS6S0200001_1.f2;
                int iIntValue = numLIZJ.intValue();
                Context context = view.getContext();
                if (f > 0.0f) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    c384050F3z.LIZJ = Float.valueOf(f);
                    colorDrawable = c384050F3z.LIZ(context);
                } else {
                    colorDrawable = new ColorDrawable(iIntValue);
                }
                view.setBackground(colorDrawable);
            }
        }
        Function2 function2 = (Function2) aTListenerS6S0200001_1.l1;
        if (function2 != null) {
            return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ATListenerS6S0200001_1(C259800zU c259800zU, C259800zU<Drawable> c259800zU2, Function2<? super View, ? super MotionEvent, Boolean> function2, float f) {
        this.$t = f;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.f2 = function2;
    }
}
