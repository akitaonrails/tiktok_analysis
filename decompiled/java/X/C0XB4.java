package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: renamed from: X.0XB4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XB4 {
    public static final C0XB5 LIZ = new C0XB6<String>() { // from class: X.0XB5
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZ(Context context) {
        String strLIZIZ;
        C844770XBz c844770XBz = C0XCJ.LIZIZ.LIZ;
        T t = 0;
        if (c844770XBz != null) {
            strLIZIZ = C0XB1.LIZIZ(c844770XBz);
        } else {
            strLIZIZ = null;
        }
        if (strLIZIZ == null) {
            C0XB5 c0xb5 = LIZ;
            Object[] objArr = {context};
            if (c0xb5.LIZ == 0) {
                synchronized (c0xb5) {
                    try {
                        if (c0xb5.LIZ == 0) {
                            if (objArr[0] != null) {
                                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ((Context) objArr[0], 0, C0XB3.LIZLLL());
                                String string = sharedPreferencesLIZJ.getString("cdid", "");
                                boolean zIsEmpty = TextUtils.isEmpty(string);
                                t = string;
                                if (zIsEmpty) {
                                    String string2 = UUID.randomUUID().toString();
                                    sharedPreferencesLIZJ.edit().putString("cdid", string2).apply();
                                    t = string2;
                                }
                            }
                            c0xb5.LIZ = t;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return (String) c0xb5.LIZ;
        }
        return strLIZIZ;
    }
}
