package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425740Gmi extends C427870Gq9 {
    public float LLJJI;
    public final float LLJJIII;
    public final Path LLJJIJI;
    public final Path LLJJIJIIJIL;
    public final Region LLJJIJIL;
    public final Region LLJJJ;
    public final Region LLJJJIL;
    public Path LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final Paint LLJJL;

    private final float getInnerSize() {
        return C418440Gaw.LIZIZ(4);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            try {
                canvas.clipPath(this.LLJJJJ);
                super.onDraw(canvas);
                if (this.LLJJJJLIIL) {
                    canvas.drawPath(this.LLJJJJ, this.LLJJL);
                }
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

    public C425740Gmi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xh);
    }

    public C425740Gmi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIII = C418440Gaw.LIZIZ(16);
        this.LLJJIJI = new Path();
        this.LLJJIJIIJIL = new Path();
        this.LLJJIJIL = new Region();
        this.LLJJJ = new Region();
        this.LLJJJIL = new Region();
        this.LLJJJJ = new Path();
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 76));
        this.LLJJJJLIIL = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LLJJL = paint;
    }

    @Override // X.C427870Gq9, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJI = C418440Gaw.LIZIZ(5);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        this.LLJJIJI.reset();
        this.LLJJIJIIJIL.reset();
        this.LLJJIJIL.setEmpty();
        this.LLJJJ.setEmpty();
        this.LLJJJIL.setEmpty();
        float f = iLIZIZ * 0.5f;
        if (((Boolean) this.LLJJJJJIL.getValue()).booleanValue()) {
            this.LLJJIJI.addCircle((3 * f) - this.LLJJIII, f, getInnerSize() + f, Path.Direction.CW);
        } else {
            this.LLJJIJI.addCircle(-this.LLJJI, f, getInnerSize() + f, Path.Direction.CW);
        }
        this.LLJJIJIIJIL.addCircle(f, f, f, Path.Direction.CW);
        this.LLJJJIL.set(0, 0, iLIZIZ, iLIZIZ);
        this.LLJJIJIL.setPath(this.LLJJIJI, this.LLJJJIL);
        this.LLJJJ.setPath(this.LLJJIJIIJIL, this.LLJJJIL);
        this.LLJJJ.op(this.LLJJIJIL, Region.Op.DIFFERENCE);
        this.LLJJJJ = this.LLJJJ.getBoundaryPath();
    }
}
