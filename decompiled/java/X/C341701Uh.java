package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;

/* JADX INFO: renamed from: X.01Uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C341701Uh {
    public static String LIZIZ(int i) {
        if (i < 0) {
            return "";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        if (i <= 999999) {
            if (i % LSPassThroughRecordSizeConfig.DEFAULT >= 100) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LIZ("%.1f", Float.valueOf(((i / 100) * 100) / 1000.0f)));
                sbLIZ.append('K');
                return LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(String.valueOf(i / LSPassThroughRecordSizeConfig.DEFAULT));
            sbLIZ2.append('K');
            return LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (i % 1000000 >= 100000) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(LIZ("%.1f", Float.valueOf(((i / 100000) * 100000) / 1000000.0f)));
            sbLIZ3.append('M');
            return LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(String.valueOf(i / 1000000));
        sbLIZ4.append('M');
        return LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static String LIZJ(String str) {
        if (C497740JfY.LJJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\u200f");
            sbLIZ.append(str);
            sbLIZ.append("\u200f");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static String LIZ(String str, Object... objArr) {
        return C786410Ut5.k4(Locale.US, str, objArr);
    }
}
