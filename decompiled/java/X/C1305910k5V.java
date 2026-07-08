package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0k5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305910k5V {
    public static final Gson LIZ = new Gson();
    public static final C1305920k5W LIZIZ = new C1305920k5W();
    public static final Map<String, InterfaceC1479880oc6> LIZJ = new ConcurrentHashMap();
    public static final Map<String, InterfaceC1479880oc6> LIZLLL = new ConcurrentHashMap();

    public static <T> T LIZ(String str, Type type) {
        boolean zEquals;
        boolean zContains;
        String string;
        IAppConfig iAppConfigLIZIZ = C1475000oUE.LIZIZ();
        if (iAppConfigLIZIZ == null) {
            zEquals = false;
        } else {
            zEquals = TextUtils.equals("local_test", iAppConfigLIZIZ.getChannel());
        }
        if (zEquals) {
            try {
                C1305920k5W c1305920k5W = LIZIZ;
                SharedPreferences sharedPreferencesLIZJ = c1305920k5W.LIZ;
                if (sharedPreferencesLIZJ == null) {
                    Application application = C1475000oUE.LIZ;
                    if (application != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(application, 0, "PlayerSettingDebugCache-1")) != null) {
                        c1305920k5W.LIZ = sharedPreferencesLIZJ;
                    } else {
                        sharedPreferencesLIZJ = null;
                    }
                }
                if (sharedPreferencesLIZJ != null) {
                    zContains = sharedPreferencesLIZJ.contains(str);
                } else {
                    zContains = false;
                }
                if (zContains) {
                    Gson gson = LIZ;
                    SharedPreferences sharedPreferencesLIZJ2 = c1305920k5W.LIZ;
                    if (sharedPreferencesLIZJ2 == null) {
                        Application application2 = C1475000oUE.LIZ;
                        if (application2 != null && (sharedPreferencesLIZJ2 = C810670Vr7.LIZJ(application2, 0, "PlayerSettingDebugCache-1")) != null) {
                            c1305920k5W.LIZ = sharedPreferencesLIZJ2;
                        } else {
                            sharedPreferencesLIZJ2 = null;
                        }
                    }
                    if (sharedPreferencesLIZJ2 == null || (string = sharedPreferencesLIZJ2.getString(str, null)) == null) {
                        string = null;
                    }
                    return (T) GsonProtectorUtils.fromJson(gson, string, type);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
