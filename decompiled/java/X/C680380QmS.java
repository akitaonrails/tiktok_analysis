package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0QmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680380QmS extends C680440QmY implements InterfaceC680690Qmx {
    public float LLLII;
    public ViewOnTouchListenerC680650Qmt LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public final float[] LLLIIL;
    public boolean LLLIILIL;

    @Override // X.C680440QmY
    public final void LJIIJ() {
    }

    public final float getMatrixY() {
        Matrix matrix;
        float[] fArr = new float[9];
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLLIIII;
        if (viewOnTouchListenerC680650Qmt != null && (matrix = viewOnTouchListenerC680650Qmt.LLJILLL) != null) {
            matrix.getValues(fArr);
        }
        return fArr[5];
    }

    @Override // X.C680440QmY
    public RectF getPhotoDisplayRect() {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLLIIII;
        if (viewOnTouchListenerC680650Qmt == null) {
            return null;
        }
        viewOnTouchListenerC680650Qmt.LIZJ();
        return viewOnTouchListenerC680650Qmt.LJ(viewOnTouchListenerC680650Qmt.LLJILLL);
    }

    @Override // X.C680440QmY
    public final void LJIIIZ() {
        RectF containerRect = getContainerRect();
        containerRect.left = getLeft();
        containerRect.top = getTop();
        containerRect.right = getRight();
        containerRect.bottom = this.LLLIIIIL;
    }

    public final boolean getCanDrag() {
        return this.LLLIILIL;
    }

    public final int getCanvasHeight() {
        return this.LLLIIIIL;
    }

    public final int getCanvasWidth() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC680690Qmx
    public final void LIZ(float f) {
        float f2;
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLLIIII;
        if (viewOnTouchListenerC680650Qmt != null) {
            Matrix matrix = viewOnTouchListenerC680650Qmt.LLJILLL;
            if (matrix == null) {
                f2 = 0.0f;
            } else {
                matrix.getValues(this.LLLIIL);
                f2 = this.LLLIIL[5];
            }
            if (f2 != this.LLLII) {
                this.LLLII = f2;
                invalidate();
            }
        }
    }

    @Override // X.C680440QmY
    public final float LJI(MotionEvent motionEvent) {
        return motionEvent.getY() - this.LLLII;
    }

    public final RectF LJIIJJI(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        float fWidth = rectF.width();
        float f = C680440QmY.LLL;
        if (fWidth < f) {
            float fWidth2 = (f - rectF.width()) / 2;
            float f2 = rectF.left - fWidth2;
            float f3 = rectF.right + fWidth2;
            if (f2 < 0.0f) {
                rectF2.left = 0.0f;
                rectF2.right = f3 - f2;
            } else {
                float f4 = this.LLLIIIL;
                if (f3 > f4) {
                    rectF2.right = f4;
                    rectF2.left = f2 - (f3 - f4);
                } else {
                    rectF2.left = f2;
                    rectF2.right = f3;
                }
            }
        }
        if (rectF.height() < f && rectF.height() < f) {
            float fHeight = (f - rectF.height()) / 2;
            float f5 = rectF.top - fHeight;
            float f6 = rectF.bottom + fHeight;
            if (f5 < 0.0f) {
                rectF2.top = 0.0f;
                rectF2.bottom = f6 - f5;
            } else {
                float f7 = this.LLLIIIIL;
                if (f6 > f7) {
                    rectF2.bottom = f7;
                    rectF2.top = f5 - (f6 - f7);
                    return rectF2;
                }
                rectF2.top = f5;
                rectF2.bottom = f6;
                return rectF2;
            }
        }
        return rectF2;
    }

    public final String LJIILIIL(RectF rectF) {
        try {
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            int i = this.LLLIIIL;
            int i2 = this.LLLIIIIL;
            float f5 = f2 / i2;
            float f6 = f4 / i2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(f / i);
            sbLIZ.append(',');
            sbLIZ.append(f5);
            sbLIZ.append(',');
            sbLIZ.append(f3 / i);
            sbLIZ.append(',');
            sbLIZ.append(f6);
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // X.C680440QmY, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.translate(0.0f, this.LLLII);
        super.onDraw(canvas);
    }

    public final void setAttacher(ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt) {
        Matrix matrix;
        this.LLLIIII = viewOnTouchListenerC680650Qmt;
        if (viewOnTouchListenerC680650Qmt != null && (matrix = viewOnTouchListenerC680650Qmt.LLJILLL) != null) {
            matrix.getValues(this.LLLIIL);
            this.LLLII = this.LLLIIL[5];
        }
    }

    public final void setCanDrag(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setCanvasHeight(int i) {
        this.LLLIIIIL = i;
    }

    public final void setCanvasWidth(int i) {
        this.LLLIIIL = i;
    }

    public final void setOurCircleColor(int i) {
        setOuterCircleColor(i);
    }

    public C680380QmS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLLIIL = new float[9];
    }

    public static RectF LJIIL(int i, int i2, String str) {
        RectF rectF = new RectF();
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            float f = CastFloatProtector.parseFloat((String) listLJJLIIIJILLIZJL.get(0));
            float f2 = CastFloatProtector.parseFloat((String) listLJJLIIIJILLIZJL.get(1));
            float f3 = CastFloatProtector.parseFloat((String) listLJJLIIIJILLIZJL.get(2));
            float f4 = CastFloatProtector.parseFloat((String) listLJJLIIIJILLIZJL.get(3));
            float f5 = i;
            float f6 = i2;
            rectF.left = f * f5;
            rectF.top = f2 * f6;
            rectF.right = f3 * f5;
            rectF.bottom = f4 * f6;
            return rectF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = 0.0f;
            rectF.bottom = 0.0f;
            return rectF;
        }
    }
}
