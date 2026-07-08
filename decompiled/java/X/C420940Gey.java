package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Gey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420940Gey {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZ(float f, int i) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }
}
