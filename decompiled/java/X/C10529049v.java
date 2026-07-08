package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import java.util.Map;
import kotlin.jvm.internal.AwS1S2400000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.049v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10529049v {
    public static boolean LIZ(TryOnData tryOnData, SaleProp saleProp) {
        if (tryOnData != null && Intrinsics.LJFF(tryOnData.skuEntryPropId, saleProp.propId) && C047J.LIZ() && C703302op.LIZ(tryOnData.skuPropertyEntryText)) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(Map map, String str, PdpViewModel pdpViewModel, Map map2, Map map3, int i) {
        C1054004Ag c1054004Ag;
        Map map4 = map2;
        PdpViewModel pdpViewModel2 = pdpViewModel;
        Map map5 = null;
        if ((i & 8) != 0) {
            pdpViewModel2 = null;
        }
        if ((i & 16) != 0) {
            if (pdpViewModel2 != null && (c1054004Ag = pdpViewModel2.LLJLILLLLZIIL) != null) {
                map4 = c1054004Ag.LIZIZ;
            } else {
                map4 = null;
            }
        }
        if ((i & 32) == 0) {
            map5 = map3;
        }
        C1018703yb.LIZLLL("tiktokec_button_show", new AwS1S2400000_1(pdpViewModel2, str, map4, map, map5, 0));
    }
}
