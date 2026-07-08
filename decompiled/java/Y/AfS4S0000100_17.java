package Y;

import X.AbstractC1102390enF;
import X.C09JN;
import X.C1102370enD;
import X.C1102420enI;
import X.C1494690ozz;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C518180KTw;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlResp;
import com.bytedance.android.livesdk.frequency.setting.LiveFixFrequencyManagerConcurrentModificationExceptionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS67S0100100_12;

/* JADX INFO: loaded from: classes18.dex */
public class AfS4S0000100_17 implements C09JN {
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
        }
    }

    public AfS4S0000100_17(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS4S0000100_17 afS4S0000100_17, Object obj) {
        C1C7U.LIZ("JoinDialogViewModel@c4dc.getUserData$dispose$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C1494690ozz) {
            C518180KTw.LJIIIZ("/webcast/privilege/non_fans_get_user_data/", (C1494690ozz) th, System.currentTimeMillis() - afS4S0000100_17.j0);
        }
        C1C7U.LIZIZ("JoinDialogViewModel@c4dc.getUserData$dispose$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS4S0000100_17 afS4S0000100_17, Object obj) {
        Map<Long, MsgNotifyQuota> map;
        C1C7U.LIZ("LiveNotifyMessageFrequencyManager@3a91.reportImmediately$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C1102420enI.LJIILL = 0;
        HashMap<Long, MsgNotifyQuota> map2 = C1102420enI.LIZ;
        long j = afS4S0000100_17.j0;
        MsgNotifyControlResp.Data data = (MsgNotifyControlResp.Data) baseResponse.data;
        NotifyFCConfig notifyFCConfig = null;
        if (data != null) {
            map = data.quotaConfig;
        } else {
            map = null;
        }
        C1102420enI.LJIILL(j, map);
        boolean z = C1102370enD.LIZ;
        MsgNotifyControlResp.Data data2 = (MsgNotifyControlResp.Data) baseResponse.data;
        if (data2 != null) {
            notifyFCConfig = data2.notifyFcConfig;
        }
        long j2 = afS4S0000100_17.j0;
        if (!(!LiveFixFrequencyManagerConcurrentModificationExceptionSetting.INSTANCE.isEnabled())) {
            Iterator it2 = C1102370enD.LIZJ().values().iterator();
            while (it2.hasNext()) {
                ((AbstractC1102390enF) it2.next()).LJIIJJI(notifyFCConfig, 3, j2);
            }
        } else {
            C500260Jjc.LJJLIIIJJIZ(new AwS67S0100100_12(notifyFCConfig, j2, 0));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Quota Config After Sync: ");
        HashMap<Long, MsgNotifyQuota> map3 = C1102420enI.LIZ;
        sbLIZ.append(C1102420enI.LJ());
        C20441214yg.LJ("LiveNotifyMessageFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveNotifyMessageFrequencyManager@3a91.reportImmediately$1");
    }
}
