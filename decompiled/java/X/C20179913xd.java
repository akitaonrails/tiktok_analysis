package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.13xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20179913xd {
    public final String LIZ;
    public final WeakReference<Bitmap> LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final AtomicLong LIZLLL = new AtomicLong(System.currentTimeMillis());

    public final Bitmap LIZ() {
        this.LIZLLL.set(System.currentTimeMillis());
        Bitmap bitmap = this.LIZIZ.get();
        if (this.LIZJ.get() || bitmap == null) {
            return null;
        }
        return bitmap;
    }

    public final void LIZIZ() {
        Bitmap bitmap;
        if (!this.LIZJ.compareAndSet(false, true) || (bitmap = this.LIZIZ.get()) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
    }

    public C20179913xd(String str, Bitmap bitmap) {
        this.LIZ = str;
        this.LIZIZ = new WeakReference<>(bitmap);
    }
}
