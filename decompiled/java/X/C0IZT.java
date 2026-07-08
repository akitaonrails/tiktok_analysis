package X;

import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IZT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZT extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ Room LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IZT(Room room) {
        super(1);
        this.LL = room;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        String strLJIILL;
        SparkContext sparkContext2 = sparkContext;
        try {
            LiveEventInfo liveEventInfo = this.LL.liveEventInfo;
            if (liveEventInfo != null && (strLJIILL = C19748512Ol.LIZIZ.LJIILL(liveEventInfo)) != null) {
                sparkContext2.LJJLIIIJ(strLJIILL, "live_event_info");
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
