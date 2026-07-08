package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fKB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122810fKB extends C09AY implements Function1<Room, Unit> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122810fKB(ServiceRoutingDetector serviceRoutingDetector) {
        super(1);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Room room) {
        Room room2 = room;
        ServiceRoutingDetector serviceRoutingDetector = this.LL;
        serviceRoutingDetector.LL = room2;
        serviceRoutingDetector.z1().LJFF = room2;
        this.LL.getClass();
        ServiceRoutingDetector.B1(room2, "room.sku_state.update");
        return Unit.LIZ;
    }
}
