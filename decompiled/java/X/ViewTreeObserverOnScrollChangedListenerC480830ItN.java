package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ItN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewTreeObserverOnScrollChangedListenerC480830ItN implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup LL;
    public final HashSet<View> LLILLJJLI;
    public final Rect LLILLL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            LIZ(viewGroup.getRootView());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        for (View view : this.LLILLJJLI) {
            if (view instanceof InterfaceC480840ItO) {
                boolean localVisibleRect = view.getLocalVisibleRect(this.LLILLL);
                Function1<Boolean, Unit> exposeListener = ((InterfaceC480840ItO) view).getExposeListener();
                if (exposeListener != null) {
                    exposeListener.invoke(Boolean.valueOf(localVisibleRect));
                }
            }
        }
    }

    public ViewTreeObserverOnScrollChangedListenerC480830ItN(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View childAt = viewGroup.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) childAt;
        } else {
            viewGroup2 = null;
        }
        this.LL = viewGroup2;
        this.LLILLJJLI = new HashSet<>();
        this.LLILLL = new Rect();
    }

    public final void LIZ(View view) {
        if (view != null) {
            if (view instanceof InterfaceC480840ItO) {
                this.LLILLJJLI.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof InterfaceC480840ItO) {
                        this.LLILLJJLI.add(childAt);
                    }
                    if (childAt instanceof ViewGroup) {
                        LIZ(childAt);
                    }
                }
            }
        }
    }
}
