package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS21S0102000_33;
import Y.AUListenerS280S0100000_33;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.19P3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19P3 extends View {
    public int LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public float LLJIJIL;
    public Paint LLJILJIL;
    public Paint LLJILJILJ;
    public Paint LLJILLL;
    public Paint LLJJ;
    public Paint LLJJI;
    public Paint LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public String LLJJIJIL;
    public float LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final Rect LLJJJJLIIL;
    public boolean LLJJL;
    public IntRange LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public float LLLF;
    public float LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public float LLLII;
    public int LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public boolean LLLILZ;
    public int LLLILZJ;
    public boolean LLLILZLLLI;
    public float LLLIZZ;
    public int LLLJ;
    public Bitmap LLLJIL;

    public InterfaceC1213640hgg getOnLevelChangeListener() {
        return null;
    }

    public void setOnLevelChangeListener(InterfaceC1213640hgg interfaceC1213640hgg) {
    }

    public void setOnTextShowListener(InterfaceC1213670hgj interfaceC1213670hgj) {
    }

    public final void LIZIZ() {
        this.LLJI = (int) (this.LLILLJJLI - this.LLJZ);
        C1287910jcT.LIZIZ(3.0f);
        C1287910jcT.LIZIZ(3.0f);
        this.LLJIJIL = (this.LL - (this.LLILZLL * 2)) / this.LLILLL;
        setLayerType(1, null);
        this.LLJ = 1073741824;
        Paint paint = new Paint();
        this.LLJILJIL = paint;
        int i = this.LLLIILIL;
        if (this.LLLILZLLLI) {
            i = this.LLLIIII;
        }
        paint.setColor(i);
        this.LLJILJIL.setStrokeWidth(this.LLLFF);
        this.LLJILJIL.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LLJILJIL.setStrokeCap(Paint.Cap.ROUND);
        if (this.LLLILZ) {
            this.LLJILJIL.setShadowLayer(C1287910jcT.LIZIZ(1.0f), 0.0f, 0.0f, 1073741824);
        }
        this.LLJILJIL.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LLJILJILJ = paint2;
        paint2.setColor(this.LLIZLLLIL);
        int i2 = this.LLLJ;
        if (i2 != 255) {
            this.LLJILJILJ.setAlpha(i2);
        }
        this.LLJILJILJ.setStrokeWidth(this.LLLFF);
        this.LLJILJILJ.setAntiAlias(true);
        this.LLJILJILJ.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LLJILJILJ.setStrokeCap(Paint.Cap.ROUND);
        if (this.LLLILZ) {
            this.LLJILJILJ.setShadowLayer(C1287910jcT.LIZIZ(1.0f), 0.0f, 0.0f, 1073741824);
        }
        Paint paint3 = new Paint();
        this.LLJILLL = paint3;
        int i3 = this.LLLIL;
        if (this.LLLILZLLLI) {
            i3 = this.LLLIIII;
        }
        paint3.setColor(i3);
        this.LLJILLL.setAntiAlias(true);
        this.LLJILLL.setStyle(Paint.Style.FILL);
        if (this.LLLILZ) {
            this.LLJILLL.setShadowLayer(C1287910jcT.LIZIZ(3.0f), 0.0f, 0.0f, this.LLJ);
        }
        Paint paint4 = new Paint();
        this.LLJJI = paint4;
        int i4 = this.LLLILZJ;
        if (this.LLLILZLLLI) {
            i4 = this.LLLIIII;
        }
        paint4.setColor(i4);
        this.LLJJI.setStyle(Paint.Style.FILL);
        this.LLJJI.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.LLJJIII = paint5;
        paint5.setColor(this.LLJLL);
        this.LLJJIII.setTextSize(this.LLJLLL);
        this.LLJJIII.setAntiAlias(true);
        if (this.LLLILZ) {
            this.LLJJIII.setShadowLayer(C1287910jcT.LIZIZ(3.0f), 0.0f, 0.0f, this.LLJ);
        }
        this.LLJJJJJIL = true;
        Paint paint6 = this.LLJJ;
        int i5 = this.LLJLLIL;
        if (this.LLLILZLLLI) {
            i5 = this.LLLIIII;
        }
        paint6.setColor(i5);
        invalidate();
    }

    @Override // android.view.View
    public final void buildDrawingCache() {
        super.buildDrawingCache();
    }

    public final int LIZ(int i) {
        int i2;
        int i3 = this.LLLFZ;
        if (i3 > 1) {
            if (i % i3 >= i3 / 2.0f) {
                i2 = (i / i3) + 1;
            } else {
                i2 = i / i3;
            }
            i = i2 * i3;
        }
        int i4 = this.LLILLL;
        if (i > i4) {
            return i4;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        super.buildDrawingCache(z);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        int i;
        super.onDraw(canvas);
        if (!this.LLJJJJJIL) {
            return;
        }
        float f = this.LLJJIJI * this.LLJIJIL;
        int i2 = this.LLILZLL;
        float f2 = this.LLJI;
        canvas.drawLine(i2, f2, this.LL - i2, f2, this.LLJILJILJ);
        if (this.LLLIIIIL) {
            float f3 = this.LLILZLL;
            float f4 = this.LLJIJIL;
            float f5 = this.LLJI;
            float f6 = this.LLLI * f4;
            canvas.drawLine(f3 + (50.0f * f4), f5, f3 + f6 + (f - f6), f5, this.LLJILJIL);
        } else {
            float f7 = this.LLILZLL;
            float f8 = this.LLJI;
            canvas.drawLine(f7, f8, f7 + f, f8, this.LLJILJIL);
        }
        canvas.drawCircle(this.LLILZLL + f, this.LLJI, this.LLJZ, this.LLJILLL);
        if (this.LLLFFI && (i = this.LLLI) >= 0 && i <= 100) {
            canvas.drawCircle(this.LLILZLL + (i * this.LLJIJIL), this.LLJI, this.LLILZIL, this.LLJJI);
        }
        if (this.LLJLLIL != 0) {
            canvas.drawCircle(this.LLILZLL + f, this.LLJI, this.LLLIIL, this.LLJJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJLIL);
        sbLIZ.append(" ");
        int iRound = this.LLJJIJI;
        if (this.LLLIIIIL) {
            iRound = Math.round((iRound / 100.0f) * (this.LLJJLIIIJLLLLLLLZ.LJFF().intValue() - this.LLJJLIIIJLLLLLLLZ.getStart().intValue())) + this.LLJJLIIIJLLLLLLLZ.getStart().intValue();
        }
        sbLIZ.append(iRound);
        this.LLJJIJIL = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJIJI == this.LLLI && (str = this.LLJLILLLLZIIL) != null) {
            this.LLJJIJIL = str;
        }
        if (this.LLJJL) {
            String str2 = this.LLJJIJIL;
            this.LLJJIII.getTextBounds(str2, 0, str2.length(), this.LLJJJJLIIL);
            float f9 = ((this.LLJI - this.LLJZ) - this.LLL) - this.LLLIZZ;
            float f10 = this.LLJZIJLIL;
            float f11 = ((this.LLILZLL + f) - (f10 / 2.0f)) - this.LLLII;
            float fHeight = this.LLJJJJLIIL.height() + f9 + this.LLLF;
            canvas.drawBitmap(this.LLLJIL, (Rect) null, new Rect((int) f11, (int) f9, (int) (f11 + this.LLJZIJLIL), (int) (f9 + this.LLL)), this.LLJJIII);
            canvas.drawText(str2, (((f10 - this.LLJJJJLIIL.width()) / 2.0f) + f11) - C1287910jcT.LIZIZ(4.0f), fHeight, this.LLJJIII);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.LLLILZLLLI) {
            return false;
        }
        if (!this.LLJJJJ) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.LLJJIJIIJIL = 0;
                    }
                } else {
                    int iLIZ = LIZ(this.LLJJIJIIJIL + ((int) ((motionEvent.getX() - this.LLJJJ) / this.LLJIJIL)));
                    if (this.LLJJIJI != iLIZ) {
                        this.LLJJIJI = iLIZ;
                    }
                    setTextVisible(0);
                    return true;
                }
            } else {
                float x = motionEvent.getX();
                if (this.LLJJJIL && Math.abs(x - this.LLJJJ) <= C1287910jcT.LIZIZ(3.0f)) {
                    int iLIZ2 = LIZ((int) ((x - this.LLILZLL) / this.LLJIJIL));
                    this.LLJJIJI = iLIZ2;
                    LIZJ(iLIZ2, iLIZ2);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 48));
                valueAnimatorOfFloat.addListener(new ALAdapterS27S0100000_33(this, 24));
                valueAnimatorOfFloat.start();
                return true;
            }
        } else {
            if (motionEvent.getY() < getHeight() - (this.LLJZ * 2.0f)) {
                setTextVisible(4);
                return false;
            }
            this.LLJJIJIIJIL = this.LLJJIJI;
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            if (Math.abs(x2 - (this.LLILZLL + (this.LLJJIJI * this.LLJIJIL))) <= this.LLILZ * 3 && Math.abs(y - this.LLJI) <= this.LLILZ * 3) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            this.LLJJJIL = z2;
            if (z2 && !this.LLJL) {
                return false;
            }
            float x3 = motionEvent.getX();
            this.LLJJJ = x3;
            int iLIZ3 = LIZ((int) ((x3 - this.LLILZLL) / this.LLJIJIL));
            if (this.LLJJIJI != iLIZ3) {
                this.LLJJIJI = iLIZ3;
                this.LLJJIJIIJIL = iLIZ3;
                setTextVisible(0);
                return true;
            }
        }
        return true;
    }

    public void setCanShow(boolean z) {
        this.LLLIIIL = z;
    }

    public void setCircleDotColor(int i) {
        Paint paint = this.LLJJ;
        this.LLJLLIL = i;
        paint.setColor(i);
        invalidate();
    }

    public void setClickMode(boolean z) {
        this.LLJL = z;
    }

    public void setDefaultCircleColor(int i) {
        this.LLLILZJ = i;
    }

    public void setDefaultValue(int i) {
        this.LLLI = i;
        postInvalidate();
    }

    public void setDefaultValueText(String str) {
        this.LLJLILLLLZIIL = str;
    }

    public void setDisableColor(int i) {
        this.LLLIIII = i;
    }

    public void setEnable(Boolean bool) {
        this.LLLILZLLLI = !bool.booleanValue();
        LIZIZ();
    }

    public void setIsTwoWayMode(boolean z) {
        this.LLLIIIIL = z;
    }

    public void setLevel(int i) {
        this.LLJJIJI = i;
        LIZJ(i, i);
    }

    public void setLevelWithOutAnim(int i) {
        if (this.LLJJIJI == i) {
            return;
        }
        this.LLJJIJI = i;
        invalidate();
    }

    public void setPaintBarColor(int i) {
        this.LLLIILIL = i;
    }

    public void setPaintCircleColor(int i) {
        this.LLLIL = i;
    }

    public void setShadowMode(boolean z) {
        this.LLLILZ = z;
    }

    public void setTextVisible(int i) {
        if (i == 0) {
            this.LLJJL = true;
        } else {
            this.LLJJL = false;
        }
        invalidate();
    }

    public void setTwoWayDisplayRange(IntRange intRange) {
        this.LLJJLIIIJLLLLLLLZ = intRange;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (!this.LLLIIIL && i == 0) {
            return;
        }
        super.setVisibility(i);
    }

    public void setmAttrsTextColor(int i) {
        this.LLJLL = i;
    }

    public void setmColorWhiteHint(int i) {
        this.LLIZLLLIL = i;
    }

    public C19P3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = 100;
        int iLIZIZ = C1287910jcT.LIZIZ(2.0f);
        int iLIZIZ2 = C1287910jcT.LIZIZ(8.0f);
        this.LLILZ = iLIZIZ2;
        this.LLILZIL = C1287910jcT.LIZIZ(2.0f);
        this.LLILZLL = C1287910jcT.LIZIZ(12.0f) + iLIZIZ2;
        int iLIZIZ3 = C1287910jcT.LIZIZ(29.0f);
        int iLIZIZ4 = C1287910jcT.LIZIZ(40.0f);
        int iLIZIZ5 = C1287910jcT.LIZIZ(7.0f);
        this.LLJJJJ = true;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = new Rect();
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = new IntRange(-50, 50);
        this.LLJL = true;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = 0;
        this.LLJLLIL = 0;
        this.LLJLLL = 0.0f;
        this.LLJZ = 0.0f;
        this.LLJZIJLIL = 0.0f;
        this.LLL = 0.0f;
        this.LLLF = 0.0f;
        this.LLLFF = 0.0f;
        this.LLLFFI = false;
        this.LLLI = 80;
        this.LLLII = 0.0f;
        C1287910jcT.LIZIZ(20.0f);
        this.LLLIIII = 0;
        this.LLLIIIIL = false;
        this.LLLIIIL = true;
        this.LLLILZLLLI = false;
        this.LLLIZZ = 0.0f;
        this.LLLJ = 255;
        this.LLIZ = C446980Hfs.LIZ(context, R.color.white);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LevelAdjustBar);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LevelAdjustBar_text);
            this.LLJLIL = strXd == null ? "" : strXd;
            this.LLJLL = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_textColor, -1);
            this.LLJLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_circleDotColor, 0);
            this.LLJLLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_textSize, C1287910jcT.LIZIZ(13.0f));
            this.LLLIILIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_paintBarColor, this.LLIZ);
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_paintHintBarColor, C446980Hfs.LIZ(context, com.zhiliaoapp.musically.R.color.hj));
            this.LLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_CircleColor, this.LLIZ);
            typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_spacing, 10.0f);
            this.LLJZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_sliderRadius, iLIZIZ2);
            this.LLLFF = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_lineWidth, iLIZIZ);
            this.LLJZIJLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_textBgmWidth, iLIZIZ4);
            this.LLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_textBgmHeight, iLIZIZ3);
            this.LLLF = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_textMarginTop, iLIZIZ5);
            this.LLLILZJ = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_defaultCircle, this.LLIZ);
            this.LLLFFI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LevelAdjustBar_showFlag, false);
            this.LLLII = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_textRightMargin, 0.0f);
            this.LLLFZ = typedArrayObtainStyledAttributes.getInt(R$styleable.LevelAdjustBar_step, 1);
            this.LLLILZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LevelAdjustBar_shadow_mode, true);
            this.LLLIIL = C1287910jcT.LIZIZ(2.5f);
            this.LLLIIII = typedArrayObtainStyledAttributes.getColor(R$styleable.LevelAdjustBar_disable_color, -7829368);
            this.LLLIZZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LevelAdjustBar_textBottomMargin, C1287910jcT.LIZIZ(12.0f));
            this.LLLJ = typedArrayObtainStyledAttributes.getInt(R$styleable.LevelAdjustBar_paintHintBarColorAlpha, 255);
            this.LLLI = typedArrayObtainStyledAttributes.getInt(R$styleable.LevelAdjustBar_defaultLevel, 80);
            Paint paint = new Paint();
            this.LLJJ = paint;
            paint.setStyle(Paint.Style.FILL);
            this.LLJJ.setAntiAlias(true);
            this.LLJJ.setColor(this.LLJLLIL);
            this.LLLJIL = BitmapFactory.decodeResource(getResources(), com.zhiliaoapp.musically.R.drawable.bvz);
        }
    }

    public final void LIZJ(int i, int i2) {
        this.LLJJJJ = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setTarget(this);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS21S0102000_33(this, i, i2, 0));
        valueAnimatorOfFloat.addListener(new ALAdapterS27S0100000_33(this, 3));
        valueAnimatorOfFloat.setDuration(50L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI != getMeasuredHeight() || this.LL != getMeasuredWidth()) {
            this.LL = getMeasuredWidth();
            this.LLILLJJLI = getMeasuredHeight();
            LIZIZ();
        }
    }
}
