package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078580eAq {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(Room room, DataChannel dataChannel) {
        long j = 0;
        if (dataChannel != null && room != null) {
            C1078590eAr c1078590eAr = (C1078590eAr) dataChannel.gg0(C1082880eHm.class);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c1078590eAr != null && c1078590eAr.LJI && c1078590eAr.LIZ == room.getId()) {
                if (c1078590eAr.LJII < 0) {
                    j = c1078590eAr.LJIIIIZZ;
                } else {
                    long j2 = c1078590eAr.LJIIIIZZ;
                    if (j2 > jElapsedRealtime) {
                        j = j2 - jElapsedRealtime;
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("low device -> calculateDelayTimeForMidTouch is invoked and return ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("LowerEndDeviceDowngradeHelper", C2188811AlT.LIZIZ(sbLIZ));
            return j;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("low device -> calculateDelayTimeForMidTouch is invoked and return 0 and dataChannel is ");
        sbLIZ2.append(dataChannel);
        sbLIZ2.append(" room is ");
        sbLIZ2.append(room);
        C20441214yg.LJ("LowerEndDeviceDowngradeHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return 0L;
    }

    public static long LIZIZ(int i, Room room, DataChannel dataChannel) {
        int i2;
        long j = 0;
        if (dataChannel != null && room != null) {
            C1078590eAr c1078590eAr = (C1078590eAr) dataChannel.gg0(C1082880eHm.class);
            if (c1078590eAr != null && (i2 = c1078590eAr.LIZJ) != 0 && i2 == i) {
                return 0L;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c1078590eAr != null && c1078590eAr.LIZIZ && c1078590eAr.LIZ == room.getId()) {
                if (c1078590eAr.LIZLLL < 0) {
                    j = c1078590eAr.LJ;
                } else {
                    long j2 = c1078590eAr.LJ;
                    if (j2 > jElapsedRealtime) {
                        j = j2 - jElapsedRealtime;
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("low device -> calculateDelayTimeForShortTouch is invoked and return ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("LowerEndDeviceDowngradeHelper", C2188811AlT.LIZIZ(sbLIZ));
            return j;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("low device -> calculateDelayTimeForShortTouch is invoked and return 0 and dataChannel is ");
        sbLIZ2.append(dataChannel);
        sbLIZ2.append(" room is ");
        sbLIZ2.append(room);
        C20441214yg.LJ("LowerEndDeviceDowngradeHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return 0L;
    }

    public static boolean LIZJ(Room room, DataChannel dataChannel, String str) {
        boolean z;
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && dataChannel != null && room != null) {
            C1078590eAr c1078590eAr = (C1078590eAr) dataChannel.gg0(C1082880eHm.class);
            if (c1078590eAr == null || !c1078590eAr.LIZIZ || c1078590eAr.LIZ != room.getId() || !c1078590eAr.LJFF) {
                z2 = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("low device -> disableAnimationForShortTouch is invoked for ");
            sbLIZ.append(str);
            sbLIZ.append(" and return ");
            sbLIZ.append(z2);
            C20441214yg.LIZIZ("LowerEndDeviceDowngradeHelper", C2188811AlT.LIZIZ(sbLIZ));
            return z2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("low device -> disableAnimationForShortTouch is invoked for ");
        sbLIZ2.append(str);
        sbLIZ2.append(" and return false due to dataChannel is ");
        sbLIZ2.append(dataChannel);
        sbLIZ2.append(" room is ");
        sbLIZ2.append(room);
        C20441214yg.LJ("LowerEndDeviceDowngradeHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }
}
