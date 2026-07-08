package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0N2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587470N2j {
    public static final C587470N2j LIZ = new C587470N2j();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1192));

    public static int LIZIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final boolean LIZ(Aweme aweme) {
        IECommerceAnchorService iECommerceAnchorService;
        if (AwemeExtKt.isAdTraffic(aweme) || C729510SjV.LJJIJIL(aweme) || ((iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null)) != null && iECommerceAnchorService.LJJJJZ(aweme))) {
            return false;
        }
        return true;
    }
}
