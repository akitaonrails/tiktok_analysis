package X;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: X.0V0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790800V0k {
    public static String LIZ;
    public static Resources LIZIZ;

    public static int LIZ(Context context, String str, String str2) {
        if (LIZIZ == null) {
            LIZIZ = context.getResources();
        }
        Resources resources = LIZIZ;
        if (LIZ == null) {
            LIZ = context.getPackageName();
        }
        return C786410Ut5.n3(resources, str, str2, LIZ);
    }
}
