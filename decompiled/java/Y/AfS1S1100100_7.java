package Y;

import X.C09JN;
import X.C1176404iw;
import X.C1176504ix;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C464950ILd;
import X.C468200IXq;
import X.C471840Ies;
import X.InterfaceC468230IXt;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomBoostExp;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public class AfS1S1100100_7 implements C09JN {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

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
        }
    }

    public static final void accept$0(AfS1S1100100_7 afS1S1100100_7, Object obj) {
        C1C7U.LIZ("LiveSearchPresenter@67c.refreshSearchList$2");
        C471840Ies c471840Ies = (C471840Ies) afS1S1100100_7.l1;
        c471840Ies.LIZIZ = false;
        c471840Ies.LIZ.wv();
        C471840Ies c471840Ies2 = (C471840Ies) afS1S1100100_7.l1;
        c471840Ies2.LIZIZ(null, afS1S1100100_7.j2, afS1S1100100_7.s0, c471840Ies2.LIZLLL);
        C1C7U.LIZIZ("LiveSearchPresenter@67c.refreshSearchList$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS1S1100100_7 afS1S1100100_7, Object obj) {
        long jLongValue;
        EpiphronDecision epiphronDecision;
        Map<String, String> map;
        String str;
        C464950ILd c464950ILd = (C464950ILd) afS1S1100100_7.l1;
        long j = afS1S1100100_7.j2;
        String str2 = afS1S1100100_7.s0;
        BaseResponse baseResponse = (BaseResponse) obj;
        c464950ILd.getClass();
        C1C7U.LIZ("RoomManager@6c79.preEnterRoom$1L");
        if (LiveEnterRoomBoostExp.INSTANCE.boostType() == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append("-");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            long j2 = ((EnterRoomExtra) baseResponse.extra).cacheVersion;
            Room room = (Room) baseResponse.data;
            if (room != null && (epiphronDecision = room.decisions) != null && (map = epiphronDecision.serverFeatures) != null && (str = map.get("fyp_live_cache_expire_time")) != null) {
                try {
                    CastLongProtector.parseLong(str);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('-');
            sbLIZ2.append(1);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            ConcurrentHashMap<String, Long> concurrentHashMap = C1176404iw.LIZIZ;
            Long l = concurrentHashMap.get(strLIZIZ2);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue <= j2) {
                concurrentHashMap.remove(strLIZIZ2);
                System.currentTimeMillis();
                C1176404iw.LIZ.put(strLIZIZ2, new C1176504ix(j2));
            }
        }
        C1C7U.LIZIZ("RoomManager@6c79.preEnterRoom$1L");
    }

    public static final void accept$2(AfS1S1100100_7 afS1S1100100_7, Object obj) {
        C1C7U.LIZ("GameLiveBottombarFeedProvider@5c8e.fetchFeedData$3");
        Throwable th = (Throwable) obj;
        C468200IXq.LIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to fetch feed[heroId=");
        sbLIZ.append(afS1S1100100_7.j2);
        sbLIZ.append("] data erro: ");
        sbLIZ.append(th);
        C20441214yg.LJ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ));
        String message = th.getMessage();
        if (message == null || !(!a0.LJJJIL(message))) {
            message = "Unknown error";
        }
        InterfaceC468230IXt interfaceC468230IXt = (InterfaceC468230IXt) afS1S1100100_7.l1;
        if (interfaceC468230IXt != null) {
            interfaceC468230IXt.onError(message, afS1S1100100_7.s0);
        }
        C1C7U.LIZIZ("GameLiveBottombarFeedProvider@5c8e.fetchFeedData$3");
    }

    public AfS1S1100100_7(long j, Object obj, String str, int i) {
        this.$t = i;
        this.j2 = j;
        this.l1 = obj;
        this.s0 = str;
    }
}
