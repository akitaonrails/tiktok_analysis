package X;

import Y.ARunnableS70S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.04JQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JQ implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewDetachedFromWindow$0(C04JQ c04jq, View view) {
    }

    public static final void onViewDetachedFromWindow$1(C04JQ c04jq, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$0(C04JQ c04jq, View view) {
        ((View) c04jq.l0).removeOnAttachStateChangeListener(c04jq);
        C958503ot c958503ot = (C958503ot) c04jq.l1;
        if (c958503ot.isLaidOut() && !c958503ot.isLayoutRequested()) {
            TextView headerTitleTextView = ((C958503ot) c04jq.l1).getHeaderTitleTextView();
            if (headerTitleTextView != null) {
                C1071804Hc.LIZIZ(headerTitleTextView);
                C1071804Hc.LIZ(headerTitleTextView);
                ((C958503ot) c04jq.l1).getClass();
                C958503ot.LIZJ(headerTitleTextView);
                if (headerTitleTextView.getLayout() == null && headerTitleTextView.getWidth() > 0) {
                    ((C958503ot) c04jq.l1).getClass();
                    C958503ot.LIZIZ(headerTitleTextView);
                }
                if (headerTitleTextView.getLayout() == null) {
                    headerTitleTextView.requestLayout();
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(headerTitleTextView, new ARunnableS70S0200000_1(headerTitleTextView, (C958503ot) c04jq.l1, 24));
                    return;
                }
                return;
            }
            return;
        }
        c958503ot.addOnLayoutChangeListener(new C04JJ((C958503ot) c04jq.l1, 2));
    }

    public static final void onViewAttachedToWindow$1(C04JQ c04jq, View view) {
        View view2;
        ((View) c04jq.l0).removeOnAttachStateChangeListener(c04jq);
        Object parent = ((RecyclerView) c04jq.l1).getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 24);
        }
    }

    public C04JQ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
