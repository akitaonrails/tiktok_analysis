package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0wuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798710wuL {
    public final SharedPreferences LIZ;

    public final void LIZ() {
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        if (editorEdit != null) {
            Iterator<String> it2 = this.LIZ.getAll().keySet().iterator();
            while (it2.hasNext()) {
                editorEdit.remove(it2.next());
            }
            editorEdit.apply();
        }
    }

    public C1798710wuL(Context context, String str) {
        this.LIZ = C810670Vr7.LIZJ(C786410Ut5.N3(context), 0, str);
    }

    public final void LIZIZ(String str, String str2) {
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        if (editorEdit != null && (editorPutString = editorEdit.putString(str, str2)) != null) {
            editorPutString.apply();
        }
    }
}
