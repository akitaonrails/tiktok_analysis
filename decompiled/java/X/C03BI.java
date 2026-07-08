package X;

import android.content.Context;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: X.03BI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BI {
    public static final String LIZ(long j, Context context) {
        if (j < 0) {
            return "";
        }
        if (j == 0) {
            return "00:00:00";
        }
        if (j >= 86400000) {
            int i = (int) ((j / ((long) 86400000)) * 1.0f);
            return context.getResources().getQuantityString(2131755289, i, Integer.valueOf(i));
        }
        float f = j - ((3600000 * r3) * 1.0f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((j / ((long) 3600000)) * 1.0f))}, 1)));
        sbLIZ.append(':');
        sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f / C538540LAe.LLJJJIL))}, 1)));
        sbLIZ.append(':');
        sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((f - ((C538540LAe.LLJJJIL * r7) * 1.0f)) / LSPassThroughRecordSizeConfig.DEFAULT))}, 1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
