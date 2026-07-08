package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746860vYi extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ HashMap<String, Object> LL;
    public final /* synthetic */ double LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746860vYi(HashMap<String, Object> map, double d) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("page_name", "trajectory_map_for_address");
        HashMap<String, Object> map = this.LL;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("previous_page");
        } else {
            obj = null;
        }
        laneParams2.plusAssign("previous_page", obj);
        HashMap<String, Object> map2 = this.LL;
        if (map2 != null) {
            obj2 = map2.get("entrance_info");
        }
        laneParams2.plusAssign("entrance_info", obj2);
        laneParams2.plusAssign("distance", Double.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
