package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.12JJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12JJ {
    public static final float LIZ(Context context) {
        int screenWidth = ScreenUtils.getScreenWidth(context);
        float fLIZIZ = C11VU.LIZIZ(12.0f, context);
        float fLIZIZ2 = C11VU.LIZIZ(20.0f, context);
        float fLIZIZ3 = C11VU.LIZIZ(52.0f, context);
        float fLIZIZ4 = C11VU.LIZIZ(80.0f, context);
        float f = (float) (((double) ((screenWidth - fLIZIZ2) - (fLIZIZ * 5))) / 5.3d);
        if (f >= fLIZIZ3) {
            if (f > fLIZIZ4) {
                return fLIZIZ4;
            }
            return f;
        }
        return fLIZIZ3;
    }
}
