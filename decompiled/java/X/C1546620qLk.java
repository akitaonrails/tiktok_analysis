package X;

import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546620qLk extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ Request LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546620qLk(Request request, int i, long j) {
        super(1);
        this.LL = request;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("url", this.LL.getUrl());
        laneParams2.plusAssign("host", this.LL.getHost());
        laneParams2.plusAssign("path", this.LL.getPath());
        laneParams2.plusAssign("success", Integer.valueOf(this.LLILLJJLI));
        laneParams2.plusAssign("cost_time", Long.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
