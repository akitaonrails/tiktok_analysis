package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1025403zg extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025403zg(int i, Map map, Map map2, boolean z) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        String str;
        LaneParams laneParams2 = laneParams;
        Map<String, Object> map = this.LL;
        if (map != null) {
            laneParams2.putAll(map);
        }
        Map<String, Object> map2 = this.LLILLJJLI;
        if (map2 != null) {
            laneParams2.putAll(map2);
        }
        Map<String, Object> map3 = this.LLILLJJLI;
        if (map3 == null || (obj = map3.get("click_product_start_time")) == null) {
            obj = -1L;
        }
        if ((obj instanceof Long) && !Intrinsics.LJFF(obj, -1L)) {
            laneParams2.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (this.LLILLL) {
            str = "yes";
        } else {
            str = "no";
        }
        laneParams2.put("is_retry", str);
        laneParams2.put("preload_type", Integer.valueOf(this.LLILZ));
        laneParams2.put("api_path", "/api/v1/shop/product_info/get");
        if (!laneParams2.containsKey((Object) "page_name")) {
            laneParams2.put("page_name", "product_detail");
        }
        return Unit.LIZ;
    }
}
