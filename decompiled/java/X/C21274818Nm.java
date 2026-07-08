package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21274818Nm extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AnchorProductInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21274818Nm(String str, String str2, int i, AnchorProductInfo anchorProductInfo) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = anchorProductInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String strLJIIIIZZ;
        LaneParams laneParams2 = laneParams;
        laneParams2.put("product_id", this.LL);
        laneParams2.put("seller_id", this.LLILLJJLI);
        laneParams2.put("review_cnt", Integer.valueOf(this.LLILLL));
        AnchorProductInfo anchorProductInfo = this.LLILZ;
        if (anchorProductInfo != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(anchorProductInfo);
        } else {
            strLJIIIIZZ = null;
        }
        laneParams2.put("product_info", strLJIIIIZZ);
        return Unit.LIZ;
    }
}
