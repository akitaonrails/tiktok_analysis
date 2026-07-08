package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0aOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933330aOZ {
    public final String LIZ;
    public final Room LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public long LJ;
    public long LJFF;

    public final void LIZIZ() {
        String strLIZ = C01EI.LIZ(57, "PlayRecordV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLog, ability=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRunning=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isWatchingMultiGuest=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LJFF);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (this.LIZJ && this.LIZLLL) {
            this.LJ = C963140bAe.LIZJ();
            String strLIZ2 = C01EI.LIZ(60, "PlayRecordV2");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateTime, ability=");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(", startTime=");
            sbLIZ2.append(this.LJ);
            C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        } else if ((!this.LIZJ || !this.LIZLLL) && this.LJ > 0) {
            this.LJFF = C963140bAe.LIZJ();
            String strLIZ3 = C01EI.LIZ(63, "PlayRecordV2");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateTime, ability=");
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append(", endTime=");
            sbLIZ3.append(this.LJFF);
            C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        }
        long j = this.LJ;
        if (j > 0) {
            long j2 = this.LJFF;
            if (j2 <= 0 || j2 < j) {
                return;
            }
            Room room = this.LIZIZ;
            if (room == null) {
                room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put("room_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
            concurrentHashMap.put("anchor_id", String.valueOf(room != null ? Long.valueOf(room.getOwnerUserId()) : null));
            concurrentHashMap.put("uid", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            concurrentHashMap.put("type", this.LIZ);
            concurrentHashMap.put("start_ts", String.valueOf(this.LJ));
            concurrentHashMap.put("end_ts", String.valueOf(this.LJFF));
            concurrentHashMap.put("duration", String.valueOf(this.LJFF - this.LJ));
            String strLIZ4 = C01EI.LIZ(81, "PlayRecordV2");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("report, ability=");
            sbLIZ4.append(this.LIZ);
            sbLIZ4.append(", start_ts=");
            sbLIZ4.append(this.LJ);
            sbLIZ4.append(", end_ts=");
            sbLIZ4.append(this.LJFF);
            sbLIZ4.append(", duration=");
            sbLIZ4.append(this.LJFF - this.LJ);
            C1AZW.LJIIJ(12, strLIZ4, C2188811AlT.LIZIZ(sbLIZ4), null, null);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_audience_watch_play_duration");
            c474500IjALIZ.LJJIIZI(concurrentHashMap);
            c474500IjALIZ.LJJIJL();
            String strLIZ5 = C01EI.LIZ(86, "PlayRecordV2");
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("resetTimeMs, ability=");
            sbLIZ5.append(this.LIZ);
            C1AZW.LJIIJ(12, strLIZ5, C2188811AlT.LIZIZ(sbLIZ5), null, null);
            this.LJ = 0L;
            this.LJFF = 0L;
        }
    }

    public final void LIZ(boolean z) {
        String strLIZ = C01EI.LIZ(47, "PlayRecordV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsWatchingMultiGuest, ability=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isWatchingMultiGuest=");
        sbLIZ.append(z);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZLLL = z;
        LIZIZ();
    }

    public C933330aOZ(Room room, String str) {
        this.LIZ = str;
        this.LIZIZ = room;
    }
}
