package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20298714bh {
    public static final InterfaceC359760E8o LIZ(View view, Function1<? super View, ? extends List<Rect>> function1) {
        ViewOnLayoutChangeListenerC20298614bg viewOnLayoutChangeListenerC20298614bg;
        if (Build.VERSION.SDK_INT < 29) {
            return new InterfaceC359760E8o() { // from class: X.14bk
                @Override // X.InterfaceC359760E8o
                public final void LIZ() {
                }

                @Override // X.InterfaceC359760E8o
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC359760E8o
                public final void dispose() {
                }
            };
        }
        WeakHashMap<View, WeakReference<ViewOnLayoutChangeListenerC20298614bg>> weakHashMap = C20298814bi.LIZ;
        WeakReference<ViewOnLayoutChangeListenerC20298614bg> weakReference = weakHashMap.get(view);
        if (weakReference != null && (viewOnLayoutChangeListenerC20298614bg = weakReference.get()) != null && !viewOnLayoutChangeListenerC20298614bg.LLILLL) {
            viewOnLayoutChangeListenerC20298614bg.LL = function1;
            viewOnLayoutChangeListenerC20298614bg.LIZLLL(false);
            return viewOnLayoutChangeListenerC20298614bg.LLILZLL;
        }
        ViewOnLayoutChangeListenerC20298614bg viewOnLayoutChangeListenerC20298614bg2 = new ViewOnLayoutChangeListenerC20298614bg(view, function1);
        weakHashMap.put(view, new WeakReference<>(viewOnLayoutChangeListenerC20298614bg2));
        View view2 = viewOnLayoutChangeListenerC20298614bg2.LLILLJJLI.get();
        if (view2 == null) {
            viewOnLayoutChangeListenerC20298614bg2.LIZ();
        } else {
            view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC20298614bg2);
            view2.addOnAttachStateChangeListener(viewOnLayoutChangeListenerC20298614bg2);
            if (view2.isAttachedToWindow()) {
                viewOnLayoutChangeListenerC20298614bg2.LIZIZ(view2);
            }
            viewOnLayoutChangeListenerC20298614bg2.LIZLLL(false);
        }
        return viewOnLayoutChangeListenerC20298614bg2.LLILZLL;
    }
}
