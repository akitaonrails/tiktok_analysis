package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0VaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800340VaS {
    public final SharedPreferences LIZ;

    public final synchronized void LIZIZ() {
        this.LIZ.edit().clear().commit();
    }

    public C800340VaS(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "com.google.android.gms.appid");
        this.LIZ = sharedPreferencesLIZJ;
        C0VSJ c0vsj = new C0VSJ(C800330VaR.LIZJ(context), "com.google.android.gms.appid-no-backup");
        if (!c0vsj.exists()) {
            try {
                if (c0vsj.createNewFile()) {
                    synchronized (this) {
                        zIsEmpty = sharedPreferencesLIZJ.getAll().isEmpty();
                    }
                    if (!zIsEmpty) {
                        LIZIZ();
                    }
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("|T|");
        sbLIZ.append(str2);
        sbLIZ.append("|");
        sbLIZ.append("*");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
