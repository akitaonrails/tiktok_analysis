package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396440mRW extends AbstractC1396720mRy<C1384300m7w> {
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final C1396450mRX LLJJJIL = new InterfaceC1396920mSI() { // from class: X.0mRX
        @Override // X.InterfaceC1396920mSI
        public final int LIZIZ() {
            return 20005;
        }

        @Override // X.InterfaceC1396920mSI
        public final AbstractC1396720mRy LIZ() {
            return new C1396440mRW();
        }
    };
    public float LLJILLL;
    public float LLJJ;
    public final AbstractC1396720mRy<C1384300m7w> LLJJI;
    public final C1396330mRL LLJJIII;
    public final boolean LLJJIJI;
    public final C1396530mRf LLJJIJIIJIL;
    public final List<InterfaceC1396460mRY> LLJJIJIL;

    @Override // X.AbstractC1396720mRy
    public final int LJFF() {
        return 20005;
    }

    public final void LJJIL() {
        C1396330mRL c1396330mRL = this.LLJJIII;
        float f = this.LLJILLL;
        c1396330mRL.LLILLJJLI = f;
        c1396330mRL.LLILLL = this.LLJJ;
        AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy = this.LLJJI;
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        abstractC1396720mRy.LJJIJL(f + (c1384300m7w != null ? c1384300m7w.LJJIFFI : 0.0f));
        AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy2 = this.LLJJI;
        float f2 = this.LLJJIII.LLILLL;
        C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
        abstractC1396720mRy2.LJJIJLIJ(f2 + (c1384300m7w2 != null ? c1384300m7w2.LJJII : 0.0f));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0mRL] */
    public C1396440mRW() {
        AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy = C1384880m8s.LIZ ? new C1396400mRS() { // from class: X.0mRU
            @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
            public final int LIZ(float f, float f2) {
                float f3 = this.LLILLJJLI;
                if (f > f3) {
                    float f4 = this.LLILLL;
                    if (f2 > f4 && f < f3 + this.LLILZIL && f2 < f4 + this.LLILZLL) {
                        return 3;
                    }
                    return 0;
                }
                return 0;
            }
        } : new C1396360mRO() { // from class: X.0mRP
            @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
            public final int LIZ(float f, float f2) {
                float f3 = this.LLILLJJLI;
                if (f > f3) {
                    float f4 = this.LLILLL;
                    if (f2 > f4 && f < f3 + this.LLILZIL && f2 < f4 + this.LLILZLL) {
                        return 3;
                    }
                    return 0;
                }
                return 0;
            }
        };
        this.LLJJI = abstractC1396720mRy;
        final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1309);
        this.LLJJIII = new AbstractC1396720mRy<C1384300m7w>(awS565S0100000_21) { // from class: X.0mRL
            public static final float LLJJIJI;
            public static final float LLJJIJIIJIL;
            public final Function0<float[]> LLJILLL;
            public final Paint LLJJ;
            public LinearGradient LLJJI;
            public final RectF LLJJIII;

            @Override // X.AbstractC1396720mRy
            public final int LJFF() {
                return 20006;
            }

            static {
                float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
                LLJJIJI = fLIZIZ;
                LLJJIJIIJIL = fLIZIZ / 2;
            }

            {
                this.LLJILLL = awS565S0100000_21;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                this.LLJJ = paint;
                this.LLJJIII = new RectF();
            }

            @Override // X.AbstractC1396720mRy
            public final void LJIL(C1384750m8f c1384750m8f) {
                float f;
                float[] fArrInvoke = this.LLJILLL.invoke();
                float f2 = fArrInvoke[0];
                C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
                float f3 = 0.0f;
                if (c1384300m7w != null) {
                    f = c1384300m7w.LJJIFFI;
                } else {
                    f = 0.0f;
                }
                float f4 = 2;
                this.LLILZIL = (float) Math.ceil(f2 + (f * f4));
                float f5 = fArrInvoke[1];
                C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
                if (c1384300m7w2 != null) {
                    f3 = c1384300m7w2.LJJII;
                }
                this.LLILZLL = (float) Math.ceil(f5 + (f3 * f4));
                this.LLJJI = null;
                Integer num = C1384350m81.LIZJ.LIZIZ;
                if (num != null) {
                    this.LLJJ.setColor(num.intValue());
                    this.LLJJ.setStrokeWidth(LLJJIJI);
                    this.LLJJ.setStyle(Paint.Style.STROKE);
                    this.LLJJ.setStrokeJoin(Paint.Join.ROUND);
                    this.LLJJ.setShader(null);
                }
            }

            @Override // X.AbstractC1396720mRy
            public final void LJJIFFI(C1384750m8f c1384750m8f) {
                this.LLJJ.setAlpha(c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue());
            }

            @Override // X.AbstractC1396720mRy
            public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
                float fFloatValue;
                float fLIZIZ;
                Float f;
                C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
                if (c1384300m7w != null && c1384300m7w.LJIILLIIL) {
                    canvas.save();
                    canvas.translate(this.LLILLJJLI, this.LLILLL);
                    this.LLJJ.setColor(-16777216);
                    Paint paint = this.LLJJ;
                    C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
                    if (c1384300m7w2 != null && (f = c1384300m7w2.LJIJJLI) != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    paint.setStrokeWidth(fFloatValue);
                    this.LLJJ.setStyle(Paint.Style.FILL);
                    if (this.LLJJI == null) {
                        if (this.LLILZIL < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) {
                            fLIZIZ = 0.0f;
                        } else {
                            fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) / this.LLILZIL;
                        }
                        this.LLJJI = new LinearGradient(0.0f, 0.0f, this.LLILZIL, 0.0f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.0f, fLIZIZ, 1 - fLIZIZ, 1.0f}, Shader.TileMode.CLAMP);
                    }
                    LinearGradient linearGradient = this.LLJJI;
                    if (linearGradient != null) {
                        this.LLJJ.setShader(linearGradient);
                    }
                    float f2 = LLJJIJIIJIL;
                    float f3 = this.LLILZIL - f2;
                    float f4 = this.LLILZLL - f2;
                    float fLJIIJ = C1384350m81.LIZIZ.LJIIJ();
                    float fLJIIJ2 = C1384350m81.LIZIZ.LJIIJ();
                    Paint paint2 = this.LLJJ;
                    this.LLJJIII.set(f2, f2, f3, f4);
                    canvas.drawRoundRect(this.LLJJIII, fLJIIJ, fLJIIJ2, paint2);
                    canvas.restore();
                    Integer num = C1384350m81.LIZJ.LIZIZ;
                    if (num != null) {
                        this.LLJJ.setColor(num.intValue());
                        this.LLJJ.setStrokeWidth(LLJJIJI);
                        this.LLJJ.setStyle(Paint.Style.STROKE);
                        this.LLJJ.setStrokeJoin(Paint.Join.ROUND);
                        this.LLJJ.setShader(null);
                    } else {
                        return;
                    }
                }
                C1384300m7w c1384300m7w3 = (C1384300m7w) this.LL;
                if (c1384300m7w3 != null && c1384300m7w3.LJIILJJIL) {
                    float strokeWidth = this.LLJJ.getStrokeWidth() / 2.0f;
                    float f5 = this.LLILLJJLI;
                    float f6 = f5 + strokeWidth;
                    float f7 = this.LLILLL;
                    float f8 = f7 + strokeWidth;
                    float f9 = (f5 + this.LLILZIL) - strokeWidth;
                    float f10 = (f7 + this.LLILZLL) - strokeWidth;
                    float fLJIIJ3 = C1384350m81.LIZIZ.LJIIJ();
                    float fLJIIJ4 = C1384350m81.LIZIZ.LJIIJ();
                    Paint paint3 = this.LLJJ;
                    this.LLJJIII.set(f6, f8, f9, f10);
                    canvas.drawRoundRect(this.LLJJIII, fLJIIJ3, fLJIIJ4, paint3);
                }
            }

            @Override // X.AbstractC1396720mRy
            public final /* bridge */ /* synthetic */ void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
            }
        };
        this.LLJJIJI = C444960Hcc.LIZIZ();
        C1396530mRf c1396530mRf = new C1396530mRf(abstractC1396720mRy);
        this.LLJJIJIIJIL = c1396530mRf;
        this.LLJJIJIL = C1697810uHb.LJIIJJI(abstractC1396720mRy, c1396530mRf);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJII() {
        super.LJJII();
        this.LLJJI.LJJII();
        LJJII();
        this.LLJJIJIIJIL.LJJII();
    }

    @Override // X.AbstractC1396720mRy
    public final float LJIILIIL() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1396720mRy
    public final float LJIILJJIL() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIL(C1384750m8f c1384750m8f) {
        this.LLJJI.LJIIZILJ(c1384750m8f);
        LJIIZILJ(c1384750m8f);
        this.LLJJIJIIJIL.LJIIZILJ(c1384750m8f);
        C1396330mRL c1396330mRL = this.LLJJIII;
        float f = c1396330mRL.LLILZIL;
        this.LLILZIL = f;
        this.LLILZLL = c1396330mRL.LLILZLL;
        this.LLILZIL = f + LLJJJ + this.LLJJIJIIJIL.LLILZIL;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJI(C1384750m8f c1384750m8f) {
        getClass();
        this.LLJJI.LJJI(c1384750m8f);
        this.LLJJIJIIJIL.LJJI(c1384750m8f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJIFFI(C1384750m8f c1384750m8f) {
        LJJIFFI(c1384750m8f);
        this.LLJJI.LJJIFFI(c1384750m8f);
        this.LLJJIJIIJIL.LJJIFFI(c1384750m8f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJIJL(float f) {
        this.LLJILLL = f;
        LJJIL();
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJIJLIJ(float f) {
        this.LLJJ = f;
        LJJIL();
    }

    @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
    public final int LIZ(float f, float f2) {
        Iterator<InterfaceC1396460mRY> it2 = this.LLJJIJIL.iterator();
        while (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(it2.next().LIZ(f, f2));
            if (numValueOf.intValue() != 0) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
        this.LLJJI.LIZJ(abstractC1384320m7y, c1384750m8f);
        LIZJ(abstractC1384320m7y, c1384750m8f);
        this.LLJJIJIIJIL.LIZJ(abstractC1384320m7y, c1384750m8f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
        C1396330mRL c1396330mRL = this.LLJJIII;
        C1384300m7w c1384300m7w = (C1384300m7w) c1396330mRL.LL;
        if (c1384300m7w != null && (c1384300m7w.LJIILJJIL || c1384300m7w.LJIILLIIL)) {
            c1396330mRL.LIZLLL(canvas, c1384750m8f);
        }
        this.LLJJI.LIZLLL(canvas, c1384750m8f);
        C1396530mRf c1396530mRf = this.LLJJIJIIJIL;
        C1384300m7w c1384300m7w2 = (C1384300m7w) c1396530mRf.LL;
        if (c1384300m7w2 != null) {
            if (!c1384300m7w2.LJIILJJIL ? !c1384300m7w2.LJJI : c1384300m7w2.LJIIL <= 0) {
                if (!c1384300m7w2.LJJIII) {
                    return;
                }
            }
            c1396530mRf.LIZLLL(canvas, c1384750m8f);
        }
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJLI(float f, float f2) {
        float f3;
        float fLJIILIIL;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (this.LLJJIJI) {
            C1396530mRf c1396530mRf = this.LLJJIJIIJIL;
            float f9 = this.LLJJIII.LLILLL;
            C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
            if (c1384300m7w != null) {
                f5 = c1384300m7w.LJJII;
            } else {
                f5 = 0.0f;
            }
            c1396530mRf.LJIILLIIL(f, f9 + f5);
            float f10 = f + this.LLJJIJIIJIL.LLILZIL;
            C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
            if (c1384300m7w2 != null && c1384300m7w2.LJIILJJIL) {
                f7 = f10 + LLJJJ;
            } else {
                float f11 = f10 + LLJJJ;
                if (c1384300m7w2 != null) {
                    f6 = c1384300m7w2.LJJIFFI;
                } else {
                    f6 = 0.0f;
                }
                f7 = f11 - f6;
            }
            LJIILLIIL(f7, f2);
            float fLJIIL = f7 + ((this.LLJJIII.LLILZIL - this.LLJJI.LJIIL()) / 2);
            AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy = this.LLJJI;
            float f12 = this.LLJJIII.LLILLL;
            C1384300m7w c1384300m7w3 = (C1384300m7w) this.LL;
            if (c1384300m7w3 != null) {
                f8 = c1384300m7w3.LJJII;
            }
            abstractC1396720mRy.LJIILLIIL(fLJIIL, f12 + f8);
            return;
        }
        LJIILLIIL(f, f2);
        C1396330mRL c1396330mRL = this.LLJJIII;
        float fLJIIL2 = c1396330mRL.LLILLJJLI + ((c1396330mRL.LLILZIL - this.LLJJI.LJIIL()) / 2);
        AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy2 = this.LLJJI;
        float f13 = this.LLJJIII.LLILLL;
        C1384300m7w c1384300m7w4 = (C1384300m7w) this.LL;
        if (c1384300m7w4 != null) {
            f3 = c1384300m7w4.LJJII;
        } else {
            f3 = 0.0f;
        }
        abstractC1396720mRy2.LJIILLIIL(fLJIIL2, f13 + f3);
        C1384300m7w c1384300m7w5 = (C1384300m7w) this.LL;
        if (c1384300m7w5 != null && c1384300m7w5.LJIILJJIL) {
            C1396330mRL c1396330mRL2 = this.LLJJIII;
            f4 = c1396330mRL2.LLILLJJLI + c1396330mRL2.LLILZIL;
            fLJIILIIL = LLJJJ;
        } else {
            fLJIILIIL = this.LLJJI.LJIILIIL() + this.LLJJI.LJIIL();
            f4 = LLJJJ;
        }
        float f14 = f4 + fLJIILIIL;
        C1396530mRf c1396530mRf2 = this.LLJJIJIIJIL;
        float f15 = this.LLJJIII.LLILLL;
        C1384300m7w c1384300m7w6 = (C1384300m7w) this.LL;
        if (c1384300m7w6 != null) {
            f8 = c1384300m7w6.LJJII;
        }
        c1396530mRf2.LJIILLIIL(f14, f15 + f8);
    }
}
