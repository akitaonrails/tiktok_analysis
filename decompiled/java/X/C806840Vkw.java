package X;

import Y.ARunnableS113S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Vkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806840Vkw {
    public static final C806840Vkw LIZ = new C806840Vkw();
    public static View LIZIZ;
    public static ViewGroup LIZJ;
    public static int LIZLLL;
    public static ViewGroup.LayoutParams LJ;
    public static Runnable LJFF;
    public static String LJI;

    public static final void LIZ() {
        ViewGroup viewGroup;
        View view = LIZIZ;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup2 = LIZJ;
        ViewGroup.LayoutParams layoutParams = LJ;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        C786410Ut5.LJLLLLLL(4, view);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.T4(view, 1.0f);
        if (viewGroup2 != null && layoutParams != null && viewGroup2.isAttachedToWindow()) {
            int i = LIZLLL;
            int childCount = viewGroup2.getChildCount();
            if (i > childCount) {
                i = childCount;
            }
            viewGroup2.addView(view, i, layoutParams);
            HandlerHook.viewPost(view, new ARunnableS113S0100000_13(view, 210));
        }
        Runnable runnable = LJFF;
        if (runnable != null) {
            runnable.run();
        }
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = 0;
        LJ = null;
        LJFF = null;
        LJI = null;
    }
}
