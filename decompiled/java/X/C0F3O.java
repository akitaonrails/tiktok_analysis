package X;

import android.content.res.Resources;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;

/* JADX INFO: renamed from: X.0F3O, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F3O {
    public static String LIZ(int i) {
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    public static String LIZIZ(Resources resources, int i) {
        if (resources == null) {
            return null;
        }
        int iMax = Math.max(i, 0);
        int i2 = iMax / 60;
        int i3 = iMax % 60;
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            sb.append(resources.getQuantityString(2131755052, i2, Integer.valueOf(i2)));
            sb.append(" ");
        }
        sb.append(resources.getQuantityString(2131755053, i3, Integer.valueOf(i3)));
        return sb.toString();
    }
}
