package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WV3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WV3 {
    public static volatile Pair<String, Boolean> LIZ;
    public static C0WV4 LIZIZ;

    public static Pair<String, Boolean> LIZ(Context context, C844770XBz c844770XBz) {
        boolean z;
        boolean z2;
        Pair<String, Boolean> pair;
        Pair<String, Boolean> pair2 = LIZ;
        if (pair2 != null && !TextUtils.isEmpty((CharSequence) pair2.first)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (C0WV3.class) {
                try {
                    Pair<String, Boolean> pair3 = LIZ;
                    if (pair3 == null || TextUtils.isEmpty((CharSequence) pair3.first)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return LIZ;
                    }
                    C0WV4 c0wv4 = new C0WV4();
                    LIZIZ = c0wv4;
                    c0wv4.LIZ = System.currentTimeMillis();
                    try {
                        pair = C824130WUp.LIZ.LIZIZ(c844770XBz);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!(th instanceof ClassNotFoundException) && !(th instanceof NoClassDefFoundError)) {
                            pair = new Pair<>(null, Boolean.FALSE);
                        } else {
                            throw new RuntimeException(th);
                        }
                    }
                    C0WV4 c0wv42 = LIZIZ;
                    c0wv42.getClass();
                    c0wv42.LIZIZ = System.currentTimeMillis();
                    C0WV4 c0wv43 = LIZIZ;
                    c0wv43.getClass();
                    LIZIZ.LJI = ((Boolean) pair.second).booleanValue();
                    String string = (String) pair.first;
                    boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
                    if (TextUtils.isEmpty(string)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Gaid#getGaid failed . rst = ");
                        sbLIZ.append(pair);
                        C844830XCf.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C0WV4 c0wv44 = LIZIZ;
                        c0wv44.getClass();
                        c0wv44.LIZJ = System.currentTimeMillis();
                        SharedPreferences sharedPreferencesLIZ = C844580XBg.LIZ(context, c844770XBz);
                        string = sharedPreferencesLIZ.getString("google_aid", null);
                        zBooleanValue = sharedPreferencesLIZ.getBoolean("gaid_limited", false);
                        C0WV4 c0wv45 = LIZIZ;
                        c0wv45.getClass();
                        c0wv45.LIZLLL = System.currentTimeMillis();
                    } else {
                        C0WV4 c0wv46 = LIZIZ;
                        c0wv46.getClass();
                        c0wv46.LJ = System.currentTimeMillis();
                        SharedPreferences sharedPreferencesLIZ2 = C844580XBg.LIZ(context, c844770XBz);
                        String string2 = sharedPreferencesLIZ2.getString("google_aid", null);
                        boolean z3 = sharedPreferencesLIZ2.getBoolean("gaid_limited", false);
                        if ((!TextUtils.equals(string2, string) || z3 != zBooleanValue) && !TextUtils.isEmpty(string) && context != null) {
                            C844580XBg.LIZ(context, c844770XBz).edit().putString("google_aid", string).putBoolean("gaid_limited", zBooleanValue).apply();
                        }
                        C0WV4 c0wv47 = LIZIZ;
                        c0wv47.getClass();
                        c0wv47.LJFF = System.currentTimeMillis();
                    }
                    LIZ = new Pair<>(string, Boolean.valueOf(zBooleanValue));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LIZ;
    }
}
