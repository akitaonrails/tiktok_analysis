package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import bfk.b0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1698160uIA implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1698160uIA viewTreeObserverOnGlobalLayoutListenerC1698160uIA) {
        C1653300t7o c1653300t7o = (C1653300t7o) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l0;
        b0 b0Var = (b0) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l1;
        c1653300t7o.getClass();
        Rect rect = new Rect();
        b0Var.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        c1653300t7o.LIZIZ.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect2, rect)) {
            ((Function0) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l2).invoke();
            C786410Ut5.C3(((b0) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1698160uIA);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1698160uIA viewTreeObserverOnGlobalLayoutListenerC1698160uIA) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1698160uIA);
        C1653620t8K.LIZJ((TextView) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l1, (C1655280tB0) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l2);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1698160uIA viewTreeObserverOnGlobalLayoutListenerC1698160uIA) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1698160uIA);
        C1653620t8K.LIZ((TextView) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l1, (Bitmap) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l2);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1698160uIA viewTreeObserverOnGlobalLayoutListenerC1698160uIA) {
        ((View) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l0).getWindowVisibleDisplayFrame((Rect) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l1);
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l0).getHeight() - ((Rect) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l1).bottom;
        if (height < 0) {
            height = 0;
        }
        if (((InterfaceC1676320tiw) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l2).LIZLLL() != height) {
            ((InterfaceC1676320tiw) viewTreeObserverOnGlobalLayoutListenerC1698160uIA.l2).LJIIJ(height);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1698160uIA(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
