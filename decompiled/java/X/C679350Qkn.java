package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManagerExpData;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleScene;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679350Qkn {
    public static final EcomApiLifecycleManagerExpData LIZ;
    public static final boolean LIZIZ;

    static {
        EcomApiLifecycleManagerExpData ecomApiLifecycleManagerExpData = new EcomApiLifecycleManagerExpData(false, null, 3, null);
        EcomApiLifecycleManagerExpData ecomApiLifecycleManagerExpData2 = (EcomApiLifecycleManagerExpData) C0C64.LJIILLIIL().LJJII(EcomApiLifecycleManagerExpData.class, ecomApiLifecycleManagerExpData, "ecom_api_lifecycle_manager", true);
        if (ecomApiLifecycleManagerExpData2 != null) {
            ecomApiLifecycleManagerExpData = ecomApiLifecycleManagerExpData2;
        }
        LIZ = ecomApiLifecycleManagerExpData;
        boolean z = ecomApiLifecycleManagerExpData.isEnabled;
        LIZIZ = z;
        if (z) {
            Iterator<EcomApiLifecycleScene> it2 = ecomApiLifecycleManagerExpData.scenes.iterator();
            while (it2.hasNext() && !Intrinsics.LJFF(it2.next().name, "vertical_search_intermediate")) {
            }
        }
    }
}
