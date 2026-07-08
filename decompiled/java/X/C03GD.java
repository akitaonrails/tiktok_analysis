package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03GD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GD extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ DeliveryPanelState LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03GD(DeliveryPanelState deliveryPanelState, Integer num, String str, String str2, String str3, String str4, Map map, Map map2, boolean z) {
        super(1);
        this.LL = deliveryPanelState;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = num;
        this.LLILZLL = str3;
        this.LLIZ = map;
        this.LLIZLLLIL = map2;
        this.LLJ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String string;
        String string2;
        Integer num;
        LogisticTextDTO logisticTextDTO;
        String str;
        Price price;
        String currency;
        Price price2;
        String priceVal;
        Float fLJIIIIZZ;
        C957403oi c957403oi2 = c957403oi;
        List<Object> logisticList = this.LL.getLogisticList();
        int i = 1;
        int iIntValue = 0;
        if (logisticList != null && !logisticList.isEmpty()) {
            Iterator<Object> it2 = logisticList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next instanceof LogisticDTO) {
                    Map<String, String> map = ((LogisticDTO) next).eventTrackInfo;
                    if (map != null) {
                        C03FA.LIZIZ.putAll(map);
                    }
                }
            }
        }
        Set<String> set = C03FA.LIZ;
        c957403oi2.LJ(C03FA.LIZIZ);
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            c957403oi2.LIZJ("sub_page_name", str2);
        }
        String strLIZ = C03FA.LIZ(this.LL.getLogistics());
        if (strLIZ != null) {
            c957403oi2.LIZJ("delivery_info", strLIZ);
        }
        String strLIZJ = C03FA.LIZJ(this.LL.getSelectedLogistic(), this.LL.getLogistics());
        if (strLIZJ != null) {
            c957403oi2.LIZJ("ship_from", strLIZJ);
        }
        String str3 = this.LLILLL;
        if (str3 != null) {
            c957403oi2.LIZJ("delivery_flag", str3);
        }
        c957403oi2.LIZJ("is_fullscreen", 0);
        c957403oi2.LIZJ("is_delivery_info_complete", Integer.valueOf(this.LLILZ ? 1 : 0));
        if (this.LLILZ) {
            if (this.LL.getSelectedLogistic() == null) {
                i = 0;
            }
            c957403oi2.LIZJ("is_address_deliverable", Integer.valueOf(i));
        }
        LogisticDTO selectedLogistic = this.LL.getSelectedLogistic();
        if (selectedLogistic != null && (price2 = selectedLogistic.shippingFee) != null && (priceVal = price2.getPriceVal()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal)) != null) {
            c957403oi2.LIZJ("shipping_price", Float.valueOf(fLJIIIIZZ.floatValue()));
        }
        LogisticDTO selectedLogistic2 = this.LL.getSelectedLogistic();
        if (selectedLogistic2 != null && (price = selectedLogistic2.shippingFee) != null && (currency = price.getCurrency()) != null) {
            c957403oi2.LIZJ("shipping_currency", currency);
        }
        LogisticDTO selectedLogistic3 = this.LL.getSelectedLogistic();
        if (selectedLogistic3 != null && (logisticTextDTO = selectedLogistic3.logisticText) != null && (str = logisticTextDTO.thresholdTextEn) != null) {
            c957403oi2.LIZJ("free_shipping_condition", str);
        }
        LogisticDTO selectedLogistic4 = this.LL.getSelectedLogistic();
        if (selectedLogistic4 != null && (num = selectedLogistic4.deliveryOption) != null) {
            iIntValue = num.intValue();
        }
        c957403oi2.LIZJ("delivery_option", Integer.valueOf(iIntValue));
        Integer num2 = this.LLILZIL;
        if (num2 != null) {
            c957403oi2.LIZJ("preorder_shipdays", Integer.valueOf(num2.intValue()));
        }
        String str4 = this.LLILZLL;
        if (str4 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi2.LIZLLL("is_next_day_delivery", str4);
        Map<String, Object> map2 = this.LLIZ;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string2 = value.toString()) == null) {
                    string2 = "";
                }
                c957403oi2.LIZLLL(key, string2);
            }
        }
        Map<String, Object> map3 = this.LLIZLLLIL;
        if (map3 != null) {
            for (Map.Entry<String, Object> entry2 : map3.entrySet()) {
                String key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 == null || (string = value2.toString()) == null) {
                    string = "";
                }
                c957403oi2.LIZLLL(key2, string);
            }
        }
        String str5 = this.LLJ;
        if (str5 != null) {
            c957403oi2.LIZJ("enter_method", str5);
        }
        return Unit.LIZ;
    }
}
