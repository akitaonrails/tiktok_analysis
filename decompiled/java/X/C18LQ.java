package X;

import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LQ extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PanelVoucherInfo LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ HashMap<String, Object> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LQ(String str, String str2, String str3, String str4, PanelVoucherInfo panelVoucherInfo, String str5, HashMap<String, Object> map, String str6, Map<String, String> map2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = panelVoucherInfo;
        this.LLILZLL = str5;
        this.LLIZ = map;
        this.LLIZLLLIL = str6;
        this.LLJ = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        String str2;
        boolean z;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str3 = this.LL;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("enter_from", str3);
        c957403oi2.LIZLLL("source_page_type", "video");
        String str4 = this.LLILLJJLI;
        if (str4 == null) {
            str4 = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("entrance_form", str4);
        c957403oi2.LIZLLL("page_name", "video");
        c957403oi2.LIZLLL("previous_page", "video");
        c957403oi2.LIZLLL("coupon_zone", this.LLILLL);
        String str5 = this.LLILZ;
        if (str5 != null) {
            c957403oi2.LIZLLL("coupon_get_method", str5);
        }
        PanelVoucherInfo panelVoucherInfo = this.LLILZIL;
        if (panelVoucherInfo == null || (str = panelVoucherInfo.voucherId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("coupon_id", str);
        PanelVoucherInfo panelVoucherInfo2 = this.LLILZIL;
        if (panelVoucherInfo2 == null || (str2 = panelVoucherInfo2.voucherTypeId) == null) {
            str2 = "";
        }
        c957403oi2.LIZLLL("coupon_type_id", str2);
        String str6 = this.LLILZLL;
        if (str6 != null && str6.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c957403oi2.LIZLLL("is_success", 1);
            c957403oi2.LIZLLL("fail_reason", "");
        } else {
            c957403oi2.LIZLLL("is_success", 0);
            c957403oi2.LIZLLL("fail_reason", this.LLILZLL);
        }
        HashMap<String, Object> map2 = this.LLIZ;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        PanelVoucherInfo panelVoucherInfo3 = this.LLILZIL;
        if (panelVoucherInfo3 != null && (bcmStandardTrack = panelVoucherInfo3.bcmStandardTrack) != null && (map = bcmStandardTrack.trackParam) != null) {
            c957403oi2.LJ(map);
        }
        C18LI c18li = C18LI.LIZ;
        String str7 = this.LLIZLLLIL;
        c18li.getClass();
        c957403oi2.LJ(C18LI.LIZLLL(str7));
        Map<String, String> map3 = this.LLJ;
        if (map3 != null) {
            c957403oi2.LJ(map3);
        }
        return Unit.LIZ;
    }
}
