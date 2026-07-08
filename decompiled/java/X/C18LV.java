package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS5S3200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18LV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LV extends C09AY implements Function2<C21268418La, PanelVoucherInfo, Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LV(Context context, String str, String str2, String str3, String str4, String str5, Map map) {
        super(2);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = context;
        this.LLIZ = str5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C21268418La c21268418La, PanelVoucherInfo panelVoucherInfo) {
        String str;
        String strLJFF;
        String str2;
        String str3;
        String str4;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map;
        C21268418La c21268418La2 = c21268418La;
        PanelVoucherInfo panelVoucherInfo2 = panelVoucherInfo;
        String voucherState = c21268418La2.getVoucherState();
        if (Intrinsics.LJFF(voucherState, "claim")) {
            String str5 = this.LL.get("btm");
            if (panelVoucherInfo2 != null) {
                str3 = panelVoucherInfo2.voucherTypeId;
            } else {
                str3 = null;
            }
            if (panelVoucherInfo2 != null && (bcmStandardTrack = panelVoucherInfo2.bcmStandardTrack) != null && (map = bcmStandardTrack.trackParam) != null) {
                str4 = map.get("bcm_coupon_id");
            } else {
                str4 = null;
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C18LP(new ClaimVoucherRequest(str3, 16, str4, str5, 3), new C18LW(this.LLILLJJLI, panelVoucherInfo2, this.LLILLL, this.LLILZ, this.LL, this.LLILZLL, this.LLIZ, c21268418La2), new AwS5S3200000_32(this.LLILLJJLI, (String) panelVoucherInfo2, (PanelVoucherInfo) this.LLILLL, this.LLILZ, (String) this.LL, (Map<String, String>) 1), null), 2);
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            String str6 = this.LLILLJJLI;
            String str7 = this.LLILLL;
            String str8 = this.LLILZ;
            Map<String, String> map2 = this.LL;
            c21271918Mj.getClass();
            C21271918Mj.LJIILL(str6, panelVoucherInfo2, "claim_button", str7, str8, map2);
        } else if (Intrinsics.LJFF(voucherState, "use")) {
            C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
            String str9 = this.LLILLJJLI;
            String str10 = this.LLILLL;
            String str11 = this.LLILZ;
            Map<String, String> map3 = this.LL;
            c21271918Mj2.getClass();
            C21271918Mj.LJIILL(str9, panelVoucherInfo2, "use_button", str10, str11, map3);
            C21271918Mj.LJIJ("tiktokec_button_click", panelVoucherInfo2, this.LLILLL, this.LLILZ, this.LL);
            if (Intrinsics.LJFF(this.LLILZIL, "video_anchor")) {
                if (panelVoucherInfo2 != null) {
                    str2 = panelVoucherInfo2.fullVapSchema;
                } else {
                    str2 = null;
                }
                strLJFF = C18LA.LJFF(c21268418La2, str2, "c92278.d2841", null);
            } else {
                if (panelVoucherInfo2 != null) {
                    str = panelVoucherInfo2.fullVapSchema;
                } else {
                    str = null;
                }
                strLJFF = C18LA.LJFF(c21268418La2, str, "c5427.d8786", null);
            }
            C1739800vNK c1739800vNK = C1739800vNK.LIZ;
            Context context = this.LLILZLL;
            String str12 = this.LLILLL;
            String str13 = this.LLILLJJLI;
            c1739800vNK.getClass();
            C1739800vNK.LIZIZ(context, strLJFF, str12, str13);
        }
        return Unit.LIZ;
    }
}
