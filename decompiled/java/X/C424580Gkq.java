package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Gkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424580Gkq extends C424560Gko {
    public C424580Gkq() {
        throw null;
    }

    @Override // X.C424560Gko, com.bytedance.lighten.loader.SmartImageView
    public final void LIZJ() {
    }

    public final Pair<Float, Float> getFitCenterDisplayedSize() {
        C1331050kk3 c1331050kk3;
        Drawable drawable;
        Drawable drawable2 = getDrawable();
        if ((drawable2 instanceof C1321120kU2) && (c1331050kk3 = (C1331050kk3) drawable2) != null && (drawable = c1331050kk3.LL) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (getWidth() > 0 && getHeight() > 0 && intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float fMin = Math.min(getWidth() / f, getHeight() / f2);
                return new Pair<>(Float.valueOf(f * fMin), Float.valueOf(f2 * fMin));
            }
        }
        return null;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C424560Gko, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C424580Gkq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
