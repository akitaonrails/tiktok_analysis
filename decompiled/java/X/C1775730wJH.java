package X;

import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775730wJH extends LynxViewClient {
    public final int $t;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        if (this.$t != 0) {
            super.LJJIIZ(str, map, map2);
        } else {
            LJJIIZ$0(this, str, map, map2);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, Object> map) {
        switch (this.$t) {
            case 1:
                C1326490kch.LJI("PdpLynxCardHolder, onTimingSetup");
                break;
            case 2:
                C1326490kch.LJI("PdpLynxCardHolder, onTimingSetup");
                break;
            default:
                super.onTimingSetup(map);
                break;
        }
    }

    public C1775730wJH(int i) {
        this.$t = i;
    }

    public static final void LJJIIZ$0(C1775730wJH c1775730wJH, String str, Map map, Map map2) {
        if (Intrinsics.LJFF(str, "_update_timing_from_server")) {
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).prefetchPdpResource("", C786410Ut5.M3(C7879035x.LIZ()), 10, true, null);
        }
    }
}
