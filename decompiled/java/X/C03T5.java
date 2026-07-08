package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03T5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03T5 {
    public static final C03T5 LIZ = new C03T5();

    public static String LIZIZ() {
        IECommerceHostService iECommerceHostService;
        boolean z = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Object objLIZ = C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LIZ("ec_localized_size_info_key");
        String string = objLIZ != null ? objLIZ.toString() : null;
        try {
            if (string == null) {
                string = "{}";
            }
            String strOptString = new JSONObject(string).optString("ec_localized_size_identifier");
            if (strOptString != null) {
                if (!a0.LJJJIL(strOptString)) {
                    z = false;
                }
            }
            if (z) {
                return null;
            }
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ProductPackStruct LIZ(ProductPackStruct productPackStruct, boolean z) {
        StandardSaleProps standardSaleProps;
        String strLIZIZ;
        Map<String, SaleProp> map;
        SaleProp saleProp;
        List<SaleProp> list;
        if (productPackStruct == null || (standardSaleProps = productPackStruct.localSizeSaleProp) == null || ((((strLIZIZ = LIZIZ()) == null || a0.LJJJIL(strLIZIZ)) && (strLIZIZ = standardSaleProps.defaultStandardSign) == null) || a0.LJJJIL(strLIZIZ) || (map = standardSaleProps.standardSaleProp) == null || (saleProp = map.get(strLIZIZ)) == null || (list = productPackStruct.saleProps) == null)) {
            return productPackStruct;
        }
        ArrayList<SaleProp> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (SaleProp salePropLJ : arrayList) {
            if (Intrinsics.LJFF(salePropLJ.propId, saleProp.propId)) {
                if (z) {
                    salePropLJ = salePropLJ.LJ(saleProp);
                } else {
                    salePropLJ = saleProp;
                }
            }
            arrayList2.add(salePropLJ);
        }
        return ProductPackStruct.LIZ(productPackStruct, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, 2097151);
    }
}
