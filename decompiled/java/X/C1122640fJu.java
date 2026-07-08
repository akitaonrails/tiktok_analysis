package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122640fJu extends C09AY implements Function1<Pair<? extends Long, ? extends Boolean>, Unit> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122640fJu(ServiceRoutingDetector serviceRoutingDetector) {
        super(1);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Boolean> pair) {
        Long lValueOf;
        Pair<? extends Long, ? extends Boolean> pair2 = pair;
        Room room = this.LL.LL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Long first = pair2.getFirst();
        boolean zBooleanValue = pair2.getSecond().booleanValue();
        C051E.LIZ("icon.visible", new Pair("show", Boolean.valueOf(zBooleanValue)), new Pair("expected_room_id", first), new Pair("current_room_id", lValueOf), new Pair("matched", Boolean.valueOf(Intrinsics.LJFF(lValueOf, first))));
        if (Intrinsics.LJFF(lValueOf, first)) {
            this.LL.LLILZ = zBooleanValue;
            if (zBooleanValue) {
                this.LL.D1("icon_visible");
                this.LL.A1();
            } else {
                C1122620fJs c1122620fJs = this.LL.LLJJIJIL;
                if (c1122620fJs != null) {
                    c1122620fJs.LIZIZ();
                }
            }
        }
        return Unit.LIZ;
    }
}
