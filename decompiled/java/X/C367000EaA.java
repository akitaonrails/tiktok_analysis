package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0EaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367000EaA extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public LinearGradient LLILZ;
    public LinearGradient LLILZIL;
    public LinearGradient LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.LLILLL);
        this.LLILLJJLI.setShader(null);
        this.LLILLJJLI.setColor(ColorProtector.parseColor("#A75CFF"));
        float f = height * 0.5f;
        canvas.drawRect(0.0f, 0.0f, width, f, this.LLILLJJLI);
        this.LLILLJJLI.setShader(this.LLILZ);
        canvas.drawRect(0.0f, f, width, height * 0.9f, this.LLILLJJLI);
        this.LL.setShader(null);
        this.LL.setColor(ColorProtector.parseColor("#5053FF"));
        float f2 = height * 0.1f;
        canvas.drawRect(0.0f, 0.0f, width, f2, this.LL);
        this.LL.setShader(this.LLILZIL);
        canvas.drawRect(0.0f, f2, width, f, this.LL);
    }

    public C367000EaA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new Paint(1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.LLILZLL = new LinearGradient(0.0f, 0.0f, 0.0f, f, ColorProtector.parseColor("#FFB3BD"), ColorProtector.parseColor("#FFB3BD"), Shader.TileMode.CLAMP);
        float f2 = 0.5f * f;
        this.LLILZ = new LinearGradient(0.0f, f2, 0.0f, f * 0.9f, ColorProtector.parseColor("#A75CFF"), 0, Shader.TileMode.CLAMP);
        this.LLILZIL = new LinearGradient(0.0f, f * 0.1f, 0.0f, f2, ColorProtector.parseColor("#5053FF"), 0, Shader.TileMode.CLAMP);
        this.LLILLL.setShader(this.LLILZLL);
    }
}
