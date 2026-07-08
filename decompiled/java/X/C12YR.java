package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12YR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YR implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(C12YR c12yr) {
        ((Function0) c12yr.l0).invoke();
        return true;
    }

    public static final boolean onPreDraw$1(C12YR c12yr) {
        ViewTreeObserver viewTreeObserver;
        C194329111b c194329111b = ((C114K) c12yr.l0).LLJJJJ;
        if (c194329111b == null) {
            c194329111b = null;
        }
        View contentView = c194329111b.getContentView();
        if (contentView != null && (viewTreeObserver = contentView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(c12yr);
            C2187701Ajg.LIZIZ(viewTreeObserver, c12yr, ViewTreeObserver.OnPreDrawListener.class);
        }
        ((C114K) c12yr.l0).LLLLIL().LJIIIZ.invoke();
        return false;
    }

    public static final boolean onPreDraw$2(C12YR c12yr) {
        C12W6 c12w6;
        View view;
        ValueAnimator valueAnimator = ((C12W9) c12yr.l0).LJI;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            C12W9 c12w9 = (C12W9) c12yr.l0;
            C12W6 c12w62 = c12w9.LJII;
            View view2 = null;
            if (c12w62 == null) {
                c12w6 = null;
            } else {
                c12w6 = c12w62;
            }
            RecyclerView recyclerView = c12w9.LJIIIIZZ;
            if (recyclerView == null) {
                recyclerView = null;
            }
            if (c12w62 == null) {
                c12w62 = null;
            }
            int iLLLIIIIL = c12w6.LLLIIIIL(recyclerView, c12w62.LLILLJJLI);
            if (iLLLIIIIL == -1) {
                View view3 = ((C12W9) c12yr.l0).LJIIIZ;
                if (view3 != null) {
                    view2 = view3;
                }
                C786410Ut5.LJLLLLLL(4, view2);
                return true;
            }
            C12W9 c12w92 = (C12W9) c12yr.l0;
            if (c12w92.LJFF != 2) {
                View view4 = c12w92.LJIIIZ;
                if (view4 == null) {
                    view4 = null;
                }
                C786410Ut5.LJLLLLLL(0, view4);
                View view5 = ((C12W9) c12yr.l0).LJIIIZ;
                if (view5 == null) {
                    view = null;
                } else {
                    view = view5;
                }
                float f = iLLLIIIIL;
                if (view5 != null) {
                    view2 = view5;
                }
                C786410Ut5.Fd(view, f - (view2.getMeasuredWidth() / 2));
                return true;
            }
        }
        return true;
    }

    public C12YR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
