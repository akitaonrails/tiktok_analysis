package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18yT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21459118yT extends View {
    public C444890HcV LL;
    public final Paint.FontMetrics LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final long LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public final boolean LLJILJILJ;
    public final C21459318yV LLJILLL;

    public final void LIZIZ() {
        if (this.LLJ == 1) {
            return;
        }
        if (this.LLJILJILJ) {
            C19K8.LIZ(this.LLJILLL);
        }
        this.LLJ = 1;
        invalidate();
    }

    public final void LIZJ() {
        C21459318yV c21459318yV;
        C19K7 c19k7;
        if (this.LLJ == 0) {
            return;
        }
        if (this.LLJILJILJ && (c21459318yV = this.LLJILLL) != null && (c19k7 = (C19K7) C19K8.LIZ.getValue()) != null) {
            c19k7.LIZ(c21459318yV);
        }
        int i = this.LLJ;
        if (i == 1) {
            this.LLJ = 0;
            invalidate();
        } else if (i == 2) {
            this.LLIZ = 0.0f;
            this.LLJI = 0L;
            this.LLJ = 0;
            invalidate();
        }
    }

    public final void LIZLLL() {
        if (this.LLJ == 2) {
            return;
        }
        if (this.LLJILJILJ) {
            C19K8.LIZ(this.LLJILLL);
        }
        this.LLJ = 2;
        this.LLIZ = 0.0f;
        this.LLJI = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLJ == 0) {
            LIZLLL();
        }
    }

    public boolean LIZ(String str) {
        return C21627319kV.LIZJ().LIZLLL(str);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.LLILLL) && this.LLIZLLLIL != 0.0f) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.LLJI > 0) {
                float f2 = ((jUptimeMillis - r5) * ((long) this.LLILZIL)) / 1000.0f;
                float f3 = this.LLIZ;
                if (this.LLJIJIL) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                this.LLIZ = (f3 + (f2 * i3)) % this.LLIZLLLIL;
            }
            if (this.LLJ == 0) {
                this.LLJI = jUptimeMillis;
            }
            float f4 = -this.LLILLJJLI.top;
            if (this.LLILZ) {
                float height = getHeight();
                Paint.FontMetrics fontMetrics = this.LLILLJJLI;
                f4 = ((height - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
            }
            int measuredWidth = getMeasuredWidth();
            if (C300350Bpx.LIZIZ()) {
                canvas.drawText(this.LLILLL, 0.0f, f4, this.LL);
                return;
            }
            float f5 = 0.0f;
            while (true) {
                float f6 = measuredWidth;
                float f7 = this.LLIZ;
                boolean z = this.LLJIJIL;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                if (f5 >= (i * f7) + f6) {
                    break;
                }
                if (z) {
                    f = f6 - this.LLIZLLLIL;
                } else {
                    f = 0.0f;
                }
                String str = this.LLILLL;
                float f8 = f + f7;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                canvas.drawText(str, f8 + (i2 * f5), f4, this.LL);
                f5 += this.LLIZLLLIL;
            }
            if (this.LLJ == 0 && !this.LLJILJILJ) {
                postInvalidateDelayed(this.LLILZLL);
            }
        }
    }

    public void setIsTextInCenterVertical(boolean z) {
        this.LLILZ = z;
        invalidate();
    }

    public void setSpeed(int i) {
        this.LLILZIL = i;
    }

    public void setText(String str) {
        if (C300350Bpx.LIZIZ()) {
            this.LLILLL = str;
            if (str == null) {
                this.LLILLL = "";
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("    ");
            this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        }
        C799570VYd.LJFF(false).execute(new RunnableC1212740hfE(this));
        this.LLJIJIL = LIZ(this.LLILLL);
    }

    public void setTextColor(int i) {
        C444890HcV c444890HcV = this.LL;
        if (c444890HcV != null) {
            c444890HcV.setColor(i);
        }
    }

    public void setTextShader(Shader shader) {
        C444890HcV c444890HcV = this.LL;
        if (c444890HcV != null) {
            c444890HcV.setShader(shader);
        }
    }

    public void setTextShadow(int i) {
        C444890HcV c444890HcV = this.LL;
        if (c444890HcV != null) {
            c444890HcV.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public void setTuxFont(int i) {
        C444890HcV c444890HcV = this.LL;
        if (c444890HcV != null) {
            c444890HcV.LIZ = true;
            c444890HcV.LIZ(i);
            this.LL.getFontMetrics(this.LLILLJJLI);
        }
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public C21459118yT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = (int) this.LLIZLLLIL;
        Paint.FontMetrics fontMetrics = this.LLILLJJLI;
        int i3 = (int) (fontMetrics.bottom - fontMetrics.top);
        if (View.MeasureSpec.getSize(i) <= size) {
            size = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(size, i3);
        if (C300350Bpx.LIZIZ() && this.LL != null && this.LLILLL != null) {
            float measuredWidth = getMeasuredWidth();
            if (this.LL.measureText(this.LLILLL) > measuredWidth) {
                int length = this.LLILLL.length();
                float fMeasureText = this.LL.measureText("...");
                while (length > 0 && this.LL.measureText(this.LLILLL.substring(0, length)) + fMeasureText > measuredWidth) {
                    length--;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLL.substring(0, length));
                sbLIZ.append("...");
                this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.18yV] */
    public C21459118yT(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
        this.LLILLJJLI = fontMetrics;
        this.LLILZ = false;
        this.LLILZIL = 25;
        this.LLILZLL = 16L;
        this.LLJILJIL = 0;
        this.LLJILJILJ = AnonymousClass0723.LIZ();
        this.LLJILLL = new C19KC() { // from class: X.18yV
            @Override // X.C19KC
            public final int LIZ() {
                return 2;
            }

            @Override // X.C19KC
            public final void LIZIZ(int i3) {
                C21459118yT c21459118yT = this.LL;
                if (c21459118yT.LLJ == 0) {
                    if (i3 == 0) {
                        c21459118yT.invalidate();
                    } else {
                        c21459118yT.postInvalidateDelayed(i3);
                    }
                }
            }
        };
        C444890HcV c444890HcV = new C444890HcV();
        this.LL = c444890HcV;
        c444890HcV.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MarqueeView);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MarqueeView_speed, this.LLILZIL);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.MarqueeView_txt_color, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.MarqueeView_txt_shadow, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeView_common_feed_marque_font, 1);
        if (i3 != 1 && i3 == 2) {
            i2 = 51;
        } else {
            i2 = 41;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.LL.LIZ(i2);
        this.LL.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.LL.setColor(color);
        this.LL.getFontMetrics(fontMetrics);
        this.LLJ = 2;
        this.LLJILJIL = context.getResources().getDimensionPixelSize(R.dimen.p3);
    }
}
