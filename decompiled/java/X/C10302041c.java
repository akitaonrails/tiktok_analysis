package X;

import Y.ARunnableS0S0204000_1;
import Y.ARunnableS10S0400000_1;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.041c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10302041c {
    public static void LIZIZ(View view, Integer num) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            HandlerHook.viewPost(view2, new ARunnableS10S0400000_1(view, null, num, view2, 0));
        }
    }

    public static final void LIZ(View view, int i, int i2, int i3, int i4) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            HandlerHook.viewPost(view2, new ARunnableS0S0204000_1(i, i2, i3, i4, view, view2, 3));
        }
    }
}
