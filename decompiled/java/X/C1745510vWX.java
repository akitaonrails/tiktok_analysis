package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vWX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745510vWX extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1745480vWU LL;
    public final /* synthetic */ HashMap<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745510vWX(C1745480vWU c1745480vWU, HashMap<String, Object> map, String str, boolean z, boolean z2, String str2) {
        super(1);
        this.LL = c1745480vWU;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("page_name", this.LL.LIZ.getPageName());
        HashMap<String, Object> map = this.LLILLJJLI;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("previous_page");
        } else {
            obj = null;
        }
        laneParams2.plusAssign("previous_page", obj);
        HashMap<String, Object> map2 = this.LLILLJJLI;
        if (map2 != null) {
            obj2 = map2.get("entrance_info");
        }
        laneParams2.plusAssign("entrance_info", obj2);
        laneParams2.plusAssign("fill_type", this.LL.LIZ.LLLLL.type());
        laneParams2.plusAssign("input_box_name", this.LLILLL);
        C0OFE.LIZ("is_fullscreen", Integer.valueOf(this.LL.LIZ.LLLLLIL ? 1 : 0));
        C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
        String str = this.LLILLL;
        c1746460vY4.getClass();
        laneParams2.plusAssign("has_auto_input", Integer.valueOf(C13LP.LJJJJ(str, C1746460vY4.LIZJ) ? 1 : 0));
        laneParams2.plusAssign("has_normal_input", 1);
        laneParams2.plusAssign("is_success", Integer.valueOf(this.LLILZ ? 1 : 0));
        laneParams2.plusAssign("is_same_auto", Integer.valueOf(this.LLILZIL ? 1 : 0));
        String str2 = this.LLILZLL;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams2.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }
}
