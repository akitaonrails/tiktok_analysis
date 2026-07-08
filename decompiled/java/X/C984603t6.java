package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C984603t6 extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C984403t4 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C984603t6(C984403t4 c984403t4, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = c984403t4;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams2 = laneParams;
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = this.LL.LIZ.LLJ;
        if (enterParamForProductDetailPage != null && (str = enterParamForProductDetailPage.trackParams) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            mapLJIIJ.putAll(mapLJIIJ);
        }
        laneParams2.plusAssign("page_name", "logistics");
        laneParams2.plusAssign("sub_page_name", "choose_your_location");
        laneParams2.plusAssign("previous_page", "logistics");
        laneParams2.plusAssign("input_box_name", "zipcode");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL.getClass();
        laneParams2.plusAssign("stay_time", Long.valueOf(jCurrentTimeMillis - 0));
        laneParams2.plusAssign("input_method", this.LL.LIZLLL);
        laneParams2.plusAssign("has_normal_input", String.valueOf(this.LL.LJFF ? 1 : 0));
        laneParams2.plusAssign("has_auto_input", String.valueOf(this.LLILLJJLI ? 1 : 0));
        laneParams2.plusAssign("has_sug_input", String.valueOf(this.LLILLL ? 1 : 0));
        laneParams2.plusAssign("is_valid", String.valueOf(this.LLILZ ? 1 : 0));
        return Unit.LIZ;
    }
}
