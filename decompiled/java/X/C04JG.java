package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04JG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JG implements View.OnAttachStateChangeListener {
    public final int $t;

    public static final void onViewDetachedFromWindow$0(C04JG c04jg, View view) {
    }

    public static final void onViewDetachedFromWindow$1(C04JG c04jg, View view) {
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

    public C04JG(int i) {
        this.$t = i;
    }

    public static final void onViewAttachedToWindow$0(C04JG c04jg, View view) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null && view2.getId() == R.id.a0f) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = 0;
            }
        }
    }

    public static final void onViewAttachedToWindow$1(C04JG c04jg, View view) {
        ViewGroup viewGroup;
        view.removeOnAttachStateChangeListener(c04jg);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            View viewFindViewById = viewGroup.findViewById(R.id.video_card_bottom_gradient);
            int i = 0;
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                return;
            }
            View view2 = new View(view.getContext());
            view2.setBackgroundResource(R.drawable.ccf);
            C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), 80));
            int iIndexOfChild = viewGroup.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                i = iIndexOfChild;
            }
            viewGroup.addView(view2, i);
        }
    }
}
