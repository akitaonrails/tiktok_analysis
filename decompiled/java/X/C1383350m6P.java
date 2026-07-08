package X;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: X.0m6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383350m6P {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Exception exc) {
        C2241008qG c2241008qG = new C2241008qG();
        if (!TextUtils.isEmpty("error")) {
            c2241008qG.LIZLLL("msg_type", "error");
        }
        c2241008qG.LIZLLL("error_desc", Log.getStackTraceString(exc));
        if (!TextUtils.isEmpty(null)) {
            c2241008qG.LIZLLL("tag", null);
        }
        if (!TextUtils.isEmpty(null)) {
            c2241008qG.LIZLLL("channel_name", null);
        }
        if (!TextUtils.isEmpty(null)) {
            c2241008qG.LIZLLL("module_name", null);
        }
        c2241008qG.LIZ.isEmpty();
    }
}
