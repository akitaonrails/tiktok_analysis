package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.PoiCampaignMapAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.PoiCampaignMapAssem$drawMarker$1", f = "PoiCampaignMapAssem.kt", l = {}, m = "invokeSuspend")
public final class C1180860gpo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiCampaignMapAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1180860gpo(PoiCampaignMapAssem poiCampaignMapAssem, boolean z, InterfaceC1364105Vn<? super C1180860gpo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiCampaignMapAssem;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1180860gpo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1180890gpr c1180890gpr;
        C1C7U.LIZ("PoiCampaignMapAssem@d9cf.drawMarker$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1180490gpD c1180490gpDHo = this.LL.Ho();
        if (c1180490gpDHo != null && (c1180890gpr = c1180490gpDHo.LL) != null) {
            boolean z = this.LLILLJJLI;
            PoiCampaignMapAssem poiCampaignMapAssem = this.LL;
            C1180880gpq c1180880gpq = C1180880gpq.LIZ;
            String str = c1180890gpr.LIZ;
            Integer num = c1180890gpr.LJ;
            int iLJJIIZ = C1189060h32.LJJIIZ(Boolean.valueOf(!z));
            Fragment fragmentLJI = C724240Sb0.LJI(poiCampaignMapAssem);
            c1180880gpq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJ(num, "is_poi_publish_new_user");
            C1180880gpq.LIZLLL(c2344009Gk);
            c2344009Gk.LJIIIIZZ("current_page", "my_year_campaign_landing_page");
            c2344009Gk.LIZJ(iLJJIIZ, "is_has_location_tag");
            C1180880gpq.LJ(fragmentLJI, "ttls_my_year_campaign_map_info_show", c2344009Gk.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiCampaignMapAssem@d9cf.drawMarker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
