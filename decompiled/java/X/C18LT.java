package X;

import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18LT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LT extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ PanelVoucherInfo LLILZ;
    public final /* synthetic */ HashMap<String, Object> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LT(String str, String str2, long j, PanelVoucherInfo panelVoucherInfo, HashMap<String, Object> map, String str3, Map<String, String> map2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = panelVoucherInfo;
        this.LLILZIL = map;
        this.LLILZLL = str3;
        this.LLIZ = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        Map<String, String> map;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("enter_from", str);
        c957403oi2.LIZLLL("source_page_type", "video");
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("entrance_form", str3);
        c957403oi2.LIZLLL("page_name", "video");
        c957403oi2.LIZLLL("previous_page", "video");
        c957403oi2.LIZLLL("coupon_zone", "video_multi_anchor_top");
        c957403oi2.LIZLLL("coupon_id", Long.valueOf(this.LLILLL));
        String str4 = this.LLILZ.voucherTypeId;
        if (str4 != null) {
            str2 = str4;
        }
        c957403oi2.LIZLLL("coupon_type_id", str2);
        C1739800vNK c1739800vNK = C1739800vNK.LIZ;
        PanelVoucherInfo panelVoucherInfo = this.LLILZ;
        c1739800vNK.getClass();
        long jLIZ = C1739800vNK.LIZ(panelVoucherInfo);
        int i = 1;
        if (jLIZ > 0) {
            i = 2;
        }
        c957403oi2.LIZLLL("is_coupon_available", Integer.valueOf(i));
        HashMap<String, Object> map2 = this.LLILZIL;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        BcmStandardTrack bcmStandardTrack = this.LLILZ.bcmStandardTrack;
        if (bcmStandardTrack != null && (map = bcmStandardTrack.trackParam) != null) {
            c957403oi2.LJ(map);
        }
        C18LI c18li = C18LI.LIZ;
        String str5 = this.LLILZLL;
        c18li.getClass();
        c957403oi2.LJ(C18LI.LIZLLL(str5));
        c957403oi2.LJ(this.LLIZ);
        return Unit.LIZ;
    }
}
