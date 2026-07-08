package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C954503oF extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954503oF(String str, boolean z, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("module_name", "sku");
        laneParams2.plusAssign("module_show_type", this.LL);
        if (this.LLILLJJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("is_single_sku", str);
        laneParams2.plusAssign("rd_pdp_monitor_version", "v4190");
        laneParams2.plusAssign("checkout_type", "normal_checkout");
        laneParams2.plusAssign("sku_id", this.LLILLL);
        return Unit.LIZ;
    }
}
