package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03GS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GS extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054004Ag LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL = "rights_service";
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03GS(C1054004Ag c1054004Ag, Map map, long j, String str) {
        super(1);
        this.LL = c1054004Ag;
        this.LLILLJJLI = map;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.withParamsGroup(this.LL.LIZIZ);
        Map<String, ? extends Object> map = this.LLILLJJLI;
        if (map != null) {
            laneParams2.compareTo(laneParams2, map);
        }
        laneParams2.plusAssign("page_name", this.LLILLL);
        laneParams2.plusAssign("stay_time", Long.valueOf(this.LLILZ));
        laneParams2.plusAssign("quit_type", this.LLILZIL);
        this.LL.LJJJI(laneParams2);
        return Unit.LIZ;
    }
}
