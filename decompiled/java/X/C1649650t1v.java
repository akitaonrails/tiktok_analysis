package X;

import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;

/* JADX INFO: renamed from: X.0t1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649650t1v extends AbstractC579710MoT {
    public static final C1085650eMF<C1649650t1v> LJ = new C1085650eMF<>(1);
    public List<TimeSpeedModelExtension> LIZ;
    public long LIZIZ;
    public TimeSpeedModelExtension LIZJ;
    public boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordingProgressUpdateEvent{timeSpeedModels=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", elapsedTimeInMicros=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1649650t1v LIZ(long j, List list, boolean z) {
        C1649650t1v c1649650t1vLIZIZ = LJ.LIZIZ();
        if (c1649650t1vLIZIZ == null) {
            c1649650t1vLIZIZ = new C1649650t1v();
        }
        c1649650t1vLIZIZ.LIZJ = null;
        c1649650t1vLIZIZ.LIZ = list;
        c1649650t1vLIZIZ.LIZIZ = j;
        c1649650t1vLIZIZ.LIZLLL = z;
        return c1649650t1vLIZIZ;
    }

    public static C1649650t1v LIZIZ(C1441190nbh c1441190nbh, long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        C1649650t1v c1649650t1vLIZ = LIZ(j, c1441190nbh, false);
        c1649650t1vLIZ.LIZJ = timeSpeedModelExtension;
        return c1649650t1vLIZ;
    }
}
