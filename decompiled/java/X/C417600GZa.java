package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C417600GZa extends AppCompatImageView {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Path LLILZIL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(this.LL, this.LLILLL) + Math.max(this.LLILLJJLI, this.LLILZ);
        int iMax2 = Math.max(this.LL, this.LLILLJJLI) + Math.max(this.LLILLL, this.LLILZ);
        if (width >= iMax && height > iMax2) {
            this.LLILZIL.reset();
            this.LLILZIL.moveTo(this.LL, 0.0f);
            this.LLILZIL.lineTo(width - this.LLILLJJLI, 0.0f);
            float f = width;
            this.LLILZIL.quadTo(f, 0.0f, f, this.LLILLJJLI);
            this.LLILZIL.lineTo(f, height - this.LLILZ);
            float f2 = height;
            this.LLILZIL.quadTo(f, f2, width - this.LLILZ, f2);
            this.LLILZIL.lineTo(this.LLILLL, f2);
            this.LLILZIL.quadTo(0.0f, f2, 0.0f, height - this.LLILLL);
            this.LLILZIL.lineTo(0.0f, this.LL);
            this.LLILZIL.quadTo(0.0f, 0.0f, this.LL, 0.0f);
            canvas.clipPath(this.LLILZIL);
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C417600GZa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = new Path();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_LiveRoundImageView);
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ttlive_LiveRoundImageView_ttlive_radius, 0);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ttlive_LiveRoundImageView_ttlive_radius_top_left, 0);
            this.LL = dimensionPixelOffset2;
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ttlive_LiveRoundImageView_ttlive_radius_top_right, 0);
            this.LLILLJJLI = dimensionPixelOffset3;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ttlive_LiveRoundImageView_ttlive_radius_bottom_left, 0);
            this.LLILLL = dimensionPixelOffset4;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ttlive_LiveRoundImageView_ttlive_radius_bottom_right, 0);
            this.LLILZ = dimensionPixelOffset5;
            if (dimensionPixelOffset2 == 0) {
                this.LL = dimensionPixelOffset;
            }
            if (dimensionPixelOffset3 == 0) {
                this.LLILLJJLI = dimensionPixelOffset;
            }
            if (dimensionPixelOffset4 == 0) {
                this.LLILLL = dimensionPixelOffset;
            }
            if (dimensionPixelOffset5 == 0) {
                this.LLILZ = dimensionPixelOffset;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
