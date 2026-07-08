package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335840DEo {
    public static String LIZIZ(List list) {
        StringBuilder sb = new StringBuilder("");
        boolean z = true;
        for (String str : (ArrayList) list) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static final Drawable LIZ(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setGradientCenter(0.5f, 0.5f);
        gradientDrawable.setGradientRadius(0.5f);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }
}
