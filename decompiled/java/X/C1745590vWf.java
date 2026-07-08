package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745590vWf extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ AddressEditViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1745540vWa LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745590vWf(AddressEditViewModel addressEditViewModel, String str, C1745540vWa c1745540vWa, C118300cf c118300cf, int i, int i2) {
        super(1);
        this.LL = addressEditViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = c1745540vWa;
        this.LLILZ = c118300cf;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        LaneParams laneParams2 = laneParams;
        HashMap<String, Object> map = this.LL.LLJJIJIIJIL;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("previous_page");
        } else {
            obj = null;
        }
        laneParams2.plusAssign("previous_page", obj);
        laneParams2.plusAssign("is_fullscreen", Integer.valueOf(this.LL.LLLLLIL ? 1 : 0));
        laneParams2.plusAssign("fill_type", this.LL.LLLLL.type());
        laneParams2.plusAssign("page_name", this.LL.getPageName());
        HashMap<String, Object> map2 = this.LL.LLJJIJIIJIL;
        if (map2 != null) {
            obj2 = map2.get("entrance_info");
        }
        laneParams2.plusAssign("entrance_info", obj2);
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        laneParams2.plusAssign("drop_down_list_name", str);
        laneParams2.plusAssign("drop_down_list_current_level", Integer.valueOf(this.LLILLL.LIZ));
        laneParams2.plusAssign("drop_down_list_is_last_level", Integer.valueOf(this.LLILZ.element));
        laneParams2.plusAssign("item_num", Integer.valueOf(this.LLILZIL));
        laneParams2.plusAssign("action_type", "click");
        laneParams2.plusAssign("rank", Integer.valueOf(this.LLILZLL));
        return Unit.LIZ;
    }
}
