package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.0F39, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F39 {
    public static final int LIZ = C372570Ej9.LIZ(180);
    public static final int LIZIZ = C372570Ej9.LIZ(30);
    public static final int LIZJ;

    static {
        C372570Ej9.LIZ(48);
        C372570Ej9.LIZ(30);
        C372570Ej9.LIZ(52);
        C372570Ej9.LIZ(44);
        LIZJ = LIZ();
    }

    public static final int LIZ() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }
}
