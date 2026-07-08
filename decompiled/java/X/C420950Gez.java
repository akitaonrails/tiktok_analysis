package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420950Gez {
    public static Drawable LIZ(Context context) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        final int[] iArr = {C2441009hQ.LJIIL(iIntValue, 0), C2441009hQ.LJIIL(iIntValue, 179), C2441009hQ.LJIIL(iIntValue, 204), C2441009hQ.LJIIL(iIntValue, 224), C2441009hQ.LJIIL(iIntValue, 240), C2441009hQ.LJIIL(iIntValue, 250), C2441009hQ.LJIIL(iIntValue, 255)};
        final float[] fArr = {0.0f, 0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 1.0f};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GQX
            public final /* synthetic */ boolean LIZ = true;

            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public final Shader resize(int i, int i2) {
                if (this.LIZ) {
                    return new LinearGradient(0.0f, 0.0f, 0.0f, i2, iArr, fArr, Shader.TileMode.CLAMP);
                }
                return new LinearGradient(0.0f, 0.0f, i, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
            }
        });
        return shapeDrawable;
    }
}
