package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0F4J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4J extends C09AY implements InterfaceC1631620sYq<Integer, Integer, Float, Path> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C0F4J();
    }

    public C0F4J() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Path invoke(Integer num, Integer num2, Float f) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        float fFloatValue = f.floatValue();
        RectF rectF = C0F4I.LIZIZ;
        RectF rectF2 = new RectF(rectF.left * fFloatValue, rectF.top * fFloatValue, rectF.right * fFloatValue, rectF.bottom * fFloatValue);
        RectF rectF3 = new RectF(rectF2.left, rectF2.top, iIntValue - rectF2.right, iIntValue2 - rectF2.bottom);
        RectF rectF4 = C0F4I.LIZ;
        float fCenterX = rectF4.centerX() - (rectF4.left / rectF4.width());
        float fCenterY = rectF4.centerY() - (rectF4.top / rectF4.height());
        float fLIZIZ = C1677720tlC.LIZIZ(rectF3.left, rectF3.right, fCenterX);
        float fLIZIZ2 = C1677720tlC.LIZIZ(rectF3.top, rectF3.bottom, fCenterY);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('M');
        sbLIZ.append(fLIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(fLIZIZ2);
        sbLIZ.append(C0F4I.LIZJ);
        Path pathLIZLLL = C21518819Ji.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        Matrix matrix = new Matrix();
        matrix.setScale(rectF3.width() / rectF4.width(), rectF3.height() / rectF4.height(), fLIZIZ, fLIZIZ2);
        pathLIZLLL.transform(matrix);
        return pathLIZLLL;
    }
}
