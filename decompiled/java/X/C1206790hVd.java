package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0hVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206790hVd {
    public static long LIZ(String str) {
        long time;
        if (str == null) {
            return 0L;
        }
        C1198900hIu c1198900hIu = C1198900hIu.LIZ;
        c1198900hIu.getClass();
        c1198900hIu.LIZJ("read_meta_data_date_v2", new AwS69S1000000_18(str, 5));
        if (new Regex("\\d+").matches(str)) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null) {
                long jLongValue = lLJIILIIL.longValue();
                int length = str.length();
                if (length != 10) {
                    if (length != 13) {
                        C1205490hTX.LIZ.LJ(C1EMR.METADATA_ERROR, new Exception(str));
                    } else {
                        return jLongValue / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                } else {
                    return jLongValue;
                }
            }
            return 0L;
        }
        Iterator it2 = C1697810uHb.LJIIJJI(LIZIZ("yyyy:MM:dd HH:mm:ss", Locale.getDefault(), null), LIZIZ("yyyyMMdd'T'HHmmss.SSS'Z'", Locale.getDefault(), "UTC"), LIZIZ("yyyyMMdd'T'HHmmss'Z'", Locale.getDefault(), "UTC"), LIZIZ("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault(), "UTC"), LIZIZ("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault(), "UTC"), LIZIZ("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault(), null), LIZIZ("yyyyMMdd'T'HHmmssXXX", Locale.getDefault(), null), LIZIZ("EEE, dd MMM yyyy HH:mm:ss z", Locale.getDefault(), "GMT"), LIZIZ("dd/MM/yyyy HH:mm:ss", Locale.getDefault(), null), LIZIZ("dd-MM-yyyy HH:mm:ss", Locale.getDefault(), null), LIZIZ("MM/dd/yyyy HH:mm:ss", Locale.getDefault(), null), LIZIZ("MM-dd-yyyy HH:mm:ss", Locale.getDefault(), null)).iterator();
        while (it2.hasNext()) {
            try {
                Date date = ((DateFormat) it2.next()).parse(str);
                if (date != null) {
                    time = date.getTime();
                } else {
                    time = 0;
                }
                return time / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1205490hTX.LIZ.LJ(C1EMR.METADATA_ERROR, new Exception(str));
        return 0L;
    }

    public static SimpleDateFormat LIZIZ(String str, Locale locale, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        if (str2 != null) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str2));
        }
        return simpleDateFormat;
    }
}
