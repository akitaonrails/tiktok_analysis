package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EEN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEN implements View.OnTouchListener {
    public final float LL;
    public final Function2<View, MotionEvent, Boolean> LLILLJJLI;

    public C0EEN(float f, Function2 function2) {
        this.LL = f;
        this.LLILLJJLI = function2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        } else {
            view.animate().scaleX(this.LL).scaleY(this.LL).setDuration(100L).start();
        }
        Function2<View, MotionEvent, Boolean> function2 = this.LLILLJJLI;
        if (function2 != null && function2.invoke(view, motionEvent).booleanValue()) {
            return true;
        }
        return false;
    }
}
