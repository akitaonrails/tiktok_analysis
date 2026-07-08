package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750840vf8 extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL = "icon";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750840vf8(C1054104Ah c1054104Ah, Map map, String str, int i, boolean z) {
        super(1);
        this.LL = c1054104Ah;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        LaneParams laneParams2 = laneParams;
        laneParams2.withParamsGroup(this.LL.LIZIZ);
        laneParams2.withParamsGroup(this.LLILLJJLI);
        C1010603xI.LIZJ(laneParams2, this.LLILLL);
        laneParams2.plusAssign("notice_number", Integer.valueOf(this.LLILZ));
        if (this.LLILZIL) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams2.plusAssign("page_show_type", str);
        laneParams2.plusAssign("cart_entrance", this.LLILZLL);
        return Unit.LIZ;
    }
}
