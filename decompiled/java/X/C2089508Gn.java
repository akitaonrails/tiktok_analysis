package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.08Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089508Gn {
    public static long LIZ(String str) {
        Logger.debug();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        long time = 0;
        try {
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                time = date.getTime();
                return time;
            }
        } catch (ParseException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return time;
    }

    public static boolean LIZJ(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || !str.contains("~")) {
            return false;
        }
        String[] strArrSplit = str.split("~");
        if (strArrSplit.length == 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
            long jLIZ = LIZ(strArrSplit[0]);
            long jLIZ2 = LIZ(strArrSplit[1]);
            if (jLIZ > 0 && jLIZ2 > 0 && jLIZ < jLIZ2) {
                list.add(Long.valueOf(jLIZ));
                list.add(Long.valueOf(jLIZ2));
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String str, String str2, List list) {
        String[] strArrSplit;
        String[] strArrSplit2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty("=") || (strArrSplit = str.split(str2)) == null) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!TextUtils.isEmpty(strArrSplit[i]) && (strArrSplit2 = strArrSplit[i].trim().split("=")) != null && strArrSplit2.length == 2 && !TextUtils.isEmpty(strArrSplit2[0]) && !TextUtils.isEmpty(strArrSplit2[1])) {
                ((ArrayList) list).add(new Pair(strArrSplit2[0].trim(), strArrSplit2[1].trim()));
            }
        }
        if (((ArrayList) list).size() == 0) {
            return false;
        }
        return true;
    }
}
