package X;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0H3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434800H3e {
    public static boolean LIZIZ(String str) {
        if (str.length() != 7 && str.length() != 9) {
            return false;
        }
        return Pattern.matches("#[0-9a-fA-F]+", str);
    }

    public static Drawable LIZ(String str, String str2) {
        int iLJIIJ;
        try {
            int color = Color.parseColor(str);
            if (str2 != null && LIZIZ(str2)) {
                iLJIIJ = Color.parseColor(str2);
            } else {
                iLJIIJ = C2441009hQ.LJIIJ(C2441009hQ.LJIIL(color, 153), -13816531);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{color, iLJIIJ});
            gradientDrawable.setShape(0);
            float f = 8;
            gradientDrawable.setCornerRadii(new float[]{C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            return gradientDrawable;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GiftBackgroundUtils generateGradientBackground ");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
