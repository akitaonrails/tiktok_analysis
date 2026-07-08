package X;

import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18LR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LR extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PanelVoucherInfo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ HashMap<String, Object> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LR(String str, String str2, PanelVoucherInfo panelVoucherInfo, String str3, HashMap<String, Object> map, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = panelVoucherInfo;
        this.LLILZ = str3;
        this.LLILZIL = map;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str3 = this.LL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("enter_from", str3);
        c957403oi2.LIZLLL("source_page_type", "video");
        String str5 = this.LLILLJJLI;
        if (str5 == null) {
            str5 = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("entrance_form", str5);
        c957403oi2.LIZLLL("page_name", "video");
        c957403oi2.LIZLLL("previous_page", "video");
        c957403oi2.LIZLLL("coupon_zone", "video_multi_anchor_top");
        PanelVoucherInfo panelVoucherInfo = this.LLILLL;
        if (panelVoucherInfo == null || (str = panelVoucherInfo.voucherId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("coupon_id", str);
        PanelVoucherInfo panelVoucherInfo2 = this.LLILLL;
        if (panelVoucherInfo2 != null && (str2 = panelVoucherInfo2.voucherTypeId) != null) {
            str4 = str2;
        }
        c957403oi2.LIZLLL("coupon_type_id", str4);
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(this.LLILZ);
        if (mapLJIIJ != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        HashMap<String, Object> map2 = this.LLILZIL;
        if (map2 != null) {
            c957403oi2.LJ(map2);
        }
        PanelVoucherInfo panelVoucherInfo3 = this.LLILLL;
        if (panelVoucherInfo3 != null && (bcmStandardTrack = panelVoucherInfo3.bcmStandardTrack) != null && (map = bcmStandardTrack.trackParam) != null) {
            c957403oi2.LJ(map);
        }
        C18LI c18li = C18LI.LIZ;
        String str6 = this.LLILZLL;
        c18li.getClass();
        c957403oi2.LJ(C18LI.LIZLLL(str6));
        return Unit.LIZ;
    }
}
