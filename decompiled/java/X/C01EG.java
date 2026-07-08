package X;

import com.bytedance.android.live.liveinteract.api.CountDownServiceInitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.CountDownService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01EG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EG {
    public static InterfaceC421301kR LIZIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("COUNT_DOWN_SERVICE");
        if (objLJIIIZ instanceof InterfaceC421301kR) {
            return (InterfaceC421301kR) objLJIIIZ;
        }
        return null;
    }

    public static void LIZ(DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownService create, role = ");
        sbLIZ.append(C01HE.LJ());
        C1AZW.LJIIJ(12, "CountdownService", C2188811AlT.LIZIZ(sbLIZ), null, null);
        CountDownService.LIZJ = false;
        C948450amx.LIZIZ.LJFF(new CountDownService(dataChannel), null);
        if (dataChannel != null) {
            dataChannel.FQ2(CountDownServiceInitEvent.class);
        }
    }
}
