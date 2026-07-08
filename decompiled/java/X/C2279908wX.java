package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.08wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2279908wX {
    public static String LIZ() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append("_cover.png");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
