package Y;

import X.AbstractC960500b6O;
import X.C09JN;
import X.C1C7U;
import X.C238400w2;
import X.C950220apo;
import X.C950790aqj;
import X.C955540ayO;
import X.C955590ayT;
import X.C960610b6Z;
import X.C960620b6a;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0510100_15 implements C09JN {
    public final int $t;
    public long j6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0510100_15 afS0S0510100_15, Object obj) {
        Room room;
        MGetUserLinkmicStatusResponse.ResponseData responseData;
        Map<Long, Room> map;
        C1C7U.LIZ("BaseMultiCoHostInviteListPresenter@7cd8.apply$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C238400w2 c238400w2 = (C238400w2) afS0S0510100_15.l0;
        if (baseResponse != null && (responseData = (MGetUserLinkmicStatusResponse.ResponseData) baseResponse.data) != null && (map = responseData.roomInfo) != null) {
            room = map.get(Long.valueOf(((Room) afS0S0510100_15.l1).getId()));
        } else {
            room = null;
        }
        c238400w2.element = C950220apo.LJIIL(room);
        C955590ayT c955590ayT = (C955590ayT) afS0S0510100_15.l2;
        C955540ayO c955540ayO = (C955540ayO) afS0S0510100_15.l3;
        boolean z = afS0S0510100_15.z5;
        String str = c955590ayT.LJII;
        if (str == null) {
            str = "";
        }
        C950790aqj.LIZJ(c955590ayT, c955540ayO, z, str, (AbstractC960500b6O) afS0S0510100_15.l4, afS0S0510100_15.j6, ((C238400w2) afS0S0510100_15.l0).element);
        C1C7U.LIZIZ("BaseMultiCoHostInviteListPresenter@7cd8.apply$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0510100_15 afS0S0510100_15, Object obj) {
        Room room;
        MGetUserLinkmicStatusResponse.ResponseData responseData;
        Map<Long, Room> map;
        C1C7U.LIZ("MultiCoHostHistoryPresenter@e856.apply$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C238400w2 c238400w2 = (C238400w2) afS0S0510100_15.l0;
        if (baseResponse != null && (responseData = (MGetUserLinkmicStatusResponse.ResponseData) baseResponse.data) != null && (map = responseData.roomInfo) != null) {
            room = map.get(Long.valueOf(((Room) afS0S0510100_15.l1).getId()));
        } else {
            room = null;
        }
        c238400w2.element = C950220apo.LJIIL(room);
        C950790aqj.LIZJ((C955590ayT) afS0S0510100_15.l2, (C955540ayO) afS0S0510100_15.l3, afS0S0510100_15.z5, "", (C960620b6a) afS0S0510100_15.l4, afS0S0510100_15.j6, ((C238400w2) afS0S0510100_15.l0).element);
        C1C7U.LIZIZ("MultiCoHostHistoryPresenter@e856.apply$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS0S0510100_15 afS0S0510100_15, Object obj) {
        Room room;
        MGetUserLinkmicStatusResponse.ResponseData responseData;
        Map<Long, Room> map;
        C1C7U.LIZ("MultiCoHostSearchPresenter@ec83.apply$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C238400w2 c238400w2 = (C238400w2) afS0S0510100_15.l0;
        if (baseResponse != null && (responseData = (MGetUserLinkmicStatusResponse.ResponseData) baseResponse.data) != null && (map = responseData.roomInfo) != null) {
            room = map.get(Long.valueOf(((Room) afS0S0510100_15.l1).getId()));
        } else {
            room = null;
        }
        c238400w2.element = C950220apo.LJIIL(room);
        C950790aqj.LIZJ((C955590ayT) afS0S0510100_15.l2, (C955540ayO) afS0S0510100_15.l3, afS0S0510100_15.z5, "", (C960610b6Z) afS0S0510100_15.l4, afS0S0510100_15.j6, ((C238400w2) afS0S0510100_15.l0).element);
        C1C7U.LIZIZ("MultiCoHostSearchPresenter@ec83.apply$1");
    }

    public AfS0S0510100_15(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.z5 = z;
        this.l4 = obj5;
        this.j6 = j;
    }
}
