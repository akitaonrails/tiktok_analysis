package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746820vYe extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746820vYe(Long l, String str, String str2, String str3, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = l;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("page_name", "suggested_address_list");
        laneParams2.plusAssign("previous_page", this.LL);
        laneParams2.plusAssign("input_box_name", "address");
        laneParams2.plusAssign("input_method", "normal");
        laneParams2.plusAssign("stay_time", this.LLILLJJLI);
        if (this.LLILLL) {
            laneParams2.plusAssign("fill_type", this.LLILZ);
            laneParams2.plusAssign("entrance_info", this.LLILZIL);
            laneParams2.plusAssign("trigger_event", "click_map_pin");
            laneParams2.withNotCheckParam("address_authorization_type", C1745180vW0.LIZJ());
        }
        return Unit.LIZ;
    }
}
