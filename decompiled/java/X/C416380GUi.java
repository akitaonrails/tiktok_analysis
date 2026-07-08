package X;

import Y.ARunnableS20S0101000_9;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0GUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416380GUi {
    public static final void LIZ(int i, View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            HandlerHook.viewPost(view2, new ARunnableS20S0101000_9((int) (i * view.getResources().getDisplayMetrics().density), view, 7));
        }
    }
}
