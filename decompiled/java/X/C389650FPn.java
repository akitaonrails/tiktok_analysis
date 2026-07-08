package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;

/* JADX INFO: renamed from: X.0FPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389650FPn {
    public static String LIZ(int i) {
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C786410Ut5.k4(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C786410Ut5.k4(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }
}
