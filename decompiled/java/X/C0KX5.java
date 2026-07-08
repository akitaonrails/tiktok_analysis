package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0KX5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KX5 {
    public static final boolean LIZJ() {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        if (!iInteractService.Nt()) {
            if (iLiveCompetitionExternalService == null) {
                return false;
            }
            if (!iLiveCompetitionExternalService.v91() && !iLiveCompetitionExternalService.kg2()) {
                return false;
            }
        }
        return true;
    }

    public static final String LIZ(long j) {
        if (j >= 1000000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j / ((long) 1000000000));
            sbLIZ.append('B');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(j / ((long) 1000000));
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return String.valueOf(j);
    }

    public static final boolean LIZIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return false;
        }
        if (LIZJ()) {
            C766270U4b.LIZLLL(2131857032);
            return true;
        }
        if (!LIZLLL(dataChannel)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        long jLongValue;
        C1086960eOM c1086960eOMLI;
        Integer numLIZLLL;
        boolean z = false;
        if (dataChannel == null) {
            return false;
        }
        Long l = (Long) dataChannel.gg0(C751340Tdc.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null && (c1086960eOMLI = iRoomFunctionService.lI()) != null && (numLIZLLL = c1086960eOMLI.LIZLLL(jLongValue)) != null) {
            int iIntValue = numLIZLLL.intValue();
            z = true;
            if (iIntValue != 1 && iIntValue != 3 && iIntValue != 4) {
                C766270U4b.LIZLLL(2131856983);
            } else {
                C766270U4b.LIZLLL(2131856985);
                return true;
            }
        }
        return z;
    }
}
