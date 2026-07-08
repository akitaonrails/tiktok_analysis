package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746830vYf extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746830vYf(Integer num, Long l, String str, String str2, String str3, String str4, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = num;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = l;
        this.LLILZLL = z;
        this.LLIZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("page_name", "suggested_address_list");
        laneParams2.plusAssign("previous_page", this.LL);
        laneParams2.plusAssign("is_load_data", this.LLILLJJLI);
        laneParams2.plusAssign("entrance_info", this.LLILLL);
        laneParams2.plusAssign("quit_type", this.LLILZ);
        laneParams2.plusAssign("stay_time", this.LLILZIL);
        if (this.LLILZLL) {
            laneParams2.plusAssign("fill_type", this.LLIZ);
            laneParams2.plusAssign("trigger_event", "click_map_pin");
            laneParams2.withNotCheckParam("address_authorization_type", C1745180vW0.LIZJ());
        }
        return Unit.LIZ;
    }
}
