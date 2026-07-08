package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WIB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WIB extends C0WI9 {
    public final Context LIZIZ;
    public final SharedPreferences LIZJ;
    public final C844770XBz LIZLLL;

    @Override // X.C0WI9, X.C0XBX
    public final String LIZ(String str) {
        return LJ(str).getString(str, null);
    }

    @Override // X.C0WI9
    public final void LIZLLL(List<String> list) {
        if (list == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                SharedPreferences sharedPreferencesLJ = LJ(str);
                SharedPreferences.Editor editorEdit = (SharedPreferences.Editor) map.get(sharedPreferencesLJ);
                if (editorEdit == null) {
                    editorEdit = LJ(str).edit();
                    map.put(sharedPreferencesLJ, editorEdit);
                }
                if (sharedPreferencesLJ != null && sharedPreferencesLJ.contains(str)) {
                    editorEdit.remove(str);
                }
            }
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) ((Map.Entry) it2.next()).getValue()).apply();
        }
        super.LIZLLL(list);
    }

    public final SharedPreferences LJ(String str) {
        if (!"device_id".equals(str) && !"install_id".equals(str) && !"bd_did".equals(str)) {
            return C844580XBg.LIZ(this.LIZIZ, this.LIZLLL);
        }
        return this.LIZJ;
    }

    @Override // X.C0WI9, X.C0XBX
    public final void LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor editorEdit = LJ(str).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        }
    }

    public C0WIB(Context context, SharedPreferences sharedPreferences, C844770XBz c844770XBz) {
        if (context != null) {
            this.LIZIZ = context;
            this.LIZJ = sharedPreferences;
            this.LIZLLL = c844770XBz;
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }
}
