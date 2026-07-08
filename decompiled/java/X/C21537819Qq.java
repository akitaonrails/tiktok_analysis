package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21537819Qq extends AbstractC20736516Cl implements InterfaceC1080960eEg {
    public final EnumC1779280wP0 LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final float[] LLIZ = new float[8];
    public final Path LLIZLLLIL;
    public final Path LLJ;
    public final Paint LLJI;
    public final Paint LLJIJIL;
    public final RectF LLJILJIL;
    public float LLJILJILJ;
    public C21538119Qt LLJILLL;
    public ColorStateList LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public boolean LLJJJ;
    public final InterfaceC21538019Qs LLJJJIL;
    public final Rect LLJJJJ;
    public C21537919Qr LLJJJJJIL;

    public final C21537919Qr LJFF() {
        if (this.LLJJJJJIL == null) {
            C21537919Qr c21537919Qr = new C21537919Qr();
            this.LLJJJJJIL = c21537919Qr;
            InterfaceC21538019Qs interfaceC21538019Qs = this.LLJJJIL;
            c21537919Qr.LLILZLL = interfaceC21538019Qs;
            c21537919Qr.LIZ();
            if (interfaceC21538019Qs != null) {
                interfaceC21538019Qs.invalidate();
            }
        }
        return this.LLJJJJJIL;
    }

    public final void LJII() {
        if (this.LLJJJJ.width() <= 0 || this.LLJJJJ.height() <= 0) {
            return;
        }
        boolean zLIZIZ = this.LLJJJIL.LIZIZ();
        this.LLIZLLLIL.reset();
        this.LLJ.reset();
        this.LLJJJ = false;
        float fWidth = this.LLJJJJ.width();
        float fHeight = this.LLJJJJ.height();
        this.LLJILJIL.set(0.0f, 0.0f, fWidth, fHeight);
        Arrays.fill(this.LLIZ, 0.0f);
        float fMin = Math.min(fWidth, fHeight) / 2.0f;
        float f = this.LLJJI;
        if (f > 0.0f) {
            float[] fArr = this.LLIZ;
            fArr[7] = f;
            fArr[6] = f;
            fArr[5] = f;
            fArr[4] = f;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            fArr[0] = f;
            this.LLJJJ = true;
        }
        float f2 = this.LLJJIII;
        if (f2 > 0.0f) {
            if (zLIZIZ) {
                float[] fArr2 = this.LLIZ;
                fArr2[3] = f2;
                fArr2[2] = f2;
            } else {
                float[] fArr3 = this.LLIZ;
                fArr3[1] = f2;
                fArr3[0] = f2;
            }
            this.LLJJJ = true;
        }
        float f3 = this.LLJJIJI;
        if (f3 > 0.0f) {
            if (zLIZIZ) {
                float[] fArr4 = this.LLIZ;
                fArr4[1] = f3;
                fArr4[0] = f3;
            } else {
                float[] fArr5 = this.LLIZ;
                fArr5[3] = f3;
                fArr5[2] = f3;
            }
            this.LLJJJ = true;
        }
        float f4 = this.LLJJIJIIJIL;
        if (f4 > 0.0f) {
            if (zLIZIZ) {
                float[] fArr6 = this.LLIZ;
                fArr6[5] = f4;
                fArr6[4] = f4;
            } else {
                float[] fArr7 = this.LLIZ;
                fArr7[7] = f4;
                fArr7[6] = f4;
            }
            this.LLJJJ = true;
        }
        float f5 = this.LLJJIJIL;
        if (f5 > 0.0f) {
            if (zLIZIZ) {
                float[] fArr8 = this.LLIZ;
                fArr8[7] = f5;
                fArr8[6] = f5;
            } else {
                float[] fArr9 = this.LLIZ;
                fArr9[5] = f5;
                fArr9[4] = f5;
            }
            this.LLJJJ = true;
        }
        if (this.LLILLJJLI) {
            Arrays.fill(this.LLIZ, fMin);
            this.LLJJJ = true;
        }
        if (this.LLILLL) {
            if (zLIZIZ) {
                float[] fArr10 = this.LLIZ;
                fArr10[3] = fMin;
                fArr10[2] = fMin;
            } else {
                float[] fArr11 = this.LLIZ;
                fArr11[1] = fMin;
                fArr11[0] = fMin;
            }
            this.LLJJJ = true;
        }
        if (this.LLILZ) {
            if (zLIZIZ) {
                float[] fArr12 = this.LLIZ;
                fArr12[1] = fMin;
                fArr12[0] = fMin;
            } else {
                float[] fArr13 = this.LLIZ;
                fArr13[3] = fMin;
                fArr13[2] = fMin;
            }
            this.LLJJJ = true;
        }
        if (this.LLILZIL) {
            if (zLIZIZ) {
                float[] fArr14 = this.LLIZ;
                fArr14[5] = fMin;
                fArr14[4] = fMin;
            } else {
                float[] fArr15 = this.LLIZ;
                fArr15[7] = fMin;
                fArr15[6] = fMin;
            }
            this.LLJJJ = true;
        }
        if (this.LLILZLL) {
            if (zLIZIZ) {
                float[] fArr16 = this.LLIZ;
                fArr16[7] = fMin;
                fArr16[6] = fMin;
            } else {
                float[] fArr17 = this.LLIZ;
                fArr17[5] = fMin;
                fArr17[4] = fMin;
            }
            this.LLJJJ = true;
        }
        boolean z = this.LLJJJ && !LJIIIIZZ();
        this.LLJJJ = z;
        if (z) {
            this.LLIZLLLIL.addRoundRect(this.LLJILJIL, this.LLIZ, Path.Direction.CW);
        } else if (LJIIIIZZ()) {
            this.LLJJJIL.LIZJ(this.LLIZ[0]);
        }
        this.LLJ.addRoundRect(this.LLJILJIL, this.LLIZ, Path.Direction.CW);
        if (this.LLJILLL != null) {
            Paint paint = this.LLJIJIL;
            float f6 = zLIZIZ ? fWidth : 0.0f;
            float f7 = fHeight / 2.0f;
            if (zLIZIZ) {
                fWidth = 0.0f;
            }
            paint.setShader(new LinearGradient(f6, f7, fWidth, f7, this.LLJILLL.LIZ, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    public final boolean LJIIIIZZ() {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI == null) {
            return false;
        }
        c1119850fFP.LJJI.getClass();
        if (this.LL != EnumC1779280wP0.VIEW) {
            return false;
        }
        float[] fArr = this.LLIZ;
        float f = fArr[0];
        if (f <= 0.0f) {
            return false;
        }
        float f2 = fArr[1];
        if (f != f2) {
            return false;
        }
        float f3 = fArr[2];
        if (f2 != f3) {
            return false;
        }
        float f4 = fArr[3];
        if (f3 != f4) {
            return false;
        }
        float f5 = fArr[4];
        if (f4 != f5) {
            return false;
        }
        float f6 = fArr[5];
        if (f5 != f6) {
            return false;
        }
        float f7 = fArr[6];
        return f6 == f7 && f7 == fArr[7];
    }

    @Override // X.InterfaceC1080590eE5
    public final int[] getGradientColors() {
        return LJFF().LL;
    }

    @Override // X.InterfaceC1080590eE5
    public final float[] getGradientPositions() {
        return LJFF().LLILLJJLI;
    }

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        return R$styleable.ShapeControlHelper;
    }

    public final void LJI(Canvas canvas) {
        int colorForState;
        C21537919Qr c21537919Qr = this.LLJJJJJIL;
        if (c21537919Qr != null && c21537919Qr.LL != null) {
            canvas.drawRect(0.0f, 0.0f, c21537919Qr.LLILZIL.width(), c21537919Qr.LLILZIL.height(), c21537919Qr.LLILLL);
        }
        float f = this.LLJILJILJ;
        if (f > 0.0f) {
            if (this.LLJILLL != null) {
                this.LLJIJIL.setStrokeWidth(f * 2.0f);
                canvas.drawPath(this.LLJ, this.LLJIJIL);
                return;
            }
            ColorStateList colorStateList = this.LLJJ;
            if (colorStateList == null || (colorForState = colorStateList.getColorForState(this.LLJJJIL.getState(), 0)) == 0) {
                return;
            }
            this.LLJIJIL.setStrokeWidth(this.LLJILJILJ * 2.0f);
            this.LLJIJIL.setColor(colorForState);
            canvas.drawPath(this.LLJ, this.LLJIJIL);
        }
    }

    @Override // X.InterfaceC1080960eEg
    public final void setRadius(float f) {
        if (this.LLJJI == f) {
            return;
        }
        this.LLJJI = f;
        LJII();
        this.LLJJJIL.invalidate();
    }

    public C21537819Qq(InterfaceC21538019Qs interfaceC21538019Qs, EnumC1779280wP0 enumC1779280wP0) {
        Path path = new Path();
        this.LLIZLLLIL = path;
        Path path2 = new Path();
        this.LLJ = path2;
        Paint paint = new Paint(1);
        this.LLJI = paint;
        Paint paint2 = new Paint(1);
        this.LLJIJIL = paint2;
        this.LLJILJIL = new RectF();
        this.LLJJJJ = new Rect();
        this.LLJJJIL = interfaceC21538019Qs;
        this.LL = enumC1779280wP0;
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        path2.setFillType(Path.FillType.WINDING);
        paint2.setStyle(Paint.Style.STROKE);
    }

    public final void LJ(Context context, TypedArray typedArray) {
        boolean z;
        int resourceId;
        if (typedArray.getBoolean(R$styleable.ShapeControlHelper_applyRoundStyle, false) && (resourceId = typedArray.getResourceId(R$styleable.ShapeControlHelper_cornerAppearance, 0)) != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, R$styleable.CornerAppearance);
            this.LLJJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.CornerAppearance_radius, this.LLJJI);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.LLJJI = typedArray.getDimension(R$styleable.ShapeControlHelper_radius, this.LLJJI);
        }
        this.LLILLJJLI = typedArray.getBoolean(R$styleable.ShapeControlHelper_circular, this.LLILLJJLI);
        this.LLILLL = typedArray.getBoolean(R$styleable.ShapeControlHelper_topStartCircular, this.LLILLL);
        this.LLILZ = typedArray.getBoolean(R$styleable.ShapeControlHelper_topEndCircular, this.LLILZ);
        this.LLILZIL = typedArray.getBoolean(R$styleable.ShapeControlHelper_bottomStartCircular, this.LLILZIL);
        this.LLILZLL = typedArray.getBoolean(R$styleable.ShapeControlHelper_bottomEndCircular, this.LLILZLL);
        this.LLJJIII = typedArray.getDimension(R$styleable.ShapeControlHelper_topStartRadius, this.LLJJIII);
        this.LLJJIJI = typedArray.getDimension(R$styleable.ShapeControlHelper_topEndRadius, this.LLJJIJI);
        this.LLJJIJIIJIL = typedArray.getDimension(R$styleable.ShapeControlHelper_bottomStartRadius, this.LLJJIJIIJIL);
        this.LLJJIJIL = typedArray.getDimension(R$styleable.ShapeControlHelper_bottomEndRadius, this.LLJJIJIL);
        int resourceId2 = typedArray.getResourceId(R$styleable.ShapeControlHelper_strokeColor, 0);
        if (resourceId2 != 0) {
            this.LLJJ = C838410Wul.LIZIZ(resourceId2, context);
        } else if (typedArray.hasValue(R$styleable.ShapeControlHelper_strokeColor)) {
            this.LLJJ = typedArray.getColorStateList(R$styleable.ShapeControlHelper_strokeColor);
        }
        if (typedArray.hasValue(R$styleable.ShapeControlHelper_strokeStartColor)) {
            if (this.LLJILLL == null) {
                C21538119Qt c21538119Qt = new C21538119Qt();
                this.LLJILLL = c21538119Qt;
                c21538119Qt.LIZ = new int[2];
            }
            this.LLJILLL.LIZ[0] = typedArray.getColor(R$styleable.ShapeControlHelper_strokeStartColor, 0);
            z = true;
        } else {
            z = false;
        }
        if (typedArray.hasValue(R$styleable.ShapeControlHelper_strokeEndColor)) {
            if (this.LLJILLL == null) {
                C21538119Qt c21538119Qt2 = new C21538119Qt();
                this.LLJILLL = c21538119Qt2;
                c21538119Qt2.LIZ = new int[2];
            }
            this.LLJILLL.LIZ[1] = typedArray.getColor(R$styleable.ShapeControlHelper_strokeEndColor, 0);
            z = true;
        }
        if (!z) {
            this.LLJILLL = null;
        } else {
            this.LLJJ = null;
        }
        this.LLJILJILJ = typedArray.getDimension(R$styleable.ShapeControlHelper_strokeWidth, this.LLJILJILJ);
        this.LLJJJJJIL = null;
        if (typedArray.hasValue(R$styleable.ShapeControlHelper_android_startColor) && typedArray.hasValue(R$styleable.ShapeControlHelper_android_endColor)) {
            int color = typedArray.getColor(R$styleable.ShapeControlHelper_android_startColor, 0);
            int color2 = typedArray.getColor(R$styleable.ShapeControlHelper_android_endColor, 0);
            if (typedArray.hasValue(R$styleable.ShapeControlHelper_android_centerColor)) {
                LJFF().LJLILLLLZI(null, new int[]{color, typedArray.getColor(R$styleable.ShapeControlHelper_android_centerColor, 0), color2});
            } else {
                LJFF().LJLILLLLZI(null, new int[]{color, color2});
            }
        } else if (typedArray.hasValue(R$styleable.ShapeControlHelper_gradientColors)) {
            int resourceId3 = typedArray.getResourceId(R$styleable.ShapeControlHelper_gradientColors, 0);
            Resources resources = context.getResources();
            C21537919Qr c21537919QrLJFF = LJFF();
            if (resourceId3 != 0) {
                c21537919QrLJFF.getClass();
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(resourceId3);
                int length = typedArrayObtainTypedArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = typedArrayObtainTypedArray.getColor(i, -16777216);
                }
                c21537919QrLJFF.LJLILLLLZI(null, iArr);
                typedArrayObtainTypedArray.recycle();
            } else {
                c21537919QrLJFF.LJLILLLLZI(null, null);
            }
        }
        if (typedArray.hasValue(R$styleable.ShapeControlHelper_gradientPositions)) {
            int resourceId4 = typedArray.getResourceId(R$styleable.ShapeControlHelper_gradientPositions, 0);
            Resources resources2 = context.getResources();
            int[] gradientColors = getGradientColors();
            C21537919Qr c21537919QrLJFF2 = LJFF();
            if (resourceId4 != 0) {
                c21537919QrLJFF2.getClass();
                TypedArray typedArrayObtainTypedArray2 = resources2.obtainTypedArray(resourceId4);
                int length2 = typedArrayObtainTypedArray2.length();
                float[] fArr = new float[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = typedArrayObtainTypedArray2.getFloat(i2, 0.0f);
                }
                c21537919QrLJFF2.LJLILLLLZI(fArr, gradientColors);
                typedArrayObtainTypedArray2.recycle();
            } else {
                c21537919QrLJFF2.LJLILLLLZI(null, gradientColors);
            }
        }
        int i3 = typedArray.getInt(R$styleable.ShapeControlHelper_gradientOrientation, LJFF().LLILZ);
        C21537919Qr c21537919QrLJFF3 = LJFF();
        c21537919QrLJFF3.LLILZ = i3;
        c21537919QrLJFF3.LIZ();
        InterfaceC21538219Qu interfaceC21538219Qu = c21537919QrLJFF3.LLILZLL;
        if (interfaceC21538219Qu != null) {
            interfaceC21538219Qu.invalidate();
        }
        LJII();
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        LJFF().LJLILLLLZI(fArr, iArr);
    }
}
