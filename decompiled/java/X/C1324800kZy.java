package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0kZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324800kZy extends C1324790kZx {
    public static final /* synthetic */ int LLJILLL = 0;
    public final Paint LLILLJJLI;
    public Bitmap LLILLL;
    public Drawable LLILZ;
    public BitmapShader LLILZIL;
    public Canvas LLILZLL;
    public volatile boolean LLIZ;
    public float LLIZLLLIL;
    public final RectF LLJ;
    public int LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public final C1339410kxX LLJILJILJ;

    public final void LJI() {
        if (this.LLJILJIL) {
            Drawable drawable = getDrawable();
            this.LLILZ = drawable;
            if (drawable != null && getWidth() > 0 && getHeight() > 0) {
                Bitmap.Config config = this.LLILZ.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                int intrinsicWidth = this.LLILZ.getIntrinsicWidth();
                int intrinsicHeight = this.LLILZ.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                Bitmap bitmap = this.LLILLL;
                if (bitmap != null) {
                    if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.LLILLL.getHeight()) {
                        Canvas canvas = this.LLILZLL;
                        if (canvas != null) {
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            return;
                        }
                        return;
                    }
                    if (!this.LLILLL.isRecycled()) {
                        C786410Ut5.LJJJJ(this.LLILLL);
                    }
                }
                float f = this.LLJIJIL;
                this.LLILLL = Bitmap.createBitmap((int) (intrinsicWidth * f), (int) (intrinsicHeight * f), config);
                Canvas canvas2 = new Canvas(this.LLILLL);
                this.LLILZLL = canvas2;
                float f2 = this.LLJIJIL;
                if (f2 > 1.0f) {
                    canvas2.translate(((-intrinsicWidth) * (f2 - 1.0f)) / 2.0f, ((-intrinsicHeight) * (f2 - 1.0f)) / 2.0f);
                }
                Bitmap bitmap2 = this.LLILLL;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.LLILZIL = new BitmapShader(bitmap2, tileMode, tileMode);
                this.LLILLJJLI.setAntiAlias(true);
                this.LLILLJJLI.setShader(this.LLILZIL);
            }
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C1324800kZy(Context context) {
        super(context);
        float fLIZIZ = C11VU.LIZIZ(6.0f, getContext());
        this.LLILLJJLI = new Paint();
        this.LLIZ = true;
        this.LLIZLLLIL = fLIZIZ;
        this.LLJ = new RectF();
        this.LLJI = 0;
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = false;
        this.LLJILJILJ = new C1339410kxX(this, 3);
    }

    public final void LIZLLL(Canvas canvas) {
        Canvas canvas2;
        if (this.LLJILJIL) {
            if (this.LLIZ) {
                LJI();
                this.LLIZ = false;
            }
            Drawable drawable = this.LLILZ;
            if (drawable != null && (canvas2 = this.LLILZLL) != null) {
                drawable.setBounds(0, 0, canvas2.getWidth(), this.LLILZLL.getHeight());
                this.LLILZ.draw(this.LLILZLL);
            }
            if (this.LLJI == 0) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (float) (((double) getWidth()) / 2.0d), this.LLILLJJLI);
                return;
            }
            this.LLJ.set(0.0f, 0.0f, getWidth(), getHeight());
            RectF rectF = this.LLJ;
            float f = this.LLIZLLLIL;
            canvas.drawRoundRect(rectF, f, f, this.LLILLJJLI);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // X.C1324790kZx, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZLLL(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setClipStyle(int i) {
        this.LLJI = i;
    }

    @Override // X.C1324790kZx, X.C1322090kVb
    public void setController(InterfaceC1320850kTb interfaceC1320850kTb) {
        if (this.LLJILJIL) {
            this.LLIZ = true;
            setImageDrawable(null);
        }
        super.setController(interfaceC1320850kTb);
    }

    @Override // X.C1324790kZx
    public void setEnableAnimation(boolean z) {
        super.setEnableAnimation(z);
    }

    public void setRectFRadius(float f) {
        this.LLIZLLLIL = f;
    }

    public void setScaleBitmap(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.LLJIJIL = f;
    }

    public C1324800kZy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float fLIZIZ = C11VU.LIZIZ(6.0f, getContext());
        this.LLILLJJLI = new Paint();
        this.LLIZ = true;
        this.LLIZLLLIL = fLIZIZ;
        this.LLJ = new RectF();
        this.LLJI = 0;
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = false;
        this.LLJILJILJ = new C1339410kxX(this, 3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJI();
    }
}
