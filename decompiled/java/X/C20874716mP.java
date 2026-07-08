package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20874716mP extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new C20515815Po(context, attributeSet) { // from class: X.15Pp
            public Paint LLJILLL;
            public final RectF LLJJ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

            @Override // X.C20515815Po
            public final void LIZ() {
                super.LIZ();
                setUseCenter(true);
                Paint bgPaint = getBgPaint();
                bgPaint.setStyle(Paint.Style.FILL);
                setProgressPaint(new Paint(bgPaint));
                getProgressPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                getBorderPaint().setAntiAlias(true);
                getBorderPaint().setStyle(Paint.Style.STROKE);
                getBorderPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Paint paint = new Paint();
                this.LLJILLL = paint;
                paint.setAntiAlias(true);
                Paint paint2 = this.LLJILLL;
                if (paint2 == null) {
                    paint2 = null;
                }
                paint2.setStyle(Paint.Style.FILL);
                Paint paint3 = this.LLJILLL;
                (paint3 != null ? paint3 : null).setColor(C446980Hfs.LIZ(getContext(), R.color.a2p));
            }

            @Override // X.C20515815Po, android.view.View
            public final void onDraw(Canvas canvas) {
                setWillNotDraw(false);
                Paint paint = null;
                setLayerType(1, null);
                this.LLJJ.set(0.0f, 0.0f, getWidth$liveui_release(), getHeight$liveui_release());
                RectF rectF = this.LLJJ;
                float borderRadius = getBorderRadius();
                float borderRadius2 = getBorderRadius();
                Paint paint2 = this.LLJILLL;
                if (paint2 != null) {
                    paint = paint2;
                }
                canvas.drawRoundRect(rectF, borderRadius, borderRadius2, paint);
                canvas.drawCircle(getWidth$liveui_release() / 2, getHeight$liveui_release() / 2, getCircleRadius(), getBorderPaint());
                super.onDraw(canvas);
            }

            @Override // X.C20515815Po
            public void setCircleRadius(int i) {
                super.setCircleRadius(i);
            }
        };
    }
}
