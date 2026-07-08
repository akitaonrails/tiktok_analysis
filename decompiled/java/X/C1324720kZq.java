package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0kZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324720kZq extends C1322110kVd implements InterfaceC1090410eTv {
    public Drawable LL;
    public InterfaceC1320380kSq LLILLJJLI;
    public C1090400eTu LLILLL;
    public int LLILZ;
    public Paint LLILZIL;
    public PorterDuffXfermode LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;

    public void setFailureImage(Drawable drawable) {
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLILZ++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLILLL == null) {
            this.LLILLL = new C1090400eTu();
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLILZ;
    }

    public Drawable getPlaceholderImage() {
        return this.LL;
    }

    public InterfaceC1320380kSq getPlaceholderImageScaleType() {
        return this.LLILLJJLI;
    }

    public C1324720kZq(Context context) {
        super(context);
        this.LLILLJJLI = InterfaceC1320380kSq.LIZ;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.LLIZ > 0.0f) {
            if (this.LLILZIL == null) {
                this.LLILZIL = new Paint(1);
                this.LLILZLL = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.LLILZIL.setXfermode(null);
            C417440GYk.LIZ(getWidth(), getHeight(), canvas, this.LLILZIL);
            super.draw(canvas);
            this.LLILZIL.setXfermode(this.LLILZLL);
            if (this.LLIZLLLIL) {
                if (!this.LLJIJIL) {
                    float width = getWidth();
                    float f = this.LLIZ;
                    canvas.drawCircle((width - f) - this.LLJ, this.LLJI + f, f, this.LLILZIL);
                } else {
                    float width2 = getWidth();
                    float f2 = this.LLIZ;
                    canvas.drawCircle((width2 + f2) - this.LLJ, this.LLJI + f2, f2, this.LLILZIL);
                }
            } else if (!this.LLJIJIL) {
                float f3 = this.LLJ;
                float f4 = this.LLIZ;
                canvas.drawCircle(f3 + f4, this.LLJI + f4, f4, this.LLILZIL);
            } else {
                float f5 = this.LLIZ;
                canvas.drawCircle((f5 - (2.0f * f5)) + this.LLJ, this.LLJI + f5, f5, this.LLILZIL);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setCutoutRadius(float f) {
        if (this.LLIZ != f) {
            this.LLIZ = f;
            invalidate();
        }
    }

    public void setCutoutStartOffset(float f) {
        if (this.LLJ != f) {
            this.LLJ = f;
            invalidate();
        }
    }

    public void setCutoutTopOffset(float f) {
        if (this.LLJI != f) {
            this.LLJI = f;
            invalidate();
        }
    }

    public void setImageCheckBitmap(Bitmap bitmap) {
        if (bitmap != null && bitmap.isRecycled()) {
            super.setImageDrawable(null);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public void setPlaceholderImage(Drawable drawable) {
        this.LL = drawable;
    }

    public void setPlaceholderImageScaleType(InterfaceC1320380kSq interfaceC1320380kSq) {
        this.LLILLJJLI = interfaceC1320380kSq;
    }

    public void setStacked(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            invalidate();
        }
    }

    public C1324720kZq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = InterfaceC1320380kSq.LIZ;
        LIZ(context, attributeSet);
    }

    public final void LIZ(Context context, AttributeSet attributeSet) {
        InterfaceC1320380kSq interfaceC1320380kSq;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SimpleDraweeView);
        this.LL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SimpleDraweeView_placeholderImage);
        switch (typedArrayObtainStyledAttributes.getInt(R$styleable.SimpleDraweeView_placeholderImageScaleType, -1)) {
            case 0:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
                break;
            case 1:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZIZ;
                break;
            case 2:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                break;
            case 3:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZLLL;
                break;
            case 4:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJ;
                break;
            case 5:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJFF;
                break;
            case 6:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                break;
            case 7:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJII;
                break;
            case 8:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJIIIIZZ;
                break;
            default:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
                break;
        }
        this.LLILLJJLI = interfaceC1320380kSq;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLIZLLLIL = z;
    }

    public C1324720kZq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = InterfaceC1320380kSq.LIZ;
        LIZ(context, attributeSet);
    }
}
