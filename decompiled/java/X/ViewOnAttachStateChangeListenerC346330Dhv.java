package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.effectcreatormobile.infrastructure.ui.base.BindingBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnAttachStateChangeListenerC346330Dhv implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
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
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
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
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC346330Dhv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
        View view2;
        View view3;
        LinearLayout.LayoutParams layoutParams;
        ((View) viewOnAttachStateChangeListenerC346330Dhv.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC346330Dhv);
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = 0;
                C786410Ut5.W5(view2, layoutParams);
            }
            Object parent2 = view2.getParent();
            if ((parent2 instanceof ViewGroup) && (view3 = (View) parent2) != null) {
                View viewFindViewById = view3.findViewById(R.id.bsc);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                }
                View viewFindViewById2 = view3.findViewById(R.id.bs9);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
            }
        }
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
        View view2;
        View view3;
        LinearLayout.LayoutParams layoutParams;
        ((View) viewOnAttachStateChangeListenerC346330Dhv.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC346330Dhv);
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = 0;
                C786410Ut5.W5(view2, layoutParams);
            }
            Object parent2 = view2.getParent();
            if ((parent2 instanceof ViewGroup) && (view3 = (View) parent2) != null) {
                View viewFindViewById = view3.findViewById(R.id.bsc);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                }
                View viewFindViewById2 = view3.findViewById(R.id.bs9);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
            }
        }
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
        View view2;
        View view3;
        LinearLayout.LayoutParams layoutParams;
        ((View) viewOnAttachStateChangeListenerC346330Dhv.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC346330Dhv);
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = 0;
                C786410Ut5.W5(view2, layoutParams);
            }
            Object parent2 = view2.getParent();
            if ((parent2 instanceof ViewGroup) && (view3 = (View) parent2) != null) {
                View viewFindViewById = view3.findViewById(R.id.bsc);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                }
                View viewFindViewById2 = view3.findViewById(R.id.bs9);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
            }
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
        ((BindingBaseFragment) viewOnAttachStateChangeListenerC346330Dhv.l0).LLILZ = null;
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC346330Dhv viewOnAttachStateChangeListenerC346330Dhv, View view) {
        List list = (List) viewOnAttachStateChangeListenerC346330Dhv.l0;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                HandlerHook.viewRemoveCallbacks(view, (Runnable) it2.next());
            }
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC346330Dhv);
    }
}
