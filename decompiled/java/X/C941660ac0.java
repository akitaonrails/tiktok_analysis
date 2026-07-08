package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model.IFanTicketApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0ac0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941660ac0 extends AbstractC941590abt {
    public final C01GW LLILZLL;

    @Override // X.AbstractC941590abt
    public final String LIZ() {
        return "ApiDataSource";
    }

    @Override // X.AbstractC941590abt
    public final void onDestroy() {
        ((C11NJ) this.LLILZLL.getValue()).LJ();
    }

    public final void LIZLLL(boolean z) {
        C480460Ism.LIZ().getClass();
        IFanTicketApi iFanTicketApi = (IFanTicketApi) C480460Ism.LIZLLL(IFanTicketApi.class);
        GetFanTicketContentParams getFanTicketContentParams = new GetFanTicketContentParams();
        getFanTicketContentParams.roomId = C954140aw8.LIZJ();
        getFanTicketContentParams.channelId = C954140aw8.LIZIZ();
        getFanTicketContentParams.audienceRole = z;
        ((C11NJ) this.LLILZLL.getValue()).LIZ(iFanTicketApi.getFanTicketContent(getFanTicketContentParams).LJIILL(new AfS184S0100000_15(this, 213)).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0ac9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ApiDataSource@1d50.requestGetFanTicketContent$3");
                C320901Mh.LIZ("ApiDataSource", "requestGetFanTicketContent successfully");
                C1C7U.LIZIZ("ApiDataSource@1d50.requestGetFanTicketContent$3");
            }
        }, new C09JN() { // from class: X.0acA
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ApiDataSource@1d50.requestGetFanTicketContent$4");
                C320901Mh.LIZ("ApiDataSource", "requestGetFanTicketContent unsuccessfully");
                C1C7U.LIZIZ("ApiDataSource@1d50.requestGetFanTicketContent$4");
            }
        }));
    }

    public C941660ac0(DataChannel dataChannel, C941630abx c941630abx, C941780acC c941780acC, AwS559S0100000_15 awS559S0100000_15) {
        super(dataChannel, c941630abx, c941780acC, awS559S0100000_15);
        this.LLILZLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(457));
    }
}
