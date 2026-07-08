package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1113930f5r extends AbstractC521080Kc6 {
    public static final C1113980f5w LJJJJZI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJJLIIL;
    public static WeakReference<Bitmap> LJJJLL;
    public final Bitmap LJI;
    public final Bitmap LJII;
    public final Bitmap LJIIIIZZ;
    public final String LJIIIZ;
    public final C521100Kc8 LJIIJ;
    public final C01GW LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final int LJIJ;
    public final C01GW LJIJI;
    public final C1113960f5u LJIJJ;
    public final Paint LJIJJLI;
    public final int LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public int LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final int LJJIIJ;
    public final int LJJIIJZLJL;
    public final int LJJIIZ;
    public final int LJJIIZI;
    public final boolean LJJIJ;
    public final int LJJIJIIJI;
    public final int LJJIJIIJIL;
    public final int LJJIJIL;
    public final Boolean LJJIJL;
    public float LJJIJLIJ;
    public final C01GW LJJIL;
    public final C01GW LJJIZ;
    public final C01GW LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public final int LJJJJJ;
    public final boolean LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public final boolean LJJJJZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0f5w] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1113930f5r.class, "finalArrowBitmap", "getFinalArrowBitmap()Landroid/graphics/Bitmap;", 0);
        C13LE.LIZ.getClass();
        LJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJJJJZI = new Object() { // from class: X.0f5w
        };
        LJJJLL = new WeakReference<>(null);
        new C2093008Hw(100);
    }

    public int LJIIIIZZ() {
        return -1;
    }

    public int LJIIIZ() {
        return -1;
    }

    public String LJIIL() {
        return null;
    }

    public void LJIILL(Canvas canvas) {
    }

    public void LJIILLIIL(Canvas canvas, RectF rectF) {
    }

    public int LJFF() {
        return this.LJJJJJL ? this.LJJJJJ : (LJIIJ() - this.LJJIIJ) - this.LJJIIJZLJL;
    }

    public final int LJIIJ() {
        return ((Number) this.LJIJI.getValue()).intValue();
    }

    public final C1113970f5v LJIIJJI() {
        return (C1113970f5v) this.LJIIJJI.getValue();
    }

    public String LJIILIIL() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC521080Kc6
    public int LJ(Paint paint) {
        int width;
        int iMeasureText;
        int width2;
        Bitmap bitmap;
        int i;
        int width3;
        Bitmap bitmap2;
        String strLJIILIIL;
        int length;
        Bitmap bitmap3;
        int iLJFF = LJFF();
        this.LJJJJIZL = iLJFF;
        if (this.LJIILIIL && (bitmap3 = this.LJI) != null && bitmap3.getWidth() > 0 && this.LJI.getHeight() > 0) {
            width = (iLJFF * this.LJI.getWidth()) / this.LJI.getHeight();
        } else {
            width = 0;
        }
        this.LJJJJI = width;
        if (this.LJIILJJIL && (strLJIILIIL = LJIILIIL()) != null && strLJIILIIL.length() != 0) {
            C1119920fFW.LIZLLL(this.LIZ, paint, this.LIZLLL, this.LJJJI);
            String strLJIILIIL2 = LJIILIIL();
            if (strLJIILIIL2 != null) {
                length = strLJIILIIL2.length();
            } else {
                length = 0;
            }
            iMeasureText = (int) paint.measureText(strLJIILIIL2, 0, length);
        } else {
            iMeasureText = 0;
        }
        this.LJJJJLL = iMeasureText;
        int i2 = iMeasureText + this.LJJIIZI;
        float f = 0.0f;
        this.LJJIJLIJ = 0.0f;
        if (Intrinsics.LJFF(this.LJJIJL, Boolean.TRUE)) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(0.5f);
            if (this.LJJIJIL != 0) {
                f = iLIZIZ / 2.0f;
            }
            this.LJJIJLIJ = f;
        }
        if (this.LJJIJ && (i = this.LJJIIZ) != 0) {
            if (this.LJIIZILJ) {
                this.LJJJJL = (i - this.LJJJJI) / 2;
            } else {
                this.LJJJJL = (int) C497740JfY.LIZIZ(2.0f);
            }
            int i3 = this.LJJIIZ;
            int i4 = this.LJJIFFI;
            int i5 = i3 + i4;
            this.LJJJJ = i5;
            int i6 = (i5 - i4) - this.LJJII;
            this.LJJJIL = i6;
            int i7 = (i6 - this.LJJJJI) - i2;
            if (this.LJIILL && (bitmap2 = (Bitmap) this.LJIJJ.getValue(this, LJJJLIIL[0])) != null) {
                width3 = bitmap2.getWidth();
            } else {
                width3 = 0;
            }
            this.LJJJJLI = (i7 - width3) - this.LJJJJL;
        } else {
            int i8 = this.LJJJJI + i2;
            if (this.LJIILL && (bitmap = (Bitmap) this.LJIJJ.getValue(this, LJJJLIIL[0])) != null) {
                width2 = bitmap.getWidth();
            } else {
                width2 = 0;
            }
            int i9 = i8 + width2 + this.LJJJJL + this.LJJJJLI;
            this.LJJJIL = i9;
            this.LJJJJ = i9 + this.LJJII + this.LJJIFFI;
        }
        if (this.LJJJJZ) {
            return 0;
        }
        return this.LJJJJ;
    }

    @Override // X.AbstractC521080Kc6
    public void LIZLLL(Canvas canvas, Paint paint) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int iLJIIJ;
        boolean z;
        boolean z2;
        byte[] ninePatchChunk;
        if (this.LJJJJZ) {
            return;
        }
        paint.reset();
        paint.setAntiAlias(true);
        if (this.LJIILLIIL) {
            Bitmap bitmap3 = this.LJII;
            RectF rectF = (RectF) this.LJJIL.getValue();
            if (this.LJIIL) {
                int i = this.LIZIZ - this.LJJIFFI;
                float f = i - this.LJJJIL;
                float f2 = this.LJJIJLIJ;
                rectF.left = f + f2;
                rectF.right = i - f2;
                float f3 = 0;
                rectF.top = f2 + f3;
                rectF.bottom = (LJIIJ() - f3) - this.LJJIJLIJ;
            } else {
                float f4 = this.LJJIFFI;
                float f5 = this.LJJIJLIJ;
                rectF.left = f4 + f5;
                rectF.right = (this.LJJJIL + f4) - f5;
                float f6 = 0;
                rectF.top = f5 + f6;
                rectF.bottom = (LJIIJ() - f6) - this.LJJIJLIJ;
            }
            if (bitmap3 != null) {
                RectF rectF2 = (RectF) this.LJJIL.getValue();
                if (this.LJIIL && this.LJJI) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bitmap3.getNinePatchChunk() != null) {
                    Bitmap bitmap4 = this.LJII;
                    if (bitmap4 != null) {
                        ninePatchChunk = bitmap4.getNinePatchChunk();
                    } else {
                        ninePatchChunk = null;
                    }
                    NinePatch ninePatch = new NinePatch(bitmap4, ninePatchChunk, null);
                    if (z2) {
                        canvas.save();
                        canvas.translate(rectF2.right - rectF2.left, 0.0f);
                        canvas.scale(-1.0f, 1.0f);
                    }
                    ninePatch.draw(canvas, rectF2);
                    if (z2) {
                        canvas.restore();
                    }
                } else {
                    LJI(canvas, bitmap3, rectF2, z2, rectF2.right - rectF2.left, null, null);
                }
            } else {
                RectF rectF3 = (RectF) this.LJJIL.getValue();
                paint.setAntiAlias(true);
                paint.setColor(this.LJJIJIIJIL);
                float f7 = this.LJIL;
                canvas.drawRoundRect(rectF3, f7, f7, paint);
                paint.setColor(this.LJJIJIL);
                paint.setDither(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(C497740JfY.LIZIZ(0.5f));
                float f8 = this.LJIL;
                canvas.drawRoundRect(rectF3, f8, f8, paint);
            }
        }
        if (this.LJIILIIL && (bitmap2 = this.LJI) != null && !bitmap2.isRecycled()) {
            C521100Kc8 c521100Kc8 = this.LJIIJ;
            if (c521100Kc8 != null && c521100Kc8.LJJIII) {
                iLJIIJ = (LJIIJ() - this.LJJJJIZL) / 2;
            } else if (this.LJJJJJL) {
                iLJIIJ = 0;
            } else {
                iLJIIJ = this.LJJIIJ;
                if (iLJIIJ <= 0 && this.LJJIIJZLJL <= 0) {
                    iLJIIJ = (LJIIJ() - this.LJJJJIZL) / 2;
                }
            }
            Rect rect = (Rect) this.LJJJ.getValue();
            if (this.LJIIL) {
                int i2 = this.LIZIZ - (this.LJJJJL + this.LJJIFFI);
                rect.left = i2 - this.LJJJJI;
                rect.right = i2;
            } else {
                int i3 = this.LJJJJL + this.LJJIFFI;
                rect.left = i3;
                rect.right = i3 + this.LJJJJI;
            }
            rect.top = iLJIIJ;
            rect.bottom = this.LJJJJIZL + iLJIIJ;
            Bitmap bitmap5 = this.LJI;
            RectF rectF4 = new RectF((Rect) this.LJJJ.getValue());
            if (this.LJIIL && this.LJJ) {
                z = true;
            } else {
                z = false;
            }
            LJI(canvas, bitmap5, rectF4, z, ((this.LIZIZ + ((Rect) this.LJJJ.getValue()).left) - this.LJJJJL) - this.LJJIFFI, new C1113940f5s(this), new C1113950f5t(this));
        }
        if (this.LJIILJJIL) {
            LJIILJJIL(canvas, paint);
        }
        if (this.LJIILL && (bitmap = (Bitmap) this.LJIJJ.getValue(this, LJJJLIIL[0])) != null && !bitmap.isRecycled()) {
            int iLJIIJ2 = LJIIJ() - bitmap.getHeight();
            Rect rect2 = new Rect();
            if (this.LJIIL) {
                int i4 = this.LJJIII + this.LJJII;
                rect2.left = i4;
                rect2.right = i4 + bitmap.getWidth();
            } else {
                rect2.left = ((this.LIZIZ - this.LJJIII) - this.LJJII) - bitmap.getWidth();
                rect2.right = (this.LIZIZ - this.LJJIII) - this.LJJII;
            }
            int i5 = iLJIIJ2 / 2;
            rect2.top = i5;
            rect2.bottom = bitmap.getHeight() + i5;
            LJI(canvas, bitmap, new RectF(rect2), this.LJIIL, (rect2.right - rect2.left) + (this.LJJIII * 2) + (this.LJJII * 2), null, null);
        }
        paint.reset();
    }

    public void LJIILJJIL(Canvas canvas, Paint paint) {
        int i;
        int i2;
        boolean z;
        C1119920fFW.LIZLLL(this.LIZ, paint, this.LIZLLL, this.LJJJI);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        paint.setColor(this.LJJIJIIJI);
        paint.setStyle(Paint.Style.FILL);
        if (this.LJIIL) {
            i2 = (((this.LIZIZ - this.LJJJJI) - this.LJJIIZI) - (this.LJJJJL + this.LJJIFFI)) - this.LJJJJLL;
        } else {
            int i3 = ((Rect) this.LJJJ.getValue()).right + this.LJJIIZI;
            if (this.LJIILIIL && this.LJI != null) {
                i = 0;
            } else {
                i = this.LJJJJL + this.LJJIFFI;
            }
            i2 = i3 + i;
        }
        int alpha = paint.getAlpha();
        Integer numValueOf = Integer.valueOf(LJIIIZ());
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            paint.setAlpha(numValueOf.intValue());
        }
        float fLJIIJ = ((LJIIJ() - fontMetricsInt.descent) - fontMetricsInt.ascent) / 2.0f;
        float f = i2;
        canvas.drawText(String.valueOf(LJIILIIL()), f, fLJIIJ, paint);
        Integer numValueOf2 = Integer.valueOf(LJIIIIZZ());
        if (numValueOf2.intValue() >= 0) {
            paint.setAlpha(numValueOf2.intValue());
        }
        String strLJIIL = LJIIL();
        if (strLJIIL != null) {
            canvas.drawText(strLJIIL, f, fLJIIJ, paint);
        }
        paint.setAlpha(alpha);
    }

    public C1113930f5r(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, String str, C521100Kc8 c521100Kc8) {
        Integer numValueOf;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Integer numValueOf2;
        Boolean boolValueOf8;
        Boolean boolValueOf9;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        Integer numValueOf8;
        Integer numValueOf9;
        Integer numValueOf10;
        Boolean boolValueOf10;
        Integer numValueOf11;
        Integer numValueOf12;
        Integer numValueOf13;
        int iIntValue;
        Integer numValueOf14;
        int iIntValue2;
        Integer numValueOf15;
        int iIntValue3;
        Boolean boolValueOf11;
        Integer numValueOf16;
        boolean z;
        super(context);
        this.LJI = bitmap;
        this.LJII = bitmap2;
        this.LJIIIIZZ = bitmap3;
        this.LJIIIZ = str;
        this.LJIIJ = c521100Kc8;
        this.LJIIJJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(311));
        C1113970f5v c1113970f5vLJIIJJI = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf = Integer.valueOf(c521100Kc8.LJIILJJIL);
        } else {
            numValueOf = null;
        }
        C1113970f5v.LIZIZ(c1113970f5vLJIIJJI, numValueOf, -1, false, 4);
        C1113970f5v c1113970f5vLJIIJJI2 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf = Boolean.valueOf(c521100Kc8.LJI);
        } else {
            boolValueOf = null;
        }
        this.LJIIL = C1113970f5v.LIZ(c1113970f5vLJIIJJI2, boolValueOf);
        C1113970f5v c1113970f5vLJIIJJI3 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf2 = Boolean.valueOf(c521100Kc8.LIZ);
        } else {
            boolValueOf2 = null;
        }
        boolean zLIZ = C1113970f5v.LIZ(c1113970f5vLJIIJJI3, boolValueOf2);
        this.LJIILIIL = zLIZ;
        C1113970f5v c1113970f5vLJIIJJI4 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf3 = Boolean.valueOf(c521100Kc8.LIZIZ);
        } else {
            boolValueOf3 = null;
        }
        boolean zLIZ2 = C1113970f5v.LIZ(c1113970f5vLJIIJJI4, boolValueOf3);
        this.LJIILJJIL = zLIZ2;
        C1113970f5v c1113970f5vLJIIJJI5 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf4 = Boolean.valueOf(c521100Kc8.LIZJ);
        } else {
            boolValueOf4 = null;
        }
        boolean zLIZ3 = C1113970f5v.LIZ(c1113970f5vLJIIJJI5, boolValueOf4);
        this.LJIILL = zLIZ3;
        C1113970f5v c1113970f5vLJIIJJI6 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf5 = Boolean.valueOf(c521100Kc8.LIZLLL);
        } else {
            boolValueOf5 = null;
        }
        boolean zLIZ4 = C1113970f5v.LIZ(c1113970f5vLJIIJJI6, boolValueOf5);
        this.LJIILLIIL = zLIZ4;
        C1113970f5v c1113970f5vLJIIJJI7 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf6 = Boolean.valueOf(c521100Kc8.LJJIII);
        } else {
            boolValueOf6 = null;
        }
        boolean zLIZ5 = C1113970f5v.LIZ(c1113970f5vLJIIJJI7, boolValueOf6);
        this.LJIIZILJ = zLIZ5;
        C1113970f5v c1113970f5vLJIIJJI8 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf7 = Boolean.valueOf(c521100Kc8.LIZLLL);
        } else {
            boolValueOf7 = null;
        }
        C1113970f5v.LIZ(c1113970f5vLJIIJJI8, boolValueOf7);
        C1113970f5v c1113970f5vLJIIJJI9 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf2 = Integer.valueOf(c521100Kc8.LJIILIIL);
        } else {
            numValueOf2 = null;
        }
        this.LJIJ = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI9, numValueOf2, 0, false, 6);
        this.LJIJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 611));
        this.LJIJJ = new C1113960f5u(new AwS418S0200000_17(this, context, 116));
        this.LJIJJLI = new Paint(1);
        this.LJIL = context.getResources().getDimensionPixelSize(R.dimen.sz);
        C1113970f5v c1113970f5vLJIIJJI10 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf8 = Boolean.valueOf(c521100Kc8.LJ);
        } else {
            boolValueOf8 = null;
        }
        this.LJJ = C1113970f5v.LIZ(c1113970f5vLJIIJJI10, boolValueOf8);
        C1113970f5v c1113970f5vLJIIJJI11 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf9 = Boolean.valueOf(c521100Kc8.LJFF);
        } else {
            boolValueOf9 = null;
        }
        this.LJJI = C1113970f5v.LIZ(c1113970f5vLJIIJJI11, boolValueOf9);
        C1113970f5v c1113970f5vLJIIJJI12 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf3 = Integer.valueOf(c521100Kc8.LJII);
        } else {
            numValueOf3 = null;
        }
        this.LJJIFFI = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI12, numValueOf3, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI13 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf4 = Integer.valueOf(c521100Kc8.LJIIIIZZ);
        } else {
            numValueOf4 = null;
        }
        this.LJJII = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI13, numValueOf4, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI14 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf5 = Integer.valueOf(c521100Kc8.LJIIIZ);
        } else {
            numValueOf5 = null;
        }
        int iLIZIZ = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI14, numValueOf5, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI15 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf6 = Integer.valueOf(c521100Kc8.LJIIJ);
        } else {
            numValueOf6 = null;
        }
        int iLIZIZ2 = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI15, numValueOf6, 0, false, 6);
        this.LJJIII = iLIZIZ2;
        C1113970f5v c1113970f5vLJIIJJI16 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf7 = Integer.valueOf(c521100Kc8.LJIIJJI);
        } else {
            numValueOf7 = null;
        }
        this.LJJIIJ = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI16, numValueOf7, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI17 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf8 = Integer.valueOf(c521100Kc8.LJIIL);
        } else {
            numValueOf8 = null;
        }
        this.LJJIIJZLJL = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI17, numValueOf8, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI18 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf9 = Integer.valueOf(c521100Kc8.LJIILL);
        } else {
            numValueOf9 = null;
        }
        this.LJJIIZ = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI18, numValueOf9, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI19 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf10 = Integer.valueOf(c521100Kc8.LJIILLIIL);
        } else {
            numValueOf10 = null;
        }
        this.LJJIIZI = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI19, numValueOf10, 0, zLIZ && zLIZ2, 2);
        C1113970f5v c1113970f5vLJIIJJI20 = LJIIJJI();
        if (c521100Kc8 != null) {
            boolValueOf10 = Boolean.valueOf(c521100Kc8.LJIIZILJ);
        } else {
            boolValueOf10 = null;
        }
        this.LJJIJ = C1113970f5v.LIZ(c1113970f5vLJIIJJI20, boolValueOf10);
        C1113970f5v c1113970f5vLJIIJJI21 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf11 = Integer.valueOf(c521100Kc8.LJIJ);
        } else {
            numValueOf11 = null;
        }
        C1113970f5v.LIZIZ(c1113970f5vLJIIJJI21, numValueOf11, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI22 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf12 = Integer.valueOf(c521100Kc8.LJIJI);
        } else {
            numValueOf12 = null;
        }
        C1113970f5v.LIZIZ(c1113970f5vLJIIJJI22, numValueOf12, 0, false, 6);
        C1113970f5v c1113970f5vLJIIJJI23 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf13 = Integer.valueOf(c521100Kc8.LJIJJ);
        } else {
            numValueOf13 = null;
        }
        c1113970f5vLJIIJJI23.getClass();
        if (numValueOf13 != null) {
            iIntValue = numValueOf13.intValue();
        } else {
            iIntValue = -1;
        }
        this.LJJIJIIJI = iIntValue;
        C1113970f5v c1113970f5vLJIIJJI24 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf14 = Integer.valueOf(c521100Kc8.LJIL);
        } else {
            numValueOf14 = null;
        }
        c1113970f5vLJIIJJI24.getClass();
        if (numValueOf14 != null) {
            iIntValue2 = numValueOf14.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LJJIJIIJIL = iIntValue2;
        C1113970f5v c1113970f5vLJIIJJI25 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf15 = Integer.valueOf(c521100Kc8.LJJ);
        } else {
            numValueOf15 = null;
        }
        c1113970f5vLJIIJJI25.getClass();
        if (numValueOf15 != null) {
            iIntValue3 = numValueOf15.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.LJJIJIL = iIntValue3;
        if (c521100Kc8 != null) {
            boolValueOf11 = Boolean.valueOf(c521100Kc8.LJIJJLI);
        } else {
            boolValueOf11 = null;
        }
        this.LJJIJL = boolValueOf11;
        this.LJJIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(313));
        this.LJJIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(314));
        this.LJJJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(312));
        this.LJJJI = 500;
        C1113970f5v c1113970f5vLJIIJJI26 = LJIIJJI();
        if (c521100Kc8 != null) {
            numValueOf16 = Integer.valueOf(c521100Kc8.LJIILIIL);
        } else {
            numValueOf16 = null;
        }
        this.LJJJJJ = C1113970f5v.LIZIZ(c1113970f5vLJIIJJI26, numValueOf16, this.LIZJ, false, 4);
        if (zLIZ && !zLIZ2 && !zLIZ3) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJJJL = z;
        if (z && !zLIZ5) {
            iLIZIZ = 0;
        }
        this.LJJJJL = iLIZIZ;
        this.LJJJJLI = z ? 0 : iLIZIZ2;
        this.LJJJJZ = !(zLIZ || zLIZ2 || zLIZ3 || (zLIZ4 && bitmap2 != null)) || c521100Kc8 == null;
    }

    public final void LJI(Canvas canvas, Bitmap bitmap, RectF rectF, boolean z, float f, Function2<? super Canvas, ? super RectF, Unit> function2, Function2<? super Canvas, ? super RectF, Unit> function22) {
        if (bitmap != null) {
            if (z && f > 0.0f) {
                canvas.save();
                canvas.translate(f, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            if (function2 != null) {
                function2.invoke(canvas, rectF);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rectF, this.LJIJJLI);
            if (function22 != null) {
                function22.invoke(canvas, rectF);
            }
            if (z && f > 0.0f) {
                canvas.restore();
            }
        }
    }
}
