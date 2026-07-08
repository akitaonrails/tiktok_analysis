package X;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06YX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06YX extends C09AY implements Function1<C197039127h, Unit> {
    public C06YX() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        int iIntValue;
        C197039127h c197039127h2 = c197039127h;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(c197039127h2.getContext(), true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eyv, c1361400lX0LIZ);
        int iIntValue2 = 0;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c197039127h2.setTextColor(iIntValue);
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = (int) C497740JfY.LIZIZ(20.0f);
            i++;
        } while (i < 8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ey7, c1361400lX0LIZ);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        paint.setColor(iIntValue2);
        c197039127h2.setBackground(shapeDrawable);
        return Unit.LIZ;
    }
}
