package X;

import Y.ARunnableS4S1000000_7;
import android.os.Looper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463850IGx {
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static RunnableC463140IEe LJ;
    public static volatile C0ISJ LJFF;
    public static final Map<String, String> LIZ = C2097908Jt.LIZJ(new Pair("is_multi_feed", "1"));
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C463860IGy LJI = new C0IH2() { // from class: X.0IGy
        @Override // X.C0IH2
        public final void LIZ(int i) {
            if (i == 7) {
                C20441214yg.LJIIIZ("LiveEndMgFeedInjector", "onFinishCardStateChanged: FINISH_CARD_SHOW, post trim stale mg preload rooms");
                C786410Ut5.LJJZZIII(C463850IGx.LIZIZ, new Runnable() { // from class: X.0IGz
                    public static void LIZ() {
                        C0ISJ c0isj = C463850IGx.LJFF;
                        if (c0isj != null) {
                            final Set<Long> set = c0isj.LLJJIJIIJIL;
                            final Set<Long> set2 = c0isj.LLJJIJIL;
                            C08CX c08cx = C08CX.INSTANCE;
                            c0isj.LLJJIJIIJIL = c08cx;
                            c0isj.LLJJIJIL = c08cx;
                            if (set.isEmpty() || set2.isEmpty()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("trimStaleMgPreloadRooms: skip, staleSize=");
                                sbLIZ.append(set.size());
                                sbLIZ.append(", freshSize=");
                                sbLIZ.append(set2.size());
                                C20441214yg.LJIIIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("trimStaleMgPreloadRooms: staleIds=");
                                sbLIZ2.append(set);
                                sbLIZ2.append(", freshIds=");
                                sbLIZ2.append(set2);
                                sbLIZ2.append(", listSize=");
                                sbLIZ2.append(c0isj.LLJILJIL.size());
                                C20441214yg.LJIIIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ2));
                                c0isj.LJJJJIZL(new C0ISF<Room>() { // from class: X.0IH0
                                    @Override // X.C0ISF
                                    public final boolean LIZ(Room room) {
                                        if (room != null) {
                                            long id = room.getId();
                                            if (set.contains(Long.valueOf(id)) && !set2.contains(Long.valueOf(id))) {
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                }, false);
                            }
                        }
                        Map<String, String> map = C463850IGx.LIZ;
                        ((ArrayList) C0IH6.LJ).remove(C463850IGx.LJI);
                        C463850IGx.LJFF = null;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveEndMultiGuestFeedInjector@4c49.finishCardStateListener$1$onFinishCardStateChanged$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveEndMultiGuestFeedInjector@4c49.finishCardStateListener$1$onFinishCardStateChanged$1");
                    }
                });
            }
        }
    };

    public static void LIZ(String str) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LIZIZ, new ARunnableS4S1000000_7(str, 2));
            return;
        }
        if (!LIZLLL) {
            return;
        }
        LIZLLL = false;
        RunnableC463140IEe runnableC463140IEe = LJ;
        if (runnableC463140IEe != null) {
            LIZIZ.removeCallbacks(runnableC463140IEe);
        }
        LJ = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseGate from=");
        sbLIZ.append(str);
        sbLIZ.append(", send MULTI_GUEST_FEED_READY");
        C20441214yg.LJIIIZ("LiveEndMgFeedInjector", C2188811AlT.LIZIZ(sbLIZ));
        C0IH6.LIZ(C0III.MULTI_GUEST_FEED_READY);
    }
}
