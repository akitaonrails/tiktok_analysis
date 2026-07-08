package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427590Gph extends C427660Gpo {
    public final Path LLJL;
    public final Matrix LLJLIL;
    public Bitmap LLJLILLLLZIIL;
    public final Paint LLJLL;

    public C427590Gph(Context context) {
        this(context, null, 6, 0);
    }

    public C427590Gph(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIILJJIL(Canvas canvas) {
        if (!this.LLJL.isEmpty() && this.LLJLILLLLZIIL != null) {
            int iSave = canvas.save();
            try {
                canvas.clipPath(this.LLJL, Region.Op.DIFFERENCE);
                super.onDraw(canvas);
                canvas.restoreToCount(iSave);
                iSave = canvas.save();
                try {
                    Bitmap bitmap = this.LLJLILLLLZIIL;
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, this.LLJLIL, this.LLJLL);
                        canvas.restoreToCount(iSave);
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } finally {
                }
            } finally {
            }
        }
        super.onDraw(canvas);
    }

    @Override // X.C427660Gpo, X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIILJJIL(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setAvatarSize(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null && layoutParams2.width == i && (layoutParams = getLayoutParams()) != null && layoutParams.height == i) {
            return;
        }
        C447550Hgn.LJFF(this, Integer.valueOf(i), Integer.valueOf(i));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
        c1331750klB.LIZJ = C960203pA.LIZ(R.attr.br, getContext());
        c1331750klB.LJ = i / 2;
        setCircleOptions(c1331750klB.LIZ());
    }

    public final void setBitmap(Bitmap bitmap) {
        this.LLJLILLLLZIIL = bitmap;
    }

    public final void setMatrixOfBitmap(Function1<? super Matrix, Unit> function1) {
        function1.invoke(this.LLJLIL);
    }

    public final void setPathToClip(Function1<? super Path, Unit> function1) {
        function1.invoke(this.LLJL);
    }

    public C427590Gph(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJL = new Path();
        this.LLJLIL = new Matrix();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLJLL = paint;
    }

    public /* synthetic */ C427590Gph(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
