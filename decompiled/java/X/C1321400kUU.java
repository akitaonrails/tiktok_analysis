package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321400kUU extends View {
    public C1321420kUW LL;

    private final C1321070kTx getFetchImageManager() {
        C1321420kUW c1321420kUW = this.LL;
        if (c1321420kUW != null) {
            return c1321420kUW.LLZZJLIL;
        }
        return null;
    }

    public final Drawable getDrawable() {
        C1321070kTx fetchImageManager = getFetchImageManager();
        if (fetchImageManager != null) {
            return fetchImageManager.LJ();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return getBackground() != null;
    }

    @Override // android.view.View
    public final void invalidate() {
        C1321070kTx fetchImageManager = getFetchImageManager();
        if (fetchImageManager != null) {
            if (fetchImageManager.LLJILJILJ) {
                return;
            } else {
                fetchImageManager.LLJILJILJ = true;
            }
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        Drawable drawable;
        Drawable drawable2 = getDrawable();
        if (!super.isOpaque()) {
            if (drawable2 == null || drawable2.getOpacity() != -1 || (drawable = getDrawable()) == null) {
                return false;
            }
            Rect bounds = drawable.getBounds();
            if (bounds.left > 0 || bounds.top > 0 || bounds.right < getWidth() || bounds.bottom < getHeight()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        Drawable drawable;
        super.onAttachedToWindow();
        if (C1321060kTw.LIZIZ && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
        C1321070kTx fetchImageManager = getFetchImageManager();
        if (fetchImageManager != null) {
            fetchImageManager.LJI();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Drawable drawable;
        super.onDetachedFromWindow();
        if (C1321060kTw.LIZIZ && (drawable = getDrawable()) != null) {
            drawable.setVisible(false, false);
        }
        C1321070kTx fetchImageManager = getFetchImageManager();
        if (fetchImageManager != null) {
            fetchImageManager.LJII();
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C1321070kTx fetchImageManager = getFetchImageManager();
        if (fetchImageManager != null) {
            fetchImageManager.LJI();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C1321070kTx fetchImageManager = getFetchImageManager();
        if (fetchImageManager != null) {
            fetchImageManager.LJII();
        }
    }

    public final C1321420kUW getViewManager() {
        return this.LL;
    }

    public C1321400kUU(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == getDrawable()) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1321420kUW c1321420kUW = this.LL;
        if (c1321420kUW != null) {
            c1321420kUW.LJJ(canvas);
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        C822690WPb.LIZ().execute(new ARunnableS120S0100000_20(this, 401));
    }

    public final void setViewManager(C1321420kUW c1321420kUW) {
        this.LL = c1321420kUW;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (C1321060kTw.LIZIZ) {
            C822690WPb.LIZ().execute(new ARunnableS31S0101000_20(i, this, 34));
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == getDrawable()) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public final void LIZ(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C1321420kUW c1321420kUW = this.LL;
        if (c1321420kUW != null) {
            c1321420kUW.LJLLILLLL(i, i2, c1321420kUW.LJLLL(), c1321420kUW.LJLZ());
            setMeasuredDimension(c1321420kUW.b, c1321420kUW.c);
        } else {
            C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(98), C2097608Jq.LJ());
            setMeasuredDimension(0, 0);
        }
    }
}
