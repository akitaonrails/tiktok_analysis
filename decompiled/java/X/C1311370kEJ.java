package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311370kEJ implements Drawable.Callback {
    public final WeakReference<FlattenUIText> LL;
    public final WeakReference<C1313210kHH> LLILLJJLI;

    public C1311370kEJ(FlattenUIText flattenUIText) {
        this.LL = new WeakReference<>(flattenUIText);
        if (flattenUIText.mContext.LLLIILIL && (flattenUIText.mDrawParent instanceof LynxUI)) {
            this.LLILLJJLI = new WeakReference<>(((LynxUI) flattenUIText.mDrawParent).mViewInfo);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1313210kHH c1313210kHH;
        if (!C1289620jfE.LIZIZ()) {
            return;
        }
        WeakReference<C1313210kHH> weakReference = this.LLILLJJLI;
        if (weakReference != null && (c1313210kHH = weakReference.get()) != null) {
            View view = c1313210kHH.LLILLJJLI;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        FlattenUIText flattenUIText = this.LL.get();
        if (flattenUIText == null) {
            return;
        }
        flattenUIText.invalidate();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C1289620jfE.LIZ().removeCallbacks(runnable, drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C786410Ut5.LJLIIIL(C1289620jfE.LIZ(), runnable, drawable, j);
    }
}
