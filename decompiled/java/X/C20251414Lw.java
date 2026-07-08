package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.14Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20251414Lw {
    public Map<String, InterfaceC1910030znt> LIZIZ = new HashMap();
    public Locale LIZJ = null;
    public final List<Locale> LIZLLL = new ArrayList();
    public final Map<String, InterfaceC1910030znt> LIZ = new LinkedHashMap();

    public final InterfaceC1910030znt LIZ(Context context) {
        Map<String, InterfaceC1910030znt> map = this.LIZ;
        Locale locale = Locale.getDefault();
        String strLIZ = C20251014Ls.LIZ(context, "key_current_locale", "");
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = C20251314Lv.LIZLLL(null, locale, true);
            C20251014Ls.LIZIZ(context, "key_current_locale", strLIZ);
        }
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = "en";
        }
        InterfaceC1910030znt interfaceC1910030znt = (InterfaceC1910030znt) ((LinkedHashMap) map).get(strLIZ);
        if (interfaceC1910030znt != null) {
            return interfaceC1910030znt;
        }
        return (InterfaceC1910030znt) ((LinkedHashMap) this.LIZ).get("en");
    }

    public final InterfaceC1910030znt LIZIZ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return this.LIZIZ.get(str);
        }
        Map<String, InterfaceC1910030znt> map = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-");
        sbLIZ.append(str2);
        InterfaceC1910030znt interfaceC1910030znt = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1910030znt == null) {
            return this.LIZIZ.get(str);
        }
        return interfaceC1910030znt;
    }
}
