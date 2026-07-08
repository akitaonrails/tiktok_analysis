package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745500vWW extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ HashMap<String, Object> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1745480vWU LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745500vWW(String str, HashMap<String, Object> map, boolean z, String str2, C1745480vWU c1745480vWU, Map<String, ? extends Object> map2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = c1745480vWU;
        this.LLILZLL = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        Object obj2;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("page_name", "shipping_address");
        String str = this.LL;
        if (str == null) {
            str = "allow_tt_access_location";
        }
        laneParams2.plusAssign("popup_name", str);
        HashMap<String, Object> map = this.LLILLJJLI;
        if (map != null) {
            obj = map.get("previous_page");
        } else {
            obj = null;
        }
        laneParams2.plusAssign("previous_page", obj);
        String str2 = "allow";
        if (this.LLILLL) {
            obj2 = "allow";
        } else {
            obj2 = "no_allow";
        }
        laneParams2.plusAssign("action_type", obj2);
        String str3 = this.LLILZ;
        if (str3 != null) {
            laneParams2.withNotCheckParam("module_name", str3);
        }
        laneParams2.withNotCheckParam("fill_type", this.LLILZIL.LIZ.LLLLL.type());
        Map<String, ? extends Object> map2 = this.LLILZLL;
        if (map2 != null) {
            laneParams2.withNotCheckParams(map2);
        }
        if (!this.LLILLL) {
            str2 = "no_allow";
        }
        laneParams2.withNotCheckParam("click_area", str2);
        return Unit.LIZ;
    }
}
