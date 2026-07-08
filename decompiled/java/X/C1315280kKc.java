package X;

import android.graphics.drawable.Drawable;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315280kKc implements Drawable.Callback {
    public C1315200kKU LL;
    public WeakReference<MarkdownShadowNode> LLILLJJLI;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1315200kKU c1315200kKU = this.LL;
        if (c1315200kKU != null) {
            c1315200kKU.postInvalidate();
        }
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
