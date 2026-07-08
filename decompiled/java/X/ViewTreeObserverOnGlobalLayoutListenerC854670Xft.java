package X;

import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC854670Xft implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC854670Xft viewTreeObserverOnGlobalLayoutListenerC854670Xft) {
        C786410Ut5.C3(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC854670Xft);
        C1846230y8z.LIZIZ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l0, (float[]) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l1, (int[]) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l2, (float[]) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l3);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC854670Xft viewTreeObserverOnGlobalLayoutListenerC854670Xft) {
        boolean z;
        C013C c013c = (C013C) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l0;
        boolean zLIZIZ = C20097413kK.LIZIZ(((Window) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l1).getDecorView());
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        if (zLIZIZ) {
            if (!((C013C) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l0).element) {
                Function2 function2 = (Function2) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l2;
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, fValueOf);
                }
                Function2 function22 = (Function2) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l2;
                if (function22 != null) {
                    function22.invoke(Boolean.TRUE, fValueOf2);
                }
                Function1 function1 = (Function1) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l3;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
            z = true;
        } else {
            if (((C013C) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l0).element) {
                Function2 function23 = (Function2) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l2;
                if (function23 != null) {
                    function23.invoke(Boolean.FALSE, fValueOf2);
                }
                Function2 function24 = (Function2) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l2;
                if (function24 != null) {
                    function24.invoke(Boolean.FALSE, fValueOf);
                }
                Function1 function12 = (Function1) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l3;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
            }
            z = false;
        }
        c013c.element = z;
        C786410Ut5.C3(((Window) viewTreeObserverOnGlobalLayoutListenerC854670Xft.l1).getDecorView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC854670Xft);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC854670Xft(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
