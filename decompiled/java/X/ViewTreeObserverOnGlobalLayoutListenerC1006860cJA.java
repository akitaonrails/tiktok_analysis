package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1006860cJA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup LL;
    public final HashSet<View> LLILLJJLI;
    public final Rect LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        for (View view : this.LLILLJJLI) {
            if (view instanceof InterfaceC990510bsn) {
                boolean localVisibleRect = view.getLocalVisibleRect(this.LLILLL);
                Function1<Boolean, Unit> exposeListener = ((InterfaceC990510bsn) view).getExposeListener();
                if (exposeListener != null) {
                    exposeListener.invoke(Boolean.valueOf(localVisibleRect));
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            LIZ(viewGroup.getRootView());
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1006860cJA(C18Z4 c18z4) {
        ViewGroup viewGroup;
        View childAt = c18z4.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            viewGroup = (ViewGroup) childAt;
        } else {
            viewGroup = null;
        }
        this.LL = viewGroup;
        this.LLILLJJLI = new HashSet<>();
        this.LLILLL = new Rect();
    }

    public final void LIZ(View view) {
        if (view != null) {
            if (view instanceof InterfaceC990510bsn) {
                this.LLILLJJLI.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof InterfaceC990510bsn) {
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
