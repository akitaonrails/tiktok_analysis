package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.00vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C237500vt implements C0IL4 {
    public static final C237500vt LIZ = new C237500vt();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static final Map<Long, Long> LIZLLL = new ConcurrentHashMap();

    public static void LJFF() {
        long j = LIZIZ;
        if (j <= 0) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL;
        Long l = (Long) concurrentHashMap.get(Long.valueOf(j));
        concurrentHashMap.put(Long.valueOf(LIZIZ), Long.valueOf((l != null ? l.longValue() : 0L) + Math.max(C158B.LIZJ() - LIZJ, 0L)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save - room: ");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(", watch duration: ");
        sbLIZ.append(LJ(LIZIZ));
        C20441214yg.LIZIZ("RoomWatchDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static long LJ(long j) {
        long jLongValue;
        if (j <= 0) {
            return 0L;
        }
        Long l = (Long) ((ConcurrentHashMap) LIZLLL).get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (LIZJ > 0 && j == LIZIZ) {
            return jLongValue + Math.max(C158B.LIZJ() - LIZJ, 0L);
        }
        return jLongValue;
    }

    @Override // X.C0IL4
    public final void LIZ(Room room) {
        LJFF();
        LIZJ = -1L;
        LIZIZ = -1L;
    }

    @Override // X.C0IL4
    public final void LIZIZ(Room room) {
        LJFF();
        LIZJ = -1L;
    }

    @Override // X.C0IL4
    public final void LIZJ(Room room) {
        if (room != null) {
            LIZIZ = room.getId();
            LIZJ = C158B.LIZJ();
        }
    }

    @Override // X.C0IL4
    public final void LIZLLL(Room room) {
        LIZJ = C158B.LIZJ();
    }
}
