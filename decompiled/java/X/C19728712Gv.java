package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19728712Gv extends View {
    public C444890HcV LL;
    public final Paint.FontMetrics LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final long LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public Paint LLJJI;
    public EnumC19728812Gw LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final Paint LLJJIJIL;

    public void setMarqueeCallback(InterfaceC19728912Gx interfaceC19728912Gx) {
    }

    public final void LIZIZ() {
        int i = this.LLJI;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.LLJI = 0;
            invalidate();
        } else if (i == 2) {
            this.LLIZ = 0.0f;
            this.LLJIJIL = 0L;
            this.LLJI = 0;
            invalidate();
        }
    }

    public final void LIZJ() {
        if (this.LLJI == 2) {
            return;
        }
        this.LLJILLL = 0;
        this.LLJI = 2;
        this.LLIZ = 0.0f;
        this.LLJIJIL = 0L;
        invalidate();
    }

    public final void LIZLLL() {
        Pair pair;
        if (this.LLJJIII == EnumC19728812Gw.NONE) {
            this.LLJJI = null;
            return;
        }
        float measuredWidth = this.LLJJIJI / getMeasuredWidth();
        int iOrdinal = this.LLJJIII.ordinal();
        if (iOrdinal == 1) {
            pair = new Pair(new int[]{0, -1, -1}, new float[]{0.0f, measuredWidth, 1.0f});
        } else if (iOrdinal == 2) {
            pair = new Pair(new int[]{-1, -1, 0}, new float[]{0.0f, 1.0f - measuredWidth, 1.0f});
        } else if (iOrdinal != 3) {
            return;
        } else {
            pair = new Pair(new int[]{0, -1, -1, 0}, new float[]{0.0f, measuredWidth, 1.0f - measuredWidth, 1.0f});
        }
        Paint paint = new Paint();
        this.LLJJI = paint;
        paint.setColor(this.LL.getColor());
        this.LLJJI.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, (int[]) pair.first, (float[]) pair.second, Shader.TileMode.CLAMP));
        this.LLJJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLJI == 0) {
            LIZJ();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        int i;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.LLILLL) && this.LLIZLLLIL != 0.0f) {
            if (!this.LLJJIJIIJIL) {
                LIZJ();
            }
            if (this.LLJILJIL) {
                width = getWidth() - this.LLIZLLLIL;
            } else {
                width = 0.0f;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.LLJIJIL > 0) {
                float f = ((jUptimeMillis - r0) * ((long) this.LLILZIL)) / 1000.0f;
                float f2 = this.LLIZ;
                if (this.LLJILJIL) {
                    i = 1;
                } else {
                    i = -1;
                }
                float f3 = f2 + (f * i);
                this.LLIZ = f3;
                if (Math.abs(f3) >= this.LLJ) {
                    this.LLJILLL++;
                }
                if (this.LLJILLL >= this.LLJJ) {
                    LIZJ();
                    this.LLIZ = 0.0f;
                } else {
                    this.LLIZ %= this.LLIZLLLIL;
                }
            }
            if (this.LLJI == 0) {
                this.LLJIJIL = jUptimeMillis;
            }
            float f4 = -this.LLILLJJLI.top;
            if (this.LLILZ) {
                float height = getHeight();
                Paint.FontMetrics fontMetrics = this.LLILLJJLI;
                f4 = ((height - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
            }
            if (this.LLJI == 0 && this.LLJJIII != EnumC19728812Gw.NONE && this.LLJJI != null) {
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLJJIJIL);
                canvas.drawText(this.LLILLL, this.LLIZ + width, f4, this.LL);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLJJI);
                canvas.restoreToCount(iSaveLayer);
            } else {
                canvas.drawText(this.LLILLL, this.LLIZ + width, f4, this.LL);
            }
            if (this.LLJI == 0 && this.LLJJIJIIJIL) {
                postInvalidateDelayed(this.LLILZLL);
            }
        }
    }

    public void setGradientType(int i) {
        EnumC19728812Gw enumC19728812Gw;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC19728812Gw = EnumC19728812Gw.NONE;
                } else {
                    enumC19728812Gw = EnumC19728812Gw.BOTH;
                }
            } else {
                enumC19728812Gw = EnumC19728812Gw.END;
            }
        } else {
            enumC19728812Gw = EnumC19728812Gw.START;
        }
        this.LLJJIII = enumC19728812Gw;
        LIZLLL();
    }

    public void setGradientWidth(int i) {
        this.LLJJIJI = i;
        LIZLLL();
    }

    public void setIsTextInCenterVertical(boolean z) {
        this.LLILZ = z;
        invalidate();
    }

    public void setMarqueeFont(int i) {
        int i2;
        if (i == 2) {
            i2 = 51;
        } else if (i == 3) {
            i2 = 72;
        } else {
            i2 = 41;
        }
        C444890HcV c444890HcV = this.LL;
        if (c444890HcV != null) {
            c444890HcV.LIZ(i2);
            this.LL.getFontMetrics(this.LLILLJJLI);
        }
    }

    public void setMaxRound(int i) {
        this.LLJJ = i;
    }

    public void setMaxWidth(int i) {
        this.LLJILJILJ = i;
    }

    public void setSpeed(int i) {
        this.LLILZIL = i;
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
            c444890HcV.LIZ(i);
            this.LL.getFontMetrics(this.LLILLJJLI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19728712Gv(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r8 = 0
            r12.<init>(r13, r14, r8)
            android.graphics.Paint$FontMetrics r2 = new android.graphics.Paint$FontMetrics
            r2.<init>()
            r12.LLILLJJLI = r2
            r12.LLILZ = r8
            r0 = 25
            r12.LLILZIL = r0
            r0 = 16
            r12.LLILZLL = r0
            r12.LLJILJILJ = r8
            r12.LLJILLL = r8
            r9 = 1
            r12.LLJJ = r9
            X.12Gw r7 = X.EnumC19728812Gw.NONE
            r12.LLJJIII = r7
            r12.LLJJIJI = r8
            r12.LLJJIJIIJIL = r8
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r12.LLJJIJIL = r0
            X.0HcV r0 = new X.0HcV
            r0.<init>()
            r12.LL = r0
            r0.setAntiAlias(r9)
            int[] r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView
            android.content.res.TypedArray r6 = r13.obtainStyledAttributes(r14, r0)
            int r1 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_speed
            int r0 = r12.LLILZIL
            int r0 = r6.getDimensionPixelSize(r1, r0)
            r12.LLILZIL = r0
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_txt_color
            int r5 = r6.getColor(r0, r8)
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_txt_shadow
            int r4 = r6.getColor(r0, r8)
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_font
            int r0 = r6.getInt(r0, r9)
            r10 = 3
            r3 = 2
            if (r0 == r9) goto Lbb
            if (r0 != r3) goto Lb6
            r1 = 51
        L5f:
            int r11 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_max_width
            r0 = -1
            int r0 = r6.getDimensionPixelSize(r11, r0)
            r12.LLJILJILJ = r0
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_max_round
            int r0 = r6.getInt(r0, r9)
            r12.LLJJ = r0
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_gradient_type
            int r0 = r6.getInt(r0, r8)
            if (r0 == r9) goto Lb3
            if (r0 == r3) goto Lb0
            if (r0 != r10) goto L7e
            X.12Gw r7 = X.EnumC19728812Gw.BOTH
        L7e:
            r12.LLJJIII = r7
            int r0 = com.ss.android.ugc.aweme.app.R$styleable.TTLiveMarqueeView_ttlive_marquee_gradient_width
            int r0 = r6.getDimensionPixelSize(r0, r8)
            r12.LLJJIJI = r0
            r6.recycle()
            X.0HcV r0 = r12.LL
            r0.LIZ(r1)
            X.0HcV r1 = r12.LL
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setShadowLayer(r0, r0, r0, r4)
            X.0HcV r0 = r12.LL
            r0.setColor(r5)
            X.0HcV r0 = r12.LL
            r0.getFontMetrics(r2)
            X.0HcV r2 = r12.LL
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r1.<init>(r0)
            r2.setXfermode(r1)
            r12.LLJI = r3
            return
        Lb0:
            X.12Gw r7 = X.EnumC19728812Gw.END
            goto L7e
        Lb3:
            X.12Gw r7 = X.EnumC19728812Gw.START
            goto L7e
        Lb6:
            if (r0 != r10) goto Lbb
            r1 = 72
            goto L5f
        Lbb:
            r1 = 41
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19728712Gv.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void LIZ(String str, boolean z) {
        float fMeasureText = this.LL.measureText(str);
        this.LLJ = fMeasureText;
        if (this.LL == null) {
            return;
        }
        if (fMeasureText > this.LLJILJILJ) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= this.LLJJ; i++) {
                sb.append(str);
                sb.append("    ");
            }
            this.LLILLL = sb.toString();
        } else {
            this.LLILLL = str;
        }
        this.LLIZLLLIL = this.LL.measureText(this.LLILLL);
        this.LLIZ = 0.0f;
        this.LLJIJIL = 0L;
        try {
            requestLayout();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJILJIL = z;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int i3 = (int) this.LLIZLLLIL;
        int i4 = this.LLJILJILJ;
        if (i4 != -1 && i3 > i4) {
            i3 = i4;
        }
        int size = View.MeasureSpec.getSize(i);
        if (i3 > size) {
            i3 = size;
        }
        if (i3 < this.LLJ) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIIJIL = z;
        Paint.FontMetrics fontMetrics = this.LLILLJJLI;
        setMeasuredDimension(i3, (int) (fontMetrics.bottom - fontMetrics.top));
        LIZLLL();
    }
}
