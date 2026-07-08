package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0UTE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UTE {
    public static boolean LIZ(Context context, String str, long j) {
        if (j != C810670Vr7.LIZJ(context, 0, "low_age_storage").getLong(str, 0L)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "low_age_storage").edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }
}
