package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0kte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337000kte {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ(String str) {
        if (str.length() <= 7) {
            return ColorProtector.parseColor(str);
        }
        int color = ColorProtector.parseColor(str);
        return (color << 24) | (color >>> 8);
    }

    public static int LIZ(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int LIZIZ(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().widthPixels) / 750);
    }
}
