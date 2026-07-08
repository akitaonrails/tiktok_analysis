package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418930Gbj extends C427870Gq9 {
    public Path LLJJI;
    public int LLJJIII;
    public final ColorDrawable LLJJIJI;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            Path path = this.LLJJI;
            if (path == null) {
                super.onDraw(canvas);
                return;
            }
            int iSave = canvas.save();
            try {
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBoundaryPath(Path path) {
        this.LLJJI = path;
        invalidate();
    }

    public final void setSizePx(int i) {
        this.LLJJIII = i;
        requestLayout();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLJJIII;
        if (i3 > 0) {
            setMeasuredDimension(i3, i3);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public C418930Gbj(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, i);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1513240;
        }
        ColorDrawable colorDrawable = new ColorDrawable(iIntValue);
        this.LLJJIJI = colorDrawable;
        setPlaceholderImage(colorDrawable);
    }
}
