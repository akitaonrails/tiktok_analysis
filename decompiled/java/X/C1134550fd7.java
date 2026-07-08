package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0fd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134550fd7 implements C0IL4 {
    public static final C1134550fd7 LIZ = new C1134550fd7();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final List<InterfaceC1134750fdR> LJI;

    static {
        List<InterfaceC1134750fdR> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        LJI = listSynchronizedList;
        C470360IcU.LIZIZ(new Runnable() { // from class: X.0fdI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("WatchLiveStatusTracker@ab16.<init>$1");
                try {
                    C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
                    C1134560fd8.LIZIZ.add(new C1134620fdE(C1134550fd7.LIZ));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("WatchLiveStatusTracker@ab16.<init>$1");
            }
        }, 0L, TimeUnit.SECONDS);
        long jLIZJ = C158B.LIZJ();
        C0JT7.LIZ.getClass();
        if (jLIZJ > ((Number) C0JT7.LIZ(0L, "day_end_time")).longValue()) {
            LJFF();
        }
        listSynchronizedList.add(C1134760fdS.LL);
    }

    public static final long LJ() {
        if (LJ != 0) {
            LJII();
            LJ = C158B.LIZ();
        }
        return LJFF / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static void LJFF() {
        C20441214yg.LIZIZ("WatchLiveStatusTracker", "resetDuration called");
        LJFF = 0L;
        C0JT7.LIZ.getClass();
        C0JT7.LIZJ(0L, "watch_live_duration");
    }

    public static void LJI() {
        boolean z = LIZIZ;
        LIZIZ = LIZLLL && LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsWatching: old=");
        sbLIZ.append(z);
        sbLIZ.append(", new=");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(", foreground=");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(", roomWatching=");
        sbLIZ.append(LIZJ);
        C20441214yg.LIZIZ("WatchLiveStatusTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZIZ) {
            if (LJ == 0) {
                LJ = C158B.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setIsWatching: Started tracking at ");
                sbLIZ2.append(LJ);
                C20441214yg.LIZIZ("WatchLiveStatusTracker", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else if (LJ != 0) {
            LJII();
            LJ = 0L;
            C20441214yg.LIZIZ("WatchLiveStatusTracker", "setIsWatching: Stopped tracking, duration saved.");
        }
        if (z != LIZIZ) {
            Iterator<InterfaceC1134750fdR> it2 = LJI.iterator();
            while (it2.hasNext()) {
                it2.next().D(LIZIZ);
            }
        }
    }

    public static void LJII() {
        if (LJFF == 0) {
            C0JT7.LIZ.getClass();
            LJFF = ((Number) C0JT7.LIZ(0L, "watch_live_duration")).longValue();
        }
        long jLIZ = C158B.LIZ() - LJ;
        long j = LJFF;
        LJFF = Math.min(jLIZ + j, 86400000L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setWatchLiveDuration: old=");
        sbLIZ.append(j);
        sbLIZ.append(", added=");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", new=");
        sbLIZ.append(LJFF);
        C20441214yg.LIZIZ("WatchLiveStatusTracker", C2188811AlT.LIZIZ(sbLIZ));
        C0JT7 c0jt7 = C0JT7.LIZ;
        Long lValueOf = Long.valueOf(LJFF);
        c0jt7.getClass();
        C0JT7.LIZJ(lValueOf, "watch_live_duration");
    }

    @Override // X.C0IL4
    public final void LIZ(Room room) {
        LIZJ = false;
        LJI();
    }

    @Override // X.C0IL4
    public final void LIZIZ(Room room) {
        LIZJ = false;
        LJI();
    }

    @Override // X.C0IL4
    public final void LIZJ(Room room) {
        LIZJ = true;
        LJI();
    }

    @Override // X.C0IL4
    public final void LIZLLL(Room room) {
        LIZJ = true;
        LJI();
    }
}
