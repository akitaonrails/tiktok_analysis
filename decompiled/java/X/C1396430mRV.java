package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396430mRV extends AbstractC1396720mRy<C1384300m7w> {
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final C1396340mRM LLJJJIL = new InterfaceC1396920mSI() { // from class: X.0mRM
        @Override // X.InterfaceC1396920mSI
        public final int LIZIZ() {
            return 20002;
        }

        @Override // X.InterfaceC1396920mSI
        public final AbstractC1396720mRy LIZ() {
            return new C1396430mRV();
        }
    };
    public float LLJILLL;
    public float LLJJ;
    public final AbstractC1396720mRy<C1384300m7w> LLJJI;
    public final C1396320mRK LLJJIII;
    public final boolean LLJJIJI;
    public final C1396520mRe LLJJIJIIJIL;
    public final List<InterfaceC1396460mRY> LLJJIJIL;

    @Override // X.AbstractC1396720mRy
    public final int LJFF() {
        return 20002;
    }

    public final void LJJIL() {
        C1396320mRK c1396320mRK = this.LLJJIII;
        float f = this.LLJILLL;
        c1396320mRK.LLILLJJLI = f;
        c1396320mRK.LLILLL = this.LLJJ;
        AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy = this.LLJJI;
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        abstractC1396720mRy.LJJIJL(f + (c1384300m7w != null ? c1384300m7w.LJJIFFI : 0.0f));
        AbstractC1396720mRy<C1384300m7w> abstractC1396720mRy2 = this.LLJJI;
        float f2 = this.LLJJIII.LLILLL;
        C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
        abstractC1396720mRy2.LJJIJLIJ(f2 + (c1384300m7w2 != null ? c1384300m7w2.LJJII : 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0mRy[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0mRK] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0mRy, X.0mRy<X.0m7w>] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0mRT] */
    public C1396430mRV() {
        ?? r5 = new C1396390mRR() { // from class: X.0mRT
            public final boolean LLJJIJI = C444960Hcc.LIZIZ();

            @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
            public final int LIZ(float f, float f2) {
                if (this.LLJJIJI) {
                    float f3 = this.LLILLJJLI;
                    int i = C1396430mRV.LLJJJ;
                    if (f >= f3 - (C1396430mRV.LLJJJ / 2) && f < f3 + this.LLILZIL) {
                        return 3;
                    }
                    return 0;
                }
                float f4 = this.LLILLJJLI;
                if (f >= f4) {
                    float f5 = f4 + this.LLILZIL;
                    int i2 = C1396430mRV.LLJJJ;
                    if (f < f5 + (C1396430mRV.LLJJJ / 2)) {
                        return 3;
                    }
                    return 0;
                }
                return 0;
            }
        };
        ?? c1396710mRx = (((Boolean) C256830A4r.LIZ.getValue()).booleanValue() || ((Boolean) C275050AqF.LIZ.getValue()).booleanValue()) ? new C1396710mRx(r5, r5, AFwS305S0000000_21.get$arr$(64)) : r5;
        this.LLJJI = c1396710mRx;
        final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1336);
        ?? r3 = new AbstractC1396720mRy<C1384300m7w>(awS565S0100000_21) { // from class: X.0mRK
            public final Function0<float[]> LLJILLL;
            public final C01GW LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(473));
            public final RectF LLJJI = new RectF();
            public final boolean LLJJIII = C444960Hcc.LIZIZ();

            @Override // X.AbstractC1396720mRy
            public final int LJFF() {
                return 20003;
            }

            public final Paint LJJIL() {
                return (Paint) this.LLJJ.getValue();
            }

            {
                this.LLJILLL = awS565S0100000_21;
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
            }

            @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
            public final int LIZ(float f, float f2) {
                C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
                if (c1384300m7w == null || !c1384300m7w.LJIILJJIL) {
                    return 0;
                }
                if (this.LLJJIII) {
                    float f3 = this.LLILLJJLI;
                    int i = C1396430mRV.LLJJJ;
                    if (f >= f3 - (C1396430mRV.LLJJJ / 2) && f < f3 + this.LLILZIL) {
                        return 4;
                    }
                } else {
                    float f4 = this.LLILLJJLI;
                    if (f >= f4) {
                        float f5 = f4 + this.LLILZIL;
                        int i2 = C1396430mRV.LLJJJ;
                        if (f < f5 + (C1396430mRV.LLJJJ / 2)) {
                            return 4;
                        }
                    }
                }
                return 0;
            }

            @Override // X.AbstractC1396720mRy
            public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
                boolean z;
                boolean z2;
                Float fValueOf;
                Integer num;
                int iIntValue;
                float fFloatValue;
                float fLIZIZ;
                Float f;
                canvas.save();
                canvas.translate(this.LLILLJJLI, this.LLILLL);
                LJJIL().setAlpha(c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue());
                C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
                if (c1384300m7w != null && c1384300m7w.LJIILLIIL) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Integer num2 = C1384350m81.LIZJ.LIZLLL;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -16777216;
                    }
                    LJJIL().setColor(iIntValue);
                    Paint paintLJJIL = LJJIL();
                    C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
                    if (c1384300m7w2 != null && (f = c1384300m7w2.LJIJJLI) != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    paintLJJIL.setStrokeWidth(fFloatValue);
                    LJJIL().setStyle(Paint.Style.FILL);
                    int[] iArr = {0, -16777216, -16777216, 0};
                    if (this.LLILZIL < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) {
                        fLIZIZ = 0.0f;
                    } else {
                        fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) / this.LLILZIL;
                    }
                    LJJIL().setShader(new LinearGradient(0.0f, 0.0f, this.LLILZIL, 0.0f, iArr, new float[]{0.0f, fLIZIZ, 1 - fLIZIZ, 1.0f}, Shader.TileMode.CLAMP));
                    float strokeWidth = LJJIL().getStrokeWidth() / 2.0f;
                    float f2 = this.LLILZIL - strokeWidth;
                    float f3 = this.LLILZLL - strokeWidth;
                    float fLJIIJ = C1384350m81.LIZIZ.LJIIJ();
                    float fLJIIJ2 = C1384350m81.LIZIZ.LJIIJ();
                    Paint paintLJJIL2 = LJJIL();
                    this.LLJJI.set(strokeWidth, strokeWidth, f2, f3);
                    canvas.drawRoundRect(this.LLJJI, fLJIIJ, fLJIIJ2, paintLJJIL2);
                }
                C1384300m7w c1384300m7w3 = (C1384300m7w) this.LL;
                if (c1384300m7w3 != null && c1384300m7w3.LJIILJJIL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
                } else if (c1384300m7w3 != null) {
                    fValueOf = c1384300m7w3.LJIJJLI;
                } else {
                    fValueOf = null;
                }
                C1384300m7w c1384300m7w4 = (C1384300m7w) this.LL;
                if (c1384300m7w4 != null) {
                    if (c1384300m7w4.LJIILJJIL) {
                        num = C1384350m81.LIZJ.LIZIZ;
                    } else {
                        num = c1384300m7w4.LJIJJ;
                    }
                } else {
                    num = null;
                }
                if (fValueOf != null && num != null && fValueOf.floatValue() > 0.0f) {
                    LJJIL().setColor(num.intValue());
                    LJJIL().setStrokeWidth(fValueOf.floatValue());
                    LJJIL().setStyle(Paint.Style.STROKE);
                    LJJIL().setStrokeJoin(Paint.Join.ROUND);
                    LJJIL().setShader(null);
                    Integer num3 = C1384350m81.LIZJ.LIZJ;
                    if (num3 != null) {
                        LJJIL().setShadowLayer(C1384350m81.LIZIZ.LJ(), 0.0f, 0.0f, num3.intValue());
                    }
                    float strokeWidth2 = LJJIL().getStrokeWidth() / 2.0f;
                    float f4 = this.LLILZIL - strokeWidth2;
                    float f5 = this.LLILZLL - strokeWidth2;
                    float fLJIIJ3 = C1384350m81.LIZIZ.LJIIJ();
                    float fLJIIJ4 = C1384350m81.LIZIZ.LJIIJ();
                    Paint paintLJJIL3 = LJJIL();
                    this.LLJJI.set(strokeWidth2, strokeWidth2, f4, f5);
                    canvas.drawRoundRect(this.LLJJI, fLJIIJ3, fLJIIJ4, paintLJJIL3);
                    LJJIL().clearShadowLayer();
                }
                canvas.restore();
            }

            @Override // X.AbstractC1396720mRy
            public final /* bridge */ /* synthetic */ void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
            }
        };
        this.LLJJIII = r3;
        this.LLJJIJI = C444960Hcc.LIZIZ();
        C1396520mRe c1396520mRe = new C1396520mRe(c1396710mRx);
        this.LLJJIJIIJIL = c1396520mRe;
        this.LLJJIJIL = C1697810uHb.LJIIJJI(new AbstractC1396720mRy[]{r5, c1396520mRe, r3});
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
        C1396320mRK c1396320mRK = this.LLJJIII;
        float f = c1396320mRK.LLILZIL;
        this.LLILZIL = f;
        this.LLILZLL = c1396320mRK.LLILZLL;
        this.LLILZIL = f + LLJJJ + this.LLJJIJIIJIL.LLILZIL;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJI(C1384750m8f c1384750m8f) {
        getClass();
        this.LLJJI.LJJI(c1384750m8f);
        this.LLJJIJIIJIL.LJJI(c1384750m8f);
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
        LIZLLL(canvas, c1384750m8f);
        this.LLJJI.LIZLLL(canvas, c1384750m8f);
        this.LLJJIJIIJIL.LIZLLL(canvas, c1384750m8f);
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
            C1396520mRe c1396520mRe = this.LLJJIJIIJIL;
            float f9 = this.LLJJIII.LLILLL;
            C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
            if (c1384300m7w != null) {
                f5 = c1384300m7w.LJJII;
            } else {
                f5 = 0.0f;
            }
            c1396520mRe.LJIILLIIL(f, f9 + f5);
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
        C1396320mRK c1396320mRK = this.LLJJIII;
        float fLJIIL2 = c1396320mRK.LLILLJJLI + ((c1396320mRK.LLILZIL - this.LLJJI.LJIIL()) / 2);
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
            C1396320mRK c1396320mRK2 = this.LLJJIII;
            f4 = c1396320mRK2.LLILLJJLI + c1396320mRK2.LLILZIL;
            fLJIILIIL = LLJJJ;
        } else {
            fLJIILIIL = this.LLJJI.LJIILIIL() + this.LLJJI.LJIIL();
            f4 = LLJJJ;
        }
        float f14 = f4 + fLJIILIIL;
        C1396520mRe c1396520mRe2 = this.LLJJIJIIJIL;
        float f15 = this.LLJJIII.LLILLL;
        C1384300m7w c1384300m7w6 = (C1384300m7w) this.LL;
        if (c1384300m7w6 != null) {
            f8 = c1384300m7w6.LJJII;
        }
        c1396520mRe2.LJIILLIIL(f14, f15 + f8);
    }
}
