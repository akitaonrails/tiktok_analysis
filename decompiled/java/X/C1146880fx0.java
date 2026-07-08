package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146880fx0 extends C09AY implements InterfaceC2280181EMu<Matrix, Rect, Integer, Integer, Float, Float, Float, Float, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146880fx0(boolean z) {
        super(8);
        this.LL = z;
    }

    @Override // X.InterfaceC2280181EMu
    public final Unit dN(Matrix matrix, Rect rect, Integer num, Integer num2, Float f, Float f2, Float f3, Float f4) {
        Matrix matrix2 = matrix;
        Rect rect2 = rect;
        int iIntValue = num.intValue();
        num2.intValue();
        f.floatValue();
        f2.floatValue();
        f3.floatValue();
        f4.floatValue();
        if (rect2 != null) {
            float fWidth = rect2.width() / iIntValue;
            if (this.LL) {
                if (matrix2 != null) {
                    matrix2.setScale(-fWidth, fWidth);
                    matrix2.postTranslate(rect2.right, rect2.top);
                }
            } else if (matrix2 != null) {
                matrix2.setScale(fWidth, fWidth);
                matrix2.postTranslate(rect2.left, rect2.top);
            }
        }
        return Unit.LIZ;
    }
}
