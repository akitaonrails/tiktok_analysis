package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746580vYG extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ChangeOrderShippingAddressResponseData LLILLJJLI;
    public final /* synthetic */ AddressEditViewModel LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746580vYG(boolean z, ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData, AddressEditViewModel addressEditViewModel, long j, String str, Integer num) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = changeOrderShippingAddressResponseData;
        this.LLILLL = addressEditViewModel;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object objLJJLIIIJ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        HashMap<String, Object> mapLJIIJ;
        List<Error> list;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("is_success", Integer.valueOf(this.LL ? 1 : 0));
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = this.LLILLJJLI;
        Object obj5 = null;
        if (changeOrderShippingAddressResponseData != null && (list = changeOrderShippingAddressResponseData.errors) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Error> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().key;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            objLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS268S0000000_26.get$arr$(724), 30);
        } else {
            objLJJLIIIJ = null;
        }
        laneParams2.plusAssign("fail_reason", objLJJLIIIJ);
        Object obj6 = CardStruct.IStatusCode.DEFAULT;
        laneParams2.plusAssign("is_with_tip", CardStruct.IStatusCode.DEFAULT);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.LLILLL.LLJJJIL;
        if (addressEditEnterParams != null) {
            obj = addressEditEnterParams.pdpFrom;
        } else {
            obj = null;
        }
        laneParams2.plusAssign("pdp_from", obj);
        laneParams2.plusAssign("update_address_format_select", this.LLILLL.LLLLIL);
        laneParams2.plusAssign("duration", Long.valueOf(this.LLILZ));
        laneParams2.plusAssign("address_result", this.LLILLL.LLJLL);
        laneParams2.plusAssign("is_all_filled", Integer.valueOf(this.LLILLL.AR2()));
        HashMap<String, Object> map = this.LLILLL.LLJJIJIIJIL;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams2.plusAssign("previous_page", obj2);
        laneParams2.plusAssign("fill_type", "edit");
        laneParams2.plusAssign("invalid_reason_code", this.LLILZIL);
        laneParams2.plusAssign("is_valid", Integer.valueOf(this.LL ? 1 : 0));
        laneParams2.plusAssign("err_code", this.LLILZLL);
        if (this.LLILLL.LLLLLIL) {
            obj6 = "1";
        }
        laneParams2.plusAssign("is_fullscreen", obj6);
        if (this.LLILLL.LLLLLIL) {
            obj3 = "full_screen";
        } else {
            obj3 = "seven_screen";
        }
        laneParams2.plusAssign("page_show_type", obj3);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams2 = this.LLILLL.LLJJJIL;
        if (addressEditEnterParams2 != null && (str = addressEditEnterParams2.trackParams) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            obj4 = mapLJIIJ.get("previous_page");
        } else {
            obj4 = null;
        }
        laneParams2.plusAssign("source_previous_page", obj4);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams3 = this.LLILLL.LLJJJIL;
        if (addressEditEnterParams3 != null) {
            obj5 = addressEditEnterParams3.triggerEvent;
        }
        laneParams2.plusAssign("trigger_event", obj5);
        return Unit.LIZ;
    }
}
