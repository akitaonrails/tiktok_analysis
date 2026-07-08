package X;

import Y.ARunnableS46S0300000_13;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.trace.SystemPerfTraceDelegate$onH5Trace$1$1;
import java.util.Map;

/* JADX INFO: renamed from: X.0WYN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYN {
    public static HandlerThread LIZ;
    public static SystemPerfTraceDelegate$onH5Trace$1$1 LIZIZ;
    public static C798360VTm LIZJ;

    public static void LIZ(Context context, SchemaParserData schemaParserData, C0WYO c0wyo, Map map) {
        int id;
        Thread thread = Looper.getMainLooper().getThread();
        if (thread != null) {
            id = (int) thread.getId();
        } else {
            id = 0;
        }
        C798360VTm c798360VTm = new C798360VTm(true, new int[]{id, (int) C786410Ut5.u3().getId()}, 20);
        LIZJ = c798360VTm;
        c798360VTm.LIZ();
        SystemPerfTraceDelegate$onH5Trace$1$1 systemPerfTraceDelegate$onH5Trace$1$1 = LIZIZ;
        if (systemPerfTraceDelegate$onH5Trace$1$1 != null) {
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, systemPerfTraceDelegate$onH5Trace$1$1, new ARunnableS46S0300000_13(context, schemaParserData, c0wyo, map, 13));
        }
    }
}
