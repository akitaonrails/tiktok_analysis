package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.10M3, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10M3 {
    public static final GradientDrawable LIZJ;
    public final C11NJ LIZ;
    public final ConcurrentHashMap<String, int[]> LIZIZ = new ConcurrentHashMap<>();

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.rgb(33, 33, 33), -16777216});
        gradientDrawable.setCornerRadius(0.0f);
        LIZJ = gradientDrawable;
    }

    public C10M3(C11NJ c11nj) {
        this.LIZ = c11nj;
    }

    public static Integer LIZ(C204674156y c204674156y, boolean z) {
        float f;
        c204674156y.LJFF(90.0f);
        if (z) {
            f = 0.0f;
        } else {
            f = 0.4f;
        }
        c204674156y.LJ(0.0f, 0.1f, f, 0.6f, 0.0f);
        c204674156y.LJI(0.0f);
        return c204674156y.LIZIZ();
    }
}
