package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03GE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GE extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL = "shipping";
    public final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ Float LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Map<String, Object> LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03GE(int i, long j, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, Float f, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = z2;
        this.LLIZ = packedDeliverySelectResult;
        this.LLIZLLLIL = z3;
        this.LLJ = num;
        this.LLJI = f;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        this.LLJILLL = map;
        this.LLJJ = str5;
        this.LLJJI = str6;
        this.LLJJIII = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        Integer num;
        String string;
        C957403oi c957403oi2 = c957403oi;
        Set<String> set = C03FA.LIZ;
        c957403oi2.LJ(C03FA.LIZIZ);
        c957403oi2.LIZLLL("stay_time", Long.valueOf(this.LL));
        c957403oi2.LIZJ("address_num", Integer.valueOf(this.LLILLJJLI));
        c957403oi2.LIZJ("is_fullscreen", 0);
        c957403oi2.LIZJ("is_delivery_info_complete", Integer.valueOf(this.LLILLL ? 1 : 0));
        c957403oi2.LIZJ("quit_type", this.LLILZ);
        if (this.LLILLL) {
            c957403oi2.LIZJ("is_address_deliverable", Integer.valueOf(this.LLILZIL ? 1 : 0));
        }
        String str = this.LLILZLL;
        if (str != null) {
            c957403oi2.LIZJ("sub_page_name", str);
        }
        String strLIZ = C03FA.LIZ(this.LLIZ.logistics);
        if (strLIZ != null) {
            c957403oi2.LIZJ("delivery_info", strLIZ);
        }
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LLIZ;
        String strLIZJ = C03FA.LIZJ(packedDeliverySelectResult.selectedLogistic, packedDeliverySelectResult.logistics);
        if (strLIZJ != null) {
            c957403oi2.LIZJ("ship_from", strLIZJ);
        }
        c957403oi2.LIZJ("is_load_data", Integer.valueOf(this.LLIZLLLIL ? 1 : 0));
        LogisticDTO logisticDTO = this.LLIZ.selectedLogistic;
        if ((logisticDTO != null && (num = logisticDTO.deliveryOption) != null) || (num = this.LLJ) != null) {
            c957403oi2.LIZJ("delivery_option", num);
        }
        Float f = this.LLJI;
        if (f != null) {
            c957403oi2.LIZJ("shipping_price", f);
        }
        String str2 = this.LLJIJIL;
        if (str2 != null) {
            c957403oi2.LIZJ("shipping_currency", str2);
        }
        String str3 = this.LLJILJIL;
        if (str3 != null) {
            c957403oi2.LIZJ("free_shipping_condition", str3);
        }
        String str4 = this.LLJILJILJ;
        if (str4 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi2.LIZJ("is_next_day_delivery", str4);
        Map<String, Object> map = this.LLJILLL;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                c957403oi2.LIZLLL(key, string);
            }
        }
        String str5 = this.LLJJ;
        if (str5 != null) {
            c957403oi2.LIZLLL("delivery_flag", str5);
        }
        String str6 = this.LLJJI;
        if (str6 != null) {
            c957403oi2.LIZLLL("enter_method", str6);
        }
        String str7 = this.LLJJIII;
        if (str7 != null) {
            c957403oi2.LIZLLL("quit_previous_path", str7);
        }
        return Unit.LIZ;
    }
}
