package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GZL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZL extends C0GZJ {
    public boolean LLJJIII;

    public C0GZL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final boolean getConstraintWidth() {
        return this.LLJJIII;
    }

    @Override // X.C0GZJ, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setConstraintWidth(boolean z) {
        this.LLJJIII = z;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        super.onMeasure(i, i2);
        if (this.LLJJIII) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(size, size);
    }

    public C0GZL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public /* synthetic */ C0GZL(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
