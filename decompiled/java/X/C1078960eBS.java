package X;

import com.bytedance.android.livesdk.rank.impl.RankingCountdownManagerChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078960eBS {
    public final DataChannel LIZ;
    public final Map<Pair<Integer, Integer>, C1078930eBP> LIZIZ = new LinkedHashMap();
    public CountDownTimerC1811820xFU LIZJ;

    public C1078960eBS(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = this.LIZJ;
        if (countDownTimerC1811820xFU != null) {
            countDownTimerC1811820xFU.cancel();
        }
        CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = new CountDownTimerC1811820xFU(86400000L);
        countDownTimerC1811820xFU2.LIZ = new InterfaceC1811830xFV() { // from class: X.0eBO
            @Override // X.InterfaceC1811830xFV
            public final void LIZLLL() {
            }

            /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
            @Override // X.InterfaceC1811830xFV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJI(long r17) {
                /*
                    Method dump skipped, instruction units count: 421
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1078920eBO.LJJI(long):void");
            }
        };
        this.LIZJ = countDownTimerC1811820xFU2;
        countDownTimerC1811820xFU2.start();
        dataChannel.zW(RankingCountdownManagerChannel.class, this);
    }
}
