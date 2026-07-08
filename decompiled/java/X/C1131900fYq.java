package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0fYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131900fYq {
    public static final int LIZ(Context context, int i) {
        if (context == null) {
            return i;
        }
        return C810670Vr7.LIZJ(context, 0, "gift_dialog_storage").getInt("sp_gift_page_type", i);
    }

    public static final long LIZIZ(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        return C810670Vr7.LIZJ(context, 0, "gift_dialog_storage").getLong(str, 0L);
    }

    public static final void LIZJ(Context context, int i) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "gift_dialog_storage").edit();
        editorEdit.putInt("sp_gift_page_type", i);
        editorEdit.commit();
    }

    public static final void LIZLLL(Context context, String str, long j) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "gift_dialog_storage").edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }
}
