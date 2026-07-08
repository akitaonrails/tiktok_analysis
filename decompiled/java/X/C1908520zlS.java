package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0zlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908520zlS {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZJ(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.setIntrinsicWidth(0);
        return shapeDrawable;
    }

    public static Drawable LIZIZ(float f, int i) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static Drawable LIZ(float f, float f2, float f3, float f4, int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }
}
