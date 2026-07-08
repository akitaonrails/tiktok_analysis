package X;

import com.ss.android.ugc.aweme.ecommerce.ab.EcomFullyRenderedConfigData;
import com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742540vRk {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(7));

    public static final FullyRenderedLoggerInterface LIZ() {
        if (!C0CN5.LJI()) {
            return null;
        }
        EcomFullyRenderedConfigData ecomFullyRenderedConfigData = C1742490vRf.LIZ;
        if (C1742490vRf.LIZ.enabled) {
            return (FullyRenderedLoggerInterface) LIZ.getValue();
        }
        return null;
    }
}
