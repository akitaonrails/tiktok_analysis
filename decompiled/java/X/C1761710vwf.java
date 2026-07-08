package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761710vwf extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1054004Ag LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761710vwf(String str, boolean z, C1054004Ag c1054004Ag, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c1054004Ag;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("page_name", "picture_detail");
        laneParams2.plusAssign("module_name", "head_pic");
        laneParams2.plusAssign("total_rank", this.LL);
        if (this.LLILLJJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("is_video", str);
        laneParams2.withParamsGroup(this.LLILLL.LIZIZ);
        C1010603xI.LIZJ(laneParams2, this.LLILZ);
        return Unit.LIZ;
    }
}
