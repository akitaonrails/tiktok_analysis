package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0e8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1077380e8u implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1077380e8u viewTreeObserverOnGlobalLayoutListenerC1077380e8u) {
        if (((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l0).isAlive()) {
            C786410Ut5.C3((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l0, viewTreeObserverOnGlobalLayoutListenerC1077380e8u);
            C1051950dTt c1051950dTt = (C1051950dTt) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l1;
            ViewPager viewPager = (ViewPager) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l2;
            View view = c1051950dTt.LLILLJJLI;
            if (view == null) {
                view = null;
            }
            c1051950dTt.getClass();
            if (viewPager != null && view != null) {
                c1051950dTt.LIZ(0.0f, viewPager.getCurrentItem(), view);
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1077380e8u viewTreeObserverOnGlobalLayoutListenerC1077380e8u) {
        C786410Ut5.C3(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077380e8u);
        Layout layout = ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l0).getLayout();
        if (layout != null) {
            C118300cf c118300cf = (C118300cf) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l1;
            TuxTextView tuxTextView = (TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l0;
            C1038030d7R c1038030d7R = (C1038030d7R) viewTreeObserverOnGlobalLayoutListenerC1077380e8u.l2;
            boolean z = true;
            int ellipsisCount = layout.getEllipsisCount(tuxTextView.getLineCount() - 1);
            c118300cf.element = ellipsisCount;
            AbstractC1038140d7c abstractC1038140d7c = c1038030d7R.LL;
            if (abstractC1038140d7c != null) {
                if (ellipsisCount <= 0) {
                    z = false;
                }
                abstractC1038140d7c.LJFF(z);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1077380e8u(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
