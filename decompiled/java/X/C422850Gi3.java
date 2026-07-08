package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C422850Gi3 extends SmartImageView {
    public C1D90 LLIZLLLIL;

    public C422850Gi3() {
        throw null;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIIIZZ(Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float[] fArr;
        Float fLJJIII;
        float[] fArr2;
        Float fLJJIII2;
        Path path = new Path();
        float[] fArr3 = new float[8];
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        if (c1331100kk8 != null && (fArr2 = c1331100kk8.LIZJ) != null && (fLJJIII2 = C13LQ.LJJIII(6, fArr2)) != null) {
            fFloatValue = fLJJIII2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr3[6] = fFloatValue;
        C1331100kk8 c1331100kk82 = getHierarchy().LIZJ;
        if (c1331100kk82 != null && (fArr = c1331100kk82.LIZJ) != null && (fLJJIII = C13LQ.LJJIII(7, fArr)) != null) {
            fFloatValue2 = fLJJIII.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        fArr3[7] = fFloatValue2;
        float f = 2;
        path.addRoundRect(0.0f, getHeight() / f, getWidth() / f, getHeight(), fArr3, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(0.0f, getHeight() / 2.0f);
        canvas.scale(0.5f, 0.5f);
    }

    public final void LJIIIZ(Canvas canvas) {
        float fFloatValue;
        float[] fArr;
        Float fLJJIII;
        float[] fArr2;
        Float fLJJIII2;
        Path path = new Path();
        float[] fArr3 = new float[8];
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        float fFloatValue2 = 0.0f;
        if (c1331100kk8 != null && (fArr2 = c1331100kk8.LIZJ) != null && (fLJJIII2 = C13LQ.LJJIII(4, fArr2)) != null) {
            fFloatValue = fLJJIII2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr3[4] = fFloatValue;
        C1331100kk8 c1331100kk82 = getHierarchy().LIZJ;
        if (c1331100kk82 != null && (fArr = c1331100kk82.LIZJ) != null && (fLJJIII = C13LQ.LJJIII(5, fArr)) != null) {
            fFloatValue2 = fLJJIII.floatValue();
        }
        fArr3[5] = fFloatValue2;
        float f = 2;
        path.addRoundRect(getWidth() / f, getHeight() / f, getWidth(), getHeight(), fArr3, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.scale(0.5f, 0.5f);
    }

    public final void LJIIJ(Canvas canvas) {
        C1D90 c1d90 = this.LLIZLLLIL;
        if (c1d90 != null) {
            switch (C1D91.LIZ[c1d90.ordinal()]) {
                case -1:
                case 7:
                    break;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    if (getLayoutDirection() == 0) {
                        LJIILJJIL(canvas);
                    } else {
                        LJIILL(canvas);
                    }
                    break;
                case 2:
                    if (getLayoutDirection() == 0) {
                        LJIILL(canvas);
                    } else {
                        LJIILJJIL(canvas);
                    }
                    break;
                case 3:
                    if (getLayoutDirection() == 0) {
                        LJIIIIZZ(canvas);
                    } else {
                        LJIIIZ(canvas);
                    }
                    break;
                case 4:
                    if (getLayoutDirection() == 0) {
                        LJIIIZ(canvas);
                    } else {
                        LJIIIIZZ(canvas);
                    }
                    break;
                case 5:
                    if (getLayoutDirection() == 0) {
                        LJIIJJI(canvas);
                    } else {
                        LJIIL(canvas);
                    }
                    break;
                case 6:
                    if (getLayoutDirection() == 0) {
                        LJIIL(canvas);
                    } else {
                        LJIIJJI(canvas);
                    }
                    break;
            }
        }
        super.onDraw(canvas);
    }

    public final void LJIIJJI(Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float[] fArr;
        Float fLJJIII;
        float[] fArr2;
        Float fLJJIII2;
        float[] fArr3;
        Float fLJJIII3;
        float[] fArr4;
        Float fLJJIII4;
        Path path = new Path();
        float[] fArr5 = new float[8];
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        if (c1331100kk8 != null && (fArr4 = c1331100kk8.LIZJ) != null && (fLJJIII4 = C13LQ.LJJIII(0, fArr4)) != null) {
            fFloatValue = fLJJIII4.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr5[0] = fFloatValue;
        C1331100kk8 c1331100kk82 = getHierarchy().LIZJ;
        if (c1331100kk82 != null && (fArr3 = c1331100kk82.LIZJ) != null && (fLJJIII3 = C13LQ.LJJIII(1, fArr3)) != null) {
            fFloatValue2 = fLJJIII3.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        fArr5[1] = fFloatValue2;
        C1331100kk8 c1331100kk83 = getHierarchy().LIZJ;
        if (c1331100kk83 != null && (fArr2 = c1331100kk83.LIZJ) != null && (fLJJIII2 = C13LQ.LJJIII(6, fArr2)) != null) {
            fFloatValue3 = fLJJIII2.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        fArr5[6] = fFloatValue3;
        C1331100kk8 c1331100kk84 = getHierarchy().LIZJ;
        if (c1331100kk84 != null && (fArr = c1331100kk84.LIZJ) != null && (fLJJIII = C13LQ.LJJIII(7, fArr)) != null) {
            fFloatValue4 = fLJJIII.floatValue();
        } else {
            fFloatValue4 = 0.0f;
        }
        fArr5[7] = fFloatValue4;
        path.addRoundRect(0.0f, 0.0f, getWidth() / 2, getHeight(), fArr5, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate((-getWidth()) / 4.0f, 0.0f);
    }

    public final void LJIIL(Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float[] fArr;
        Float fLJJIII;
        float[] fArr2;
        Float fLJJIII2;
        float[] fArr3;
        Float fLJJIII3;
        float[] fArr4;
        Float fLJJIII4;
        Path path = new Path();
        float[] fArr5 = new float[8];
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        if (c1331100kk8 != null && (fArr4 = c1331100kk8.LIZJ) != null && (fLJJIII4 = C13LQ.LJJIII(2, fArr4)) != null) {
            fFloatValue = fLJJIII4.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr5[2] = fFloatValue;
        C1331100kk8 c1331100kk82 = getHierarchy().LIZJ;
        if (c1331100kk82 != null && (fArr3 = c1331100kk82.LIZJ) != null && (fLJJIII3 = C13LQ.LJJIII(3, fArr3)) != null) {
            fFloatValue2 = fLJJIII3.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        fArr5[3] = fFloatValue2;
        C1331100kk8 c1331100kk83 = getHierarchy().LIZJ;
        if (c1331100kk83 != null && (fArr2 = c1331100kk83.LIZJ) != null && (fLJJIII2 = C13LQ.LJJIII(4, fArr2)) != null) {
            fFloatValue3 = fLJJIII2.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        fArr5[4] = fFloatValue3;
        C1331100kk8 c1331100kk84 = getHierarchy().LIZJ;
        if (c1331100kk84 != null && (fArr = c1331100kk84.LIZJ) != null && (fLJJIII = C13LQ.LJJIII(5, fArr)) != null) {
            fFloatValue4 = fLJJIII.floatValue();
        } else {
            fFloatValue4 = 0.0f;
        }
        fArr5[5] = fFloatValue4;
        path.addRoundRect(getWidth() / 2, 0.0f, getWidth(), getHeight(), fArr5, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(getWidth() / 4.0f, 0.0f);
    }

    public final void LJIILJJIL(Canvas canvas) {
        float fFloatValue;
        float[] fArr;
        Float fLJJIII;
        float[] fArr2;
        Float fLJJIII2;
        Path path = new Path();
        float[] fArr3 = new float[8];
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        float fFloatValue2 = 0.0f;
        if (c1331100kk8 != null && (fArr2 = c1331100kk8.LIZJ) != null && (fLJJIII2 = C13LQ.LJJIII(0, fArr2)) != null) {
            fFloatValue = fLJJIII2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr3[0] = fFloatValue;
        C1331100kk8 c1331100kk82 = getHierarchy().LIZJ;
        if (c1331100kk82 != null && (fArr = c1331100kk82.LIZJ) != null && (fLJJIII = C13LQ.LJJIII(1, fArr)) != null) {
            fFloatValue2 = fLJJIII.floatValue();
        }
        fArr3[1] = fFloatValue2;
        float f = 2;
        path.addRoundRect(0.0f, 0.0f, getWidth() / f, getHeight() / f, fArr3, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(0.5f, 0.5f);
    }

    public final void LJIILL(Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float[] fArr;
        Float fLJJIII;
        float[] fArr2;
        Float fLJJIII2;
        Path path = new Path();
        float[] fArr3 = new float[8];
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        if (c1331100kk8 != null && (fArr2 = c1331100kk8.LIZJ) != null && (fLJJIII2 = C13LQ.LJJIII(2, fArr2)) != null) {
            fFloatValue = fLJJIII2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr3[2] = fFloatValue;
        C1331100kk8 c1331100kk82 = getHierarchy().LIZJ;
        if (c1331100kk82 != null && (fArr = c1331100kk82.LIZJ) != null && (fLJJIII = C13LQ.LJJIII(3, fArr)) != null) {
            fFloatValue2 = fLJJIII.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        fArr3[3] = fFloatValue2;
        float f = 2;
        path.addRoundRect(getWidth() / f, 0.0f, getWidth(), getHeight() / f, fArr3, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(getWidth() / 2.0f, 0.0f);
        canvas.scale(0.5f, 0.5f);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setPortionCode(C1D90 c1d90) {
        if (this.LLIZLLLIL != c1d90) {
            this.LLIZLLLIL = c1d90;
            invalidate();
        }
    }

    public C422850Gi3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
