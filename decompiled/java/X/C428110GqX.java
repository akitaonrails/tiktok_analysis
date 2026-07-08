package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428110GqX extends C09AY implements Function1<Context, C416240GTu> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C1668650tWZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C428110GqX(Context context, long j, float f, C1668650tWZ c1668650tWZ) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = j;
        this.LLILLL = f;
        this.LLILZ = c1668650tWZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0GTu] */
    @Override // kotlin.jvm.functions.Function1
    public final C416240GTu invoke(Context context) {
        final Context context2 = this.LL;
        ?? r5 = new View(context2) { // from class: X.0GTu
            public Paint LL;
            public final Path LLILLJJLI;
            public CornerPathEffect LLILLL;
            public final PorterDuffXfermode LLILZ;
            public float LLILZIL;
            public final int LLILZLL;

            {
                int iIntValue;
                super(context2, null);
                this.LLILLJJLI = new Path();
                this.LLILLL = new CornerPathEffect(90.0f);
                this.LLILZ = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                this.LLILZLL = iIntValue;
                TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes((AttributeSet) null, R$styleable.AIGCCameraMaskView);
                int color = typedArrayObtainStyledAttributes.getColor(R$styleable.AIGCCameraMaskView_maskColor, iIntValue);
                float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.AIGCCameraMaskView_cornerRadius, 90.0f);
                typedArrayObtainStyledAttributes.recycle();
                Paint paint = new Paint(1);
                paint.setColor(color);
                paint.setStyle(Paint.Style.FILL);
                this.LL = paint;
                this.LLILLL = new CornerPathEffect(dimension);
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LL);
                this.LL.setXfermode(this.LLILZ);
                this.LL.setPathEffect(this.LLILLL);
                int width = getWidth();
                int height = getHeight();
                if (width > height) {
                    width = height;
                }
                float f = (width / 2.0f) - this.LLILZIL;
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                this.LLILLJJLI.moveTo(width2, height2 - f);
                int i = 1;
                do {
                    double d = (((double) i) * 3.141592653589793d) / ((double) 3);
                    double d2 = f;
                    this.LLILLJJLI.lineTo((float) (((double) width2) + (Math.sin(d) * d2)), (float) (((double) height2) - (d2 * Math.cos(d))));
                    i++;
                } while (i < 7);
                this.LLILLJJLI.close();
                canvas.drawPath(this.LLILLJJLI, this.LL);
                this.LL.setXfermode(null);
                this.LL.setPathEffect(null);
                canvas.restoreToCount(iSaveLayer);
            }

            public final void setCornerRadius(float f) {
                this.LLILLL = new CornerPathEffect(f);
            }

            public final void setMaskColor(Integer num) {
                int iIntValue;
                Paint paint = new Paint(1);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = this.LLILZLL;
                }
                paint.setColor(iIntValue);
                paint.setStyle(Paint.Style.FILL);
                this.LL = paint;
            }

            public final void setPadding(float f) {
                this.LLILZIL = f;
            }
        };
        long j = this.LLILLJJLI;
        float f = this.LLILLL;
        C1668650tWZ c1668650tWZ = this.LLILZ;
        r5.setMaskColor(Integer.valueOf(C1685850tyJ.LJIIIZ(j)));
        r5.setPadding(f);
        if (c1668650tWZ != null) {
            r5.setCornerRadius(c1668650tWZ.LL);
        }
        return r5;
    }
}
