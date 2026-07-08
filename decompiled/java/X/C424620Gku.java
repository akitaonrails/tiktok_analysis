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

/* JADX INFO: renamed from: X.0Gku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424620Gku extends C424700Gl2 {
    public final Paint LLIZLLLIL;
    public Bitmap LLJ;
    public Drawable LLJI;
    public BitmapShader LLJIJIL;
    public Canvas LLJILJIL;
    public volatile boolean LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public final C0IE7 LLJJI;

    @Override // X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public void LIZJ() {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LIZIZ = true;
        getHierarchy().LJJIII(c1331100kk8);
        getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
        LIZLLL();
    }

    public final void LIZLLL() {
        if (this.LLJJ) {
            Drawable drawable = getDrawable();
            this.LLJI = drawable;
            if (drawable != null && getWidth() > 0 && getHeight() > 0) {
                Bitmap.Config config = this.LLJI.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                int intrinsicWidth = this.LLJI.getIntrinsicWidth();
                int intrinsicHeight = this.LLJI.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                Bitmap bitmap = this.LLJ;
                if (bitmap != null) {
                    if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.LLJ.getHeight()) {
                        Canvas canvas = this.LLJILJIL;
                        if (canvas != null) {
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            return;
                        }
                        return;
                    }
                    if (!this.LLJ.isRecycled()) {
                        C786410Ut5.LJJJJ(this.LLJ);
                    }
                }
                this.LLJILLL = intrinsicWidth / 2;
                this.LLJ = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                Canvas canvas2 = new Canvas(this.LLJ);
                this.LLJILJIL = canvas2;
                this.LLJI.setBounds(0, 0, canvas2.getWidth(), this.LLJILJIL.getHeight());
                Bitmap bitmap2 = this.LLJ;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.LLJIJIL = new BitmapShader(bitmap2, tileMode, tileMode);
                this.LLIZLLLIL.setAntiAlias(true);
                this.LLIZLLLIL.setShader(this.LLJIJIL);
            }
        }
    }

    @Override // X.C424700Gl2
    public InterfaceC1320650kTH<InterfaceC1330440kj4> getControllerListener() {
        return this.LLJJI;
    }

    public C424620Gku(Context context) {
        super(context);
        this.LLIZLLLIL = new Paint();
        this.LLJILJILJ = true;
        this.LLJJ = false;
        this.LLJJI = new C0IE7(this, 1);
    }

    @Override // X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.LLJJ) {
                if (this.LLJILJILJ) {
                    LIZLLL();
                    this.LLJILJILJ = false;
                }
                Drawable drawable = this.LLJI;
                if (drawable != null && (canvas2 = this.LLJILJIL) != null) {
                    drawable.draw(canvas2);
                }
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LLJILLL, this.LLIZLLLIL);
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
        if (this.LLJJ) {
            this.LLJILJILJ = true;
            setImageDrawable(null);
        }
        super.setController(interfaceC1320850kTb);
    }

    public C424620Gku(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = new Paint();
        this.LLJILJILJ = true;
        this.LLJJ = false;
        this.LLJJI = new C0IE7(this, 1);
    }

    public C424620Gku(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = new Paint();
        this.LLJILJILJ = true;
        this.LLJJ = false;
        this.LLJJI = new C0IE7(this, 1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZLLL();
    }
}
