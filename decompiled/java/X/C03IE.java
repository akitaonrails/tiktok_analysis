package X;

import Y.ARunnableS10S0201000_1;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.03IE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, TuxIconView tuxIconView) {
        View view;
        int i2 = (int) (i * tuxIconView.getContext().getResources().getDisplayMetrics().density);
        Object parent = tuxIconView.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            HandlerHook.viewPost(tuxIconView, new ARunnableS10S0201000_1(tuxIconView, i2, view, 1));
        }
    }
}
