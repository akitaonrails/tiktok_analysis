package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0h7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191890h7b {
    public static final void LIZ(final View view, final int i, final int i2, final int i3, final int i4) {
        final View view2;
        if (view == null) {
            return;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            HandlerHook.viewPost(view2, new Runnable() { // from class: X.0h7c
                public final void LIZ() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i2;
                    rect.left -= i3;
                    rect.right += i4;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UIUtilsKt@71ac.expandViewTouchArea$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UIUtilsKt@71ac.expandViewTouchArea$1$1");
                }
            });
        }
    }
}
