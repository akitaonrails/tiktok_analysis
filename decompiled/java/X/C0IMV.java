package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0IMV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IMV {
    public static String LIZ(long j) {
        boolean z;
        if (10000 <= j && j < 1000000) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            double d = j / ((double) LSPassThroughRecordSizeConfig.DEFAULT);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
            sbLIZ.append('K');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1000000))}, 1)));
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (j >= 1000) {
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
            stringBuffer.insert(1, ',');
            return stringBuffer.toString();
        }
        return String.valueOf(j);
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_finish_exit");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(0, "is_half_screen");
        c474500IjALIZ.LJJII(str, "exit_type");
        c474500IjALIZ.LIZ();
    }
}
