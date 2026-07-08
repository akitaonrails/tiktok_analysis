package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XB1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XB1 {
    public static final Map<String, String> LIZ = new ConcurrentHashMap(4);

    public static String LIZIZ(C844770XBz c844770XBz) {
        String str;
        String strLIZJ = null;
        if (c844770XBz == null) {
            return null;
        }
        String strLIZ = c844770XBz.LIZ();
        Map<String, String> map = LIZ;
        String str2 = (String) ((ConcurrentHashMap) map).get(strLIZ);
        if (str2 == null) {
            synchronized (C0XB1.class) {
                try {
                    if (C2123908Tt.LIZLLL(c844770XBz.LIZJ)) {
                        strLIZJ = LIZJ(c844770XBz);
                        ((ConcurrentHashMap) map).put(strLIZ, strLIZJ);
                        C824230WUz.LIZ(c844770XBz.LIZJ).LIZJ(c844770XBz.LIZ(), "cdid", strLIZJ);
                    } else {
                        Context context = c844770XBz.LIZJ;
                        if (context != null) {
                            C824230WUz.LIZ(context).LIZIZ(c844770XBz.LIZ(), "cdid", new C0WV2() { // from class: X.0XB2
                                @Override // X.C0WV2
                                public final void LIZJ(String str3, String str4) {
                                    ((ConcurrentHashMap) C0XB1.LIZ).put(str4, str3);
                                }
                            });
                            strLIZJ = (String) ((ConcurrentHashMap) map).get(c844770XBz.LIZ());
                        }
                    }
                    str = strLIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return str;
        }
        return str2;
    }

    public static String LIZJ(C844770XBz c844770XBz) {
        String strLIZIZ;
        if (c844770XBz == null) {
            return null;
        }
        SharedPreferences sharedPreferencesLIZ = C844580XBg.LIZ(c844770XBz.LIZJ, c844770XBz);
        String string = sharedPreferencesLIZ.getString("cdid", null);
        if (TextUtils.isEmpty(string)) {
            if (c844770XBz.LJJIIZ) {
                strLIZIZ = C0XB3.LIZLLL();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0XB3.LIZLLL());
                sbLIZ.append("_");
                sbLIZ.append(c844770XBz.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(c844770XBz.LIZJ, 0, strLIZIZ);
            string = sharedPreferencesLIZJ.getString("cdid", null);
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
            }
            sharedPreferencesLIZJ.edit().putString("cdid", string).apply();
            sharedPreferencesLIZ.edit().putString("cdid", string).putBoolean("cdid_migrate", true).apply();
        }
        return string;
    }

    public static String LIZLLL(Context context) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C0XB3.LIZLLL());
        String string = sharedPreferencesLIZJ.getString("cdid", null);
        if (TextUtils.isEmpty(string)) {
            String string2 = UUID.randomUUID().toString();
            sharedPreferencesLIZJ.edit().putString("cdid", string2).apply();
            return string2;
        }
        return string;
    }

    public static void LIZ(Context context, C844770XBz c844770XBz) {
        String strLIZIZ;
        if (context != null && c844770XBz != null) {
            ((ConcurrentHashMap) LIZ).remove(c844770XBz.LIZ());
            C844580XBg.LIZ(context, c844770XBz).edit().remove("cdid").apply();
            if (c844770XBz.LJJIIZ) {
                strLIZIZ = C0XB3.LIZLLL();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0XB3.LIZLLL());
                sbLIZ.append("_");
                sbLIZ.append(c844770XBz.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, strLIZIZ);
            if (sharedPreferencesLIZJ.contains("cdid")) {
                sharedPreferencesLIZJ.edit().remove("cdid").apply();
            }
        }
    }
}
