package Y;

import X.C09JN;
import X.C1494690ozz;
import X.C1C7U;
import X.C468600IZe;
import X.C468640IZi;
import X.C510380Jzw;
import X.C518180KTw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class AfS1S0000100_7 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public AfS1S0000100_7(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS1S0000100_7 afS1S0000100_7, Object obj) {
        C1C7U.LIZ("WatchLaterManager@a847.reportWatched$1");
        LinkedHashMap<Long, C468600IZe> linkedHashMap = C468640IZi.LLILLJJLI;
        long j = afS1S0000100_7.j0;
        synchronized (linkedHashMap) {
            try {
                C468600IZe c468600IZe = linkedHashMap.get(Long.valueOf(j));
                if (c468600IZe != null) {
                    c468600IZe.LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("WatchLaterManager@a847.reportWatched$1");
    }

    public static final void accept$1(AfS1S0000100_7 afS1S0000100_7, Object obj) {
        C1C7U.LIZ("FansClubJoinDialogV1@a08b.initFansEntrance$dispose$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C1494690ozz) {
            C518180KTw.LJIIIZ("/webcast/privilege/fans_get_task_info/", (C1494690ozz) th, System.currentTimeMillis() - afS1S0000100_7.j0);
        }
        C1C7U.LIZIZ("FansClubJoinDialogV1@a08b.initFansEntrance$dispose$2");
    }

    public static final void accept$2(AfS1S0000100_7 afS1S0000100_7, Object obj) {
        C1C7U.LIZ("FansClubViewModel@394b.requestFansConfig$dispose$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C1494690ozz) {
            C518180KTw.LJIIIZ("/webcast/privilege/fans_config/", (C1494690ozz) th, System.currentTimeMillis() - afS1S0000100_7.j0);
        }
        C518180KTw.LJIILJJIL(th, false);
        C1C7U.LIZIZ("FansClubViewModel@394b.requestFansConfig$dispose$2");
    }

    public static final void accept$3(AfS1S0000100_7 afS1S0000100_7, Object obj) {
        C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.loadAllEmotesListForPermission$3");
        C510380Jzw.LJIJ(afS1S0000100_7.j0, (Throwable) obj);
        C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.loadAllEmotesListForPermission$3");
    }
}
