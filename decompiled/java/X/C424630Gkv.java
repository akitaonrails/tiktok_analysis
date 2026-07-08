package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424630Gkv extends C1322110kVd {
    public final Paint LL;
    public Bitmap LLILLJJLI;
    public Drawable LLILLL;
    public BitmapShader LLILZ;
    public Canvas LLILZIL;
    public volatile boolean LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public final C0IE7 LLJ;

    public void LIZ() {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LIZIZ = true;
        getHierarchy().LJJIII(c1331100kk8);
        getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
        LIZJ();
    }

    public final void LIZJ() {
        if (this.LLIZLLLIL) {
            Drawable drawable = getDrawable();
            this.LLILLL = drawable;
            if (drawable != null && getWidth() > 0 && getHeight() > 0) {
                Bitmap.Config config = this.LLILLL.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                int intrinsicWidth = this.LLILLL.getIntrinsicWidth();
                int intrinsicHeight = this.LLILLL.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                Bitmap bitmap = this.LLILLJJLI;
                if (bitmap != null) {
                    if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.LLILLJJLI.getHeight()) {
                        Canvas canvas = this.LLILZIL;
                        if (canvas != null) {
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            return;
                        }
                        return;
                    }
                    if (!this.LLILLJJLI.isRecycled()) {
                        C786410Ut5.LJJJJ(this.LLILLJJLI);
                    }
                }
                this.LLIZ = intrinsicWidth / 2;
                this.LLILLJJLI = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                Canvas canvas2 = new Canvas(this.LLILLJJLI);
                this.LLILZIL = canvas2;
                this.LLILLL.setBounds(0, 0, canvas2.getWidth(), this.LLILZIL.getHeight());
                Bitmap bitmap2 = this.LLILLJJLI;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.LLILZ = new BitmapShader(bitmap2, tileMode, tileMode);
                this.LL.setAntiAlias(true);
                this.LL.setShader(this.LLILZ);
            }
        }
    }

    public InterfaceC1320650kTH<InterfaceC1330440kj4> getControllerListener() {
        return this.LLJ;
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.LLIZLLLIL) {
                if (this.LLILZLL) {
                    LIZJ();
                    this.LLILZLL = false;
                }
                Drawable drawable = this.LLILLL;
                if (drawable != null && (canvas2 = this.LLILZIL) != null) {
                    drawable.draw(canvas2);
                }
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LLIZ, this.LL);
                return;
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C1322090kVb
    public void setController(InterfaceC1320850kTb interfaceC1320850kTb) {
        if (this.LLIZLLLIL) {
            this.LLILZLL = true;
            setImageDrawable(null);
        }
        super.setController(interfaceC1320850kTb);
    }

    public C424630Gkv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new Paint();
        this.LLILZLL = true;
        this.LLIZLLLIL = false;
        this.LLJ = new C0IE7(this, 3);
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZJ();
    }
}
