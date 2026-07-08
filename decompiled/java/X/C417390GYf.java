package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417390GYf extends C422800Ghy {
    public Paint LLJJIII;
    public boolean LLJJIJI;

    private final Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, getContext());
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        return paint;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final boolean getShouldDrawBorder() {
        return this.LLJJIJI;
    }

    @Override // X.C422800Ghy, X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        try {
            super.onDraw(canvas);
            if (this.LLJJIJI && (paint = this.LLJJIII) != null) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - (paint.getStrokeWidth() / 2), paint);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setShouldDrawBorder(boolean z) {
        this.LLJJIJI = z;
        if (!z) {
            this.LLJJIII = null;
        } else {
            if (this.LLJJIII != null) {
                return;
            }
            this.LLJJIII = getPaint();
        }
    }

    public C417390GYf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIII = getPaint();
        this.LLJJIJI = true;
    }
}
