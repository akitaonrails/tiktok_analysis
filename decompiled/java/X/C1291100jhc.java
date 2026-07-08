package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0jhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291100jhc extends AndroidView implements LifecycleOwner {
    public boolean LL;
    public boolean LLILLJJLI;
    public LifecycleRegistry LLILLL;
    public Bitmap LLILZ;
    public Bitmap LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public Paint LLIZLLLIL;
    public RectF LLJ;

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.LLILLJJLI && this.LL) {
            this.LLILLL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public final boolean getMAutoPlay() {
        return this.LL;
    }

    public final boolean getMIgnoreAttachStatus() {
        return this.LLILLJJLI;
    }

    public final boolean getMIsShowLastFrame() {
        return this.LLILZLL;
    }

    public final boolean getMIsShowPoster() {
        return this.LLIZ;
    }

    public final Bitmap getMLastFrame() {
        return this.LLILZIL;
    }

    public final LifecycleRegistry getMLifecycleRegistry() {
        return this.LLILLL;
    }

    public final Paint getMPaint() {
        return this.LLIZLLLIL;
    }

    public final Bitmap getMPoster() {
        return this.LLILZ;
    }

    public final RectF getMRectF() {
        return this.LLJ;
    }

    public C1291100jhc(Context context) {
        new LinkedHashMap();
        super(context);
        setWillNotDraw(false);
        this.LLILLL = new LifecycleRegistry(this);
        this.LLIZLLLIL = new Paint();
        this.LLJ = new RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLILZ != null && this.LLIZ) {
            this.LLJ.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(this.LLILZ, (Rect) null, this.LLJ, this.LLIZLLLIL);
        } else {
            if (this.LLILZIL == null || !this.LLILZLL) {
                return;
            }
            this.LLJ.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(this.LLILZIL, (Rect) null, this.LLJ, this.LLIZLLLIL);
        }
    }

    public final void setMAutoPlay(boolean z) {
        this.LL = z;
    }

    public final void setMIgnoreAttachStatus(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setMIsShowLastFrame(boolean z) {
        this.LLILZLL = z;
    }

    public final void setMIsShowPoster(boolean z) {
        this.LLIZ = z;
    }

    public final void setMLastFrame(Bitmap bitmap) {
        this.LLILZIL = bitmap;
    }

    public final void setMLifecycleRegistry(LifecycleRegistry lifecycleRegistry) {
        this.LLILLL = lifecycleRegistry;
    }

    public final void setMPaint(Paint paint) {
        this.LLIZLLLIL = paint;
    }

    public final void setMPoster(Bitmap bitmap) {
        this.LLILZ = bitmap;
    }

    public final void setMRectF(RectF rectF) {
        this.LLJ = rectF;
    }
}
