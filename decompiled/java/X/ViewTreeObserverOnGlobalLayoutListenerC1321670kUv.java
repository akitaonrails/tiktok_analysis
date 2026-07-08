package X;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
import u4.q0;

/* JADX INFO: renamed from: X.0kUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1321670kUv implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap<View, Boolean> LL = new WeakHashMap<>();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry<View, Boolean> entry : this.LL.entrySet()) {
                View key = entry.getKey();
                boolean zBooleanValue = entry.getValue().booleanValue();
                boolean z = key.isShown() && key.getWindowVisibility() == 0;
                if (zBooleanValue != z) {
                    q0.LJIIJJI(z ? 16 : 32, key);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C786410Ut5.x3(view.getViewTreeObserver(), this);
    }
}
