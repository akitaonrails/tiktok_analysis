package X;

import android.content.Context;
import android.graphics.Color;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417170GXj {
    public static final int LIZ(Context context) {
        int iLIZ = C960203pA.LIZ(R.attr.uj, context);
        if (C960203pA.LIZIZ(context)) {
            return Color.argb(Color.alpha(iLIZ), 255 - Color.red(iLIZ), 255 - Color.green(iLIZ), 255 - Color.blue(iLIZ));
        }
        return iLIZ;
    }
}
