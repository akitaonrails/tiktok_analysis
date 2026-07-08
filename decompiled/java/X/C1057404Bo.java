package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057404Bo extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054004Ag LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057404Bo(C1054004Ag c1054004Ag, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = c1054004Ag;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        String str2;
        LaneParams laneParams2 = laneParams;
        laneParams2.withParamsGroup(this.LL.LIZIZ);
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1010603xI.LIZ(this.LLILLJJLI);
        if (linkedHashMap.get("module_type") == null && (str2 = this.LLILLL) != null) {
            laneParams2.plusAssign("module_type", str2);
        }
        if (linkedHashMap.get("module_name") == null && (str = this.LLILZ) != null) {
            laneParams2.plusAssign("module_name", str);
        }
        if (this.LLILZIL != null) {
            laneParams2.plusAssign("entrance_zone", "add_on_layer");
        }
        laneParams2.plusAssign("click_area", this.LLILZLL);
        C1010603xI.LIZJ(laneParams2, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
