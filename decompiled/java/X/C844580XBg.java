package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0XBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C844580XBg {
    public static final C844590XBh LIZ = new AbstractC824140WUq<SharedPreferences>() { // from class: X.0XBh
        @Override // X.AbstractC824140WUq
        public final SharedPreferences LIZ(Object[] objArr) {
            return C810670Vr7.LIZJ((Context) objArr[0], 0, "ug_install_settings_pref");
        }
    };

    public static SharedPreferences LIZIZ(Context context) {
        return LIZ.LIZIZ(context);
    }

    public static SharedPreferences LIZ(Context context, C844770XBz c844770XBz) {
        if (c844770XBz != null) {
            if (c844770XBz.LJJIIZ) {
                return LIZIZ(context);
            }
            String strValueOf = String.valueOf(c844770XBz.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ug_install_settings_pref_");
            sbLIZ.append(strValueOf);
            return C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
        }
        return LIZIZ(context);
    }

    public static String LIZJ(AbstractC844610XBj abstractC844610XBj, String str) {
        if (abstractC844610XBj.LLILLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_i18n");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (abstractC844610XBj.LLILZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_boe");
            str = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (abstractC844610XBj.LL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("_cm");
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return str;
    }
}
