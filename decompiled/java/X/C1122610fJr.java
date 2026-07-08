package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122610fJr extends C09AY implements Function1<EnumC1122660fJw, Unit> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122610fJr(ServiceRoutingDetector serviceRoutingDetector) {
        super(1);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC1122660fJw enumC1122660fJw) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        User owner;
        EnumC1122660fJw enumC1122660fJw2 = enumC1122660fJw;
        ServiceRoutingDetector serviceRoutingDetector = this.LL;
        boolean z = serviceRoutingDetector.z1().LJIIIZ;
        if (!serviceRoutingDetector.LLJILJIL.add(enumC1122660fJw2)) {
            C051E.LIZ("conversion.skip", new Pair("reason", "duplicate"), new Pair("sku", enumC1122660fJw2), new Pair("is_guided", Boolean.valueOf(z)));
        } else {
            C1122630fJt c1122630fJt = serviceRoutingDetector.LLJJIII;
            c1122630fJt.LJIIIIZZ = true;
            C051E.LIZ("frequency.record_conversion", new Pair("room_id", c1122630fJt.LJIIIZ));
            Room room = serviceRoutingDetector.LL;
            String str = serviceRoutingDetector.LLJ;
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("event", "livesdk_service_tool_lead_convert");
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            pairArr[1] = new Pair("room_id", lValueOf);
            pairArr[2] = new Pair("sku", enumC1122660fJw2);
            pairArr[3] = new Pair("is_guided", Boolean.valueOf(z));
            pairArr[4] = new Pair("industry_type", str);
            C051E.LIZ("track.convert", pairArr);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_tool_lead_convert");
            c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            if (room != null) {
                lValueOf2 = Long.valueOf(room.getId());
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "room_id");
            if (room != null && (owner = room.getOwner()) != null) {
                lValueOf3 = Long.valueOf(owner.getId());
            } else {
                lValueOf3 = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(lValueOf3), "anchor_id");
            c474500IjALIZ.LJJII(enumC1122660fJw2.getTrackingValue(), "tool_type");
            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_guided");
            c474500IjALIZ.LJJII(str, "industry_type");
            c474500IjALIZ.LIZ();
            C1122620fJs c1122620fJs = serviceRoutingDetector.LLJJIJIL;
            if (c1122620fJs != null) {
                c1122620fJs.LIZIZ();
            }
            C051E.LIZ("conversion", new Pair("sku", enumC1122660fJw2), new Pair("is_guided", Boolean.valueOf(z)));
        }
        return Unit.LIZ;
    }
}
