package X;

import com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import webcast.api.creator.PreScheduleStream;
import webcast.api.creator.StreamResolution;

/* JADX INFO: renamed from: X.0Toa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758140Toa {
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static final Integer LIZ = 0;
    public static int LJ = -1;
    public static int LJFF = -1;

    public static boolean LIZIZ() {
        return LIZLLL && LIZIZ > 0 && LIZJ > 0;
    }

    public static String LIZ(DataChannel dataChannel, Integer num) {
        StreamResolution next;
        PreScheduleStream preScheduleStream;
        List<StreamResolution> listLJIIIIZZ = C1D4I.LJIIIIZZ();
        if (listLJIIIIZZ == null) {
            if (dataChannel != null && (preScheduleStream = (PreScheduleStream) dataChannel.gg0(PreScheduleStreamChannel.class)) != null) {
                listLJIIIIZZ = preScheduleStream.streamResolutionList;
            } else {
                listLJIIIIZZ = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProbeCache getLevelDesc -> ");
        sbLIZ.append(listLJIIIIZZ);
        sbLIZ.append(", ");
        sbLIZ.append(num);
        C20441214yg.LJIIIZ("VideoPreScheduleUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (listLJIIIIZZ == null) {
            return null;
        }
        Iterator<StreamResolution> it2 = listLJIIIIZZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int i = next.streamResolution;
                if (num != null && i == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        StreamResolution streamResolution = next;
        if (streamResolution == null) {
            return null;
        }
        return streamResolution.resolutionText;
    }
}
