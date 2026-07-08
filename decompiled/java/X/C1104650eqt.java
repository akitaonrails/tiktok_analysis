package X;

import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.envelope.RevenuePermissionRequest;
import webcast.api.envelope.RevenuePermissionResponse;

/* JADX INFO: renamed from: X.0eqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104650eqt extends C09AY implements Function1<Pair<? extends Boolean, ? extends RevenuePermissionResponse.ResponseData>, Unit> {
    public final /* synthetic */ TreasureBoxService LL;
    public final /* synthetic */ RevenuePermissionRequest LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104650eqt(TreasureBoxService treasureBoxService, RevenuePermissionRequest revenuePermissionRequest, String str, DataChannel dataChannel, long j) {
        super(1);
        this.LL = treasureBoxService;
        this.LLILLJJLI = revenuePermissionRequest;
        this.LLILLL = str;
        this.LLILZ = dataChannel;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Boolean, ? extends RevenuePermissionResponse.ResponseData> pair) {
        Pair<? extends Boolean, ? extends RevenuePermissionResponse.ResponseData> pair2 = pair;
        if (!pair2.getFirst().booleanValue()) {
            this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, System.currentTimeMillis(), this.LLILZ, false);
        } else {
            RevenuePermissionResponse.ResponseData second = pair2.getSecond();
            if (second != null) {
                TreasureBoxService treasureBoxService = this.LL;
                DataChannel dataChannel = this.LLILZ;
                String str = this.LLILLL;
                long j = this.LLILZIL;
                treasureBoxService.getClass();
                TreasureBoxService.LIZJ(dataChannel, second, str, j, 0, null, false);
            } else {
                TreasureBoxService treasureBoxService2 = this.LL;
                DataChannel dataChannel2 = this.LLILZ;
                String str2 = this.LLILLL;
                long j2 = this.LLILZIL;
                treasureBoxService2.getClass();
                TreasureBoxService.LIZIZ(dataChannel2, str2, j2, null, false);
            }
        }
        return Unit.LIZ;
    }
}
