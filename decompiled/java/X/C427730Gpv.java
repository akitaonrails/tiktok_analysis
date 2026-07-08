package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427730Gpv extends C427870Gq9 {
    public final Paint LLJJI;
    public final Drawable LLJJIII;
    public EnumC428930Grr LLJJIJI;
    public Path LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;

    public final void LJIIJJI() {
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        if (this.LLJJIJIIJIL == null && this.LLJJIJIL && this.LLJJJ) {
            int color = this.LLJJI.getColor();
            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(0.33f));
            c1331750klB.LIZJ = color;
            c1331750klB.LIZIZ = fLIZIZ;
        }
        setCircleOptions(c1331750klB.LIZ());
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public /* synthetic */ C427730Gpv(Context context) {
        this(context, null, R.attr.xe);
    }

    public final void LJIIJ(Canvas canvas) {
        Path path;
        Path path2;
        Path path3 = this.LLJJIJIIJIL;
        if (path3 == null) {
            super.onDraw(canvas);
            if (this.LLJJIJIL && this.LLJJJ && (path2 = this.LLJJIJIIJIL) != null) {
                canvas.drawPath(path2, this.LLJJI);
                return;
            }
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipPath(path3);
            super.onDraw(canvas);
            if (this.LLJJIJIL && this.LLJJJ && (path = this.LLJJIJIIJIL) != null) {
                canvas.drawPath(path, this.LLJJI);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        Path path = this.LLJJIJIIJIL;
        if (path == null) {
            super.onDrawForeground(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipPath(path);
            super.onDrawForeground(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public final void setBoundaryPath(Path path) {
        this.LLJJIJIIJIL = path;
        LJIIJJI();
        invalidate();
    }

    public final void setSize(EnumC428930Grr enumC428930Grr) {
        this.LLJJIJI = enumC428930Grr;
        requestLayout();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(C427740Gpw.LIZ(i, this.LLJJIJI.getDp$avatar_release()), C427740Gpw.LIZ(i2, this.LLJJIJI.getDp$avatar_release()));
    }

    public C427730Gpv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIJI = EnumC428930Grr.LARGE;
        this.LLJJIJIL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAvatarStackImageView, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarStackImageView__tux_avatarStackImageBorderColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarStackImageView__tux_avatarStackImagePlaceholderColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(0.33f)));
        this.LLJJI = paint;
        this.LLJJIII = new ColorDrawable(color2);
    }
}
