package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797940wt6 {
    public final C1086040eMs LIZ;
    public final Function0<Long> LIZIZ;
    public final SharedPreferences LIZJ;

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.length());
        sbLIZ.append(':');
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(str2.length());
        sbLIZ.append(':');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) > calendar2.get(1) || (calendar.get(1) >= calendar2.get(1) && calendar.get(6) > calendar2.get(6))) {
            return true;
        }
        return false;
    }

    public final synchronized void LIZJ(String str, String str2) {
        String strLIZ = LIZ(str, str2);
        long jLongValue = this.LIZIZ.invoke().longValue();
        SharedPreferences sharedPreferences = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_refresh_time_");
        sbLIZ.append(strLIZ);
        boolean zLIZIZ = LIZIZ(jLongValue, sharedPreferences.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L));
        int i = 1;
        if (!zLIZIZ) {
            SharedPreferences sharedPreferences2 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refresh_count_");
            sbLIZ2.append(strLIZ);
            i = 1 + sharedPreferences2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        }
        SharedPreferences.Editor editorEdit = this.LIZJ.edit();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("last_refresh_time_");
        sbLIZ3.append(strLIZ);
        SharedPreferences.Editor editorPutLong = editorEdit.putLong(C2188811AlT.LIZIZ(sbLIZ3), jLongValue);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("refresh_count_");
        sbLIZ4.append(strLIZ);
        editorPutLong.putInt(C2188811AlT.LIZIZ(sbLIZ4), i).apply();
    }

    public C1797940wt6(Context context, C1086040eMs c1086040eMs, Function0<Long> function0) {
        this.LIZ = c1086040eMs;
        this.LIZIZ = function0;
        this.LIZJ = C810670Vr7.LIZJ(context, 0, "pns_privacy_data_push_frequency");
    }
}
