package Y;

import X.C09JN;
import X.C1C7U;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.api.envelope.RevenuePermissionResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AfS2S1200100_17 implements C09JN {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS2S1200100_17 afS2S1200100_17, Object obj) {
        C1C7U.LIZ("TreasureBoxService@5211.requestPermission$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS2S1200100_17.l1;
        DataChannel dataChannel = (DataChannel) afS2S1200100_17.l2;
        RevenuePermissionResponse.ResponseData responseData = (RevenuePermissionResponse.ResponseData) baseResponse.data;
        String str = afS2S1200100_17.s0;
        long j = afS2S1200100_17.j3;
        int i = baseResponse.statusCode;
        String str2 = baseResponse.LIZIZ;
        treasureBoxService.getClass();
        TreasureBoxService.LIZJ(dataChannel, responseData, str, j, i, str2, true);
        C1C7U.LIZIZ("TreasureBoxService@5211.requestPermission$1");
    }

    public static final void accept$1(AfS2S1200100_17 afS2S1200100_17, Object obj) {
        C1C7U.LIZ("TreasureBoxService@5211.requestPermission$2");
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS2S1200100_17.l1;
        DataChannel dataChannel = (DataChannel) afS2S1200100_17.l2;
        String str = afS2S1200100_17.s0;
        long j = afS2S1200100_17.j3;
        treasureBoxService.getClass();
        TreasureBoxService.LIZIZ(dataChannel, str, j, (Throwable) obj, true);
        C1C7U.LIZIZ("TreasureBoxService@5211.requestPermission$2");
    }

    public AfS2S1200100_17(TreasureBoxService treasureBoxService, DataChannel dataChannel, String str, long j, int i) {
        this.$t = i;
        this.l1 = treasureBoxService;
        this.l2 = dataChannel;
        this.s0 = str;
        this.j3 = j;
    }
}
