package X;

import android.content.Context;
import android.graphics.Point;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322050kVX {
    public static Integer LIZLLL;
    public final WeakReference<View> LIZ;
    public final List<InterfaceC1322070kVZ> LIZIZ = new ArrayList();
    public ViewTreeObserverOnPreDrawListenerC1322060kVY LIZJ;

    public final View LJFF() {
        return this.LIZ.get();
    }

    public final void LIZ() {
        View viewLJFF = LJFF();
        if (viewLJFF != null) {
            ViewTreeObserver viewTreeObserver = viewLJFF.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                ViewTreeObserverOnPreDrawListenerC1322060kVY viewTreeObserverOnPreDrawListenerC1322060kVY = this.LIZJ;
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1322060kVY);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1322060kVY, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
        this.LIZJ = null;
        ((ArrayList) this.LIZIZ).clear();
    }

    public final Pair<Integer, Integer> LIZIZ() {
        View viewLJFF = LJFF();
        if (viewLJFF == null) {
            return null;
        }
        int iLJ = LJ(viewLJFF);
        int iLIZLLL = LIZLLL(viewLJFF);
        if (iLJ <= 0 && iLJ != Integer.MIN_VALUE) {
            return null;
        }
        if (iLIZLLL > 0 || iLIZLLL == Integer.MIN_VALUE) {
            return new Pair<>(Integer.valueOf(iLJ), Integer.valueOf(iLIZLLL));
        }
        return null;
    }

    public C1322050kVX(View view) {
        this.LIZ = new WeakReference<>(view);
    }

    public static int LIZLLL(View view) {
        int i;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return LIZJ(view, view.getHeight(), i, paddingTop);
    }

    public static int LJ(View view) {
        int i;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return LIZJ(view, view.getWidth(), i, paddingLeft);
    }

    public static int LIZJ(View view, int i, int i2, int i3) throws Throwable {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (!view.isLayoutRequested() && i2 == -2) {
            Context context = view.getContext();
            if (LIZLLL == null) {
                WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
                windowManager.getClass();
                Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgQ7XM/eWlgqCxuJZ9R1iSH8CvqoEW3ST7R8ZRuXG7vLeKxzYyg=", new String[]{"019e5"}));
                Point point = new Point();
                displayLLILZIL.getSize(point);
                LIZLLL = Integer.valueOf(Math.max(point.x, point.y));
            }
            return LIZLLL.intValue();
        }
        return 0;
    }
}
