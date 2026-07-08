package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20588215hI extends AppCompatImageView {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final boolean LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final Xfermode LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public RectF LLJJ;
    public final RectF LLJJI;
    public final Paint LLJJIII;
    public final Path LLJJIJI;
    public final Path LLJJIJIIJIL;

    private final float[] getBorderRadii() {
        return (float[]) this.LLJILJILJ.getValue();
    }

    private final float[] getSrcRadii() {
        return (float[]) this.LLJILLL.getValue();
    }

    public final void LIZ() {
        if (this.LLILZ > 0) {
            int length = getBorderRadii().length;
            for (int i = 0; i < length; i++) {
                getBorderRadii()[i] = this.LLILZ;
                getSrcRadii()[i] = this.LLILZ - (this.LLILLJJLI / 2.0f);
            }
            return;
        }
        getBorderRadii()[0] = this.LLILZIL;
        getBorderRadii()[1] = this.LLILZIL;
        getBorderRadii()[2] = this.LLILZLL;
        getBorderRadii()[3] = this.LLILZLL;
        getBorderRadii()[4] = this.LLIZLLLIL;
        getBorderRadii()[5] = this.LLIZLLLIL;
        getBorderRadii()[6] = this.LLIZ;
        getBorderRadii()[7] = this.LLIZ;
        getSrcRadii()[0] = this.LLILZIL - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[1] = this.LLILZIL - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[2] = this.LLILZLL - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[3] = this.LLILZLL - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[4] = this.LLIZLLLIL - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[5] = this.LLIZLLLIL - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[6] = this.LLIZ - (this.LLILLJJLI / 2.0f);
        getSrcRadii()[7] = this.LLIZ - (this.LLILLJJLI / 2.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZJ(Canvas canvas) {
        canvas.saveLayer(this.LLJJ, null, 31);
        if (!this.LL) {
            int i = this.LLJIJIL;
            int i2 = this.LLILLJJLI;
            int i3 = this.LLJILJIL;
            canvas.scale(((i - (i2 * 2)) * 1.0f) / i, ((i3 - (i2 * 2)) * 1.0f) / i3, i / 2.0f, i3 / 2.0f);
        }
        super.onDraw(canvas);
        this.LLJJIII.reset();
        this.LLJJIJI.reset();
        this.LLJJIJI.addRoundRect(this.LLJJ, getSrcRadii(), Path.Direction.CCW);
        this.LLJJIII.setAntiAlias(true);
        this.LLJJIII.setStyle(Paint.Style.FILL);
        this.LLJJIII.setXfermode(this.LLJI);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.LLJJIJI, this.LLJJIII);
        } else {
            Path path = this.LLJJIJIIJIL;
            if (path != null) {
                path.addRect(this.LLJJ, Path.Direction.CCW);
            }
            Path path2 = this.LLJJIJIIJIL;
            if (path2 != null) {
                path2.op(this.LLJJIJI, Path.Op.DIFFERENCE);
            }
            Path path3 = this.LLJJIJIIJIL;
            if (path3 != null) {
                canvas.drawPath(path3, this.LLJJIII);
            }
        }
        this.LLJJIII.setXfermode(null);
        int i4 = this.LLJ;
        if (i4 != 0) {
            this.LLJJIII.setColor(i4);
            canvas.drawPath(this.LLJJIJI, this.LLJJIII);
        }
        canvas.restore();
        int i5 = this.LLILLJJLI;
        if (i5 > 0) {
            int i6 = this.LLILLL;
            RectF rectF = this.LLJJI;
            float[] borderRadii = getBorderRadii();
            this.LLJJIJI.reset();
            this.LLJJIII.setStrokeWidth(i5);
            this.LLJJIII.setColor(i6);
            this.LLJJIII.setStyle(Paint.Style.STROKE);
            this.LLJJIJI.addRoundRect(rectF, borderRadii, Path.Direction.CCW);
            canvas.drawPath(this.LLJJIJI, this.LLJJIII);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C20588215hI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20588215hI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = -1;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(150));
        this.LLJILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(151));
        this.LLJJ = new RectF();
        this.LLJJI = new RectF();
        this.LLJJIII = new Paint();
        this.LLJJIJI = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ECRoundImageView, 0, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R$styleable.ECRoundImageView_isCoverSrc) {
                this.LL = typedArrayObtainStyledAttributes.getBoolean(index, this.LL);
            } else if (index == R$styleable.ECRoundImageView_borderWidth) {
                this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LLILLJJLI);
            } else if (index == R$styleable.ECRoundImageView_borderColor) {
                this.LLILLL = typedArrayObtainStyledAttributes.getColor(index, this.LLILLL);
            } else if (index == R$styleable.ECRoundImageView_radius) {
                this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LLILZ);
            } else if (index == R$styleable.ECRoundImageView_topLeftRadius) {
                this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LLILZIL);
            } else if (index == R$styleable.ECRoundImageView_topRightRadius) {
                this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LLILZLL);
            } else if (index == R$styleable.ECRoundImageView_bottomLeftRadius) {
                this.LLIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LLIZ);
            } else if (index == R$styleable.ECRoundImageView_bottomRightRadius) {
                this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LLIZLLLIL);
            } else if (index == R$styleable.ECRoundImageView_maskColor) {
                this.LLJ = typedArrayObtainStyledAttributes.getColor(index, this.LLJ);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT <= 27) {
            this.LLJI = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.LLJI = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.LLJJIJIIJIL = new Path();
        }
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJIJIL = i;
        this.LLJILJIL = i2;
        float f = this.LLILLJJLI / 2.0f;
        this.LLJJI.set(f, f, i - f, i2 - f);
        this.LLJJ.set(0.0f, 0.0f, this.LLJIJIL, this.LLJILJIL);
        if (this.LL) {
            this.LLJJ = this.LLJJI;
        }
    }
}
