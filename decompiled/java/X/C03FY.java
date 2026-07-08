package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03FY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FY extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ HashMap<String, Object> LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03FY(C1054104Ah c1054104Ah, String str, String str2, String str3, HashMap<String, Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        super(1);
        this.LL = c1054104Ah;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = map;
        this.LLILZLL = map2;
        this.LLIZ = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.withParamsGroup(this.LL.LIZIZ);
        laneParams2.plusAssign("button_name", this.LLILLJJLI);
        laneParams2.plusAssign("sku_id", this.LLILLL);
        laneParams2.withParamsGroup(this.LL.LJIIJ(this.LLILLL));
        laneParams2.plusAssign("page_name", this.LLILZ);
        HashMap<String, Object> map = this.LLILZIL;
        if (map != null) {
            laneParams2.withParamsGroup(map);
        }
        Map<String, ? extends Object> map2 = this.LLILZLL;
        if (map2 != null) {
            laneParams2.withParamsGroup(map2);
        }
        Map<String, Object> map3 = this.LLIZ;
        if (map3 != null) {
            laneParams2.putAll(map3);
        }
        return Unit.LIZ;
    }
}
