package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04GL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GL extends C09AY implements Function0<Map<String, ? extends Object>> {
    public final /* synthetic */ SeaSkuBaseCell<AbstractC756202xM> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GL(SeaSkuBaseCell<AbstractC756202xM> seaSkuBaseCell, String str, int i, int i2) {
        super(0);
        this.LL = seaSkuBaseCell;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Object> invoke() {
        Map<String, Object> mapLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SeaSkuBaseCell<AbstractC756202xM> seaSkuBaseCell = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        C908703gr c908703gr = seaSkuBaseCell.R5().LLJILJILJ;
        if (c908703gr != null && (mapLIZIZ = c908703gr.LIZIZ()) != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("module_name", "sku");
        linkedHashMap.put("select_type", str);
        linkedHashMap.put("button_name", seaSkuBaseCell.R5().yQ2(i));
        linkedHashMap.put("product_id", seaSkuBaseCell.R5().getProductId());
        linkedHashMap.putAll(seaSkuBaseCell.R5().AQ2(i, i2));
        C908703gr c908703gr2 = seaSkuBaseCell.R5().LLJILJILJ;
        C038N.LIZ(linkedHashMap, c908703gr2 != null ? c908703gr2.LIZ("c14181.d0") : null);
        return linkedHashMap;
    }
}
