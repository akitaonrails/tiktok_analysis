package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.12ME, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12ME extends C21413918rB {
    public final float LLILLJJLI;
    public String LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final boolean LLJILJIL;
    public int LLJILJILJ;
    public final float LLJILLL;
    public final Paint LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // android.widget.ProgressBar
    public synchronized int getProgress() {
        int progress;
        progress = super.getProgress();
        String strValueOf = String.valueOf(progress);
        this.LLILLL = strValueOf;
        if (!CardStruct.IStatusCode.DEFAULT.equals(strValueOf) && this.LLJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append("%");
            this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        }
        Paint paint = this.LLILZ;
        if (paint != null) {
            this.LLILZIL = paint.measureText(this.LLILLL);
        }
        return progress;
    }

    public int getDefaultDotProgress() {
        int i = this.LLJILJILJ;
        if (i == -1 || !this.LLJILJIL) {
            return -1;
        }
        return i;
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect bounds = getProgressDrawable().getBounds();
        float progress = getProgress() / getMax();
        float f = this.LLJILJILJ / 100.0f;
        if (C11VU.LJI(this)) {
            progress = 1.0f - progress;
            f = 1.0f - f;
        }
        if (this.LLJJIII) {
            canvas.drawText(this.LLILLL, ((bounds.width() * progress) - (this.LLILZIL / 2.0f)) + this.LLIZ, this.LLJIJIL, this.LLILZ);
        }
        if (this.LLJILJILJ != -1 && this.LLJILJIL) {
            canvas.drawCircle((bounds.width() * f) + this.LLIZ, ((getHeight() + this.LLJ) - this.LLJI) / 2.0f, LJI(this.LLJILLL, getContext()), this.LLJJ);
        }
    }

    public void setDefaultDotProgress(int i) {
        this.LLJILJILJ = i;
        invalidate();
    }

    public void setDisplayPercent(boolean z) {
        this.LLJJI = z;
    }

    public void setShowText(boolean z) {
        this.LLJJIII = z;
    }

    public void setTextColor(int i) {
        this.LLILZ.setColor(i);
        invalidate();
    }

    public void setTextSize(float f) {
        Paint paint = this.LLILZ;
        if (paint != null) {
            paint.setTextSize(f);
            invalidate();
        }
    }

    public C12ME(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public static float LJI(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public C12ME(Context context, AttributeSet attributeSet, int i) {
        Typeface typefaceLIZ;
        super(context, attributeSet, i);
        this.LLILLL = "";
        this.LLILZLL = true;
        this.LLJIJIL = LJI(10.0f, getContext());
        this.LLJJIII = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FilterBeautySeekBar, i, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int color = 0;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R$styleable.FilterBeautySeekBar_rateTextColor) {
                color = typedArrayObtainStyledAttributes.getColor(index, -1);
            } else if (index == R$styleable.FilterBeautySeekBar_rateTextSize) {
                this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimension(index, 15.0f);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.FilterBeautySeekBar_leftPadding)) {
            this.LLIZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.FilterBeautySeekBar_leftPadding, 0.0f);
        } else {
            this.LLIZ = LJI(10.0f, context);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.FilterBeautySeekBar_rightPadding)) {
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.FilterBeautySeekBar_rightPadding, 0.0f);
        } else {
            this.LLIZLLLIL = this.LLIZ;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.FilterBeautySeekBar_topPadding)) {
            this.LLJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.FilterBeautySeekBar_topPadding, 0.0f);
        } else {
            this.LLJ = LJI(13.0f, context);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.FilterBeautySeekBar_bottomPadding)) {
            this.LLJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.FilterBeautySeekBar_bottomPadding, 0.0f);
        } else {
            this.LLJI = this.LLJ;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.FilterBeautySeekBar_textBaselineHeight)) {
            this.LLJIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.FilterBeautySeekBar_textBaselineHeight, 10.0f);
        }
        this.LLJILJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FilterBeautySeekBar_showDefaultDot, false);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInt(R$styleable.FilterBeautySeekBar_defaultDotProgress, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.FilterBeautySeekBar_defaultDotColor, -1);
        this.LLJILLL = typedArrayObtainStyledAttributes.getFloat(R$styleable.FilterBeautySeekBar_defaultDotRadio, 2.5f);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.FilterBeautySeekBar_rateTextFont);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LLILZ = paint;
        paint.setAntiAlias(true);
        paint.setColor(color);
        if (!TextUtils.isEmpty(strXd)) {
            Typeface typefaceLIZ2 = C19736612Jw.LIZ(strXd);
            paint.setTypeface(typefaceLIZ2 == null ? Typeface.defaultFromStyle(1) : typefaceLIZ2);
        } else {
            C12MF c12mf = C12MF.MEDIUM;
            C19736612Jw c19736612Jw = C19736612Jw.LIZ;
            c19736612Jw.getClass();
            InterfaceC1609810rzf interfaceC1609810rzf = (InterfaceC1609810rzf) C19736612Jw.LIZJ.getValue(c19736612Jw, C19736612Jw.LIZIZ[0]);
            if (interfaceC1609810rzf != null && (typefaceLIZ = interfaceC1609810rzf.LIZ(c12mf.getVALUE())) != null) {
                paint.setTypeface(typefaceLIZ);
            }
        }
        paint.setTextSize(this.LLILLJJLI);
        Rect rect = new Rect();
        String strValueOf = String.valueOf(getProgress());
        this.LLILLL = strValueOf;
        paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        Paint paint2 = new Paint();
        this.LLJJ = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(color2);
        setPadding((int) this.LLIZ, (int) this.LLJ, (int) this.LLIZLLLIL, (int) this.LLJI);
        C786410Ut5.x3(getViewTreeObserver(), new C12YW(this, 1));
    }
}
