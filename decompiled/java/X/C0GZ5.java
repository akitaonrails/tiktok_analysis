package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ5 extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final TextPaint LLILLL;
    public final RectF LLILZ;
    public final RectF LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public Bitmap LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public final /* synthetic */ C1775090wIF LLJJIII;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LLJIJIL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLJIJIL = null;
        this.LLJILJIL = true;
        this.LLJILJILJ = 0;
        this.LLJILLL = "";
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        int style;
        Bitmap bitmapCreateBitmap;
        Rect rect;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0 && this.LLIZ > 0.0f && this.LLIZLLLIL > 0.0f) {
            Drawable drawable = this.LLJJIII.LLILZLL.getDrawable();
            CharSequence text = this.LLJJIII.LLIZLLLIL.getText();
            if (text != null) {
                string = text.toString();
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            float textSize = this.LLJJIII.LLIZLLLIL.getTextSize();
            Typeface typeface = this.LLJJIII.LLIZLLLIL.getTypeface();
            if (typeface != null) {
                style = typeface.getStyle();
            } else {
                style = 0;
            }
            int iIdentityHashCode = System.identityHashCode(drawable);
            if ((this.LLJILJIL || (bitmap2 = this.LLJIJIL) == null || bitmap2.getWidth() != getWidth() || (bitmap3 = this.LLJIJIL) == null || bitmap3.getHeight() != getHeight() || this.LLJILJILJ != iIdentityHashCode || !Intrinsics.LJFF(this.LLJILLL, string) || this.LLJJ != textSize || this.LLJJI != style) && 1 != 0) {
                Bitmap bitmap4 = this.LLJIJIL;
                if (bitmap4 != null && bitmap4.getWidth() == getWidth() && (bitmap = this.LLJIJIL) != null && bitmap.getHeight() == getHeight()) {
                    bitmapCreateBitmap = this.LLJIJIL;
                } else {
                    Bitmap bitmap5 = this.LLJIJIL;
                    if (bitmap5 != null) {
                        bitmap5.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap5);
                    }
                    this.LLJIJIL = null;
                    this.LLJILJIL = true;
                    this.LLJILJILJ = 0;
                    this.LLJILLL = "";
                    if (getWidth() > 0 && getHeight() > 0) {
                        bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        this.LLJIJIL = bitmapCreateBitmap;
                    }
                }
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.eraseColor(0);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    if (drawable != null && this.LLILZ.width() > 0.0f && this.LLILZ.height() > 0.0f) {
                        Rect rect2 = new Rect(drawable.getBounds());
                        int alpha = drawable.getAlpha();
                        RectF rectF = this.LLILZ;
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                            float f = intrinsicWidth;
                            float f2 = intrinsicHeight;
                            float fMin = Math.min(rectF.width() / f, rectF.height() / f2);
                            float f3 = f * fMin;
                            float f4 = f2 * fMin;
                            float fWidth = rectF.left + ((rectF.width() - f3) * 0.5f);
                            float fHeight = rectF.top + ((rectF.height() - f4) * 0.5f);
                            rect = new Rect(C814420VxA.LIZIZ(fWidth), C814420VxA.LIZIZ(fHeight), C814420VxA.LIZIZ(fWidth + f3), C814420VxA.LIZIZ(fHeight + f4));
                        } else {
                            rect = new Rect(C814420VxA.LIZIZ(rectF.left), C814420VxA.LIZIZ(rectF.top), C814420VxA.LIZIZ(rectF.right), C814420VxA.LIZIZ(rectF.bottom));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                        drawable.draw(canvas2);
                        drawable.setAlpha(alpha);
                        drawable.setBounds(rect2);
                    }
                    if (!a0.LJJJIL(string) && this.LLILZIL.width() > 0.0f && this.LLILZIL.height() > 0.0f) {
                        this.LLILLL.set(this.LLJJIII.LLIZLLLIL.getPaint());
                        this.LLILLL.setColor(-1);
                        this.LLILLL.setShader(null);
                        float f5 = this.LLILZIL.top - this.LLILLL.getFontMetrics().top;
                        int iSave = canvas2.save();
                        canvas2.clipRect(this.LLILZIL);
                        canvas2.drawText(string, this.LLILZIL.left, f5, this.LLILLL);
                        canvas2.restoreToCount(iSave);
                    }
                    this.LLJILJIL = false;
                    this.LLJILJILJ = iIdentityHashCode;
                    this.LLJILLL = string;
                    this.LLJJ = textSize;
                    this.LLJJI = style;
                }
            }
            Bitmap bitmap6 = this.LLJIJIL;
            if (bitmap6 == null) {
                return;
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            float f6 = this.LLJ;
            float f7 = this.LLIZ * 0.5f;
            float f8 = f6 - f7;
            float f9 = this.LLJI;
            float f10 = this.LLIZLLLIL * 0.5f;
            float f11 = f6 + f7;
            Paint paint = this.LL;
            float f12 = this.LLJI;
            paint.setShader(new LinearGradient(f8, f12, f11, f12, new int[]{C2441009hQ.LJIIL(this.LLILZLL, 0), C2441009hQ.LJIIL(this.LLILZLL, 255), C2441009hQ.LJIIL(this.LLILZLL, 0)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            int iSave2 = canvas.save();
            canvas.rotate(45.0f, this.LLJ, this.LLJI);
            canvas.drawRect(f8, f9 - f10, f11, f9 + f10, this.LL);
            canvas.restoreToCount(iSave2);
            canvas.drawBitmap(bitmap6, 0.0f, 0.0f, this.LLILLJJLI);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0GZ5(C1775090wIF c1775090wIF, Context context) {
        super(context);
        this.LLJJIII = c1775090wIF;
        this.LL = new Paint(1);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LLILLJJLI = paint;
        this.LLILLL = new TextPaint(1);
        this.LLILZ = new RectF();
        this.LLILZIL = new RectF();
        this.LLJILJIL = true;
        this.LLJILLL = "";
    }
}
