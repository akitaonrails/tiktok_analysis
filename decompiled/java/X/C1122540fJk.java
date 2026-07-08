package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122540fJk extends C09AY implements Function1<AbstractC1103820epY, Unit> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122540fJk(ServiceRoutingDetector serviceRoutingDetector) {
        super(1);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1103820epY abstractC1103820epY) {
        Long lValueOf;
        AbstractC1103820epY abstractC1103820epY2 = abstractC1103820epY;
        if (abstractC1103820epY2 instanceof C1103810epX) {
            Pair[] pairArr = new Pair[1];
            Room room = this.LL.LL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            boolean z = false;
            pairArr[0] = new Pair("room_id", lValueOf);
            C051E.LIZ("detector_state.active", pairArr);
            this.LL.D1("detector_active");
            ServiceRoutingDetector serviceRoutingDetector = this.LL;
            C1103810epX c1103810epX = (C1103810epX) abstractC1103820epY2;
            serviceRoutingDetector.getClass();
            serviceRoutingDetector.LLILZLL = c1103810epX.LIZ;
            String str = c1103810epX.LIZIZ;
            if (str == null) {
                str = "";
            }
            serviceRoutingDetector.LLILZIL = str;
            serviceRoutingDetector.LLJIJIL = true;
            serviceRoutingDetector.z1().LJ = serviceRoutingDetector.LLILZLL;
            serviceRoutingDetector.z1().LJII = serviceRoutingDetector.LLILZIL;
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair("anchor_component", Integer.valueOf(serviceRoutingDetector.LLILZLL));
            if (serviceRoutingDetector.LLILZIL.length() > 0) {
                z = true;
            }
            pairArr2[1] = new Pair("has_dm_schema", Boolean.valueOf(z));
            C051E.LIZ("detector_state.parse", pairArr2);
            this.LL.A1();
        }
        return Unit.LIZ;
    }
}
