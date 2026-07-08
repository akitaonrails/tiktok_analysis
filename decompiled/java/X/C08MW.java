package X;

import android.content.Context;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08MW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MW {
    public static String LIZ;

    public static String LIZ(Context context) {
        if (LIZ == null) {
            String strReplace = C08MV.LIZ().replace(context.getPackageName(), "p").replace(":", "_");
            LIZ = strReplace;
            LIZ = strReplace.replace(e3.d, "_");
        }
        return LIZ;
    }
}
