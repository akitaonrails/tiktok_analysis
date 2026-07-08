package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0uEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695920uEY extends AppCompatImageView {
    public C1669400tXm LL;
    public final Path LLILLJJLI;
    public C1516420pZ2 LLILLL;
    public Paint LLILZ;

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }

    public final void LIZ() {
        Path path = this.LLILLJJLI;
        path.reset();
        path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), getLayoutDirection() == 0 ? new float[]{this.LL.LIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZJ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZJ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZLLL.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZLLL.LIZ(9205357640488583168L, this.LLILLL)} : new float[]{this.LL.LIZIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZLLL.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZLLL.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZJ.LIZ(9205357640488583168L, this.LLILLL), this.LL.LIZJ.LIZ(9205357640488583168L, this.LLILLL)}, Path.Direction.CW);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Paint getBorder() {
        return this.LLILZ;
    }

    public final C1669400tXm getRoundCorners() {
        return this.LL;
    }

    public C1695920uEY(Context context) {
        super(context);
        this.LL = C1669050tXD.LIZIZ(0);
        this.LLILLJJLI = new Path();
        this.LLILLL = C786410Ut5.LJLJLLL(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLILLL = C786410Ut5.LJLJLLL(getContext());
        LIZ();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            Path path = this.LLILLJJLI;
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                super.onDraw(canvas);
                canvas.restoreToCount(iSave);
                Paint paint = this.LLILZ;
                if (paint != null) {
                    canvas.drawPath(this.LLILLJJLI, paint);
                }
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

    public final void setBorder(Paint paint) {
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setFlags(paint.getFlags() | 1);
        }
        this.LLILZ = paint;
        invalidate();
    }

    @Override // android.view.View
    public void setClipToOutline(boolean z) {
        super.setClipToOutline(false);
    }

    public final void setRoundCorners(C1669400tXm c1669400tXm) {
        this.LL = c1669400tXm;
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
