package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744800vVO extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744800vVO(String str, String str2, String str3, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = map;
        this.LLILZIL = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("popup_name", this.LL);
        laneParams2.plusAssign("page_name", "shipping_address");
        laneParams2.plusAssign("action_type", this.LLILLJJLI);
        String str = this.LLILLL;
        if (str != null) {
            laneParams2.plusAssign("popup_for", str);
        }
        for (Map.Entry<String, Object> entry : this.LLILZ.entrySet()) {
            laneParams2.plusAssign(entry.getKey(), entry.getValue());
        }
        Map<String, Object> map = this.LLILZIL;
        if (map != null) {
            laneParams2.putAll(map);
        }
        return Unit.LIZ;
    }
}
