package Y;

import X.C1161920gLG;
import X.C1C7U;
import X.C20684815ws;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public class ACallableS25S1000000_12 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS25S1000000_12 aCallableS25S1000000_12) {
        String strExecuteGet;
        C1C7U.LIZ("RoomManager@6c79.getNGBStreamUrl$1");
        String str = aCallableS25S1000000_12.s0;
        IHostNetwork iHostNetwork = (IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class);
        if (iHostNetwork != null) {
            strExecuteGet = iHostNetwork.executeGet(str);
        } else {
            strExecuteGet = "";
        }
        C1C7U.LIZIZ("RoomManager@6c79.getNGBStreamUrl$1");
        return strExecuteGet;
    }

    public static final Object call$1(ACallableS25S1000000_12 aCallableS25S1000000_12) {
        C1C7U.LIZ("CommentLogger@c1c.onEventReportInBackground$3");
        C20684815ws.onEventV3(aCallableS25S1000000_12.s0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.onEventReportInBackground$3");
        return unit;
    }

    public ACallableS25S1000000_12(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
