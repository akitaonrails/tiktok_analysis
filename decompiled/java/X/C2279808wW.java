package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.08wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2279808wW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                i2++;
            } else if (cCharAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        if (i2 > 300) {
            return false;
        }
        return true;
    }

    public static String LIZJ(CreativeInfo creativeInfo, String str) {
        String strLJJIIJZLJL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIJZLJL(creativeInfo, "");
        if (!new C0VSJ(strLJJIIJZLJL).exists()) {
            new C0VSJ(strLJJIIJZLJL).mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(strLJJIIJZLJL));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".mp3");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(simpleDateFormat.format(time));
        sbLIZ3.append(strLIZIZ);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0VSJ LIZ(CreativeInfo creativeInfo, String str, String str2) {
        try {
            C0VSJ c0vsj = new C0VSJ(LIZJ(creativeInfo, str2));
            new C0VSV(c0vsj).write(Base64.decode(str, 0));
            return c0vsj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Base64 to File failed, Exception: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
