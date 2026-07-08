package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS57S1300000_18;
import kotlin.jvm.internal.AwS6S2400000_18;

/* JADX INFO: renamed from: X.0ghj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175850ghj {
    public static final C1175850ghj LIZ = new C1175850ghj();

    public static void LIZ(Context context, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String name;
        try {
            C1367960lha.LIZ.getClass();
            IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
            String address = null;
            if (poiDetailResponse != null) {
                name = poiDetailResponse.getName();
                address = poiDetailResponse.getAddress();
            } else {
                name = null;
            }
            C20145813s8.LIZ("copy_address", iPoiServiceLIZ.LJLI(name, address), context, CertProviderManagerKt.findCert("bpea-571", 1476399106));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(Context context, LifecycleOwner lifecycleOwner, PoiListApi.PoiDetailResponse poiDetailResponse, Float f, String str, String str2, PageFinder pageFinder) {
        FragmentManager fragmentManagerLJJI;
        if (context == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LIZ.getClass();
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().LJI(context)) {
            C1185430gxB.LIZ.getClass();
            C1185430gxB.LJIL(pageFinder, str2, str);
        } else if (poiDetailResponse != null) {
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZ = context.getResources().getString(2131844800);
            c1247530iZL.LIZJ(R.raw.icon_arrow_up_right_ltr);
            c1247530iZL.LIZJ = 0;
            c1247530iZL.LIZ(new AwS6S2400000_18(context, poiDetailResponse, f, str2, str, pageFinder, 5));
            arrayList.add(c1247530iZL);
        }
        C1247530iZL c1247530iZL2 = new C1247530iZL();
        c1247530iZL2.LIZ = context.getResources().getString(2131844787);
        c1247530iZL2.LIZJ(R.raw.icon_doc_on_doc);
        c1247530iZL2.LIZJ = 0;
        c1247530iZL2.LIZ(new AwS57S1300000_18(context, poiDetailResponse, str, pageFinder, 10));
        arrayList.add(c1247530iZL2);
        C19EG c19egLIZ = C724240Sb0.LIZ(lifecycleOwner);
        if (c19egLIZ != null && (fragmentManagerLJJI = SAFExtensionKt.LJJI(c19egLIZ)) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LIZ.LLJJIJI = context.getResources().getString(2131844788);
            c1390850mIV.LJFF(arrayList);
            c1390850mIV.LIZJ().show(fragmentManagerLJJI, "map");
        }
    }
}
