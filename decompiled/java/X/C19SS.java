package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19SS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SS implements Drawable.Callback {
    public Drawable.Callback LL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.LL;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.LL;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }
}
