package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0kNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317140kNc {
    public final HashMap<String, WeakReference<SDUIBaseUI>> LIZ = new HashMap<>();
    public WeakReference<C1313660kI0> LIZIZ;
    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ LIZJ;
    public ViewTreeObserverOnScrollChangedListenerC1317260kNo LIZLLL;
    public ViewTreeObserverOnDrawListenerC1317270kNp LJ;

    public final ViewTreeObserver LIZ() {
        C1313670kI1 c1313670kI1;
        C1313660kI0 c1313660kI0 = this.LIZIZ.get();
        if (c1313660kI0 == null || (c1313670kI1 = c1313660kI0.LLLLZI) == null) {
            return null;
        }
        return c1313670kI1.getViewTreeObserver();
    }

    public C1317140kNc() {
        new HashSet();
        new HashSet();
        this.LIZIZ = new WeakReference<>(null);
        new Rect();
    }
}
