package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* JADX INFO: renamed from: X.0yhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867510yhJ extends C09AY implements Function1<AnchorRoomInfoResponse.ResponseData, Unit> {
    public final /* synthetic */ DataChannel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1867510yhJ(DataChannel dataChannel) {
        super(1);
        this.LL = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AnchorRoomInfoResponse.ResponseData responseData) {
        AnchorRoomInfoResponse.ResponseData responseData2 = responseData;
        this.LL.SX0(C750310Tbx.class, Boolean.valueOf(responseData2.isOrgAccount));
        if (responseData2.liveTakeDecouple) {
            this.LL.SX0(C750300Tbw.class, Boolean.TRUE);
        }
        AnchorRoomInfoResponse.DropsInfo dropsInfo = responseData2.dropsInfo;
        if (dropsInfo != null && dropsInfo.showDrops) {
            String str = dropsInfo.promotingDropsId;
            if (str.length() > 0) {
                this.LL.SX0(C754460Tie.class, new C443401o0(str, dropsInfo.promotingDropsName, dropsInfo.gameId, dropsInfo.gameName));
            }
            List<Long> list = dropsInfo.dropsIdList;
            if (!list.isEmpty()) {
                this.LL.SX0(C749180Ta8.class, list);
            }
            EnumC1102750enp.ANCHOR_PARTNERSHIP_DROPS.load(this.LL, new C443301nz());
        }
        AnchorRoomInfoResponse.PartnershipInfo partnershipInfo = responseData2.partnershipInfo;
        if (partnershipInfo != null && partnershipInfo.showPartnership) {
            EnumC1102750enp.ANCHOR_PARTNERSHIP.load(this.LL, new C1878440yyw());
        }
        return Unit.LIZ;
    }
}
