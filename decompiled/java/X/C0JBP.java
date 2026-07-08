package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JBP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBP extends C09AY implements InterfaceC2280181EMu<Matrix, Rect, Integer, Integer, Float, Float, Float, Float, Unit> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JBP(int i) {
        super(8);
        this.LL = i;
    }

    @Override // X.InterfaceC2280181EMu
    public final Unit dN(Matrix matrix, Rect rect, Integer num, Integer num2, Float f, Float f2, Float f3, Float f4) {
        Matrix matrix2 = matrix;
        Rect rect2 = rect;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        f.floatValue();
        f2.floatValue();
        f3.floatValue();
        f4.floatValue();
        if (rect2 != null) {
            if (matrix2 != null) {
                matrix2.reset();
            }
            float fLJIIZILJ = C497740JfY.LJIIZILJ();
            float fLJIILLIIL = C497740JfY.LJIILLIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateImage: screenWidth = ");
            sbLIZ.append(fLJIIZILJ);
            sbLIZ.append(", screenHeight = ");
            sbLIZ.append(fLJIILLIIL);
            sbLIZ.append(", parentRect = ");
            sbLIZ.append(rect2);
            sbLIZ.append(", childWidth = ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", childHeight = ");
            sbLIZ.append(iIntValue2);
            sbLIZ.append(", fromViewTop = ");
            sbLIZ.append(this.LL);
            C20441214yg.LJIIIZ("CastersBackgroundWidget", C2188811AlT.LIZIZ(sbLIZ));
            float f5 = iIntValue;
            float f6 = fLJIIZILJ / f5;
            float f7 = iIntValue2;
            float f8 = fLJIILLIIL / f7;
            float fMax = Math.max(f6, f8);
            float fWidth = rect2.left + ((rect2.width() - (f5 * fMax)) * 0.5f);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateImage: scaleX = ");
            sbLIZ2.append(f6);
            sbLIZ2.append(", scaleY = ");
            sbLIZ2.append(f8);
            sbLIZ2.append(", scale = ");
            sbLIZ2.append(fMax);
            sbLIZ2.append(", dx = ");
            sbLIZ2.append(fWidth);
            sbLIZ2.append(", dy = ");
            sbLIZ2.append((rect2.top - this.LL) - (((f7 * fMax) - fLJIILLIIL) / 2.0f));
            C20441214yg.LJIIIZ("CastersBackgroundWidget", C2188811AlT.LIZIZ(sbLIZ2));
            if (matrix2 != null) {
                matrix2.setScale(fMax, fMax);
                matrix2.postTranslate((int) (fWidth + 0.5f), (int) (r2 + 0.5f));
            }
        }
        return Unit.LIZ;
    }
}
