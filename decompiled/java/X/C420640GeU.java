package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420640GeU {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Eau] */
    public static final C367460Eau LIZ(Context context, boolean z) {
        final int[] iArr;
        final float[] fArr;
        final int iLIZIZ = LIZIZ(R.attr.zm, context);
        if (z) {
            iArr = new int[]{LIZIZ(R.attr.a04, context), LIZIZ(R.attr.zs, context), LIZIZ(R.attr.a16, context)};
            fArr = new float[]{0.0f, 0.5f, 1.0f};
        } else {
            iArr = new int[]{LIZIZ(R.attr.a09, context), LIZIZ(R.attr.cn, context), LIZIZ(R.attr.ci, context)};
            fArr = new float[]{0.0f, 0.5f, 1.0f};
        }
        final float f = 26.0f * context.getResources().getDisplayMetrics().density;
        return new Drawable(iLIZIZ, iArr, fArr, f) { // from class: X.0Eau
            public final int LIZ;
            public final int[] LIZIZ;
            public final float[] LIZJ;
            public final float LIZLLL = 0.2f;
            public final float LJ;
            public final Paint LJFF;
            public final Paint LJI;
            public final RectF LJII;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                this.LJFF.setColor(this.LIZ);
                RectF rectF = this.LJII;
                float f2 = this.LJ;
                canvas.drawRoundRect(rectF, f2, f2, this.LJFF);
                int alpha = this.LJI.getAlpha();
                this.LJI.setAlpha(C13LZ.LJ((int) (255 * this.LIZLLL), 0, 255));
                RectF rectF2 = this.LJII;
                float f3 = this.LJ;
                canvas.drawRoundRect(rectF2, f3, f3, this.LJI);
                this.LJI.setAlpha(alpha);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                this.LJII.set(rect.left, rect.top, rect.right, rect.bottom);
                RectF rectF = this.LJII;
                float f2 = rectF.left;
                float fCenterY = rectF.centerY();
                RectF rectF2 = this.LJII;
                this.LJI.setShader(new LinearGradient(f2, fCenterY, rectF2.right, rectF2.centerY(), this.LIZIZ, this.LIZJ, Shader.TileMode.CLAMP));
            }

            {
                this.LIZ = iLIZIZ;
                this.LIZIZ = iArr;
                this.LIZJ = fArr;
                this.LJ = f;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                this.LJFF = paint;
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                this.LJI = paint2;
                this.LJII = new RectF();
            }
        };
    }

    public static final int LIZIZ(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        int color = 0;
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return 0;
        }
        if (typedValue.resourceId != 0) {
            try {
                color = context.getResources().getColor(typedValue.resourceId, context.getTheme());
                return color;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return color;
            }
        }
        return typedValue.data;
    }
}
