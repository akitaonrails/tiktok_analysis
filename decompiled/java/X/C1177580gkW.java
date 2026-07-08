package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177580gkW extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ PoiRevisitFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177580gkW(PoiRevisitFragment poiRevisitFragment, String str, String str2, Context context, String str3, String str4) {
        super(1);
        this.LL = poiRevisitFragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = context;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.VR().LLJ;
        IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility = null;
        if (interfaceC665370Q7z != null) {
            iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitNavAssemAbility.class, null);
        }
        C1177570gkV c1177570gkV = C1177570gkV.LIZ;
        PoiRevisitFragment poiRevisitFragment = this.LL;
        c1177570gkV.getClass();
        String strLIZ = C1177570gkV.LIZ(iPoiRevisitNavAssemAbility);
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        if (Intrinsics.LJFF(str2, "Others")) {
            str2 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        c2344009Gk.LJFF("enable_location", C1177570gkV.LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", strLIZ);
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str);
        C1189060h32.LJIJJLI(c2344009Gk, "local_service_key_category", str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via((Fragment) poiRevisitFragment));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("copy_address", map, c1185050gwZ);
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(view2, C343970De7.LIZ);
        PoiRevisitFragment poiRevisitFragment2 = this.LL;
        Context context = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        try {
            poiRevisitFragment2.getClass();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJI(C20642515q3.LIZJ(R.color.f570cs));
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            }
            try {
                C1367960lha.LIZ.getClass();
                C20145813s8.LIZ("copy_address", C1367960lha.LIZ().LJLI(str4, str5), context, CertProviderManagerKt.findCert("bpea-571", 1476399106));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        return Unit.LIZ;
    }
}
