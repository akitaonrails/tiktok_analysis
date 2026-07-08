package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0IDM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDM implements View.OnAttachStateChangeListener {
    public final int $t;

    public static final void onViewAttachedToWindow$1(C0IDM c0idm, View view) {
    }

    public static final void onViewAttachedToWindow$2(C0IDM c0idm, View view) {
    }

    public static final void onViewAttachedToWindow$3(C0IDM c0idm, View view) {
    }

    public static final void onViewDetachedFromWindow$0(C0IDM c0idm, View view) {
    }

    public static final void onViewDetachedFromWindow$4(C0IDM c0idm, View view) {
    }

    public static final void onViewDetachedFromWindow$5(C0IDM c0idm, View view) {
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
            case 5:
                onViewAttachedToWindow$5(this, view);
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
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
        }
    }

    public C0IDM(int i) {
        this.$t = i;
    }

    public static final void onViewAttachedToWindow$0(C0IDM c0idm, View view) {
        View view2;
        Object parent = view.getParent();
        ViewGroup.LayoutParams layoutParams = null;
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            layoutParams = view2.getLayoutParams();
        }
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof C21681819tI) {
            ((C21681819tI) layoutParams2).LLILLJJLI = true;
        }
    }

    public static final void onViewAttachedToWindow$4(C0IDM c0idm, View view) {
        View view2;
        Object parent = view.getParent();
        ViewGroup.LayoutParams layoutParams = null;
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            layoutParams = view2.getLayoutParams();
        }
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    public static final void onViewAttachedToWindow$5(C0IDM c0idm, View view) {
        View view2;
        Object parent = view.getParent();
        ViewGroup.LayoutParams layoutParams = null;
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            layoutParams = view2.getLayoutParams();
        }
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    public static final void onViewDetachedFromWindow$1(C0IDM c0idm, View view) {
        if (view.isLayoutRequested()) {
            HandlerHook.viewPost(view, new ARunnableS106S0100000_6(view, 42));
        }
        view.removeOnAttachStateChangeListener(c0idm);
    }

    public static final void onViewDetachedFromWindow$2(C0IDM c0idm, View view) {
        if (view.isLayoutRequested()) {
            HandlerHook.viewPost(view, new ARunnableS106S0100000_6(view, 47));
        }
        view.removeOnAttachStateChangeListener(c0idm);
    }

    public static final void onViewDetachedFromWindow$3(C0IDM c0idm, View view) {
        if (view.isLayoutRequested()) {
            HandlerHook.viewPost(view, new ARunnableS106S0100000_6(view, 48));
        }
        view.removeOnAttachStateChangeListener(c0idm);
    }
}
