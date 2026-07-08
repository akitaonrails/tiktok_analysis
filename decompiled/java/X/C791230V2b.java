package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0V2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791230V2b {
    public static SharedPreferences LIZ;

    public static synchronized void LIZ(Context context) {
        if (LIZ != null) {
            return;
        }
        LIZ = C810670Vr7.LIZJ(context, 0, "evil_method_SPUtils");
    }
}
