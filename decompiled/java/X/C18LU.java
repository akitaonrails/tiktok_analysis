package X;

import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18LU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LU extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ PanelVoucherInfo LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ HashMap<String, Object> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LU(String str, String str2, long j, PanelVoucherInfo panelVoucherInfo, String str3, HashMap<String, Object> map, String str4, Map<String, String> map2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = panelVoucherInfo;
        this.LLILZIL = str3;
        this.LLILZLL = map;
        this.LLIZ = str4;
        this.LLIZLLLIL = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map;
        String str;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str2 = this.LL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c957403oi2.LIZLLL("enter_from", str2);
        c957403oi2.LIZLLL("source_page_type", "video");
        String str4 = this.LLILLJJLI;
        if (str4 == null) {
            str4 = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("entrance_form", str4);
        c957403oi2.LIZLLL("page_name", "video");
        c957403oi2.LIZLLL("previous_page", "video");
        c957403oi2.LIZLLL("coupon_zone", "video_multi_anchor_top");
        c957403oi2.LIZLLL("coupon_id", Long.valueOf(this.LLILLL));
        PanelVoucherInfo panelVoucherInfo = this.LLILZ;
        if (panelVoucherInfo != null && (str = panelVoucherInfo.voucherTypeId) != null) {
            str3 = str;
        }
        c957403oi2.LIZLLL("coupon_type_id", str3);
        c957403oi2.LIZLLL("click_area", this.LLILZIL);
        C1739800vNK c1739800vNK = C1739800vNK.LIZ;
        PanelVoucherInfo panelVoucherInfo2 = this.LLILZ;
        c1739800vNK.getClass();
        long jLIZ = C1739800vNK.LIZ(panelVoucherInfo2);
        int i = 1;
        if (jLIZ > 0) {
            i = 2;
        }
        c957403oi2.LIZLLL("is_coupon_available", Integer.valueOf(i));
        HashMap<String, Object> map2 = this.LLILZLL;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        PanelVoucherInfo panelVoucherInfo3 = this.LLILZ;
        if (panelVoucherInfo3 != null && (bcmStandardTrack = panelVoucherInfo3.bcmStandardTrack) != null && (map = bcmStandardTrack.trackParam) != null) {
            c957403oi2.LJ(map);
        }
        C18LI c18li = C18LI.LIZ;
        String str5 = this.LLIZ;
        c18li.getClass();
        c957403oi2.LJ(C18LI.LIZLLL(str5));
        c957403oi2.LJ(this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
