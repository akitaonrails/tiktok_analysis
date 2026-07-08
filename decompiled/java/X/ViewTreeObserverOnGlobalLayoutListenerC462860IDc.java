package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC462860IDc implements ViewTreeObserver.OnGlobalLayoutListener {
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

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC462860IDc viewTreeObserverOnGlobalLayoutListenerC462860IDc) {
        if (((Boolean) ((Function1) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l0).invoke((View) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l1)).booleanValue()) {
            if (((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l2).isAlive()) {
                C786410Ut5.C3((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l2, viewTreeObserverOnGlobalLayoutListenerC462860IDc);
            } else {
                C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462860IDc);
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC462860IDc viewTreeObserverOnGlobalLayoutListenerC462860IDc) {
        Layout layout;
        int i;
        ViewTreeObserver viewTreeObserver;
        C430890Gv1 c430890Gv1 = (C430890Gv1) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l0;
        if (c430890Gv1.LLLF && (layout = c430890Gv1.getLayout()) != null) {
            C654210PlL c654210PlL = (C654210PlL) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l1;
            C430890Gv1 c430890Gv12 = (C430890Gv1) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l0;
            TuxIconView tuxIconView = (TuxIconView) viewTreeObserverOnGlobalLayoutListenerC462860IDc.l2;
            View view = c654210PlL.LLILZLL;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462860IDc);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462860IDc, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            if (c654210PlL.LLJILJILJ <= 0 && !c430890Gv12.LLJLLL) {
                c654210PlL.LLJILJILJ = c430890Gv12.getHeight();
            }
            if (!c430890Gv12.LLJZIJLIL && layout.getLineCount() <= 2) {
                i = 8;
            } else {
                i = 0;
            }
            C654210PlL.LJIILL(i, tuxIconView);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC462860IDc(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
