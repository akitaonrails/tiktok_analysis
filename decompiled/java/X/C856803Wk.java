package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C856803Wk extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C856803Wk(Map<String, ? extends Object> map, boolean z, int i) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        LaneParams laneParams2 = laneParams;
        Map<String, Object> map = this.LL;
        if (map != null) {
            laneParams2.putAll(map);
        }
        if (this.LLILLJJLI) {
            str = "yes";
        } else {
            str = "no";
        }
        laneParams2.plusAssign("is_retry", str);
        laneParams2.plusAssign("is_check_passed", Integer.valueOf(C856703Wj.LIZ(this.LL)));
        laneParams2.plusAssign("api_path", "/api/v1/shop/product_info/get");
        laneParams2.plusAssign("preload_type", Integer.valueOf(this.LLILLL));
        laneParams2.plusAssign("page_name", "product_detail");
        return Unit.LIZ;
    }
}
